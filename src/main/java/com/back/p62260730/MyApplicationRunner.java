package com.back.p62260730;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("hihi");
    }
}
