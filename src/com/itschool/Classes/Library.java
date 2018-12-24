package com.itschool.Classes;

import java.util.ArrayList;

public class Library
{
    private ArrayList<Book4Library> books;

    public ArrayList<Book4Library> getBooks()
    {
        return books;
    }

    public void addBook(Book4Library book)
    {
        if (this.books.isEmpty())
            book.ID = 1;
        else
            book.ID = this.books.get(this.books.size()-1).ID + 1;

        // TODO использовать статическое поле класса Книга для хранения кол-ва добавленных книг
        // TODO хранить счёткик добавленных за все время книг

        this.books.add(book);
    }

    public Library()
    {
        this.books = new ArrayList<>();
    }

    public Library(int booksNumber)
    {
        this.books = new ArrayList<>(booksNumber);
    }

    @Override
    public String toString()
    {
        String result = "Library: \n";
        for (Book4Library book:this.books)
        {
            result += book + "\n";
        }
        return result;
    }

    public String searchByTitle(String title)
    {
        String result = "";
        for (Book book :this.books)
        {
            if (book.title.contains(title))
                result += book+"\n";
        }

        return result;
    }

    public ArrayList<Integer> searchByTitleList(String title)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for (Book4Library book :this.books)
        {
            if (book.title.contains(title))
                result.add(book.ID);
        }

        return result;
    }

    public Book4Library getBookByID(int id)
    {
        Book4Library book4Library = null;
        for (Book4Library book:this.books)
        {
            if (book.ID == id)
            {
                book4Library = book;
                break;
            }
        }
        return book4Library;
    }
}
