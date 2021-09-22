package com.example.encoding.app;

import java.util.Base64;
import org.springframework.stereotype.Component;

@Component
public class Base64Encoder implements IEncoder {

    @Override
    public String encode(String string) {
        return Base64.getEncoder().encodeToString(string.getBytes());
    }
}
