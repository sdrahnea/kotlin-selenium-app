## Selenium usgin Kotlin

# Idea of this project
This project is a combination of two tehcnologies: kotlin and silenium.
The idea is to provide a tool for non-IT guys to make the automation for front-end layer of application.
How does it works? From one hand you have selenium which is used to automate the test cases and required programming skills and knowloedge. To handle this thing you need a QA automation guy to join to your team, but this long procees :), and requires more that just money and time. Than, why do not have a tool where test cases is just JSON files and persons which does not selenium, does not have skills to program can just edit the files accordingly to required business cases ?!

## Summary
1. Getting Started (Prerequisites, Add test cases)
2. Running the app
3. Built With
4. Do you have any issue?
5. Contributing
6. Versioning
7. Authors
8. License
9. Donation

## 1. Getting Started

Clone or download a copy of this project.

### 1.1 Prerequisites

This project requires Java 1.8+ and Gradlew.

### 1.2 Add test cases
The projects hve the following structure:
* resources/drivers - to store all drivers for the target browsers (Mozila, IE, Chrome)
* resources/test-cases - to store all test cases.
Test cases folder can contains multiple folders, this is the way how to group test cases.

Typically one test cases is one file, The format of is JSON, with the following structure:
* name - test case nanme;
* steps - step by step scenario;
* steps.name - name of the action;
* steps.type - one of the following types: NAVIGATE, SEND_KEYS, CLICK;
* steps.value - the value like URL, emails, names, etc, and depends on the choosen type;
* steps.xpath - full path of UI element address.

## 2. Running the app

To run:

```
$ ./gradlew bootRun
```

## 3. Built With

* [Java](https://www.java.com/en/download/) - Java technology allows you to work and play in a secure computing environment. Java allows you to play online games, chat with people around the world, calculate your mortgage interest, and view images in 3D, just to name a few.
* [Kotlin](https://kotlinlang.org/) - A modern programming language that makes developers happier. Open source forever.
* [Selenium](https://www.selenium.dev/) - Primarily it is for automating web applications for testing purposes, but is certainly not limited to just that. Boring web-based administration tasks can (and should) also be automated as well.
* [Gradle](https://gradle.org/) - From mobile apps to microservices, from small startups to big enterprises, Gradle helps teams build, automate and deliver better software, faster.
* [Spring Security](https://spring.io/projects/spring-security) - Spring Security is a powerful and highly customizable authentication and access-control framework. It is the de-facto standard for securing Spring-based applications.
* [Spring Boot](https://spring.io/projects/spring-boot) - Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".
* [Spring Data](https://spring.io/projects/spring-data) - Spring Data’s mission is to provide a familiar and consistent, Spring-based programming model for data access while still retaining the special traits of the underlying data store.
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa) - Spring Data JPA, part of the larger Spring Data family, makes it easy to easily implement JPA based repositories. This module deals with enhanced support for JPA based data access layers. It makes it easier to build Spring-powered applications that use data access technologies.

## 4. Do you have any issue?

Please contact via LinkedIn account or drop an email (read [LICENSE.md](LICENSE.md) file).

## 5. Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## 6. Versioning

We use [SemVer](http://semver.org/) for versioning.

## 7. Authors

* **Sergiu Drahnea** - *Initial work* - [LinkedIn](https://www.linkedin.com/in/sergiu-drahnea)

## 8. License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## 9. Donation
* [PayPal](https://www.paypal.me/sdrahnea) - any donation is welcomed in case that you was pleased with this work :p

