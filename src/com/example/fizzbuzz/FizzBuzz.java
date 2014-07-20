package com.example.fizzbuzz;

/**
 * Created by sskender on 7/19/14.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        String fizz = "Fizz", buzz = "Buzz";

        String temp = buzz;
        buzz = fizz;
        fizz = temp;

        System.out.println(fizz + buzz);
    }
}
