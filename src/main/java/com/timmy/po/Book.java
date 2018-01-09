package com.timmy.po;

import java.util.Date;

public class Book {
    private Integer bid;

    private String bname;

    private String image;

    private Integer num;

    private String bdesc1;

    private String bdesc2;

    private String bdesc3;

    private String bdesc4;

    private Integer ishot;

    private Date bdate;

    private Integer cid;

    private Date publishingdate;

    private String publishinglocation;

    private String repertorylocation;

    private String authorname;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getBdesc1() {
        return bdesc1;
    }

    public void setBdesc1(String bdesc1) {
        this.bdesc1 = bdesc1 == null ? null : bdesc1.trim();
    }

    public String getBdesc2() {
        return bdesc2;
    }

    public void setBdesc2(String bdesc2) {
        this.bdesc2 = bdesc2 == null ? null : bdesc2.trim();
    }

    public String getBdesc3() {
        return bdesc3;
    }

    public void setBdesc3(String bdesc3) {
        this.bdesc3 = bdesc3 == null ? null : bdesc3.trim();
    }

    public String getBdesc4() {
        return bdesc4;
    }

    public void setBdesc4(String bdesc4) {
        this.bdesc4 = bdesc4 == null ? null : bdesc4.trim();
    }

    public Integer getIshot() {
        return ishot;
    }

    public void setIshot(Integer ishot) {
        this.ishot = ishot;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Date getPublishingdate() {
        return publishingdate;
    }

    public void setPublishingdate(Date publishingdate) {
        this.publishingdate = publishingdate;
    }

    public String getPublishinglocation() {
        return publishinglocation;
    }

    public void setPublishinglocation(String publishinglocation) {
        this.publishinglocation = publishinglocation == null ? null : publishinglocation.trim();
    }

    public String getRepertorylocation() {
        return repertorylocation;
    }

    public void setRepertorylocation(String repertorylocation) {
        this.repertorylocation = repertorylocation == null ? null : repertorylocation.trim();
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname == null ? null : authorname.trim();
    }
}