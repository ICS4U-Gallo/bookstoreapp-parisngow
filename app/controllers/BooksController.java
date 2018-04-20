package controllers;

import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;

import play.mvc.Result;

import models.Book;

import views.html.Books.*;

import javax.inject.Inject;

import java.util.Set;

public class BooksController extends Controller {

    @Inject
    FormFactory formFactory;

    //For showing our books
    public Result index() {
        Set<Book> books = Book.allBooks();
        return ok(index.render(books));
    }

    //To create books
    public Result create() {
        Form<Book> bookForm = formFactory.form(Book.class);

        return ok(create.render(bookForm));
    }

    //For saving books
    public Result save() {
        Form<Book> bookForm = formFactory.form(Book.class).bindFromRequest();
        Book book = bookForm.get();
        Book.add(book);

        return redirect(routes.BooksController.index());
    }

    //Add a single book
    public Result edit(Integer id) {
        Book book = Book.findById(id);
        if (book==null) {
            return notFound("Book not found");
        }
        Form<Book> bookForm = formFactory.form(Book.class).fill(book);

        return ok(edit.render(bookForm));
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
