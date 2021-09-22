package com.example.encoding.app;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import org.springframework.stereotype.Component;

//@Component
public class UTF8Encoder implements IEncoder {

    @Override
    public String encode(String string) {
        return URLEncoder.encode(string, StandardCharsets.UTF_8);
    }
}
