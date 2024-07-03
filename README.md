### Шаги по установке и запуску

1. **Клонирование репозитория**
   ```bash
   git clone https://github.com/sarinzhan/to-do-list

3. ****Убедитесь что у вас установлен Docker Desktop**
4. **Запустить контейнер postgresql**
   ```bash
   docker run --name to-do-list -p 5432:5432 -e POSTGRES_PASSWORD=postgres -e POSTGRES_USER=postgres -e POSTGRES_DB=to-do-list -d postgres:10
   
   
5. **Откройте проект в intelij idea**
6. **Откройте терминал**
   ```bash
   mvn clean package
   
7. **После успешного создания jar файла.**
   ```bash
   docker-compose up
   **Который запустить приложение на порту 8080**

9. **Для остановки приложения**
    ```bash
   docker-compose down
   ```

После запуска приложения, Swagger доступен по адресу</br>
   ```bash
      http://localhost:8080/swagger-ui/index.html
   ```

По дефолту создается пользователь:</br>
username:admin</br>
password:admin

