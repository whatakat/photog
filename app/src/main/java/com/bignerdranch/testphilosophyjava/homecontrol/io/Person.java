package com.bignerdranch.testphilosophyjava.homecontrol.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

import nu.xom.*;

import static com.bignerdranch.testphilosophyjava.homecontrol.print.Print.print;

public class Person {
    private String first, last;
    public Person(String first, String last){
        this.first = first;
        this.last = last;
    }
    public Element getXML(){
        Element person = new Element("person");
        Element firstName = new Element("first");
        firstName.appendChild(first);
        Element lastName = new Element("last");
        lastName.appendChild(last);
        person.appendChild(firstName);
        person.appendChild(lastName);
        return person;
    }
    public Person(Element person){
        first = person.getFirstChildElement("first").getValue();
        last = person.getFirstChildElement("last").getValue();
    }
    public String toString(){return first+" "+last;}
    public static void format(OutputStream os, Document doc) throws Exception{
        Serializer serializer = new Serializer(os, "ISO-8859-1");
        serializer.setIndent(4);
        serializer.setMaxLength(60);
        serializer.write(doc);
        serializer.flush();
    }

    public static void main(String[] args) throws Exception {
        List<Person> people = Arrays.asList(
                new Person("Dr. Bunsen","Honeydew"),
                new Person("Gonzo","The Great"),
                new Person("Phillip J.","Fry"));
        print(people);
        Element root = new Element("people");
        for (Person p: people)
            root.appendChild(p.getXML());
        Document doc = new Document(root);
        format(System.out, doc);
        format(new BufferedOutputStream(new FileOutputStream(
                "C:\\geekbrains\\People.xml")), doc);

    }
}
