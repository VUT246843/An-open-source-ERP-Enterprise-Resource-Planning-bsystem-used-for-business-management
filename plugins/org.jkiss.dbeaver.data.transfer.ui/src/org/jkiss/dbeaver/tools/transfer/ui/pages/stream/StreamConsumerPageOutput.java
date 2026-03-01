        }
            if (group.getEnabled()) {
            group.setEnabled(enabled);

                    updatePageCompletion();

                    DTMessages.data_transfer_blob_file_conflict_behavior_setting,
            composite,
                btn.setEnabled(enabled);
        }
        singleFileCheck.setEnabled(!clipboard && isAppendable && settings.getDataPipes().size() > 1 && settings.getMaxJobCount() <= 1);
            if (!currentValue.equals(newValue)) {
        boolean clipboard = !isBinary && clipboardCheck.getSelection();
        final StreamConsumerSettings settings = getWizard().getPageSettings(this, StreamConsumerSettings.class);
import org.jkiss.dbeaver.tools.transfer.DataTransferPipe;
    }
            if (settings.getDataFileConflictBehavior() == DataFileConflictBehavior.APPEND) {
import org.jkiss.dbeaver.registry.configurator.UIPropertyConfiguratorRegistry;

            return false;
    @Override
                updatePageCompletion();
            final EventProcessorComposite<?> configurator = processor.getValue();
            @NotNull Function<T, String> titleByValue,
                composite,
    private static final String HELP_DT_EXTERNAL_LINK = "Data-transfer-external-storage";
                maximumFileSizeText = new Text(outFilesSettings, SWT.BORDER);
        }
                GridData.FILL_HORIZONTAL
                        DataFileConflictBehavior.APPEND,

    private Button singleFileCheck;
        }
                btn.setSelection(false);
import org.jkiss.dbeaver.ui.UIUtils;
        );
        @NotNull
        }
        initializeDialogUnits(parent);
    }
            ));
                DTMessages.data_transfer_wizard_output_group_general,
            return true;
    public void deactivatePage() {
import org.eclipse.swt.events.SelectionAdapter;
                }
            Composite generalSettings = UIUtils.createTitledComposite(
                applyNewValue(value);
                    updateControlsEnablement();


            final UIPropertyConfiguratorRegistry configuratorRegistry = UIPropertyConfiguratorRegistry.getInstance();
        private void applyNewValue(T newValue) {
            setErrorMessage(DTMessages.data_transfer_wizard_output_error_empty_output_filename);
        splitFilesCheckbox.setEnabled(!clipboard);
        );
    public void activatePage() {
            {
        dataFileConflictBehaviorSelector.setValueEnabled(DataFileConflictBehavior.APPEND, isAppendable);
            if (container != null) {
    private Text timestampPattern;
import org.jkiss.dbeaver.registry.configurator.UIPropertyConfiguratorDescriptor;

    private Combo encodingCombo;
        }

import org.jkiss.dbeaver.tools.transfer.stream.StreamConsumerSettings.LobExtractType;
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferEventProcessorDescriptor;

            DTMessages.data_transfer_file_conflict_confirm_override_title, 
            @NotNull Composite parent,
                    public void widgetSelected(SelectionEvent e) {
            }
 * You may obtain a copy of the License at
                    fileConflictBehaviorSettings,
                Composite fileConflictBehaviorSettings = UIUtils.createComposite(expander, 2);
                } catch (Exception e) {
            UIUtils.setContentProposalToolTip(directoryText, DTUIMessages.stream_consumer_page_output_tooltip_output_directory_pattern, variables);
                onValueSelected.accept(newValue);
            // No resolver - several producers may present.
        compressCheckbox.setSelection(settings.isCompressResults());
            DTMessages.data_transfer_wizard_output_export_to_external_storage_link,
                        updateFileConflictExpanderTitle(expander, settings);
            this.defaultValue = defaultValue;
        }
            @NotNull Consumer<T> onValueSelected,
    private String[] getAvailableVariables() {
            compressCheckbox.addSelectionListener(new SelectionAdapter() {
                settings.setOutputFolder(directoryText.getText());
                    v -> {

                    final IDataTransferEventProcessorConfigurator<StreamConsumerSettings> configurator = configuratorDescriptor.createConfigurator();
        }
    }
        }
                        } else {
            
        updatePageCompletion();
            }
        
            {
                }
            String text = DTMessages.data_transfer_file_conflict_behavior_setting + ": " + settings.getDataFileConflictBehavior().title +
            @NotNull String header,
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;

    }
            ContentAssistUtils.installContentProposal(fileNameText, new SmartTextContentAdapter(), proposalProvider);
                        DataFileConflictBehavior.ASK,
            processor.setProcessorAvailable(processor.isProcessorApplicable());
                encodingCombo = UIUtils.createEncodingCombo(generalSettings, settings.getOutputEncoding());
    private Button compressCheckbox;
        {
                final ExpandableComposite expander = new ExpandableComposite(generalSettings, SWT.NONE);
        ) {
/*
        
            }
        getWizard().loadNodeSettings();
            } else {
import java.util.stream.Collectors;
                gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
import org.jkiss.dbeaver.ui.contentassist.SmartTextContentAdapter;
    @Override
        encodingCombo.setEnabled(!isBinary && !clipboard);
    @Override
        }
            @NotNull List<T> values,
            }
import org.jkiss.dbeaver.tools.transfer.ui.IDataTransferEventProcessorConfigurator;
 *
                    public void expansionStateChanged(ExpansionEvent e) {
            for (Button btn : radioButtonByValue.values()) {
                blobFileConflictBehaviorSelector = new EnumSelectionGroup<>(

                if (triggered.getSelection()) {
import org.eclipse.ui.forms.events.ExpansionAdapter;
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
            @NotNull Function<T, Boolean> valueSelectionConfirmation
}
        
import java.nio.charset.Charset;
            

            });
                generalSettings,
            return currentValue;
                    UIUtils.showPreferencesFor(getShell(), null, PrefPageDataTransfer.PAGE_ID);
                    updateControlsEnablement();
        final List<DataTransferPipe> pipes = getWizard().getSettings().getDataPipes();
        }
                .stream(variables)
    }
        {
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferRegistry;

                        updateFileConflictExpanderTitle(expander, settings);
    private void updateFileConflictExpanderTitle(ExpandableComposite expander, StreamConsumerSettings settings) {
        private final Consumer<T> onValueSelected;
            );

import org.jkiss.utils.CommonUtils;
    private EnumSelectionGroup<DataFileConflictBehavior> dataFileConflictBehaviorSelector;
 *
            }
        fileNameText.setText(CommonUtils.toString(settings.getOutputFilePattern()));
import org.jkiss.dbeaver.ui.controls.VariablesHintLabel;
                2,
                    },
            return defaultValue;
                dataFileConflictBehaviorSelector = new EnumSelectionGroup<>(
                        settings.setSplitOutFiles(splitFilesCheckbox.getSelection());
import org.eclipse.swt.SWT;
            Charset.forName(settings.getOutputEncoding());
            fileNameText.setLayoutData(gd);
import org.eclipse.osgi.util.NLS;
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferProcessorDescriptor;
package org.jkiss.dbeaver.tools.transfer.ui.pages.stream;
        private final Composite group;
            if (group.getEnabled() && !valueBtn.getEnabled()) {
            group = UIUtils.createTitledComposite(parent, header, 1, GridData.VERTICAL_ALIGN_BEGINNING);
                expander.addExpansionListener(new ExpansionAdapter() {
        encodingCombo.setText(CommonUtils.toString(settings.getOutputEncoding()));
                            applyNewValue(newValue);
                DTUIMessages.stream_consumer_page_output_variables_hint_label,
            .collect(Collectors.toCollection(LinkedHashSet::new));
                    @Override
        clipboardCheck.setSelection(settings.isOutputClipboard() && !descriptor.isBinaryFormat());
        }
         
        final StreamConsumerSettings settings = getWizard().getPageSettings(this, StreamConsumerSettings.class);
                    @Override
            ((GridData) directoryText.getParent().getLayoutData()).horizontalSpan = 3;
                public void widgetSelected(SelectionEvent e) {
            .map(x -> x[0])
public class StreamConsumerPageOutput extends DataTransferPageNodeSettings {
        if (expander.isExpanded()) {
    private Button encodingBOMCheckbox;
        if (!getWizard().getSettings().getProcessor().isAppendable() || settings.isCompressResults()) {
        }
import org.jkiss.dbeaver.ui.contentassist.ContentAssistUtils;
import org.jkiss.dbeaver.ui.ShellUtils;

                public void widgetSelected(SelectionEvent e) {
            UIUtils.createLink(generalSettings, DTMessages.data_transfer_wizard_output_label_global_settings, new SelectionAdapter() {
            singleFileCheck.addSelectionListener(new SelectionAdapter() {
    private Text directoryText;
            this.onValueSelected = onValueSelected;
                expander.setLayoutData(new GridData(GridData.FILL, GridData.BEGINNING, false, false, 5, 1));
import java.util.function.Consumer;
            SelectionListener selectionListener = SelectionListener.widgetSelectedAdapter(e -> {
 * you may not use this file except in compliance with the License.

                });
import org.eclipse.swt.widgets.*;
            final DBSObject object = pipes.getFirst().getProducer().getDatabaseObject();
        );
                        updateControlsEnablement();
            });
                    v -> v.title,

                        if (valueSelectionConfirmation.apply(newValue)) {
        }
    private Label maximumFileSizeLabel;

import org.jkiss.dbeaver.tools.transfer.stream.StreamTransferConsumer;
                    List.of(BlobFileConflictBehavior.ASK, BlobFileConflictBehavior.PATCHNAME, BlobFileConflictBehavior.OVERWRITE),
        for (Map.Entry<String, EventProcessorComposite<?>> processor : processors.entrySet()) {
            final SQLQueryContainer container = DBUtils.getAdapter(SQLQueryContainer.class, object);
                radioButtonByValue.get(value).setEnabled(enabled);
        }
    public void createControl(Composite parent) {
    

            setErrorMessage(DTMessages.data_transfer_wizard_output_error_invalid_charset);
        timestampPattern.setEnabled(!clipboard);
import org.eclipse.swt.layout.GridData;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
                    log.error("Can't create event processor", e);
        public void setValue(@NotNull T value) {
                encodingBOMCheckbox = UIUtils.createCheckbox(generalSettings, DTMessages.data_transfer_wizard_output_label_insert_bom, DTMessages.data_transfer_wizard_output_label_insert_bom_tooltip, false, 1);
                    },
import org.jkiss.dbeaver.tools.transfer.stream.StreamConsumerSettings.BlobFileConflictBehavior;
            fileNameText = new Text(generalSettings, SWT.BORDER);
    private void updateControlsEnablement() {
            SelectionListener.widgetSelectedAdapter(
import org.jkiss.dbeaver.tools.transfer.stream.StreamConsumerSettings.DataFileConflictBehavior;
import org.jkiss.dbeaver.model.struct.DBSObject;
        for (Map.Entry<String, EventProcessorComposite<?>> processor : processors.entrySet()) {

        fileNameText.setEnabled(!clipboard);
                }
    

    }

        } catch (Exception e) {
        clipboardCheck.setEnabled(!isBinary);

                updatePageCompletion();
import org.eclipse.swt.events.SelectionListener;
import org.jkiss.dbeaver.tools.transfer.DataTransferSettings;
        return DBWorkbench.getPlatformUI().confirmAction(
                }
                @Override
        encodingBOMCheckbox.setEnabled(!isBinary && !clipboard);
                true
        setControl(composite);
                        settings.setDataFileConflictBehavior(v);

            {
                applyNewValue(defaultValue);
                    fileConflictBehaviorSettings,
                maximumFileSizeText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.ENGLISH));
                Composite outFilesSettings = UIUtils.createComposite(generalSettings, 3);
        public T getValue() {
            processor.getValue().loadSettings(settings.getEventProcessorSettings(processor.getKey()));
            
                    settings.setCompressResults(compressCheckbox.getSelection());
            );
        public T getDefaultValue() {
                v -> v,
            }
        UIUtils.createLink(
        
        final DataTransferProcessorDescriptor descriptor = getWizard().getSettings().getProcessor();
                public void widgetSelected(SelectionEvent e) {
        }
            UIUtils.createControlLabel(generalSettings, DTMessages.data_transfer_wizard_output_label_file_name_pattern);

import org.eclipse.swt.events.SelectionEvent;
    private boolean confirmPossibleFileOverwrite() {


            for (Button btn : radioButtonByValue.values()) {
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
                }
        private T currentValue;
                valueBtn.setSelection(true);
                    updatePageCompletion();
import org.jkiss.code.NotNull;
            gd.horizontalSpan = 4;
            final DataTransferRegistry dataTransferRegistry = DataTransferRegistry.getInstance();
import org.jkiss.dbeaver.model.DBUtils;
                composite,
                
import org.jkiss.dbeaver.tools.transfer.ui.prefs.PrefPageDataTransfer;
                });
                setErrorMessage(NLS.bind(DTMessages.data_transfer_wizard_output_event_processor_error_incomplete_configuration, processor.getDescriptor().getLabel()));
    protected boolean determinePageCompletion() {

        }

            });
                @Override
            }
                @Override

                });
            });
                    @Override
                    settings.setOutputEncoding(encodingCombo.getText());
        super(DTMessages.data_transfer_wizard_output_name);
                    T newValue = (T) e.widget.getData();
                encodingBOMCheckbox.addSelectionListener(new SelectionAdapter() {
            final String[] variables = getAvailableVariables();
            singleFileCheck = UIUtils.createCheckbox(generalSettings, DTMessages.data_transfer_wizard_output_label_use_single_file, DTMessages.data_transfer_wizard_output_label_use_single_file_tip, false, 5);
 * DBeaver - Universal Database Manager
        return true;
                        }
        setDescription(DTMessages.data_transfer_wizard_output_description);
        dataFileConflictBehaviorSelector.setValue(settings.getDataFileConflictBehavior());
        }

        updateControlsEnablement();
        return variables.toArray(new String[0]);
        final StreamConsumerSettings settings = getWizard().getPageSettings(this, StreamConsumerSettings.class);

        }
                    List.of(
                            setValue(currentValue);
            }
        }
                    ),
                    }
 * distributed under the License is distributed on an "AS IS" BASIS,
            UIUtils.setContentProposalToolTip(fileNameText, DTUIMessages.stream_consumer_page_output_tooltip_output_file_name_pattern, variables);
        showFinalMessageCheckbox.setSelection(getWizard().getSettings().isShowFinalMessage());
            fileNameText.addModifyListener(e -> {
                    if (!currentValue.equals(newValue)) {
    private static class EnumSelectionGroup<T extends Enum<T>> {
        try {
                    v -> v != BlobFileConflictBehavior.OVERWRITE || confirmPossibleFileOverwrite()
        public EnumSelectionGroup(
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
                @Override
 * Copyright (C) 2010-2026 DBeaver Corp and others
            showFinalMessageCheckbox.addSelectionListener(new SelectionAdapter() {
            );

        setPageComplete(false);
        splitFilesCheckbox.setSelection(settings.isSplitOutFiles());
                return false;
                    settings.setUseSingleFile(singleFileCheck.getSelection());
                .map(GeneralUtils::variablePattern)
        blobFileConflictBehaviorSelector.setValue(settings.getBlobFileConflictBehavior());
import org.jkiss.dbeaver.utils.HelpUtils;
    private Button splitFilesCheckbox;
import java.util.function.Function;
                DTUIMessages.stream_consumer_page_output_label_results,
        
            if (configurator.isProcessorEnabled() && configurator.isProcessorApplicable() && configurator.isProcessorComplete()) {
                settings.setOutputFilePattern(fileNameText.getText());
                radioButtonByValue.get(defaultValue).setEnabled(true);
    public boolean isPageApplicable() {
            dataFileConflictBehaviorSelector.setValue(DataFileConflictBehavior.PATCHNAME);
                public void widgetSelected(SelectionEvent e) {
        if (compressCheckbox.getSelection() && dataFileConflictBehaviorSelector.getValue().equals(DataFileConflictBehavior.APPEND)) {
            return false;
        }
    }
                public void widgetSelected(SelectionEvent e) {
            true
            clipboardCheck.addSelectionListener(new SelectionAdapter() {
    }
    @Override
                    }
    private Button clipboardCheck;
                    v -> {
            ContentAssistUtils.installContentProposal(directoryText, new SmartTextContentAdapter(), proposalProvider);
                    settings.setOutputClipboard(clipboardCheck.getSelection());
        for (EventProcessorComposite<?> processor : processors.values()) {
            gd.widthHint = 200;
    @Override
 * limitations under the License.
            if (processor.isProcessorApplicable() && processor.isProcessorEnabled() && !processor.isProcessorComplete()) {
                UIUtils.createControlLabel(generalSettings, DTMessages.data_transfer_wizard_output_label_encoding);
            expander.setText(text);
        setTitle(DTMessages.data_transfer_wizard_output_title);
        maximumFileSizeText.setEnabled(!clipboard && splitFilesCheckbox.getSelection());
import org.jkiss.dbeaver.tools.transfer.ui.controls.EventProcessorComposite;
                currentValue = newValue;
 *     http://www.apache.org/licenses/LICENSE-2.0
                        DataFileConflictBehavior.PATCHNAME,
                    v -> v.title,
                maximumFileSizeText.setLayoutData(gd);
                );
                try {
        final Set<String> variables = Arrays.stream(StreamTransferConsumer.VARIABLES)
 */

            setErrorMessage(DTMessages.data_transfer_wizard_output_error_empty_output_directory);
                maximumFileSizeText.addModifyListener(e ->
        } else {
                encodingCombo.addModifyListener(e -> {
                StreamTransferConsumer.VARIABLES,
 * Unless required by applicable law or agreed to in writing, software
                });
            Composite resultsSettings = UIUtils.createTitledComposite(
            radioButtonByValue = values.stream().collect(Collectors.toMap(
    public StreamConsumerPageOutput() {
                    getWizard().getSettings().setShowFinalMessage(showFinalMessageCheckbox.getSelection());
                        settings.setOutputEncodingBOM(encodingBOMCheckbox.getSelection());
            }
            }
            // Output path/pattern
    
        maximumFileSizeLabel.setEnabled(!clipboard && splitFilesCheckbox.getSelection());
        }
        private final T defaultValue;
                    this.processors.put(descriptor.getId(), new EventProcessorComposite<>(this::updatePageCompletion, resultsSettings, settings, descriptor, configurator));
                    final UIPropertyConfiguratorDescriptor configuratorDescriptor = configuratorRegistry.getDescriptor(descriptor.getType().getImplName());
    }
                "; " + DTMessages.data_transfer_blob_file_conflict_behavior_setting + ": " + settings.getBlobFileConflictBehavior().title;
                    DataFileConflictBehavior.ASK,
                expander.setClient(fileConflictBehaviorSettings);
                        UIUtils.resizeShell(parent.getShell());
import org.jkiss.dbeaver.utils.GeneralUtils;
                        settings.setBlobFileConflictBehavior(v);
            clipboardCheck = UIUtils.createCheckbox(generalSettings, DTMessages.data_transfer_wizard_output_label_copy_to_clipboard, null, false, 5);
                updateFileConflictExpanderTitle(expander, settings);
                    settings.setMaxOutFileSize(CommonUtils.toLong(maximumFileSizeText.getText())));
    private static final Log log = Log.getLog(StreamConsumerPageOutput.class);
        private final Map<T, Button> radioButtonByValue;

        }
                splitFilesCheckbox = UIUtils.createCheckbox(outFilesSettings, DTMessages.data_transfer_wizard_output_checkbox_split_files, DTMessages.data_transfer_wizard_output_checkbox_split_files_tip, false, 1);
            });
        for (EventProcessorComposite<?> processor : processors.values()) {
                e -> ShellUtils.launchProgram(HelpUtils.getHelpExternalReference(HELP_DT_EXTERNAL_LINK)))
        encodingBOMCheckbox.setSelection(settings.isOutputEncodingBOM() && !descriptor.isBinaryFormat());
        directoryText.setText(CommonUtils.toString(settings.getOutputFolder()));
import org.jkiss.dbeaver.tools.transfer.ui.pages.DataTransferPageNodeSettings;

                //encodingCombo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING, GridData.VERTICAL_ALIGN_BEGINNING, true, false, 1, 1));
    @NotNull
        if (settings.isOutputClipboard()) {
                }
                dataFileConflictBehaviorSelector.setValue(dataFileConflictBehaviorSelector.getDefaultValue());
        blobFileConflictBehaviorSelector.setEnabled(
                maximumFileSizeLabel = UIUtils.createControlLabel(outFilesSettings, DTUIMessages.stream_consumer_page_output_label_maximum_file_size);
            return false;
import java.util.List;
import org.jkiss.dbeaver.Log;
    private final Map<String, EventProcessorComposite<?>> processors = new HashMap<>();
        maximumFileSizeText.setText(String.valueOf(settings.getMaxOutFileSize()));
                @Override

                5,
        boolean isBinary = settings.getProcessor().isBinaryFormat();
            
                    updateControlsEnablement();
        if (CommonUtils.isEmpty(settings.getOutputFilePattern())) {

        timestampPattern.setText(settings.getOutputTimestampPattern());
        if (pipes.size() == 1) {
                    v -> v != DataFileConflictBehavior.OVERWRITE || confirmPossibleFileOverwrite()
        if (settings == null) {
        }
import org.jkiss.dbeaver.ui.contentassist.StringContentProposalProvider;
        {
        
        Composite composite = UIUtils.createComposite(parent, 1);
            DTMessages.data_transfer_file_conflict_confirm_override_message,
    private Button showFinalMessageCheckbox;
            expander.setText(DTMessages.data_transfer_file_name_conflict_behavior_setting_text);
            @NotNull T defaultValue,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        boolean isAppendable = settings.getProcessor().isAppendable() && !compressCheckbox.getSelection();
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    BlobFileConflictBehavior.ASK,
    }
        directoryText.setEnabled(!clipboard);
        public void setValueEnabled(T value, boolean enabled) {
        if (CommonUtils.isEmpty(settings.getOutputFolder())) {
            processor.getValue().setProcessorEnabled(settings.hasEventProcessor(processor.getKey()));
 * See the License for the specific language governing permissions and
                    settings.setOutputTimestampPattern(timestampPattern.getText()));
            });
            final StringContentProposalProvider proposalProvider = new StringContentProposalProvider(Arrays
                }
                    }
            return false;
 *
        final StreamConsumerSettings settings = getWizard().getPageSettings(this, StreamConsumerSettings.class);
            });
                        DataFileConflictBehavior.OVERWRITE
            showFinalMessageCheckbox = UIUtils.createCheckbox(resultsSettings, DTUIMessages.stream_consumer_page_output_label_show_finish_message, getWizard().getSettings().isShowFinalMessage());
                variables.addAll(container.getQueryParameters().keySet());
        final DataTransferSettings settings = getWizard().getSettings();
    private Text fileNameText;
            compressCheckbox = UIUtils.createCheckbox(generalSettings, DTMessages.data_transfer_wizard_output_checkbox_compress, null, false, 1);
                Button triggered = (Button) e.widget;
    private Text maximumFileSizeText;

                configurator.saveSettings(settings.getEventProcessorSettings(processor.getKey()));

                timestampPattern.addModifyListener(e ->
                GridData.FILL_HORIZONTAL
                .toArray(String[]::new));
                splitFilesCheckbox.addSelectionListener(new SelectionAdapter() {
                    }
    private EnumSelectionGroup<BlobFileConflictBehavior> blobFileConflictBehaviorSelector;

                    public void widgetSelected(SelectionEvent e) {

        public void setEnabled(boolean enabled) {

            }
import org.jkiss.dbeaver.tools.transfer.stream.StreamConsumerSettings;
import java.util.*;
            Button valueBtn = radioButtonByValue.get(value);
import org.eclipse.ui.forms.events.ExpansionEvent;

        dataFileConflictBehaviorSelector.setEnabled(!clipboard);
        if (descriptor.isBinaryFormat()) {
                timestampPattern = UIUtils.createLabelText(generalSettings, DTMessages.data_transfer_wizard_output_label_timestamp_pattern, GeneralUtils.DEFAULT_TIMESTAMP_PATTERN, SWT.BORDER);
        return isConsumerOfType(StreamTransferConsumer.class);
        compressCheckbox.setEnabled(!clipboard && !singleFileCheck.getSelection());
            directoryText = DialogUtils.createOutputFolderChooser(generalSettings, null, getWizard().getProject(), true, e -> {
import org.jkiss.dbeaver.model.sql.SQLQueryContainer;
            new VariablesHintLabel(
            this.currentValue = defaultValue;
                        updateFileConflictExpanderTitle(expander, settings);
                gd.widthHint = UIUtils.getFontHeight(maximumFileSizeText) * 10;
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
        singleFileCheck.setSelection(settings.isUseSingleFile() && descriptor.isAppendable());
                    DTMessages.data_transfer_file_conflict_behavior_setting,
            for (DataTransferEventProcessorDescriptor descriptor : dataTransferRegistry.getEventProcessors(StreamTransferConsumer.NODE_ID)) {
            settings.setOutputClipboard(false);

            });
                outFilesSettings.setLayoutData(new GridData(GridData.BEGINNING, GridData.BEGINNING, true, false, 5, 1));

                DTUIMessages.stream_consumer_page_output_variables_hint_label,
                );
            !clipboard && getWizard().getPageSettings(this, StreamConsumerSettings.class).getLobExtractType() == LobExtractType.FILES
                v -> UIUtils.createRadioButton(group, titleByValue.apply(v), v, selectionListener)
    }
