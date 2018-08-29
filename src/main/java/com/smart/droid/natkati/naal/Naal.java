package com.smart.droid.natkati.naal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "natkal")
public class Naal {

    @Id
    private int id;

    @Column(name = "cal_date")
    private LocalDate calDate;

    private String maadam;

    private int naal;

    private String tithi;

    @Column(name = "tithi_time")
    private String tithiTime;

    private String tithi1;

    @Column(name = "tithi1_time")
    private String tithi1Time;

    private String paksha;

    private String nakshatra;

    @Column(name = "nakshatra_time")
    private String nakshatraTime;

    private String nakshatra1;

    @Column(name = "nakshatra1_time")
    private String nakshatra1Time;

    private String karanam;

    private String yogam;

    private String chandra;

    private String thiyaj;

    private String amirdadhi;

    @Column(name = "update_date")
    private LocalDate updateDate;

    public Naal() {

    }

    public Naal(int id, LocalDate calDate, String maadam, int naal, String tithi, String tithiTime, String tithi1, String tithi1Time, String paksha, String nakshatra, String nakshatraTime, String nakshatra1, String nakshatra1Time, String karanam, String yogam, String chandra, String thiyaj, String amirdadhi, LocalDate updateDate) {
        this.id = id;
        this.calDate = calDate;
        this.maadam = maadam;
        this.naal = naal;
        this.tithi = tithi;
        this.tithiTime = tithiTime;
        this.tithi1 = tithi1;
        this.tithi1Time = tithi1Time;
        this.paksha = paksha;
        this.nakshatra = nakshatra;
        this.nakshatraTime = nakshatraTime;
        this.nakshatra1 = nakshatra1;
        this.nakshatra1Time = nakshatra1Time;
        this.karanam = karanam;
        this.yogam = yogam;
        this.chandra = chandra;
        this.thiyaj = thiyaj;
        this.amirdadhi = amirdadhi;
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getCalDate() {
        return calDate;
    }

    public void setCalDate(LocalDate calDate) {
        this.calDate = calDate;
    }

    public String getMaadam() {
        return maadam;
    }

    public void setMaadam(String maadam) {
        this.maadam = maadam;
    }

    public int getNaal() {
        return naal;
    }

    public void setNaal(int naal) {
        this.naal = naal;
    }

    public String getTithi() {
        return tithi;
    }

    public void setTithi(String tithi) {
        this.tithi = tithi;
    }

    public String getTithiTime() {
        return tithiTime;
    }

    public void setTithiTime(String tithiTime) {
        this.tithiTime = tithiTime;
    }

    public String getTithi1() {
        return tithi1;
    }

    public void setTithi1(String tithi1) {
        this.tithi1 = tithi1;
    }

    public String getTithi1Time() {
        return tithi1Time;
    }

    public void setTithi1Time(String tithi1Time) {
        this.tithi1Time = tithi1Time;
    }

    public String getPaksha() {
        return paksha;
    }

    public void setPaksha(String paksha) {
        this.paksha = paksha;
    }

    public String getNakshatra() {
        return nakshatra;
    }

    public void setNakshatra(String nakshatra) {
        this.nakshatra = nakshatra;
    }

    public String getNakshatraTime() {
        return nakshatraTime;
    }

    public void setNakshatraTime(String nakshatraTime) {
        this.nakshatraTime = nakshatraTime;
    }

    public String getNakshatra1() {
        return nakshatra1;
    }

    public void setNakshatra1(String nakshatra1) {
        this.nakshatra1 = nakshatra1;
    }

    public String getNakshatra1Time() {
        return nakshatra1Time;
    }

    public void setNakshatra1Time(String nakshatra1Time) {
        this.nakshatra1Time = nakshatra1Time;
    }

    public String getKaranam() {
        return karanam;
    }

    public void setKaranam(String karanam) {
        this.karanam = karanam;
    }

    public String getYogam() {
        return yogam;
    }

    public void setYogam(String yogam) {
        this.yogam = yogam;
    }

    public String getChandra() {
        return chandra;
    }

    public void setChandra(String chandra) {
        this.chandra = chandra;
    }

    public String getThiyaj() {
        return thiyaj;
    }

    public void setThiyaj(String thiyaj) {
        this.thiyaj = thiyaj;
    }

    public String getAmirdadhi() {
        return amirdadhi;
    }

    public void setAmirdadhi(String amirdadhi) {
        this.amirdadhi = amirdadhi;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

}
