package com.ctgu.examsystem.domain;

import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@NameStyle(Style.camelhumpAndUppercase)
public class CClass {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private String classname;

    private Long headmaster;

    private String students;

    private int stuNumber;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Long getHeadmaster() {
        return headmaster;
    }

    public void setHeadmaster(long headmaster) {
        this.headmaster = headmaster;
    }

    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "CClass{" +
                "id=" + id +
                ", classname='" + classname + '\'' +
                ", headmaster=" + headmaster +
                ", students='" + students + '\'' +
                ", stuNumber=" + stuNumber +
                ", createTime=" + createTime +
                '}';
    }
}
