package com.stubservice.model;

import lombok.Data;

@Data
public class StubRequest {
    private String method;
    private String url;
    private int status;
    private String body;
    private String contentType;
}
