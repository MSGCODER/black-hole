package com.msgcoder.dao.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by guanshiming on 2015/9/24.
 */
@Entity
@Table(name = "artist")
public class Artist {
    private int id;
    private String ename;
    private String jname;
    private String cname;
    private Date birthday;
    private int height;
    private int weight;
    private String desc;

    public Artist() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Basic
    @Column(name = "ename")
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
    @Basic
    @Column(name = "jname")
    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }
    @Basic
    @Column(name = "cname")
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
    @Basic
    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    @Basic
    @Column(name = "height")
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Basic
    @Column(name = "weight")
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Basic
    @Column(name = "desc")
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", jname='" + jname + '\'' +
                ", cname='" + cname + '\'' +
                ", birthday=" + birthday +
                ", height=" + height +
                ", weight=" + weight +
                ", desc='" + desc + '\'' +
                '}';
    }
}
