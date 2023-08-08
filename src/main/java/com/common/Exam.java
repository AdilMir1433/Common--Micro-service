package com.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Time;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Exam {
    @JsonProperty("examTitle")
    String examTitle;
    @JsonProperty("startTime")
    Time startTime;
    @JsonProperty("endTime")
    Time endTime;
    @JsonProperty("startDate")
    Date startDate;
    @JsonProperty("subjectID")
    Long subjectID;
    @JsonProperty("teacherID")
    Long teacherID;
    @JsonProperty("isApproved")
    boolean isApproved;
}
// Compare this snippet from Exam Service/src/main/java/com/example/examservice/entities/Question.java: