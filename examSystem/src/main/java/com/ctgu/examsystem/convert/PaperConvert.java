package com.ctgu.examsystem.convert;

import com.ctgu.examsystem.common.DateUtils;
import com.ctgu.examsystem.domain.Paper;
import com.ctgu.examsystem.rest.dto.CreatePaperRequest;
import com.ctgu.examsystem.rest.dto.PaperDto;

public class PaperConvert  {

    public static Paper transform(CreatePaperRequest createPaperRequest){
        Paper paper = new Paper();
        paper.setTotalTime(createPaperRequest.getTotalTime());
        paper.setStartTime(DateUtils.stringToDate(createPaperRequest.getStartTime(),DateUtils.TimePattern.YYYY_MM_DD_HH_MM_SS));
        paper.setEndTime(DateUtils.stringToDate(createPaperRequest.getEndTime(),DateUtils.TimePattern.YYYY_MM_DD_HH_MM_SS));
        paper.setPaperName(createPaperRequest.getPaperName());
        paper.setStudentsRef(createPaperRequest.getStudentsRef());
        paper.setAppointQuestions(createPaperRequest.getAppointQuestions());
        return paper;
    }

    public static PaperDto transform(Paper paper){
        PaperDto paperDto = new PaperDto();
        paperDto.setId(paper.getId());
        paperDto.setStartTime(DateUtils.dateToString(paper.getStartTime(),DateUtils.TimePattern.YYYY_MM_DD_HH_MM_SS));
        paperDto.setEndTime(DateUtils.dateToString(paper.getEndTime(),DateUtils.TimePattern.YYYY_MM_DD_HH_MM_SS));
        paperDto.setAppointQuestions(paper.getAppointQuestions());
        paperDto.setPaperName(paper.getPaperName());
        paperDto.setTotalScore(paper.getTotalScore());
        paperDto.setTotalTime(paper.getTotalTime());
        paperDto.setType(paper.getType());
        return paperDto;
    }
}
