package com.timmy.po;

import java.util.Date;

public class Borrowbook {
    private Integer id;

    private Integer uid;

    private Integer bid;

    private Integer borrowtime;

    private Date borrowend;

    private Double owe;

    private Integer borrownum;

    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getBorrowtime() {
        return borrowtime;
    }

    public void setBorrowtime(Integer borrowtime) {
        this.borrowtime = borrowtime;
    }

    public Date getBorrowend() {
        return borrowend;
    }

    public void setBorrowend(Date borrowend) {
        this.borrowend = borrowend;
    }

    public Double getOwe() {
        return owe;
    }

    public void setOwe(Double owe) {
        this.owe = owe;
    }

    public Integer getBorrownum() {
        return borrownum;
    }

    public void setBorrownum(Integer borrownum) {
        this.borrownum = borrownum;
    }
}