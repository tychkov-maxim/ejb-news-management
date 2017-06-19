package com.epam.tm.ejbNews.dao;

import com.epam.tm.ejbNews.entity.BaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class EntityManagerDao<T extends BaseEntity> implements Dao<T> {

    @PersistenceContext(unitName = "DEVMODE")
    protected EntityManager entityManager;

    public T save(T entity) {
        entityManager.persist(entity);
        return entity;
    }

    public void remove(T entity) {
        entityManager.remove(entity);
    }
}
