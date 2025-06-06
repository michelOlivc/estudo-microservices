package com.estudo.accounting.controllers;

import com.estudo.accounting.services.BaseService;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@NoRepositoryBean
public abstract class BaseController<D, ID> {

    protected BaseService<?, D, ID> service;

    public BaseController(final BaseService<?, D, ID> service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<D>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<D> findById(@PathVariable final ID id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<D> save(@RequestBody final D entity) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final ID id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
