import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{
   //Test case
   public static void main (String[] args) {
       int[] testCase1={2,3,4};
       int[] solution= new int[testCase1.length];
       
       solution=countTwos(testCase1);
   
   }
   
   
   static int[] countTwos(int[] arr) {
    
       int [] returnArray=new int[arr.length];
       for (int i=0; i<arr.length; i++) {
           int cumTwoPower=2;
           while (cumTwoPower<=arr[i]) {
               if (cumTwoPower==arr[i]) {
                  returnArray[i]=1;
                  break;
                }
                else {
                    cumTwoPower*=2;
                }
            }
           
        }

       return returnArray;

   }

   
}

