/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.bloogefest.annotation;

import java.lang.annotation.*;

/**
 * Позволяет обозначить значение элемента как нулевое. Эта аннотация применима к элементам, значение которых должно быть
 * нулевым.
 *
 * @apiNote Эта аннотация активно изменялась, вплоть до выпуск-кандидата 3.0.0-RC1, после чего планируется допускать
 * лишь небольшие изменения в её документации.
 * @implSpec Реализация этой аннотации по умолчанию является эталонной, так как она полностью следует <a
 * href="https://annotation.docs.bloogefest.com/reference/null#specification">спецификации</a>.
 * @implNote Для того чтобы применение этой аннотации было максимально эффективно, следуйте <a
 * href="https://annotation.docs.bloogefest.com/reference/null#recommendations">рекомендациям по применению</a>.
 * @since 1.0.0-RC1
 */
@Documented
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE,
         ElementType.RECORD_COMPONENT})
@Retention(RetentionPolicy.RUNTIME)
public @interface Null {}
