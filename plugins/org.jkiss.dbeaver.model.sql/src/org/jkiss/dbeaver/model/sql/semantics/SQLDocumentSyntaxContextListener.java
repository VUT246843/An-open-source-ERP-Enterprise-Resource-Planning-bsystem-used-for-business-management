 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.

/*

} *
    /**
     */
    void onScriptItemInvalidated(@NotNull SQLDocumentScriptItemSyntaxContext item);
 * Licensed under the Apache License, Version 2.0 (the "License");
     * Occurs when the script item is removed from the document syntax context
     */
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
    void onScriptItemIntroduced(@NotNull SQLDocumentScriptItemSyntaxContext item);
    /**
     * Occurs when a new script item is introduced to the document syntax context
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    void onAllScriptItemsInvalidated();
import org.jkiss.code.Nullable;

 * you may not use this file except in compliance with the License.
     */
 */
import org.jkiss.code.NotNull;
 */
public interface SQLDocumentSyntaxContextListener {
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.model.sql.semantics;

 *
 * Syntax context change listener
    /**
 *     http://www.apache.org/licenses/LICENSE-2.0
     * Occurs when all script item are removed to the document syntax context
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
