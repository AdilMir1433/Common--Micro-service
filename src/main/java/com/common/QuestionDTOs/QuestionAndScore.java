package com.common.QuestionDTOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class QuestionAndScore {
    @JsonProperty("question")
    private String question;
    @JsonProperty("score")
    private int score;
}
