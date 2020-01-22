import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version Versions.kotlin
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    testImplementation(Deps.kotlin_test)
}

allprojects {
    group = "io.github.dector.${project.name}"
    version = "0.1-SNAPSHOT"

    repositories {
        jcenter()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
