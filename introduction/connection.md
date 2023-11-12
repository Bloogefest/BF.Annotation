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

## Выпуска <a href="#release" id="release"></a>

### Maven <a href="#release-maven" id="release-maven"></a>

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

### Gradle <a href="#release-gradle" id="release-gradle"></a>

```kts
mavenCentral()
```

```kts
implementation("com.bloogefest:annotation:2.1.0")
```

## Выпуск-кандидата <a href="#release-candidate" id="release-candidate"></a>

### Maven <a href="#release-candidate-maven" id="release-candidate-maven"></a>

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

### Gradle <a href="#release-candidate-gradle" id="release-candidate-gradle"></a>

```kts
maven("https://s01.oss.sonatype.org/content/repositories/releases/")
```

```kts
implementation("com.bloogefest:annotation:2.1.0-RC1")
```

## Снимка <a href="#snapshot" id="snapshot"></a>

### Maven <a href="#snapshot-maven" id="snapshot-maven"></a>

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

### Gradle <a href="#snapshot-gradle" id="snapshot-gradle"></a>

```kts
maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
```

```kts
implementation("com.bloogefest:annotation:3.0.0-SNAPSHOT")
```