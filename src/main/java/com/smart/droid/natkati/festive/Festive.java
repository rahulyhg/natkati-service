package com.smart.droid.natkati.festive;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "festive")
public class Festive {

    @Id
    @Column(name = "festive_id")
    private int festiveId;

    private LocalDate festiveDate;

    private Integer year;

    private Integer month;

    private String festiveType;

    private String festiveCode;

    private String festive;

    private Boolean holiday;

    private Boolean deleted;

    private Date updateDate;

    public Festive(int festiveId, LocalDate festiveDate, Integer year, Integer month, String festiveType, String festiveCode, String festive, Boolean holiday, Boolean deleted, Date updateDate) {
        this.festiveId = festiveId;
        this.festiveDate = festiveDate;
        this.year = year;
        this.month = month;
        this.festiveType = festiveType;
        this.festiveCode = festiveCode;
        this.festive = festive;
        this.holiday = holiday;
        this.deleted = deleted;
        this.updateDate = updateDate;
    }

    public Festive() {

    }

    public int getFestiveId() {
        return festiveId;
    }

    public void setFestiveId(int festiveId) {
        this.festiveId = festiveId;
    }

    public LocalDate getFestiveDate() {
        return festiveDate;
    }

    public void setFestiveDate(LocalDate festiveDate) {
        this.festiveDate = festiveDate;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public String getFestiveType() {
        return festiveType;
    }

    public void setFestiveType(String festiveType) {
        this.festiveType = festiveType;
    }

    public String getFestiveCode() {
        return festiveCode;
    }

    public void setFestiveCode(String festiveCode) {
        this.festiveCode = festiveCode;
    }

    public String getFestive() {
        return festive;
    }

    public void setFestive(String festive) {
        this.festive = festive;
    }

    public Boolean getHoliday() {
        return holiday;
    }

    public void setHoliday(Boolean holiday) {
        this.holiday = holiday;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}

