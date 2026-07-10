package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate; // Doğum günü için sadece Yıl-Ay-Gün tutan LocalDate sınıfını kullanıyoruz.

// @Entity ve @Table: Veri tabanı tablosu olduğunu belirtmek için (Değişmedi)
@Entity
@Table(name = "student")
// --- LOMBOK ANOTASYONLARI ---
@Data // Bu tek anotasyon arka planda tüm değişkenler için Getter, Setter, toString ve equals metotlarını otomatik üretir!
@NoArgsConstructor // Parametresiz (boş) constructor'ı otomatik üretir.
@AllArgsConstructor // Tüm değişkenleri içeren parametreli constructor'ı otomatik üretir.
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;

    // YENİ ALAN: Öğrencinin doğum tarihini tutacak değişken (Veri tabanında "birth_date" olarak kolonlaşır)
    private LocalDate birthDate;
}