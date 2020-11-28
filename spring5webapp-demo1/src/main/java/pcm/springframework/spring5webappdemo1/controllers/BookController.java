package pcm.springframework.spring5webappdemo1.controllers;/*
 * Created by PabloCM on 28/11/2020 11:16 am with IntelliJ IDEA
 * Project spring5webapp-demo1
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pcm.springframework.spring5webappdemo1.repositories.BookRepository;


@Controller
public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "books/booksList";
    }
}
