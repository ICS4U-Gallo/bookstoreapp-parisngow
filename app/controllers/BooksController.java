package controllers;

import play.mvc.Controller;

import play.mvc.Result;

import models.Book;

import views.html.Books.*;

import java.util.Set;

public class BooksController extends Controller {

    //For showing our books
    public Result index() {
        Set<Book> books = Book.allBooks();
        return ok(index.render(books));
    }

    //To create books
    public Result create() {
        return TODO;
    }

    //For saving books
    public Result save() {
        return TODO;
    }

    //Add a single book
    public Result edit(Integer id) {
        return TODO;
    }


    //Update edited books
    public Result update() {
        return TODO;
    }

    //Delete books
    public Result destroy(Integer id) {
        return TODO;
    }

    //For book details
    public Result show(Integer id) {
        return TODO;
    }

}
