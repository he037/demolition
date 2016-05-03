package com.placement.demolition.model;


public class Evaluate {
    private Long id;

    private String evaluatetime;

    private String relocatenum;

    private String relocatepeople;

    private String houselocated;

    private String evaluatebasis;

    private String inserttime;

    private String attachment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEvaluatetime() {
        return evaluatetime;
    }

    public void setEvaluatetime(String evaluatetime) {
        this.evaluatetime = evaluatetime == null ? null : evaluatetime.trim();
    }

    public String getRelocatenum() {
        return relocatenum;
    }

    public void setRelocatenum(String relocatenum) {
        this.relocatenum = relocatenum == null ? null : relocatenum.trim();
    }

    public String getRelocatepeople() {
        return relocatepeople;
    }

    public void setRelocatepeople(String relocatepeople) {
        this.relocatepeople = relocatepeople == null ? null : relocatepeople.trim();
    }

    public String getHouselocated() {
        return houselocated;
    }

    public void setHouselocated(String houselocated) {
        this.houselocated = houselocated == null ? null : houselocated.trim();
    }

    public String getEvaluatebasis() {
        return evaluatebasis;
    }

    public void setEvaluatebasis(String evaluatebasis) {
        this.evaluatebasis = evaluatebasis == null ? null : evaluatebasis.trim();
    }

    public String getInserttime() {
        return inserttime;
    }

    public void setInserttime(String inserttime) {
        this.inserttime = inserttime == null ? null : inserttime.trim();
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
    }
}