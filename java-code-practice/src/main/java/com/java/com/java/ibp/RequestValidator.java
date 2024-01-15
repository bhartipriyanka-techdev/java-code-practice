package com.java.com.java.ibp;

import java.util.ArrayList;
import java.util.List;

public class RequestValidator {

    private static List<String> validTokens = new ArrayList<>();

    static {
        validTokens.add("et5lu8i9p1q7");
        validTokens.add("r5b019lmlp09");
    }

    public static String validateRequest(String method, String url, String token, String csrfToken, String id, String name) {
        if ("GET".equals(method)) {
            if (validTokens.contains(token)) {
                return "VALID, id, " + id + ", name, " + name;
            } else {
                return "INVALID";
            }
        } else if ("POST".equals(method)) {
            if (validTokens.contains(token) && csrfToken.matches("[a-zA-Z0-9]+") && csrfToken.length() >= 8) {
                return "VALID, id, " + id + ", name, " + name;
            } else {
                return "INVALID";
            }
        } else {
            return "INVALID";
        }
    }

    public static void main(String[] args) {
        String result1 = validateRequest("GET", "https://example.com/?token=et5lu8i9p1q7&id=2e3rt&name=alex", "et5lu8i9p1q7", null, "2e3rt", "alex");
        String result2 = validateRequest("POST", "https://example.com/?token=r5b019lmlp09&csrf=ia+09&id=u78we&name=evan", "r5b019lmlp09", "ia+09", "u78we", "evan");

        System.out.println("Sample Case 1: " + result1);
        System.out.println("Sample Case 2: " + result2);
    }
}

