package com.mycompany.app;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class App{

    public static void main(String[] args) {
      try{
        Scanner chopper = new Scanner(new File("src/main/resources/txtFiles/App.dat"));
        String str = chopper.nextLine();
        
        int k = chopper.nextInt();
        String first = null;
        String last = null;
        String s;
        if(str.length()>=k){
            first = str.substring(0,k);
            last = str.substring(0,k);
            for(int i = 0;i<=(str.length()-k);i++){
                s = str.substring(i,k+i);
                if(s.compareTo(first)<0){first=s;}
                if(s.compareTo(last)>0){last=s;}
            }
        }
        System.out.println(first);
        System.out.println(last);
      }
      catch (FileNotFoundException e){
        e.printStackTrace();
      }
    }
}
