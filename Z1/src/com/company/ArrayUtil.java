package com.company;

public class ArrayUtil {

    public static <T extends Comparable> void jestPalindromem(T[] tab){
        boolean czyJest = true;
        for(int i=0; i<tab.length-1; i++){
            if(!tab[i].equals(tab[tab.length-1-i])){
                czyJest = false;
                break;
            }
        }
        if(czyJest){
            System.out.println("Tablica jest palindromem");
        }
        else{
            System.out.println("Tablica nie jest palindromem");
        }
    }
}
