package com.codeacademy.thymeleaf_blog.entities;

import com.codeacademy.thymeleaf_blog.util.PhoneNumber;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@NoArgsConstructor
@Data
@Table(name = "test_validation") // reikalinga tik, kad parodyti kaip veikia validacijos
public class TestUserValidation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "User's name cannot be empty.")
    @Size(min = 5, max = 250)
    private String fullName;

    @NotEmpty(message = "User's email cannot be empty.")
    @Size(min = 7, max = 320)
    @Email
    private String email;

    @NotNull(message = "User's age cannot be null.")
    @Min(value = 18)
    private Integer age;

    private String country;

    @PhoneNumber(message = "Phone number is not valid.")
    private String phoneNumber;
}
