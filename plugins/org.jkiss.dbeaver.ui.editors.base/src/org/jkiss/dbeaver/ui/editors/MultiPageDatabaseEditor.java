    public void dispose()
        super.createPages();
    public static final String PARAMETER_ACTIVE_PAGE = "activePage";
 */


        if (listener != null) {
package org.jkiss.dbeaver.ui.editors;
import org.eclipse.ui.PartInitException;

import org.jkiss.dbeaver.ui.css.CSSUtils;
import org.eclipse.swt.widgets.Composite;
            listener.dispose();
public abstract class MultiPageDatabaseEditor extends MultiPageAbstractEditor implements IDatabaseEditor, DBPContextProvider
    @Override
    }
    @Override

    @Nullable
    }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return getEditorInput().getExecutionContext();
        super.setContainerStyles();
 * You may obtain a copy of the License at
}

        return (IDatabaseEditorInput)super.getEditorInput();
        listener = new DatabaseEditorListener(this);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
    }
        }

 *
import org.jkiss.code.Nullable;
 * limitations under the License.
        if (container instanceof CTabFolder && !container.isDisposed()){
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
        return false;
            CSSUtils.markConnectionTypeColor(container);
 * DBeaver - Universal Database Manager

        throws PartInitException
 * Unless required by applicable law or agreed to in writing, software
    private DatabaseEditorListener listener;
 */
    protected void createPages()
            listener.dispose();
{
/**

    {
    public IDatabaseEditorInput getEditorInput() {
        Composite container = getContainer();

import org.eclipse.ui.IEditorSite;
 *
        DatabaseEditorUtils.setPartBackground(this, getContainer());
    {
    protected void setContainerStyles() {
        }
    @Override
    }
    protected void setInput(IEditorInput input) {

/*
import org.eclipse.swt.custom.CTabFolder;
    public boolean isActiveTask() {
    }
    public DBCExecutionContext getExecutionContext() {
 * MultiPageDatabaseEditor
    public void init(IEditorSite site, IEditorInput input)
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        super.setInput(input);
import org.jkiss.dbeaver.model.DBPContextProvider;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static final String PARAMETER_ACTIVE_FOLDER = "activeFolder";

    {
 * you may not use this file except in compliance with the License.
        }
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
    @Override
import org.eclipse.ui.IEditorInput;

        super.init(site, input);
 *
    @Override
        if (listener != null) {
    @Override
        super.dispose();
    @Override
