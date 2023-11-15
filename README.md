# BF.Annotation

[![RELEASE](https://img.shields.io/github/v/release/Bloogefest/BF.Annotation?style=for-the-badge)](https://github.com/Bloogefest/BF.Annotation/releases/latest)
[![CI/CD](https://img.shields.io/github/actions/workflow/status/Bloogefest/BF.Annotation/master.yml?label=CI%2FCD&style=for-the-badge)](https://github.com/Bloogefest/BF.Annotation/actions/workflows/master.yml)

### Описание

`BF.Annotation` — это библиотека аннотаций общего назначения. Она предоставляет аннотации преимущественно для других
библиотек, например: `Contract`, `NonNull`, `Null` и `Nullable`.

### Область применения

Эта библиотека может пригодиться для аннотирования другой библиотеки, тем самым повышая скорость и удобство
взаимодействия с ней. Однако, её также можно использовать для аннотирования других проектов, если в них, к примеру, есть
внутренний API.

### Требования к проекту

Эта библиотека написана и скомпилирована с использованием [Amazon Corretto 17](https://aws.amazon.com/corretto), поэтому
подключать её можно только к проектам на основе Java SE 17 или выше.

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
  <version>2.1.0</version>
</dependency>
```

##### Gradle

```kotlin
mavenCentral()
```

```kotlin
implementation("com.bloogefest:annotation:2.1.0")
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
