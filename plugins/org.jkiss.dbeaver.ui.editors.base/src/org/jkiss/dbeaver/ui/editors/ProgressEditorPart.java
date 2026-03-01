import org.eclipse.ui.part.EditorPart;


    private final IDatabaseEditor ownerEditor;
        return false;
    }
            if (result == null) {
        this.ownerEditor = ownerEditor;
            ownerEditor.recreateEditorControl();
import org.jkiss.dbeaver.ui.editors.internal.EditorsMessages;
        }

                        IWorkbenchPage activePage = workbenchWindow.getActivePage();
        button.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
import org.jkiss.dbeaver.runtime.DBWorkbench;

import org.eclipse.swt.SWT;

import org.jkiss.dbeaver.ui.css.CSSUtils;
            loadingService,
                            activePage.closeEditor(ownerEditor, false);
    }
    }
            }
        createProgressPane(parent);


    public void dispose() {
import org.eclipse.core.runtime.IProgressMonitor;
    public void init(IEditorSite site, IEditorInput input) {
        }
                });
            } catch (Throwable ex) {
    }
        if (pendingJob != null) {
            throws InvocationTargetException, InterruptedException
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        }
        @Override

        } else {
                // Activate entity editor (we have changed inner editors and need to force contexts activation).
            }
                child.dispose();
            return null;
                progressCanvas.removePaintListener(this);
/*
public class ProgressEditorPart extends EditorPart {

    private void createProgressPane(final Composite parent) {
        if (result == null) {
        setPartName(input.getName());
            createInitializerPlaceholder();
                // Close editor
        }
 * you may not use this file except in compliance with the License.
    private class InitNodeVisualizer extends ProgressLoaderVisualizer<IDatabaseEditorInput> implements PaintListener {
            } finally {
    public Composite destroyAndReturnParent() {
                UIUtils.asyncExec(() ->
                throw new InvocationTargetException(ex);
        setSite(site);

                    if (workbenchWindow != null) {
            initEntityEditor(result);

 */
package org.jkiss.dbeaver.ui.editors;
            new InitNodeVisualizer(loadingService));
            return false;
    }
        } catch (Exception e) {

        return parent;
import org.eclipse.ui.IEditorInput;
 * ProgressEditorPart
 */
        CSSUtils.setExcludeFromStyling(progressCanvas);

            }
            scheduleEditorLoad();
import org.jkiss.dbeaver.ui.controls.ProgressLoaderVisualizer;

        final Point buttonSize = button.computeSize(SWT.DEFAULT, SWT.DEFAULT);
        InitNodeService loadingService = new InitNodeService();
        protected InitNodeService()
        if (input.canLoadImmediately()) {
            DBWorkbench.getPlatformUI().showError("Editor init", "Can't initialize editor", e);
            super.completeLoading(result);
    }
        Composite parent = progressCanvas.getParent();

import org.eclipse.osgi.util.NLS;
        progressCanvas.dispose();


        final DatabaseLazyEditorInput input = getEditorInput();
                        if (activePage != null) {
        final ControlEditor progressOverlay = new ControlEditor(progressCanvas);
        @Override
    private void createInitializerPlaceholder() {
    }
                    IWorkbenchWindow workbenchWindow = ownerEditor.getSite().getWorkbenchWindow();

            e.gc.drawText(NLS.bind(EditorsMessages.progress_editor_initializing_text, getEditorInput().getName()), 5, 5, true);
            return;
    }
    }
    }
        @Override
        }
            }
 * DBeaver - Universal Database Manager
        setInput(input);
    private Composite progressCanvas;
    private void initEntityEditor(IDatabaseEditorInput result) {
        public void paintControl(PaintEvent e) {
        progressOverlay.minimumWidth = buttonSize.x;
 *     http://www.apache.org/licenses/LICENSE-2.0
            ActionUtils.evaluatePropertyState("org.jkiss.dbeaver.ui.editors.entity.hasSource");
        UIExecutionQueue.queueExec(pendingJob::schedule);
import java.lang.reflect.InvocationTargetException;


import org.eclipse.ui.IWorkbenchPage;
        public void completeLoading(IDatabaseEditorInput result) {
import org.eclipse.swt.graphics.Point;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            super.visualizeLoading();
        public IDatabaseEditorInput evaluate(@NotNull DBRProgressMonitor monitor)
import org.eclipse.ui.IWorkbenchWindow;

    }

        }));
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
        progressOverlay.setEditor(button);
import org.jkiss.code.NotNull;
            super(loadingService, progressCanvas);

        progressOverlay.minimumHeight = buttonSize.y;
        parentControl = null;
    public void createPartControl(Composite parent) {
        parentControl.setFocus();
            ownerEditor.init(ownerEditor.getEditorSite(), result);
 *
    }
        button.setText(EditorsMessages.progress_editor_uninitialized_text);
                        }
}
        }
        @Override
import org.eclipse.swt.events.PaintListener;
    private class InitNodeService extends AbstractLoadService<IDatabaseEditorInput> {
        public Object getFamily() {
    public void doSaveAs() {
        this.parentControl = parent;
        try {
        super.dispose();
    }
        }
            } else {
            try {
        }
        return (DatabaseLazyEditorInput) super.getEditorInput();
            for (Control child : progressCanvas.getChildren()) {
                return getEditorInput().initializeRealInput(monitor);
                {
    }

    }
    public boolean isSaveAsAllowed() {
import org.eclipse.swt.widgets.Control;
    public void doSave(IProgressMonitor monitor) {

    public void setPartName(String newName) {
import org.eclipse.swt.widgets.Button;
    }
            progressCanvas.addPaintListener(this);
        pendingJob = LoadingJob.createService(
        }


        public InitNodeVisualizer(InitNodeService loadingService) {
import org.eclipse.swt.widgets.Composite;
            if (!progressCanvas.isDisposed()) {
    public DatabaseLazyEditorInput getEditorInput() {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.load.AbstractLoadService;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.ui.IEditorSite;
    public void setFocus() {

        {
 * Unless required by applicable law or agreed to in writing, software
    public boolean isDirty() {
        button.setImage(DBeaverIcons.getImage(UIIcon.SQL_CONNECT));
    public ProgressEditorPart(IDatabaseEditor ownerEditor) {
/**
    public synchronized boolean scheduleEditorLoad() {
            super("Initialize entity editor");
    private Composite parentControl;
        {
import org.jkiss.dbeaver.ui.*;
    }

        progressCanvas = new Composite(parent, SWT.NONE);
                pendingJob = null;
    private volatile LoadingJob<IDatabaseEditorInput> pendingJob;
    @Override
 * See the License for the specific language governing permissions and
import org.eclipse.swt.custom.ControlEditor;
import org.eclipse.swt.events.SelectionListener;

        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        final Button button = new Button(progressCanvas, SWT.PUSH);
 *
        super.setPartName(newName);
                UIUtils.asyncExec(() -> EditorUtils.refreshPartContexts(ownerEditor));
            scheduleEditorLoad();
                    }
        return false;
        return true;
 * Copyright (C) 2010-2025 DBeaver Corp and others

