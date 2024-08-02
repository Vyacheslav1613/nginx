package ru.netology.restregistr.repository;

import org.springframework.stereotype.Repository;
import ru.netology.restregistr.en.Authorities;

import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if ("admin".equals(user) && "admin".equals(password)) {
            return List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if ("user".equals(user) && "user".equals(password)) {
            return List.of(Authorities.READ);
        } else {
            return List.of();
        }
    }
}