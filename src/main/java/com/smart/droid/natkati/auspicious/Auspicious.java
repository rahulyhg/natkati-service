package com.smart.droid.natkati.auspicious;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "auspicious")
public class Auspicious {

    @Id
    @Column(name = "auspicious_id")
    private int auspiciousID;

    @Column(name = "auspicious_date")
    private LocalDate auspiciousDate;

    @Column(name = "year")
    private Integer year;

    @Column(name = "month")
    private Integer month;

    @Column(name = "auspicious_type")
    private String auspiciousType;

    @Column(name = "auspicious_code")
    private String auspiciousCode;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "deleted")
    private Boolean deleted;

    public Auspicious(int auspiciousID, LocalDate auspiciousDate, Integer year, Integer month, String auspiciousType, String auspiciousCode, Date updateDate, Boolean deleted) {
        this.auspiciousID = auspiciousID;
        this.auspiciousDate = auspiciousDate;
        this.year = year;
        this.month = month;
        this.auspiciousType = auspiciousType;
        this.auspiciousCode = auspiciousCode;
        this.updateDate = updateDate;
        this.deleted = deleted;
    }

    public Auspicious() {
    }

    public int getAuspiciousID() {
        return auspiciousID;
    }

    public void setAuspiciousID(int auspiciousID) {
        this.auspiciousID = auspiciousID;
    }

    public LocalDate getAuspiciousDate() {
        return auspiciousDate;
    }

    public void setAuspiciousDate(LocalDate auspiciousDate) {
        this.auspiciousDate = auspiciousDate;
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

    public String getAuspiciousType() {
        return auspiciousType;
    }

    public void setAuspiciousType(String auspiciousType) {
        this.auspiciousType = auspiciousType;
    }

    public String getAuspiciousCode() {
        return auspiciousCode;
    }

    public void setAuspiciousCode(String auspiciousCode) {
        this.auspiciousCode = auspiciousCode;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}

