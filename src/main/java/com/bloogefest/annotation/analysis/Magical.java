/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.bloogefest.annotation.analysis;

import java.lang.annotation.*;

/**
 * Магическое значение.
 *
 * @apiNote Уведомляет о магическом значении, содержащимся в поле или локальной переменной.
 * @since 2.1.0-RC1
 */
@Documented
@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Magical {}
