package edu.farmingdale.comunication.capstone.project.model;

import java.util.LinkedList;
import java.util.List;

public class SentenceBuilder {
    private List<String> words = new LinkedList<>();

    public void addWord(String word) {
        words.add(word);
    }

    public void removeLastWord() {
        if (!words.isEmpty()) words.removeLast();
    }
    public String getSentence() {
        return String.join(" ", words);
    }
}
