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
public class QuestionDTO {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("question")
    private String question;
    @JsonProperty("option1")
    private String option1;
    @JsonProperty("option2")
    private String option2;
    @JsonProperty("option3")
    private String option3;
    @JsonProperty("option4")
    private String option4;
    @JsonProperty("answer")
    private String answer;
    @JsonProperty("examID")
    private Long examID;
    @JsonProperty("questionType")
    private QuestionType questionType;
    @JsonProperty("questionScore")
    private int questionScore;
}
