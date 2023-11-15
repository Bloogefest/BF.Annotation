plugins {
    id("java")
    id("maven-publish")
    id("signing")
}

group = "com.bloogefest"
version = "3.0.0-RC2"
description = "Библиотека аннотаций общего назначения."

repositories {
    mavenCentral()
}

publishing {
    publications {
        create<MavenPublication>("master") {
            artifactId = "annotation"
            from(components["java"])
            pom {
                name = project.name
                description = project.description
                url = "https://github.com/Bloogefest/BF.Annotation"
                licenses {
                    license {
                        name = "Mozilla Public License 2.0"
                        url = "https://mozilla.org/MPL/2.0/"
                        distribution = "repo"
                    }
                }
                developers {
                    developer {
                        id = "Bloogefest"
                        name = "George Sopin"
                        url = "https://github.com/Bloogefest"
                        timezone = "Europe/Moscow"
                    }
                }
                issueManagement {
                    system = "Github"
                    url = "https://github.com/Bloogefest/BF.Annotation/issues"
                }
                ciManagement {
                    system = "Github"
                    url = "https://github.com/Bloogefest/BF.Annotation/actions"
                }
                scm {
                    connection = "scm:git:git://github.com/Bloogefest/BF.Annotation.git"
                    developerConnection = "scm:git:ssh://github.com/Bloogefest/BF.Annotation.git"
                    url = "https://github.com/Bloogefest/BF.Annotation"
                }
                distributionManagement {
                    downloadUrl = "https://github.com/Bloogefest/BF.Annotation"
                }
            }
        }
    }
    repositories {
        maven {
            name = "OSSRH"
            val version = version.toString()
            url = uri(
                when {
                    "-SNAPSHOT" in version -> "https://s01.oss.sonatype.org/content/repositories/snapshots/"
                    "-RC" in version -> "https://s01.oss.sonatype.org/content/repositories/releases/"
                    else -> "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
                }
            )
            credentials {
                username = System.getenv("OSSRH_CREDENTIALS_USERNAME")
                password = System.getenv("OSSRH_CREDENTIALS_PASSWORD")
            }
        }
    }
}

signing {
    useInMemoryPgpKeys(
        System.getenv("SINGING_KEY_ID"), System.getenv("SINGING_KEY_SECRET"), System.getenv("SINGING_KEY_PASSWORD")
    )
    sign(publishing.publications["master"])
}

java {
    withSourcesJar()
    withJavadocJar()
}

tasks.compileJava {
    options.encoding = "UTF-8"
}

tasks.javadoc {
    val options = options as CoreJavadocOptions
    options.encoding = "UTF-8"
    options.addStringOption("Xdoclint:none", "-quiet")
    options.addStringOption("tag", "apiNote:a:API Note:")
    options.addStringOption("tag", "implSpec:a:Implementation Requirements:")
    options.addStringOption("tag", "implNote:a:Implementation Note:")
}
