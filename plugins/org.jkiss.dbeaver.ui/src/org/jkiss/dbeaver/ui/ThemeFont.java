 */
    String value();
@Target(value = {ElementType.FIELD})
 * Copyright (C) 2010-2024 DBeaver Corp and others
public @interface ThemeFont {
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
 *
    boolean italic() default false;
/*
import java.lang.annotation.Retention;
}
 */
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
@Retention(RetentionPolicy.RUNTIME)
package org.jkiss.dbeaver.ui;

 * limitations under the License.

 * Unless required by applicable law or agreed to in writing, software

 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.lang.annotation.ElementType;
 * Theme font annotation
 * See the License for the specific language governing permissions and

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
    boolean bold() default false;
