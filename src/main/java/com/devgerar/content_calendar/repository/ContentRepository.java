package com.devgerar.content_calendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devgerar.content_calendar.model.Content;

public interface ContentRepository  extends JpaRepository<Content, Integer> {

}
