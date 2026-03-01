 * Licensed under the Apache License, Version 2.0 (the "License");
        }
import org.jkiss.dbeaver.ui.ISearchContextProvider;
 * limitations under the License.
import org.jkiss.dbeaver.ui.editors.SinglePageDatabaseEditor;
 *
 * AbstractSessionEditor
    @Override
 *

        if (executionContext != null) {

    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,

 */
            sessionsViewer.loadSettings(this);
    {
            sessionsViewer = createSessionViewer(executionContext, parent);
    }
    public void createEditorControl(Composite parent) {
    }
            sessionsViewer.refreshSessions();

        return RefreshResult.REFRESHED;
    private SessionManagerViewer sessionsViewer;

 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others

    public RefreshResult refreshPart(Object source, boolean force)
        super.dispose();
public abstract class AbstractSessionEditor extends SinglePageDatabaseEditor<IEditorInput> implements ISearchContextProvider
 *
        if (sessionsViewer != null) {
        return true;
        }
        }
    public <T> T getAdapter(Class<T> adapter) {
    @Override
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    @Override
package org.jkiss.dbeaver.ui.views.session;
        }

            return adapter.cast(this);
 * See the License for the specific language governing permissions and
        //DatabaseEditorUtils.setPartBackground(this, sessionsViewer.getControl());
    @Override
        sessionsViewer.refreshSessions();

        return true;
        return sessionsViewer;
    public boolean performSearch(SearchType searchType) {
 * DBeaver - Universal Database Manager

/*
            sessionsViewer.dispose();
    public void dispose()
    public void setFocus() {
    @Override
            return sessionsViewer.getSessionListControl().performSearch(searchType);
}    @Override
    }
    }
 * you may not use this file except in compliance with the License.
        return super.getAdapter(adapter);

import org.eclipse.ui.IEditorInput;
            setPartName("Sessions - " + executionContext.getDataSource().getContainer().getName());
    }

    protected abstract SessionManagerViewer createSessionViewer(DBCExecutionContext executionContext, Composite parent);
    }
    @Override
    // ISearchContextProvider
        }
{
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isSearchEnabled() {
 * You may obtain a copy of the License at
        final DBCExecutionContext executionContext = getExecutionContext();
/**
        if (sessionsViewer != null) {
    }
            sessionsViewer.getControl().setFocus();

    {


        return false;
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (sessionsViewer != null) {
import org.eclipse.swt.widgets.Composite;
    }
    public boolean isSearchPossible() {
    public SessionManagerViewer getSessionsViewer() {
        if (adapter == ISearchContextProvider.class) {
