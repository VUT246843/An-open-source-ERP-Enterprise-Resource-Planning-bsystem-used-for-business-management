    public void setLobExtractType(LobExtractType lobExtractType) {
        this.dataFileConflictBehavior = dataFileConflictBehavior;
        } else {
        this.compressResults = compressResults;
        outputFilePattern = CommonUtils.toString(settings.get("outputFilePattern"), outputFilePattern);
        public DataFileConflictBehavior dataFileConflictBehavior;
                                    addDataMapping(mappingContainer);
    private boolean splitOutFiles = false;

            final Map<String, Object> config = new HashMap<>();
    }
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
        return eventProcessors.computeIfAbsent(id, x -> new HashMap<>());


        public Integer blobFileConflictPreviousChoice = null;

 * See the License for the specific language governing permissions and
        settings.put("compressResults", compressResults);
    @Override
    public boolean isOutputClipboard() {
            eventProcessors.put(ExecuteCommandEventProcessor.ID, config);
        }
}
        blobFileConflictBehavior = CommonUtils.valueOf(
 * You may obtain a copy of the License at
        this.useSingleFile = useSingleFile;
            && dataTransferSettings.getDataPipes().size() > 1
        return useSingleFile;
        PATCHNAME(DTMessages.data_transfer_file_conflict_fix_name),
            BlobFileConflictBehavior.class,
    public static final String PROP_EXTRACT_IMAGES = "extractImages";
import java.util.List;
        settings.put("outputEncoding", outputEncoding);
        return blobFileConflictBehavior;
        settings.put(SETTING_VALUE_FORMAT, valueFormat.name());
        PATCHNAME(DTMessages.data_transfer_file_conflict_fix_name),
        DTUtils.addSummary(summary, DTMessages.data_transfer_wizard_settings_label_encoding, lobEncoding);
        }

import org.jkiss.dbeaver.tools.transfer.registry.DataTransferEventProcessorDescriptor;

        return splitOutFiles;
    public void setCompressResults(boolean compressResults) {
        INLINE
    private final Map<String, Map<String, Object>> eventProcessors = new HashMap<>();

import org.jkiss.dbeaver.tools.transfer.processor.FailedExportFileCleanerProcessor;
        settings.put(DATA_FILE_CONFLICT_BEHAVIOR, dataFileConflictBehavior.name());
                            final DBSObject object = producer.getDatabaseObject();
        settings.put("lobEncoding", lobEncoding.name());
 *
            settings.put("mappings", mappings);
            DTUtils.addSummary(summary, DTMessages.data_transfer_file_conflict_behavior_setting, dataFileConflictBehavior.title);
    }
        return lobEncoding;
import org.jkiss.code.NotNull;
    private DataFileConflictBehavior dataFileConflictBehavior = DataFileConflictBehavior.ASK;
        final Map<String, Object> processors = JSONUtils.getObject(settings, "eventProcessors");
        if (!CommonUtils.isEmpty(formatterProfile)) {
        this.formatterProfile = formatterProfile;
    public void setOutputFolder(String outputFolder) {
        } else {
    }
    public void setOutputEncodingBOM(boolean outputEncodingBOM) {
            eventProcessors.put(ShowInExplorerEventProcessor.ID, new HashMap<>());
    }
                                if (containerSettings != null) {
    private boolean outputEncodingBOM = false;
    }
            }
/**
    public long getMaxOutFileSize() {
    @NotNull


    private final Map<DBSDataContainer, StreamMappingContainer> dataMappings = new LinkedHashMap<>();
        if (!eventProcessors.isEmpty()) {
            if (!this.dontDropBlobFileConflictBehavior) {
        this.lobEncoding = lobEncoding;

import org.jkiss.dbeaver.model.data.DBDDataFormatterProfile;
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
        HEX,
        valueFormat = DBDDisplayFormat.safeValueOf(CommonUtils.toString(settings.get(SETTING_VALUE_FORMAT)));
        final boolean executeProcessOnFinish = CommonUtils.getBoolean(settings.get("executeProcessOnFinish"), false);

    private String outputFilePattern = GeneralUtils.variablePattern(StreamTransferConsumer.VARIABLE_TABLE) + "_" + GeneralUtils.variablePattern(StreamTransferConsumer.VARIABLE_TIMESTAMP);
import org.jkiss.dbeaver.model.DBUtils;
        settings.put("outputFilePattern", outputFilePattern);
        public String outputFileNameToReuse = null;

                                    final StreamMappingContainer mappingContainer = new StreamMappingContainer(container);
         * Initialize non-persistent parameters for data transfer execution which is shared between consumers of the task
    }
        
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
    }
    private long maxOutFileSize = 10 * 1000 * 1000;
    private String outputFolder = System.getProperty(StandardConstants.ENV_USER_HOME);
    public void setUseSingleFile(boolean useSingleFile) {
        return eventProcessors.containsKey(id);
    @Override
        this.blobFileConflictBehavior = blobFileConflictBehavior;
    public void setValueFormat(@NotNull DBDDisplayFormat valueFormat) {
    }
        }
            DataFileConflictBehavior.PATCHNAME
import org.jkiss.dbeaver.tools.transfer.processor.ShowInExplorerEventProcessor;
    public Map<String, Object> getEventProcessorSettings(@NotNull String id) {
    private static final Log log = Log.getLog(StreamConsumerSettings.class);
                                    mappingContainer.loadSettings(monitor, containerSettings);
        DTUtils.addSummary(summary, DTMessages.data_transfer_wizard_output_checkbox_compress, compressResults);

                );
    public String getSettingsSummary() {
            CommonUtils.toString(settings.get(BLOB_FILE_CONFLICT_BEHAVIOR)),

        this.valueFormat = valueFormat;
    }
        final boolean deleteFileInCaseOfFail = CommonUtils.getBoolean(settings.get("deleteFileInCaseOfFail"), true);
        }
        return dataMappings.get(container);
        return eventProcessors;
import org.jkiss.code.Nullable;
    public String getOutputTimestampPattern() {
    }
    public StreamMappingContainer getDataMapping(@NotNull DBSDataContainer container) {
        
    public void addDataMapping(@NotNull StreamMappingContainer container) {
    @NotNull
        }
        settings.put("lobExtractType", lobExtractType.name());
 * DBeaver - Universal Database Manager
                        }

    public static final String PROP_FILE_EXTENSION = "extension";
        return compressResults;
    }
        outputFolder = CommonUtils.toString(settings.get("outputFolder"), outputFolder);
    }
                                final Map<String, Object> containerSettings = JSONUtils.getObjectOrNull(mappings, DBUtils.getObjectFullId(container));
    
                        final IDataTransferProducer<?> producer = pipe.getProducer();

        return dataFileConflictBehavior;
    @NotNull
        }
        public BlobFileConflictBehavior blobFileConflictBehavior;
public class StreamConsumerSettings implements IDataTransferConsumerSettings {
 */
        outputClipboard = CommonUtils.getBoolean(settings.get("outputClipboard"), outputClipboard);

 * distributed under the License is distributed on an "AS IS" BASIS,
    private String outputEncoding = GeneralUtils.getDefaultFileEncoding();
    public void addEventProcessor(@NotNull DataTransferEventProcessorDescriptor descriptor) {

    @Override
            DTUtils.addSummary(summary, DTMessages.data_transfer_wizard_output_label_insert_bom, outputEncodingBOM);
    private DBDDisplayFormat valueFormat = DBDDisplayFormat.UI;
        DTUtils.addSummary(summary, DTMessages.data_transfer_wizard_settings_label_binaries, lobExtractType);
        
                container.saveSettings(containerSettings);
    }
    private boolean compressResults = false;
            DTUtils.addSummary(summary, DTMessages.data_transfer_blob_file_conflict_behavior_setting, blobFileConflictBehavior.title);
    public void setOutputClipboard(boolean outputClipboard) {
        settings.put("outputTimestampPattern", outputTimestampPattern);
import org.jkiss.utils.StandardConstants;
    }
    public String getOutputFilePattern() {
    }
            DTUtils.addSummary(summary, DTMessages.data_transfer_wizard_output_label_directory, outputFolder);


        }
    public LobEncoding getLobEncoding() {
                    for (DataTransferPipe pipe : pipes) {
        if (formatterProfile != null) {
    @Nullable

    private static final String BLOB_FILE_CONFLICT_BEHAVIOR = "blobFileConflictBehavior"; //$NON-NLS-1$
    public String getOutputEncoding() {
import org.jkiss.dbeaver.tools.transfer.processor.ExecuteCommandEventProcessor;
    }

    }
            this.formatterProfile = DBWorkbench.getPlatform().getDataFormatterRegistry().getCustomProfile(formatterProfile);

    
        public void initForConsumer() {
        return outputClipboard;
import org.jkiss.dbeaver.runtime.DBWorkbench;
    public void saveSettings(Map<String, Object> settings) {

import org.jkiss.dbeaver.model.struct.DBSObject;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        return dataMappings;
                            }
                            if (object instanceof DBSDataContainer) {

    @Override
    public String getOutputFolder() {
        public final String title; 
            this.title = title;
        }
        return lobExtractType;
    }
        FILES,
        if (deleteFileInCaseOfFail && !eventProcessors.containsKey(FailedExportFileCleanerProcessor.ID)) {

            CommonUtils.toString(settings.get(DATA_FILE_CONFLICT_BEHAVIOR)),
            config.put(ExecuteCommandEventProcessor.PROP_COMMAND, finishProcessCommand);
    public void setOutputFilePattern(String outputFilePattern) {
                log.debug("Canceled by user", e);

        SKIP,
/*
        public final String title; 
    }
    public void setOutputEncoding(String outputEncoding) {
    }
        this.splitOutFiles = splitOutFiles;
        // settings.put("appendToFile", appendToFileEnd);
        settings.put("maxOutFileSize", maxOutFileSize);
                    DTMessages.stream_transfer_consumer_message_cannot_load_configuration,
    public void loadSettings(DBRRunnableContext runnableContext, DataTransferSettings dataTransferSettings, Map<String, Object> settings) {
    @NotNull
import java.lang.reflect.InvocationTargetException;
    public class ConsumerRuntimeParameters {
    }
        ASK(DTMessages.data_transfer_file_conflict_ask),
    private boolean outputClipboard = false;
    }


        OVERWRITE(DTMessages.data_transfer_file_conflict_override);
        if (formatterProfile != null) {
         */


    }
    
                this.blobFileConflictBehavior = StreamConsumerSettings.this.blobFileConflictBehavior;



        settings.put("splitOutFiles", splitOutFiles);
        


        return summary.toString();
        }
    }

    public void setMaxOutFileSize(long maxOutFileSize) {
            }
        if (openFolderOnFinish && !eventProcessors.containsKey(ShowInExplorerEventProcessor.ID)) {
    }

        outputTimestampPattern = CommonUtils.toString(settings.get("outputTimestampPattern"), outputTimestampPattern);
                                }
        }
import java.util.LinkedHashMap;
        return outputFolder;
                    }
    public boolean hasEventProcessor(@NotNull String id) {


            DTUtils.addSummary(summary, DTMessages.data_transfer_wizard_output_label_file_name_pattern, outputFilePattern);

    public DBDDataFormatterProfile getFormatterProfile() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            eventProcessors.put(processor, JSONUtils.getObject(processors, processor));
                        if (producer != null) {
        this.outputClipboard = outputClipboard;
        }
        if (executeProcessOnFinish && !eventProcessors.containsKey(ExecuteCommandEventProcessor.ID)) {
            } catch (InterruptedException e) {
    }

        return formatterProfile;
 */
    public boolean isCompressResults() {
    public enum DataFileConflictBehavior {
                mappings.put(DBUtils.getObjectFullId(container.getSource()), containerSettings);

        /**
        eventProcessors.putIfAbsent(descriptor.getId(), new HashMap<>());
        }
                                final DBSDataContainer container = (DBSDataContainer) object;
            BlobFileConflictBehavior.PATCHNAME
            DTUtils.addSummary(summary, DTMessages.data_transfer_wizard_settings_label_formatting, formatterProfile.getProfileName());

        outputEncoding = CommonUtils.toString(settings.get("outputEncoding"), outputEncoding);
        OVERWRITE(DTMessages.data_transfer_file_conflict_override);
        return new ConsumerRuntimeParameters();
                final Map<String, Object> containerSettings = new LinkedHashMap<>();
    private LobExtractType lobExtractType = LobExtractType.INLINE;
    public boolean isOutputEncodingBOM() {
    }
    @Override
    public LobExtractType getLobExtractType() {
            final Map<String, Object> mappings = new LinkedHashMap<>();
    public enum LobEncoding {
            DataFileConflictBehavior.class,
            settings.put("eventProcessors", eventProcessors);
        dataMappings.put(container.getSource(), container);

        maxOutFileSize = CommonUtils.toLong(settings.get("maxOutFileSize"), maxOutFileSize);

            DTUtils.addSummary(summary, DTMessages.data_transfer_wizard_output_label_encoding, outputEncoding);
            try {
package org.jkiss.dbeaver.tools.transfer.stream;
            settings.put("formatterProfile", "");
        outputEncodingBOM = CommonUtils.getBoolean(settings.get("outputEncodingBOM"), outputEncodingBOM);
        lobExtractType = CommonUtils.valueOf(LobExtractType.class, CommonUtils.toString(settings.get("lobExtractType")), LobExtractType.INLINE);
    public ConsumerRuntimeParameters prepareRuntimeParameters() {


    }
        settings.put("useSingleFile", useSingleFile);
import org.jkiss.utils.CommonUtils;
            config.put(ExecuteCommandEventProcessor.PROP_WORKING_DIRECTORY, null);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }

    }


        return outputTimestampPattern;
        splitOutFiles = CommonUtils.getBoolean(settings.get("splitOutFiles"), splitOutFiles);
        settings.put(BLOB_FILE_CONFLICT_BEHAVIOR, blobFileConflictBehavior.name());
        settings.put("outputFolder", outputFolder);
    @NotNull
    public Map<DBSDataContainer, StreamMappingContainer> getDataMappings() {

        );

        for (String processor : processors.keySet()) {
    public boolean isUseSingleFile() {
        String formatterProfile = CommonUtils.toString(settings.get("formatterProfile"));
            settings.put("formatterProfile", formatterProfile.getProfileName());
    
        APPEND(DTMessages.data_transfer_file_conflict_append),


                    final List<DataTransferPipe> pipes = dataTransferSettings.getDataPipes();
            DTUtils.addSummary(summary, DTMessages.data_transfer_wizard_output_label_copy_to_clipboard, outputClipboard);
        dataFileConflictBehavior = CommonUtils.valueOf(
    private static final String DATA_FILE_CONFLICT_BEHAVIOR = "dataFileConflictBehavior"; //$NON-NLS-1$
        return outputFilePattern;
        public Integer dataFileConflictPreviousChoice = null;
        final String finishProcessCommand = CommonUtils.toString(settings.get("finishProcessCommand"));


        if (!outputClipboard) {
        lobEncoding = CommonUtils.valueOf(LobEncoding.class, CommonUtils.toString(settings.get("lobEncoding")), LobEncoding.BINARY);
        this.outputEncodingBOM = outputEncodingBOM;
import java.util.HashMap;
    }
import org.jkiss.dbeaver.Log;
            DTUtils.addSummary(summary, DTMessages.data_transfer_wizard_output_label_use_single_file, useSingleFile);

        return valueFormat;
    public boolean isSplitOutFiles() {
            DTUtils.addSummary(summary, DTMessages.data_transfer_wizard_output_label_timestamp_pattern, outputTimestampPattern);
    }
                    DTMessages.stream_transfer_consumer_title_configuration_load_failed,
            && dataTransferSettings.getProcessor().isAppendable();
        }
    @Override
    public enum LobExtractType {

        StringBuilder summary = new StringBuilder();
        compressResults = CommonUtils.getBoolean(settings.get("compressResults"), compressResults);
    private static final String SETTING_VALUE_FORMAT = "valueFormat"; //$NON-NLS-1$
            for (StreamMappingContainer container : dataMappings.values()) {
        return outputEncoding;


    }
    }
    private BlobFileConflictBehavior blobFileConflictBehavior = BlobFileConflictBehavior.ASK;
        if (mappings != null && !mappings.isEmpty()) {
 * Stream transfer settings
    }
        return maxOutFileSize;

            }
        settings.put("outputClipboard", outputClipboard);
        final Map<String, Object> mappings = JSONUtils.getObjectOrNull(settings, "mappings");
    
        this.outputEncoding = outputEncoding;
    }
    public DataFileConflictBehavior getDataFileConflictBehavior() {
 *
        settings.put("outputEncodingBOM", outputEncodingBOM);
 *
    }
    @NotNull
            this.dataFileConflictBehavior = StreamConsumerSettings.this.dataFileConflictBehavior;

    }
    public void setBlobFileConflictBehavior(@NotNull BlobFileConflictBehavior blobFileConflictBehavior) {
        DataFileConflictBehavior(String title) {
import org.jkiss.dbeaver.utils.GeneralUtils;
        BlobFileConflictBehavior(String title) {
    public void setLobEncoding(LobEncoding lobEncoding) {
        eventProcessors.remove(descriptor.getId());
    }
    }
    @NotNull
    public void setOutputTimestampPattern(String outputTimestampPattern) {
        public ConsumerRuntimeParameters() {
        ASK(DTMessages.data_transfer_file_conflict_ask),
    }
        }
                    e
    }
import java.util.Map;
    public Map<String, Map<String, Object>> getEventProcessors() {
    private boolean useSingleFile = false;
    public enum BlobFileConflictBehavior {
    private DBDDataFormatterProfile formatterProfile;
    }
    public DBDDisplayFormat getValueFormat() {
                DBWorkbench.getPlatformUI().showError(
        this.maxOutFileSize = maxOutFileSize;
            this.title = title;
        useSingleFile = CommonUtils.getBoolean(settings.get("useSingleFile"), useSingleFile)
        BINARY,
    public void setFormatterProfile(DBDDataFormatterProfile formatterProfile) {
        this.outputFilePattern = outputFilePattern;
    public void removeEventProcessor(@NotNull DataTransferEventProcessorDescriptor descriptor) {
        this.lobExtractType = lobExtractType;
        
    public void setDataFileConflictBehavior(@NotNull DataFileConflictBehavior dataFileConflictBehavior) {
 * limitations under the License.
        return outputEncodingBOM;
        final boolean openFolderOnFinish = CommonUtils.getBoolean(settings.get("openFolderOnFinish"), false);
            this.blobFileConflictBehavior = StreamConsumerSettings.this.blobFileConflictBehavior;
    private String outputTimestampPattern = GeneralUtils.DEFAULT_TIMESTAMP_PATTERN;
    


        this.outputFolder = outputFolder;
 * Unless required by applicable law or agreed to in writing, software
                runnableContext.run(true, true, monitor -> {
import org.jkiss.dbeaver.tools.transfer.*;

    private LobEncoding lobEncoding = LobEncoding.BINARY;
        NATIVE
    }
            eventProcessors.put(FailedExportFileCleanerProcessor.ID, new HashMap<>());
    }
        );
                });
 * you may not use this file except in compliance with the License.
        public boolean dontDropBlobFileConflictBehavior = false;
        this.outputTimestampPattern = outputTimestampPattern;
    }
    public void setSplitOutFiles(boolean splitOutFiles) {

    }

    }
import org.jkiss.dbeaver.model.data.json.JSONUtils;


    public BlobFileConflictBehavior getBlobFileConflictBehavior() {
        if (!dataMappings.isEmpty()) {
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
        BASE64,
    }

            } catch (InvocationTargetException e) {
