package org.tnsif.acc.c2tc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostgresTableCreation {

    public static void main(String[] args) {

        Connection c = null;
        Statement stmt = null;

        try {

            // Load PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            // Establish database connection
            c = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "172839");

            System.out.println("Opened database successfully");

            // Create Statement object
            stmt = c.createStatement();

            // SQL query to create table
            String sql = "CREATE TABLE COMPANY " +
                    "(ID INT PRIMARY KEY NOT NULL, " +
                    "NAME TEXT NOT NULL, " +
                    "AGE INT NOT NULL, " +
                    "ADDRESS CHAR(50), " +
                    "SALARY REAL)";

            // Execute SQL query
            stmt.executeUpdate(sql);

            System.out.println("Table created successfully");

        } catch (Exception e) {

            System.err.println(
                    e.getClass().getName() + ": " + e.getMessage());

        } finally {

            // Close Statement
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Close Connection
            try {
                if (c != null) {
                    c.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}