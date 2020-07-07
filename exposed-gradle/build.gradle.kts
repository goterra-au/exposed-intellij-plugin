plugins {
    java
    kotlin("jvm") version "1.3.72"
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("junit", "junit", "4.12")
    implementation("org.jetbrains.exposed", "exposed-core", "0.24.1")
    implementation("org.jetbrains.exposed", "exposed-dao", "0.24.1")
    implementation("org.jetbrains.exposed", "exposed-jdbc", "0.24.1")
    implementation("org.postgresql:postgresql:42.2.2")
    implementation("us.fatehi:schemacrawler:16.9.2")
    implementation("org.xerial:sqlite-jdbc:3.32.3")
    implementation("mysql", "mysql-connector-java", "8.0.20")
    implementation("org.apache.commons", "commons-text", "1.8")
    implementation("com.squareup:kotlinpoet:1.6.0")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}