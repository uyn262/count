/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Library;
import java.util.LinkedHashMap;
import view.Menu;

/**
 *
 * @author Admin
 */
public class CountProgramming extends Menu<String> {
    
    static String[] mc = {"Letter Count", "Charator Count", "Exit"};
    String str;
    Library l;

    public CountProgramming() {
        super("PROGRAMMING", mc);
        l = new Library();
        str = l.getString("Input string: ");
    }
    
    public void execute(int n) {
        switch (n) {
            case 1:
                countLetter(str);
                break;
            case 2:
                str = str.replaceAll("\\s+", "");
                countCharater(str);
                break;
            case 3:
                System.exit(0);
        }
    }
    
    public void countLetter(String str) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
        String[] strSplit = str.split("\\s");
        for (int i = 0; i < strSplit.length; i++) {
            String ch = strSplit[i];
            int count = 0;
            for (int j = 0; j < strSplit.length; j++) {
                if (strSplit[j].equals(ch)) {
                    count++;
                }
            }
            lhm.put(ch, count);
        }
        
        lhm.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }
    
     public void countCharater(String str) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j)==ch) {
                    count++;
                }
            }
            lhm.put(ch+"", count);
        }
        
        lhm.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }
}
