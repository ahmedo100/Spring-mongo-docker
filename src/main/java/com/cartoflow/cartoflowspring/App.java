package com.cartoflow.cartoflowspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.cartoflow.cartoflowspring"})

public class App implements CommandLineRunner{
  
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

@Override
  public void run(String... args) throws Exception {
    System.out.println("Application is running");
  }
}

