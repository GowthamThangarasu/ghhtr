/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import java.util.Scanner;

/**
 *
 * @author StarHP
 */
public class Tables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println("Table of "+n+"*"+i+"="+n*i);
        }
        // TODO code application logic here
    }
    
}
