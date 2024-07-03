### Шаги по установке и запуску

1. **Клонирование репозитория**
   ```bash
   git clone https://github.com/sarinzhan/to-do-list

3. ****Убедитесь что у вас установлен Docker Desktop**
   
5. **Откройте проект в intelij idea**
6. **Откройте терминал**
   ```bash
   mvn clean package
   
7. **Для запуска приложения на порту 8080 введите**
   ```bash
   docker-compose up

8. **Для остановки приложения**
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

