package org.example.Util;

import org.apache.poi.hssf.record.aggregates.PageSettingsBlock;
import org.apache.poi.xwpf.usermodel.*;
import org.example.DTO.DocxObject;

import java.io.FileOutputStream;
import java.io.IOException;

public class DocxWriter {
    public static void writeDocx(DocxObject docxObject) throws IOException {

        String fileName = "src\\resources\\output_"+docxObject.getFileName();

        try(XWPFDocument doc = new XWPFDocument()){
            for (String line:
                 docxObject.getLines()) {
                XWPFParagraph p1 = doc.createParagraph();
                p1.setSpacingBetween(1.5);
                p1.setAlignment(ParagraphAlignment.BOTH);
                XWPFRun r1 = p1.createRun();
                r1.setFontSize(12);
                r1.setFontFamily("Times New Roman");
                r1.setText("\t"+line);
            }
            try (FileOutputStream out = new FileOutputStream(fileName)) {
                doc.write(out);
            }
        }
    }
}
