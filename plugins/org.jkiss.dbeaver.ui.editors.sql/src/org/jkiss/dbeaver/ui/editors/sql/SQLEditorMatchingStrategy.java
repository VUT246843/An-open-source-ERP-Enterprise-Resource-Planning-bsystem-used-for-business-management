 * limitations under the License.
import org.jkiss.dbeaver.Log;
 * You may obtain a copy of the License at
 *
        } catch (Exception e) {

        }
import org.eclipse.ui.IEditorInput;
            if (refInput != null) {
package org.jkiss.dbeaver.ui.editors.sql;
import java.io.File;
            final IEditorInput refInput = editorRef.getEditorInput();
            }
import org.jkiss.dbeaver.ui.editors.EditorUtils;
public class SQLEditorMatchingStrategy implements IEditorMatchingStrategy
    }
                    return true;
            log.debug("Error getting input from editor ref", e);
    public boolean matches(IEditorReference editorRef, IEditorInput input) {
 * you may not use this file except in compliance with the License.
import org.eclipse.ui.IEditorMatchingStrategy;
        try {

import org.eclipse.ui.IEditorReference;
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return false;
}
            return false;

 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 *

                final File refFile = EditorUtils.getLocalFileFromInput(refInput);
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
                if (refFile != null && refFile.equals(inputFile)) {
{
 * DBeaver - Universal Database Manager
        final File inputFile = EditorUtils.getLocalFileFromInput(input);
 *     http://www.apache.org/licenses/LICENSE-2.0
                }
 *
    static protected final Log log = Log.getLog(SQLEditorMatchingStrategy.class);
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
