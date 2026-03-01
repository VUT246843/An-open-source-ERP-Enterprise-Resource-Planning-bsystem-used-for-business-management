 *
{
 */
import java.lang.annotation.Target;
 * See the License for the specific language governing permissions and
/**

 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * Property

public @interface DBSerializable
 * You may obtain a copy of the License at
 *
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
     * Points to DBPObjectSerializer implementation
 * Licensed under the Apache License, Version 2.0 (the "License");
@Retention(RetentionPolicy.RUNTIME)
 * distributed under the License is distributed on an "AS IS" BASIS,


     * Object serializer ID.
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
package org.jkiss.dbeaver.model.meta;
    String value(); //NON-NLS-1
@Target(value = {ElementType.TYPE})
 * limitations under the License.
/*
}
     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
    /**
