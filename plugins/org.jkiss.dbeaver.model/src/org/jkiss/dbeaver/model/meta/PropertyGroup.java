     * ID of group.
 * DBeaver - Universal Database Manager

    /**
    String name() default "";
 * Licensed under the Apache License, Version 2.0 (the "License");
public @interface PropertyGroup

 * See the License for the specific language governing permissions and
}
 *

import java.lang.annotation.RetentionPolicy;
 *     http://www.apache.org/licenses/LICENSE-2.0
@Retention(RetentionPolicy.RUNTIME)
/*
{
package org.jkiss.dbeaver.model.meta;
    String groupId() default "";

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
 *

 */
 * You may obtain a copy of the License at


    String id() default "";
 * you may not use this file except in compliance with the License.
import java.lang.annotation.ElementType;
    String category() default "";
 * distributed under the License is distributed on an "AS IS" BASIS,
/**

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    String description() default "";
 *
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
     */

     * Adds prefix to the children prop ids if the value is not empty.
    int order() default Integer.MAX_VALUE;
 */

@Target(value = {ElementType.METHOD})
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Property group
