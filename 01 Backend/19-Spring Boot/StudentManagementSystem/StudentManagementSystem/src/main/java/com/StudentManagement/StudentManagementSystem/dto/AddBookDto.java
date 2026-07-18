package com.StudentManagement.StudentManagementSystem.dto;

public class AddBookDto {
    private String bookName;
    private String bookAuthor;

    public AddBookDto() {
    }

    public AddBookDto(String bookName, String bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
