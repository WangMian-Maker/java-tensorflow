package com.example.demo;

public class Main {
    private final static String IMAGE =Thread.currentThread().getContextClassLoader().getResource("image/tesla.jpg").getFile();

    public static void main(String[] args) {
        ObjectDetector objectDetector = new ObjectDetector();
        objectDetector.detect(IMAGE);
    }
}
