package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Student yulia = new Student("Yulia", "Kushneryk", "IO-33");
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(yulia);
        System.out.println(s);
    }
}