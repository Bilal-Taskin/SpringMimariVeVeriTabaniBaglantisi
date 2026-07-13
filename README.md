# Spring Boot & Spring Data JPA - Katmanlı Mimari Projesi

Bu proje, **Spring Boot** ve **Spring Data JPA** kullanılarak, kurumsal yazılım geliştirme standartlarına uygun **Katmanlı Mimari (Layered Architecture)** yapısında geliştirilmiş başlangıç seviyesi bir RESTful API uygulamasıdır. 

Projede veri tabanı yönetim aracı olarak **DBeaver (PostgreSQL)**, API testleri ve veri manipülasyonu için ise **Postman** kullanılmıştır.

---

## 🛠️ Kullanılan Teknolojiler

* **Java 21** / **Spring Boot 3.x**
* **Spring Web** (REST API Endpoint yönetimi için)
* **Spring Data JPA** (Veri tabanı CRUD işlemleri için)
* **PostgreSQL** (İlişkisel Veri Tabanı)
* **DBeaver** (Veri Tabanı Arayüz Yönetimi)
* **Postman** (API Test Aracı)


## 📂 Proje Dizin Yapısı (Katmanlı Mimari)

Proje, sorumlulukların ayrılması (Separation of Concerns) prensibine uygun olarak tasarlanmıştır:

```text
src/main/java/com/example/demo/
│
├── controller/         # Dış dünyadan gelen HTTP isteklerini (Request) karşılayan katman
│   ├── IStudentController.java
│   └── impl/
│       └── StudentControllerImpl.java
│
├── services/           # İş mantığının (Business Logic) yürütüldüğü katman
│   ├── IStudentService.java
│   └── impl/
│       └── StudentServiceImpl.java
│
├── repository/         # Veri tabanı sorgularının (JPA) yönetildiği katman
│   └── StudentRepository.java
│
├── entities/           # Veri tabanındaki tablolara karşılık gelen varlık (Entity) sınıfları
│   └── Student.java
│
└── DemoApplication.java # Uygulamanın başlangıç noktası (Main sınıfı)



