import org.jkiss.code.NotNull;
    boolean matches(@NotNull TokenEntry other);
    @Nullable
import org.jkiss.code.Nullable;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
    boolean isInverted();
 * DBeaver - Universal Database Manager
     * @return token type

    /**
/*
    String getString();
 *
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 *
     * @return text fragment corresponding to the token
 * Licensed under the Apache License, Version 2.0 (the "License");
     * Checks if two entries could possibly describe the same concrete token
     */
}
public interface TokenEntry {
 * Represents an information about the token in the text.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
     * @return true if entries could  describe the same concrete token
     * @param other
 */

package org.jkiss.dbeaver.model.sql.parser;
/**
    /**
 * You may obtain a copy of the License at
    /**
    
 * Any member can be null if represents partial information in case of placeholder.


     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
    Enum getTokenType();
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
 * See the License for the specific language governing permissions and
     */
