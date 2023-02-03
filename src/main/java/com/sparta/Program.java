package com.sparta;

public class Program {

    public static void main(String[] args){
        int timeOfDay = 21;

        String result = greeting(timeOfDay);
        System.out.println(result);
    }
    public static String greeting(int timeOfDay){
        String greeting;
        if(timeOfDay >= 0 && timeOfDay <= 11){
            greeting = "Good morning!";
        }
        else if (timeOfDay >= 12 && timeOfDay <= 17) {
            greeting = "Good afternoon!";
        }
        else if (timeOfDay >= 18 && timeOfDay <= 23) {
            greeting = "Good evening!";
        }
        else{
            greeting = "Enter a real hour!";
        }
        return greeting;
    }
}
