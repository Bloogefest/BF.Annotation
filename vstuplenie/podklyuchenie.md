---
layout:
  title:
    visible: true
  description:
    visible: false
  tableOfContents:
    visible: true
  outline:
    visible: true
  pagination:
    visible: true
---

# Подключение

## Выпуска

### Maven

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

### Gradle

```kts
mavenCentral()
```

```kts
implementation("com.bloogefest:annotation:2.1.0")
```

## Выпуск-кандидата

### Maven

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

### Gradle

```kts
maven("https://s01.oss.sonatype.org/content/repositories/releases/")
```

```kts
implementation("com.bloogefest:annotation:2.1.0-RC1")
```

## Снимка

### Maven

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

### Gradle

```kts
maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
```

```kts
implementation("com.bloogefest:annotation:3.0.0-SNAPSHOT")
```
