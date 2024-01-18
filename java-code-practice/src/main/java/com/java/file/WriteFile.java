package com.java.file;

import java.io.File;
import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        File file = new File("myFile.txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("hey,This is added by using write()\n");
            writer.append("This is added by append method");
            writer.close();
        }catch(Exception exp){
            exp.printStackTrace();
        }
    }
}
