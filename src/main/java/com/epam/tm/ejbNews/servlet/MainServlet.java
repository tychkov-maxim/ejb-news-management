package com.epam.tm.ejbNews.servlet;

import com.epam.tm.ejbNews.dao.EntityManagerNewsDao;
import com.epam.tm.ejbNews.dao.NewsDao;
import com.epam.tm.ejbNews.entity.News;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(value = "*.do")
public class MainServlet extends HttpServlet {

    @EJB
    private NewsDao newsDao;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<News> listOfNews = newsDao.getAllNewsOrderByDate();

        PrintWriter writer = resp.getWriter();
        for (News news : listOfNews) {
            writer.write(news.getTitle());
        }
        writer.close();
    }
}
