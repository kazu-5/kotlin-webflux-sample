import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import nu.studer.gradle.jooq.JooqEdition
import org.jooq.meta.jaxb.Logging
import org.jooq.meta.jaxb.Property
import org.jooq.meta.jaxb.ForcedType

plugins {
    // https://plugins.gradle.org/plugin/org.flywaydb.flyway
    id("org.flywaydb.flyway") version "9.10.1"
    // https://plugins.gradle.org/plugin/nu.studer.jooq
    id("nu.studer.jooq") version "7.1.1"
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
    // https://mvnrepository.com/artifact/org.postgresql/postgresql/42.5.0
    runtimeOnly("org.postgresql:postgresql:42.5.0")
    // jooq
    // https://www.jooq.org/doc/3.17/manual/getting-started/tutorials/jooq-in-7-steps/jooq-in-7-steps-step1/
    implementation("org.jooq:jooq:3.16.12")
    implementation("org.jooq:jooq-meta:3.16.12")
    implementation("org.jooq:jooq-codegen:3.16.12")
    // https://github.com/etiennestuder/gradle-jooq-plugin#gradle-kotlin-dsl-1
    jooqGenerator("org.postgresql:postgresql:42.5.0")
}

flyway {
    url = "jdbc:postgresql://localhost:5433/task_manage"
    user = "user"
    password = "password"
    cleanDisabled = false // https://flywaydb.org/documentation/configuration/parameters/cleanDisabled
}

// https://github.com/etiennestuder/gradle-jooq-plugin#gradle-kotlin-dsl-4
jooq {
    version.set("3.16.12")  // the default (can be omitted)
    edition.set(JooqEdition.OSS)  // the default (can be omitted)

    // https://github.com/etiennestuder/gradle-jooq-plugin/blob/main/example/use_kotlin_dsl/build.gradle.kts
    configurations {
        create("main") {
            jooqConfiguration.apply {
                logging = Logging.WARN
                jdbc.apply {
                    driver = "org.postgresql.Driver"
                    url = "jdbc:postgresql://localhost:5433/task_manage"
                    user = "user"
                    password = "password"
                    properties = listOf(
                        Property().apply {
                            key = "PAGE_SIZE"
                            value = "2048"
                        }
                    )
                }
                generator.apply {
                    name = "org.jooq.codegen.DefaultGenerator"
                    database.apply {
                        // https://www.jooq.org/doc/latest/manual/code-generation/codegen-advanced/codegen-config-database/codegen-database-name/
                        name = "org.jooq.meta.postgres.PostgresDatabase"
                        forcedTypes = listOf(
                            ForcedType().apply {
                                name = "varchar"
                                includeExpression = ".*"
                                includeTypes = "JSONB?"
                            },
                            ForcedType().apply {
                                name = "varchar"
                                includeExpression = ".*"
                                includeTypes = "INET"
                            }
                        )
                    }
                    generate.apply {
                        isDeprecated = false
                        isRecords = false
                        isImmutablePojos = false
                        isFluentSetters = false
                    }
                    target.apply {
                        packageName = "nu.studer.sample"
                        directory = "src/generated/jooq"
                    }
                    strategy.name = "org.jooq.codegen.DefaultGeneratorStrategy"
                }
            }
        }
    }
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
