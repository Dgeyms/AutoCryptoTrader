package com.example.autocryptotrader;

import java.net.Socket;

public class DockerConnectionTest {
    public static void main(String[] args) {
        String dockerHost = "localhost"; // Или IP-адрес вашего Docker хоста
        int dockerPort = 5432; // Замените на порт вашего контейнера

        try (Socket socket = new Socket(dockerHost, dockerPort)) {
            System.out.println("Docker is reachable.");
        } catch (Exception e) {
            System.err.println("Unable to connect to Docker: " + e.getMessage());
        }
    }
}
