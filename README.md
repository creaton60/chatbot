# chatbot
* Chatbot based in Spring Akka
* Chatbot Builder Api Server 
* Test ChatBot Chat Message

## Usage
### Gradle

```
dependencies {
	compile('org.springframework.boot:spring-boot-starter-web')
	testCompile('org.springframework.boot:spring-boot-starter-test')

	testCompile group: 'junit', name: 'junit', version: '4.12'

	compile group: 'com.typesafe.akka', name: 'akka-actor_2.12', version: '2.5.10'

	//Spring Data JPA
	compile 'org.springframework.data:spring-data-jpa:1.11.9.RELEASE'

	// Hibernate
	compile 'org.hibernate:hibernate-core:5.2.4.Final'

	// Jackson
	compile 'com.fasterxml.jackson.core:jackson-core:2.8.0'
	compile 'com.fasterxml.jackson.core:jackson-databind:2.8.0'
	compile 'com.fasterxml.jackson.core:jackson-annotations:2.8.0'
	compile 'com.fasterxml.jackson.datatype:jackson-datatype-hibernate4:2.8.0'

	//mysql
	compile("org.springframework:spring-jdbc:+")
	compile("commons-dbcp:commons-dbcp:1.4")
	compile("mysql:mysql-connector-java:5.0.8")

	//Guava
	compile 'com.google.guava:guava:24.1-jre'

	//AspectJ (for Transactional annotation)
	compile 'org.aspectj:aspectjweaver:1.8.2'

}

```

## Built With

* [Gradle](https://gradle.org/) - Dependency Management

## Wiki

* Please Read This Project Wiki

##

## Authors

* **Creaton 60(Reactor)**

## License

Copyright (c) 2018 "reactor" dongkyu lee Licensed under the MIT license.
