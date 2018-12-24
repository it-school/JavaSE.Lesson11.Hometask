package com.itschool;

import com.itschool.Classes.*;
import com.itschool.Enums.Condition;
import com.itschool.Enums.CoverType;
import com.itschool.Enums.Genres;

import java.util.ArrayList;
import java.util.Date;

/**
 * Создать класс Книга (Название, Автор, Издательство, год, кол-во страниц, тип обложки, состояние)
 * Создать класс Библиотека, содержащий список книг, а так же метода для добавления, удаления, изменения состояния, поиска книги (по части названия, автору, году).
 * Использовать обработку исключительных ситуаций при работе с классами.
 *
 * Для улучшения навыков выполнить поле Автор в виде динамического массива авторов.
 * Тип обложки выполнить в виде Enum.
 * Реализовать проверки корректности значений для всех Setter'ов.
 */
public class Main {

    public static void main(String[] args)
    {
        Book book1 = new Book("Alphabet", new Author[] {new Author("Ivanov", new Date("2000/01/01"),
                Genres.детектив)}, new Publisher("BHV", "www.bhv.com.ua", 1990), 2017,
                40, CoverType.твёрдая, Condition.хорошее);
        Book book2 = new Book("Азбука", new Author[] {new Author("Петров", new Date("2000/01/01"),
                Genres.детектив)}, new Publisher("BHV", "www.bhv.com.ua", 1990), 2017,
                40, CoverType.твёрдая, Condition.хорошее);

        book1.getAuthors().get(0).addAuthorGenres(Genres.поэзия);
        System.out.println(book1);

        book1.setCondition(Condition.удовлетворительное);
        System.out.println(book1);

        Book4Library book4Library1 = new Book4Library(book1);
        Book4Library book4Library2 = new Book4Library(book2);
        Library library = new Library();

        library.addBook(book4Library1);
        library.addBook(book4Library2);
        library.addBook(book4Library1);

        System.out.println(library);

        System.out.println(library.searchByTitle("Alpha"));


        ArrayList<Integer> foundBooks = library.searchByTitleList("Alpha");
        for (int i : foundBooks)
        {
            System.out.println(library.getBookByID(i));
        }
    }
}
