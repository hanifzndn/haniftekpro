package com.mycompany.pertemuan2;
import java.util.Scanner;
/**
 *
 * @author muhammad hanif
 */
public class Soal1 {
    public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    
    String s = input.nextLine();
    String[] stringarray = s.split("[! ,? .'@]+");
    
    System.out.println(stringarray.length);
    for(int i = 0; i< stringarray.length; i++)
        System.out.println(stringarray[i]);      
    }
}