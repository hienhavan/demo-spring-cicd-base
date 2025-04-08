package com.example.demo_spring_cicd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class DemoSpringCicdApplicationTests {
    @Test
    void contextLoads() {
        int numberTest = 3;
        Assertions.assertEquals(3, numberTest);
    }
}
