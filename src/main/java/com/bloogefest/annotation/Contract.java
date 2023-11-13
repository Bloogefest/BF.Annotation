/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.bloogefest.annotation;

import java.lang.annotation.*;

/**
 * Позволяет обобщённо описать метод или конструктор, а точнее их параметры, поведение, влияние на окружение и
 * возвращаемое значение.
 *
 * @apiNote Эта аннотация активно изменялась, вплоть до выпуск-кандидата 3.0.0-RC1, после чего планируется допускать
 * лишь небольшие изменения в её документации.
 * @implSpec Реализация этой аннотации по умолчанию является эталонной, так как она полностью следует <a
 * href="https://annotation.docs.bloogefest.com/reference/contract#specification">спецификации</a>.
 * @implNote Для того чтобы применение этой аннотации было максимально эффективно, следуйте <a
 * href="https://annotation.docs.bloogefest.com/reference/contract#recommendations">рекомендациям по применению</a>.
 * @see #value()
 * @see #impact()
 * @see Impact
 * @since 1.0.0-RC1
 */
@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface Contract {

    /**
     * Возвращает обобщённое описание параметров, поведения и возвращаемого значения метода или конструктора.
     *
     * @return Обобщённое описание параметров, поведения и возвращаемого значения метода или конструктора.
     *
     * @apiNote Этот параметр активно изменялся, вплоть до выпуск-кандидата 3.0.0-RC1, после чего планируется допускать
     * лишь небольшие изменения в его документации.
     * @implSpec Реализация этого параметра по умолчанию является эталонной, так как она полностью следует <a
     * href="https://annotation.docs.bloogefest.com/reference/contract/value#specification">спецификации</a>.
     * @implNote Для того чтобы применение этого параметра было максимально эффективно, следуйте <a
     * href="https://annotation.docs.bloogefest.com/reference/contract/value#recommendations">рекомендациям по
     * применению</a>.
     * @since 1.0.0-RC1
     */
    @Contract("-> !null") @NonNull String value() default "";

    /**
     * Возвращает тип влияния на окружение метода или конструктора.
     *
     * @return Тип влияния на окружение метода или конструктора.
     *
     * @apiNote Этот параметр введён в выпуск-кандидате 3.0.0-RC1, после чего планируется допускать лишь небольшие
     * изменения в его документации.
     * @implSpec Реализация этого параметра по умолчанию является эталонной, так как она полностью следует <a
     * href="https://annotation.docs.bloogefest.com/reference/contract/impact#specification">спецификации</a>.
     * @implNote Для того чтобы применение этого параметра было максимально эффективно, следуйте <a
     * href="https://annotation.docs.bloogefest.com/reference/contract/impact#recommendations">рекомендациям по
     * применению</a>.
     * @see Impact
     * @since 3.0.0-RC1
     */
    @Contract("-> !null") @NonNull Impact impact() default Impact.UNDEFINED;

    /**
     * Типы влияния на окружение.
     *
     * @apiNote Это перечисление введено в выпуск-кандидате 3.0.0-RC1, после чего планируется допускать лишь небольшие
     * изменения в её документации.
     * @implSpec Реализация этого перечисления по умолчанию является эталонной, так как она полностью следует <a
     * href="https://annotation.docs.bloogefest.com/reference/contract/contract-impact#specification">спецификации</a>.
     * @implNote Для того чтобы применение этого перечисления было максимально эффективно, следуйте <a
     * href="https://annotation.docs.bloogefest.com/reference/contract/contract-impact#recommendations">рекомендациям по
     * применению</a>.
     * @since 3.0.0-RC1
     */
    enum Impact {

        /**
         * Отсутствие влияния на окружение.
         *
         * @apiNote Это значение введено в выпуск-кандидате 3.0.0-RC1, после чего планируется допускать лишь
         * небольшие изменения в его документации.
         * @implNote Для того чтобы применение этого значения было максимально эффективно, следуйте <a
         * href="https://annotation.docs.bloogefest.com/reference/contract/contract-impact/none#recommendations">рекомендациям
         * по применению</a>.
         * @since 3.0.0-RC1
         */
        NONE,

        /**
         * Влияние на внутреннее и внешнее окружение.
         *
         * @apiNote Это значение введено в выпуск-кандидате 3.0.0-RC1, после чего планируется допускать лишь
         * небольшие изменения в его документации.
         * @implNote Для того чтобы применение этого значения было максимально эффективно, следуйте <a
         * href="https://annotation.docs.bloogefest.com/reference/contract/contract-impact/shared#recommendations">рекомендациям
         * по применению</a>.
         * @since 3.0.0-RC1
         */
        SHARED,

        /**
         * Влияние на внутреннее окружение.
         *
         * @apiNote Это значение введено в выпуск-кандидате 3.0.0-RC1, после чего планируется допускать лишь
         * небольшие изменения в его документации.
         * @implNote Для того чтобы применение этого значения было максимально эффективно, следуйте <a
         * href="https://annotation.docs.bloogefest.com/reference/contract/contract-impact/internal#recommendations">рекомендациям
         * по применению</a>.
         * @since 3.0.0-RC1
         */
        INTERNAL,

        /**
         * Влияние на внешнее окружение.
         *
         * @apiNote Это значение введено в выпуск-кандидате 3.0.0-RC1, после чего планируется допускать лишь
         * небольшие изменения в его документации.
         * @implNote Для того чтобы применение этого значения было максимально эффективно, следуйте <a
         * href="https://annotation.docs.bloogefest.com/reference/contract/contract-impact/external#recommendations">рекомендациям
         * по применению</a>.
         * @since 3.0.0-RC1
         */
        EXTERNAL,

        /**
         * Неопределённое влияние на окружение.
         *
         * @apiNote Это значение введено в выпуск-кандидате 3.0.0-RC1, после чего планируется допускать лишь
         * небольшие изменения в его документации.
         * @implNote Для того чтобы применение этого значения было максимально эффективно, следуйте <a
         * href="https://annotation.docs.bloogefest.com/reference/contract/contract-impact/undefined#recommendations">рекомендациям
         * по применению</a>.
         * @since 3.0.0-RC1
         */
        UNDEFINED

    }

}
