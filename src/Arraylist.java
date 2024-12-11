// Array Checkin

import java.util.ArrayList;
import java.util.Collections;


public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");
        names.add("Jack");
        System.out.println("Names List:"+names);
        //Removing the name
        names.remove("John");
        System.out.println("Names List After Removing:"+names);
        //
        Collections.sort(names);
        System.out.println("Names Sorted List:"+names);


        }
    }
