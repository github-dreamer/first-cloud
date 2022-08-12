package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;

@SpringBootTest
class CloudApiCommonsApplicationTests {

    @Test
    void contextLoads() {

        if (System.out.printf("A") == null) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }

        if (new Object(){
            @Override
            public boolean equals(Object obj) {
                System.out.print("A");
                return false;
            }
        }.equals("")) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }

}
