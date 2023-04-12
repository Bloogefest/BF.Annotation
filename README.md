# BF.Annotation

[![RELEASE](https://img.shields.io/github/v/release/Bloogefest/BF.Annotation?style=for-the-badge)](https://github.com/Bloogefest/BF.Annotation/releases/latest)
[![CI/CD](https://img.shields.io/github/actions/workflow/status/Bloogefest/BF.Annotation/master.yml?label=CI%2FCD&style=for-the-badge)](https://github.com/Bloogefest/BF.Annotation/actions/workflows/master.yml)

### Release

#### Maven

```xml
<repository>
  <id>central</id>
  <name>Maven Central</name>
  <url>https://repo1.maven.org/maven2</url>
</repository>
```

```xml
<dependency>
  <groupId>com.bloogefest</groupId>
  <artifactId>annotation</artifactId>
  <version>1.0.1</version>
</dependency>
```

#### Gradle

```kotlin
repositories {
    mavenCentral()
}
```

```kotlin
dependencies {
    implementation("com.bloogefest:annotation:1.0.1")
}
```

### Release Candidate

#### Maven

```xml
<repository>
  <id>ossrh-rc</id>
  <name>OSSRH RC</name>
  <url>https://s01.oss.sonatype.org/content/repositories/releases/</url>
</repository>
```

```xml
<dependency>
  <groupId>com.bloogefest</groupId>
  <artifactId>annotation</artifactId>
  <version>1.0.1-RC1</version>
</dependency>
```

#### Gradle

```kotlin
repositories {
    maven {
        name = "OSSRH RC"
        url = uri("https://s01.oss.sonatype.org/content/repositories/releases/")
    }
}
```

```kotlin
dependencies {
    implementation("com.bloogefest:annotation:1.0.1-RC1")
}
```

### Snapshot

#### Maven

```xml
<repository>
  <id>ossrh-snapshot</id>
  <name>OSSRH SNAPSHOT</name>
  <url>https://s01.oss.sonatype.org/content/repositories/snapshots/</url>
</repository>
```

```xml
<dependency>
  <groupId>com.bloogefest</groupId>
  <artifactId>annotation</artifactId>
  <version>1.0.1-SNAPSHOT</version>
</dependency>
```

#### Gradle

```kotlin
repositories {
    maven {
        name = "OSSRH SNAPSHOT"
        url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
    }
}
```

```kotlin
dependencies {
    implementation("com.bloogefest:annotation:1.0.1-SNAPSHOT")
}
```