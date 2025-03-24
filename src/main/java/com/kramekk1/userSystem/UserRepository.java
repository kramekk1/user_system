package com.kramekk1.userSystem;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final List<User> userList;

    public List<User> getAll() {
        return new ArrayList<>(userList);
    }

    public Optional<User> findByEmail(String email) {
        return userList.stream()
                .filter(user -> email.equals(user.getEmail()))
                .findFirst();
    }

    public void add(User user) {
        userList.add(user);
    }

    public void delete(User user) {
        userList.removeIf(user::equals);
    }

    public void edit(User user, User newUser) {
        user.setEmail(newUser.getEmail());
        user.setPassword(newUser.getPassword());
        user.setName(newUser.getName());
        user.setLastName(newUser.getLastName());
        user.setAge(newUser.getAge());
        user.setBirthday(newUser.getBirthday());
    }
}
