/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.bloogefest.annotation.analysis;

import java.lang.annotation.*;

/**
 * Требование локализации.
 *
 * @apiNote Позволяет подчеркнуть, что что-то должно быть локализовано.
 * @since 1.0.0-RC1
 */
@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE,
         ElementType.RECORD_COMPONENT})
@Retention(RetentionPolicy.RUNTIME)
public @interface Nls {}
