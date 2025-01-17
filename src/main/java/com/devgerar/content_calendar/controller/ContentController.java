package com.devgerar.content_calendar.controller;

import com.devgerar.content_calendar.model.Content;
import com.devgerar.content_calendar.repository.ContentCollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {

    private final ContentCollectionRepository contentCollectionRepository;

    public ContentController(ContentCollectionRepository contentCollectionRepository) {
        this.contentCollectionRepository = contentCollectionRepository;
    }

    //make a request and find all the pieces of content in the system
    @GetMapping("")
    public List<Content> findAll() {
        return contentCollectionRepository.findAll();
    }


}
