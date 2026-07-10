package com.example.demo.repository;

import com.example.demo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository: Bu interface'in bir veri erişim katmanı (Data Access) olduğunu Spring'e bildirir.
@Repository
// JpaRepository<Student, Long>: Spring Data JPA'dan miras alıyoruz. 
// 'Student' hangi tabloya hizmet edeceğini, 'Long' ise o tablonun Primary Key (@Id) tipini belirtir.
public interface StudentRepository extends JpaRepository<Student, Long> {
    // İçine hiçbir metot yazmamıza gerek yok. 
    // JpaRepository bize arka planda save(), findAll(), findById(), delete() gibi tüm hazır metotları verecek.
}