# schedulerlock

This project shows how to use Shedlock spring library to implement a scheduler lock.
Know more about scheduler lock and how to create this project step by step in this article:
[Scheduler Lock Using Shedlock Spring](https://medium.com/@marcoscarneirolima/scheduler-lock-using-spring-shedlock-b9ac3e51a934)

## Run project
### With Gradle
Clone the repository:
```
git clone https://github.com/MarcosCarneiro/schedulerlock.git
```

Enter the project:
```
cd ./schedulerlock
```

Run:
```
./gradlew bootRun
```

### With Docker:
Clone the repository:
```
git clone https://github.com/MarcosCarneiro/schedulerlock.git
```

Enter the project:
```
cd ./schedulerlock
```

Build the app:
```
./gradlew clean build
```

Build the image:
``` dockerfile
docker build -t marcoscl/shedlock .
```

Run the container:
``` dockerfile
docker run -d --name shedlock -p 8080:8080  marcoscl/shedlock
```