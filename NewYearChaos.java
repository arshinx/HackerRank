import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    for(int a = 0; a < T; a++)
    {
        int n = in.nextInt();
        int list[] = new int[n];
        for(int b = 0; b < n; b++)
            list[b] = in.nextInt();

        int bribe = 0;
        boolean chaotic = false;
        for(int i = 0; i < n; i++)
        {
            if(list[i] - (i + 1) > 2)
            {              
                chaotic = true;
                break;    
            }
            for (int j = Math.max(0, list[i] - 2); j < i; j++)
                if (list[j] > list[i])
                    bribe++;
        }
        if(chaotic)
            System.out.println("Too chaotic");
        else
            System.out.println(bribe);
    }
    }}
