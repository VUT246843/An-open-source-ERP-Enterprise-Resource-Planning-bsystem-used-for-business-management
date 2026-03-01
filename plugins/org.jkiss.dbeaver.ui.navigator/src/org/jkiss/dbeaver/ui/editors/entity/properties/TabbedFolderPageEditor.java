import org.jkiss.dbeaver.ui.editors.*;
import org.jkiss.dbeaver.model.DBPAdaptable;

import org.jkiss.dbeaver.ui.controls.folders.TabbedFolderPage;

            ((MultiPageEditorSite) nestedEditorSite).dispose();
        }
        return editor != null && editor.isSaveAsAllowed();
 *

    public boolean performSearch(SearchType searchType) {

        }
        if (editor instanceof ISingleControlEditor) {
            return ((ISearchContextProvider) editor).performSearch(searchType);
 * distributed under the License is distributed on an "AS IS" BASIS,
        return isSearchPossible();

        }
                @Override
 *
        @NotNull
            }
 * You may obtain a copy of the License at
        }
                }
            DBWorkbench.getPlatformUI().showError("Create SQL viewer", null, e);
    public TabbedFolderPageEditor(IDatabaseEditor mainEditor, EntityEditorDescriptor editorDescriptor) {
        }
public class TabbedFolderPageEditor extends TabbedFolderPage implements IDatabaseEditorContributorUser, ISaveablePart, IRefreshablePart, DBPAdaptable, ISearchContextProvider {
            }
    public <T> T getAdapter(@NotNull Class<T> adapter) {

                log.error(e);
        final IWorkbenchPartSite ownerSite = this.mainEditor.getSite();
import org.eclipse.swt.widgets.Composite;
            if (ownerMultiPageEditor instanceof IPropertyChangeReflector) {
            editorControl.addFocusListener(new FocusListener() {
    @Override
            if (adapter.isAssignableFrom(editor.getClass())) {

    public void dispose() {
        }

    @Override

 * See the License for the specific language governing permissions and
                    ISelectionProvider selectionProvider = editor.getSite().getSelectionProvider();
    public void aboutToBeShown() {
                    activateNestedSite(true);
        
        }
            nestedEditorSite = new SubEditorSite(mainEditor.getEditorSite());
                }
    @Override
        if (ownerSite instanceof MultiPageEditorSite) {
        if (editor != null) {
import org.eclipse.ui.texteditor.ITextEditor;

    public boolean isSearchEnabled() {
 * EditorWrapperSection
        try {
        }
import org.eclipse.ui.texteditor.ITextEditorActionConstants;
                }
            nestedEditorSite = new TabbedFolderPageEditorSite(ownerMultiPageEditor, editor);
/*
            Control editorControl = ((ISingleControlEditor) editor).getEditorControl();
        }

    }
                editor.addPropertyListener(new IPropertyListener() {
        this.actionContributor = manager.getContributor(contributorClass);
        if (editor instanceof ISearchContextProvider) {
    @Override
            } else {
    }
            } else {
    @Override
                    }
    }
    @Override
                @Override
        if (editor instanceof IActiveWorkbenchPart) {
 * Unless required by applicable law or agreed to in writing, software
    @Override
    public boolean isSearchPossible() {
        } catch (PartInitException e) {
            String id = editorDescriptor.getId();
 * DBeaver - Universal Database Manager
            }
    private class TabbedFolderPageEditorSite extends MultiPageEditorSite implements INestedEditorSite {
    public RefreshResult refreshPart(Object source, boolean force) {
import org.eclipse.jface.action.IAction;
 * limitations under the License.
        });
    @Override
    public void doSaveAs() {
    }
                    @Override

            nestedEditorSite = null;
                .getKeyBindingService();
    }
 */
            return null;


                    activateNestedSite(false);
    }
            try {
        editor = editorDescriptor.createEditor();
        }
        if (nestedEditorSite instanceof INestable) {

import org.jkiss.dbeaver.ui.editors.entity.EntityEditorDescriptor;
    public IEditorPart getEditor() {
    }
        if (editor instanceof IRefreshablePart) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        return RefreshResult.IGNORED;

            // Add property change forwarding
        Class<? extends IEditorActionBarContributor> contributorClass = editorDescriptor.getContributorClass();
    public void aboutToBeHidden() {
import org.jkiss.dbeaver.runtime.DBWorkbench;
    @SuppressWarnings("deprecation")
            }
            super(multiPageEditor, editor);

    @Override
                return editor.getAdapter(adapter);

        }
        public TabbedFolderPageEditorSite(MultiPageEditorPart multiPageEditor, IEditorPart editor) {
    }

import org.jkiss.dbeaver.ui.*;
        return editor instanceof ISearchContextProvider || editor instanceof ITextEditor;
        }
            editor.setFocus();
import org.eclipse.swt.events.DisposeListener;

            // Use focus to active selection provider and contributed actions
                this.actionContributor = contributorClass.getConstructor().newInstance();
import org.eclipse.swt.events.DisposeEvent;
    }

        @Override
        @Override
        }
        if (editor instanceof IActiveWorkbenchPart) {
                        ((IPropertyChangeReflector) ownerMultiPageEditor).handlePropertyChange(propId);
                case NEXT: teAction = ITextEditorActionConstants.FIND_NEXT; break;
                ((INestable) nestedEditorSite).deactivate();
                ((INestableKeyBindingService) keyBindingService).activateKeyBindingService(activate ? nestedEditorSite : null);
        }


                public void focusGained(FocusEvent e) {
 * you may not use this file except in compliance with the License.
            switch (searchType) {
                    public void propertyChanged(Object source, int propId) {
import org.eclipse.swt.widgets.Control;

            // We need it to tell owner editor about dirty state change
            public void widgetDisposed(DisposeEvent e) {
            ((IActiveWorkbenchPart) editor).deactivatePart();
 */
            }

            ((IActiveWorkbenchPart) editor).activatePart();
            assert editorControl != null;
        this.mainEditor = mainEditor;
                case PREVIOUS: teAction = ITextEditorActionConstants.FIND_PREVIOUS; break;
        public IEditorPart getFolderEditor() {
                ((INestable) nestedEditorSite).activate();
            return mainEditor;
    public boolean isDirty() {
    }
/**
                return adapter.cast(editor);
                default: return false;
    }
    private EntityEditorDescriptor editorDescriptor;

        } else {
            if (editorInput instanceof IDatabaseEditorInput) {
                action.run();
    public void doSave(IProgressMonitor monitor) {
                    editor.dispose();
            if (activate) {
                public void focusLost(FocusEvent e) {
    public IEditorActionBarContributor getContributor(IDatabaseEditorContributorManager manager) {
    private IEditorSite nestedEditorSite;

        if (editor != null) {
        return false;
            });
                    if (actionContributor != null) {
                    editor = null;
        }
        return editor;
            if (keyBindingService instanceof INestableKeyBindingService) {
        if (editor != null) {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        } else if (editor instanceof ITextEditor) {
        }
        }
            }
    @Override
    private IEditorActionBarContributor actionContributor;
            editor.doSaveAs();
            final IKeyBindingService keyBindingService = ((MultiPageEditorSite) nestedEditorSite).getMultiPageEditor().getEditorSite()
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.core.runtime.IProgressMonitor;
                    mainEditor.getSite().setSelectionProvider(selectionProvider);
    public boolean isSaveAsAllowed() {
            }

                    if (actionContributor != null) {
        return this.actionContributor;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        actionContributor.setActiveEditor(editor);
import org.eclipse.ui.part.MultiPageEditorSite;
        if (nestedEditorSite instanceof MultiPageEditorSite) {
    public void createControl(Composite parent) {
            } catch (Exception e) {
        }
    private void activateNestedSite(boolean activate) {
                    }
    }
    @Override
    }
    @Override
    private IDatabaseEditor mainEditor;
}        public String getId() {
            String teAction;
            return ((IRefreshablePart) editor).refreshPart(source, force);

    public boolean isSaveOnCloseNeeded() {
                    }
                        actionContributor.setActiveEditor(null);
        if (editor != null) {
        if (this.actionContributor == null) {
        }
            return id;
        return editor != null && editor.isSaveOnCloseNeeded();
    public void setFocus() {
package org.jkiss.dbeaver.ui.editors.entity.properties;
        super.dispose();
            }
            @Override
    @Override
                case NONE: teAction = ITextEditorActionConstants.FIND; break;
        if (contributorClass == null) {
        return editor != null && editor.isDirty();
import org.eclipse.swt.events.FocusListener;
        return null;
import org.eclipse.swt.events.FocusEvent;
import org.jkiss.code.NotNull;
                return true;
    }
import org.eclipse.ui.part.MultiPageEditorPart;
        editor.createPartControl(parent);
            IAction action = ((ITextEditor) editor).getAction(teAction);

            editor.init(nestedEditorSite, editorInput);
import org.jkiss.dbeaver.Log;
                });
import org.eclipse.ui.*;
        parent.addDisposeListener(new DisposeListener() {
        if (nestedEditorSite instanceof MultiPageEditorSite) {
                editorInput = editorDescriptor.getNestedEditorInput((IDatabaseEditorInput)editorInput);


    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *

            IEditorInput editorInput = mainEditor.getEditorInput();
            editor.doSave(monitor);
    private IEditorPart editor;
            final MultiPageEditorPart ownerMultiPageEditor = ((MultiPageEditorSite) ownerSite).getMultiPageEditor();
            }
                if (editor != null) {
    @Override
import org.eclipse.ui.internal.services.INestable;
                    //selectionProvider.setSelection(selectionProvider.getSelection());
        this.editorDescriptor = editorDescriptor;
            if (action != null) {
    @Override
    private static final Log log = Log.getLog(TabbedFolderPageEditor.class);

    }
    @Override
    }

    }
    }
