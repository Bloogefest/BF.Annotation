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

# О проекте

## Описание <a href="#description" id="description"></a>

`BF.Annotation` — это библиотека аннотаций общего назначения. Она предоставляет аннотации преимущественно для других библиотек, например: `Contract`, `NonNull`, `Null` и `Nullable`.

## Область применения <a href="#scope" id="scope"></a>

Эта библиотека может пригодиться для аннотирования другой библиотеки, тем самым повышая скорость и удобство взаимодействия с ней. Однако, её также можно использовать для аннотирования других проектов, если в них, к примеру, есть внутренний API.

## Требования к проекту <a href="#requirements" id="requirements"></a>

Эта библиотека написана и скомпилирована с использованием [Amazon Corretto 17](https://aws.amazon.com/corretto), поэтому подключать её можно только к проектам на основе Java SE 17 или выше.
