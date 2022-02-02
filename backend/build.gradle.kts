repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(files("libs/lib.jar"))
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>() {
    kotlinOptions.freeCompilerArgs += "-Xenhance-type-parameter-types-to-def-not-null"
}