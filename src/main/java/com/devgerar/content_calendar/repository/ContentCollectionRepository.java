package com.devgerar.content_calendar.repository;

import com.devgerar.content_calendar.model.Content;
import com.devgerar.content_calendar.model.Status;
import com.devgerar.content_calendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private final List<Content> contents = new ArrayList<>();

    public ContentCollectionRepository() {}

    public List<Content> findAll() { return contents; }

    public Optional<Content> findById(Integer id) {
        return contents.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    @PostConstruct
    public void init() {
        Content c = new Content(1,
                "My first blog Content",
                "My first blog post",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                "");

        contents.add(c);
    }
}
