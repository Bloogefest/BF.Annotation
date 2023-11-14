/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.bloogefest.annotation;

import java.lang.annotation.*;

/**
 * Позволяет обозначить состояние элемента как экспериментальное. Эта аннотация применима к элементам, которые находятся
 * в процессе разработки, отлаживания и могут быть переименованы, перемещены или вовсе удалены.
 *
 * @apiNote Эта аннотация активно изменялась, вплоть до выпуск-кандидата 3.0.0-RC1, после чего планируется допускать
 * лишь небольшие изменения в её документации.
 * @implSpec Реализация этой аннотации по умолчанию является эталонной, так как она полностью следует <a
 * href="https://annotation.docs.bloogefest.com/reference/experimental#specification">спецификации</a>.
 * @implNote Для того чтобы применение этой аннотации было максимально эффективно, следуйте <a
 * href="https://annotation.docs.bloogefest.com/reference/experimental#recommendations">рекомендациям по
 * применению</a>.
 * @see #from()
 * @see #to()
 * @since 1.0.0-RC1
 */
@Documented
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR,
         ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE, ElementType.PACKAGE, ElementType.TYPE_PARAMETER,
         ElementType.TYPE_USE, ElementType.MODULE, ElementType.RECORD_COMPONENT})
@Retention(RetentionPolicy.RUNTIME)
public @interface Experimental {

    /**
     * Возвращает идентификатор выпуска, выпуск-кандидата или снимка, в котором состояние элемента было обозначено как
     * экспериментальное.
     *
     * @return Идентификатор выпуска, выпуск-кандидата или снимка, в котором состояние элемента было обозначено как
     * экспериментальное.
     *
     * @apiNote Этот параметр был введён в выпуск-кандидате 3.0.0-RC1, после чего планируется допускать лишь небольшие
     * изменения в его документации.
     * @implSpec Реализация этого параметра по умолчанию является эталонной, так как она полностью следует <a
     * href="https://annotation.docs.bloogefest.com/reference/experimental/from#specification">спецификации</a>.
     * @implNote Для того чтобы применение этого параметра было максимально эффективно, следуйте <a
     * href="https://annotation.docs.bloogefest.com/reference/experimental/from#recommendations">рекомендациям по
     * применению</a>.
     * @since 3.0.0-RC1
     */
    @Contract("-> !null") @NonNull String from() default "";

    /**
     * Возвращает идентификатор выпуска, выпуск-кандидата или снимка, в котором планируется, что состояние элемента
     * перестанет быть обозначенным как экспериментальное.
     *
     * @return Идентификатор выпуска, выпуск-кандидата или снимка, в котором планируется, что состояние элемента
     * перестанет быть обозначенным как экспериментальное.
     *
     * @apiNote Этот параметр был введён в выпуск-кандидате 3.0.0-RC1, после чего планируется допускать лишь небольшие
     * изменения в его документации.
     * @implSpec Реализация этого параметра по умолчанию является эталонной, так как она полностью следует <a
     * href="https://annotation.docs.bloogefest.com/reference/experimental/to#specification">спецификации</a>.
     * @implNote Для того чтобы применение этого параметра было максимально эффективно, следуйте <a
     * href="https://annotation.docs.bloogefest.com/reference/experimental/to#recommendations">рекомендациям по
     * применению</a>.
     * @since 3.0.0-RC1
     */
    @Contract("-> !null") @NonNull String to() default "";

}
