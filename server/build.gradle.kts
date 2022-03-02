
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.google.protobuf.gradle.*;
buildscript {
    dependencies {
        classpath("com.google.protobuf:protobuf-gradle-plugin:0.8.13")
    }
}
plugins {
    id("org.springframework.boot") version "2.4.0"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
    id("com.google.protobuf") version "0.8.13"
    kotlin("jvm") version "1.5.30"
    kotlin("plugin.spring") version "1.5.30"
    id("org.jlleitschuh.gradle.ktlint") version "9.2.1"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
        google()
    }

    apply(plugin = "org.jlleitschuh.gradle.ktlint")
}


dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("io.grpc:grpc-protobuf:1.33.1")
    implementation("io.grpc:grpc-stub:1.33.1")
    implementation("io.grpc:grpc-netty:1.33.1")
    compileOnly("javax.annotation:javax.annotation-api:1.3.2")
    api("com.google.protobuf:protobuf-java-util:3.13.0")
    implementation("io.grpc:grpc-all:1.33.1")
    api("io.grpc:grpc-kotlin-stub:0.2.1")
    implementation("io.grpc:protoc-gen-grpc-kotlin:0.1.5")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
    implementation("com.google.protobuf:protobuf-kotlin:3.19.4")
    implementation("com.google.protobuf:protobuf-gradle-plugin:0.8.13")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

protobuf {
    protoc{
        artifact = "com.google.protobuf:protoc:3.10.1"
    }

    generatedFilesBaseDir = "$projectDir/src/main/kotlin/grpc"
//    generatedFilesBaseDir = "$projectDir/build/generated/source/proto/main"
    plugins {
        id("grpc"){
            artifact = "io.grpc:protoc-gen-grpc-java:1.33.1"
        }
        id("grpckt") {
            artifact = "io.grpc:protoc-gen-grpc-kotlin:0.1.5"
        }
    }
    generateProtoTasks {
        all().forEach {
            it.plugins {
                id("grpc")
                id("grpckt")
            }
        }
    }
}