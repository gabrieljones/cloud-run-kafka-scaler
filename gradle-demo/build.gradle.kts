plugins {
    java
}

group = "com.google.cloud.run.kafkascaler"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://packages.confluent.io/maven/")
    }
}

dependencies {
    // Main dependencies (add more as needed)
    implementation("com.google.protobuf:protobuf-java:4.29.3")
    implementation("com.google.protobuf:protobuf-java-util:4.29.3")
    implementation("com.google.guava:guava:32.1.3-jre")
    implementation("org.apache.kafka:kafka-clients:3.9.0")
    implementation("com.google.flogger:flogger:0.8")
    implementation("com.google.flogger:flogger-system-backend:0.8")
    implementation("com.google.api.grpc:proto-google-cloud-monitoring-v3:3.61.0")
    implementation("com.google.api.grpc:proto-google-cloud-tasks-v2:2.58.0")
    implementation("com.google.api.grpc:proto-google-common-protos:2.54.1")
    //implementation("io.grpc:grpc-protobuf:1.70.0")
    //implementation("io.grpc:grpc-stub:1.70.0")
    implementation("com.google.api-client:google-api-client-gson:2.7.2")
    implementation("com.google.apis:google-api-services-run:v2-rev20250223-2.0.0")
    implementation("com.google.auth:google-auth-library-oauth2-http:1.33.1")
    implementation("com.google.auto.value:auto-value:1.11.0")
    implementation("com.google.auto.value:auto-value-annotations:1.11.0")
    implementation("com.google.cloud:google-cloud-monitoring:3.61.0")
    implementation("com.google.cloud:google-cloud-tasks:2.46.0")
    implementation("com.google.cloud.hosted.kafka:managed-kafka-auth-login-handler:1.0.5")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("com.google.http-client:google-http-client:1.46.3")
    implementation("com.google.http-client:google-http-client-gson:1.46.3")
    implementation("org.yaml:snakeyaml:2.4")

    // Test dependencies
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.mockito:mockito-core:5.17.0")
    testImplementation("com.google.truth:truth:1.4.4")
    annotationProcessor("com.google.auto.value:auto-value:1.11.0")
}

tasks.withType<JavaCompile> {
    options.annotationProcessorPath = configurations.annotationProcessor.get()
}

tasks.test {
    useJUnit()
}

tasks.compileJava {
    options.release.set(17)
}

sourceSets {
    main {
        java {
            setSrcDirs(listOf("../src/main/java"))
        }
        resources {
            setSrcDirs(listOf("../src/main/java"))
            includes.addAll(listOf("**/*.properties", "**/*.yaml"))
        }
    }
    test {
        java {
            setSrcDirs(listOf("../src/test/java"))
        }
        resources {
            setSrcDirs(listOf("../src/test/java"))
            includes.addAll(listOf("**/*.properties", "**/*.yaml"))
        }
    }
}

configurations.all {
    resolutionStrategy {
        force("com.google.protobuf:protobuf-java:4.26.1")
    }
}
