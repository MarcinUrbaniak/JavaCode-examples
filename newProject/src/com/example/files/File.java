package com.example.files;

public class File {

    private String name ="";
    public static int counter = 0;

    public File(String name) {
        this.name = name;
    }

    public static int setaCounter(int counter) {
        File.counter = counter + 1;
        return File.counter;
    }
}
