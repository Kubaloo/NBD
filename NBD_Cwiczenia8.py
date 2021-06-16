import riak

client = riak.RiakClient(host="172.17.0.2")
mybucket = client.bucket('s23430')

#post
product = mybucket.new('Product', data={
    'name': 'Bike',
    'price': 2137,
    'quantity': 10,
})
product.store()

#get print
savedProduct = mybucket.get('Product')
print(savedProduct.data)

#modify
modProduct = mybucket.new('Product', data={
    'name': 'Car',
    'price': 210000,
    'quantity': 100,
})
modProduct.store()

#get print
savedModProduct = mybucket.get('Product')
print(savedModProduct.data)

#delete print
mybucket.delete("Product")
print(mybucket.get("Product").data)