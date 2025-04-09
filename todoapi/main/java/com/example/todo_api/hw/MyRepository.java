package com.example.todo_api.hw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyRepository {
    public void repositoryMethod() {
        System.out.println("repository");
    }
}
