// Paket adın artık tam olarak java altındaki com.entities yolunu gösteriyor.
package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// @Entity: Bu sınıfın veri tabanında bir tabloya (SQL tablosuna) karşılık geldiğini Spring'e söyler.
@Entity
// @Table: DBeaver'da oluşacak tablonun adını "student" olarak belirliyoruz.
@Table(name = "student")
public class Student {

    // @Id: Bu alanın tablonun benzersiz anahtarı (Primary Key) olduğunu belirtir.
    @Id
    // @GeneratedValue: ID'nin elle girilmeyip veri tabanı tarafından otomatik (1,2,3...) artırılacağını söyler.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;

    // --- Boş Constructor ---
    // Spring Data JPA, veri tabanından verileri çekerken arka planda bu boş constructor'ı kullanır.
    public Student() {
    }

    // --- Parametreli Constructor ---
    // Kod içinde yeni bir öğrenci nesnesi üretirken kolaylık sağlar.
    public Student(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    // --- Getter ve Setter Metotları ---
    // Kapsülleme (Encapsulation) gereği, private değişkenlere dışarıdan güvenli erişim sağlar.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}