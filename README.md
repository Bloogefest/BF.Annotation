# BF.Annotation

[![RELEASE](https://img.shields.io/github/v/release/Bloogefest/BF.Annotation?style=for-the-badge)](https://github.com/Bloogefest/BF.Annotation/releases/latest)
[![CI/CD](https://img.shields.io/github/actions/workflow/status/Bloogefest/BF.Annotation/master.yml?label=CI%2FCD&style=for-the-badge)](https://github.com/Bloogefest/BF.Annotation/actions/workflows/master.yml)

### Описание

`BF.Annotation` — это библиотека аннотаций общего назначения. Она предоставляет аннотации преимущественно для других
библиотек, к примеру: `Contract`, `NonNull`, `Null` и `Nullable`.

### Подключение

#### Выпуска

С помощью `Maven`.

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

С помощью `Gradle`.

```kotlin
maven("https://s01.oss.sonatype.org/content/repositories/releases/")
```

```kotlin
implementation("com.bloogefest:annotation:2.1.0")
```

#### Выпуск-кандидата

С помощью `Maven`.

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
  <version>2.1.0-RC1</version>
</dependency>
```

С помощью `Gradle`.

```kotlin
maven("https://s01.oss.sonatype.org/content/repositories/releases/")
```

```kotlin
implementation("com.bloogefest:annotation:2.1.0-RC1")
```

#### Снимка

С помощью `Maven`.

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

C помощью `Gradle`.

```kotlin
maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
```

```kotlin
implementation("com.bloogefest:annotation:3.0.0-SNAPSHOT")
```

### Краткий обзор

#### `Contract`

Позволяет кратко описать метод или конструктор, в том числе их аргументы,
возвращаемое значение, поведение и воздействие на окружение. К примеру:

```java
@FunctionalInterface
interface ArgumentCounter {
    @Contract(value = "[-] -> 0; [!null] -> done; _ -> fail")
    int count(String... args) throws RuntimeException;
}
```