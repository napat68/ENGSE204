package Lab401;

import java.util.Scanner;

class Book {

    private String title;
    private String author;

    public Book(String title) {
        this.title  = title;
        this.author = "Unknown";
    }

    public Book(String title, String author) {
        this.title  = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class Lab401 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {

            String title = input.nextLine();
            Book book    = new Book(title);
            book.displayInfo();

        } else if (choice == 2) {
        	
            String title  = input.nextLine();
            String author = input.nextLine();
            Book book     = new Book(title, author);
            book.displayInfo();
        }

        input.close();
    }
}
