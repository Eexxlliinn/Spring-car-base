package com.example.springcarbase.forms;

import com.example.springcarbase.entities.Request;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class RequestForm {

    private String request_id;

    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date requestDate;

    private String distance;

    private String requiredCapacity;

    private String requiredType;

    private String status;

    public Request toRequest() {
        return new Request(description, requestDate, distance, requiredCapacity, requiredType, status);
    }
}
