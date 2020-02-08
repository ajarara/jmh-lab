plugins {
    `java-library`
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.openjdk.jmh:jmh-core:1.21")
    annotationProcessor("org.openjdk.jmh:jmh-generator-annprocess:1.21")
}

tasks {
    register("jmh", type=JavaExec::class.java) {
        dependsOn("classes")
        group = "benchmark"
        main = "org.openjdk.jmh.Main"
        classpath = sourceSets["main"].runtimeClasspath
        // To pass parameters ("-h" gives a list of possible parameters)
        args(listOf("-h"))
    }
}
