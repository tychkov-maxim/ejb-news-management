package com.epam.tm.ejbNews.service;

import com.epam.tm.ejbNews.entity.News;

import javax.ejb.Local;
import javax.ejb.Remote;
import java.util.List;

@Remote
public interface NewsRemoteService {

    List<News> getAllNewsByDate();
    void deleteNewsById(News news);
    News getNewsById(long id);
    News saveNews(News news);

}

