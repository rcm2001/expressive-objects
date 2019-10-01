package uk.co.objectconnexions.expressiveobjects.datagenerator;

import uk.co.objectconnexions.expressiveobjects.applib.value.Date;

public class ExampleGeneration {

    public static void main(String[] args) {
        DateGenerator date = new DateGenerator(new Date().add(0, 0, -21), 20);
        NameGenerator first = new NameGenerator(new String[] {"Fred", "Jack", "Bob", "Lil", "Andy", "Mary"});
        NameGenerator last = new NameGenerator(new String[] {"Smith", "Jones", "Brown", "Moore", "Black", "Chan"});
        
        for (int i = 0; i < 20; i++) {
            System.out.println(last.generate() + ", " + first.generate() + ", " + date.generate());
        }
    }

}