package com.jwtexample.JwtAuth.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {

    private String token;

    public JwtResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
