package org.esurovskiy.april3;

import java.util.Scanner;

public class MainTranslator {
    public static void main(String[] args) {
        MyTranslator myTranslator = new MyTranslator();
        initDictionary(myTranslator);
        final String s = readFromKeyboard();
        System.out.println(myTranslator.translateSentence(s));
    }

    private static void initDictionary(final MyTranslator myTranslator) {
        myTranslator.addNewWord("create", "создать");
        myTranslator.addNewWord("new", "новый");
        myTranslator.addNewWord("class", "класс");
    }

    private static String readFromKeyboard() {
        final Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
