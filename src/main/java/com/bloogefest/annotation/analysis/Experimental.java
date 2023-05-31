/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.bloogefest.annotation.analysis;

import java.lang.annotation.*;

/**
 * Экспериментальное состояние чего-то.
 *
 * @apiNote Позволяет подчеркнуть, что что-то находится в процессе разработки, отлаживания и может быть переименовано,
 * перемещено или вовсе удалено.
 * @since 1.0.0-RC1
 */
@Documented
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR,
         ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE, ElementType.PACKAGE, ElementType.TYPE_PARAMETER,
         ElementType.TYPE_USE, ElementType.MODULE, ElementType.RECORD_COMPONENT})
@Retention(RetentionPolicy.RUNTIME)
public @interface Experimental {

    /**
     * Возвращает идентификатор выпуска, в котором ожидается, что состояние чего-то будет изменено.
     *
     * @return Идентификатор выпуска, в котором ожидается, что состояние чего-то будет изменено.
     *
     * @since 2.1.0-RC1
     */
    @Contract("-> const") @NotNls String value() default "";

}
