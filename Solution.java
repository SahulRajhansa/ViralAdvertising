import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Days = sc.nextInt(), People = 5 , Calculate = 0, i = 0;
        while ( true ){
            People = People / 2;
            Calculate = Calculate + People;
            People = People * 3;
            i++;
            if ( i == Days ) break;
        }
        System.out.println(Calculate);      
               
    }
}
