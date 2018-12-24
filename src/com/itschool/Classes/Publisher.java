package com.itschool.Classes;

public class Publisher
{
    String title;
    String webpage;
    int year;

    public Publisher(String title, String webpage, int year)
    {
        this.title = title;
        this.webpage = webpage;
        this.year = year;
    }

    @Override
    public String toString()
    {
        return "{" + this.title + ", webpage: " + this.webpage +   ", year=" + year +'}';
    }
}
