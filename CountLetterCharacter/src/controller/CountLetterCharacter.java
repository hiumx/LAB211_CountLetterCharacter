/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Admin
 */
import common.Algorithms;
import common.Library;
import java.util.Map;
import model.Element;
import view.Menu;

/**
 *
 * @author ACER
 */
public class CountLetterCharacter extends Menu<String> {

    static String[] mc = {"Count Letters", "Count Characters", "Exit"};

    protected Library library;
    protected Algorithms algorithm;
    protected String inputString;

    public CountLetterCharacter() {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithms();
        //1. Enter a possitive number
        //size_array = library.getInt("Enter number of array", 1, 100);
        //2. Create array by generate random integer in range
        //array = library.createArray(size_array);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                inputString = library.getString("Enter a string: ");
                String s = "{";
                Map<String, Integer> result = algorithm.countLetters(inputString);
                for (Map.Entry<String, Integer> entry : result.entrySet()) {
                    s += entry.getKey() + "=" + entry.getValue() + ",";
                }
                s += "}";
                System.out.println(s);
                break;
            case 2:
                inputString = library.getString("Enter a string: ");
                String charS = "{";
                Map<Character, Integer> resultChar = algorithm.countCharacters(inputString);
                for (Map.Entry<Character, Integer> entry : resultChar.entrySet()) {
                    charS += entry.getKey() + "=" + entry.getValue() + ",";
                }
                charS += "}";
                System.out.println(charS);
                break;
            case 3:
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        new CountLetterCharacter().run();
    }
}
