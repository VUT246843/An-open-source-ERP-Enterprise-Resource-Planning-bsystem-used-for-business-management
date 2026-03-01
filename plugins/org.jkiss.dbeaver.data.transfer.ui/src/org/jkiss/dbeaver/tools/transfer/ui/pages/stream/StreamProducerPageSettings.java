                            if (consumerSettings instanceof DatabaseConsumerSettings databaseConsumerSettings) {
            if (remoteFS && project != null) {
            );
            item.setText(1, noneItemSelectedText);
        // It is a producer so it must prepare data for consumers
            SelectionListener.widgetSelectedAdapter(e -> new SelectInputFileAction(false).run())
        updatePageCompletion();
            if (selectionIndex < 0) {

package org.jkiss.dbeaver.tools.transfer.ui.pages.stream;
                        StreamTransferProducer producer = new StreamTransferProducer(entityMapping);

        UIUtils.asyncExec(() -> UIUtils.packColumns(filesTable, true));

        }
        if (divPos != -1) {
                }

                    for (DataTransferPipe pipe : dtSettings.getDataPipes()) {
                if (oldMappingContainer != null && oldMappingContainer.getSource() instanceof StreamEntityMapping oldEntityMapping) {
            char c = fileName.charAt(i);
                        monitor,
        return newFilesTable;
                }

                if (file != null) {
                mapping.setTarget(null);
        }
        Table newFilesTable = new Table(inputFilesTableGroup, SWT.SINGLE | SWT.FULL_SELECTION);

                    initializer = monitor -> updateSingleConsumer(monitor, pipe, file.toPath());
                SelectionListener.widgetSelectedAdapter(e -> new SelectInputFileAction(true).run())
            Object layoutData = propsEditor.getControl().getLayoutData();
            && filesTable.getItemCount() == 1
            toolbar,
        return toolbar;
    }

                if (producerSettings.extractExtraEntities(monitor, entityMapping, dtSettings, pendingEntityMappings)) {
                setMessage(DTUIMessages.stream_consumer_page_warning_not_enough_sources_chosen, IMessageProvider.WARNING);
                        }

}
    private boolean isOpenFSBrowser() {
            final DataTransferPipe pipe = (DataTransferPipe) filesTable.getItem(i).getData();
        DataTransferSettings dtSettings = getWizard().getSettings();

    }
            newFilesTable, manager -> {
import org.jkiss.dbeaver.tools.transfer.ui.pages.DataTransferPageNodeSettings;
        UIUtils.asyncExec(() -> new SelectInputFileAction(false).run());
            .getSettings()
    }
            if (oldProducer != null) {

                        producerSettings.updateProducerSettingsFromStream(monitor, producer, getWizard().getSettings());
            DataTransferSettings dtSettings = getWizard().getSettings();
 *
                                e);
            .getSourceObjects()
                                "Error resolving file",

            toolbar,
    public StreamProducerPageSettings() {

        getWizard().loadNodeSettings();

            filesTable.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> updateBrowseButtons()));
        if (tiOpenRemote != null) tiOpenRemote.setEnabled(hasSelection);
                    openFSBrowser();
                    }



        final StreamTransferProducer oldProducer = pipe.getProducer() instanceof StreamTransferProducer stp ? stp : null;
        setMessage(null);
        boolean lastCharSpecial = false;
        if (isInvalidDataTransferNode(consumer)) {
                }
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.eclipse.jface.layout.GridLayoutFactory;
                "*." + CommonUtils.toString(propertySource.getPropertyValue(null, "extension")).replace(",", ";*."), "*.*"
            };
import org.jkiss.dbeaver.tools.transfer.*;
                        String fileName = text.getText();
            lastChar = c;
        Map<String, Object> processorProperties = propertySource.getPropertiesWithDefaults();
        char lastChar = (char)0;
                StreamProducerPageSettings.this,
                        } catch (Exception e) {
                }
    public boolean isPageApplicable() {
                        Arrays.stream(files).map(File::toPath).toArray(Path[]::new)
    @NotNull
            }
            DBWorkbench.getPlatformUI().showError("Error updating stream settings", "Error updating settings", e.getTargetException());
            IDataTransferConsumer<?, ?> originalConsumer = pipe.getConsumer();
            if (layoutData instanceof GridData gd) {
                                producerSettings.updateProducerSettingsFromStream(monitor, producer, dtSettings);
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
        setTitle(DTMessages.data_transfer_wizard_page_input_files_title);
                                item.setText(0, DBFUtils.convertPathToString(path));
import java.nio.file.Path;
import org.jkiss.dbeaver.model.navigator.fs.DBNPathBase;
            UIUtils.createInfoLink(


                IDataTransferConsumer<?, ?> consumer = new DatabaseTransferConsumer();
            );

        if (tiOpenLocal != null) tiOpenLocal.setEnabled(hasSelection);
                .collect(Collectors.toCollection(ArrayDeque::new));

        return getWizard().getSettings().getProcessor();
/*
                DatabaseMappingContainer oldMappingContainer = settings.getDataMappings().remove(oldProducer.getDatabaseObject());

                            }
    }
import org.eclipse.swt.events.SelectionListener;
        }
        // Save settings.
    }
                true, true, monitor -> {
    }
                // Avoid vertical grab to maximum
                    extensions,

        int selectionIndex = filesTable.getSelectionIndex();
            name.deleteCharAt(name.length() - 1);
                }

    }
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
        @Override
                UIIcon.OPEN_EXTERNAL,
                                updatePageCompletion();
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    }
            TableItem item = new TableItem(filesTable, SWT.NONE);
        if (isInvalidDataTransferNode(producer)) {
        IDataTransferConsumer<?, ?> consumer = pipe.getConsumer();
import java.nio.file.Files;
    public void createControl(Composite parent) {
                    DatabaseMappingContainer mapping = new DatabaseMappingContainer(dcs, producer.getDatabaseObject());
        setDescription(DTMessages.data_transfer_wizard_page_input_files_description);
import org.jkiss.dbeaver.runtime.properties.PropertySourceCustom;
        SashForm settingsDivider = new SashForm(parent, SWT.VERTICAL);

        IDataTransferProducer<?> producer = pipe.getProducer();
    private void reloadPipes() {
                return;
                // Remove old mapping because we're just replaced file
        }
                            DBWorkbench.getPlatformUI().showError(
            final Deque<StreamEntityMapping> pendingEntityMappings = Arrays.stream(files).map(StreamEntityMapping::new)
                    initializer = monitor -> updateSingleConsumer(monitor, pipe, selected.getPath());
        final Composite toolbar = new Composite(inputFilesTableGroup, SWT.NONE);
            DBPProject project = getWizard().getProject();
    private Table filesTable;
        {
            inputFilesGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
                Path inputFile = stp.getInputFile();
            final StreamProducerSettings producerSettings = getWizard().getPageSettings(
            final Composite inputFilesTableGroup = new Composite(inputFilesGroup, SWT.NONE);
            }
                if (consumerSettings instanceof DatabaseConsumerSettings dcs) {
            }
        initializeDialogUnits(parent);
        openFSBrowserCheckbox = createOpenFSBrowserCheckbox(toolbar);
        if (showRemoteFS) {
                        DTUIMessages.stream_producer_column_mapping_error_title,
                }
            DBRRunnableWithProgress initializer = null;
        } catch (InterruptedException e) {
                @Override

        public void run() {
                } catch (InvocationTargetException e) {
import org.jkiss.dbeaver.tools.transfer.stream.StreamEntityMapping;

    private Button tiOpenLocal;
import org.jkiss.dbeaver.ui.internal.UIMessages;
                    continue;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;

                    );
        super(DTMessages.data_transfer_wizard_page_input_files_name);
        // Init pipes
        updateBrowseButtons();
            }
        {
        IDataTransferSettings consumerSettings = getWizard().getSettings().getNodeSettings(getWizard().getSettings().getConsumer());

            List<DataTransferPipe> newPipes = new ArrayList<>(dtSettings.getDataPipes());
    }
                if (container instanceof DBSObjectContainer) {
        return UIUtils.createCheckbox(
    }
import org.jkiss.code.NotNull;
                                reloadPipes();
            } else {
                DBSObject container = databaseObject.getParentObject();
                mapping.setTarget(databaseObject);
                                if (mapping != null) {
        toolbar.setLayout(new GridLayout(4, false));
        DBWorkbench.getPlatform().getPreferenceStore()
        setPageComplete(false);
    private static final String HELP_DATA_TRANSFER_LINK = "Data-transfer#import-parameters";
    }

import org.eclipse.swt.SWT;
            final String[] extensions = new String[] {
            } else if (pipe.getConsumer() != null && pipe.getConsumer().getTargetObjectContainer() != null) {
                if (lastChar == '_') {
        updatePageCompletion();
                }
            if (lastCharSpecial) {

import org.jkiss.dbeaver.tools.transfer.stream.StreamTransferProducer;
        }

                try {
        UIUtils.createLabelSeparator(inputFilesTableGroup, SWT.HORIZONTAL);
                );
            UIIcon.OPEN,

    private class SelectInputFileAction extends Action {
                    settings.setContainer((DBSObjectContainer) container);
            DBPProject project = pipe.getConsumer().getProject();
            }
                                    = databaseConsumerSettings.getDataMapping(producer.getDatabaseObject());
                producerSettings.updateProducerSettingsFromStream(monitor, producer, dtSettings);
                    Text text = new Text(table, SWT.BORDER);
                }
            Composite exporterSettings = UIUtils.createComposite(settingsDivider, 1);

        // Save processor properties
                }
    private void updateItemData(TableItem item, DataTransferPipe pipe) {
        }

        settingsDivider.setLayoutData(new GridData(GridData.FILL_BOTH));
            DBWorkbench.getPlatform().getPreferenceStore().getBoolean(DTConstants.PREF_OPEN_LOCAL_FS_BROWSER),
                break;
                    dcs.addDataMappings(getWizard().getRunnableContext(), producer.getDatabaseObject(), mapping);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            inputFilesTableGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
    private void openFSBrowser() {
            item.setText(0, noneItemSelectedText);
                        "\nIf you want to use the files for export/import, please transfer them to <a href=\"#\">Cloud Storage</a>.",
        filesTable.removeAll();
                File file = DialogUtils.openFile(getShell(), extensions);
                DataTransferPipe singlePipe = new DataTransferPipe(producer, consumer);
            tiOpenRemote = UIUtils.createPushButton(
            if (isInvalidDataTransferNode(pipe.getConsumer()) || isInvalidDataTransferNode(pipe.getProducer())) {
                    }
        if (producerSettings != null) {
 * See the License for the specific language governing permissions and

            getWizard().getRunnableContext().run(
            && filesTable.getItem(0).getText().equals(noneItemSelectedText);
                DBNPathBase selected = DBWorkbench.getPlatformUI().openFileSystemSelector(
            item.setText(1, String.valueOf(consumer.getObjectName()));
                item.setText(0, DBFUtils.convertPathToString(inputFile));
                    () -> ShellUtils.launchProgram(HelpUtils.getHelpExternalReference("Cloud-Storage"))

        private void updateMultiConsumers(DBRProgressMonitor monitor, DataTransferPipe pipe, Path[] files) {
                                updateSingleConsumer(new VoidProgressMonitor(), pipe, path);
                    // ignore
        for (int i = 0; i < fileName.length(); i++) {
import java.util.stream.Collectors;
public class StreamProducerPageSettings extends DataTransferPageNodeSettings {
            propsEditor = new PropertyTreeViewer(exporterSettings, SWT.BORDER);
 * DBeaver - Universal Database Manager
                            }
                item.setText(0, String.valueOf(producer.getObjectName()));
                                    mapping.getAttributeMappings(monitor);
        }
                        DTUIMessages.stream_producer_column_mapping_error_message,

    @Override

        List<DataTransferPipe> dataPipes = settings.getDataPipes();

        }
                if (files != null && files.length > 0) {

    private Composite createFileSelectionToolBar(@NotNull Composite inputFilesTableGroup) {
    private String noneItemSelectedText = DTUIMessages.stream_consumer_page_settings_item_text_none;
        }
import org.jkiss.dbeaver.model.struct.DBSDataManipulator;
            } else if (selectionIndex >= dataPipes.size()) {
                    }
                    DataTransferPipe pipe = (DataTransferPipe) item.getData();
                selectionIndex = 0;
            if (!Character.isLetter(c) && lastCharSpecial) {
    private void updateSingleConsumer(@NotNull DBRProgressMonitor monitor, @NotNull DataTransferPipe pipe, @NotNull Path path) {
import java.util.*;
            }
import org.eclipse.swt.custom.SashForm;
        for (DataTransferPipe pipe : dataPipes) {

                    pipe.getProducer() instanceof StreamTransferProducer stp && stp.getInputFile() != null

                gd.heightHint = 150;
        }
            name.append(c);

                    );
    }
                    false,
                            Path path = DBFUtils.resolvePathFromString(new VoidProgressMonitor(), pipe.getConsumer().getProject(), fileName);
            // ignore
                    return text;
                    SWT.OPEN,
 * Unless required by applicable law or agreed to in writing, software
                }
                        Path inputFile = stp.getInputFile();

    private boolean showRemoteFS;
                            } else {
            chooseSourceFile(pipe, remote);
        } else {
        tiOpenLocal = UIUtils.createPushButton(
                UIUtils.createTableColumn(filesTable, SWT.LEFT, DTUIMessages.data_transfer_wizard_final_column_target);
    private String generateTableName(String fileName) {

    }
        return name.toString();
                } catch (DBException e) {
                    log.error(e);
import org.eclipse.swt.layout.GridData;

                        e.getTargetException()
                UIUtils.createInfoLink(
                    getWizard().getRunnableContext().run(true, true, initializer);
            item.setImage(0, DBeaverIcons.getImage(getProducerProcessor().getIcon()));
                try {

    }
                        if (text.getData("saved") != null) {

                }
            saveOpenFSBrowserPreference();
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
                }
        }
                    continue;
 */
                    initializer = monitor -> updateMultiConsumers(
                    false,
    private Button tiOpenRemote;
        propertySource = new PropertySourceCustom(properties, getWizard().getSettings().getProcessorProperties());
            producerSettings.setProcessorProperties(processorProperties);

        for (int i = 0; i < filesTable.getItemCount(); i++) {
                if (c != '_') c = '_';
                                    DTUIMessages.stream_producer_column_mapping_error_title,
            while (!pendingEntityMappings.isEmpty()) {
            dtSettings.setPipeChangeRestricted(true);
        propsEditor.saveEditorValues();
                newPipes.add(singlePipe);
                    }
        );
                    DTUIMessages.stream_producer_select_input_file,
                File[] files = DialogUtils.openFileList(getShell(), DTUIMessages.stream_producer_select_input_file, extensions);
        int divPos = fileName.lastIndexOf(".");
            filesTable = createFilesTable(inputFilesTableGroup);

        settingsDivider.setWeights(400, 600);
        final StreamProducerSettings producerSettings = getWizard().getPageSettings(this, StreamProducerSettings.class);
        producerSettings.updateProducerSettingsFromStream(monitor, newProducer, getWizard().getSettings());
    private Button openFSBrowserCheckbox;
    private boolean isInvalidDataTransferNode(final IDataTransferNode<?> node) {
                    text.setSelection(0, text.getCharCount());
    private Button createOpenFSBrowserCheckbox(@NotNull Composite toolbar) {
                                DatabaseMappingContainer mapping
        private void chooseSourceFile(DataTransferPipe pipe, boolean remoteFS) {
            fileName = fileName.substring(0, divPos);
import org.jkiss.dbeaver.tools.transfer.database.DatabaseConsumerSettings;
        // Update column mappings for database consumers
            DTUIMessages.pref_open_fs_browser_on_enter_tooltip,
    @NotNull
                    singlePipe.initPipe(dtSettings, newPipes.size(), newPipes.size());

        return openFSBrowserCheckbox.getSelection()


import org.jkiss.dbeaver.tools.transfer.registry.DataTransferProcessorDescriptor;
                    return;
    protected boolean determinePageCompletion() {
            } else {
                if (selected != null) {
            } else {
            UIUtils.createTableColumn(filesTable, SWT.LEFT, DTUIMessages.data_transfer_wizard_final_column_source);
    @Override
    }
                        }
            new CustomTableEditor(filesTable) {
            item.setImage(0, null);
            .setValue(DTConstants.PREF_OPEN_LOCAL_FS_BROWSER, openFSBrowserCheckbox.getSelection());
            lastCharSpecial = !Character.isLetterOrDigit(c);
    private Table createFilesTable(@NotNull Composite inputFilesTableGroup) {
                        settings.addDataMappings(getWizard().getRunnableContext(), entityMapping, new DatabaseMappingContainer(oldMappingContainer, entityMapping));
            item.setData(pipe);
        return getWizard()
            settings.addDataMappings(getWizard().getRunnableContext(), newProducer.getDatabaseObject(), mapping);
                return false;
                UIMessages.text_with_open_dialog_browse_remote,
    }
                    if (oldEntityMapping.isSameColumns(newProducer.getEntityMapping())) {
            0

                        pipe,

                    if (control instanceof Text text) {

        return isProducerOfType(StreamTransferProducer.class);
import org.jkiss.utils.CommonUtils;

                }
            if (producer instanceof StreamTransferProducer stp) {
            }
import java.lang.reflect.InvocationTargetException;

import org.jkiss.dbeaver.ui.*;
        if (!name.isEmpty() && name.charAt(name.length() - 1) == '_') {
        try {
    }
        newFilesTable.setLayoutData(new GridData(GridData.FILL_BOTH));
        setControl(settingsDivider);


        pipe.setProducer(newProducer);
            }
import org.jkiss.dbeaver.ui.properties.PropertyTreeViewer;

        dtSettings.setProcessorProperties(processorProperties);

        }
            .stream()
import org.jkiss.dbeaver.tools.transfer.stream.StreamProducerSettings;
            );
    private void saveOpenFSBrowserPreference() {
            dtSettings.setDataPipes(newPipes, false);
            TableItem item = filesTable.getItem(filesTable.getSelectionIndex());
                    "You cannot use files stored on this PC in scheduled tasks." +
    }
                        text.setData("saved", true);
                        ? DBFUtils.convertPathToString(stp.getInputFile())
        // Cut off extension
 * limitations under the License.
            UIUtils.createControlLabel(exporterSettings, DTMessages.data_transfer_wizard_settings_group_importer);
                }
                    manager.add(new SelectInputFileAction(true));
            }
            newPipes.remove(pipe);
            if (DBWorkbench.getPlatform().getApplication().isDistributed()) {
import org.jkiss.dbeaver.DBException;
        if (consumerSettings instanceof DatabaseConsumerSettings settings) {
                    inputFilesGroup,
            updateItemData(item, pipe);

    private PropertyTreeViewer propsEditor;
        super.deactivatePage();
                        if (inputFile != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            createFileSelectionToolBar(inputFilesTableGroup);
        );
                StreamTransferProducer producer = new StreamTransferProducer(entityMapping);
                        }

            UIMessages.text_with_open_dialog_browse,
import java.io.File;
                            // Avoid double-apply on Mac
                } catch (InterruptedException e) {
                        if (fileName.isBlank()) {
    private static final Log log = Log.getLog(StreamProducerPageSettings.class);
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override

                @Override
            if (pipe.getConsumer() != null && pipe.getConsumer().getDatabaseObject() instanceof DBSDataManipulator databaseObject) {
import java.util.List;
        }
        DataTransferSettings settings = getWizard().getSettings();
        final StreamProducerSettings producerSettings = getWizard().getPageSettings(this, StreamProducerSettings.class);
                    if (originalConsumer != null && originalConsumer.getTargetObjectContainer() instanceof DBSObjectContainer oc) {
import org.jkiss.dbeaver.Log;
            };
        }

    public void activatePage() {
            super(remote ? UIMessages.text_with_open_dialog_browse_remote : UIMessages.text_with_open_dialog_browse);


                            return;
        // Initialize property editor
    @Override
import org.jkiss.dbeaver.model.fs.DBFUtils;
                        }
                        dcs.setContainer(oc);
        reloadPipes();
            DataTransferPipe pipe = (DataTransferPipe) item.getData();
                toolbar,
                StreamProducerSettings.class
        DataTransferProcessorDescriptor processor = getProducerProcessor();
                    continue;
                                }
            updatePageCompletion();
        DBPPropertyDescriptor[] properties = processor == null ? new DBPPropertyDescriptor[0] : processor.getProperties();
            }
                    DBWorkbench.getPlatformUI().showError(


        }
    private DataTransferProcessorDescriptor getProducerProcessor() {

            DTUIMessages.pref_open_fs_browser_on_enter,
        if (!dataPipes.isEmpty()) {
            DatabaseMappingContainer mapping = new DatabaseMappingContainer(settings, newProducer.getDatabaseObject());
 *
            if (!isSkipTargetColumn()) {
                UIMessages.text_with_open_dialog_browse_remote,
                selectionIndex = dataPipes.size() - 1;
    private void updateBrowseButtons() {
import org.eclipse.swt.widgets.*;

                }
            this.remote = remote;

                            }
            item.setImage(1, null);
        return node == null || node.getObjectName() == null;
                        return;
        return true;
    @NotNull
            }
        propsEditor.loadProperties(propertySource);
                        : pipe.getProducer().getObjectName()
import org.eclipse.swt.layout.GridLayout;
            }
                            return;
        }
import org.eclipse.jface.action.Action;
                    // Copy mappings from old producer if columns are the same
                protected void saveEditorValue(Control control, int index, TableItem item) {
                final StreamEntityMapping entityMapping = pendingEntityMappings.remove();
                                DTUIMessages.stream_producer_column_mapping_error_title,
        final StreamTransferProducer newProducer = new StreamTransferProducer(new StreamEntityMapping(path));

import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
            }
        }
                            if (producerSettings != null) {
import org.jkiss.dbeaver.ui.controls.CustomTableEditor;
                    if (pipe.getProducer() instanceof StreamTransferProducer stp) {

        StringBuilder name = new StringBuilder();
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
            );
                if (isOpenFSBrowser()) {
                exporterSettings,
                            if (!Files.exists(path)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                () -> ShellUtils.launchProgram(HelpUtils.getHelpExternalReference(HELP_DATA_TRANSFER_LINK))
    @Override
            }
import org.eclipse.jface.dialogs.IMessageProvider;
        } else {
    public void deactivatePage() {
                        DataTransferPipe pipe = (DataTransferPipe) item.getData();
                    mapping.setTargetName(generateTableName(producer.getObjectName()));
        }

            Composite inputFilesGroup = UIUtils.createComposite(settingsDivider, 1);

import org.jkiss.dbeaver.utils.HelpUtils;
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferConsumer;
        UIUtils.createControlLabel(toolbar, DTMessages.data_transfer_wizard_settings_group_input_files);
        private final boolean remote;
            UIMessages.text_with_open_dialog_browse,
import org.jkiss.dbeaver.tools.transfer.database.DatabaseMappingContainer;
                        pipe.setProducer(producer);
    }
 *
            item.setImage(1, DBeaverIcons.getImage(getWizard().getSettings().getConsumer().getIcon()));
        } catch (InvocationTargetException e) {
 * You may obtain a copy of the License at
            .noneMatch(so -> so instanceof DBSDataManipulator);
            }
                            text.setText(DBFUtils.convertPathToString(inputFile));
        newFilesTable.setLinesVisible(true);
                        text.dispose();
        UIWidgets.setControlContextMenu(
        newFilesTable.setHeaderVisible(true);
                IDataTransferSettings consumerSettings = dtSettings.getNodeSettings(dtSettings.getConsumer());
                    }
                        if (pipe.getProducer() instanceof StreamTransferProducer producer) {
            showRemoteFS = project != null && DBFUtils.supportsMultiFileSystems(project);
                protected Control createEditor(Table table, int index, TableItem item) {
                manager.add(new SelectInputFileAction(false));
                ).setToolTipText("Scheduled tasks don't have access to files stored on this PC because they're executed on a remote server.");
            inputFilesTableGroup.setLayout(GridLayoutFactory.fillDefaults().spacing(0, 0).create());
                        }
                mapping.setTargetName(generateTableName(newProducer.getObjectName()));
                        StreamEntityMapping entityMapping = new StreamEntityMapping(path);
    private boolean isSkipTargetColumn() {
                DTUIMessages.stream_producer_page_input_files_hint,
                        try {
 * you may not use this file except in compliance with the License.
                                    "File '" + fileName + "' doesn't exist");
        );
                if (showRemoteFS) {
            filesTable.select(selectionIndex);
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.model.struct.DBSObject;
        boolean hasSelection = filesTable.getSelection().length > 0;
            reloadPipes();
        public SelectInputFileAction(boolean remote) {
            if (filesTable.getSelectionIndex() < 0) {
 * Licensed under the Apache License, Version 2.0 (the "License");

            if (initializer != null) {
    private PropertySourceCustom propertySource;
                                DBWorkbench.getPlatformUI().showError(
        IDataTransferSettings consumerSettings = getWizard().getSettings().getNodeSettings(getWizard().getSettings().getConsumer());
    @NotNull
    }
