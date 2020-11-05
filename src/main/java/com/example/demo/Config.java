package com.example.demo;

/**
 * Configuration file for TensorFlow Java Yolo application
 */
public interface Config {
    //String path = Thread.currentThread().getContextClassLoader().getResource("Yolo/yolo-voc-labels.txt").getPath();
    //String path= "Yolo/";
    String GRAPH_FILE = Thread.currentThread().getContextClassLoader().getResource("Yolo/yolo-voc.pb").getFile();
    String LABEL_FILE = Thread.currentThread().getContextClassLoader().getResource("Yolo/yolo-voc-labels.txt").getFile();

    // Params used for image processing
    int SIZE = 416;
    float MEAN = 255f;

    // Output directory
    String OUTPUT_DIR = Thread.currentThread().getContextClassLoader().getResource("sample").getFile();
}
