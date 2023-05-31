/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.bloogefest.annotation.analysis;

import java.lang.annotation.*;

/**
 * Удаляемое состояние чего-то.
 *
 * @apiNote Позволяет подчеркнуть, что что-то не рекомендуется к использованию и будет гарантированно удалено.
 * @since 2.0.0-RC1
 */
@Documented
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR,
         ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE, ElementType.PACKAGE, ElementType.TYPE_PARAMETER,
         ElementType.TYPE_USE, ElementType.MODULE, ElementType.RECORD_COMPONENT})
@Retention(RetentionPolicy.RUNTIME)
public @interface Removal {

    /**
     * Возвращает идентификатор выпуска, в котором ожидается, что что-то будет гарантированно удалено.
     *
     * @return Идентификатор выпуска, в котором ожидается, что что-то будет гарантированно удалено.
     *
     * @since 2.0.0-RC1
     */
    @Contract("-> const") @NotNls String value() default "";

}
