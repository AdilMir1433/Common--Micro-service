package com.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Time;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Exam {
    @JsonProperty("id")
    Long id;

    @JsonProperty("examTitle")
    String examTitle;

    @JsonProperty("startTime")
    @DateTimeFormat(pattern = "HH:mm") // Specify the date format you are using for startTime and endTime
    @Temporal(TemporalType.TIME)
    Date startTime;

    @JsonProperty("endTime")
    @DateTimeFormat(pattern = "HH:mm") // Specify the date format you are using for startTime and endTime
    @Temporal(TemporalType.TIME)
    Date endTime;

    @JsonProperty("startDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd") // Specify the date format you are using for startDate
    @Temporal(TemporalType.DATE)
    Date startDate;

    @JsonProperty("subjectID")
    Long subjectID;
    @JsonProperty("teacherID")
    Long teacherID;
    @JsonProperty("isApproved")
    boolean isApproved;
}
// Compare this snippet from Exam Service/src/main/java/com/example/examservice/entities/Question.java: