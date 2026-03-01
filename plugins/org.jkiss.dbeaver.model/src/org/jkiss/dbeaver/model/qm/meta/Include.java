 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
 */
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.lang.annotation.ElementType;
 *

 * distributed under the License is distributed on an "AS IS" BASIS,
/**
package org.jkiss.dbeaver.model.qm.meta;

 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
import java.lang.annotation.Target;
 * See the License for the specific language governing permissions and
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)

/*
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
 *     http://www.apache.org/licenses/LICENSE-2.0
public @interface Include {
 *
}
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
 * Includes fields for serialization in query manager info objects.
