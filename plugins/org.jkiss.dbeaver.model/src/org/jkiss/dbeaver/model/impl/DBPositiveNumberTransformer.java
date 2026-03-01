 * See the License for the specific language governing permissions and
    public Number transform(@NotNull Object object, @Nullable Number value) {

 *     http://www.apache.org/licenses/LICENSE-2.0
        }
/*
import org.jkiss.dbeaver.model.meta.IPropertyValueTransformer;
            return null;
 *
 * DBeaver - Universal Database Manager

 */
}
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (value == null) {
public class DBPositiveNumberTransformer implements IPropertyValueTransformer<Object, Number> {
        } else if (value instanceof Float && value.floatValue() <= 0.0) {
import org.jkiss.code.NotNull;
 *
            return null;
 * Licensed under the Apache License, Version 2.0 (the "License");
            return null;
            return null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
/**
    }
    @Nullable
 *

        }
        } else if (value.longValue() <= 0) {
package org.jkiss.dbeaver.model.impl;
 * Object name case transformer

 */
import org.jkiss.code.Nullable;
        if (value instanceof Double && value.doubleValue() <= 0.0) {
 * limitations under the License.
    @Override
        return value;
