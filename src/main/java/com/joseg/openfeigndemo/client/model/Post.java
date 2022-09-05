package com.joseg.openfeigndemo.client.model;

import lombok.Data;

@Data
public class Post {
    private Long id;
    private Long userId;
    private String title;
    private boolean completed;
}