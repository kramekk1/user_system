package com.kramekk1.userSystem;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.getAll();
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(() -> new IllegalArgumentException("User with this email not exist"));
    }

    public void add(User user) {
        userRepository.add(user);
    }

    public void deleteByEmail(String email) {
        User user = userRepository.findByEmail(email).orElseThrow(() -> new IllegalArgumentException("User with this email not exist"));
        userRepository.delete(user);
    }

    public void editByEmail(String email, User newUser) {
        User user = userRepository.findByEmail(email).orElseThrow(() -> new IllegalArgumentException("User with this email not exits"));
        userRepository.edit(user, newUser);
    }
}
