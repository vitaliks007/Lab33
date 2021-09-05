package com.company;

import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearWrite, wordCount, rating;
        String authorName, bookName;
        yearWrite = scanner.nextInt();
        wordCount = scanner.nextInt();
        rating = scanner.nextInt();
        authorName = scanner.nextLine();
        bookName = scanner.nextLine();
        Book book = new Book(yearWrite, wordCount, rating, authorName, bookName);
        System.out.println(book);

    }
}
