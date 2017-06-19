package com.epam.tm.ejbNews.dao;

import com.epam.tm.ejbNews.entity.News;

import javax.ejb.Local;
import java.util.List;

@Local
public interface NewsDao extends Dao<News> {
    List<News> getAllNewsOrderByDate();
}
