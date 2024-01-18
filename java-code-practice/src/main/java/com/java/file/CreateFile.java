package com.java.file;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("myFile.txt");
        try{
            file.createNewFile();

        }
        catch(Exception exp){
            exp.printStackTrace();
        }

    }
}
