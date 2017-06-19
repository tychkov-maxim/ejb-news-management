package com.epam.tm.ejbNews.dao;

import com.epam.tm.ejbNews.entity.BaseEntity;

public interface Dao <T extends BaseEntity> {
    T save(T entity);

    T fetchById(long id);

    void remove(T entity);
}
