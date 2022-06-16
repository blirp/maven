package no.kantega.mavendemo;

import no.kantega.mavendemo.greeting.Greeting;

public class Main {
    public static void main(
        final String[] args) 
    {
        System.out.println(new Greeting().get());
    }
}