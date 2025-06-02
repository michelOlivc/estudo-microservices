package com.estudo.sales.services;

import com.estudo.organization.exception.EntityNotFoundException;
import com.estudo.organization.repositories.AbstractRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public abstract class AbstractService<T, ID> {

    protected AbstractRepository<T, ID> repository;

    public AbstractService(final AbstractRepository<T, ID> repository) {
        this.repository = repository;
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public Page<T> findAll(final String sortBy, final String sortDirection, final int page, final int size) {
        final Sort sort = Sort.by(sortDirection, sortBy);
        final Pageable pageable = PageRequest.of(page, size, sort);
        return repository.findAll(pageable);
    }

    public T findById(final ID id) {
        final Optional<T> optional = repository.findById(id);

        if (optional.isPresent()) {
            return optional.get();
        }

        final ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
        final String className = type.getActualTypeArguments()[0].getClass().getName();

        throw new EntityNotFoundException(className, id.toString());
    }

    public T save(final T entity) {
        return repository.save(entity);
    }

    public void deleteById(final ID id) {
        repository.deleteById(id);
    }
}
