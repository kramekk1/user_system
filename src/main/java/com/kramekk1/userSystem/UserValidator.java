package com.kramekk1.userSystem;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserValidator {

    public static void validateUser(User userToCheck) {
        if (userToCheck.getEmail() == null || userToCheck.getPassword() == null || userToCheck.getName() == null ||
                userToCheck.getLastName() == null || userToCheck.getAge() <= 0 || userToCheck.getBirthday() == null) {
            throw new IllegalArgumentException("One or more user data field is null/incorrect");
        }
    }

    public static void validateEmailDuplicate(String email, UserRepository userRepository) {
        if (userRepository.getAll().stream().anyMatch(user -> email.equals(user.getEmail()))) {
            throw new IllegalArgumentException("User with this email already exist");
        }
    }
}
