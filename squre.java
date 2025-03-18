import java.util.*;
import java.io.*;
import java.sql.*;

class trycatch {
    // Database connection parameters
    private static final String DB_URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASS = "password";

    public static void main(String[] args) {
        // Register JDBC driver (optional for newer JDBC versions)
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
            return;
        }

        System.out.println("MySQL JDBC Driver registered!");
        
        // Connect to database and perform operations
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            System.out.println("Database connection established successfully!");
            
            // Create a table if it doesn't exist
            createTable(conn);
            
            // Insert data
            insertData(conn, "John Doe", 30);
            insertData(conn, "Jane Smith", 25);
            
            // Read data
            readData(conn);
            
            // Update data
            updateData(conn, 1, "John Updated", 31);
            
            // Read data after update
            System.out.println("\nAfter update:");
            readData(conn);
            
            // Delete data
            deleteData(conn, 2);
            
            // Read data after delete
            System.out.println("\nAfter delete:");
            readData(conn);
            
        } catch (SQLException e) {
            System.out.println("Connection failed or SQL error occurred!");
            e.printStackTrace();
        }
    }
    
    // Create a table in the database
    private static void createTable(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS users (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY," +
                     "name VARCHAR(100) NOT NULL," +
                     "age INT)";
                     
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table created or already exists.");
        }
    }
    
    // Insert data into the table
    private static void insertData(Connection conn, String name, int age) throws SQLException {
        String sql = "INSERT INTO users (name, age) VALUES (?, ?)";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted.");
        }
    }
    
    // Read data from the table
    private static void readData(Connection conn) throws SQLException {
        String sql = "SELECT id, name, age FROM users";
        
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            System.out.println("\nUsers in database:");
            System.out.println("ID\tName\t\tAge");
            System.out.println("---------------------------");
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println(id + "\t" + name + "\t" + age);
            }
        }
    }
    
    // Update data in the table
    private static void updateData(Connection conn, int id, String name, int age) throws SQLException {
        String sql = "UPDATE users SET name = ?, age = ? WHERE id = ?";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setInt(3, id);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) updated.");
        }
    }
    
    // Delete data from the table
    private static void deleteData(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM users WHERE id = ?";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) deleted.");
        }
    }
}