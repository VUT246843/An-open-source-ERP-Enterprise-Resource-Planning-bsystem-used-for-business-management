import org.eclipse.swt.events.FocusAdapter;
    private static String convertToString(@NotNull IPath path) {
import org.jkiss.dbeaver.model.DBUtils;

                                        IPath path = (IPath) selection;
                                    }
        return composite;
    }
                    if (newResource != null) {

                        }
package org.jkiss.dbeaver.ui.project;
 * Unless required by applicable law or agreed to in writing, software
/**
    protected Control createPreferenceContent(@NotNull Composite parent) {
                            }
                                        if (CommonUtils.isEmptyTrimmed(convertToString(path))) {
    @Override
                                    public void focusLost(FocusEvent e) {
import org.eclipse.core.resources.IProject;
                                editor.selectAll();
            }
            }
                                final Text editor = new Text(resourceTable, SWT.NONE);
                                        if (file.isHidden() || file.getName().startsWith(".")) {
            handlerTableEditor.grabVertical = true;
            gd.widthHint = 400;
            resourceTable.setLinesVisible(true);
            GridData gd = new GridData(GridData.FILL_BOTH);
                            } else {
                        if (columnIndex == 1) {
                                ContainerSelectionDialog dialog = new ContainerSelectionDialog(resourceTable.getShell(), folder, true, UINavigatorMessages.pref_page_projects_settings_label_select + item.getText(0) + UINavigatorMessages.pref_page_projects_settings_label_root_folder);
public class PrefPageProjectResourceSettings extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage {
                                editor.setText(resourcePath);
import org.eclipse.core.runtime.IPath;
                    NavigatorResources.refreshNavigatorResource(projectMeta, resource, this);
            }
                                            return UINavigatorMessages.pref_page_projects_settings_label_not_use_project_root;
                                if (dialog.open() == IDialogConstants.OK_ID) {
                            return;

    }
                                });
    }
}
import org.jkiss.dbeaver.ui.DBeaverIcons;
/*
import org.jkiss.dbeaver.ui.preferences.AbstractPrefPage;
import org.eclipse.swt.events.MouseEvent;


            handlerTableEditor = new TableEditor(resourceTable);
 * PrefPageProjectResourceSettings

        Composite composite = UIUtils.createComposite(parent, 1);
        }
                                    if (result.length == 1 && result[0] instanceof IPath) {
        {
import org.jkiss.dbeaver.model.app.DBPResourceTypeDescriptor;
            this.project = DBUtils.getAdapter(IProject.class, element);
        // Save roots
                                            return UINavigatorMessages.pref_page_projects_settings_label_not_store_resources_in_another_project;
                                handlerTableEditor.setEditor(editor, item, 1);
            UIUtils.createTableColumn(resourceTable, SWT.LEFT, UINavigatorMessages.pref_page_projects_settings_label_resource);
        boolean isReadOnly = DBWorkbench.isDistributed();
        super.performDefaults();
                    IResource newResource = project.findMember(rootPath);
        if (element instanceof IProject) {
    private static final Log log = Log.getLog(PrefPageProjectResourceSettings.class);
            final DBPImage icon = descriptor.getIcon();
                                }
        }
            }
                                    }
                        }
            for (TableItem item : resourceTable.getItems()) {
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.DBPImage;
    public void setElement(IAdaptable element) {
 * limitations under the License.
        if (oldEditor != null) oldEditor.dispose();
        UIUtils.packColumns(resourceTable, true);
            }
import org.jkiss.dbeaver.model.app.DBPWorkspaceDesktop;
        DBPProject projectMeta = getProjectMeta();
 * See the License for the specific language governing permissions and
                                        final File file = path.toFile();

import org.eclipse.swt.custom.TableEditor;
        setDescription(UINavigatorMessages.pref_page_project_resource_settings_description);
    @Override

            UIUtils.createControlLabel(composite, UINavigatorMessages.pref_page_projects_settings_label_resource_location);
 */
                        int columnIndex = UIUtils.getColumnAtPos(item, e.x, e.y);

                                        }
import org.eclipse.swt.graphics.Point;
import org.eclipse.jface.dialogs.IDialogConstants;
 *
    }
                    descriptor.setDefaultRoot(projectMeta, rootPath);
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.projectSettings"; //$NON-NLS-1$
import java.io.File;
                                editor.addFocusListener(new FocusAdapter() {
                        refreshedResources.add(oldResource);
                                    @Override
    @Override
    @NotNull
        }
    public PrefPageProjectResourceSettings() {
                    }
        return path.removeFirstSegments(1).removeTrailingSeparator().toString();
        } else {
        resourceTable.removeAll();
                resourceTable.addMouseListener(new MouseAdapter() {
                }
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
                                        }

        return DBPPlatformDesktop.getInstance().getWorkspace().getProject(this.project);
            resourceTable.setHeaderVisible(true);
 *
 * You may obtain a copy of the License at
                        if (columnIndex <= 0) {
import org.jkiss.dbeaver.registry.ResourceTypeRegistry;
    @Override
    private IProject project;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchPropertyPage;
 */
    public boolean performOk() {
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.core.resources.IResource;


            handlerTableEditor.horizontalAlignment = SWT.RIGHT;
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (!refreshedResources.isEmpty()) {
                                dialog.showClosedProjects(false);
    private DBPProject getProjectMeta() {
                        refreshedResources.add(newResource);
    @NotNull

        Control oldEditor = handlerTableEditor.getEditor();
            resourceTable.setHeaderVisible(true);

    @Override

import org.eclipse.ui.IWorkbench;
                                    final Object[] result = dialog.getResult();
            gd.heightHint = 300;
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.model.app.DBPProject;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.core.runtime.IAdaptable;
                        final TableItem item = resourceTable.getItem(new Point(0, e.y));
                if (!CommonUtils.equalObjects(descriptor.getDefaultRoot(projectMeta), rootPath)) {
                        }

    private TableEditor handlerTableEditor;
                DBPResourceTypeDescriptor descriptor = (DBPResourceTypeDescriptor) item.getData();
            handlerTableEditor.verticalAlignment = SWT.TOP;

                                    return null;
        return project;
    }

                    if (oldResource != null) {
                            final String resourcePath = item.getText(1);
                            return;
    @Override

                        disposeOldEditor();

        }
                    }
                    @Override
import org.eclipse.swt.widgets.*;
            UIUtils.createTableColumn(resourceTable, SWT.LEFT, UINavigatorMessages.pref_page_projects_settings_label_folder);
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;

    public void init(IWorkbench workbench) {
                }

import java.util.ArrayList;
                    public void mouseUp(MouseEvent e) {
    protected void performDefaults() {
                    }
    private void disposeOldEditor() {
            this.project = (IProject) element;
                                        if (!project.getName().equals(segments[0])) {

    }
                                editor.setFocus();
                                            return UINavigatorMessages.pref_page_projects_settings_label_not_use_hidden_folders;
            DBPProject projectMeta = getProjectMeta();
            item.setData(descriptor);
                });
                                dialog.setValidator(selection -> {
            resourceTable = new Table(composite, SWT.SINGLE | SWT.BORDER | SWT.FULL_SELECTION);
            if (icon != null) {

            handlerTableEditor.grabHorizontal = true;
            resourceTable.setLayoutData(gd);
            if (!isReadOnly) {
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
            TableItem item = new TableItem(resourceTable, SWT.NONE);
                continue;
    private Table resourceTable;
    public IAdaptable getElement() {
    }
            if (defaultRoot != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
                String rootPath = item.getText(1);
    }
import org.jkiss.code.NotNull;


                                final IFolder folder = project.getFolder(resourcePath);
                                    if (selection instanceof IPath) {
                UIUtils.createInfoLabel(composite, UINavigatorMessages.pref_page_projects_settings_label_restart_require_refresh_global_settings);
                item.setImage(DBeaverIcons.getImage(icon));
                item.setText(1, defaultRoot);
            item.setText(0, descriptor.getName());
                                        item.setText(1, editor.getText());
        for (DBPResourceTypeDescriptor descriptor : ResourceTypeRegistry.getInstance().getResourceTypes()) {
import org.eclipse.core.resources.IFolder;

            }
import org.jkiss.dbeaver.runtime.DBWorkbench;
                                        final String[] segments = ((IPath) selection).segments();
        if (projectMeta != null) {
                        if (item == null) {
                                        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBPWorkspaceDesktop workspace = DBPPlatformDesktop.getInstance().getWorkspace();
        java.util.List<IResource> refreshedResources = new ArrayList<>();
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
    }
                    IResource oldResource = project.findMember(descriptor.getDefaultRoot(projectMeta));
import org.jkiss.dbeaver.Log;
        performDefaults();
                                        item.setText(1, convertToString((IPath) result[0]));
 *
import org.eclipse.ui.IWorkbenchPreferencePage;
            if (!descriptor.isManageable()) {



                                });
    }
                                    }

                for (IResource resource : refreshedResources) {
                            if (project != null) {
        return super.performOk();
import org.jkiss.dbeaver.model.navigator.NavigatorResources;
            String defaultRoot = projectMeta == null ? null : descriptor.getDefaultRoot(projectMeta);
