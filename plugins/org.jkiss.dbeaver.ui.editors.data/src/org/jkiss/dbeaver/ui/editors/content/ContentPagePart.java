 * This is done for performance reasons for usage within multi-page editors. For example, the {@link MultiPageEditorPart}
    private final IEditorPart editorPart;
 * Unless required by applicable law or agreed to in writing, software
    }
 */

            editorPart.setFocus();
        }
        // delegate changes from the delegated part

        this.editorPart.addPropertyListener(this);
    }
        editorPart.dispose();
    private void createRealPart() throws PartInitException {
import org.eclipse.swt.widgets.Composite;
import org.jkiss.code.NotNull;
        composite.layout(true, true);
 * Licensed under the Apache License, Version 2.0 (the "License");
            editorPart.doSave(monitor);
    public String getTitle() {
        }
    @Override
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void deactivatePart() {
    public void doSaveAs() {

        firePropertyChange(propId);
        // do nothing
 * DBeaver - Universal Database Manager
    }
import org.jkiss.dbeaver.ui.IActiveWorkbenchPart;
import org.jkiss.dbeaver.ui.UIUtils;
        return editorPart.getTitleToolTip();
    @Override
    @Override
            return RefreshResult.IGNORED;
    @Override
        setSite(site);
    @Override
        }

        editorPart.init((IEditorSite) getSite(), getEditorInput());
import org.eclipse.ui.part.EditorPart;
        if (!activated) {
    @Override
        editorPart.removePropertyListener(this);
    }
        }

import org.jkiss.dbeaver.ui.IRefreshablePart;
    @Override

        editorPart.createPartControl(composite);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
}
import org.eclipse.swt.graphics.Image;
 */

import org.eclipse.ui.part.MultiPageEditorPart;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            try {

                activated = true;
import org.eclipse.core.runtime.IAdaptable;
    @Override
    }
    public Image getTitleImage() {
 * initializes part of a page as soon as it was added using an appropriate method.


        return editorPart.getTitle();
            }
        this.composite = composite;
    }
package org.jkiss.dbeaver.ui.editors.content;
    private boolean activated;
    @Override

    public String getTitleToolTip() {
    @Override
    @Override

            editorPart.doSaveAs();
import org.eclipse.core.runtime.IProgressMonitor;
        if (activated && editorPart instanceof IRefreshablePart) {
    public boolean isDirty() {
    public void doSave(IProgressMonitor monitor) {
    }
 * you may not use this file except in compliance with the License.

            } finally {
 * limitations under the License.
 * This can cause severe performance issues when opening several heavyweight parts at once (text editors, etc.).

        return this.editorPart.getAdapter(adapter);
        return activated && editorPart.isDirty();
import org.eclipse.ui.*;
    @Override
        if (activated) {
        if (activated) {
    public void setFocus() {
    }
    }
    public void activatePart() {
        if (activated) {
        setInput(input);


    }

    }
    @Override
            return ((IRefreshablePart) editorPart).refreshPart(source, force);
 *
    public RefreshResult refreshPart(Object source, boolean force) {
    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
    }

    public void createPartControl(Composite composite) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
        super.dispose();
 *
        return activated && editorPart.isSaveAsAllowed();
 *
/**
 * See the License for the specific language governing permissions and

    public void dispose() {
        }
    }

    @Override
        UIUtils.disposeChildControls(composite);
    }
    public void propertyChanged(Object source, int propId) {
    public ContentPagePart(@NotNull IEditorPart editorPart) {
        return editorPart.getTitleImage();
            } catch (PartInitException e) {
 * <p>
        } else {
    public boolean isSaveAsAllowed() {
    }

    private Composite composite;
    }
        this.editorPart = editorPart;
    public <T> T getAdapter(Class<T> adapter) {
                createRealPart();
 * <p>
                throw new IllegalStateException("Error initializing real editor part", e);
/*
    }
public class ContentPagePart extends EditorPart implements IPropertyListener, IActiveWorkbenchPart, IRefreshablePart, IAdaptable {
    @Override
 * A part that mimics the underlying editor part but lazily initializes it upon first activation.
