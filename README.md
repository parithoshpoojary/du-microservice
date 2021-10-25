[![Spring](https://img.shields.io/badge/Technology-Spring-brightgreen)](https://spring.io/)

## DU - Microservice

`DU - Microservice` is a basic microservice design for an application that returns information of an 
institution's department's and its user's.

For the microservice cloud-config-server **[click here](https://github.com/parithoshpoojary/ms-config-server).**


## Microservice Architecture

<p align="center">
  <img src="https://user-images.githubusercontent.com/43223792/138645890-e2a5a3df-3114-4021-b0eb-2fa334c039c7.png" width="750" title="Microservice Architecture">
</p>

* The **`department-service`** folder contains the department-microservice, that is responsible for ***save*** and ***get*** functions of the department.
* The **`user-service`** folder contains the user-microservice, that is responsible for ***save*** and ***get*** functions of the users.
* The **`cloud-gateway`** folder contains the gateway-microservice, that is responsible for the ***routing part***. It routes the users request to the appororiate microservice.
* The **`service-registry`** folder contains the ***eureka server*** to managae and maintain the whole architecture.
* The **`cloud-config-server`** folder contains the ***configuration file***, that is connected with a github repository. This repository contains all the common configurations required by the microservices. 


## Getting Started

Libraries used are: **[Spring](https://spring.io/)**, **[Eureka](https://spring.io/guides/gs/service-registration-and-discovery/)**, **[Zipkin](https://zipkin.io/)**, **[Slueth](https://spring.io/projects/spring-cloud-sleuth)**.  

* #### Clone the repo

```bash
  git clone https://github.com/parithoshpoojary/du-microservice.git
  cd du-microservice
```
##### **Note:** You would be presented with the list of folders. Now using `cd` command navigate and open each folder in `your prefered IDE`. 

The database used in the project is `H2`, you can use any other of your choice, just add in the appropiate connection and configuration details in the `application.yml` file.

Before running the project, install the below mentioned.

* #### Install Zipkin Server

***Using Docker***
```bash
    docker run -d -p 9411:9411 openzipkin/zipkin
```
***Java***
```bash
    curl -sSL https://zipkin.io/quickstart.sh | bash -s
    java -jar zipkin.jar
```
Run all the projects in the given order: `service-registry` -> `cloud-config-server` -> `department-service` -> `user-service` -> `cloud-gateway`.

Naviagte to `http://localhost:8761` for a web based GUI to check the status of all the services.

To check the log info for any service, naviagte to `http://127.0.0.1:9411/` and select the desired service.

## Contributing

To contribute to the repository, follow the below given steps:

1. Fork it
2. Create your feature branch `(git checkout -b my-new-feature)`.
3. Commit your changes `(git commit -m 'Add some feature')`.
4. Push your branch `(git push origin my-new-feature)`.
5. Create a new Pull Request.

