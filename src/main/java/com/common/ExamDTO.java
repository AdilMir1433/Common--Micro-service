package com.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExamDTO {
    @JsonProperty("examTitle")
    String examTitle;
    @JsonProperty("startTime")
    String startTime;
    @JsonProperty("endTime")
    String endTime;
    @JsonProperty("startDate")
    String startDate;
    @JsonProperty("subjectID")
    Long subjectID;
    @JsonProperty("teacherID")
    Long teacherID;
    @JsonProperty("isApproved")
    boolean isApproved;


}
