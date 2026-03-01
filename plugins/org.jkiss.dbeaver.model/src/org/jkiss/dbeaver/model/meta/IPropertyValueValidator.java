

 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    boolean isValidValue(@NotNull OBJECT_TYPE object, @Nullable PROP_TYPE value)
 */
 * Value validator
package org.jkiss.dbeaver.model.meta;
 *
 * limitations under the License.
 */
import org.jkiss.code.NotNull;
}
        throws IllegalArgumentException;

 * DBeaver - Universal Database Manager
public interface IPropertyValueValidator<OBJECT_TYPE, PROP_TYPE> {
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");

 * Copyright (C) 2010-2025 DBeaver Corp and others
/*
 *

 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.Nullable;
/**
