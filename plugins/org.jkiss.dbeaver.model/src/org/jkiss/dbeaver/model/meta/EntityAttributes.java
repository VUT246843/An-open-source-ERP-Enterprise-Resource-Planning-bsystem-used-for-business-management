
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
 *
    String description() default "";
@Target(value = {ElementType.METHOD})

import java.lang.annotation.RetentionPolicy;
    int order() default Integer.MAX_VALUE;
 */

    String property();
 */
 * See the License for the specific language governing permissions and
public @interface EntityAttributes
package org.jkiss.dbeaver.model.meta;
 * EntityAttributes
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
import java.lang.annotation.Target;
} * limitations under the License.
import java.lang.annotation.Retention;
 *
/*
    String category() default "";
 * Copyright (C) 2010-2024 DBeaver Corp and others

import java.lang.annotation.ElementType;

 * distributed under the License is distributed on an "AS IS" BASIS,

@Retention(RetentionPolicy.RUNTIME)
 * Licensed under the Apache License, Version 2.0 (the "License");
{
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
 *
