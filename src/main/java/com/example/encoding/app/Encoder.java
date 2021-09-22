package com.example.encoding.app;

import org.springframework.stereotype.Component;

@Component
public class Encoder {

    private IEncoder encoder;

    public Encoder(IEncoder encoder) {
        this.encoder = encoder;
    }

    public void setEncoder(IEncoder encoder) {
        this.encoder = encoder;
    }

    public String encode(String string) {
        return encoder.encode(string);
    }
}
