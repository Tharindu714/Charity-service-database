import java.sql.DriverManager

fun main() {
    val url = "jdbc:mysql://localhost:3306/charity_service_db?useSSL=false&serverTimezone=UTC"
    val user = "root"
    val password = "password"

    try {
        val connection = DriverManager.getConnection(url, user, password)
        println("Connected successfully to Charity Service Database")
        connection.close()
    } catch (ex: Exception) {
        ex.printStackTrace()
    }
}