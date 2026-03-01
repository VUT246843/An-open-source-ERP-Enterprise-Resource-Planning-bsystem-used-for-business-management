 * See the License for the specific language governing permissions and
     * @param row       the visual row number
 * You may obtain a copy of the License at
 * limitations under the License.
}
     *
    @Nullable

 * distributed under the License is distributed on an "AS IS" BASIS,
     */
import org.jkiss.code.NotNull;

 * Unless required by applicable law or agreed to in writing, software
     * @return the background color for the cell, or {@code null} to use the default background color
 *
 *
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others

     * @param attribute the attribute
/**
    /**
     * @param attribute the attribute
 * you may not use this file except in compliance with the License.
    String getCellBackground(@NotNull DBDAttributeBinding attribute, int row);
 * Decorates an attribute.

import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
     * Provides a background color for the given attribute at given row.
     *
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.model.data;
     * @param row       the visual row number
     */
     * @return the foreground color for the cell, or {@code null} to use the default foreground color
    String getCellForeground(@NotNull DBDAttributeBinding attribute, int row);
    /**
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


/*
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
 */
public interface DBDAttributeDecorator {
     * Provides a foreground color for the given attribute at given row.
