# BF.Annotation

[![RELEASE](https://img.shields.io/github/v/release/Bloogefest/BF.Annotation?style=for-the-badge)](https://github.com/Bloogefest/BF.Annotation/releases/latest)
[![CI/CD](https://img.shields.io/github/actions/workflow/status/Bloogefest/BF.Annotation/master.yml?label=CI%2FCD&style=for-the-badge)](https://github.com/Bloogefest/BF.Annotation/actions/workflows/master.yml)

Представляет собой библиотеку аннотаций общего назначения, которые могут пригодиться в любом проекте. Вы можете серьёзно
повысить читаемость кода, если будете следовать [официальной документации](https://annotation.docs.bloogefest.com).

Для корректной работы требуется Java SE 21 или выше. При написании исходного кода и компиляции общедоступных снимков,
выпуск-кандидатов, выпусков используется [Eclipse Temurin](https://adoptium.net/temurin/).

### Подключение

#### Выпуска

##### Maven

```xml
<repository>
  <id>central</id>
  <url>https://repo1.maven.org/maven2</url>
</repository>
```

```xml
<dependency>
  <groupId>com.bloogefest</groupId>
  <artifactId>annotation</artifactId>
  <version>3.0.0</version>
</dependency>
```

##### Gradle

```kotlin
mavenCentral()
```

```kotlin
implementation("com.bloogefest:annotation:3.0.0")
```

#### Выпуск-кандидата

##### Maven

```xml
<repository>
  <id>ossrh-rc</id>
  <url>https://s01.oss.sonatype.org/content/repositories/releases/</url>
</repository>
```

```xml
<dependency>
  <groupId>com.bloogefest</groupId>
  <artifactId>annotation</artifactId>
  <version>3.0.0-RC2</version>
</dependency>
```

##### Gradle

```kotlin
maven("https://s01.oss.sonatype.org/content/repositories/releases/")
```

```kotlin
implementation("com.bloogefest:annotation:3.0.0-RC2")
```

#### Снимка

##### Maven

```xml
<repository>
  <id>ossrh-snapshot</id>
  <url>https://s01.oss.sonatype.org/content/repositories/snapshots/</url>
</repository>
```

```xml
<dependency>
  <groupId>com.bloogefest</groupId>
  <artifactId>annotation</artifactId>
  <version>3.0.0-SNAPSHOT</version>
</dependency>
```

##### Gradle

```kotlin
maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
```

```kotlin
implementation("com.bloogefest:annotation:3.0.0-SNAPSHOT")
```
