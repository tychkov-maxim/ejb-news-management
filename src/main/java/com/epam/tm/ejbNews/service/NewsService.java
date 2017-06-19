package com.epam.tm.ejbNews.service;


import com.epam.tm.ejbNews.dao.NewsDao;
import com.epam.tm.ejbNews.entity.News;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@Stateless
@WebService(targetNamespace="http://epam.com")
public class NewsService implements NewsLocalService, NewsRemoteService {

    @EJB
    private NewsDao newsDao;

    @WebMethod
    @Override
    public List<News> getAllNewsByDate() {
        return newsDao.getAllNewsOrderByDate();
    }

    @WebMethod
    @Override
    public void deleteNewsById(News news) {
        newsDao.remove(news);
    }

    @WebMethod
    @Override
    public News getNewsById(long id) {
        return newsDao.fetchById(id);
    }

    @WebMethod
    @Override
    public News saveNews(News news) {
        return newsDao.save(news);
    }
}
