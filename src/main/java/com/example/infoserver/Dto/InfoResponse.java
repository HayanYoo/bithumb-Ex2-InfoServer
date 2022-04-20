package com.example.infoserver.Dto;

import lombok.Getter;

@Getter
public class InfoResponse {
    private String job;

    public InfoResponse(String job){
        this.job = job;
    }
}
