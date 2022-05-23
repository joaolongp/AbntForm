package org.example.Util;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.example.DTO.DocxObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class DocxReader {
    private static XWPFDocument loadDocxFile(String path)throws IOException {
        return new XWPFDocument(Files.newInputStream(Paths.get(path)));
    }

    private static DocxObject wordsToDto(String path) throws IOException {
        DocxObject docxObject = new DocxObject();
        XWPFWordExtractor xwpfWordExtractor = new XWPFWordExtractor(loadDocxFile(path));
        docxObject.setText(xwpfWordExtractor.getText());
        docxObject.setWords(Arrays.stream(docxObject.getText().split("\\s+")).toList());

        return docxObject;
    }

    public static DocxObject getDocxObject(String path) throws IOException {
        return wordsToDto(path);
    }
}
