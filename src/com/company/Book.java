package com.company;

public class Book {
    private int yearWrite, wordCount, rating;
    private String authorName, bookName;

    public Book(int yearWrite, int wordCount, int rating, String authorName, String bookName) {
        this.yearWrite = yearWrite;
        this.wordCount = wordCount;
        this.rating = rating;
        this.authorName = authorName;
        this.bookName = bookName;
    }

    public int getYearWrite() {
        return yearWrite;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getRating() {
        return rating;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "yearWrite=" + yearWrite +
                ", wordCount=" + wordCount +
                ", rating=" + rating +
                ", authorName='" + authorName + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
