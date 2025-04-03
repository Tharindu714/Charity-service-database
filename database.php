<?php
$host = 'localhost';
$db   = 'charity_service_db';
$user = 'root';
$pass = 'password';

try {
    $dsn = "mysql:host=$host;dbname=$db;charset=utf8mb4";
    $pdo = new PDO($dsn, $user, $pass);
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    echo "Connected successfully to Charity Service Database";
} catch (PDOException $e) {
    echo "Connection failed: " . $e->getMessage();
}
?>