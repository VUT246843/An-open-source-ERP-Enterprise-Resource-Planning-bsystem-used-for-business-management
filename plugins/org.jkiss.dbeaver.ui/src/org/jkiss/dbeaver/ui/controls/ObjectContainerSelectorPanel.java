        } else {
        containerNameCombo.select(0);
 * You may obtain a copy of the License at
    private void loadHistory() {

                            DBNNode node = navigatorModel.getNodeByPath(monitor, project, historyItem.containerPath);
    private final Combo containerNameCombo;
                    containerHint != null ? containerHint : containerTitle,
                        addNodeToHistory((DBNDatabaseNode) node);

                moveHistoryItemToBeginning(historyItem);
            node.getDataSourceContainer().getName(),
import org.eclipse.swt.SWT;
import java.lang.reflect.InvocationTargetException;

                    UIUtils.runInProgressDialog(monitor -> {
        }
        private final String containerName;
                } catch (DBException e) {
        containerNameCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            this.containerNode = node;
        }
        };

            return getFullName();
    private final DBPProject project;
                        itemSection.get("data-source"),
                DBNProject rootNode = navigatorModel.getRoot().getProjectNode(project);
                DBNNode selectedNode = getSelectedNode();
import org.eclipse.swt.widgets.Combo;
                } catch (InvocationTargetException e) {
    }
        );


        if (node instanceof DBNDatabaseNode) {
        }
            public void mouseDoubleClick(MouseEvent e) {
                    IDialogSettings itemSection = selectorSection.getSection("item" + i);
                        itemSection.get("name"),
            if (item.isSameNode(node)) {
        containerIcon = new Label(this, SWT.NONE);
        containerIcon.setImage(DBeaverIcons.getImage(DBIcon.TYPE_UNKNOWN));
            @Override
    private final String selectorId;
            containerNameCombo.select(-1);
        layout.marginWidth = 0;
        containerNameCombo.remove(itemIndex);
    private HistoryItem addNodeToHistory(DBNDatabaseNode node) {
                        setSelectedNode((DBNDatabaseNode) node);
        loadHistory();
                if (node != null) {
                    new Class[] { DBSObjectContainer.class },
        });
                    selectedNode,
import org.jkiss.dbeaver.model.DBPObject;
                assert navigatorModel != null;
    private final List<HistoryItem> historyItems = new ArrayList<>();
        private DBNDatabaseNode containerNode;
            String dsName = containerNode != null ? containerNode.getDataSourceContainer().getName() : dataSourceName;
        IDialogSettings historySection = UIUtils.getDialogSettings("ObjectContainerSelector");
            UIMessages.browse_button_choose,
        if (containerHint != null) {
        });
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    if (itemSection == null) {
                }

import org.eclipse.swt.widgets.Composite;
    protected abstract void setSelectedNode(DBNDatabaseNode node);
        historyItems.addFirst(newItem);

        Runnable containerSelector = () -> {
 * limitations under the License.

import org.jkiss.dbeaver.DBException;
        }
 * distributed under the License is distributed on an "AS IS" BASIS,

        containerNameCombo.addSelectionListener(new SelectionAdapter() {
import org.jkiss.dbeaver.ui.UIIcon;
        public boolean isSameNode(DBNDatabaseNode node) {
            return containerName + "  [" + dsName + "]";
            if (CommonUtils.equalObjects(dsName, containerName)) {
        }
            SelectionListener.widgetSelectedAdapter(e -> containerSelector.run()));
            if (nodeObject instanceof DBSObjectContainer objectContainer) {
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
            }
        if (selectedNode instanceof DBNDatabaseNode node) {
import org.jkiss.dbeaver.model.app.DBPProject;
}
        this.project = project;
            UIIcon.OPEN,
            }
                        // Upper level of container
    private final Label containerIcon;
    private void handleContainerChange() {
    }
            }
        this.selectorId = selectorId;
        if (historyIndex >= 0 && historyIndex < historyItems.size()) {

            itemSection.put("data-source", item.dataSourceName);
        for (int i = 0; i < historyItems.size(); i++) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
/**
import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.jkiss.dbeaver.model.navigator.DBNProject;

import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
        }
        }
            node
import org.jkiss.dbeaver.model.struct.DBSEntity;

 */
                            assert navigatorModel != null;
        }
                    Class<?> childrenClass = objectContainer.getPrimaryChildType(null);
                }
        HistoryItem item = addNodeToHistory(node);
import org.eclipse.swt.widgets.Label;
            this.dataSourceName = dataSourceName;
        for (HistoryItem item : historyItems) {
                    try {
        if (node == null) {
                            }
            node.getNodeUri(),


        private final String containerPath;
 *     http://www.apache.org/licenses/LICENSE-2.0

        return newItem;
        containerNameCombo.add(item.getFullName(), 0);
            @Override
        IDialogSettings projectSection = UIUtils.getSettingsSection(selectorHistorySection, project.getName());

                    new Class[]{ DBSInstance.class, DBSObjectContainer.class },
            return;
            }
        GridLayout layout = new GridLayout(4, false);
 * Unless required by applicable law or agreed to in writing, software
 */
                            throw new InvocationTargetException(e);
        } else {
            if (historyItem.containerNode != null) {
        containerIcon.setImage(DBeaverIcons.getImage(node.getNodeIconDefault()));
                        checkValidContainerNode(node);
                moveHistoryItemToBeginning(item);

    }
        IDialogSettings selectorHistorySection = UIUtils.getDialogSettings("ObjectContainerSelector");
    public static final int MAX_HISTORY_LENGTH = 20;
        public String getFullName() {
                setSelectedNode(historyItem.containerNode);
        browseButton = UIUtils.createPushButton(
                        null));
    private void updateToolTips() {
            }
            IDialogSettings selectorSection = projectSection.getSection(selectorId);
            this.containerName = containerName;
                                historyItem.containerNode = dbNode;
                    }
        historyItems.remove(item);
        moveHistoryItemToBeginning(item);
        containerNameCombo = new Combo(this, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
                containerNameCombo.remove(historyIndex);
import org.eclipse.swt.layout.GridData;

        updateToolTips();
        super(parent, SWT.NONE);
                try {
                historyItems.remove(historyIndex);
 * Licensed under the Apache License, Version 2.0 (the "License");
        DBNNode selectedNode = getSelectedNode();
    private final Button browseButton;
 * ObjectContainerSelectorPanel
import org.eclipse.swt.widgets.Button;
import org.jkiss.dbeaver.model.DBIcon;
    }
            throw new DBException("Non-database node " + node);
import org.jkiss.dbeaver.ui.UIUtils;
        containerNameCombo.add(newItem.getFullName(), 0);
    public void checkValidContainerNode(DBNNode node) throws DBException {
    protected ObjectContainerSelectorPanel(Composite parent, DBPProject project, String selectorId, String containerTitle, String containerHint) {
            public void widgetSelected(SelectionEvent e) {
 * you may not use this file except in compliance with the License.
            node.getNodeFullName(),
    private static class HistoryItem {
            HistoryItem historyItem = historyItems.get(historyIndex);
                            DBNModel navigatorModel = project.getNavigatorModel();
        }
                        try {
                    } catch (DBException e) {
        }
                assert rootNode != null;
                updateToolTips();
                        } catch (DBException e) {
        containerNameCombo.setText("");
            this,

                        break;
                            if (node instanceof DBNDatabaseNode dbNode) {
    }
        this.setLayout(layout);
    private void moveHistoryItemToBeginning(HistoryItem item) {
    }
        @Override
        int historyIndex = containerNameCombo.getSelectionIndex();
        IDialogSettings projectSection = historySection.getSection(project.getName());
                    UIUtils.getCatalogSchemaTerms(node.getDataSourceContainer(), true)));
                    rootNode.getDatabases(),
        }
                DBNNode node = DBWorkbench.getPlatformUI().selectObject(

        HistoryItem(String containerName, String containerPath, String dataSourceName, DBNDatabaseNode node) {
                NLS.bind(
                }

            }
        if (projectSection != null) {
import org.jkiss.dbeaver.model.struct.DBSInstance;
                    });
                containerSelector.run();
                    throw new DBException("Error determining container elements type", e);
                    if (!DBSEntity.class.isAssignableFrom(childrenClass)) {
            HistoryItem item = historyItems.get(i);
                for (int i = 1; i < MAX_HISTORY_LENGTH; i++) {
                        itemSection.get("path"),
            containerIcon.setImage(DBeaverIcons.getImage(DBIcon.TYPE_UNKNOWN));
    @Nullable
        int itemIndex = historyItems.indexOf(item);
                DBNModel navigatorModel = project.getNavigatorModel();
 *

            containerNameCombo.add(item.getFullName());
                            NLS.bind(UIMessages.bad_container_node_message, node.getName()), e);

            if (selectorSection != null) {
    public void setContainerInfo(DBNDatabaseNode node) {
        updateToolTips();
                    historyItems.add(new HistoryItem(
                handleContainerChange();
                    getShell(),
/*
            } else {
                item.containerNode = node;
import org.jkiss.dbeaver.model.navigator.DBNModel;
                        saveHistory();
            UIMessages.browse_button_choose_tooltip,


                    UIMessages.label_choose,
            UIUtils.addEmptyTextHint(containerNameCombo, text -> containerHint);
            return containerPath.equals(node.getNodeUri());
                        }

                    new Class[]{ DBSSchema.class });

            browseButton.setToolTipText(UIMessages.browse_button_choose_tooltip);
                    }
            browseButton.setToolTipText(
import java.util.List;
    }
import org.jkiss.dbeaver.model.navigator.DBNNode;
                return containerName;
package org.jkiss.dbeaver.ui.controls;
    }
 * DBeaver - Universal Database Manager
        HistoryItem newItem = new HistoryItem(
        this.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    private void saveHistory() {
            IDialogSettings itemSection = selectorSection.addNewSection("item" + (i + 1));
                try {
                        DBWorkbench.getPlatformUI().showError(UIMessages.bad_container_node,
        containerNameCombo.addMouseListener(new MouseAdapter() {
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.DBUtils;
            this.containerPath = containerPath;
    protected abstract DBNNode getSelectedNode();
        private final String dataSourceName;
        public String toString() {
        historyItems.addFirst(item);
        IDialogSettings selectorSection = projectSection.addNewSection(selectorId);
            if (project != null) {
        layout.marginHeight = 0;

import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
import java.util.ArrayList;

 *
        //setSelectedNode(node);
import org.eclipse.swt.layout.GridLayout;
                    DBWorkbench.getPlatformUI().showError("Bad container path", "Can't find database node by path " + historyItem.containerPath, e.getTargetException());
        for (HistoryItem item : historyItems) {
        }
            }
            }
import org.eclipse.swt.events.*;
    }
import org.jkiss.dbeaver.ui.internal.UIMessages;
                return item;
import org.eclipse.osgi.util.NLS;
            if (historyItem.containerNode == null) {
            DBPObject nodeObject = DBUtils.getPublicObject(((DBNDatabaseNode) node).getObject());
                    }

        UIUtils.createControlLabel(this, containerTitle);
                        throw new DBException("You can select only table container (e.g. schema).");
public abstract class ObjectContainerSelectorPanel extends Composite {
            itemSection.put("name", item.containerName);

import org.jkiss.utils.CommonUtils;
                }
        }
 *
            itemSection.put("path", item.containerPath);
                // Load node
            }
import org.eclipse.jface.dialogs.IDialogSettings;

