package com.epam.tm.ejbNews.dao;

import com.epam.tm.ejbNews.entity.News;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class EntityManagerNewsDao extends EntityManagerDao<News> implements NewsDao{

    private static final String ALL_NEWS_JPQL_QUERY = "from News order by date";
    public List<News> getAllNewsOrderByDate() {
        TypedQuery<News> typedQuery = entityManager.createQuery(ALL_NEWS_JPQL_QUERY, News.class);
        return typedQuery.getResultList();
    }

    public News fetchById(long id) {
        return entityManager.find(News.class, id);
    }

    @Override
    public void remove(News entity) {
        News news = fetchById(entity.getId());
        entityManager.remove(news);
    }


}
