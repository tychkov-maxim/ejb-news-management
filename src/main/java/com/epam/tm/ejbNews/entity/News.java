package com.epam.tm.ejbNews.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


@Entity
@Table(name = "NEWS")
public class News extends BaseEntity{
    @Column(name = "TITLE", nullable = false, length = 64)
    private String title;
    @Column(name = "dateApp", nullable = false)
    private Date date;
    @Column(name = "BRIEF", length = 512)
    private String brief;
    @Column(name = "CONTENT", length = 2048)
    private String content;

    public News() {
        title = "";
        date = new Time(0);
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof News)) return false;
        if (!super.equals(o)) return false;

        News news = (News) o;

        if (!title.equals(news.title)) return false;
        if (!date.equals(news.date)) return false;
        if (!brief.equals(news.brief)) return false;
        return content != null ? content.equals(news.content) : news.content == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + date.hashCode();
        result = 31 * result + brief.hashCode();
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }
}
