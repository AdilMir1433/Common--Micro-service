package com.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ExamRecord {
    @JsonProperty("examName")
    private String examName;
    @JsonProperty("examID")
    private Long examID;
    @JsonProperty("total")
    private int total;
    @JsonProperty("questionsAndScores")
    private List<QuestionAndScore> questionsAndScores;

}
