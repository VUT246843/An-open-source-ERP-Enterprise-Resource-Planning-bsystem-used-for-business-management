

    String category() default "";
{
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * EntityAssociations

@Target(value = {ElementType.METHOD})
    String description() default "";
} * Licensed under the Apache License, Version 2.0 (the "License");

import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
/**

 * You may obtain a copy of the License at
 *
 */
public @interface EntityAssociations
 * Copyright (C) 2010-2024 DBeaver Corp and others

    String property();
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
    int order() default Integer.MAX_VALUE;
import java.lang.annotation.ElementType;
 * limitations under the License.
 *
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
 * you may not use this file except in compliance with the License.
/*
 *
package org.jkiss.dbeaver.model.meta;
 * See the License for the specific language governing permissions and
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
