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
 * Аннотация контракта метода или конструктора.
 *
 * @apiNote Наличие этой аннотации говорит о том, что поведение метода или конструктора соответствует значению
 * контракта.
 * @since 2.1.0
 */
@Documented
@Target({ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Range {

    /**
     * Возвращает значение контракта.
     *
     * @return Значение контракта.
     *
     * @since 2.1.0
     */
    double from() default -Double.MAX_VALUE;

    /**
     * Возвращает значение контракта.
     *
     * @return Значение контракта.
     *
     * @since 2.1.0
     */
    double to() default Double.MAX_VALUE;

}
