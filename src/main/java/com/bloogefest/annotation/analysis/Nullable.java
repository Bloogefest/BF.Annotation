/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.bloogefest.annotation.analysis;

import java.lang.annotation.*;

/**
 * Аннотация обнуляемого значения.
 *
 * @apiNote Наличие этой аннотации говорит о том, что значение может быть нулевым.
 * @since 1.0.0
 */
@Documented
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE,
         ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Nullable {}
