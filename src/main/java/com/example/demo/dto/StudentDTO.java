package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    private Long id; // Listelemede hangi öğrenci olduğunu bilsin diye ID ekliyoruz.
    private String name;
    private String surname;
    // birthDate alanını buraya YAZMIYORUZ! Böylece kullanıcı asla göremeyecek.
}