package com.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Transactional
@Getter
@Setter
public class SubjectDTO {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("subjectName")
    String subjectName;
}

