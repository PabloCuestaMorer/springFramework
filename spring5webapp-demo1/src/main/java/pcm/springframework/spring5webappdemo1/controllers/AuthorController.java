/*
 * Created by PabloCM on 28/11/2020 12:25 pm with IntelliJ IDEA
 * Project spring5webapp-demo1
 */

package pcm.springframework.spring5webappdemo1.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pcm.springframework.spring5webappdemo1.repositories.AuthorRepository;

@Controller
public class AuthorController {
    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors/authorsList";
    }
}
