/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.bloogefest.annotation.analysis;

import java.lang.annotation.*;

/**
 * Контракт метода или конструктора.
 *
 * @apiNote Позволяет обобщённо объяснить поведение метода или конструктора.
 * @since 1.0.0-RC1
 */
@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface Contract {

    /**
     * Возвращает строковое представление контракта.
     *
     * @return Строковое представление контракта.
     *
     * @apiNote Позволяет проанализировать контракт и получить обобщённое объяснение поведения метода или конструктора.
     * @since 1.0.0-RC1
     */
    String value() default "";

    /**
     * Возвращает логическое представление чистоты контракта.
     *
     * @return Логическое представление чистоты контракта.
     *
     * @apiNote Позволяет определить наличие изменения внешнего состояния поведением метода или конструктора.
     * @since 1.0.0-RC1
     */
    boolean pure() default true;

}
