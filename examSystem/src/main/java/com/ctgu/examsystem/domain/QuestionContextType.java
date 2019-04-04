package com.ctgu.examsystem.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class QuestionContextType {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Long Id;

    private String describe;

    private Long teacherRef;

    private Date createTime;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Long getTeacherRef() {
        return teacherRef;
    }

    public void setTeacherRef(Long teacherRef) {
        this.teacherRef = teacherRef;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "QuestionContextType{" +
                "Id=" + Id +
                ", describe='" + describe + '\'' +
                ", teacherRef=" + teacherRef +
                ", createTime=" + createTime +
                '}';
    }
}
