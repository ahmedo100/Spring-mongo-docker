package com.cartoflow.cartoflowspring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

  @Autowired
  private UserRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    repository.deleteAll();

    // save a couple of Users
    repository.save(new User("Alice", "Smith"));
    repository.save(new User("Bob", "Smith"));

    // fetch all Users
    System.out.println("Users found with findAll():");
    System.out.println("-------------------------------");
    for (User User : repository.findAll()) {
      System.out.println(User);
    }
    System.out.println();

    // fetch an individual User
    System.out.println("User found with findByFirstName('Alice'):");
    System.out.println("--------------------------------");
    System.out.println(repository.findUserByFirstName("Alice"));

    System.out.println("Users found with findByLastName('Smith'):");
    System.out.println("--------------------------------");
    for (User User : repository.findUserByLastName("Smith")) {
      System.out.println(User);
    }

  }

}