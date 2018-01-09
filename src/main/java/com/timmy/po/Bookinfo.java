package com.timmy.po;

import java.util.Date;

public class Bookinfo {
    private Integer id;

    private String bookname;

    private String booknum;

    private String authorname;

    private String publishinghouse;

    private Date publishingdate;

    private Integer repertorynum;

    private String repertorylocation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getBooknum() {
        return booknum;
    }

    public void setBooknum(String booknum) {
        this.booknum = booknum == null ? null : booknum.trim();
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname == null ? null : authorname.trim();
    }

    public String getPublishinghouse() {
        return publishinghouse;
    }

    public void setPublishinghouse(String publishinghouse) {
        this.publishinghouse = publishinghouse == null ? null : publishinghouse.trim();
    }

    public Date getPublishingdate() {
        return publishingdate;
    }

    public void setPublishingdate(Date publishingdate) {
        this.publishingdate = publishingdate;
    }

    public Integer getRepertorynum() {
        return repertorynum;
    }

    public void setRepertorynum(Integer repertorynum) {
        this.repertorynum = repertorynum;
    }

    public String getRepertorylocation() {
        return repertorylocation;
    }

    public void setRepertorylocation(String repertorylocation) {
        this.repertorylocation = repertorylocation == null ? null : repertorylocation.trim();
    }
}