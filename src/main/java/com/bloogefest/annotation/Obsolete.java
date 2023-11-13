/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.bloogefest.annotation;

import java.lang.annotation.*;

/**
 * Позволяет обозначить состояние элемента как устаревшее. Эта аннотация применима к элементам, которые устарели, не
 * рекомендуются к использованию и могут быть удалены.
 *
 * @apiNote Эта аннотация активно изменялась, вплоть до выпуск-кандидата 3.0.0-RC1, после чего планируется допускать
 * лишь небольшие изменения в её документации.
 * @implSpec Реализация этой аннотации по умолчанию является эталонной, так как она полностью следует <a
 * href="https://annotation.docs.bloogefest.com/reference/obsolete#specification">спецификации</a>.
 * @implNote Для того чтобы применение этой аннотации было максимально эффективно, следуйте <a
 * href="https://annotation.docs.bloogefest.com/reference/obsolete#recommendations">рекомендациям по применению</a>.
 * @see #from()
 * @see #to()
 * @since 1.0.0-RC1
 */
@Documented
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR,
         ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE, ElementType.PACKAGE, ElementType.TYPE_PARAMETER,
         ElementType.TYPE_USE, ElementType.MODULE, ElementType.RECORD_COMPONENT})
@Retention(RetentionPolicy.RUNTIME)
public @interface Obsolete {

    /**
     * Возвращает идентификатор выпуска, выпуск-кандидата или снимка, в котором состояние элемента было обозначено как
     * устаревшее.
     *
     * @return Идентификатор выпуска, выпуск-кандидата или снимка, в котором состояние элемента было обозначено как
     * устаревшее.
     *
     * @apiNote Этот параметр введён в выпуск-кандидате 3.0.0-RC1, после чего планируется допускать лишь небольшие
     * изменения в его документации.
     * @implSpec Реализация этого параметра по умолчанию является эталонной, так как она полностью следует <a
     * href="https://annotation.docs.bloogefest.com/reference/obsolete/from#specification">спецификации</a>.
     * @implNote Для того чтобы применение этого параметра было максимально эффективно, следуйте <a
     * href="https://annotation.docs.bloogefest.com/reference/obsolete/from#recommendations">рекомендациям по
     * применению</a>.
     * @since 3.0.0-RC1
     */
    @Contract("-> !null") @NonNull String from() default "";

    /**
     * Возвращает идентификатор выпуска, выпуск-кандидата или снимка, в котором планируется, что элемент будет удалён.
     *
     * @return Идентификатор выпуска, выпуск-кандидата или снимка, в котором планируется, что элемент будет удалён.
     *
     * @apiNote Этот параметр введён в выпуск-кандидате 3.0.0-RC1, после чего планируется допускать лишь небольшие
     * изменения в его документации.
     * @implSpec Реализация этого параметра по умолчанию является эталонной, так как она полностью следует <a
     * href="https://annotation.docs.bloogefest.com/reference/obsolete/to#specification">спецификации</a>.
     * @implNote Для того чтобы применение этого параметра было максимально эффективно, следуйте <a
     * href="https://annotation.docs.bloogefest.com/reference/obsolete/to#recommendations">рекомендациям по
     * применению</a>.
     * @since 3.0.0-RC1
     */
    @Contract("-> !null") @NonNull String to() default "";

}
