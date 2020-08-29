package ru.eremenko.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication .class, args);
        BrowserOpener opener = new BrowserOpener();
        opener.openLinkInBrowser("http://localhost:8080/users");
    }
}
