package org.example.DTO;

import java.util.ArrayList;
import java.util.List;

public class DocxObject {
    private String text;
    private List<String> words;

    public DocxObject(){
        this.text = "";
        this.words = new ArrayList<String>();
    }

    public DocxObject(String text, ArrayList<String> words){
        this.text = text;
        this.words = words;
    }

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public void setWords(List<String> words){
        this.words = words;
    }

    public List<String> getWords(){
        return words;
    }


}
