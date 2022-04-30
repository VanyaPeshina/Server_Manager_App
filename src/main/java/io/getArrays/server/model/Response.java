package io.getArrays.server.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Map;

// @Data generates getters for all fields, useful toString, hashCode and equals implementations
// that checks all non-transient fields
@Data
// creates a builder with all values of the instance
// SuperBuilder requires all superclasses to have also toBuilder = true;
// can be replaced by @Builder
@SuperBuilder
//if something is null in the response, it would not be included in the JSON file
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    protected LocalDateTime timeStep;
    protected int statusCode;
    protected HttpStatus status;
    protected String reason;
    protected String message;
    protected String developerMessage;
    protected Map<?, ?> data;
}
