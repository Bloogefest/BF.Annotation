---
description: 3.0.0-RC1
---

# impact()

```java
@Contract("-> !null")
@NonNull Impact impact() default Impact.UNDEFINED;
```

## Описание <a href="#description" id="description"></a>

Возвращает тип влияния на окружение метода или конструктора.

{% hint style="info" %}
Этот параметр введён в выпуск-кандидате 3.0.0-RC1, после чего планируется допускать лишь небольшие изменения в его документации.
{% endhint %}

{% hint style="success" %}
Реализация этого параметра по умолчанию является эталонной, так как она полностью следует [спецификации](impact.md#specifikaciya).
{% endhint %}

{% hint style="warning" %}
Для того чтобы применение этого параметра было максимально эффективно, следуйте [рекомендациям по применению](impact.md#rekomendacii-po-primeneniyu).
{% endhint %}

## Спецификация <a href="#specification" id="specification"></a>

Этот раздел находится активной в разработке.

## Рекомендации по применению <a href="#recommendations" id="recommendations"></a>

Этот раздел находится активной в разработке.