package com.ctgu.examsystem.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class ExamResult {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private Long studentRef;

    private Long paperRef;

    private String answers;

    private double score;

    private Date startTime;

    private Date endTime;

    private int state;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentRef() {
        return studentRef;
    }

    public void setStudentRef(Long studentRef) {
        this.studentRef = studentRef;
    }

    public Long getPaperRef() {
        return paperRef;
    }

    public void setPaperRef(Long paperRef) {
        this.paperRef = paperRef;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ExamResult{" +
                "id=" + id +
                ", studentRef=" + studentRef +
                ", paperRef=" + paperRef +
                ", answers='" + answers + '\'' +
                ", score=" + score +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", state=" + state +
                ", createTime=" + createTime +
                '}';
    }
}
