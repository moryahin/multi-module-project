dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    implementation("org.jetbrains:annotations:22.0.0")
    implementation(files("libs/lib.jar"))

}

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>() {
//    kotlinOptions.freeCompilerArgs += "-Xenhance-type-parameter-types-to-def-not-null"
}