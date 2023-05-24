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
     * @implSpec Рекомендуется следовать следующему синтаксису:
     * <p>
     * 1. Пробелы между словами контракта игнорируются, поэтому рекомендуется использовать их для повышения его
     * читаемости.
     * </p>
     * <p>
     * 2. Контракт состоит из одной или множества вариаций, которые разделяются точкой с запятой (";").
     * </p>
     * <p>
     * 3. Каждая из вариаций состоит из двух частей: ноль, один или множество аргументов и возвращаемое значение —,
     * которые разделяются двумя символами: дефис-минус и знак больше —, образующими стрелку вправо ("->").
     * </p>
     * <p>
     * 4. Каждый аргумент из его множества отделяется от другого запятой (",").
     * </p>
     * <p>
     * 5. Каждый аргумент может быть задан следующими словами:
     * <ul>
     *     <li>
     *         <b>_</b> — любое значение.
     *     </li>
     *     <li>
     *         <b>null</b> — нулевое значение.
     *     </li>
     *     <li>
     *         <b>!null</b> — ненулевое значение.
     *     </li>
     *     <li>
     *         <b>true</b> — истинное значение.
     *     </li>
     *     <li>
     *         <b>false</b> — ложное значение.
     *     </li>
     *     <li>
     *         <b>this</b> — объект, обобщённое поведение метода которого описывается этим контрактом.
     *     </li>
     * </ul>
     * </p>
     * <p>
     * 6. Каждое возвращаемое значение может быть задано следующими словами:
     * <ul>
     *     <li>
     *         <b>_</b> — любое значение, исключение или ошибка.
     *     </li>
     *     <li>
     *         <b>null</b> — нулевое значение.
     *     </li>
     *     <li>
     *         <b>!null</b> — ненулевое значение.
     *     </li>
     *     <li>
     *         <b>true</b> — истинное значение.
     *     </li>
     *     <li>
     *         <b>false</b> — ложное значение.
     *     </li>
     *     <li>
     *         <b>this</b> — объект, обобщённое поведение метода которого описывается этим контрактом.
     *     </li>
     *     <li>
     *         <b>fail</b> — исключение или ошибка.
     *     </li>
     *     <li>
     *         <b>const</b> — постоянное значение или объект.
     *     </li>
     *     <li>
     *         <b>new</b> — объект, созданный методом или конструктором, который описывается этим контрактом.
     *     </li>
     *     <li>
     *         <b>1</b> — порядковый номер аргумента, то есть сам аргумент под этим порядковым номером.
     *     </li>
     * </ul>
     * </p>
     * @apiNote Позволяет проанализировать контракт и получить обобщённое описание поведения метода или конструктора.
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
