package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * Created by anasimonenko1 on 22.08.17.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        int max = file.read();
        while (file.available()>0)
        {
            int data = file.read();
            if (data>max)
            {
                max = data;
            }

        }
        file.close();
        System.out.println(max);
    }
}
