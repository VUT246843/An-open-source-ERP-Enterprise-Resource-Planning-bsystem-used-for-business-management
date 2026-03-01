import java.util.Set;
import org.jkiss.dbeaver.Log;
    public Control createControl(Composite parent) {

import org.jkiss.dbeaver.debug.ui.Widgets;
import org.eclipse.core.runtime.ListenerList;
    private ListenerList<IPropertyListener> propertyListeners = new ListenerList<>();
    }
        }
        editorParent.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_LIST_BACKGROUND));
    }
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
            listener.propertyChanged(this, property);
        // do nothing
    }
        IStatusLineManager statusLine = ActionBars.extractStatusLineManager(partSite);
            }
    }
    public void removePropertyListener(IPropertyListener listener) {
import org.eclipse.swt.widgets.Composite;
        editorParent.dispose();
        for (int anAutosave : autosave) {
        return false;
        // clear status line
            autoSaveProperties.remove(anAutosave);

        }
        this.description = description;
            // update even if the same in case attributes have changed
        editor.addPropertyListener((source, propId) -> {
                    editor.doSave();
    protected void unregisterAutosaveProperties(int[] autosave) {
 *

    public void doSave(IProgressMonitor monitor) {

 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)

            log.log(e.getStatus());
/*
import org.eclipse.jface.viewers.IStructuredSelection;
        return editor.createControl(editorParent);
    }
    }
            firePropertyChange(IWorkbenchPartConstants.PROP_DIRTY);

    @Override
 */
        if (statusLine != null) {
import org.eclipse.core.runtime.CoreException;
        Object input = null;
            statusLine.setErrorMessage(null);


    @Override
    public void display(IStructuredSelection selection) {
                }
                statusLine.setErrorMessage(e.getMessage());
    private static final Log log = Log.getLog(DatabaseDebugDetailPane.class);
    }
        if (statusLine != null) {
        this.id = id;
}
        return editor;

    @Override
    }
    }
        IStatusLineManager statusLine = ActionBars.extractStatusLineManager(partSite);
    @Override
            editor.doSave();

    @Override
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPartConstants;
        editor.setMnemonics(false);

    }
        propertyListeners.remove(listener);

import org.eclipse.core.runtime.IProgressMonitor;

        try {

import org.eclipse.jface.viewers.ISelectionProvider;
        return null;
    public void doSaveAs() {
        return id;
        }
    private Composite editorParent;
        editor = null;
    @Override
    }
    @Override
    }
    private String description;
import org.eclipse.ui.IWorkbenchPartSite;
    private String id;
        return description;

        return name;
            if (statusLine != null) {
    protected void registerAutosaveProperties(int[] autosave) {
                    log.log(e.getStatus());
        }
                    return;
        return isDirty() && editor.getStatus().isOK();
    public void dispose() {
    private EDITOR editor;
    }
        editor = createEditor(editorParent);
 * DBeaver - Universal Database Manager
        for (int anAutosave : autosave) {
    }
            }

import org.eclipse.debug.ui.IDetailPane3;
    public boolean setFocus() {
    private IWorkbenchPartSite partSite;


    public boolean isSaveAsAllowed() {
    }
    @Override

 *
    }
import org.eclipse.ui.IPropertyListener;

        propertyListeners.clear();
            } else {
            autoSaveProperties.add(anAutosave);
package org.jkiss.dbeaver.debug.ui.details;
    @Override
    }
        autoSaveProperties.clear();
        editorParent = Widgets.createComposite(parent, 1, 1, GridData.FILL_BOTH);
        });

    private String name;
                log.log(e.getStatus());
        this.name = name;
    @Override
            if (autoSaveProperties.contains(propId)) {
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        return false;
        }
            input = selection.getFirstElement();

    @Override
        if (selection != null && selection.size() == 1) {

import java.util.HashSet;
        propertyListeners.add(listener);

            editor.setInput(input);
 * See the License for the specific language governing permissions and
    public void init(IWorkbenchPartSite partSite) {
 *
import org.jkiss.dbeaver.ui.ActionBars;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                try {
        try {
        }
    public DatabaseDebugDetailPane(String name, String description, String id) {
    protected abstract EDITOR createEditor(Composite parent);

            statusLine.setErrorMessage(null);
    public void addPropertyListener(IPropertyListener listener) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }

    protected void firePropertyChange(int property) {
    @Override

        }
    public String getID() {
    @Override
        for (IPropertyListener listener : propertyListeners) {
        this.partSite = partSite;


        return editor != null && editor.isDirty();
    public boolean isDirty() {
        partSite = null;
    public ISelectionProvider getSelectionProvider() {

        } catch (CoreException e) {
import org.eclipse.debug.ui.IDetailPane2;

    }

import org.eclipse.jface.action.IStatusLineManager;
 * limitations under the License.
        }
import org.eclipse.swt.layout.GridData;
 * you may not use this file except in compliance with the License.
    protected EDITOR getEditor() {

    public String getDescription() {
        } catch (CoreException e) {
    }
public abstract class DatabaseDebugDetailPane<EDITOR extends DatabaseDebugDetailEditor>
 *     http://www.apache.org/licenses/LICENSE-2.0
    public String getName() {
    @Override
import org.eclipse.swt.SWT;
    @Override
    private Set<Integer> autoSaveProperties = new HashSet<>();
        implements IDetailPane2, IDetailPane3 {
                } catch (CoreException e) {
    }
    public boolean isSaveOnCloseNeeded() {
        EDITOR editor = getEditor();
