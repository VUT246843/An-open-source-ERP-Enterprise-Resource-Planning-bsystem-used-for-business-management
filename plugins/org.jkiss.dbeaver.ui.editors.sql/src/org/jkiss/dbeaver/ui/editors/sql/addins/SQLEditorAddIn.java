 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    void cleanup(@NotNull SQLEditor editor);
 * See the License for the specific language governing permissions and
/**
 */

    /**
 * you may not use this file except in compliance with the License.
    void init(@NotNull SQLEditor editor);
 * Unless required by applicable law or agreed to in writing, software
     * Cleanup this instance of the add-in.
 */

/*
    PrintWriter getServerOutputConsumer();
     */
     */
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ui.editors.sql.addins;
    
 * limitations under the License.
    
 * distributed under the License is distributed on an "AS IS" BASIS,
     * Initialize add-in and establish any initial interconnections with the editor instance.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
    
 * DBeaver - Universal Database Manager
     * Can be null, if add-in doesn't wish to consume server output.
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
}
    @Nullable
    /**
     * Obtain PrintWriter to feed it with database server output if any.
import java.io.PrintWriter;
 *
public interface SQLEditorAddIn {
     */
 * An instance of the particular SQL Editor Add-in being associated with an instance of the SQL Editor.
import org.jkiss.code.Nullable;
 * You may obtain a copy of the License at

 *
    /**
