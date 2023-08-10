package com.common.ExamDTOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExamObject {
    @JsonProperty("id")
    Long id;

    @JsonProperty("examTitle")
    String examTitle;

    @JsonProperty("subjectID")
    Long subjectID;
    @JsonProperty("teacherID")
    Long teacherID;
    @JsonProperty("isApproved")
    boolean isApproved;
}
