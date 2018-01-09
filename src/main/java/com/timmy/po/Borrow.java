package com.timmy.po;

import java.util.Date;

public class Borrow extends BorrowKey {
    private Integer borrowbooknum;

    private Date borrowbegin;

    private Date borrowend;

    private Integer owed;

    private Double fine;

    public Integer getBorrowbooknum() {
        return borrowbooknum;
    }

    public void setBorrowbooknum(Integer borrowbooknum) {
        this.borrowbooknum = borrowbooknum;
    }

    public Date getBorrowbegin() {
        return borrowbegin;
    }

    public void setBorrowbegin(Date borrowbegin) {
        this.borrowbegin = borrowbegin;
    }

    public Date getBorrowend() {
        return borrowend;
    }

    public void setBorrowend(Date borrowend) {
        this.borrowend = borrowend;
    }

    public Integer getOwed() {
        return owed;
    }

    public void setOwed(Integer owed) {
        this.owed = owed;
    }

    public Double getFine() {
        return fine;
    }

    public void setFine(Double fine) {
        this.fine = fine;
    }
}