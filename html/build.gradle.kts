import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    testImplementation(Deps.kotlin_test)
}

tasks.withType<Test> {
    useJUnitPlatform()
}
