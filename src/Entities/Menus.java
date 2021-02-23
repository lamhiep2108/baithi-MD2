package Entities;

import java.util.Scanner;

public class Menus {
    static Scanner scanner= new Scanner(System.in);
    public static PhoneBook getPhoneBookInfo(){
        System.out.println("------------------");
        System.out.println("enter id");
        int id= Integer.parseInt(scanner.nextLine());
        System.out.println("enter name");
        String name = scanner.nextLine();
        System.out.println("enter phone number");
        String phoneNumber=scanner.nextLine();
        System.out.println("enter address");
        String address=scanner.nextLine();
        System.out.println("enter email");
        String email=scanner.nextLine();
        System.out.println("enter facebook");
        String facebook=scanner.nextLine();
        return new PhoneBook(id,name,phoneNumber,address,email,facebook);
    }
}
