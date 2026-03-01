 *
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
    // Property value can be provided by context
import java.lang.annotation.RetentionPolicy;
}
package org.jkiss.dbeaver.model.auth;
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
public @interface AuthProperty {

 * You may obtain a copy of the License at
/**
 */
/*

 * distributed under the License is distributed on an "AS IS" BASIS,

    String authContextType() default "";
import java.lang.annotation.Retention;
 */
 *
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
@Target(value = {ElementType.METHOD})
 * DBeaver - Universal Database Manager
 * Auth Property
 *
@Retention(RetentionPolicy.RUNTIME)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
