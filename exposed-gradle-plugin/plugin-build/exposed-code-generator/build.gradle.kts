plugins {
    java
    kotlin("jvm") apply true
//    kotlin("jvm") version "1.3.72"
}

repositories {
    mavenCentral()
    jcenter()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    // exposed
    implementation("org.jetbrains.exposed", "exposed-core", "0.26.1")
    implementation("org.jetbrains.exposed", "exposed-dao", "0.26.1")
    implementation("org.jetbrains.exposed", "exposed-jdbc", "0.26.1")
    implementation("org.jetbrains.exposed", "exposed-java-time", "0.26.1")

    // schemacrawler
    implementation("us.fatehi:schemacrawler:16.9.3")
    implementation("us.fatehi:schemacrawler-mysql:16.9.3")
    implementation("us.fatehi:schemacrawler-sqlite:16.9.3")
    implementation("us.fatehi:schemacrawler-postgresql:16.9.3")

    // utils
    implementation("org.apache.commons", "commons-text", "1.8")
    implementation("com.github.Erdos-Graph-Framework:Erdos:v1.0")
    implementation("com.facebook.presto", "presto-parser", "0.239")


    // kotlin code generation/testing
    implementation("com.squareup:kotlinpoet:1.6.0")
    implementation("com.github.tschuchortdev:kotlin-compile-testing:1.2.9")

    // yaml config files
    implementation("com.sksamuel.hoplite:hoplite-core:1.3.3")
    implementation("com.sksamuel.hoplite:hoplite-yaml:1.3.3")

    // logging
    implementation("org.slf4j:slf4j-api:1.7.30")
    implementation( "ch.qos.logback", "logback-classic", "1.2.3")

    // database drivers
    implementation("com.h2database", "h2","1.4.199")
    implementation("org.postgresql:postgresql:42.2.2")
    implementation("org.xerial:sqlite-jdbc:3.32.3")
    implementation("mysql", "mysql-connector-java", "8.0.20")
    implementation("com.opentable.components", "otj-pg-embedded", "0.12.0")
    implementation("org.testcontainers", "testcontainers", "1.14.3")
    implementation("org.testcontainers", "mysql", "1.14.3")
    implementation("org.mariadb.jdbc", "mariadb-java-client", "2.6.0")
    implementation("mysql", "mysql-connector-java", "5.1.49")
    implementation("com.impossibl.pgjdbc-ng", "pgjdbc-ng", "0.8.4")
    implementation("com.oracle.database.jdbc", "ojdbc8", "12.2.0.1")
    implementation("com.microsoft.sqlserver", "mssql-jdbc", "8.2.2.jre8")

    testImplementation("junit", "junit", "4.12")
    testImplementation("org.assertj:assertj-core:3.16.1")
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