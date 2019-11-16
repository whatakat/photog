package com.example.codecademy;

public class MadLibs {
    /*
 This program generates a mad libbed story.
 Autor: Leonid
 Date: 11/15/2019
 */
    public static void main(String[] args){
        String name1="Leonid";
        String adjective1="well";
        String adjective2="vonderful";
        String noun1="sun";
        String noun2="house";
        String verb1="run";
        String noun3="kinder";
        String noun4="tree";
        String adjective3="fast";
        String name2="Nansy";
        String place1="Earth" ;
        String noun5 ="ball";
        int number =2019;
        String noun6 ="day";

        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
        System.out.println(story);
    }
}
