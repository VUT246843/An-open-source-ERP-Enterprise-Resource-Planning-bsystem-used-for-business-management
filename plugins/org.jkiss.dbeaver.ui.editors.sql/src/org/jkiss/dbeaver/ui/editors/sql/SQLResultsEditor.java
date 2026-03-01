            return adapter.cast(viewer);
        firePropertyChange(IEditorPart.PROP_DIRTY);
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
 *
        return viewer.isDirty();
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void createPartControl(Composite parent) {

        setPartName(input.getName());
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
    }
    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
import org.eclipse.jface.viewers.SelectionChangedEvent;
        viewer.refresh();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        viewer.doSave(monitor);
 * DBeaver - Universal Database Manager

    }
    }

        return super.getAdapter(adapter);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.ui.part.EditorPart;
        viewer.addListener(this);

import org.eclipse.core.runtime.IProgressMonitor;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        final SQLResultsEditorInput input = (SQLResultsEditorInput) getEditorInput();
    }
    @Override

 *

import org.eclipse.ui.PartInitException;
    public void handleResultSetSelectionChange(SelectionChangedEvent event) {
    }
 * You may obtain a copy of the License at
    public void handleResultSetLoad() {
        }
    public void doSave(IProgressMonitor monitor) {
    }
    @Override
 */
/*
}
        if (viewer != null) {

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override

    }
    public void dispose() {
        super.dispose();
    @Override
        if (adapter.isInstance(viewer)) {
    @Override
 * you may not use this file except in compliance with the License.
    }
public class SQLResultsEditor extends EditorPart implements IResultSetListener {
    private ResultSetViewer viewer;
    }
            viewer.removeListener(this);
    public void doSaveAs() {
        return viewer.isSaveAsAllowed();
    }

    public boolean isSaveAsAllowed() {
            viewer = null;
        setSite(site);
 * limitations under the License.

 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ui.editors.sql;
    @Override
        viewer.getControl().setFocus();
        viewer.doSaveAs();
        getEditorSite().getActionBars().updateActionBars();
    @Override
    @Override
        setInput(input);
    @Override
    public <T> T getAdapter(Class<T> adapter) {
    public boolean isDirty() {
    public void setFocus() {

 *
        setTitleToolTip(input.getToolTipText());
import org.eclipse.ui.IEditorSite;
        getSite().setSelectionProvider(viewer);
    }

        // do nothing
        getEditorSite().getActionBars().updateActionBars();
import org.eclipse.ui.IEditorPart;

    @Override
 * See the License for the specific language governing permissions and
    @Override
    public void handleResultSetChange() {
        viewer = new ResultSetViewer(parent, getSite(), input.getContainer());
    @Override
    }
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetListener;

