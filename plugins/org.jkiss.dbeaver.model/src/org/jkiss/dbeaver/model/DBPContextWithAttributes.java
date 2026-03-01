     * Removes context attribute
 */

import org.jkiss.code.NotNull;

 * you may not use this file except in compliance with the License.
 */
 * Abstract context with attributes.
}
    void removeContextAttribute(@NotNull String attributeName);
     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**

    <T> void setContextAttribute(@NotNull String attributeName, @Nullable T attributeValue);
 * Attributes are valid only during implementor Java object live time.
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull

     */
 * Licensed under the Apache License, Version 2.0 (the "License");

 * Unless required by applicable law or agreed to in writing, software
     * Sets context attribute
/**

import java.util.Map;
 * All attributes will be cleared after context close.

 * distributed under the License is distributed on an "AS IS" BASIS,
    <T> T getContextAttribute(@NotNull String attributeName);
import org.jkiss.code.Nullable;
 *
     */
 *
public interface DBPContextWithAttributes {
 * Copyright (C) 2010-2025 DBeaver Corp and others

 * limitations under the License.
/*
 * See the License for the specific language governing permissions and
     * Returns copy of all context attributes
     */
 *
 * You may obtain a copy of the License at
    Map<String, ?> getContextAttributes();
package org.jkiss.dbeaver.model;
 * DBeaver - Universal Database Manager
    /**
     * Returns attribute value by name.
    /**
    /**
