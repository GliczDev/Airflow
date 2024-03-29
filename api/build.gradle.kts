plugins {
    id("java")
}

group = "me.glicz"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
    implementation("org.jetbrains:annotations:20.1.0")
}