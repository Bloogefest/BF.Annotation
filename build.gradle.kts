plugins {
    id("java")
    id("maven-publish")
    id("signing")
}

group = "com.bloogefest"
version = "1.0.1-RC1"
description = "Библиотека аннотаций общего назначения."

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
}

java {
    withSourcesJar()
    withJavadocJar()
}

publishing {
    publications {
        create<MavenPublication>("master") {
            artifactId = "annotation"

            from(components["java"])

            pom {
                name.set(project.name)
                description.set(project.description)
                url.set("https://github.com/Bloogefest/BF.Annotation")

                licenses {
                    license {
                        name.set("Mozilla Public License Version 2.0")
                        url.set("https://mozilla.org/MPL/2.0/")
                    }
                }

                developers {
                    developer {
                        id.set("Bloogefest")
                        name.set("George Sopin")
                        url.set("https://github.com/Bloogefest")
                        timezone.set("W-SU")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/Bloogefest/BF.Annotation.git")
                    developerConnection.set("scm:git:ssh://github.com/Bloogefest/BF.Annotation.git")
                    url.set("https://github.com/Bloogefest/BF.Annotation")
                }

                issueManagement {
                    system.set("Github")
                    url.set("https://github.com/Bloogefest/BF.Annotation/issues")
                }

                ciManagement {
                    system.set("Github")
                    url.set("https://github.com/Bloogefest/BF.Annotation/actions")
                }
            }
        }
    }

    repositories {
        maven {
            name = "OSSRH"

            val version = version.toString()
            url = uri(when {
                          "-SNAPSHOT" in version -> "https://s01.oss.sonatype.org/content/repositories/snapshots/"
                          "-RC" in version -> "https://s01.oss.sonatype.org/content/repositories/releases/"
                          else -> "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
                      })

            credentials {
                username = System.getenv("OSSRH_CREDENTIALS_USERNAME") ?: findProperty(
                        "OSSRH_CREDENTIALS_USERNAME").toString()
                password = System.getenv("OSSRH_CREDENTIALS_PASSWORD") ?: findProperty(
                        "OSSRH_CREDENTIALS_PASSWORD").toString()
            }
        }
    }
}

signing {
    useInMemoryPgpKeys(System.getenv("SINGING_KEY_ID") ?: findProperty("SINGING_KEY_ID").toString(),
                       System.getenv("SINGING_KEY_SECRET") ?: findProperty("SINGING_KEY_SECRET").toString(),
                       System.getenv("SINGING_KEY_PASSWORD") ?: findProperty("SINGING_KEY_PASSWORD").toString())

    sign(publishing.publications["master"])
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.getByName<Javadoc>("javadoc") {
    val options = options as CoreJavadocOptions

    options.encoding = "UTF-8"

    options.addStringOption("Xdoclint:none", "-quiet")
    options.addStringOption("tag", "apiNote:a:API Note:")
    options.addStringOption("tag", "implSpec:a:Implementation Requirements:")
    options.addStringOption("tag", "implNote:a:Implementation Note:")
}

tasks.getByName<JavaCompile>("compileJava") {
    options.encoding = "UTF-8"
}

tasks.getByName<JavaCompile>("compileTestJava") {
    options.encoding = "UTF-8"
}
