package com.ctgu.examsystem.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class Paper {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private Long teacherRef;

    private String paperName;

    private String questionsRef;

    private String studentsRef;

    private double totalScore;

    private String appointQuestions;

    private int type;

    private int totalTime;

    private Date startTime;

    private Date endTime;

    private Date createTIme;


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

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public String getQuestionsRef() {
        return questionsRef;
    }

    public void setQuestionsRef(String questionsRef) {
        this.questionsRef = questionsRef;
    }

    public String getStudentsRef() {
        return studentsRef;
    }

    public void setStudentsRef(String studentsRef) {
        this.studentsRef = studentsRef;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }

    public String getAppointQuestions() {
        return appointQuestions;
    }

    public void setAppointQuestions(String appointQuestions) {
        this.appointQuestions = appointQuestions;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
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

    public Date getCreateTIme() {
        return createTIme;
    }

    public void setCreateTIme(Date createTIme) {
        this.createTIme = createTIme;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "id=" + id +
                ", teacherRef=" + teacherRef +
                ", paperName='" + paperName + '\'' +
                ", questionsRef='" + questionsRef + '\'' +
                ", studentsRef='" + studentsRef + '\'' +
                ", totalScore=" + totalScore +
                ", appointQuestions='" + appointQuestions + '\'' +
                ", type=" + type +
                ", totalTime=" + totalTime +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createTIme=" + createTIme +
                '}';
    }
}
