/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.bloogefest.annotation;

import java.lang.annotation.*;

/**
 * Позволяет обозначить диапазон числовых значений элемента. Эта аннотация применима к элементам, значение которых
 * является числовым и лежит в диапазоне между двумя известными числовыми значениями или равняется им.
 *
 * @apiNote Эта аннотация активно изменялась, вплоть до выпуск-кандидата 3.0.0-RC1, после чего планируется допускать
 * лишь небольшие изменения в её документации.
 * @implSpec Реализация этой аннотации по умолчанию является эталонной, так как она полностью следует <a
 * href="https://annotation.docs.bloogefest.com/reference/range#specification">спецификации</a>.
 * @implNote Для того чтобы применение этой аннотации было максимально эффективно, следуйте <a
 * href="https://annotation.docs.bloogefest.com/reference/range#recommendations">рекомендациям по применению</a>.
 * @see #from()
 * @see #to()
 * @since 2.1.0-RC1
 */
@Documented
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE,
         ElementType.RECORD_COMPONENT})
@Retention(RetentionPolicy.RUNTIME)
public @interface Range {

    /**
     * Возвращает минимально возможное числовое значение элемента.
     *
     * @return Минимально возможное числовое значение элемента.
     *
     * @apiNote Этот параметр активно изменялся, вплоть до выпуск-кандидата 3.0.0-RC1, после чего планируется допускать
     * лишь небольшие изменения в его документации.
     * @implSpec Реализация этого параметра по умолчанию является эталонной, так как она полностью следует <a
     * href="https://annotation.docs.bloogefest.com/reference/range/from#specification">спецификации</a>.
     * @implNote Для того чтобы применение этого параметра было максимально эффективно, следуйте <a
     * href="https://annotation.docs.bloogefest.com/reference/range/from#recommendations">рекомендациям по
     * применению</a>.
     * @since 2.1.0-RC1
     */
    @Contract("-> double") @Range double from() default -Double.MAX_VALUE;

    /**
     * Возвращает максимально возможное числовое значение элемента.
     *
     * @return Максимально возможное числовое значение элемента.
     *
     * @apiNote Этот параметр активно изменялся, вплоть до выпуск-кандидата 3.0.0-RC1, после чего планируется допускать
     * лишь небольшие изменения в его документации.
     * @implSpec Реализация этого параметра по умолчанию является эталонной, так как она полностью следует <a
     * href="https://annotation.docs.bloogefest.com/reference/range/to#specification">спецификации</a>.
     * @implNote Для того чтобы применение этого параметра было максимально эффективно, следуйте <a
     * href="https://annotation.docs.bloogefest.com/reference/range/to#recommendations">рекомендациям по
     * применению</a>.
     * @since 2.1.0-RC1
     */
    @Contract("-> double") @Range double to() default Double.MAX_VALUE;

}
