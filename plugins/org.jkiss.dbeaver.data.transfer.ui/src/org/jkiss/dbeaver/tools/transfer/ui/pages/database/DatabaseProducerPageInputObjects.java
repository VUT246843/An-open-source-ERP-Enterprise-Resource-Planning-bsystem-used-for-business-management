import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;

                        }
        }
                @Override
        }

import java.util.ArrayList;

        DataTransferSettings settings = getWizard().getSettings();
    private void autoAssignMappings(List<DBSObject> containerObjects) {

                NLS.bind(DTUIMessages.database_producer_page_input_objects_node_select_source, pipe.getConsumer().getObjectName()),
        }
            autoAssignMappings(containerObjects);
    public void activatePage()
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                        if (object instanceof DBSDataContainer) {
                        if (object instanceof DBSDataManipulator) {
                @Override
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferConsumer;
        final DBNModel navigatorModel = DBWorkbench.getPlatform().getNavigatorModel();
                    autoAssignMappings();
import org.jkiss.dbeaver.model.struct.*;
            mappingTable.addSelectionListener(new SelectionAdapter() {
            item.setText(0, DTUIMessages.database_producer_page_input_objects_item_text_none);
            rootNode,
            mappingTable.setLinesVisible(true);
        super(DTUIMessages.database_producer_page_input_objects_name);
                        updateItemData(item, pipe);
import org.jkiss.dbeaver.tools.transfer.DataTransferPipe;
                    DTUIMessages.database_producer_page_input_objects_message_error_reading_container_objects, e);
    public void createControl(Composite parent) {
 * Unless required by applicable law or agreed to in writing, software
        DataTransferSettings settings = getWizard().getSettings();
                    updateConsumerContainer(pipe);
            if (chooseConsumer) {
                }
            navigatorModel.getRoot().getProjectNode(DBWorkbench.getPlatform().getWorkspace().getActiveProject()) : navigatorModel.getRoot();
                    throw new InvocationTargetException(e);
        setPageComplete(false);

import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
                (!chooseConsumer && (pipe.getProducer() == null || pipe.getProducer().getDatabaseObject() == null))) {
        setControl(composite);
        Composite composite = UIUtils.createComposite(parent, 1);
            new Class[] {chooseConsumer ? DBSDataManipulator.class : DBSDataContainer.class}, null);
    }
        }

import org.jkiss.dbeaver.tools.transfer.database.DatabaseConsumerSettings;
                        updatePageCompletion();
            return true;
            DTUIMessages.database_producer_page_input_objects_node_select_table,
            lastSelection,
    }

import org.jkiss.dbeaver.runtime.DBWorkbench;
            }
            lastSelection,
 */
        DBSObject object = lastSelection.getObject();
            updateItemData(item, pipe);
            rootNode,
            autoAssignButton.setText(DTMessages.data_transfer_db_consumer_auto_assign);
                        containerObjects.addAll(children);
            new Class[] {DBSInstance.class, DBSObjectContainer.class},
        } catch (InterruptedException e) {
        boolean chooseConsumer = getWizard().getSettings().isConsumerOptional();
        //final DatabaseProducerSettings settings = getWizard().getPageSettings(this, DatabaseProducerSettings.class);
    private DBNDatabaseNode lastSelection;
import org.eclipse.swt.widgets.TableItem;
                            pipe.setConsumer(new DatabaseTransferConsumer((DBSDataManipulator) object));
    }
        boolean success = false;
        {
        }
                        return;
        }
import org.jkiss.dbeaver.tools.transfer.IDataTransferSettings;
import org.jkiss.dbeaver.ui.DBeaverIcons;
        if (pipe.getConsumer() == null || pipe.getConsumer().getObjectName() == null) {
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferProducer;

            mappingTable = new Table(tablesGroup, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);

import org.eclipse.swt.widgets.Composite;
    @Override
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
    }
/*

            } else {
            setMessage(DTUIMessages.database_producer_page_input_objects_error_message_auto_assign_failed, WARNING);


        if (node instanceof DBNDatabaseNode) {
 *
        }
            autoAssignButton.addSelectionListener(new SelectionAdapter() {
            mappingTable.setHeaderVisible(true);
        {
                if (object != null) {
        java.util.List<DBSObject> containerObjects = new ArrayList<>();
}                    if (children != null) {
                if (object instanceof DBSDataManipulator) {
            setMessage(DTUIMessages.database_producer_page_input_objects_error_message_auto_assign_failed, WARNING);
import org.jkiss.dbeaver.model.runtime.DefaultProgressMonitor;
import org.eclipse.swt.widgets.Button;
                return false;
            UIUtils.getActiveWorkbenchShell(),
                DBSObject object = DBUtils.findObject(containerObjects, objectToMap.getName());
    }
    }
                NLS.bind(DTUIMessages.database_producer_page_input_objects_node_select_target, pipe.getProducer().getDatabaseObject().getName()):
                    Collection<? extends DBSObject> children = objectContainer.getChildren(new DefaultProgressMonitor(mon));
        }
        }
                }
                    pipe.setProducer(new DatabaseTransferProducer((DBSDataContainer) object));
 * DBeaver - Universal Database Manager
        boolean chooseConsumer = settings.isConsumerOptional();
        final DBNModel navigatorModel = DBWorkbench.getPlatform().getNavigatorModel();
                } catch (DBException e) {

        }
                }
    }
    protected boolean chooseEntity(DataTransferPipe pipe)

                    } else {
                }
        updatePageCompletion();
package org.jkiss.dbeaver.tools.transfer.ui.pages.database;
            return;
        }
    @Nullable
        DataTransferSettings settings = getWizard().getSettings();
            new Class[] {DBSObjectContainer.class},
            object = DBUtils.getAdapter(DBSObjectContainer.class, ((DBSWrapper) node).getObject());
                    DataTransferPipe pipe = (DataTransferPipe) item.getData();
import org.jkiss.dbeaver.ui.UIIcon;
import org.jkiss.dbeaver.model.navigator.DBNNode;

import org.jkiss.dbeaver.tools.transfer.DataTransferSettings;

    @Override

                    }
import org.eclipse.swt.layout.GridData;
        } else {

    {
                }
import org.jkiss.dbeaver.model.navigator.DBNModel;
                    if (mappingTable.getSelectionIndex() < 0) {
    }
        DataTransferSettings settings = getWizard().getSettings();
            Composite controlGroup = UIUtils.createComposite(composite, 1);
        setDescription(DTUIMessages.database_producer_page_input_objects_description);
            DBSObject object = ((DBNDatabaseNode) node).getObject();
            getWizard().getContainer().run(true, true, mon -> {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            item.setImage(0, null);

        setErrorMessage(null);
        if (objectContainer == null) {
 * you may not use this file except in compliance with the License.
                public void widgetSelected(SelectionEvent e)
            null);

import org.jkiss.dbeaver.DBException;
            mappingTable.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.eclipse.swt.widgets.Table;
        final DBNNode rootNode = DBWorkbench.getPlatform().getWorkspace().getProjects().size() == 1 ?
                    }
        setTitle(DTUIMessages.database_producer_page_input_objects_title);
            autoAssignButton.setImage(DBeaverIcons.getImage(UIIcon.ASTERISK));
 *
            return null;
        mappingTable.removeAll();

            }
        final DBNNode rootNode = DBWorkbench.getPlatform().getWorkspace().getProjects().size() == 1 ?
 * distributed under the License is distributed on an "AS IS" BASIS,
                    TableItem item = mappingTable.getItem(mappingTable.getSelectionIndex());

            if (pipe.getConsumer() != null && pipe.getConsumer().getDatabaseObject() instanceof DBSDataManipulator databaseObject) {
            UIUtils.createControlLabel(tablesGroup, DTMessages.data_transfer_wizard_mappings_name);
                    }
 * limitations under the License.
        initializeDialogUnits(parent);
            DBWorkbench.getPlatformUI().showError(DTUIMessages.database_producer_page_input_objects_title_assign_error,
import org.jkiss.code.Nullable;
        if (CommonUtils.isEmpty(containerObjects)) {
        for (DataTransferPipe pipe : settings.getDataPipes()) {
                try {
            }
            DataTransferPipe pipe = (DataTransferPipe) item.getData();
        IDataTransferSettings consumerSettings = getWizard().getSettings().getNodeSettings(getWizard().getSettings().getConsumer());

        } else {
            });
        if (consumerSettings instanceof DatabaseConsumerSettings databaseConsumerSettings) {
            });
import org.eclipse.swt.events.SelectionEvent;
            navigatorModel.getRoot().getProjectNode(DBWorkbench.getPlatform().getWorkspace().getActiveProject()) : navigatorModel.getRoot();

    private void updateItemData(TableItem item, DataTransferPipe pipe) {
                    success = true;
        if (!(object instanceof DBSObjectContainer)) {
        if (pipe.getProducer() == null || pipe.getProducer().getDatabaseObject() == null) {
            item.setImage(0, DBeaverIcons.getImage(settings.getProducer().getIcon()));
                    widgetSelected(e);

                    if (chooseEntity(pipe)) {
            item.setData(pipe);
        try {
        DBNNode node = DBWorkbench.getPlatformUI().selectObject(
            tablesGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
                DBSObject objectToMap = chooseConsumer ? pipe.getProducer().getDatabaseObject() : pipe.getConsumer().getDatabaseObject() ;
                if (objectToMap == null) {
    {
        if (!success) {
        for (TableItem item : mappingTable.getItems()) {
import org.jkiss.dbeaver.model.DBUtils;
        DBSObjectContainer objectContainer = chooseEntityContainer();
            UIUtils.getActiveWorkbenchShell(),
public class DatabaseProducerPageInputObjects extends DataTransferPageNodeSettings {
            chooseConsumer ?
                @Override
    @Override
                {
                if (container instanceof DBSObjectContainer) {
        }
    {
    public boolean isPageApplicable() {
            setMessage(DTUIMessages.database_producer_page_input_objects_error_message_auto_assign_failed, WARNING);
                }
            item.setText(1, pipe.getConsumer().getObjectName());
import org.jkiss.dbeaver.tools.transfer.ui.pages.DataTransferPageNodeSettings;
                    pipe.setConsumer(new DatabaseTransferConsumer((DBSDataManipulator) object));
    protected boolean determinePageCompletion()
            lastSelection = (DBNDatabaseNode) node;
        updatePageCompletion();
import org.jkiss.dbeaver.ui.UIUtils;
                    updateItemData(item, pipe);
        return (DBSObjectContainer) object;
            if (pipe.getConsumer() == null || pipe.getProducer() == null || pipe.getProducer().getDatabaseObject() == null) {
                    }
 * See the License for the specific language governing permissions and
                    databaseConsumerSettings.setContainer((DBSObjectContainer) container);

import java.lang.reflect.InvocationTargetException;
            new Class[] {DBSInstance.class, DBSObjectContainer.class, DBSDataContainer.class},
                public void widgetSelected(SelectionEvent e) {
            UIUtils.asyncExec(() -> UIUtils.packColumns(mappingTable, true));
        }
                }
 * Licensed under the Apache License, Version 2.0 (the "License");
            TableItem item = new TableItem(mappingTable, SWT.NONE);
import org.eclipse.swt.events.SelectionAdapter;
        if (!(node instanceof DBNDatabaseNode)) {
import java.util.List;
                }
            Composite tablesGroup = UIUtils.createComposite(composite, 1);
        return true;
                            pipe.setProducer(new DatabaseTransferProducer((DBSDataContainer) object));
                    if (chooseConsumer) {
        } catch (InvocationTargetException e) {

    @Override
            UIUtils.createTableColumn(mappingTable, SWT.LEFT, DTUIMessages.data_transfer_wizard_final_column_source);
        DBNNode node = DBWorkbench.getPlatformUI().selectObject(

import org.eclipse.swt.SWT;
        return isProducerOfType(DatabaseTransferProducer.class);
        boolean chooseConsumer = settings.isConsumerOptional();
import java.util.Collection;
    private void updateConsumerContainer(DataTransferPipe pipe) {
        }
    public DatabaseProducerPageInputObjects() {

 * You may obtain a copy of the License at
            }

 *

import org.eclipse.osgi.util.NLS;
            updateConsumerContainer(pipe);
            // ignore
    }
        for (DataTransferPipe pipe : getWizard().getSettings().getDataPipes()) {
                }
            item.setImage(1, DBeaverIcons.getImage(settings.getConsumer().getIcon()));
    }
                        }
            });
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        } else {
                            updateConsumerContainer(pipe);
        lastSelection = (DBNDatabaseNode) node;
        }

            Button autoAssignButton = new Button(controlGroup, SWT.PUSH);
            item.setImage(1, null);
            item.setText(0, DBUtils.getObjectFullName(pipe.getProducer().getDatabaseObject(), DBPEvaluationContext.DML));
import org.jkiss.utils.CommonUtils;
        return false;
    private Table mappingTable;
                DBSObject container = databaseObject.getParentObject();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                public void widgetDefaultSelected(SelectionEvent e) {
                    continue;
            item.setText(1, DTUIMessages.database_producer_page_input_objects_item_text_none);
            if ((chooseConsumer && (pipe.getConsumer() == null || pipe.getConsumer().getDatabaseObject() == null)) ||
            UIUtils.createTableColumn(mappingTable, SWT.LEFT, DTUIMessages.data_transfer_wizard_final_column_target);
    private DBSObjectContainer chooseEntityContainer() {
    private void autoAssignMappings() {
                if (object instanceof DBSDataContainer) {
