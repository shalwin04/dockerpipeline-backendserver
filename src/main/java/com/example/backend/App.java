/**
 * Hello world!
 *
 */
package com.example.backend;
import spark.Spark;
public class App {
    public static void main(String[] args) {
        Spark.get("/hello", (req, res) -> "Hello from Backend Server!");
    }
}
