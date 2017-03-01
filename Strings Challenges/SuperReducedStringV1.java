/*
Steve has a string, s, consisting of  lowercase English alphabetic letters. In one operation, he can delete any pair of 
adjacent letters with same value. For example, string "aabcc" would become either "aab" or "bcc" after 1 operation.

Steve wants to reduce s as much as possible. To do this, he will repeat the above operation as many times as it can 
be performed. Help Steve out by finding and printing 's non-reducible form!

Note: If the final string is empty, print Empty String .

Input Format
------------
A single string, s.

Constraints
-----------
1 <= n <= 100

Output Format
-------------
If the final string is empty, print Empty String; otherwise, print the final non-reducible string.

Sample Input 0
--------------
aaabccddd

Sample Output 0
---------------
abd

Sample Input 1
--------------
baab

Sample Output 1
---------------
Empty String
*/

import java.io.*;
import java.util.*;

public class SuperReducedStringV1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        
        // convert immutable String s to mutable StringBuilder sb
        StringBuilder sb = new StringBuilder(s);
    
        int i = 0;
        while ( i < sb.length() - 1 ) {
            
            // delete adjacent pair of chars if same
            if ( sb.charAt(i) == sb.charAt(i+1) ) {
                sb.deleteCharAt(i);
                
                // now chars have shifted by one index to the left
                sb.deleteCharAt(i);
                
                // sb has mutated into a different char sequence so we start over
                i = 0;
            }
            else {
                // if adjacent chars are not same then continue to check next pair
                i++;
            }     
        }

        // convert sb to string
        s = sb.toString();
    
        if (s.length() == 0)
            System.out.println("Empty String");
        else
            System.out.println(s);
    }
}