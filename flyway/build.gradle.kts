import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    // https://plugins.gradle.org/plugin/org.flywaydb.flyway
    id("org.flywaydb.flyway") version "9.10.1"
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/org.postgresql/postgresql/42.5.1
    runtimeOnly("org.postgresql:postgresql:42.5.0")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
