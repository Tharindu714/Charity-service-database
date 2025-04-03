#include <iostream>
#include <mysql_driver.h>
#include <mysql_connection.h>
#include <cppconn/exception.h>
#include <cppconn/driver.h>
#include <cppconn/connection.h>

int main() {
    const std::string url("tcp://127.0.0.1:3306");
    const std::string user("root");
    const std::string password("password");
    const std::string database("charity_service_db");

    try {
        sql::mysql::MySQL_Driver* driver = sql::mysql::get_mysql_driver_instance();
        std::unique_ptr<sql::Connection> conn(driver->connect(url, user, password));
        conn->setSchema(database);
        std::cout << "Connected successfully to Charity Service Database" << std::endl;
    } catch (sql::SQLException &e) {
        std::cerr << "Error: " << e.what() << std::endl;
    }
    return 0;
}
