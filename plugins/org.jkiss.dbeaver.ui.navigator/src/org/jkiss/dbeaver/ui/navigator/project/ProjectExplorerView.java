        });
                });
                SWT.LEFT, false, false,
                        if (element instanceof DBNResource) {
                                return text.toString();
                            Collection<DBPDataSourceContainer> containers = ((DBNResource) element).getAssociatedDataSources();
            lockPlaceholder.setVisible(!viewable);
        };
        columnController.addColumn(UINavigatorMessages.navigator_project_explorer_columns_name_text,
    @Override
    private GridData lockPlaceholderLayoutInfo;
                            }
/*
                        }
import org.eclipse.swt.SWT;
                            Collection<DBPDataSourceContainer> containers = ((DBNResource) node).getAssociatedDataSources();
                        DBNNode node = (DBNNode) element;
        lockPlaceholderLayoutInfo = new GridData(SWT.CENTER, SWT.CENTER, true, true);
 */
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;
}
                        if (element instanceof DBNResource) {
        UIExecutionQueue.queueExec(() -> {
 * ProjectExplorerView

                SWT.LEFT, true, true,
    }
    }
    protected int getTreeStyle() {
                                return sdf.format(new Date(lastModified));
            }
        columnController = new ViewerColumnController<>("projectExplorer", viewer);
                if (parentElement == viewer.getInput() && !(element instanceof DBNResource)) {
                        if (node instanceof DBNDatabaseNode) {
        
        super.createPartControl(treeContainer);
    public ProjectExplorerView() {
                            return null;
                            if (resource.exists()) {
                    @Override
                        }
                                        description = container.getName();
    private Composite treeContainer;
        UIUtils.asyncExec(closure.createColumnsWhenNotBusy);
                    public Image getImage(Object element) {
    }

        columnController.addColumn(UINavigatorMessages.navigator_project_explorer_columns_datasource_text,
        return projectNode != null ? projectNode : model.getRoot();
        viewer.getTree().setHeaderVisible(true);
                        return "";
                    }
                });
        //columnController.autoSizeColumns();
                                        text.append(", ");
                        }
                            if (resource instanceof IFile && resource.exists()) {

                    }
                new LazyLabelProvider(shadowColor) {
                }, null);
                    public String getToolTipText(Object element) {
                                return text.toString();
    public void createPartControl(Composite parent) {
                });
                                    }

public class ProjectExplorerView extends DecoratedProjectView implements DBPProjectListener {
        UIExecutionQueue.queueExec(() -> {
 *
        updateRepresentation();
            lockPlaceholderLayoutInfo.exclude = viewable;
            treeContainer.layout(true, true);
                                for (DBPDataSourceContainer container : containers) {
                        return null;
        columnController.addColumn(UINavigatorMessages.navigator_project_explorer_columns_modified_text,
                });
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
        columnController.setForceAutoSize(true);
 * DBeaver - Universal Database Manager
                            return ((IToolTipProvider) mainLabelProvider).getToolTipText(element);
    }
    //static final Log log = Log.getLog(ProjectExplorerView.class);
    public void dispose() {

        DBPPlatformDesktop.getInstance().getWorkspace().removeProjectListener(this);
                            if (!CommonUtils.isEmpty(containers)) {
                        Image image = mainLabelProvider.getImage(element);
                                        if (text.length() > 0) {
import org.eclipse.swt.widgets.Label;
                                StringBuilder text = new StringBuilder();
    private void updateTitle() {
import java.util.Date;
        columnController.addColumn(UINavigatorMessages.navigator_project_explorer_columns_size_text,
import org.jkiss.dbeaver.model.app.DBPProject;
                return !(element instanceof DBNProjectDatabases);
        super.dispose();
        TreeViewer viewer = getNavigatorViewer();
            if (getNavigatorTree().isDisposed()) {
    @Override
                        }
        closure.createColumnsWhenNotBusy = () -> {
                    @Override
        viewer.addFilter(new ViewerFilter() {
        DBPPlatformDesktop.getInstance().getWorkspace().addProjectListener(this);
 * limitations under the License.
                                    String description = container.getDescription();
import java.text.NumberFormat;

package org.jkiss.dbeaver.ui.navigator.project;
import org.eclipse.jface.viewers.*;
    public void handleActiveProjectChange(@NotNull DBPProject oldValue, @NotNull DBPProject newValue) {
                new ColumnLabelProvider() {
import org.jkiss.dbeaver.ui.*;
                    return false;
            public boolean select(Viewer viewer, Object parentElement, Object element) {
                new ColumnLabelProvider() {
                    @Override
                            }
            if (viewer.isBusy()) {
        lockPlaceholder.setLayoutData(lockPlaceholderLayoutInfo);
import org.jkiss.dbeaver.ui.actions.ObjectPropertyTester;
        };
                            }
                            image = labelDecorator.decorateImage(image, element);
 * Unless required by applicable law or agreed to in writing, software
            getNavigatorTree().setVisible(viewable);
        final var closure = new Object() {
                                long lastModified = ResourceUtils.getResourceLastModified(resource);
        lockPlaceholder = UIUtils.createLabel(treeContainer, UIIcon.READONLY_RESOURCES);
                            IResource resource = ((DBNResource) element).getResource();
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    }
import java.text.DecimalFormat;
        });
                    }
                new ColumnLabelProvider() {


    }


                            IResource resource = ((DBNResource) element).getResource();
            }
                        }                return null;
    @Override
                            }
 * You may obtain a copy of the License at
    
    private final NumberFormat sizeFormat = new DecimalFormat();
                        return "";
                                        text.append(description);
                        if (element instanceof DBNResource) {
                            return DBeaverIcons.getImage(((DBNDatabaseNode) node).getDataSourceContainer().getDriver().getIcon());
                        return "";
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
            }
import org.jkiss.dbeaver.model.navigator.*;
                updateTitle();
        lockPlaceholder.setVisible(false);
import org.jkiss.dbeaver.model.rm.RMConstants;
                    @Override
    }
                    @Override
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        lockPlaceholder.setAlignment(SWT.CENTER);

                    public String getToolTipText(Object element) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                        return null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private ViewerColumnController<?,?> columnController;
                    }
    @Override
        columnController.addColumn(UINavigatorMessages.navigator_project_explorer_columns_preview_text,
                UIUtils.asyncExec(closure.createColumnsWhenNotBusy);
                                    if (!CommonUtils.isEmpty(description)) {
import org.eclipse.swt.widgets.Composite;
        treeContainer = UIUtils.createComposite(parent, 1);
                            if (containers != null && containers.size() == 1) {
                    @Override
        treeViewLayoutInfo = new GridData(SWT.FILL, SWT.FILL, true, true);
                        if (element instanceof DBNNode) {
            public Runnable createColumnsWhenNotBusy;
                        }
                        }
            getNavigatorTree().reloadTree(getRootNode());
    }
                    public String getText(Object element) {
                    public String getText(Object element) {
            public boolean select(Viewer viewer, Object parentElement, Object element) {
                SWT.LEFT, false, false,
    public DBNNode getRootNode() {
                                StringBuilder text = new StringBuilder();
                    @Override
                            return ((DBNDatabaseNode) element).getDataSourceContainer().getName();
                                ProgramInfo program = ProgramInfo.getProgram(resource);
                UINavigatorMessages.navigator_project_explorer_columns_preview_description, SWT.LEFT, false, false,
                return true;
import java.text.SimpleDateFormat;
                createColumns(viewer);
                                        }
            }
                    @Override
                                }
 * you may not use this file except in compliance with the License.
                            if (resource != null && resource.exists()) {
import org.jkiss.dbeaver.model.app.DBPProjectListener;
        /*

        
                UINavigatorMessages.navigator_project_explorer_columns_name_description,
                        return "";
                                if (lastModified <= 0) {
            } else {
import org.jkiss.dbeaver.model.DBConstants;
                                }
                        } else {
import org.eclipse.swt.graphics.Color;
                }
                    public Image getImage(Object element) {
                                    }
                new ColumnLabelProvider() {
                    public String getText(Object element) {
                                    if (CommonUtils.isEmpty(description)) {
                    public String getLazyText(Object element) {
                                return sizeFormat.format(ResourceUtils.getFileLength(resource));

                    }
                                            text.append(", ");
        // Remove all non-resource nodes
        lockPlaceholderLayoutInfo.exclude = true;
 *
        */


    public static final String VIEW_ID = "org.jkiss.dbeaver.core.projectExplorer";
/**
        DBNProject projectNode = model.getRoot().getProjectNode(DBWorkbench.getPlatform().getWorkspace().getActiveProject());
        final Color shadowColor = viewer.getControl().getDisplay().getSystemColor(SWT.COLOR_WIDGET_DARK_SHADOW);
 */
    }
 * See the License for the specific language governing permissions and
                    @Override

                UINavigatorMessages.navigator_project_explorer_columns_type_description,
            @Override
                        }
        getNavigatorTree().setLayoutData(treeViewLayoutInfo);
                    @Override
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.graphics.Image;
        getNavigatorTree().getViewer().addFilter(new ViewerFilter() {
            boolean viewable = ObjectPropertyTester.nodeProjectHasPermission(getRootNode(), RMConstants.PERMISSION_PROJECT_RESOURCE_VIEW);
                        if (element instanceof DBNResource) {
    private void createColumns(final TreeViewer viewer) {
    private GridData treeViewLayoutInfo;
 *
        updateRepresentation();
import org.jkiss.dbeaver.runtime.DBWorkbench;
                SWT.LEFT, true, false,
                            Collection<DBPDataSourceContainer> containers = ((DBNResource) element).getAssociatedDataSources();
                                return DBeaverIcons.getImage((containers.iterator().next().getDriver().getIcon()));
                    private final SimpleDateFormat sdf = new SimpleDateFormat(DBConstants.DEFAULT_TIMESTAMP_FORMAT);

                                }
            }

                UINavigatorMessages.navigator_project_explorer_columns_size_description,
 * Licensed under the Apache License, Version 2.0 (the "License");

                    }
import java.util.Collection;

        columnController.addColumn(UINavigatorMessages.navigator_project_explorer_columns_type_text,
            treeViewLayoutInfo.exclude = !viewable;
                            }
                                    text.append(container.getName());
        });
                        }
    @Override
                            IResource resource = ((DBNResource) element).getResource();
                            if (!CommonUtils.isEmpty(containers)) {
                            return ((DBNNode) element).getNodeDescription();
                            }
        

        final ILabelProvider mainLabelProvider = (ILabelProvider) viewer.getLabelProvider();
                return;

                                    return program.getProgram().getName();
                        } else if (node instanceof DBNResource) {
                                if (program != null) {
                        if (element instanceof DBNDatabaseNode) {
                    }
                    }
                        } else if (element instanceof DBNResource) {

        DBNModel model = getGlobalNavigatorModel();
import org.eclipse.core.resources.IFile;
    private Label lockPlaceholder;
import org.jkiss.code.NotNull;
                                    return "";
                new ColumnLabelProvider() {
import org.jkiss.dbeaver.utils.ResourceUtils;
            if (!viewer.getControl().isDisposed()) {
                UINavigatorMessages.navigator_project_explorer_columns_datasource_description,
                    public String getText(Object element) {
            @Override
                                    if (text.length() > 0) {
                SWT.LEFT, false, false, true, null,
                        if (element instanceof DBNResource) {
                    }
                });
 * distributed under the License is distributed on an "AS IS" BASIS,
                                for (DBPDataSourceContainer container : containers) {
                columnController.createColumns(true);
import org.eclipse.core.resources.IResource;
        });
                        if (mainLabelProvider instanceof IToolTipProvider) {
                UINavigatorMessages.navigator_project_explorer_columns_modified_description,
import org.jkiss.utils.CommonUtils;
                                    }
                    public String getText(Object element) {
            updateTitle();
                                }

        UIUtils.setHelp(parent, IHelpContextIds.CTX_PROJECT_EXPLORER);
    private void updateRepresentation() {
    }
        return super.getTreeStyle() | SWT.FULL_SELECTION;
                        return mainLabelProvider.getText(element);
    
                        return image;
        setPartName("Files - " + getRootNode().getNodeDisplayName());
