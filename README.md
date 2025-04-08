# Spring Boot CI-CI base with GitHub Actions

Dự án CI (Continuous Integration) cho ứng dụng Spring Boot sử dụng Gradle, thực hiện build, test và upload artifact mỗi khi có thay đổi lên nhánh `main` hoặc `master`.

---


## 📌 CI/CD là gì?

| Tên đầy đủ                  | Mô tả ngắn                                                                          |
|----------------------------|-------------------------------------------------------------------------------------|
| **CI** - Continuous Integration | Tự động kiểm tra, build và test mã nguồn mỗi khi có thay đổi, giúp phát hiện lỗi sớm |
| **CD** - Continuous Deployment | Tự động triển khai ứng dụng sau khi CI thành công, đảm bảo phần mềm luôn sẵn sàng |

**➡ Trong dự án này, bạn đang thực hiện phần CI: Build – Test – Tạo file JAR – Lưu artifact**

---

## 🔁 Luồng hoạt động CI trong dự án

1. **Push code hoặc tạo Pull Request** lên nhánh `main` hoặc `master`
2. GitHub Actions sẽ:
### CI
   - Tải mã nguồn về máy ảo (runner)
   - Cài môi trường Java
   - Build project bằng Gradle
   - Chạy test tự động
   - Lưu lại kết quả test (kể cả khi fail)
   - Upload file `.jar` nếu build thành công

---

## 📄 Cấu hình CI trong file `.github/workflows/demo-cicd.yml`
## 📚 Tổng kết

| 🧩 **Thành phần**       | 🛠️ **Vai trò**                                           |
|-------------------------|----------------------------------------------------------|
| `checkout`              | Lấy mã nguồn từ GitHub repository                        |
| `setup-java`            | Cài đặt môi trường Java cần thiết cho project            |
| `chmod gradlew`         | Cấp quyền thực thi cho file `gradlew` để chạy Gradle     |
| `gradle build`          | Biên dịch (build) ứng dụng và tạo file `.jar`            |
| `gradle test`           | Thực thi các unit test để kiểm tra tính đúng đắn         |
| `upload-artifact`       | Lưu lại kết quả test và file build để sử dụng sau này     |

