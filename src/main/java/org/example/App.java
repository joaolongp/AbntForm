package org.example;

import org.example.DTO.DocxObject;
import org.example.Util.DocxReader;
import org.example.Util.DocxWriter;


import java.io.IOException;

public class App{
    public static void main(String[] args) throws IOException {
        String filePath = "src\\resources\\1._Caderno_-_Teoria_Geral.docx";
        DocxObject doc = DocxReader.getDocxObject(filePath);

        DocxWriter.writeDocx(doc);
    }
}