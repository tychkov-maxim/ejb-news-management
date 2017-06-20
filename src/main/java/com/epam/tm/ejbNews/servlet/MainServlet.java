package com.epam.tm.ejbNews.servlet;

import com.epam.tm.ejbNews.entity.News;
import com.epam.tm.ejbNews.service.NewsLocalService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "*.do")
public class MainServlet extends HttpServlet {

    @EJB
    private NewsLocalService newsLocalService;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<News> listOfNews = newsLocalService.getAllNewsByDate();
        req.setAttribute("list", listOfNews);
        req.getRequestDispatcher("/WEB-INF/jsp/listOfNews.jsp").forward(req,resp)1;
    }
}
