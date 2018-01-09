package com.timmy.po;

public class Borrower {
    private Integer borrowerid;

    private String borrowername;

    private String borrowernum;

    private String borrowerclass;

    private String borrowerdepartment;

    public Integer getBorrowerid() {
        return borrowerid;
    }

    public void setBorrowerid(Integer borrowerid) {
        this.borrowerid = borrowerid;
    }

    public String getBorrowername() {
        return borrowername;
    }

    public void setBorrowername(String borrowername) {
        this.borrowername = borrowername == null ? null : borrowername.trim();
    }

    public String getBorrowernum() {
        return borrowernum;
    }

    public void setBorrowernum(String borrowernum) {
        this.borrowernum = borrowernum == null ? null : borrowernum.trim();
    }

    public String getBorrowerclass() {
        return borrowerclass;
    }

    public void setBorrowerclass(String borrowerclass) {
        this.borrowerclass = borrowerclass == null ? null : borrowerclass.trim();
    }

    public String getBorrowerdepartment() {
        return borrowerdepartment;
    }

    public void setBorrowerdepartment(String borrowerdepartment) {
        this.borrowerdepartment = borrowerdepartment == null ? null : borrowerdepartment.trim();
    }
}