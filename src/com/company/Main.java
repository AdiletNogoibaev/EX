package com.company;

import practic2.Person;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Random;

public class
Main {

    public static void main(String[] args) {
//1
        LinkedHashSet <Integer> List = new LinkedHashSet<>();
        Random rd =new Random();
       for (int i = 0; i<100;i++){
        List.add(rd.nextInt(100-1)+1);
           System.out.println(List.add(i)+" "+ i);
       }
       LinkedHashSet<Integer> chetnye = new LinkedHashSet<>();
       for (int e : List ){
           if (e % 2 ==0){
               chetnye.add(e);
           }
       }
        System.out.println(chetnye);

    LinkedList<Person> LinkedList = new LinkedList<>();
     try {
      Object o = null;

     }catch (NullPointerException er){
         System.out.println("Error");
     }

    }

}
