import pymongo

DEFAULT_CONNECTION_URL="mongodb://localhost:27017/"
client=pymongo.MongoClient(DEFAULT_CONNECTION_URL)
print(client.list_database_names())
