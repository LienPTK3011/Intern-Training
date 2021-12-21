/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tt1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Menumain mm = new Menumain();
        try {
            int choose = -1;
            do {
                try {
                    System.out.println("Moi ban nhap");
                    System.out.println("1. Add");
                    System.out.println("2. Update");
                    System.out.println("3. Sort Up");
                    System.out.println("4. Sort Down");
                    System.out.println("5. Delete");
                    System.out.println("6. Display");
                    System.out.println("7. Exit");
                    System.out.println("Chọn:");
                    choose = new Scanner(System.in).nextInt();
                } catch (Exception e) {
                    choose = -1;
                }
                switch(choose){
                    case 1 :
                        System.out.println("Thực hiện chức năng Add");
                        System.out.println("Nhap thong tin sinh vien");
                        Student sAdd = new Student();
                        mm.insert(sAdd);
                        break;
                    case 2 :
                        System.out.println("Thực hiện chức năng Update");
                        System.out.println("Nhap ma sinh vien can sua:");
                        Student sUpdate = new Student();
                        sUpdate.input();
                        mm.update(sUpdate);
                        break;
                    case 3 :
                        System.out.println("Thực hiện chức năng Sort Up");
                        mm.sort();
                        break;
                    case 4 :
                        System.out.println("Thực hiện chức năng Sort Down");
                        break;
                    case 5 :
                        System.out.println("Thực hiện chức năng Delete");
                        System.out.print("Nhap ma sinh vien can xoa");
                        int id = new Scanner(System.in).nextInt();
                        mm.delete(id);
                        break;
                    case 6 :
                        System.out.println("Thực hiện chức năng Display");
                        mm.travel();
                        break;
                    case 0 :
                        System.out.println("Thực hiện chức năng Exit");
                        break;
                    default:
                        System.out.println("Không tồn tại chức năng");
                }
            } while (choose != 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
