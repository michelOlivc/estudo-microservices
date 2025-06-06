package com.estudo.sales.controllers;

import com.estudo.sales.services.BaseService;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@NoRepositoryBean
public abstract class BaseController<T, ID> {

    protected BaseService<T, ID> service;

    public BaseController(final BaseService<T, ID> service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<T>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> findById(@PathVariable final ID id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<T> save(@RequestBody final T entity) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final ID id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
