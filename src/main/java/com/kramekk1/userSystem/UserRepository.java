package com.kramekk1.userSystem;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final List<User> userList;

    public List<User> getAll() {
        return new ArrayList<>(userList);
    }
}
