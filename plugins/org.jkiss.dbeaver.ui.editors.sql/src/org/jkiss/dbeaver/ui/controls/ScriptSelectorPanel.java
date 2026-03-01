
        this.scriptFiles = scriptFiles;
                        null :
            }
        });
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
        );
                public String getText(Object element) {
                    return description == null ? null : description.trim();
        @NotNull final IFolder rootFolder,
                @Override
        @Override
            }
import org.jkiss.dbeaver.Log;
            }
                } else {
            Button newButton = UIUtils.createPushButton(
                } else if (e.keyCode == SWT.ARROW_UP) {
        );
        } else {
        if (result){
                        resource
    private ScriptSelectorPanel(
        columnController.autoSizeColumns();
        columns[2].setWidth(200 * 8);
    private class ScriptFilter extends ViewerFilter {
        }
            if (tree.getItemCount() > 0) {
import org.eclipse.swt.SWT;
            @Override
import java.util.List;
                            DBPPlatformDesktop.getInstance().getWorkspace().getProject(rootFolder.getProject()),

        this.workbenchWindow = workbenchWindow;
        SQLNavigatorContext editorContext,
                scriptViewer.reveal(tree.getItem(0).getData());
                    } catch (CoreException ex) {

}
        );
        super(workbenchWindow.getShell(),
                }
                    }

                        return null;
            true,
                    final ResourceInfo ri = (ResourceInfo) element;
 *
            true,

 * Script selector panel (shell)
        closeOnFocusLost(patternText, scriptViewer.getTree());
            true,
                            .getFullPath()
        columnController.addColumn(
                }
import org.eclipse.core.resources.IFile;
                if (files.isEmpty()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    return null;
                @Override
            SQLEditorMessages.script_selector_project_table_time_description,
        ColumnViewerToolTipSupport.enableFor(this.scriptViewer);
                    final ResourceInfo ri = (ResourceInfo) element;
import org.jkiss.dbeaver.utils.ResourceUtils;
import org.eclipse.ui.progress.UIJob;

package org.jkiss.dbeaver.ui.controls;

                return null;
            SQLEditorMessages.script_selector_project_table_name_label,
import java.text.SimpleDateFormat;
import org.eclipse.swt.events.KeyListener;

            true,
import org.eclipse.jface.viewers.*;
        columnController.addColumn(
                    return CommonUtils.isEmpty(children) ? null : children.toArray();
                }
                    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            true,
            @Override
                    if (resource instanceof IFile) {
                public String getToolTipText(Object element) {
 */
                for (Object item : ((IStructuredSelection)scriptViewer.getSelection()).toArray()) {
        final GridData gd = new GridData(GridData.FILL_BOTH);
                @Override
import org.eclipse.core.runtime.IProgressMonitor;
        Composite composite = super.createDialogArea(parent);
                useProjectScripts(projectCheckbox.getSelection());


        childComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        if (project != null && this.project.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT)) {
        private boolean isAnyChildMatches(ResourceInfo ri) {
                }
        this.scriptViewer = new TreeViewer(scriptTree);
        columnController.sortByColumn(1, SWT.DOWN);
    public static final String PREF_SCRIPT_SELECTOR_SHOW_PROJECT_SCRIPTS = "script_dialog_mode";
        columns[0].pack();
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLNavigatorContext;
                @Override
import org.eclipse.swt.events.SelectionEvent;
                    if (isAnyChildMatches(child)) {
            }
    @Override

                }

            }
        }
            }
                            .toString();
        final Color fg = patternText.getForeground();//parent.getDisplay().getSystemColor(SWT.COLOR_INFO_FOREGROUND);
        Button projectCheckbox = UIUtils.createCheckbox(childComposite, SQLEditorMessages.script_selector_project_scripts, false);
            SWT.LEFT,
        @NotNull List<ResourceInfo> scriptFiles) {
            log.error(e);
        gd.horizontalSpan = 2;
                        return resource.getFullPath().removeLastSegments(1).toString();
                final Tree tree = scriptViewer.getTree();
import org.jkiss.dbeaver.ui.editors.sql.scripts.ScriptsHandlerImpl;
        UIUtils.addEmptyTextHint(patternText, text -> "Enter a part of script name here");
                        IFile scriptFile = SQLEditorUtils.createNewScript(
                return;
        this.project = navigatorContext.getProject();
                    cancelPressed();
        Tree scriptTree = new Tree(composite, SWT.SINGLE | SWT.FULL_SELECTION);
        this.patternText.addKeyListener(KeyListener.keyPressedAdapter(e -> {

        selectorPanel.setModeless(true);
        scriptTree.addListener(SWT.PaintItem, event -> {
                            return DBeaverIcons.getImage(ri.getDataSource().getDriver().getIcon());
    @Override
    protected IDialogSettings getDialogBoundsSettings() {
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
    protected Composite createDialogArea(@NotNull Composite parent) {
            scriptViewer.setInput(scriptFiles);
        }
public class ScriptSelectorPanel extends AbstractPopupPanel {
                }
                            .makeRelativeTo(resourceDefaultRoot.getFullPath())
    @NotNull

                "Choose SQL script for '" + navigatorContext.getDataSourceContainer().getName() + "'");
                if (parentElement instanceof ResourceInfo) {
        columnController.createColumns();
            UIUtils.createPlaceholder(childComposite, 1);

                }
        patternText = new Text(composite, SWT.BORDER);
    }
    private static final Log log = Log.getLog(ScriptSelectorPanel.class);
            filterJob.schedule(250);

/*
                }
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorUtils.ResourceInfo;
            for (ResourceInfo child : ri.getChildren()) {
            super("Filter scripts");
    private List<ResourceInfo> projectScriptFiles;
        super.configureShell(newShell);
import org.jkiss.dbeaver.ui.dialogs.AbstractPopupPanel;
                @Override
                        } else {
                    if (resource == null) {
        FilterJob() {
    private final RCPProject project;
        childComposite.setLayout(new GridLayout(2, true));
        // No buttons
                        return DBeaverIcons.getImage(DBIcon.TREE_FOLDER);
                    final ResourceInfo ri = (ResourceInfo) element;
                private final SimpleDateFormat sdf = new SimpleDateFormat(DBConstants.DEFAULT_TIMESTAMP_FORMAT);
                public String getText(Object element) {
        patternText.addModifyListener(e -> {
        return composite;
                })
            return false;
        });

                    tree.setFocus();
                }
                    return "";//((ResourceInfo)element).getDescription();
                    if (!ri.isDirectory()) {
import org.eclipse.swt.graphics.Image;
        return UIUtils.getDialogSettings(DIALOG_ID);
    private Text patternText;
        tree.setHeaderVisible(true);
        composite.setForeground(fg);

                            return sdf.format(new Date(lastModified));
            true,
                    IResource resource = ri.getResource();
import org.eclipse.swt.events.SelectionListener;
        scriptTree.setLinesVisible(true);
                        item.setText(2, CommonUtils.getSingleLineString(CommonUtils.notEmpty(ri.getDescription())));



            } else {
            navigatorContext.getDataSourceContainer() == null ?
            new ColumnLabelProvider() {
        } catch (CoreException e) {
                    return dataSource == null ? null : DBeaverIcons.getImage(dataSource.getDriver().getIcon());
        gd.widthHint = 500;
        this.scriptViewer.setContentProvider(new TreeContentProvider() {
            closeOnFocusLost(newButton);
                    final List<ResourceInfo> children = ((ResourceInfo) parentElement).getChildren();
                    final List<ResourceInfo> children = resourceInfo.getChildren();

            return Status.OK_STATUS;

            }
    @Override
    ) {
                }
                    IResource resource = ((ResourceInfo) element).getResource();
            SQLEditorMessages.script_selector_project_table_name_description,
            final IResource resource = ((ResourceInfo) element).getResource();
import org.jkiss.dbeaver.model.DBConstants;

 */
            final TreeItem item = (TreeItem) event.item;
    }
        this.rootFolder = rootFolder;

 * You may obtain a copy of the License at
                    String description = ri.getDescription();
            if (resource instanceof IFolder) {
                    IFolder resourceDefaultRoot = DBPPlatformDesktop.getInstance().getWorkspace().getResourceDefaultRoot(navigatorContext.getProject(), ScriptsHandlerImpl.class, false);
                    }
    }
                    SQLEditorHandlerOpenEditor.openResourceEditor(ScriptSelectorPanel.this.workbenchWindow, ri, null);
 * DBeaver - Universal Database Manager
            filterJob = new FilterJob();
 * Licensed under the Apache License, Version 2.0 (the "License");
                        long lastModified = ResourceUtils.getResourceLastModified(resource);
                    return ri.getLocalFile() == null ? null : ri.getLocalFile().getPath();
                    final DBPDataSourceContainer dataSource = ((ResourceInfo) element).getDataSource();
                List<ResourceInfo> files = new ArrayList<>();
import org.eclipse.core.runtime.IStatus;
            SQLEditorMessages.script_selector_project_table_info_label,

        Composite childComposite = new Composite(composite, SWT.NONE);
            true,
            UIUtils.expandAll(scriptViewer);
    private static final String DIALOG_ID = "DBeaver.ScriptSelectorPopup";
                        }
        UIUtils.asyncExec(scriptTree::setFocus);
        }
            new ColumnLabelProvider(){
                cancelPressed();
        columns[0].setWidth(columns[0].getWidth() + 10);
        columns[1].pack();
        final Tree tree = scriptViewer.getTree();
                    }
        ViewerColumnController<?, ?> columnController = new ViewerColumnController<>("scriptSelectorViewer", scriptViewer);
            }
import org.jkiss.utils.CommonUtils;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public static void showTree(
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.eclipse.swt.layout.GridData;
                            navigatorContext);
    }
    private TreeViewer scriptViewer;
            final Tree tree = scriptViewer.getTree();

        );
                }
        IFolder rootFolder,
            public boolean hasChildren(Object element) {
import org.jkiss.dbeaver.model.DBIcon;
        UIUtils.createLabelSeparator(composite, SWT.HORIZONTAL, 1);
        try {


import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.eclipse.swt.events.SelectionAdapter;
            })
            this.projectScriptFiles = SQLEditorUtils.getScriptsFromProject(this.project);
 *
            final ResourceInfo ri = (ResourceInfo) item.getData();
import java.util.Locale;

        selectorPanel.open();
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                @Override
                    //scriptViewer.get
                @Override
        List<ResourceInfo> scriptFiles
                        }
        scriptTree.setBackground(bg);

/**

                    scriptViewer.setSelection(new StructuredSelection(tree.getItem(tree.getItemCount() - 1).getData()));
import org.eclipse.core.resources.IResource;
        scriptTree.addSelectionListener(new SelectionAdapter() {
        @NotNull final SQLNavigatorContext navigatorContext,
import org.eclipse.core.runtime.CoreException;
        this.navigatorContext = navigatorContext;
import java.util.ArrayList;
                    }
                    return resource.getParent().equals(resourceDefaultRoot) ?
    private final IFolder rootFolder;
                "Choose SQL script" :
        }
            SQLEditorMessages.script_selector_project_table_folder_description,
            }
                });
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorUtils;
                UIUtils.asyncExec(() -> {

            if (ri != null && !ri.isDirectory() && CommonUtils.isEmpty(item.getText(2))) {
                    return !CommonUtils.isEmpty(children);
            true,
    }
import org.jkiss.dbeaver.model.rcp.RCPProject;
    @NotNull
            );
        ScriptSelectorPanel selectorPanel = new ScriptSelectorPanel(workbenchWindow, editorContext, rootFolder, scriptFiles);
                if (element instanceof ResourceInfo resourceInfo) {
                if (e.keyCode == SWT.ARROW_DOWN) {
    private final SQLNavigatorContext navigatorContext;
            public void widgetDefaultSelected(SelectionEvent e) {
        final Color bg = patternText.getBackground();//parent.getDisplay().getSystemColor(SWT.COLOR_INFO_BACKGROUND);
        private final String pattern;
                SelectionListener.widgetSelectedAdapter(e -> {
        );
                    return dataSource == null ? null : dataSource.getName();

                return isAnyChildMatches((ResourceInfo) element);
                    scriptViewer.setSelection(new StructuredSelection(tree.getItem(0).getData()));
import org.eclipse.ui.IWorkbenchWindow;

    private final IWorkbenchWindow workbenchWindow;
    }
            }
            scriptViewer.setFilters(new ScriptFilter());

                }
 *
import org.eclipse.core.resources.IFolder;
        } else {
                        return true;
                    return ((ResourceInfo) element).getName();
import java.util.Date;
        scriptTree.setLayoutData(gd);
                }
import org.jkiss.dbeaver.model.rm.RMConstants;

                    final DBPDataSourceContainer dataSource = ((ResourceInfo) element).getDataSource();
            if (filterJob != null) {

                    }
            SQLEditorMessages.script_selector_project_table_time_label,

    private final List<ResourceInfo> scriptFiles;
import org.jkiss.dbeaver.ui.DBeaverIcons;

                null,
import org.jkiss.code.NotNull;
        ));
 * See the License for the specific language governing permissions and
                    if (!((ResourceInfo)item).isDirectory()) {
                    } else {
                        SQLEditorHandlerOpenEditor.openResource(scriptFile, navigatorContext);
                    }
import org.eclipse.swt.graphics.Color;
                @Override
            new ColumnLabelProvider() {
                    if (!item.isDisposed()) {
    @NotNull
    private volatile FilterJob filterJob;
                        if (lastModified > 0) {
        ScriptFilter() {
                }
    }
        }
                    return;
            }
    }
import org.eclipse.swt.layout.GridLayout;
            @Override
                preferenceStore.setValue(PREF_SCRIPT_SELECTOR_SHOW_PROJECT_SCRIPTS, projectCheckbox.getSelection());
        projectCheckbox.setSelection(preferenceStore.getBoolean(PREF_SCRIPT_SELECTOR_SHOW_PROJECT_SCRIPTS));
                    tree.setFocus();
    protected void createButtonsForButtonBar(@NotNull Composite parent) {
        columnController.addColumn(
 * limitations under the License.
            SWT.LEFT,
        });
        final TreeColumn[] columns = tree.getColumns();
                public String getToolTipText(Object element) {
        IWorkbenchWindow workbenchWindow,
            pattern = patternText.getText().toLowerCase(Locale.ENGLISH);
        public boolean select(Viewer viewer, Object parentElement, Object element) {
                public String getText(Object element) {
        public IStatus runInUIThread(IProgressMonitor monitor) {
                return false;
                SQLEditorMessages.script_selector_create_script,
        });
                public String getText(Object element) {
                public Image getToolTipImage(Object element) {
        columnController.addColumn(
        @Override
                        files.add((ResourceInfo) item);

                public String getToolTipText(Object element) {
            }
            }
import org.jkiss.dbeaver.ui.UIUtils;
        useProjectScripts(projectCheckbox.getSelection());
import org.eclipse.swt.widgets.*;
    private class FilterJob extends UIJob {
                            .removeLastSegments(1)
        }
        patternText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            SQLEditorMessages.script_selector_project_table_info_description,
                            return DBeaverIcons.getImage(DBIcon.TREE_SCRIPT);
                    final ResourceInfo ri = (ResourceInfo) element;
                if (child.getResource() instanceof IFolder) {
            scriptViewer.setInput(projectScriptFiles);
 * you may not use this file except in compliance with the License.
        @NotNull final IWorkbenchWindow workbenchWindow,
                        if (ri.getDataSource() == null) {
                childComposite,
            filterJob = null;
import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLEditorHandlerOpenEditor;
            SWT.LEFT,
        DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();
import org.jkiss.code.Nullable;
                return ((ResourceInfo) element).getName().toLowerCase(Locale.ENGLISH).contains(pattern);
            public Object[] getChildren(Object parentElement) {
        gd.heightHint = 200;
                for (ResourceInfo ri : files) {
        }
                }
    protected void configureShell(Shell newShell) {
                    }



                        log.error(ex);
                public Image getImage(Object element) {
                        return true;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IDialogSettings;
            SWT.LEFT,
                    if (child.getName().toLowerCase(Locale.ENGLISH).contains(pattern)) {
    @NotNull

                    if (resourceDefaultRoot == null) {
                            rootFolder,
        scriptTree.setForeground(fg);
                    }
 * Unless required by applicable law or agreed to in writing, software
            SQLEditorMessages.script_selector_project_table_folder_label,
                @Override
    @Nullable
        projectCheckbox.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
        UIUtils.expandAll(scriptViewer);
                }
    private void useProjectScripts(boolean result) {
            new ColumnLabelProvider() {
        composite.setBackground(bg);
    }
                    try {

