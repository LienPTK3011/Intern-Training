package bttb3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 *
 * @author Asus
 */
public class StreamAPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Predicate<Integer> p = num -> num % 2 == 0;        
        Predicate<Integer> p1 = num -> num % 9 == 0;

        List<Integer> list = Arrays.asList(3,5,6,6,8);
        System.out.print("Số chẵn: ");
        list.stream().filter(p).distinct().forEach(e ->{ 
            System.out.print(e+" ");});
        System.out.print("\nSố chia hết cho 9 :");
        list.stream().filter(p1).distinct().forEach(e ->{ 
            System.out.print(e+" ");});

        int sum = list.stream().distinct().filter(num -> num % 2 == 0).reduce(0,Integer::sum);
		System.out.println("\n=> Tổng các số chẵn = " +sum);
        
    }
}
