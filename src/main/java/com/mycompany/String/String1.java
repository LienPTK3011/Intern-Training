/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.String;

/**
 *
 * @author Dang
 */
public class String1 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       ex1();
       ex2();
       ex3();
}
    public static void ex1()
    {
        //1a
        char[] ch1 ={'T','r','a','i','n','i','n','g'};  
        String str1 = " ";
		for(int i=0; i<ch1.length; i++) {
			str1 =str1 + ch1[i]+" ";
                      
		}
               		System.out.println("String after add space:"+str1);
    
}
    //1b
    public static void ex2() 
    {
		String str2 = "Nguyen Van A";
	    String[] str3 = str2.split(" ");
	    
	    System.out.println("String after split and get first char: " + str3[0].charAt(0) +""+ str3[1].charAt(0) +""+ str3[2].charAt(0));
	}
    //1c
    public static void ex3() {
		 String str2 = "Nguyen Van A";
	     System.out.println("String after remove middle name: " + str2.split(" ")[0] +" "+ str2.split(" ")[2]);
	     
	
}
}