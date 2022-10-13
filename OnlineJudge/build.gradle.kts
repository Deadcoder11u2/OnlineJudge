/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    java
    `maven-publish`
    id("org.springframework.boot") version "2.7.4"
    id("io.spring.dependency-management") version "1.0.14.RELEASE"
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:2.7.0")
    implementation("commons-io:commons-io:2.11.0")
    implementation("org.springframework.boot:spring-boot-starter-data-redis:2.7.0")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:3.1.3")
    implementation("org.springframework.boot:spring-boot-starter-webflux:2.7.0")
    runtimeOnly("org.springframework.boot:spring-boot-devtools:2.7.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.7.0")
    testImplementation("io.projectreactor:reactor-test:3.4.18")
}

group = "io.srikanth"
version = "0.0.1-SNAPSHOT"
description = "OnlineJudge"
java.sourceCompatibility = JavaVersion.VERSION_1_8

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}
