package com.itschool.Classes;

import com.itschool.Enums.Condition;
import com.itschool.Enums.CoverType;

public class Book4Library extends Book
{
    int ID;

    public Book4Library(int id, String title, Author[] authors, Publisher publisher, int publishedYear, int pages, CoverType coverType, Condition condition)
    {
        super(title, authors, publisher, publishedYear, pages, coverType, condition);
        this.ID = id;
    }

    public Book4Library(Book book)
    {
        super(book);
    }

    @Override
    public String toString()
    {
        return ID + ": " + super.toString();
    }
}
