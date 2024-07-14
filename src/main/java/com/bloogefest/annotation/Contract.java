/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.bloogefest.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Позволяет обобщённо описать метод или конструктор. Вы можете определить, как метод или конструктор ведут себя при
 * определённых параметрах, как влияют на окружение, что возвращают.
 *
 * @see #value()
 * @see #impact()
 * @see Impact
 * @since 1.0.0-RC1
 */
@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.SOURCE)
public @interface Contract {

    /**
     * @return Обобщённое, соответствующее <a
     * href="https://annotation.docs.bloogefest.com/reference/contract#value">официальной спецификации</a> описание
     * метода или конструктора.
     *
     * @since 1.0.0-RC1
     */
    @Contract(value = "-> const", impact = Impact.NONE) @NonNull String value() default "";

    /**
     * @return Соответствующее <a href="https://annotation.docs.bloogefest.com/reference/contract#impact">официальной
     * спецификации</a> влияние метода или конструктора на окружение.
     *
     * @see Impact
     * @since 3.0.0-RC1
     */
    @Contract(value = "-> const", impact = Impact.NONE) @NonNull Impact impact() default Impact.UNDEFINED;

    /**
     * Влияние метода или конструктора на окружение.
     *
     * @since 3.0.0-RC1
     */
    enum Impact {

        /**
         * Отсутствие влияния метода или конструктора на окружение.
         *
         * @since 3.0.0-RC1
         */
        NONE,

        /**
         * Влияние метода или конструктора на внутреннее и внешнее окружения.
         *
         * @since 3.0.0-RC1
         */
        SHARED,

        /**
         * Влияние метода или конструктора на внутреннее окружение.
         *
         * @since 3.0.0-RC1
         */
        INTERNAL,

        /**
         * Влияние метода или конструктора на внешнее окружение.
         *
         * @since 3.0.0-RC1
         */
        EXTERNAL,

        /**
         * Неопределённое влияние метода или конструктора на окружение.
         *
         * @since 3.0.0-RC1
         */
        UNDEFINED

    }

}
