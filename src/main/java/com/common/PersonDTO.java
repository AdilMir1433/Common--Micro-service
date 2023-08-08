package com.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonDTO {

    @JsonProperty("Id")
    Long Id;
    @JsonProperty("name")
    String name;
    @JsonProperty("email")
    String email;

}
