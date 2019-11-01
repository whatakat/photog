package com.bignerdranch.testphilosophyjava.homecontrol.annotations.moduleTests;

import com.bignerdranch.testphilosophyjava.homecontrol.io.OSExecute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class AtUnitExample4 {
    static String theory = "All brontosauruse "+
            "are thin at one end, much MUCH thicker in the "+
            "middle, and then thin again at the far end.";
    private String word;
    private Random rand = new Random();
    public AtUnitExample4(String word){this.word = word;}
    public String getWord(){return word;}
    public String scrambleWord(){
        List<Character> chars = new ArrayList<Character>();
        for (Character c: word.toCharArray())
            chars.add(c);
        Collections.shuffle(chars, rand);
        StringBuilder result = new StringBuilder();
        for (char ch: chars)
            result.append(ch);
        return result.toString();
    }
    @TestProperty static List<String> input =
            Arrays.asList(theory.split(" "));
    @TestProperty static Iterator<String> words = input.iterator();
    @TestObjectCreate static AtUnitExample4 create(){
        if (words.hasNext())
            return new AtUnitExample4(words.next());
        else
            return null;
    }
    @Test boolean words(){
        print("'"+getWord()+"'");
        return getWord().equals("are");
    }
    @Test boolean scramble1(){
        rand = new Random(47);
        print("'"+getWord()+"'");
        String scrambled = scrambleWord();
        print(scrambled);
        return scrambled.equals("lAl");
    }
    @Test boolean scramble2(){
        rand = new Random(74);
        print("'"+getWord()+"'");
        String scrambled = scrambleWord();
        print(scrambled);
        return scrambled.equals("tsaeborornussu");
    }

    public static void main(String[] args) throws Exception {
        print("starting");
        OSExecute.command(
                "java com.... AtUnitExample4"
        );
    }
}
