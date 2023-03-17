package edu.uqu.cs;
import java.util.Scanner;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/


public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/

/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
 
public static void twisters () {
    for(int x= 1; x<=20; x++){
        if (x%2==0){
            System.out.print( " Tweetle " );}
        {
             if (x%4==0){
            System.out.print(" Beetle " );}
             {
                if (x%6==0){
            System.out.print( " Poodle " );
                }
             else
    
            {
             System.out.print( x );
                    }
         
             System.out.print( "  " );}
        }
    }
 }
public static void phoneKeypad(String str) {
String nums = "" ;
for ( int i = 0 ; i <= str.length() ; i++ ) {
char ch = str.toUpperCase().charAt(i) ;
switch ( str.charAt(i) ) 
{
    case 'A' , 'B' , 'C' : nums += 2 ;
    break;
    case 'D' , 'E' , 'F' : nums += 3 ;
    break;
    case 'G' , 'H' , 'I' : nums += 4 ;
    break;
    case 'J' , 'K' , 'L' : nums += 5 ;
    break;
    case 'M' , 'N' , 'O' : nums += 6 ;
    break;
    case 'P' , 'Q' , 'R' , 'S' : nums += 7 ;
    break;
    case 'T' , 'U' , 'V' : nums += 8 ;
    break;
    case 'W' , 'X' , 'Y' , 'Z' : nums += 9 ;
    break;
    
}
}


System.out.println(nums);

 }  
 
public static void main(String[] args) {
 twisters();
Scanner scr =new Scanner (System.in);
String str = scr.nextLine();
phoneKeypad(str);
 
}    
}
