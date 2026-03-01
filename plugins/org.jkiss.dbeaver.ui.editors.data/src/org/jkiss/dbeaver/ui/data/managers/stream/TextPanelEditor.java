 * Unless required by applicable law or agreed to in writing, software
    @Override
 * You may obtain a copy of the License at
                } catch (CoreException e) {
            public void init(IEditorSite site, IEditorInput input) throws PartInitException {
        return new TextEditorPart() {
 * limitations under the License.
/*
 *
            @Override
        // Override init function because standard is VEEERY slow
    protected TextEditorPart createEditorParty(IValueController valueController) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *


                    doSetInput(input);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return ".txt";
    protected String getFileExtension() {
 *
 * you may not use this file except in compliance with the License.
    }
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.data.managers.AbstractTextPanelEditor;
    }
* TextPanelEditor

        return "dbeaver-txt";
    @Override
    protected String getFileFolderName() {

import org.eclipse.ui.PartInitException;
                    throw new PartInitException("Error initializing panel text editor", e);
 * DBeaver - Universal Database Manager
    @Override
}
                }
import org.jkiss.dbeaver.ui.data.IValueController;
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ui.data.managers.stream;
import org.eclipse.ui.IEditorSite;
                setSite(site);
    }
/**
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IEditorInput;
 */
*/
                try {
public class TextPanelEditor extends AbstractTextPanelEditor<TextEditorPart> {
        };

 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
