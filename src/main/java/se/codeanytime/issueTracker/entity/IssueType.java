package se.codeanytime.issueTracker.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public enum IssueType {

    @JsonProperty("low")LOW,
    @JsonProperty("medium") MEDIUM,
    @JsonProperty("high")HIGH;


}
