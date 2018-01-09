package com.timmy.po;

public class Aboutus {
    private Integer aid;

    private String aboutourstore;

    private String p11;

    private String p12;

    private String p21;

    private String p22;

    private String p31;

    private String p32;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAboutourstore() {
        return aboutourstore;
    }

    public void setAboutourstore(String aboutourstore) {
        this.aboutourstore = aboutourstore == null ? null : aboutourstore.trim();
    }

    public String getP11() {
        return p11;
    }

    public void setP11(String p11) {
        this.p11 = p11 == null ? null : p11.trim();
    }

    public String getP12() {
        return p12;
    }

    public void setP12(String p12) {
        this.p12 = p12 == null ? null : p12.trim();
    }

    public String getP21() {
        return p21;
    }

    public void setP21(String p21) {
        this.p21 = p21 == null ? null : p21.trim();
    }

    public String getP22() {
        return p22;
    }

    public void setP22(String p22) {
        this.p22 = p22 == null ? null : p22.trim();
    }

    public String getP31() {
        return p31;
    }

    public void setP31(String p31) {
        this.p31 = p31 == null ? null : p31.trim();
    }

    public String getP32() {
        return p32;
    }

    public void setP32(String p32) {
        this.p32 = p32 == null ? null : p32.trim();
    }
}