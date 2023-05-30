/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.passwordgenrator;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ishan -pc
 */
public class Passwordgenrator {

    public static void main(String[] args) {
        System.out.println("welcome to the password genrator");
        String uppercase = "ABCDEFGHIJKLMNPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnpqrstuvwxyz";
        String num ="0123456789";
        String specialcharacter = "!@#$%^&*<>?{},.+-()";
        String combination = uppercase+lowercase+specialcharacter+num;
        int len =8;
        char [] password = new char[8];
        Random r =new Random();
        for (int i =0 ;i< len;i++)
        {
         password [i]= combination.charAt(r.nextInt(combination.length()));
        }
          System.out.println("the genrated password is = "+ new String (password));
    }   
}
