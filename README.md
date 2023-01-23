# Basic update for tasks

## Authors

* **[Resume](https://c4cydonia-vercel-blog.vercel.app/resume-qa)**
* **[LinkedIn](https://www.linkedin.com/in/gustavo-leyva-b9493846/)**
* **[Github](https://github.com/gusleyva)**

### Reference Documentation

* Get all tasks
```aidl
curl --location --request GET 'localhost:8080/tasks'
```
* Update valid tasks
 ```aidl
curl --location --request PUT 'localhost:8080/tasks/1' \
--header 'Content-Type: application/json' \
--data-raw '{
    "description": "new description",
    "priority": 2
}'
```
* Not found
```aidl
curl --location --request PUT 'localhost:8080/tasks/10000' \
--header 'Content-Type: application/json' \
--data-raw '{
    "priority": 255
}'
```
* Bad request
```aidl
curl --location --request PUT 'localhost:8080/tasks/1' \
--header 'Content-Type: application/json' \
--data-raw '{
    "priority": 255
}'
```

## Built With

* [Spring-boot](https://spring.io/projects/spring-boot) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [H2](h2database.com/html/main.html) - In-memory database
* [Swagger](h2database.com/html/main.html) - Generate API-Docs
* 
## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details