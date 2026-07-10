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

---

<img width="1918" height="1078" alt="Screenshot 2026-07-10 175305" src="https://github.com/user-attachments/assets/4aadad86-4896-43e0-b849-f29e2b5d5c7c" />
<img width="1906" height="1025" alt="Screenshot 2026-07-10 175346" src="https://github.com/user-attachments/assets/d62c10bb-ed22-4efe-92f3-fce09a02020f" />
<img width="1897" height="1003" alt="Screenshot 2026-07-10 175338" src="https://github.com/user-attachments/assets/79706891-78a2-485e-84a3-94826762d3ce" />
<img width="1907" height="1078" alt="Screenshot 2026-07-10 180306" src="https://github.com/user-attachments/assets/b3969f6a-b16e-42c3-9958-e886c0a76611" />


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



