/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.bloogefest.annotation;

import java.lang.annotation.*;

/**
 * Ненулевое значение.
 *
 * @apiNote Позволяет подчеркнуть, что значение не должно быть нулевым.
 * @since 1.0.0-RC1
 */
@Documented
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE,
         ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotNull {}
