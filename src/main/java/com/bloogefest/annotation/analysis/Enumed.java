/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.bloogefest.annotation.analysis;

import java.lang.annotation.*;

/**
 * Перечисление значений.
 *
 * @apiNote Уведомляет о предполагаемых значениях.
 * @since 2.1.0-RC1
 */
@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.RECORD_COMPONENT})
@Retention(RetentionPolicy.RUNTIME)
public @interface Enumed {

    /**
     * Возвращает предполагаемые значения.
     *
     * @return Предполагаемые значения.
     *
     * @implSpec Предполагаемые значения не должны повторяться.
     * @since 2.1.0-RC1
     */
    @Contract("-> const") int[] value() default {};

}
