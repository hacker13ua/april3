package org.esurovskiy.april3;

import java.util.HashMap;
import java.util.Map;

public class MyTranslator {
    private Map<String, String> dictionary = new HashMap<>();

    public void addNewWord(String en, String ru) {
        dictionary.put(en.toLowerCase(), ru);
    }

    public String translate(String en) {
        return dictionary.getOrDefault(en.toLowerCase(), en);
    }

    public String translateSentence(String sentence) {
        String[] words = sentence.split(" ");
        String translatedText = "";
        for (final String word : words) {
            String translatedWord = translate(word);
            translatedText += translatedWord;
            translatedText += " ";
        }
        return translatedText;
    }
}

