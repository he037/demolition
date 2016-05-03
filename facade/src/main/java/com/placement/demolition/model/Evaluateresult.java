package com.placement.demolition.model;

public class Evaluateresult {
    private Long id;

    private Long evaluateid;

    private String housenum;

    private String type;

    private String structurelevel;

    private String identificatearea;

    private String excessarea;

    private String nolicensearea;

    private String realarea;

    private String legalareaprice;

    private String nolicenseprice;

    private String remark;

    private String facilities;

    private String insettime;

    private String attachment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEvaluateid() {
        return evaluateid;
    }

    public void setEvaluateid(Long evaluateid) {
        this.evaluateid = evaluateid;
    }

    public String getHousenum() {
        return housenum;
    }

    public void setHousenum(String housenum) {
        this.housenum = housenum == null ? null : housenum.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStructurelevel() {
        return structurelevel;
    }

    public void setStructurelevel(String structurelevel) {
        this.structurelevel = structurelevel == null ? null : structurelevel.trim();
    }

    public String getIdentificatearea() {
        return identificatearea;
    }

    public void setIdentificatearea(String identificatearea) {
        this.identificatearea = identificatearea == null ? null : identificatearea.trim();
    }

    public String getExcessarea() {
        return excessarea;
    }

    public void setExcessarea(String excessarea) {
        this.excessarea = excessarea == null ? null : excessarea.trim();
    }

    public String getNolicensearea() {
        return nolicensearea;
    }

    public void setNolicensearea(String nolicensearea) {
        this.nolicensearea = nolicensearea == null ? null : nolicensearea.trim();
    }

    public String getRealarea() {
        return realarea;
    }

    public void setRealarea(String realarea) {
        this.realarea = realarea == null ? null : realarea.trim();
    }

    public String getLegalareaprice() {
        return legalareaprice;
    }

    public void setLegalareaprice(String legalareaprice) {
        this.legalareaprice = legalareaprice == null ? null : legalareaprice.trim();
    }

    public String getNolicenseprice() {
        return nolicenseprice;
    }

    public void setNolicenseprice(String nolicenseprice) {
        this.nolicenseprice = nolicenseprice == null ? null : nolicenseprice.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities == null ? null : facilities.trim();
    }

    public String getInsettime() {
        return insettime;
    }

    public void setInsettime(String insettime) {
        this.insettime = insettime == null ? null : insettime.trim();
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
    }
}