package com.ctgu.examsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ctgu.examsystem.*"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = {"com.ctgu.examsystem.rest..*"})})
public class ExamsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamsystemApplication.class, args);
    }

}
