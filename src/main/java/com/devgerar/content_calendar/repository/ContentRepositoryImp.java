package com.devgerar.content_calendar.repository;

import com.devgerar.content_calendar.model.Content;
import com.devgerar.content_calendar.model.Status;
import com.devgerar.content_calendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class ContentRepositoryImp implements ContentRepository {

    @Override
    public void flush() {
        
    }

    @Override
    public <S extends Content> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Content> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Content> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Content getOne(Integer integer) {
        return null;
    }

    @Override
    public Content getById(Integer integer) {
        return null;
    }

    @Override
    public Content getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Content> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Content> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Content> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Content> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Content> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Content> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Content, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Content> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Content> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Content> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<Content> findAll() {
        return List.of();
    }

    @Override
    public List<Content> findAllById(Iterable<Integer> integers) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Content entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Content> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Content> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Content> findAll(Pageable pageable) {
        return null;
    }
}
