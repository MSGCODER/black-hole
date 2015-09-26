package com.msgcoder.dao.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "art_work")
public class ArtWork {
    private int id;
    private String serialNo;
    private String title;
    private String cover;
    private String linkUrl;
    private String tag;
    private String company;
    private String country;
    private String description;
    private Date createTime;

    public ArtWork(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Basic
    @Column(name = "serial_no")
    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Basic
    @Column(name = "cover")
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
    @Basic
    @Column(name = "link_url")
    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }
    @Basic
    @Column(name = "tag")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    @Basic
    @Column(name = "company")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Basic
    @Column(name="create_time")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "ArtWork{" +
                "id=" + id +
                ", serialNo='" + serialNo + '\'' +
                ", title='" + title + '\'' +
                ", desc='" + description + '\'' +
                ", imgUrl='" + cover + '\'' +
                ", linkUrl='" + linkUrl + '\'' +
                ", tag='" + tag + '\'' +
                ", company='" + company + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
