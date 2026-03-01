 *     http://www.apache.org/licenses/LICENSE-2.0
        BaseTextEditor editor = BaseTextEditor.getTextEditor(HandlerUtil.getActiveEditor(event));
 * See the License for the specific language governing permissions and
        if (editor == null) {
        return null;
    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.eclipse.ui.handlers.HandlerUtil;

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.core.commands.ExecutionException;
        editor.saveToExternalFile();
 * DBeaver - Universal Database Manager
} * You may obtain a copy of the License at
    @Override

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*

 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * Unless required by applicable law or agreed to in writing, software
public class SaveTextFileHandler extends AbstractTextHandler {
import org.eclipse.core.commands.ExecutionEvent;
 */
package org.jkiss.dbeaver.ui.editors.text.handlers;
 *
        }
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
            return null;

    }
import org.jkiss.dbeaver.ui.editors.text.BaseTextEditor;
 * you may not use this file except in compliance with the License.
 * limitations under the License.
