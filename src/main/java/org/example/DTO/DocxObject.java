package org.example.DTO;

import java.util.ArrayList;
import java.util.List;

public class DocxObject {
    private String text;

    private String fileName;
    private List<String> lines;

    public DocxObject(){
        this.fileName = "";
        this.text = "";
        this.lines = new ArrayList<String>();
    }

    public DocxObject(String text, ArrayList<String> words, String fileName){
        this.fileName = fileName;
        this.text = text;
        this.lines = words;
    }

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public void setLines(List<String> lines){
        this.lines = lines;
    }

    public List<String> getLines(){
        return lines;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
