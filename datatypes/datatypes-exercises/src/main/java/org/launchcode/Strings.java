package org.launchcode;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //store the sentence in a string
        String sentence = "Alice was beginning to get very tired" +
                " of sitting by her sister on the bank," +
                " and of having nothing to do: once or " +
                "twice she had peeped into the book her " +
                "sister was reading, but it had no " +
                "pictures or conversations in it, " +
                "‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or " +
                "conversation?’";
        //create a scanner object for user input
        Scanner input = new Scanner(System.in);
        //prompt user for term
        System.out.println("Enter a term to search: ");
        String searchWord = input.nextLine();

        //make case-insensitive
        boolean find = sentence.toLowerCase().contains(searchWord.toLowerCase());
        // print if word found
        System.out.println("Word found: " + find);
        Integer index = sentence.indexOf(searchWord);
        Integer length = searchWord.length();
        System.out.println("Your search word first appears" +
                "at index" + index + ". Your term is " + length
        + " characters long.");
        String modifiedSentence =
                sentence.replace(searchWord, "");
          System.out.println(modifiedSentence);
        input.close();
    }
}
