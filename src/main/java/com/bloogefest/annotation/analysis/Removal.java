/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.bloogefest.annotation.analysis;

import java.lang.annotation.*;

/**
 * Аннотация чего-то, что гарантированно будет удалено в следующих выпусках.
 *
 * @apiNote Наличие этой аннотации у чего-то говорит о том, что оно не рекомендуется к использованию и будет
 * гарантированно удалено.
 * @since 2.0.0
 */
@Documented
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR,
         ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE, ElementType.PACKAGE, ElementType.TYPE_PARAMETER,
         ElementType.TYPE_USE, ElementType.MODULE, ElementType.RECORD_COMPONENT})
@Retention(RetentionPolicy.RUNTIME)
public @interface Removal {

    /**
     * Содержит идентификатор выпуска, в котором это будет гарантированно удалено.
     *
     * @return Идентификатор выпуска, в котором это будет гарантированно удалено.
     *
     * @since 2.0.0
     */
    String value() default "";

}
