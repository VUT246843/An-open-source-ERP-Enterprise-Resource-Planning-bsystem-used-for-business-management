}
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
 *
 * limitations under the License.
import java.lang.annotation.ElementType;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * You may obtain a copy of the License at

 *
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
@Retention(RetentionPolicy.RUNTIME)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 */
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.lang.annotation.Target;
@Target(ElementType.METHOD)
 * See the License for the specific language governing permissions and
public @interface MetaData {
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
    String name() default "";
package org.jkiss.dbeaver.model.meta;
 * DBeaver - Universal Database Manager
