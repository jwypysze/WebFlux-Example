package com.kodilla.webflux.controller;

import com.kodilla.webflux.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class FluxBookDtoController {

    @GetMapping(value = "/books")
    public Flux<Book> getBooks() {
        return Flux
                .just(new Book("Title one", "Author one", 1995),
                        new Book("Title two", "Author two", 1998),
                        new Book("Title three", "Author three", 2003))
                .log();
    }

}
