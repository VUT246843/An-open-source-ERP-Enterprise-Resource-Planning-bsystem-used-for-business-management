import org.eclipse.core.runtime.IStatus;

        return dirty;
        if (isMnemonics()) {
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
import org.eclipse.core.runtime.CoreException;
        if (!suppressPropertyChanges) {

 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
    protected boolean isMnemonics() {

 *
    public abstract void doSave() throws CoreException;

 * Licensed under the Apache License, Version 2.0 (the "License");
        return LegacyActionTools.removeMnemonics(text);
    public abstract IStatus getStatus();
    public boolean isDirty() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    protected void dispose() {
        }
import org.eclipse.jface.action.LegacyActionTools;
    private boolean mnemonics = true;
    protected void suppressPropertyChanges(boolean suppress) {
        listeners.remove(listener);
 *





    }
}

    private boolean suppressPropertyChanges = false;
import org.eclipse.ui.IWorkbenchPartConstants;

 * See the License for the specific language governing permissions and
            this.dirty = dirty;
    }
        listeners.add(listener);
    public void removePropertyListener(IPropertyListener listener) {
    protected String processMnemonics(String text) {
 */
            return text;
import org.eclipse.ui.IPropertyListener;

        }
    public void addPropertyListener(IPropertyListener listener) {


        suppressPropertyChanges = suppress;
import org.eclipse.swt.widgets.Control;
    public abstract void setInput(Object input) throws CoreException;

    }
        this.dirty = true;

            for (IPropertyListener listener : listeners) {
    public abstract Object getInput();
    protected void setDirty(int propId) {
public abstract class DatabaseDebugDetailEditor {
    public void setMnemonics(boolean mnemonics) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                listener.propertyChanged(this, propId);
package org.jkiss.dbeaver.debug.ui.details;
import org.eclipse.swt.widgets.Composite;
    public abstract Control createControl(Composite parent);
    }
 * limitations under the License.
        return mnemonics;
        listeners.clear();
    }

        firePropertyChange(propId);
        if (this.dirty != dirty) {
/*
 *     http://www.apache.org/licenses/LICENSE-2.0

    }
        }
    public abstract void setFocus();
    }
    protected void firePropertyChange(int propId) {
    }
        this.mnemonics = mnemonics;
    protected void setDirty(boolean dirty) {

            firePropertyChange(IWorkbenchPartConstants.PROP_DIRTY);
    private boolean dirty = false;
 * DBeaver - Universal Database Manager


    private ListenerList<IPropertyListener> listeners = new ListenerList<>();
 * Unless required by applicable law or agreed to in writing, software
    }
            }

import org.eclipse.core.runtime.ListenerList;
 *
    }
