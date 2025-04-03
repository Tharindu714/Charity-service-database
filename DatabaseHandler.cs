using System;
using MySql.Data.MySqlClient;

class DatabaseHandler {
    static void Main() {
        string connectionString = "Server=localhost;Database=charity_service_db;Uid=root;Pwd=password;";
        try {
            using (MySqlConnection conn = new MySqlConnection(connectionString)) {
                conn.Open();
                Console.WriteLine("Connected successfully to Charity Service Database");
            }
        } catch (MySqlException ex) {
            Console.WriteLine("Error: " + ex.Message);
        }
    }
}
