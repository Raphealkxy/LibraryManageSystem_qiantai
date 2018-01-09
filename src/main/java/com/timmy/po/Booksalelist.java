package com.timmy.po;

public class Booksalelist extends BooksalelistKey {
    private String saledbookname;

    private Integer saledate;

    private Integer salecount;

    public String getSaledbookname() {
        return saledbookname;
    }

    public void setSaledbookname(String saledbookname) {
        this.saledbookname = saledbookname == null ? null : saledbookname.trim();
    }

    public Integer getSaledate() {
        return saledate;
    }

    public void setSaledate(Integer saledate) {
        this.saledate = saledate;
    }

    public Integer getSalecount() {
        return salecount;
    }

    public void setSalecount(Integer salecount) {
        this.salecount = salecount;
    }
}