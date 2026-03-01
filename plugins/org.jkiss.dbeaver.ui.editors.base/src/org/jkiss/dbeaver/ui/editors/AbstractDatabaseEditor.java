    }
 * DBeaver - Universal Database Manager
 *

            editorImage.dispose();
    {
import org.eclipse.ui.IEditorSite;
    public void doSave(IProgressMonitor monitor)
    @Override
 */
        editorImage = input.getImageDescriptor().createImage();

import org.eclipse.ui.PartInitException;
    @Override
    }
    @Override
        }
        return (INPUT_TYPE)super.getEditorInput();
 * limitations under the License.
    @Override

        if (editorImage != null) {

{
import org.eclipse.ui.IEditorInput;
    {
    @SuppressWarnings("unchecked")
        throws PartInitException
    public INPUT_TYPE getEditorInput()
    @Override
        return false;
        this.setPartName(input.getName());
    {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
    public void doSaveAs()
 * See the License for the specific language governing permissions and
        }
    @Override
        return false;
    public boolean isSaveAsAllowed()
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
            editorImage = null;
    }
public abstract class AbstractDatabaseEditor<INPUT_TYPE extends IEditorInput> extends EditorPart implements IDatabaseEditor, DBPContextProvider
package org.jkiss.dbeaver.ui.editors;
    public void dispose()

 * you may not use this file except in compliance with the License.
        super.dispose();


            listener.dispose();
    }

    private Image editorImage;

        super.setSite(site);
    {
    {
 * Licensed under the Apache License, Version 2.0 (the "License");

/**
        }
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.core.runtime.IProgressMonitor;
    public boolean isActiveTask() {
        return false;
}    {
import org.jkiss.dbeaver.model.DBPContextProvider;
 *
            listener = null;
    public boolean isDirty()
        super.setInput(input);
    @Override
    private DatabaseEditorListener listener;
 * AbstractDatabaseEditor
import org.eclipse.ui.part.EditorPart;
    {
    public void init(IEditorSite site, IEditorInput input)
            listener = new DatabaseEditorListener(this);
        if (listener == null) {
 *
 */
 * Unless required by applicable law or agreed to in writing, software
        if (listener != null) {
        this.setTitleImage(editorImage);
import org.eclipse.swt.graphics.Image;
    }
 * You may obtain a copy of the License at
