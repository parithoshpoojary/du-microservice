[![Spring](https://img.shields.io/badge/Technology-Spring-brightgreen)](https://spring.io/)

## DU - Microservice
**_A micro-services architecture powered by Spring Cloud, Docker, H2._**

`DU - Microservice` is a basic microservice application that returns information of an institution's department and its user's.


### Functional Microservices
* **Product Catalog Microservice**
* **Cart Microservice**

### Infrastructure Microservices
* **Global Configuration Microservice**
* **Service Registration & Discovery Miroservice**
* **API Gateway**

For the microservice cloud-config-server **[click here](https://github.com/parithoshpoojary/ms-config-server).**


## Microservice Architecture

<p align="center">
  <img src="https://user-images.githubusercontent.com/43223792/138645890-e2a5a3df-3114-4021-b0eb-2fa334c039c7.png" width="950" title="Microservice Architecture">
</p>

* The **`department-service`** folder contains the department-microservice, that is responsible for ***save*** and ***get*** functions of the department.
* The **`user-service`** folder contains the user-microservice, that is responsible for ***save*** and ***get*** functions of the users.
* The **`cloud-gateway`** folder contains the gateway-microservice, that is responsible for the ***routing part***. It routes the users request to the appororiate microservice.
* The **`service-registry`** folder contains the ***eureka server*** to managae and maintain the whole architecture.
* The **`cloud-config-server`** folder contains the ***configuration file***, that is connected with a github repository. This repository contains all the common configurations required by the microservices. 


## Getting Started

### Prerequisites
* **_JDK 11_** - Install JDK 11 version from, https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html
* **_Postman_** - Install Postman on your machine from, https://www.postman.com/downloads
* **_Docker Toolbox_** - Install Docker Toolbox on your machine from, https://www.docker.com/products/docker-toolbox
* **_IntelliJ IDEA Community Edition [Optional]_** - Install IntelliJ IDEA Community Edition from, https://www.jetbrains.com/idea/#chooseYourEdition

### Clone the repo

```bash
  git clone https://github.com/parithoshpoojary/du-microservice.git
  cd du-microservice
```
##### **Note:** You would be presented with the list of folders. Now using `cd` command navigate and open each folder in `your prefered IDE`. 

The database used in the project is `H2`, you can use any other of your choice, just add in the appropiate connection and configuration details in the `application.yml` file.

Before running the project, install the below mentioned.

#### Install Zipkin Server
```sh
  docker run -d -p 9411:9411 openzipkin/zipkin
```

### Prodcut Catalog Microservice
#### Overview
Department Microservice manages departments of the institution. This microservice is built as Spring Boot application with H2 as In-Memory store for product information.


#### REST API
Department Catalog REST API supports following opertations,

Method | URI | Description |
--- | --- | --- |
`GET` | **/DeptId/{id}* | Fetch department information based on id |
`POST` | **/save* | Creates or updates existing deaprtment |

### User Microservice
#### Overview
User Microservice manages the users functionality of the institution. This microservice is built as Spring Boot application with H2 as In-Memory store for user information.

#### REST API
User REST API supports following opertations,

Method | URI | Description |
--- | --- | --- |
`GET` | **/{id}* | Fetches user by id along with his/her department details | 
`POST` | **/save* | Creates or updates users | 


Run `maven install` and the run all the spring projects in the given order: `service-registry` -> `cloud-config-server` -> `department-service` -> `user-service` -> `cloud-gateway`.

Naviagte to `http://localhost:8761` for a web based GUI to check the status of all the services.

To check the log info for any service, naviagte to `http://127.0.0.1:9411/` and select the desired service.

