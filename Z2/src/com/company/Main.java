package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Main {

    public static <T extends Iterable<E>, E> void wypiszCoDrugi(T iterable){
        boolean test = true;
        for(E t : iterable){
            if(test){
                System.out.print(t + ", ");
            }
            test = !test;
        }
    }

    public static void main(String[] args) {
	    List<String> lista1 = new ArrayList<String>();
        lista1.add("Szymon");
        lista1.add("Lukasz");
        lista1.add("Maciej");
        lista1.add("Wojciech");
        lista1.add("Kacper");
        System.out.println(lista1);
        wypiszCoDrugi(lista1);
        System.out.println("");

        Set<Integer> lista2 = new HashSet<Integer>();
        lista2.add(22);
        lista2.add(33);
        lista2.add(44);
        lista2.add(55);
        lista2.add(1);
        lista2.add(390);
        System.out.println(lista2);
        wypiszCoDrugi(lista2);
    }
}
