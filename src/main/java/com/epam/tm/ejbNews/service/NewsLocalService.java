package com.epam.tm.ejbNews.service;

import com.epam.tm.ejbNews.entity.News;

import javax.ejb.Local;
import java.util.List;

@Local
public interface NewsLocalService {

    List<News> getAllNewsByDate();
    void deleteNewsById(News news);
    News getNewsById(long id);
    News saveNews(News news);

}

