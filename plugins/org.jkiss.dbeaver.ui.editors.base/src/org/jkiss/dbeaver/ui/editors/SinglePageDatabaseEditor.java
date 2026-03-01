        }
    public abstract void createEditorControl(Composite parent);
        DatabaseEditorUtils.setPartBackground(this, parent);
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    }

    @Nullable
    public void init(IEditorSite site, IEditorInput input)
    private void createLazyEditorPart(Composite parent, final DatabaseLazyEditorInput input) {
    private ProgressEditorPart progressEditorPart;
 * Licensed under the Apache License, Version 2.0 (the "License");
        throws PartInitException
        if (progressEditorPart != null) {
            createEditorControl(parent);
    @Override

 * You may obtain a copy of the License at
    }
        }
package org.jkiss.dbeaver.ui.editors;
{
            progressEditorPart = null;
    public void dispose()
            createEditorControl(parent);
            parent.layout(true, true);
    public final void createPartControl(Composite parent) {



 * See the License for the specific language governing permissions and
 *
            createLazyEditorPart(parent, (DatabaseLazyEditorInput)editorInput);

        return getEditorInput() instanceof DBPContextProvider ? ((DBPContextProvider) getEditorInput()).getExecutionContext() : null;
 * DBeaver - Universal Database Manager
        DatabaseEditorUtils.setPartBackground(this, parent);
    }
    @Override
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.IEditorSite;

import org.eclipse.ui.IEditorInput;
    }
        } else {
    public DBCExecutionContext getExecutionContext() {
 */
public abstract class SinglePageDatabaseEditor<INPUT_TYPE extends IEditorInput> extends AbstractDatabaseEditor<INPUT_TYPE>
        if (editorInput instanceof DatabaseLazyEditorInput) {
    {
    {
/*
        super.init(site, input);
 * Unless required by applicable law or agreed to in writing, software
            Composite parent = progressEditorPart.destroyAndReturnParent();
import org.eclipse.swt.widgets.Composite;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

 *

        progressEditorPart.createPartControl(parent);
        progressEditorPart = new ProgressEditorPart(this);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
        progressEditorPart.init(getEditorSite(), input);
        super.dispose();
    @Override
 * you may not use this file except in compliance with the License.
 * limitations under the License.
        final IEditorInput editorInput = getEditorInput();
/**
    public void recreateEditorControl() {
import org.jkiss.dbeaver.model.DBPContextProvider;

 * SinglePageDatabaseEditor

}
import org.jkiss.code.Nullable;
    @Override
