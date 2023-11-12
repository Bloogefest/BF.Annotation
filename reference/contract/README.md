---
description: 1.0.0-RC1
---

# Contract

{% code fullWidth="false" %}
```java
package com.bloogefest.annotation;

@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface Contract { ... }
```
{% endcode %}

## Описание <a href="#description" id="description"></a>

Позволяет обобщённо описать метод или конструктор, а точнее их параметры, поведение, влияние на окружение и возвращаемое значение.

{% hint style="info" %}
Эта аннотация активно изменялась, вплоть до выпуск-кандидата 3.0.0-RC1, после чего планируется допускать лишь небольшие изменения в её документации.
{% endhint %}

{% hint style="success" %}
Реализация этой аннотации по умолчанию является эталонной, так как она полностью следует [спецификации](./#specifikaciya).
{% endhint %}

{% hint style="warning" %}
Для того чтобы применение этой аннотации было максимально эффективно, следуйте [рекомендациям по применению](./#rekomendacii-po-primeneniyu).
{% endhint %}

## Спецификация <a href="#specification" id="specification"></a>

Этот раздел находится активной в разработке.

## Рекомендации по применению <a href="#recommendations" id="recommendations"></a>

Этот раздел находится активной в разработке.