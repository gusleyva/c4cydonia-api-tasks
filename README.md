# Basic update for tasks

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
