        DBSObjectContainer container = getDatabaseConsumerSettings().getContainer();
                        combo.setText(dbpNamedObject.getName());

                DBSObject object = ((DBSWrapper) node).getObject();
            mapping,
            }
                    }
                DTMessages.data_transfer_db_consumer_mapping_rules_button,
import org.jkiss.dbeaver.model.navigator.DBNModel;
import org.jkiss.utils.ArrayUtils;
                // New table?


            });
                                    DatabaseMappingAttribute attribute = (DatabaseMappingAttribute) item.getData();
                    }
                @Override

            if (mappingType == DatabaseMappingType.existing || mappingType == DatabaseMappingType.create) {

            columnTransformer.setLabelProvider(new MappingLabelProvider() {

                    getWizard().runWithProgress(monitor -> {
                }
            }
                    @Override
import org.eclipse.jface.viewers.*;
                                // Call to this method also shows up a dialog.
    protected DatabaseMappingObject getSelectedMapping() {
import org.jkiss.dbeaver.model.runtime.LoggingProgressMonitor;
                    final DatabaseConsumerSettings settings = getDatabaseConsumerSettings();
        }
    @Nullable
                                    attribute.setMappingType(DatabaseMappingType.existing);
        }
                if (containerNode[0] != null) {
                    {
                public void update(ViewerCell cell) {

            updateMappingsAndButtons();
                            if (settingsDialog.open() != IDialogConstants.OK_ID) {

                        String unQuotedNameForSearch = DBUtils.getUnQuotedIdentifier(container.getDataSource(), name);
                            updatePageCompletion();
            return false;
                                AttributeTransformerSettingsDialog settingsDialog = new AttributeTransformerSettingsDialog(
                                getDatabaseConsumerSettings(),
                        } else {
            }
            }
                } else {
                            return;
                } else {

        mappingViewer = new TreeViewer(composite, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);

                    DBSObject container = producerObject.getParentObject();
        return DBObjectNameCaseTransformer.transformName(container.getDataSource(), name);
                        return target != null ? target : mapping.getTargetName();
        }
                protected Object getValue(Object element) {
                });
            // Use first source object as cur selection (it's better than nothing)
            UIUtils.createEmptyLabel(buttonsPanel, 1, 1).setLayoutData(new GridData(GridData.FILL_VERTICAL));
                browseButton.setLayoutData(btnFd);
                            }
                @Override
                }
                    }
                    if (value instanceof DBPNamedObject dbpNamedObject) {
                        mapping = newMapping;
                            }
                });
                        // Use first source object as cur selection (it's better than nothing)
        return isConsumerOfType(DatabaseTransferConsumer.class);
            updateUpAndDownButtons(pipe);
                btnFd.top = new FormAttachment(0, 0);
                public void update(ViewerCell cell) {
        }
                                selectNextColumn(item);
                comboFd.left = new FormAttachment(0, 0);
                    return transformer == null ? "" : transformer.getName();
            columnTarget.getColumn().setText(DTUIMessages.database_consumer_page_mapping_column_target_text);
package org.jkiss.dbeaver.tools.transfer.ui.pages.database;
                Collection<? extends DBSObject> children = container.getChildren(new LoggingProgressMonitor(log));
                    browseButton.addSelectionListener(new SelectionAdapter() {
        }
            }
                    } catch (DBException e) {
                Composite composite = new Composite(parent, SWT.NONE);
                            AttributeTransformerSettingsDialog settingsDialog = new AttributeTransformerSettingsDialog(
                                attributes,
                                if (element instanceof DatabaseMappingAttribute) {
                        return mapping.getTargetName();
 *     http://www.apache.org/licenses/LICENSE-2.0
    private Button downButton;
            overlay.setEditor(loadMappingsButton);
                    browseButton.setVisible(false);
                        containerMapping.refreshMappingType(monitor, DatabaseMappingType.create, forceRefresh, updateAttributesNames);
                        }
                    try {
                rootNode,
                        } else if (e.character == SWT.DEL) {
import org.eclipse.swt.graphics.Point;
        } catch (InterruptedException e) {
                        selectedNode = navigatorModel.getNodeByObject(firstSource);
                            UIUtils.asyncExec(() -> {
            } else if (target == null && mapping.getSource() != null) {
                            Object newVal = openDialogBox(composite);
        }
                        }
                }
                    if (child instanceof DBSDataManipulator) {
            });
    }
        return new DialogCellEditor(mappingViewer.getTree()) {
                if (combo != null && !combo.isDisposed()) {
                }

    }
                                            monitor,
    private void updateUpAndDownButtons() {
                        } else {

                // container's tables
                    }
        final DBPDataSourceContainer container = DatabaseConsumerSettings.getDataSourceContainer(getWizard().getSettings());
            TreeViewerColumn columnTarget = new TreeViewerColumn(mappingViewer, SWT.LEFT);
                                return;
                }
            return;
                        if (attributes != null) {
                @Override
                                if (child instanceof DBSDataManipulator && unQuotedNameForSearch.equalsIgnoreCase(child.getName())) {
        if (container == null || container.getDataSource() == null) {
    private void showPreview(DatabaseMappingContainer mappingContainer) {
                    if (!name.equals(DatabaseMappingAttribute.TARGET_NAME_SKIP) && !name.equals(TARGET_NAME_BROWSE)
                } else {
                            return;
                                getShell(),
            protected Object doGetValue() {
                    @Override
                if (mapping.getTarget() != null) {
                                    } else {
            return false;

                    ? new FormAttachment(browseButton, 0)
            loadMappingsButton = new Button(mappingViewer.getTree(), SWT.PUSH);
                            return;
                            doSetValue(doGetValue());
                combo = new CCombo(

        configureButton.setEnabled(hasMappings);
        List<Throwable> errors = new ArrayList<>();
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
                        }

    @NotNull
                    @Override
    }
                            if (selectedNode instanceof DBSWrapper && ((DBSWrapper) selectedNode).getObject() instanceof DBSObjectContainer) {
    }
                columns[0].setWidth(totalWidth * 35 / 100);
    public void updateMappingsAndButtons() {
                        mappingViewer.getTree().setVisible(true);
                FormLayout fl = new FormLayout();
                    if (CommonUtils.isEmpty(tName)) {
                @Override
                    if (forceRefresh && mapping.getMappingType() == DatabaseMappingType.recreate) {
                        mappingViewer.refresh();
                if (parentElement instanceof DatabaseMappingContainer) {
            }
    @Override
                null);
                        if (newTransformer != null && !newTransformer.getProperties().isEmpty()) {
                UIIcon.CONFIGURATION,
    }
                                        mappingErrorMessage =
                this.autoAssignMappings();
import org.eclipse.swt.events.*;
            container != null && container.isConnected() ||
    private void loadAndUpdateColumnsModel() {

            this);
            return;
        if (mappingType == DatabaseMappingType.create) {
import org.jkiss.code.NotNull;
                @Override
                    }
                                selectedNode = selectedNode.getParentNode();
        createMappingsTree(mappingsGroup);
                                            false,
            int index = ArrayUtils.indexOf(childItems, item);

                                    targetDataContainer = (DBSDataManipulator) child;
            items.add(TARGET_NAME_BROWSE);
 *
                new SelectionAdapter() {

                    DataTransferAttributeTransformerDescriptor newTransformer;
                            mapping.setTarget(null);
                    updatePageCompletion();
                        if (newTransformer == ((DatabaseMappingAttribute) element).getTransformer()) {

                btnFd.right = new FormAttachment(100, 0);
        }
                            TreeItem[] selection = mappingViewer.getTree().getSelection();
                    if (pipeConsumer instanceof DatabaseTransferConsumer databaseTransferConsumer && databaseTransferConsumer.getTargetObject() != null) {
                        } else {

                                            false,
        }
                protected boolean canEdit(Object element) {
                        @Override
                                mappingContainer,
                    ? combo.getText()
                            public void run() {
                        }
                    DBSObjectContainer container = settings.getContainer();
    private boolean firstInit = true;
                DTMessages.data_transfer_db_consumer_target_container,
            }
import org.jkiss.dbeaver.tools.transfer.internal.DTActivator;
                        DBSDataContainer firstSource = settings.getDataMappings().keySet().iterator().next();
                        } else if (e.character == SWT.SPACE) {
            protected Object openDialogBox(Control cellEditorWindow) {
            DBNNode node = DBWorkbench.getPlatformUI().selectObject(
            if (mappings.length == 1 && mappings[0].getTarget() != null) {
            overlay.minimumWidth = buttonSize.x;
                                }
                        if (selectedMapping.getMappingType() == DatabaseMappingType.unspecified) {
                browseButton.setImage(DBeaverIcons.getImage(UIIcon.DOTS_BUTTON));
            public boolean hasChildren(Object element)
        mappingViewer.setInput(model);
            settings.loadObjectContainer(getWizard().getRunnableContext(), getWizard().getSettings(), producerContainer);
            protected void doSetValue(Object value) {
                                        targetDataContainer = (DBSDataManipulator) existingObject;
                }
                        true,
                    combo.setText(value == null ? "" : value.toString());
                        manager.add(new Action("Transformer settings ...") {
            }
                                    if (existingObject instanceof DBSDataManipulator) {
                DTUIMessages.database_consumer_page_mapping_node_title,
import org.jkiss.utils.CommonUtils;
                    }

                            } else {
                    ) {
                                    attribute.updateMappingType(new LoggingProgressMonitor(log), false, false);
            columnTransformer.setEditingSupport(new EditingSupport(mappingViewer) {
                    DatabaseMappingAttribute attrMapping = (DatabaseMappingAttribute) mapping;
            getWizard(),
                    public void widgetSelected(SelectionEvent e)
        };
    }
                    });
                downButton.setEnabled(false);
            TreeViewerColumn columnTransformer = new TreeViewerColumn(mappingViewer, SWT.LEFT);
    private void createMappingsTree(@NotNull Composite composite) {
                            mapExistingTable((DatabaseMappingContainer) selectedMapping);

                    if (mapping == null || !mapping.isSameMapping(newMapping)) {

                });
        mappingViewer.getTree().setHeaderVisible(true);
            {
 * limitations under the License.
        return selection.isEmpty() ? null : (DatabaseMappingObject) selection.getFirstElement();
            mappingRules.setEnabled(false);
        if (firstInit) {
    {
            mappingContainer,
                        mappingViewer.refresh();
    private CustomComboBoxCellEditor createMappingTypeEditor(DatabaseMappingObject mapping) {
        if (mapping == null) {
import org.jkiss.dbeaver.model.navigator.DBNUtils;
                    return selectedNode;
import org.jkiss.dbeaver.tools.transfer.DataTransferSettings;
                            ((DatabaseMappingAttribute)selectedMapping).getParent());
            if (node != null && node instanceof DBSWrapper) {
        if (getDatabaseConsumerSettings().getContainer() == null) {
            if (o instanceof DatabaseMappingContainer) {
                    setContainerInfo(node);
                columns[3].setWidth(totalWidth * 15 / 100);
                    public void widgetSelected(SelectionEvent e) {
                protected void setValue(final Object element, Object value) {
                Object element = selection.getFirstElement();
                                DBSObject existingObject = ns.getObjectByName(monitor, unQuotedNameForSearch);
                        DBSNamespaceContainer namespaceContainer = DBUtils.getAdapter(DBSNamespaceContainer.class, container);
    private static final String TARGET_NAME_BROWSE = "[browse]";
                selectedNode,
                        updatePageCompletion();
        }

                            updated = true;
                                }
                protected CellEditor getCellEditor(Object element) {
                            setMappingTarget(
            setErrorMessage(null);
            }
                        log.debug(
        mappingViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
    protected TreeViewer mappingViewer;
        if (mappingType != DatabaseMappingType.skip) {
        {

import java.lang.reflect.InvocationTargetException;
                @Override
                    try {
        if (mappingContainer == null) {
                        mapColumnsAndTable(
            }
            });
            if (selectedMapping instanceof DatabaseMappingContainer) {
                                    (DatabaseMappingAttribute) element,
                List<? extends DBSEntityAttribute> attributes = parentEntity.getAttributes(new LoggingProgressMonitor(log));
                items.add(transformTargetName(DBUtils.getQuotedIdentifier(mapping.getSource()), mapping.getMappingType()));

import org.eclipse.swt.SWT;
        for (Object o: mappingViewer.getStructuredSelection()) {
                "container.data-transfer.database-consumer",
        List<Object> elementList = Arrays.stream(mappingViewer.getTree().getItems())
        boolean isContainer = false;
        }
            SWT.DROP_DOWN | SWT.READ_ONLY);
                    boolean needsUpdate = false;
                    if (pipe.getProducer() == null || !(pipe.getProducer().getDatabaseObject() instanceof DBSDataContainer sourceDataContainer)) {
                name = transformTargetName(name, mapping.getMappingType());
                    DatabaseMappingObject mapping = (DatabaseMappingObject) cell.getElement();
                    }
    }
            allowsCreate = switch (mapping.getParent().getMappingType()) {
                    ((DatabaseMappingAttribute) mapping).setMappingType(DatabaseMappingType.skip);
            DBNNode rootNode = DBNUtils.getNodeByObject(settings.getContainer());
        DatabaseMappingContainer mappingContainer = getMappingContainerFromCurrentSelection();
                        DBWorkbench.getPlatformUI().showError(DTUIMessages.database_consumer_page_mapping_title_error_mapping_table,
                @Override
import org.jkiss.dbeaver.model.app.DBPProject;
                return composite;
        DataTransferSettings dtSettings = getWizard().getSettings();
import org.jkiss.dbeaver.ui.controls.ObjectContainerSelectorPanel;
                        return transformTargetName(DBUtils.getQuotedIdentifier(mapping.getSource()), DatabaseMappingType.unspecified);
        return getWizard().getPageSettings(this, DatabaseConsumerSettings.class);
        updatePageCompletion();
                comboFd.bottom = new FormAttachment(100, 0);
        DBPProject activeProject = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
                        }
                            selectedMapping instanceof DatabaseMappingContainer

            log.error(lastError);

                                            container,
            return false;

        }
        loadAndUpdateColumnsModel();
            UIUtils.createLabelSeparator(buttonsPanel, SWT.HORIZONTAL);
    protected void onMappingChanged(SelectionChangedEvent event) {
            } else if (selectedMapping instanceof DatabaseMappingAttribute) {
            for (Object element : elementList) {
        } catch (Throwable e) {
        if (upButton != null) upButton.setEnabled(idx > 0);
                    mappingTypes.add(DatabaseMappingType.existing.name());
                        }
        int idx = pipes.indexOf(pipeFromCurrentSelection);
        List<String> mappingTypes = new ArrayList<>();
                    for (final DatabaseMappingContainer mapping : mappings) {
                        containerMapping.refreshAttributesMappingTypes(monitor, false, false);
                rootNode = navigatorModel.getRoot().getProjectNode(
            loadSettings(true);

                            );
                        }
        Composite mappingsGroup = UIUtils.createComposite(composite, 2);
            Throwable lastError = errors.getLast();
                        if (pipe == null || mappingContainer == null) {

/*
            return ((DatabaseMappingAttribute) element).getTransformer();
            });
                @Override
    }
            DBNModel navigatorModel = DBWorkbench.getPlatform().getNavigatorModel();
                if (combo == null || combo.isDisposed()) {

                    }
                        if (object instanceof DBSDataManipulator) {
            for (DataTransferPipe pipe : getWizard().getSettings().getDataPipes()) {
    protected Composite buttonsPanel;
                    return ((DatabaseMappingContainer) parentElement).getAttributeMappings().toArray();
                                            false);

                                        containerMapping.refreshMappingType(
                                if (curIndex < model.size() - 1) {
                    mappingViewer.update(element, null);
                            fireApplyEditorValue();
                    } else {
        getWizard().runWithProgress(monitor -> {
        }
                try {
                    if (transformer != null) {
        IStructuredSelection selection = (IStructuredSelection) mappingViewer.getSelection();
        if (downButton != null) downButton.setEnabled(idx > -1 && idx < pipes.size() - 1);
                    if (settings.getContainer() != null) {
            {
        List<String> items = new ArrayList<>();
            {
            getWizard().getRunnableContext().run(true, true, monitor -> {
    private void mapExistingTable(@NotNull DatabaseMappingContainer mapping) {
                    return element instanceof DatabaseMappingAttribute &&
        boolean hasMappings = hasMappings(getSelectedMapping());
                                mappingContainer.getTargetName(),
                FormData btnFd = new FormData();
                        if (e.character == SWT.CR) {
                                } else if (element instanceof DatabaseMappingContainer container) {

            errors.add(e);
                Button browseButton = new Button(composite, SWT.PUSH);

        }
                            // Show this confirmation if mapping is not recreate at this moment
                    return createMappingTypeEditor((DatabaseMappingObject) element);
                    if (mapping.getTransformer() != null && !mapping.getTransformer().getProperties().isEmpty()) {
                new Class[] {DBSDataManipulator.class},
                    }
                columns[2].setWidth(totalWidth * 15 / 100);
                    loadSettings(false);
            return container.getMappingType() != DatabaseMappingType.unspecified;
    }
        });
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    }
    }
                        container.cacheStructure(monitor, DBSObjectContainer.STRUCT_ATTRIBUTES);
    }
        mappingViewer.addDoubleClickListener(event -> {
        // Load columns model. Update it only if mapping have different set of source columns
                    });
                                element = item.getData();
                try {
    }
                        DatabaseMappingContainer mappingContainer = getMappingContainerFromCurrentSelection();
                        DBSDataManipulator targetDataContainer = null;
                    fireApplyEditorValue();
        return null;
                            doSetValue(sel);
                    setMessage(null);
                combo.addTraverseListener(e -> {
                    //getWizard().runWithProgress(monitor ->
                        }
                btnFd.bottom = new FormAttachment(100, 0);

            if (settings.getContainer() != null) {
        }
                            }
                    super.update(cell);
                                    mapping.getTransformer());

                public void keyReleased(KeyEvent e) {
                mappingTypes.add(DatabaseMappingType.create.name());
                    }
        updatePageCompletion();
                    model.add(mapping);
                        cell.setBackground(null);
        previewDialog.open();
        updateMappingsAndButtons();
                            mapping.refreshMappingType(getWizard().getRunnableContext(), DatabaseMappingType.unspecified, false);
                            }
                protected CellEditor getCellEditor(Object element) {
import org.jkiss.dbeaver.DBException;
                    DatabaseMappingObject mapping = (DatabaseMappingObject) element;
                        mappingViewer.getTree().setVisible(true);
                            }
                                            false));

            });
        if (!model.isEmpty()) {
                allowsCreate = false;
                    DBPDataSource dataSource = settings.getTargetDataSource((DatabaseMappingObject) element);
                        producerContainer = (DBSObjectContainer) container;
                updateMappingsAndButtons();
                        cell.setText(DBUtils.getObjectFullName(mapping.getSource(), DBPEvaluationContext.UI));
        } catch (InvocationTargetException e) {
                });

        }
                });
        if (downButton != null) downButton.setEnabled(false);
            @Override
    }
        }
                                    }
            }
                NLS.bind(DTUIMessages.database_consumer_page_mapping_message_error_auto_mapping_source_table, name),
                updatePageCompletion();
        }
                            return props.entrySet().stream().map(e -> e.getKey() + "=" + e.getValue())
        for (DataTransferPipe pipe : getWizard().getSettings().getDataPipes()) {
        PreviewMappingDialog previewDialog = new PreviewMappingDialog(
        try {
import org.jkiss.dbeaver.tools.transfer.DTConstants;
        super(DTUIMessages.database_consumer_page_mapping_name_and_title);
                                    return;
                    public void widgetSelected(SelectionEvent e) {
            DatabaseMappingContainer mapping = settings.getDataMapping(sourceObject);
                    public void widgetSelected(SelectionEvent e) {
                comboFd.top = new FormAttachment(0, 0);
        mappingRules.setEnabled(hasMappings);
                            dmc.getMappingType()));
                        mappingViewer.refresh();
                    }
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferAttributeTransformerDescriptor;
                    if (mapping.getMappingType() == DatabaseMappingType.unspecified) {
            new Label(hintPanel, SWT.NONE).setText(DTUIMessages.database_consumer_page_mapping_label_hint);
                @Nullable

                    return mapping.getMappingType().name();
            mappingViewer.setSelection(new StructuredSelection(model.getFirst()));

                });
            @Override
                        DatabaseMappingObject selectedMapping = getSelectedMapping();
        DataTransferPipe pipe = getPipeFromCurrentSelection();
                DTMessages.data_transfer_db_consumer_choose_container)
                        CommonUtils.shiftLeft(model, mappingContainer);
                    return null;
            setMessage(lastError.getMessage(), IMessageProvider.ERROR);
                                DBIcon.STATUS_WARNING

            columnTransformer.getColumn().setToolTipText(DTUIMessages.database_consumer_page_mapping_column_transformer_tip);
            getShell(),
            }
        initializeDialogUnits(parent);
        final DatabaseConsumerSettings settings = getDatabaseConsumerSettings();


        }
            if (settings.getContainer() == null) {
                        cell.setBackground(UIUtils.getSharedTextColors().getColor(SharedTextColors.COLOR_WARNING));
                    // Create new mapping for source object
                    if (needsUpdate) {
                        } catch (DBException e) {
    public void activatePage() {
                return null;
                                        ((DatabaseTransferConsumer) consumer).setTargetObject(finalTargetDataContainer);
                protected void setValue(Object element, Object value) {
        boolean finalAllowsCreate = allowsCreate;
    }
                        return null;
                DBSObjectContainer container = settings.getContainer();
                            boolean confirmed = UIUtils.confirmAction(
            return false;
                    containersToCache.add(container);
import org.jkiss.code.Nullable;
            }
                                (DatabaseMappingAttribute) element,
                                            container.getTargetName(),
                            markDirty();
            UIWidgets.fillDefaultTreeContextMenu(manager, mappingViewer.getTree());
            }
            // Lines look weird on an empty table and visually clash with the button
                        }
            .map(Widget::getData).toList();
            updatePageCompletion();
                }

        }
                                true,
                            markDirty();
        {
        if (container != null) {
                        DTUIMessages.database_consumer_page_mapping_message_error_mapping_existing_table, e);
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
                        DBPDataSourceContainer dataSourceContainer = getDatabaseConsumerSettings().getContainer().getDataSource().getContainer();
                        mappingViewer.getTree().setVisible(false);
                return pipe;
                UIIcon.SQL_PREVIEW,
    void autoAssignMappings() {
                        Iterable<? extends DBSEntityAttribute> attributes = parentEntity.getAttributes(new LoggingProgressMonitor(log));
        composite.pack(true);

                        }
    protected DatabaseConsumerSettings getDatabaseConsumerSettings() {

                            }
        });
                }
        List<DataTransferPipe> pipes = getWizard().getSettings().getDataPipes();
                            tsfNames.toArray(new String[0]),
                getWizard().getSettings().sortDataPipes(monitor);
import org.eclipse.swt.custom.ControlEditor;
        Composite composite = UIUtils.createComposite(parent, 1);
                        // Keep container mapping type, refresh only attributes
        final DBPPreferenceStore preferences = DTActivator.getDefault().getPreferences();
    }
                combo.setVisibleItemCount(15);
                    DBNModel navigatorModel = DBWorkbench.getPlatform().getNavigatorModel();
                    } catch (DBException e) {
                } else {
            columnTransformer.getColumn().setText(DTUIMessages.database_consumer_page_mapping_column_transformer_text);
            mappingViewer.addDoubleClickListener(event -> {
import java.util.*;
        return null;
                    if (mapping instanceof DatabaseMappingContainer) {
        }
                fl.marginHeight = 0;
                mapExistingTables(new DatabaseMappingContainer[]{ (DatabaseMappingContainer) element });
            final ControlEditor overlay = new ControlEditor(mappingViewer.getTree());
    private void mapColumnsAndTable(DatabaseMappingContainer mapping) {
            columnSource.getColumn().setText(DTUIMessages.database_consumer_page_mapping_column_source_text);
            //loadAndUpdateColumnsModel();
                    }
                mapColumnsAndTable((DatabaseMappingContainer) selectedMapping);

                Tree table = mappingViewer.getTree();
                        return createTargetEditor(element);
                }
                    }
            @Override
                    } else {
        if (upButton != null) upButton.setEnabled(false);
    private void updateMappingRules() {
        if (!errors.isEmpty()) {
                }
                                    if (consumer instanceof DatabaseTransferConsumer) {
            columnMapping.getColumn().setText(DTUIMessages.database_consumer_page_mapping_column_mapping_text);
                if (mapping instanceof DatabaseMappingAttribute) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
            mappingTypes.add(mappingType.name());
import org.jkiss.dbeaver.model.navigator.DBNNode;
                        if (namespaceContainer != null) {
                                DTUIMessages.database_consumer_page_mapping_recreate_confirm_tip,
                    } else {
    }
                @Override
                    } else {
    private static final Log log = Log.getLog(DatabaseConsumerPageMapping.class);
                    DatabaseMappingObject mapping = (DatabaseMappingObject) cell.getElement();
                }
    protected DataTransferPipe getPipe(DatabaseMappingContainer mappingContainer) {
            if (rootNode == null) {
            configureButton.setEnabled(false);
    private void updateUpAndDownButtons(@NotNull DataTransferPipe pipeFromCurrentSelection) {
            return DatabaseTransferUtils.getTransformedName(container.getDataSource(), name, false);
import org.eclipse.jface.dialogs.IDialogConstants;
                @Override
        UIWidgets.setControlContextMenu(mappingViewer.getTree(), manager -> {
                    IDataTransferConsumer<?, ?> pipeConsumer = pipe.getConsumer();
    public boolean isPageApplicable() {
                }

                DBSObject producerObject = pipe.getProducer().getDatabaseObject();
                                element = item.getData();
    }
        boolean finalIsContainer = isContainer;
                                @SuppressWarnings("unchecked")
                    getWizard().getRunnableContext().run(
            loadMappingsButton.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> loadSettings(true)));
        }
                DatabaseMappingObject selectedMapping = getSelectedMapping();
        mappingViewer.refresh();
        if (dialog.open() == IDialogConstants.OK_ID) {
 * See the License for the specific language governing permissions and
    private void selectNextColumn(@NotNull TreeItem item) {
                        }

                protected CellEditor getCellEditor(Object element) {
            return attribute.getParent().getMappingType() != DatabaseMappingType.unspecified;
                                newTransformer);
                if (!(dbObject instanceof DBSDataContainer sourceDataContainer)) {
                protected void setSelectedNode(DBNDatabaseNode node) {
    @Override
    private ObjectContainerSelectorPanel containerPanel;
        }
                // Depends on the existence of the target table
            }
                    DataTransferAttributeTransformerDescriptor transformer = getTransformer (element);
                        List<String> tsfNames = transformers.stream().map(t->t == null ? "" : t.getName()).toList();
*/
        if (activeProject != null) {
                    }
            });
                        }
                combo.setLayoutData(comboFd);
        mappingViewer.getTree().setVisible(false);
                getWizard().getProject(),
                    }
                }
            buttonsPanel = UIUtils.createComposite(mappingsGroup, 1);
            @Override
                DTMessages.data_transfer_db_consumer_mapping_rules_button_tip,
                        && dataSource != null && !DBUtils.isQuotedIdentifier(dataSource, name)

                                if (existingObject != null) {
    private Button loadMappingsButton;
            @Override
    @Override
                mappingViewer.setSelection(new StructuredSelection(childItems[index + 1].getData()));
                        true,
        }
                            );
                                targetDataSource != null ? DBUtils.getUnQuotedIdentifier(targetDataSource, name) : name, // unquote for better search
        {

        if (mapping instanceof DatabaseMappingAttribute) {
                DTMessages.data_transfer_db_consumer_button_customise,
    }
                }
    {
            mappingRules = UIUtils.createDialogButton(
                        continue;
                    mappingViewer.refresh();
        }
            dtSettings);
                                    getShell(),
                        if (!dataSourceContainer.hasModifyPermission(DBPDataSourcePermission.PERMISSION_EDIT_METADATA)) {
            overlay.minimumHeight = buttonSize.y;
            @Override

                }


public class DatabaseConsumerPageMapping extends DataTransferPageNodeSettings {
                mapExistingTable((DatabaseMappingContainer) mapping);

            protected void doSetFocus() {
            mappingViewer.getTree().setLinesVisible(false);
                    }
    protected boolean hasMappings(@Nullable DatabaseMappingObject mapping) {
                    if (selectedMapping instanceof DatabaseMappingContainer){
            DBSDataContainer sourceObject = (DBSDataContainer)pipe.getProducer().getDatabaseObject();
                }
import org.jkiss.dbeaver.tools.transfer.DataTransferPipe;
        for (DataTransferPipe pipe : getWizard().getSettings().getDataPipes()) {
                columns[1].setWidth(totalWidth * 35 / 100);
                        }
                new Class[] {DBSObjectContainer.class, DBSDataManipulator.class},

                                            DatabaseMappingType.unspecified,
                        DataTransferPipe pipe = getPipeFromCurrentSelection();
        // Mapping table
                                }
        mappingViewer.setContentProvider(new TreeContentProvider() {
                        mappingViewer.refresh();
        //TreeViewerEditor.create(mappingViewer, new TreeViewerFocusCellManager(), ColumnViewerEditor.TABBING_CYCLE_IN_ROW);
                    super.update(cell);
                        newTransformer = DataTransferRegistry.getInstance().getAttributeTransformerByName(tName);
                browseButton.setToolTipText(DTUIMessages.database_consumer_page_mapping_browse_button_tooltip);

    }
                    }
                            DBUtils.getQuotedIdentifier(child),
                        List<DataTransferAttributeTransformerDescriptor> transformers = DataTransferRegistry.getInstance().getAttributeTransformers();
            if (pipe.getProducer() != null) {
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferRegistry;
                        }
        if (loadContainerFromSettings) {
                            }

                        errors.add(e);
                            //Object element = mappingViewer.getStructuredSelection().getFirstElement();
                    }
                            for (DBSObject child : CommonUtils.safeCollection(container.getChildren(monitor))) {
                }
                    return;
                        combo.setText(CommonUtils.toString(value));
                protected void setValue(Object element, Object value) {
                        String targetName = mapping.getTargetName();
                                        UIUtils.asyncExec(() -> mappingViewer.refresh());
                DTMessages.data_transfer_db_consumer_button_customise_description,
                    if (container instanceof DBSObjectContainer) {
        if (getDatabaseConsumerSettings().getContainer() != null ||
            if (name.equals(DatabaseMappingAttribute.TARGET_NAME_SKIP)) {
                                // It could be very noisy in case of a large amount of mappings
                    DBNNode selectedNode = navigatorModel.getNodeByObject(container);
                                }
                                mappingViewer.refresh();

                            newMapping = new DatabaseMappingContainer(
                if (container != null) {
                DTMessages.data_transfer_wizard_page_preview_name,

        {
import org.jkiss.dbeaver.ui.*;
    private void setMappingTarget(DBRProgressMonitor monitor, DatabaseMappingObject mapping, String name, boolean forceRefresh, boolean updateAttributesNames) {

            UIUtils.asyncExec(() -> {
            if (mappingErrorMessage != null) {
                if (!finalIsContainer) {
                    public void widgetSelected(SelectionEvent e) {
                @Override
        if (container == null) {
                }
                    DBPDataSource targetDataSource = settings.getTargetDataSource(mapping);
                    } else {
                if (finalIsContainer) {
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
        ) {
        DatabaseMappingType mappingType = mapping.getMappingType();
                        if (targetDataContainer == null) {
            }
                mappingTypes.add(DatabaseMappingType.recreate.name());
                    if (!(cell.getElement() instanceof DatabaseMappingAttribute)) {
                    } else {
                    composite,
                if (element instanceof DatabaseMappingAttribute mapping) {
                    cell.setText(mapping.getMappingType().name());
            DatabaseConsumerSettings settings = getDatabaseConsumerSettings();
        mappingsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
                        false);
            // Select first element
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;

                }
            previewButton = UIUtils.createDialogButton(
                    if (mapping.getIcon() != null) {

                    }
    }
        setTitle(DTUIMessages.database_consumer_page_mapping_name_and_title);
            IStructuredSelection selection = (IStructuredSelection) mappingViewer.getSelection();
                            // Search for existing data manipulator (writable table)
                        }
    private final List<DatabaseMappingContainer> model = new ArrayList<>();
        if (parentItem != null) {
                    combo.setText("");
                            doSetValue(newVal);
                                ? (DatabaseMappingContainer) selectedMapping : ((DatabaseMappingAttribute) selectedMapping).getParent());
                        updateMappingRules();
                mapColumnsAndTable(((DatabaseMappingAttribute) selectedMapping).getParent());
                            DBSDataManipulator finalTargetDataContainer = targetDataContainer;
        mappingViewer.setSelection(mappingViewer.getSelection());
                            });
                    @Override
                TreeColumn[] columns = table.getColumns();
        final DatabaseConsumerSettings settings = getDatabaseConsumerSettings();
        });
                        if (mapping.getMappingType() != DatabaseMappingType.recreate && mappingType == DatabaseMappingType.recreate) {
 */
    }
        } else if (element instanceof DatabaseMappingAttribute mapping) {
                    } else {
                                    mappingViewer.setSelection(new StructuredSelection(model.get(curIndex + 1)), true);
                            //mappingViewer.editElement(element, 1);
import org.eclipse.jface.dialogs.IMessageProvider;
                }
                }
                @Override
        if (mapping instanceof DatabaseMappingContainer) {

            return name;
            getDatabaseConsumerSettings(),
            }
        MappingRulesDialog dialog = new MappingRulesDialog(getShell(), dataSource, elementList);
            if (getWizard().getSettings().getDataPipes().size() > 1) {
        DBSObjectContainer container = getDatabaseConsumerSettings().getContainer();
                            if (!confirmed) {
            setErrorMessage(DTUIMessages.database_consumer_page_mapping_error_message_set_target_container);
                buttonsPanel,

                        } else if (e.keyCode == SWT.SHIFT) {
                }
                        containerMapping.setTarget(null);
            .map(Widget::getData).collect(Collectors.toList());
            }
                    } catch (DBException e) {
            };
            DBSDataManipulator target = mapping.getParent().getTarget();
    }
/*
                        DatabaseMappingContainer mappingContainer = getMappingContainerFromCurrentSelection();
                public void update(ViewerCell cell) {
        // There is nothing to check if the target container is not chosen
                errorMessage += ": " + mappingErrorMessage;
import org.jkiss.dbeaver.tools.transfer.IDataTransferConsumer;
                        cell.setText("");
            containerPanel = new ObjectContainerSelectorPanel(composite,
                                .collect(Collectors.joining(GeneralUtils.getDefaultLineSeparator()));
                            mapping.setTarget((DBSDataManipulator) object);
            hintPanel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
                                attrMapping.setTargetName(name);
    }
                }
                            UIUtils.showMessageBox(getShell(), DTMessages.data_transfer_wizard_restricted_title, NLS.bind(DTMessages.data_transfer_wizard_restricted_description, dataSourceContainer.getName()), SWT.ICON_WARNING);
            pipe,
            }
                            }
            }
                int totalWidth = table.getClientArea().width;
                    DataTransferAttributeTransformerDescriptor transformer = getTransformer (cell.getElement());
                // Recreate can be used for not-existing at this moment tables if user will save this mapping in the task
                FormData comboFd = new FormData();
                                return;

                        if (!CommonUtils.isEmpty(props)) {
            columnTarget.setLabelProvider(new MappingLabelProvider() {
                            return targetName;
                @Override
                                monitor,
        }
        final DatabaseConsumerSettings settings = getDatabaseConsumerSettings();
                final DBNDatabaseNode[] containerNode = new DBNDatabaseNode[1];
import org.eclipse.swt.layout.*;
                        getWizard().getSettings().processPipeLater(pipe);
            return;
                DTMessages.data_transfer_wizard_page_preview_description,

                        setErrorMessage(e.getMessage());

            TreeItem[] childItems = parentItem.getItems();
                    }
                DBSObject dbObject = pipe.getProducer().getDatabaseObject();
                buttonsPanel,
            });
                                databaseTransferConsumer.getTargetObject()
            }
                comboFd.width = 200;
                if (element instanceof DatabaseMappingContainer container) {
                                            "Name '" + unQuotedNameForSearch + "' is already used by " + DBUtils.getObjectTypeName(existingObject);
        if (settings.getContainer() == null) {

                    : new FormAttachment(100, 0);
                        }
                                List<DatabaseMappingContainer> model = (List<DatabaseMappingContainer>) mappingViewer.getInput();
            isContainer = true;
                if (combo != null && !combo.isDisposed()) {
            });
                            updateMappingsAndButtons();
                        if (!CommonUtils.isEmpty(targetName)) {

        mappingViewer.getTree().setVisible(true);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                        }
            if (pipe.getProducer() == null) {
                }
            }
                                    attribute.setMappingType(DatabaseMappingType.skip);
                            ((DatabaseMappingAttribute) mapping).setMappingType(mappingType);
                protected boolean canEdit(Object element) {
            DBWorkbench.getPlatformUI().showError(DTUIMessages.database_consumer_page_mapping_title_mapping_error,
                                if (element instanceof DatabaseMappingAttribute attribute) {
            if (target instanceof DBSEntity parentEntity) {

                            if (forceRefresh && mapping.getMappingType() == DatabaseMappingType.recreate) {
                                attrMapping.setTarget(matchingAttribute);

            // Control buttons
                    super.update(cell);
                            if (ns != null) {
                            for (TreeItem item : mappingViewer.getTree().getSelection()) {
                    SWT.DROP_DOWN | (finalAllowsCreate ? SWT.NONE : SWT.READ_ONLY));

            }

        try {
        final DatabaseConsumerSettings settings = getDatabaseConsumerSettings();

import org.jkiss.dbeaver.model.*;
                DBSObjectContainer container = DBUtils.getAdapter(DBSObjectContainer.class, parentObject);
        DBSObjectContainer producerContainer = null;
            if (settings.getContainer() != null) {
        // Otherwise we keep current mappings (to allow wizard page navigation without loosing mappings)
                        setErrorMessage(null);
                @Override
 *
            mappingViewer.addSelectionChangedListener(this::onMappingChanged);
        DataTransferPipe pipe = getPipe(mappingContainer);
                            return ((DatabaseMappingAttribute) mapping).getTarget();
        if (loadMappingsButton != null && !loadMappingsButton.isDisposed()) {
                    super.update(cell);
                public void update(ViewerCell cell) {
                protected Object getValue(Object element) {

                for (DBSObjectContainer container : containersToCache) {
                }
            @Override
            configureButton = UIUtils.createDialogButton(
                return ((DatabaseMappingContainer) element).getTargetName();
                    }
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
    private String transformTargetName(String name, @NotNull DatabaseMappingType mappingType) {
                            containerMapping.setTarget(targetDataContainer);
                        );
                            fireApplyEditorValue();
    @Nullable
        mappingTypes.add(DatabaseMappingType.skip.name());
                        }
                        public void widgetSelected(SelectionEvent e) {
                    DatabaseMappingContainer mapping = settings.getDataMapping(sourceDataContainer);
            public Object[] getChildren(Object parentElement)
                    }
                    }
                    return true;
                    // Update current mapping if it differs from new one
            }
                }
                return (DatabaseMappingContainer) o;
        }
                            ((DatabaseMappingContainer) mapping).refreshMappingType(getWizard().getRunnableContext(), mappingType, false);
            columnMapping.setEditingSupport(new EditingSupport(mappingViewer) {

            protected Control createControl(Composite parent) {
                            errors.add(e);
                }
    @Override
                                DBSEntityAttribute::getName);
import org.jkiss.dbeaver.Log;
                            newMapping = new DatabaseMappingContainer(getDatabaseConsumerSettings(), sourceDataContainer);
                                if (settingsDialog.open() != IDialogConstants.OK_ID) {
                    } else {
                        containerMapping.setTargetName(name);
            });
                }
                if (producerObject instanceof DBSDataContainer) {
                        ? DBUtils.getUnQuotedIdentifier(targetDataSource, name) : name);
                    if (attrMapping.getParent().getTarget() instanceof DBSEntity parentEntity) {

import org.jkiss.dbeaver.ui.controls.CustomComboBoxCellEditor;
                        }
                            }
                                    container.refreshMappingType(getWizard().getRunnableContext(), DatabaseMappingType.skip, false);
                        if (mapping instanceof DatabaseMappingAttribute) {
                    DatabaseMappingContainer newMapping;
                            e

}
                        monitor,
        });
                            DBSNamespace ns = namespaceContainer.getNamespaceForObjectType(RelationalObjectType.TYPE_TABLE);
                    DBWorkbench.getPlatformUI().showError(DTUIMessages.database_consumer_page_mapping_title_error_mapping_table,
        {
                        updateUpAndDownButtons(pipe);
                                needsUpdate = true;
                protected DBNNode getSelectedNode() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                for (DataTransferPipe pipe : getWizard().getSettings().getDataPipes()) {

            preferences.getBoolean(DTConstants.PREF_RECONNECT_TO_LAST_DATABASE)
                                DBUtils.getObjectFullName(container, DBPEvaluationContext.UI) + "'",
        final DatabaseConsumerSettings settings = getDatabaseConsumerSettings();
                @Override
        {
                    }

                            }
                    }
                    activeProject).getDatabases();

            if (getWizard().getSettings().getDataPipes().size() > 1) {
            if (index >= 0 && index < childItems.length - 1) {
                    }
            if (mapping == mappingContainer) {
                    }
                    }
                @Override
                    attrMapping.setMappingType(DatabaseMappingType.create);
                                UIUtils.asyncExec(() -> mapColumnsAndTable(mapping));
                    setErrorMessage(null);
import org.jkiss.dbeaver.tools.transfer.database.*;
            mappingViewer.getTree().addKeyListener(new KeyAdapter() {
                }

                }
                        showPreview(selectedMapping instanceof DatabaseMappingContainer ?
                        for (DatabaseMappingContainer mappingContainer : settings.getDataMappings().values()) {
    public void createControl(Composite parent) {
                if (selectedMapping != null) {
                }
import org.eclipse.swt.custom.CCombo;
                        cell.setText(transformer.getName());
                    return true;

    }
        DBPDataSource dataSource = container.getDataSource();
                        DBSDataManipulator target = ((DatabaseMappingContainer) mapping).getTarget();
                            if (element instanceof DatabaseMappingContainer) {
import org.eclipse.osgi.util.NLS;
            @Override
                return combo != null && !combo.isDisposed()
                public String getToolTipText(Object element) {
                    setMappingTarget(new LoggingProgressMonitor(log), (DatabaseMappingObject) element, finalName, false, false);
            if (!selection.isEmpty()) {
        new DefaultViewerToolTipSupport(mappingViewer);
            hintPanel.setLayout(new GridLayout(3, false));
                        DataTransferPipe pipe = getPipeFromCurrentSelection();
import org.eclipse.swt.widgets.*;
                    } catch (DBException e) {
                                } else if (element instanceof DatabaseMappingContainer container) {
            columnTarget.setEditingSupport(new EditingSupport(mappingViewer) {
        return getPipe(mappingContainer);
                case skip, unspecified -> false;
        items.add(DatabaseMappingAttribute.TARGET_NAME_SKIP);

        getWizard().loadNodeSettings();
                        updateUpAndDownButtons(pipe);
            mappingViewer.refresh();
                        if (mapping.getMappingType() == DatabaseMappingType.existing) {
                default -> true;
                        transformers.addFirst(null);
                    ((DatabaseMappingContainer) mapping).refreshMappingType(
                        ((DatabaseMappingAttribute) element).setTransformer(newTransformer);
                                monitor,
import org.jkiss.dbeaver.ui.controls.TreeContentProvider;
                                if (pipeFromCurrentSelection != null) {
                fl.spacing = 0;
                                // Select next container
            String errorMessage = DTUIMessages.database_consumer_page_mapping_error_message_set_all_tables_mappings;

                        DatabaseMappingType.skip,
                        DatabaseMappingObject selectedMapping = getSelectedMapping();
                    String name = CommonUtils.toString(value);
                if (value == null) {
                }
                        monitor -> containerNode[0] = DBNUtils.getNodeByObject(monitor, settings.getContainer(), false)

                    if (transformer != null) {
                getShell(),
                            }
                                return;
                }
                composite.setLayout(fl);
import org.eclipse.jface.action.Action;
                }
    @Nullable
            }
                }
            firstInit = false;
 *
                            if (matchingAttribute != null) {
    }
            Composite hintPanel = new Composite(composite, SWT.NONE);
    }
                                getShell(),
    private Button configureButton;
    private void mapExistingTables(@NotNull DatabaseMappingContainer[] mappings)
                            @Override
                    continue;
            });
                        Map<String, Object> props = ((DatabaseMappingAttribute) element).getTransformerProperties();

        }
            mappingViewer.refresh();
            }
        }
                    mappingViewer.setSelection(mappingViewer.getSelection());
            return true;
            // Target container
    private DataTransferPipe getPipeFromCurrentSelection() {
                    } else {
                                DTUIMessages.database_consumer_page_mapping_recreate_confirm_title,
    }
import org.jkiss.dbeaver.tools.transfer.ui.pages.DataTransferPageNodeSettings;
                comboFd.right = finalIsContainer
                            SWT.DROP_DOWN | SWT.READ_ONLY);

                    DatabaseMappingObject mapping = (DatabaseMappingObject) cell.getElement();
                    if (selectedNode == null && !settings.getDataMappings().isEmpty()) {
        {
import org.jkiss.dbeaver.model.struct.*;
        mapExistingTables(new DatabaseMappingContainer[]{mapping});
                        items.add(transformTargetName(
                            mapping.refreshMappingType(getWizard().getRunnableContext(), DatabaseMappingType.existing, false);
                                int curIndex = model.indexOf(element);
                        getWizard().getSettings().processPipeEarlier(pipe);
                @Override
            TreeViewerColumn columnMapping = new TreeViewerColumn(mappingViewer, SWT.LEFT);
        if (mapping instanceof DatabaseMappingAttribute attribute) {
                        setErrorMessage(e.getMessage());
                protected Object getValue(Object element) {
                    }

                @Override
                        containerPanel.setContainerInfo(containerNode[0]);
        setControl(composite);
            } else if (name.equals(TARGET_NAME_BROWSE)) {
                for (DBSEntityAttribute attr : CommonUtils.safeCollection(attributes)) {
                    if (element instanceof DatabaseMappingAttribute) {
                for (DBSObject child : CommonUtils.safeCollection(children)) {
            DBNNode selectedNode = rootNode;
                }
                        newTransformer = null;
                    String finalName = name;
                }
        return null;
                    continue;
                                    getWizard().runWithProgress(monitor ->
                    mappingTypes.add(DatabaseMappingType.create.name());
                                attrMapping.setMappingType(DatabaseMappingType.existing);
 * You may obtain a copy of the License at
            }
                        Object element = null;

        if (!settings.isCompleted(getWizard().getSettings().getDataPipes())) {
                upButton = UIUtils.createDialogButton(buttonsPanel, DTMessages.data_transfer_db_consumer_up_label, UIIcon.ARROW_UP, DTMessages.data_transfer_db_consumer_up_tooltip, new SelectionAdapter() { //FIXME i18ze + tooltip
                            openDialogBox(composite);
        }
        }
                        // container's tables
                            updated = true;
                        DatabaseMappingObject mapping = (DatabaseMappingObject) element;
        Object[] expandedElements = mappingViewer.getExpandedElements();
        if (element instanceof DatabaseMappingAttribute) {
        super.updatePageCompletion();
            }
                        if (pipe == null || mappingContainer == null) {
    private Button previewButton;
                    try {
                        DBSObjectContainer container = settings.getContainer();
            return null;
        if (mapping instanceof DatabaseMappingContainer container) {


                if (mapping instanceof DatabaseMappingContainer containerMapping) {
                });
                        cell.setImage(DBeaverIcons.getImage(mapping.getIcon()));
            previewButton.setEnabled(false);
                                mappingViewer.editElement(selection[0].getData(), 1);
                if (pipe.getProducer() == null) {


                    String tName = (String) value;
                            mapColumnsAndTable((DatabaseMappingContainer) selectedMapping);
                    );
        updateUpAndDownButtons();
                            }

        }
                @Override

    }

    public DatabaseConsumerPageMapping() {
    private String mappingErrorMessage;
                        try {

                        if (updated) {
                                containerMapping.refreshMappingType(monitor, DatabaseMappingType.existing, false, false);
        mappingViewer.setExpandedElements(expandedElements);
import org.jkiss.dbeaver.utils.GeneralUtils;
        }
    private static abstract class MappingLabelProvider extends CellLabelProvider {
                                        containerMapping.setTargetName(name);
                        return null;
                    {
                        setErrorMessage(e.getMessage());

            DatabaseMappingObject selectedMapping = getSelectedMapping();

                                    IDataTransferConsumer<?, ?> consumer = pipeFromCurrentSelection.getConsumer();
                new SelectionAdapter() {
        if (dialog.open() == IDialogConstants.OK_ID) {
                                    }
            loadMappingsButton.setImage(DBeaverIcons.getImage(UIIcon.SQL_CONNECT));
        ConfigureMetadataStructureDialog dialog = new ConfigureMetadataStructureDialog(
                        cell.setText(mapping.getSource().getName());
            loadMappingsButton.setText(NLS.bind(DTUIMessages.columns_mapping_dialog_composite_button_reconnect, container.getName()));
                DBIcon.TREE_COLUMNS,
                    updatePageCompletion();

                }
                    newMapping.getAttributeMappings(monitor);
            columnMapping.setLabelProvider(new MappingLabelProvider() {
import java.util.stream.Collectors;
                    e.doit = false;
        List<Object> elementList = Arrays.stream(mappingViewer.getTree().getItems())
        boolean allowsCreate = true;
        TreeItem parentItem = item.getParentItem();
        final DatabaseConsumerSettings settings = getDatabaseConsumerSettings();
        setPageComplete(false);

            UIUtils.createLabelSeparator(buttonsPanel, SWT.HORIZONTAL);
            columnSource.setLabelProvider(new MappingLabelProvider() {
        }
                            mappingViewer,

                        String sel = combo.getText();
                    attrMapping.setTargetName(updateAttributesNames && targetDataSource != null
                    try {
                combo.addSelectionListener(new SelectionAdapter() {
                        } else {
                        if (targetDataContainer != null) {
                                        setMappingTarget(
        }
                                            monitor,
                            mappingViewer.getTree(),
    }
                                selectNextColumn(item);

        return new CustomComboBoxCellEditor(
                selectedNode = navigatorModel.getNodeByObject(mappings[0].getTarget());
            Set<DBSObjectContainer> containersToCache = new HashSet<>();
                        CommonUtils.shiftRight(model, mappingContainer);
                            (DatabaseMappingContainer) selectedMapping :
        setDescription(DTUIMessages.database_consumer_page_mapping_description);
                                DataTransferPipe pipeFromCurrentSelection = getPipeFromCurrentSelection();
 * distributed under the License is distributed on an "AS IS" BASIS,
    private CellEditor createTargetEditor(Object element) throws DBException {

                        while (selectedNode != null) {
                            return;
                        settings.addDataMappings(getWizard().getRunnableContext(), sourceDataContainer, mapping);
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
 * you may not use this file except in compliance with the License.
    @Override
                        ((DatabaseMappingAttribute) element).getMappingType().isValid();

                new SelectionAdapter() {
        @Override
 * DBeaver - Universal Database Manager
        DatabaseConsumerSettings settings = getDatabaseConsumerSettings();
                        if (TARGET_NAME_BROWSE.equals(sel) && finalIsContainer) {
import java.util.List;
                    }
                            }
        mappingViewer.getTree().setLinesVisible(false);
                downButton = UIUtils.createDialogButton(buttonsPanel, DTMessages.data_transfer_db_consumer_down_label, UIIcon.ARROW_DOWN, DTMessages.data_transfer_db_consumer_down_tooltip, new SelectionAdapter() { //FIXME i18ze + tooltip

                combo.setItems(items.toArray(new String[0]));
                }
    protected boolean determinePageCompletion()
                    settings.setContainer(DBUtils.getAdapter(DBSObjectContainer.class, node.getObject()));
    private Button upButton;
                                // Keep container mapping type, refresh only attributes
                fl.marginWidth = 0;
                        }
                        newMapping = new DatabaseMappingContainer(getDatabaseConsumerSettings(), sourceDataContainer);
                            "Error structure for container '" +
    }
        final DBPDataSourceContainer container = DatabaseConsumerSettings.getDataSourceContainer(getWizard().getSettings());
            updatePageCompletion();
                    @Override
                    DataTransferAttributeTransformerDescriptor transformer = getTransformer(element);
            } else if (mappingType == DatabaseMappingType.recreate) {
 * Unless required by applicable law or agreed to in writing, software
                    }
            mappingViewer.getTree(),
                    try {
                        boolean updated = false;
        if (element instanceof DatabaseMappingContainer dmc) {
        }
                            } else {

                    } catch (DBException e1) {

                        }
            private CCombo combo;
        } else {

                    }
                        // Check name conflict in namespace
                    combo.setFocus();
                                }

                                break;
                                sourceDataContainer,
                }
                            return;
                    public void widgetSelected(SelectionEvent e)

        }
                        });
        }

            TreeViewerColumn columnSource = new TreeViewerColumn(mappingViewer, SWT.LEFT);
            buttonsPanel.setLayoutData(new GridData(GridData.FILL_VERTICAL));

    private DataTransferAttributeTransformerDescriptor getTransformer(Object element) {
                protected boolean canEdit(Object element) {
                        }
        }
                            DTUIMessages.database_consumer_page_mapping_message_error_mapping_target_table, e1);
            if (mappingType != parentMapping && parentMapping == DatabaseMappingType.create) {
                        containerPanel.checkValidContainerNode(containerNode[0]);
                }
 * Licensed under the Apache License, Version 2.0 (the "License");
        previewButton.setEnabled(hasMappings);
                        mappingViewer.getTree().setVisible(false);
        model.clear();
            errors.add(e.getTargetException());
                    DatabaseMappingObject mapping = (DatabaseMappingObject) element;

        }
        }
                            } else {
                                        return;
                }
                upButton.setEnabled(false);
                            if (selection.length > 0) {
                    cell.setText(mapping.getTargetName());
        {
                DBSObject parentObject = sourceDataContainer.getParentObject();
        if (dataSource == null) {
                    }

                            if (mappings.length == 1) {
                                    break;
                        DatabaseMappingType mappingType = DatabaseMappingType.valueOf(value.toString());

                            DBSEntityAttribute matchingAttribute = CommonUtils.findBestCaseAwareMatch(
    protected void updatePageCompletion() {
                } catch (DBException e) {
                continue;
                                true);
            } else {
            setErrorMessage(errorMessage);
            };
                        return new CustomComboBoxCellEditor(
    private void loadSettings(boolean loadContainerFromSettings) {
                    if (mapping.getMappingType() == DatabaseMappingType.unspecified) {
                                }
            mappingTypes.toArray(new String[0]),
                    @Override
                        }
                }
            mappingViewer,
    }
                            for (TreeItem item : mappingViewer.getTree().getSelection()) {
        return false;
        public void update(ViewerCell cell)
                } catch (InvocationTargetException | InterruptedException ignored) {
            }
                return element instanceof DatabaseMappingContainer;
    protected Button mappingRules;
                @Override
            });
                    setMappingTarget(monitor, container, container.getTargetName(), true, false);
                    if (element instanceof DatabaseMappingAttribute) {
                e);

        if (pipe != null) {
                        // Reset mappings
                                }
    private DatabaseMappingContainer getMappingContainerFromCurrentSelection() {
                UIUtils.createLabelSeparator(buttonsPanel, SWT.HORIZONTAL);
            }
                    : "";
                    }
                UIUtils.asyncExec(this::updateMappingsAndButtons);
                        mappingViewer.refresh();
                    }
        // Detect producer container (e.g. schema)
                        name = DBObjectNameCaseTransformer.transformName(dataSource, name);
            final Point buttonSize = loadMappingsButton.computeSize(SWT.DEFAULT, SWT.DEFAULT);
        }
            loadMappingsButton.dispose();
                        false,
                buttonsPanel,
                }
            DatabaseMappingType parentMapping = ((DatabaseMappingAttribute) mapping).getParent().getMappingType();
                                containerMapping.refreshAttributesMappingTypes(monitor, false, false);
            protected void updateContents(Object value) {
                    items.add(transformTargetName(DBUtils.getQuotedIdentifier(attr), mapping.getMappingType()));
