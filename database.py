import mysql.connector

config = {
    'host': 'localhost',
    'user': 'root',
    'password': 'password',
    'database': 'charity_service_db'
}

try:
    conn = mysql.connector.connect(**config)
    print("Connected successfully to Charity Service Database")
    conn.close()
except mysql.connector.Error as err:
    print("Error: {}".format(err))
