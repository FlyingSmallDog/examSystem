package com.ctgu.examsystem.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class Question {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private Long teacherRef;

    private int typeRef;

    private Long contextTypeRef;

    private String questionDescribe;

    private String answerDescribe;

    private double score;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTeacherRef() {
        return teacherRef;
    }

    public void setTeacherRef(Long teacherRef) {
        this.teacherRef = teacherRef;
    }

    public int getTypeRef() {
        return typeRef;
    }

    public void setTypeRef(int typeRef) {
        this.typeRef = typeRef;
    }

    public Long getContextTypeRef() {
        return contextTypeRef;
    }

    public void setContextTypeRef(Long contextTypeRef) {
        this.contextTypeRef = contextTypeRef;
    }

    public String getquestionDescribe() {
        return questionDescribe;
    }

    public void setquestionDescribe(String questionDescribe) {
        this.questionDescribe = questionDescribe;
    }

    public String getanswerDescribe() {
        return answerDescribe;
    }

    public void setanswerDescribe(String aDescribe) {
        this.answerDescribe = answerDescribe;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", teacherRef=" + teacherRef +
                ", typeRef=" + typeRef +
                ", contextTypeRef=" + contextTypeRef +
                ", questionDescribe='" + questionDescribe + '\'' +
                ", answerDescribe='" + answerDescribe + '\'' +
                ", score=" + score +
                ", createTime=" + createTime +
                '}';
    }
}
