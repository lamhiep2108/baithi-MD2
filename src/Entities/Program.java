package Entities;
import java.util.ArrayList;
import java.util.Scanner;

import static FileIo.CsvReader.readCsvFile;
import static FileIo.CsvWriter.writeCsvFile;

public class Program {
    static Scanner input= new Scanner(System.in);
    static PhoneNumberManagement pn=new PhoneNumberManagement();
    public static void main(String[] args) {

        do {
            System.out.println("-----Phone Book-----");
            System.out.println("1.showAll");
            System.out.println("2.add");
            System.out.println("3.update");
            System.out.println("4.delete");
            System.out.println("5.search");
            System.out.println("6.write to file");
            System.out.println("7.Reader to file");
            System.out.println("0.exit");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 0:
                System.exit(0);
                break;
                case 1:
                    pn.showAll();
                    break;
                case 2:
                    PhoneBook phoneBook= Menus.getPhoneBookInfo();
                    pn.add(phoneBook);
                    break;
                case 3:
                    PhoneBook phoneBook1=Menus.getPhoneBookInfo();
                        pn.update(phoneBook1);
                    break;
                case 4:
                    System.out.println("enter id");
                   int id1 = Integer.parseInt(input.nextLine());
                    pn.delete(id1);
                    break;
                case 5:
                    System.out.println("enter id");
                    int id2=Integer.parseInt(input.nextLine());
                    System.out.println(pn.search(id2));
                    break;
                case 6:
                    String filename = "data/phonebook.csv";
                    ArrayList<PhoneBook> phoneBooks= (ArrayList<PhoneBook>) pn.getPhoneBooks();
                    writeCsvFile(filename,phoneBooks);
                case 7:
                    String filename1="data/phonebook.csv";
                    readCsvFile(filename1);

                default:
                    continue;
            }
        }while (true);

    }
}
