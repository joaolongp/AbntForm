package org.example;

import org.example.DTO.DocxObject;
import org.example.Util.DocxReader;


import java.io.IOException;

public class App{
    public static void main(String[] args) throws IOException {
        String filePath = "src\\resources\\test.docx";
        DocxObject doc = DocxReader.getDocxObject(filePath);

        System.out.println(doc.getText());
        System.out.println("N Words = "+doc.getWords().size());
    }
}