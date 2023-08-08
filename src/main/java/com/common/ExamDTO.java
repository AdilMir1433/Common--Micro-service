package com.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExamDTO {

    @JsonProperty("id")
    Long id;

    @JsonProperty("examTitle")
    String examTitle;

    @JsonProperty("startTime")
    @DateTimeFormat(pattern = "HH:mm") // Specify the date format you are using for startTime and endTime
    @Temporal(TemporalType.TIME)
    String startTime;

    @JsonProperty("endTime")
    @DateTimeFormat(pattern = "HH:mm") // Specify the date format you are using for startTime and endTime
    @Temporal(TemporalType.TIME)
    String endTime;

    @JsonProperty("startDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // Specify the date format you are using for startDate
    @Temporal(TemporalType.DATE)
    String startDate;

    @JsonProperty("subjectID")
    Long subjectID;
    @JsonProperty("teacherID")
    Long teacherID;
    @JsonProperty("isApproved")
    boolean isApproved;


}
