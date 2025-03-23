package com.kramekk1.userSystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class User {
    private String email;
    private String password;
    private String name;
    private String lastName;
    private int age;
    private LocalDate birthday;
}
