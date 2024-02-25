# Pengantar

School service dirancang menggunakan arsitektur microservice yang terdiri dari service School, Attendance, Gateway, dan Registry. Arsitektur microservice ini didukung dengan penggunaan Spring cload, Eureka Service Discovery dan Api Gateway. Penulisan pada program juga sudah menerapkan konsep clean-architecture.

<p align="center">
  <img src="https://github.com/Iman20/school-service/blob/main/assets/diagram-architecture.png" />
     <p align="center">
      <i>Diagram Arsitektur</i>
   </p>
</p>

Pada sistem ini, terdapat empat feature utama diantaranya :
1. Tambah master school
2. Tambah master classroom
3. Tambah master student
4. Absensi siswa  

Dalam perancangan sistem ini, terdapat dua buah database yaitu database school dan attendance. 

<p align="center">
  <img src="https://github.com/Iman20/school-service/blob/main/assets/database-school.png" />
     <p align="center">
      <i>Database School</i>
   </p>
</p>

<p align="center">
  <img src="https://github.com/Iman20/school-service/blob/main/assets/database-attendance.png" />
     <p align="center">
      <i>Database Attendance</i>
   </p>
</p>

Sebelum memulai, terdapat beberapa tool yang perlu disiapkan untuk menjalankan service ini :
1. IDE (Intellij, etc)
2. JDK 17
3. Postgresql
4. Postman

## Panduan menjalankan service

1. Clone project github `https://github.com/Iman20/school-service.git`
2. Buka project menggunakan IDE Intellij atau sejenisnya
3. Buat dua buah database postgresql baru pada local database dengan nama `school` dan `attendance` 
		
		jdbc:postgresql://localhost:5432/attendance
		jdbc:postgresql://localhost:5432/school
		
4. Jalankan service secara berurutan
4.1. /service-registry
4.2. /school-service
4.3. /attendance-service
4.4. /gateway-service

6. Service gateway akan berjalan pada `http://localhost:8080`.
7. Service school akan berjalan pada `http://localhost:8080/school`.
8. Service attendance akan berjalan pada `http://localhost:8080/attendance`.
9. Service registri akan berjalan pada `http://localhost:8761`.

<p align="center">
  <img src="https://github.com/Iman20/school-service/blob/main/assets/service-registry.png" />
     <p align="center">
      <i>Eureka Discovery</i>
   </p>
</p>

10. Import collection postman `SCHOOL-SERVICE.postman_collection.json`

<p align="center">
  <img src="https://github.com/Iman20/school-service/blob/main/assets/document-postman.png" />
     <p align="center">
      <i>Document Postman-API</i>
   </p>
</p>

12. Sistem absensi bisa berjalan setelah master data ditambahkan secara berurutan school -> classroom -> student -> attendance.
13. Testing bisa dilakukan sesuai dengan dokumen postman yang tersedia.

