/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class NewClass {
    public static void main(String[] args) {
        // TODO code application logic here
        //1
        char[] ch={'j','a','v', 'a', 't', 'p', 'o', 'i', 'n', 't'};  
        String strll = "";
		for(int i=0; i<ch.length-1; i++) {
			strll+=ch[i]+" ";
		}
		strll+=ch[ch.length-1];
		System.out.println(strll);
        //2
        String str = "Nguyen Van A";
	    String[] str1 = str.split(" ");
	    System.out.println(""+ str1[0].charAt(0) +""+ str1[1].charAt(0) +""+ str1[2].charAt(0));
	//3
            System.out.println("" + str.split(" ")[0] +" "+ str.split(" ")[2]);
	     
    }
}
