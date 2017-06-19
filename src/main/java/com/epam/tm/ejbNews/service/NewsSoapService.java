package com.epam.tm.ejbNews.service;

import com.epam.tm.ejbNews.entity.News;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface NewsSoapService {
    List<News> getAllNewsByDate();
    void deleteNewsById(News news);
    News getNewsById(long id);
    News saveNews(News news);

}
