import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

dependencies {
    implementation(Deps.kotlin.jdk8)
    implementation(Deps.kotlinx.html)

    testImplementation(Deps.kotlintest)
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.freeCompilerArgs = listOf(
        "-XXLanguage:+InlineClasses"
    )
}
