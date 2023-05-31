/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.bloogefest.annotation.analysis;

import java.lang.annotation.*;

/**
 * Диапазон числовых значений.
 *
 * @apiNote Позволяет задать диапазон числовых значений.
 * @since 2.1.0-RC1
 */
@Documented
@Target({ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Range {

    /**
     * Возвращает начальное числовое значение.
     *
     * @return Начальное числовое значение.
     *
     * @implSpec Начальное числовое значение не должно быть больше конечного.
     * @since 2.1.0-RC1
     */
    @Contract("-> const") @Range double from() default -Double.MAX_VALUE;

    /**
     * Возвращает конечное числовое значение.
     *
     * @return Конечное числовое значение.
     *
     * @implSpec Конечное числовое значение не должно быть меньше начального.
     * @since 2.1.0-RC1
     */
    @Contract("-> const") @Range double to() default Double.MAX_VALUE;

}
