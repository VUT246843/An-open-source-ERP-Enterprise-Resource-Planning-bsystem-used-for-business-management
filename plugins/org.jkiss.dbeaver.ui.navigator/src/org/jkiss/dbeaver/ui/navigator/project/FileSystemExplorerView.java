    }
 *

        columnController.addColumn(UINavigatorMessages.navigator_project_explorer_columns_name_text,
    private static final Log log = Log.getLog(FileSystemExplorerView.class);
import org.jkiss.dbeaver.model.navigator.fs.DBNPath;
                        if (path != null && !pathNode.isDirectory()) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        viewer.addFilter(new ViewerFilter() {

import org.jkiss.dbeaver.ui.navigator.INavigatorFilter;
        viewer.getTree().setHeaderVisible(true);
            DBWorkbench.getPlatform().getWorkspace().getActiveProject());
        super.installDragAndDropSupport(navigatorTree);
import java.text.NumberFormat;
                                return FILE_TIMESTAMP_FORMAT.format(lastModified.toMillis());

        return null;

            public Runnable createColumnsWhenNotBusy;
                            }
                public String getText(Object element) {

    public void createPartControl(Composite parent) {
            new ColumnLabelProvider() {
                        Path path = pathNode.getPath();
            });
            }
    }
import org.jkiss.dbeaver.ui.UIUtils;

import org.jkiss.dbeaver.model.navigator.fs.DBNFileSystems;
 * See the License for the specific language governing permissions and

                        return toolTipProvider.getToolTipText(element);
    }

                                FileTime lastModified = Files.getLastModifiedTime(path);
 * distributed under the License is distributed on an "AS IS" BASIS,
                                log.debug(e);
/**

import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;

        return DatabaseNavigatorTreeFilterObjectType.file;
 */
import org.eclipse.jface.viewers.*;
            SWT.RIGHT, false, false, true, null,
                        } catch (IOException e) {
                columnController.createColumns(true);


                            } catch (IOException e) {
        if (projectNode != null) {
        closure.createColumnsWhenNotBusy = () -> {
        UIUtils.asyncExec(closure.createColumnsWhenNotBusy);

    }
            @Override
import org.eclipse.swt.widgets.Composite;
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        return fsRootNode == null ? new DBNEmptyNode() : fsRootNode;
                    return mainLabelProvider.getImage(element);
                public String getText(Object element) {
import org.jkiss.dbeaver.model.navigator.DBNProject;

    }
    private ViewerColumnController<?,?> columnController;
import java.text.DecimalFormat;
import org.jkiss.code.NotNull;
    @Override
    @Override
 */
import org.eclipse.swt.SWT;
            }, null);
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;
                            try {
            } else {
    public DBNNode getRootNode() {
        UIExecutionQueue.queueExec(() -> createColumns(viewer));
    }
                        try {
                public String getToolTipText(Object element) {
    }
            UINavigatorMessages.navigator_project_explorer_columns_size_description,
        final var closure = new Object() {
        super();
                @Override
    @Override
        columnController.addColumn(UINavigatorMessages.navigator_project_explorer_columns_size_text,
                    return "";
 * limitations under the License.

package org.jkiss.dbeaver.ui.navigator.project;
    }
                @Override
            new ColumnLabelProvider() {
                    return "";
        };
    public FileSystemExplorerView() {
                    return null;
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTree;
                    if (element instanceof DBNPath pathNode) {
                }
            UINavigatorMessages.navigator_project_explorer_columns_modified_description,
            if (viewer.isBusy()) {



        }
                @Override
                @Override
                    return mainLabelProvider.getText(element);
 * Base view for
        final TreeViewer viewer = getNavigatorViewer();
import org.jkiss.dbeaver.model.navigator.DBNNode;
        super.init(site);
    protected void installDragAndDropSupport(DatabaseNavigatorTree navigatorTree) {
    public static final NumberFormat FILE_SIZE_FORMAT = new DecimalFormat();
    protected void createColumns(final TreeViewer viewer) {
import org.eclipse.ui.PartInitException;
            });
import org.jkiss.dbeaver.model.navigator.DBNEmptyNode;
        };
        return super.getRootNode();
        DBNProject projectNode = getGlobalNavigatorModel().getRoot().getProjectNode(
        columnController = new ViewerColumnController<>("cloudFileExplorer", viewer);
        final ILabelProvider mainLabelProvider = (ILabelProvider) viewer.getLabelProvider();
            }
                UIUtils.asyncExec(closure.createColumnsWhenNotBusy);
    public static final SimpleDateFormat FILE_TIMESTAMP_FORMAT = new SimpleDateFormat(DBConstants.DEFAULT_TIMESTAMP_FORMAT);
import org.jkiss.dbeaver.model.DBConstants;
        return new SimpleNavigatorTreeFilter();
import org.jkiss.dbeaver.Log;
                    if (element instanceof DBNPath dbnPath && !dbnPath.isDirectory()) {
import org.jkiss.dbeaver.ui.navigator.database.DatabaseNavigatorTreeFilterObjectType;
import java.nio.file.attribute.FileTime;

                        }
        createExtraColumns(columnController, viewer);

                        Path path = dbnPath.getPath();
import org.jkiss.dbeaver.ui.navigator.database.DatabaseBrowserView;
        });
                }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class FileSystemExplorerView extends DatabaseBrowserView {
            return projectNode.getExtraNode(DBNFileSystems.class);
                    if (mainLabelProvider instanceof IToolTipProvider toolTipProvider) {
                return !(element instanceof DBNProjectDatabases);
}
                    }
                }
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IViewSite;
        columnController.addColumn(UINavigatorMessages.navigator_project_explorer_columns_modified_text,
                    }
                @Override
    @Override
            SWT.RIGHT, false, false,

 * DBeaver - Universal Database Manager
                            log.debug(e);
 * you may not use this file except in compliance with the License.

 * Unless required by applicable law or agreed to in writing, software

    }
                public String getText(Object element) {
                }
            public boolean select(Viewer viewer, Object parentElement, Object element) {
    }
    protected INavigatorFilter getNavigatorFilter() {
                        }

import org.jkiss.dbeaver.ui.navigator.SimpleNavigatorTreeFilter;
 *
    @Override
    protected DBNNode getDefaultRootNode() {
            UINavigatorMessages.navigator_project_explorer_columns_name_description,
    }
        super.createPartControl(parent);
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.text.SimpleDateFormat;
                            return FILE_SIZE_FORMAT.format(Files.size(path));
                    }
        columnController.setForceAutoSize(true);
            SWT.LEFT, true, true,
    protected void createExtraColumns(ViewerColumnController<?, ?> columnController, TreeViewer viewer) {
    @Override
    public static DBNFileSystems getFileSystemsNode() {
        DBNFileSystems fsRootNode = getFileSystemsNode();
 *

 * You may obtain a copy of the License at
                }
    public void init(IViewSite site) throws PartInitException {
    protected DatabaseNavigatorTreeFilterObjectType getDefaultFilterType() {
import org.jkiss.dbeaver.ui.UIExecutionQueue;
/*
import org.jkiss.dbeaver.model.navigator.DBNProjectDatabases;
            new ColumnLabelProvider() {
    @NotNull
    @Override
                public Image getImage(Object element) {
