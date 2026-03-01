                        GC gc = new GC(metadataComposite);
        });
    }
                    columnNodes[0] = getColumnNodes(monitor, node);
                    }
import java.util.List;
                            itemListControl.getItemsViewer().refresh();
    private ItemListControl itemListControl;
                if (!event.getResult().isOK()) {
                            itemListControl.getColumnController().autoSizeColumns();
    }
        }
        };
                    return Status.CANCEL_STATUS;
            public void done(IJobChangeEvent event) {
                        mainComposite.layout(true, true);
                            itemListControl.getColumnController().createColumns(false);
        DBNDatabaseNode node = DBWorkbench.getPlatform().getNavigatorModel().findNode(input);
import org.jkiss.dbeaver.model.DBPNamedObject;
import org.eclipse.swt.layout.GridLayout;
        itemListControl.setLayoutData(gridData);
    private Composite infoComposite;
                            itemListControl.setIsColumnVisibleById("ordinalPosition", true); //NON-NLS-1
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        resolveObject.schedule();
import org.jkiss.dbeaver.runtime.properties.PropertyCollector;
    private void createTreeControl(@NotNull DBSTable input) {
import org.jkiss.dbeaver.model.DBInfoUtils;
                            itemListControl.setIsColumnVisibleById("fullTypeName", true); //NON-NLS-1
import org.jkiss.dbeaver.model.navigator.DBNNode;
                        }
 * you may not use this file except in compliance with the License.
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ui.BaseThemeSettings;
                            Shell shell = tableComposite.getShell();
                            for (int i = 0; i < itemListControl.getColumnController().getColumnsCount(); i++) {
                    return;
import org.eclipse.swt.graphics.GC;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
            @Override
                        int maxWidth = 0;
                        if (CommonUtils.isEmpty(columnNodeList)) {
                            int extraHeight = ((Table) itemListControl.getItemsViewer().getControl()).getHeaderHeight();
                                Math.min(
                    monitor.done();
        AbstractJob abstractJob = new AbstractJob("Populating table tip columns") {
    }
import org.jkiss.code.NotNull;
import org.eclipse.core.runtime.Status;
            @NotNull
        layout.marginLeft = 5;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.jkiss.dbeaver.model.runtime.AbstractJob;
                                    sz.y + UIUtils.getFontHeight(BaseThemeSettings.instance.baseFontBold) * columnNodeList.size()
        gridData.horizontalSpan = 0;
                    log.error("Error reading table columns", e);
        GridLayout layout = new GridLayout(1, true);
                        int extraWidth = maxWidth;
                }
import org.jkiss.dbeaver.model.struct.DBSObjectReference;
 *
                    try {

                } finally {
    ) throws DBException {
                                Shell shell = mainComposite.getShell();
        });
                        targetObject[0] = objectReference.resolveObject(monitor);
                        PropertyCollector collector = new PropertyCollector(targetObject[0], false);
                                String propertyString = DBInfoUtils.getPropertyString(collector, descriptor);
import java.util.Collection;
        abstractJob.addJobChangeListener(new JobChangeAdapter() {
import org.eclipse.swt.SWT;

                        } else {
        this.input = input;
        IEditorSite subSite = new SubEditorSite(UIUtils.getActiveWorkbenchWindow()
        if (input instanceof DBPNamedObject namedObject && !infoComposite.isDisposed() && !tableComposite.isDisposed()) {
        metadataComposite.setLayout(layout);
            }
                            shell.setMinimumSize(sz.x,
    private Composite tableComposite;

                return Status.OK_STATUS;

                    }
                    if (folderChildren != null) {
        Composite metadataComposite = new Composite(infoComposite, SWT.NONE);
        @NotNull DBRProgressMonitor monitor,
                        });
                        } finally {
        @Nullable DBNNode node
                Class<? extends DBSObject> childrenClass = databaseFolder.getChildrenClass();
        this.infoComposite = UIUtils.createPlaceholder(this.mainComposite, 1);
package org.jkiss.dbeaver.ui.editors.sql.util;
import java.util.Collections;
                            itemListControl.setIsColumnVisibleById("identity", true); //NON-NLS-1
                        infoComposite.layout(true, true);
}
                                Point sz = shell.getMinimumSize();
            .getActivePage()
/*
 *
                        children.addAll(List.of(folderChildren));
                                valueText.setText(propertyString);
                            itemListControl.setIsColumnVisibleById("description", true); //NON-NLS-1
                                    continue;
            }
            @Override
            }
    @NotNull

                        UIUtils.asyncExec(() -> {
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                            }
import org.jkiss.utils.ArrayUtils;
        final Object[] columnNodes = new Object[1];
                                Label label = new Label(placeholder, SWT.READ_ONLY);
                        });
        metadataComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        this.mainComposite.setLayoutData(mainGridData);
                            tableComposite.getShell().layout(true, true);
        };
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.DBSObject;

                }
            }
                try {

            @NotNull
            }
        gridData.verticalSpan = 0;
import org.jkiss.utils.CommonUtils;
                        Collection<DBNNode> columnNodeList = (Collection<DBNNode>) columnNodes[0];
    public Control createContent(@NotNull Composite parent) {
    }
        };

            return Collections.emptyList();
                                if (CommonUtils.isEmpty(propertyString) || !descriptor.hasFeature(DBConstants.PROP_FEATURE_VIEWABLE)) {
            @Override
        for (DBNNode child : ArrayUtils.safeArray(node.getChildren(monitor))) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                UIUtils.syncExec(() -> {
 * DBeaver - Universal Database Manager
                            gc.dispose();
 * You may obtain a copy of the License at
    @NotNull
        this.infoComposite.setLayoutData(infoGridData);
                    if (itemListControl != null && !itemListControl.isDisposed()) {
                    if (itemListControl != null && !itemListControl.isDisposed()) {
import org.eclipse.swt.layout.GridData;
        itemListControl = new ItemListControl(tableComposite, SWT.NONE, subSite, node, null) {

    private static final Log log = Log.getLog(ObjectInformationView.class);
            @Override
                });
                return Status.OK_STATUS;
            }
    }
        List<DBNNode> children = new ArrayList<>();
        GridData gridData = new GridData(GridData.FILL_BOTH);
                    }


        }
            public void done(IJobChangeEvent event) {
        this.tableComposite.setLayoutData(mainGridData);
                        }
        }

            if (child instanceof DBNDatabaseFolder databaseFolder) {
                            gc.setFont(BaseThemeSettings.instance.baseFontBold);
                                mainComposite.getShell().layout(true, true);
    private Composite mainComposite;
                        log.error("Error resolving object", e);
    private Object input;
            }
            if (input instanceof DBSTable table) {
                }
                });
                    }
                            itemListControl.setIsColumnVisibleById("name", true); //NON-NLS-1
            protected String getListConfigId(List<Class<?>> classList) {
                } catch (DBException e) {
                            }
                if (!event.getResult().isOK()) {
public class ObjectInformationView {
                        itemListControl.setRootNode(child);
import org.eclipse.swt.graphics.Point;
                                maxWidth = Math.max(maxWidth, gc.stringExtent(label.getText()).x + gc.stringExtent(valueText.getText()).x);
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                }
                            Point sz = shell.getMinimumSize();
        if (node == null) {
                        collector.collectProperties();
                            itemListControl.appendListData(columnNodeList);

    private void createMetadataFields(@NotNull DBPNamedObject input) {
                if (childrenClass != null && DBSTableColumn.class.isAssignableFrom(childrenClass)) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseFolder;
        abstractJob.schedule();
 */
import org.jkiss.dbeaver.model.struct.rdb.DBSTableColumn;
                        try {
                            if (!mainComposite.isDisposed()) {
                        tableComposite.layout(true, true);
        layout.marginRight = 5;
        layout.marginBottom = 5;
                    return;
        GridData infoGridData = new GridData(GridData.FILL_HORIZONTAL);
            .getActivePart()
    private Collection<DBNNode> getColumnNodes(
        return input != null;
                        return Status.CANCEL_STATUS;
                                        + extraHeight, 600));
 * See the License for the specific language governing permissions and
        final DBPNamedObject[] targetObject = {input};
                                Composite placeholder = UIUtils.createPlaceholder(metadataComposite, 2);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.navigator.itemlist.ItemListControl;
        this.tableComposite = UIUtils.createPlaceholder(this.mainComposite, 1);
                children.add(child);
                                shell.setMinimumSize(sz.x + extraWidth, sz.y + metadataComposite.getSize().y);
                monitor.beginTask("Load table columns", 1);
                        UIUtils.asyncExec(() -> {
import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.dbeaver.DBException;
                    }

                            }
import org.eclipse.core.runtime.IStatus;
        return children;
import java.util.ArrayList;
                    } catch (DBException e) {
import org.jkiss.code.Nullable;
    public void setInput(@NotNull Object input) {
import org.jkiss.dbeaver.ui.UIUtils;
        layout.marginTop = 0;
                return "Suggestion/" + super.getListConfigId(classList);
        this.mainComposite = UIUtils.createPlaceholder(parent, 1);

                    DBNNode[] folderChildren = child.getChildren(monitor);
            @SuppressWarnings("unchecked")
                                placeholder.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
                if (input instanceof DBSObjectReference objectReference) {
        resolveObject.addJobChangeListener(new JobChangeAdapter() {
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
        AbstractJob resolveObject = new AbstractJob("Resolving object") {
            .getSite());

        GridData mainGridData = new GridData(GridData.FILL_BOTH);
                                }
                }
    }
                                itemListControl.getColumnController().setIsColumnVisible(i, false);
import org.eclipse.ui.IEditorSite;
                            itemListControl.dispose();
            } else {
                                label.setText(descriptor.getDisplayName() + ":");
import org.jkiss.dbeaver.Log;
 * limitations under the License.
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    if (!metadataComposite.isDisposed() && !infoComposite.isDisposed() && !mainComposite.isDisposed()) {
import org.eclipse.swt.widgets.*;
                                Text valueText = new Text(placeholder, SWT.READ_ONLY);
            createMetadataFields(namedObject);
            @Override
                UIUtils.syncExec(() -> {
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
                            for (DBPPropertyDescriptor descriptor : collector.getProperties()) {
import org.jkiss.dbeaver.ui.editors.SubEditorSite;
        return this.mainComposite;
                                label.setFont(BaseThemeSettings.instance.baseFontBold);
            @NotNull
    public boolean hasContents() {
                createTreeControl(table);
