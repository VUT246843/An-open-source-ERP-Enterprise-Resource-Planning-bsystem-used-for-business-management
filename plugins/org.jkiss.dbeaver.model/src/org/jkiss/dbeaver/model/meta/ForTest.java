 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.lang.annotation.ElementType;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import java.lang.annotation.RetentionPolicy;
/**
 */
 * Method or
/*

 * limitations under the License.
 * You may obtain a copy of the License at
import java.lang.annotation.Retention;
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.meta;
 * Unless required by applicable law or agreed to in writing, software
 *

public @interface ForTest
}

{
import java.lang.annotation.Target;
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
@Target(value = {ElementType.METHOD, ElementType.CONSTRUCTOR})

@Retention(RetentionPolicy.SOURCE)
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
