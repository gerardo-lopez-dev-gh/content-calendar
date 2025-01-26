package com.devgerar.content_calendar.controller;

import com.devgerar.content_calendar.model.Content;
import com.devgerar.content_calendar.repository.ContentRepositoryImp;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/content")
@CrossOrigin
public class ContentController {

    private final ContentRepositoryImp contentRepositoryImp;

    public ContentController(ContentRepositoryImp contentRepositoryImp) {
        this.contentRepositoryImp = contentRepositoryImp;
    }

    //make a request and find all the pieces of content in the system
    @GetMapping("")
    public List<Content> findAll() {
        return contentRepositoryImp.findAll();
    }

    @GetMapping("/{id}")
    public Content findById(@PathVariable Integer id) {
        return contentRepositoryImp.findById(id).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found") );
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create (@Valid @RequestBody Content content) {
        contentRepositoryImp.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody Content content, @PathVariable Integer id) {
        if(!contentRepositoryImp.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found");
        }

        contentRepositoryImp.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        if(!contentRepositoryImp.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found");
        }
        contentRepositoryImp.delete(id);
    }


}
