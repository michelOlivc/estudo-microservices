package com.estudo.organization.services;

import com.estudo.organization.errors.exceptions.EntityNotFoundException;
import com.estudo.organization.repositories.BaseRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.repository.NoRepositoryBean;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public abstract class BaseService<T, D, ID> {

    final private Type ENTITY_TYPE = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    final private Type DTO_TYPE = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];

    protected BaseRepository<T, ID> repository;

    @Autowired
    protected ModelMapper mapper;

    public BaseService(final BaseRepository<T, ID> repository) {
        this.repository = repository;
    }

    public List<D> findAll() {
        return repository.findAll().stream()
                .map(this::mapEntityToDto)
                .toList();
    }

    public Page<D> findAll(final String sortBy, final String sortDirection, final int page, final int size) {
        final Sort sort = Sort.by(sortDirection, sortBy);
        final Pageable pageable = PageRequest.of(page, size, sort);
        final Page<T> entityPage = repository.findAll(pageable);

        final List<D> dtoList = entityPage.getContent().stream()
                .map(this::mapEntityToDto)
                .toList();

        return new PageImpl<>(dtoList, pageable, entityPage.getTotalElements());
    }

    public D findById(final ID id) {
        final Optional<T> optional = repository.findById(id);

        if (optional.isPresent()) {
            return mapEntityToDto(optional.get());
        }

        final String className = ((Class) ENTITY_TYPE).getSimpleName();

        throw new EntityNotFoundException(className, id.toString());
    }

    public D save(final D dto) {
        final T entity = repository.save(mapDtoToEntity(dto));
        return mapEntityToDto(entity);
    }

    public void deleteById(final ID id) {
        repository.deleteById(id);
    }

    private D mapEntityToDto(T entity) {
        return mapper.map(entity, DTO_TYPE);
    }

    private T mapDtoToEntity(D dto) {
        return mapper.map(dto, ENTITY_TYPE);
    }
}
