
        return DataTransferWizard.openWizard(taskConfiguration);
                        DBNNode selNode = null;
            });
                DBPImage dsIcon = node.getObjectContainerIcon();

                }
            editButton.setEnabled(false);
                        pipe != null &&
                                }
                group,

                        NLS.bind(DTUIMessages.data_transfer_task_configurator_confirm_action_question,
                            DataSourceContextProvider contextProvider = new DataSourceContextProvider(dataSourceObject);
            objectsTable.addSelectionListener(new SelectionAdapter() {
import org.jkiss.dbeaver.model.navigator.*;
                DTUIMessages.data_transfer_task_configurator_dialog_button_label_add_table,
            });
                            UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
import org.eclipse.swt.layout.GridData;
            UIWidgets.createTableContextMenu(objectsTable, null);
        ConfigPanel(DBRRunnableContext runnableContext, DBTTaskType taskType) {
        @Override
                                    oldObjectName = defaultSchema.getName();
                @Override
                    }
                                SQLQueryDataContainer container = (SQLQueryDataContainer)producer.getDatabaseObject();
                            if (node instanceof DBNDataSource) {
        }
    }
                            } catch (DBException ex) {

            return taskType.getId().equals(DTConstants.TASK_EXPORT);
                                DBIcon.TREE_SCRIPT,
                    {
        private void updateSettings(Runnable propertyChangeListener) {
                            if (lastDataSource != null) {

import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
                            } else {
                    Class<?> tableClass = isExport ? DBSDataContainer.class : DBSDataManipulator.class;
    private static final Log log = Log.getLog(DataTransferTaskConfigurator.class);
                    if (pipe.getProducer() == null || !pipe.getProducer().isConfigurationComplete()) {
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
            Composite group = UIUtils.createComposite(parent, 1);
import org.jkiss.dbeaver.model.*;
            settings.setDataPipes(dataPipes, isExport());
                    }
                                DBSSchema defaultSchema = contextDefaults.getDefaultSchema();
 *
                        }
            dtWizard.loadNodeSettings();
public class DataTransferTaskConfigurator implements DBTTaskConfigurator, DBTTaskConfigPanelProvider {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            DataTransferSettings settings = dtWizard.getSettings();
                                log.error("Error setting context defaults", ex);
                @Override
            if (node.getDatabaseObject() == null) {
                                    isExport ? null : new DatabaseTransferConsumer((DBSDataManipulator) object));
                        if (dataSource != null) {
import org.eclipse.swt.events.SelectionEvent;
                public void widgetSelected(SelectionEvent e) {
            ));

                return DTUIMessages.data_transfer_error_no_objects_selected;
        @Override
                        pipe.getProducer().getDatabaseObject() instanceof SQLQueryDataContainer);
                }
        }
                            if (dataSourceObject instanceof DBSCatalog) {
            saveSettings();
                            String newObjectName;
                    DataTransferPipe pipe = (selectionIndex >= 0) ?
        }
                if (dsIcon != null) {
                            try {
}
            IDataTransferNode node = getTableNode(pipe);
            propertyChangeListener.run();
                                addPipeToTable(pipe);
                        objectsTable.remove(objectsTable.getSelectionIndex());
                    }
        public void loadSettings() {
                            } else {
                            } else if (node instanceof DBNDatabaseItem) {
        }
            return null;
                    int selectionIndex = objectsTable.getSelectionIndex();
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.eclipse.swt.widgets.Table;
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
        private boolean isExport() {
                            (pipe.getConsumer() == null ? "?" : pipe.getConsumer().getObjectName()));
            DBSObject databaseObject = getTableNode(pipe).getDatabaseObject();
            item.setText(0, CommonUtils.getSingleLineString(CommonUtils.toString(node.getObjectName(), "?")));
            if (itemCount <= 0) return null;
                                DTUIMessages.data_transfer_task_configurator_sql_query_title,
                    }
import java.util.ArrayList;
    @Override
import java.lang.reflect.InvocationTargetException;
import org.jkiss.dbeaver.model.app.DBPProject;

                            }
                buttonsPanel,
import org.jkiss.dbeaver.ui.UIWidgets;
                            DTUIMessages.data_transfer_task_configurator_tables_title_choose_source :
                                dataSource = ((DBNDataSource) node).getDataSource();

                if (!dtWizard.getSettings().isProducerOptional()) {


            DataTransferPipe pipe = (DataTransferPipe) objectsTable.getItem(itemCount - 1).getData();

        public boolean isComplete() {
import org.jkiss.dbeaver.ui.DBeaverIcons;

                public void widgetSelected(SelectionEvent e) {
                    }
                                newObjectName = null;
                item.setText(1, node.getDataSourceContainer().getName());
import org.eclipse.swt.events.SelectionListener;
            Button removeButton = UIUtils.createDialogButton(buttonsPanel, DTUIMessages.data_transfer_task_configurator_dialog_button_label_remove, new SelectionAdapter() {
                            group.getShell(),
                                    SQLQueryDataContainer container = new SQLQueryDataContainer(contextProvider, new SQLQuery(dataSource, query), scriptContext, log);
            TableItem item = new TableItem(objectsTable, SWT.NONE);
                            } catch (DBException ex) {
                return false;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;

                });
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferProducer;
                    IDataTransferProducer<?> producer = pipe.getProducer();
                        }
            return objectsTable.getItemCount() > 0;
        private DataTransferWizard dtWizard;
            List<DataTransferPipe> dataPipes = new ArrayList<>();


import org.jkiss.dbeaver.model.sql.data.SQLQueryDataContainer;
        private Table objectsTable;
            item.setData(pipe);
            UIUtils.createControlLabel(
                                log.debug("Unhandled node type: " + node);
                                DBCExecutionContextDefaults<?, ?> contextDefaults = ((DBCExecutionContextDefaults<?, ?>) executionContext);

                            DTUIMessages.data_transfer_task_configurator_tables_title_choose_target,
                item.setBackground(BaseThemeSettings.instance.colorError);
                            }
            if (objectsTable == null) {
                            String oldObjectName = null;
                                    runnableContext.run(true, true, monitor -> {
            return databaseObject == null ? null : databaseObject.getDataSource();

                                log.error("Error setting context defaults", ex);
                return;
 * distributed under the License is distributed on an "AS IS" BASIS,
            objectsTable.setHeaderVisible(true);
                        UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
                            String newInstanceName;

import org.jkiss.dbeaver.tools.transfer.*;
                                    return;
import java.util.List;
                                newInstanceName = dataSourceObject.getName();

                    DBNNode selNode = null;
            removeButton.setEnabled(false);
                    }
            this.taskType = taskType;
                            DBPDataSourceContainer dataSourceContainer = DBUtils.getContainer(dataSource);
                            }
            item.setImage(0, DBeaverIcons.getImage(node.getObjectIcon()));
            for (DataTransferPipe pipe : settings.getDataPipes()) {
        public DBPDataSource getLastDataSource() {
                    if (tables != null) {
        }
    }
                        if (objectsTable.getItemCount() > 0) {
                                if (defaultSchema != null) {
 * DBeaver - Universal Database Manager
                                DataTransferPipe pipe = new DataTransferPipe(
                                    producer.setDefaultSchema(newObjectName);
import org.jkiss.dbeaver.ui.BaseThemeSettings;
        @Override
        }
import org.jkiss.dbeaver.ui.UIUtils;
                        null);
 *
                        DBNNode node = ObjectBrowserDialog.selectObject(
                                        }
            for (DataTransferPipe pipe : dtWizard.getSettings().getDataPipes()) {

                        .getProjectNode(currentProject).getDatabases();
                DTConstants.TASK_EXPORT.equals(taskType.getId()) ?
                    DataTransferPipe pipe = (DataTransferPipe) item.getData();
                                selNode = rootNode.getDataSource(lastDataSource.getContainer().getId());
    private static class ConfigPanel implements DBTTaskConfigPanel {
        }
                                String query = serviceSQL.openSQLEditor(contextProvider, DTUIMessages.data_transfer_task_configurator_sql_query_title, DBIcon.TREE_SCRIPT, "");
        }
                                DBExecUtils.setExecutionContextDefaults(new VoidProgressMonitor(), dataSource, executionContext, oldInstanceName, null, oldObjectName);
                                DBSObject parentObject = dataSourceObject.getParentObject();
                        for (DBNNode node : tables) {
                            selNode,
                    if (pipe.getConsumer() == null || !pipe.getConsumer().isConfigurationComplete()) {
                            if (dataSourceContainer != null && !dataSourceContainer.isConnected()) {

        private DBPProject currentProject;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
            }
            for (DataTransferPipe pipe : dtWizard.getSettings().getDataPipes()) {
                    DataTransferPipe object = (DataTransferPipe) objectsTable.getItem(objectsTable.getSelectionIndex()).getData();
                                DBExecUtils.setExecutionContextDefaults(new VoidProgressMonitor(), dataSource, executionContext, newInstanceName, null, newObjectName);
                        DBNProjectDatabases rootNode = currentProject.getNavigatorModel().getRoot().getProjectNode(currentProject).getDatabases();

                            new Class[]{DBSInstance.class, DBSObjectContainer.class},
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
                        }

            }
            objectsTable.setLayoutData(new GridData(GridData.FILL_BOTH));
            UIUtils.createDialogButton(
                            null);
                            }
        private DBRRunnableContext runnableContext;
                addPipeToTable(pipe);

                dataPipes.add((DataTransferPipe) item.getData());
            dtWizard = (DataTransferWizard) wizard;
                        group.getShell(),
        public void createControl(Composite parent, TaskConfigurationWizard wizard, Runnable propertyChangeListener) {
import org.eclipse.swt.widgets.Button;

                    DTUIMessages.data_transfer_task_configurator_group_label_export_tables :

                                    producer.setDefaultCatalog(newInstanceName);
                SelectionListener.widgetSelectedAdapter(e -> {
            if (node.getDataSourceContainer() != null) {
        public void saveSettings() {
                                ((SQLQueryDataContainer) producer.getDatabaseObject()).getQuery().getText());
                                newObjectName = dataSourceObject.getName();
                    @Override
    public TaskConfigurationWizard<?> createTaskConfigWizard(@NotNull DBTTask taskConfiguration) {
                            }
                    }
                }
                                item.setText(node.getObjectName());
                            }
                                } catch (InvocationTargetException ex) {
    }
                            try {
                                    updateSettings(propertyChangeListener);
            for (TableItem item : objectsTable.getItems()) {
                                }

                UIUtils.createDialogButton(buttonsPanel, DTUIMessages.data_transfer_task_configurator_dialog_button_label_add_query, new SelectionAdapter() {
                                IDataTransferNode node = getTableNode(pipe);
                if (!dtWizard.getSettings().isConsumerOptional()) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                    }
                        new Class[]{DBSInstance.class, DBSObjectContainer.class, tableClass},
 */
                        DataSourceContextProvider contextProvider = new DataSourceContextProvider(producer.getDatabaseObject());
            Button editButton = UIUtils.createDialogButton(buttonsPanel, DTMessages.data_transfer_wizard_settings_button_edit, new SelectionAdapter() {
        private IDataTransferNode getTableNode(DataTransferPipe pipe) {
            boolean isExport = isExport();
/*
                                if (defaultCatalog != null) {
                                container.setQuery(new SQLQuery(dataSource, query));
                                }
            Composite buttonsPanel = UIUtils.createComposite(group, isExport ? 4 : 3);
            if (objectsTable.getItemCount() == 0) {

                            }
            int itemCount = objectsTable.getItemCount();
                                // Use default database and schema
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.widgets.TableItem;
                            if (query != null) {
                        if (serviceSQL != null) {

import org.jkiss.dbeaver.model.task.DBTTaskType;
            UIUtils.asyncExec(() -> UIUtils.packColumns(objectsTable, true));
        public String getErrorMessage() {
            );
                    public void widgetSelected(SelectionEvent e) {
                    if (producer instanceof DatabaseTransferProducer && producer.getDatabaseObject() instanceof SQLQueryDataContainer) {
                        updateSettings(propertyChangeListener);
                }
                            if (serviceSQL != null) {
                    DBNProjectDatabases rootNode = currentProject.getNavigatorModel().getRoot()
                                    return;
            this.runnableContext = runnableContext;
                    List<DBNNode> tables = ObjectBrowserDialog.selectObjects(
                }
                @Override

import org.jkiss.dbeaver.model.struct.*;
                public void widgetSelected(SelectionEvent e) {
                        CommonUtils.singletonOrEmpty(selNode),
                                try {
                            rootNode,
            if (isExport) {
                    }
 * Data transfer task configurator
                        (DataTransferPipe) objectsTable.getItem(selectionIndex).getData() : null;
import org.eclipse.swt.SWT;
package org.jkiss.dbeaver.tools.transfer.ui.wizard;
                                newInstanceName = null;
            objectsTable = new Table(group, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);
            }
                                    oldInstanceName = defaultCatalog.getName();
                        DBPDataSource dataSource = producer.getDatabaseObject().getDataSource();
                        if (node != null) {
                                contextProvider,
                            String query = serviceSQL.openSQLEditor(
                            if (node instanceof DBNDatabaseNode dbNode) {
        @Override
                        CommonUtils.truncateString(getTableNode(object).getObjectName(), 255))))
import org.jkiss.dbeaver.model.task.DBTTask;
                                return;
import org.jkiss.utils.CommonUtils;
                            }
                            }
                                    DatabaseTransferProducer producer = new DatabaseTransferProducer(container);
import org.jkiss.dbeaver.runtime.ui.UIServiceSQL;
import org.eclipse.osgi.util.NLS;
                                            throw new InvocationTargetException(ex);
            return isExport() ? pipe.getProducer() : pipe.getConsumer();
                        if (lastDataSource != null) {
                        new Class[]{tableClass},
            // Save from config table
                                    DBWorkbench.getPlatformUI().showError(DTUIMessages.data_transfer_task_configurator_title_error_opening_data_source,
            }
                                dataSource = dataSourceObject.getDataSource();

        private void addPipeToTable(DataTransferPipe pipe) {
                    removeButton.setEnabled(pipe != null);

                            new Class[]{DBPDataSource.class, DBSCatalog.class, DBSSchema.class},
                        return false;
                        }
                                return;
 * Unless required by applicable law or agreed to in writing, software
                        }
        @Override
        private DBTTaskType taskType;
                }
            });
            UIUtils.asyncExec(() -> UIUtils.packColumns(objectsTable, true));
                                            DTUIMessages.data_transfer_task_configurator_message_error_while_opening_data_source, ex);
                if (!dtWizard.getSettings().isConsumerOptional()) {
                    TableItem item = objectsTable.getItem(objectsTable.getSelectionIndex());
                }
                                newObjectName = null;
                            } else if (dataSourceObject instanceof DBSSchema) {

 * you may not use this file except in compliance with the License.
                        DBPDataSource dataSource = null;
import org.jkiss.dbeaver.Log;
                        return NLS.bind(DTUIMessages.data_transfer_error_target_not_specified,
 * Copyright (C) 2010-2026 DBeaver Corp and others
                                    DataTransferPipe pipe = new DataTransferPipe(producer, null);
                    if (objectsTable.getItemCount() > 0) {
                        DBSObject dataSourceObject = null;
            this.currentProject = NavigatorUtils.getSelectedProject();
                                    addPipeToTable(pipe);
import org.jkiss.dbeaver.ui.navigator.dialogs.ObjectBrowserDialog;

                                    isExport ? new DatabaseTransferProducer((DBSDataContainer) object) : null,
import org.jkiss.dbeaver.model.exec.DBExecUtils;
            }
import org.jkiss.dbeaver.tasks.ui.DBTTaskConfigurator;
import org.jkiss.dbeaver.tasks.ui.DBTTaskConfigPanel;
                                DBSObject object = dbNode.getObject();

import java.io.PrintWriter;
                            (pipe.getProducer() == null ? "?" : pipe.getProducer().getObjectName()));
 * See the License for the specific language governing permissions and
 *

                        }
                        pipe.getProducer() instanceof DatabaseTransferProducer &&
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                            DTUIMessages.data_transfer_task_configurator_tables_title_choose_source,
                    if (UIUtils.confirmAction(
        }
        }
                            if (executionContext instanceof DBCExecutionContextDefaults) {
                }
            dtWizard.loadSettings();
 */
                                        try {
                        return false;
import org.jkiss.dbeaver.model.sql.SQLScriptContext;
                }
 * limitations under the License.
                            selNode = rootNode.getDataSource(lastDataSource.getContainer().getId());
                if (!dtWizard.getSettings().isProducerOptional()) {

                    DTUIMessages.data_transfer_task_configurator_group_label_import_into
                                } catch (InterruptedException ex) {
    @Override
            }
import org.jkiss.dbeaver.model.impl.DataSourceContextProvider;
                                }

            }

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.DBException;
                        rootNode,
                                            dataSourceContainer.connect(monitor, true, true);
                                if (query != null) {
                    editButton.setEnabled(
            UIUtils.createTableColumn(objectsTable, SWT.NONE, DTUIMessages.data_transfer_task_configurator_table_column_text_data_source);
                                DBSCatalog defaultCatalog = contextDefaults.getDefaultCatalog();
                    if (pipe.getProducer() == null || !pipe.getProducer().isConfigurationComplete()) {

                            DBCExecutionContext executionContext = contextProvider.getExecutionContext();
            }
                        return NLS.bind(DTUIMessages.data_transfer_error_source_not_specified,
                        updateSettings(propertyChangeListener);
                            DBPDataSource lastDataSource = getLastDataSource();
                                    });
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferConsumer;
    public ConfigPanel createInputConfigurator(DBRRunnableContext runnableContext, @NotNull DBTTaskType taskType) {
                        isExport ?

                                newInstanceName = parentObject instanceof DBSCatalog ? parentObject.getName() : null;
                        DTUIMessages.data_transfer_task_configurator_confirm_action_title,
            }
import org.jkiss.dbeaver.tasks.ui.DBTTaskConfigPanelProvider;
import org.eclipse.swt.widgets.Composite;
        return new ConfigPanel(runnableContext, taskType);
                            String oldInstanceName = null;

                    if (pipe.getConsumer() == null || !pipe.getConsumer().isConfigurationComplete()) {
import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizard;
                                dataSourceObject = ((DBNDatabaseItem) node).getObject();
            if (objectsTable.getItemCount() == 0) {
            }

            UIUtils.createTableColumn(objectsTable, SWT.NONE, DTUIMessages.data_transfer_task_configurator_table_column_text_object);
                            }
            DataTransferSettings settings = dtWizard.getSettings();
                                        } catch (DBException ex) {
                                    SQLScriptContext scriptContext = new SQLScriptContext(null, contextProvider, null, new PrintWriter(System.err, true), null);
                                dataSourceObject = ((DBNDataSource) node).getDataSource();
import org.jkiss.dbeaver.model.sql.SQLQuery;
/**
                    item.setImage(1, DBeaverIcons.getImage(dsIcon));
        }
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;

                        DBPDataSource lastDataSource = getLastDataSource();
