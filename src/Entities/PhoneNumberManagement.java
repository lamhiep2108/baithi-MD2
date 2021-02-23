package Entities;

import Entities.PhoneBook;

import java.util.ArrayList;
import java.util.List;


public class PhoneNumberManagement {
    List<PhoneBook>phoneBooks=new ArrayList<>();

    public List<PhoneBook> getPhoneBooks() {
        return phoneBooks;
    }

    public void setPhoneBooks(List<PhoneBook> phoneBooks) {
        this.phoneBooks = phoneBooks;
    }

    public void showAll(){
        for (PhoneBook p:phoneBooks) {
            System.out.println(p.toString());
        }
    }
    public void add(PhoneBook p){
        phoneBooks.add(p);
    }
    public void update(PhoneBook phoneBook){
        for (PhoneBook p:phoneBooks) {
                if (phoneBook.getId() == p.getId()) {
                    p.setPhoneNumber(phoneBook.getPhoneNumber());
                    p.setName(phoneBook.getName());
                    p.setAddress(phoneBook.getAddress());
                    p.setEmail(phoneBook.getEmail());
                    p.setFacebook(phoneBook.getFacebook());

            }
        }
    }
    public void delete(int id){
        phoneBooks.removeIf(p ->p.getId()==id );

    }
    public PhoneBook search(int id){
        PhoneBook phoneBook=null;
        for (PhoneBook p:phoneBooks) {
            if (p.getId()==id){
                phoneBook=p;
            }
        }return phoneBook;
    }
}
