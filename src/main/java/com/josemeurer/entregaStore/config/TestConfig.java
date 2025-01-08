package com.josemeurer.entregaStore.config;

import com.josemeurer.entregaStore.model.User;
import com.josemeurer.entregaStore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Date;

@Configuration
@Profile({"test"})
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        //Users
        User user1 = new User(null, "José", "Meurer", "jose@gmail.com", "12345678", "12345678911");
        userRepository.save(user1);
    }
}
