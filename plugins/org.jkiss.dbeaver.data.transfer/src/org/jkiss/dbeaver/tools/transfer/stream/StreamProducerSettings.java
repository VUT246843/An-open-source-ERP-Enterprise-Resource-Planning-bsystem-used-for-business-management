            }
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.utils.HelpUtils;

            var processor = dataTransferSettings.getProcessor();
            } catch (Exception e) {
    public int getMaxRows() {
                        "Local file '" + entityMapping.getInputFile() + "' doesn't exist or not accessible. " +


import org.jkiss.dbeaver.tools.transfer.DataTransferSettings;
 * Stream producer (file) settings
    public void loadSettings(DBRRunnableContext runnableContext, DataTransferSettings dataTransferSettings, Map<String, Object> settings) {
    ) {
        return processorProperties;
import org.jkiss.dbeaver.model.data.json.JSONUtils;
        if (!entityMapping.isChild() && settings.getProcessor().isMulti()) {
            if (processor == null) {

            runnableContext.run(true, true, monitor -> {
    public boolean extractExtraEntities(
    public void updateProducerSettingsFromStream(
import java.lang.reflect.InvocationTargetException;
                            "Use Cloud Storage to import/export data." +
                updateProducerSettingsFromStream(monitor, producer, dataTransferSettings);
            monitor.beginTask("Extract extra entities from stream", 1);
 * limitations under the License.
        for (StreamEntityMapping emc : entityMapping.values()) {
/**
            try (InputStream is = Files.newInputStream(entityMapping.getInputFile())) {
public class StreamProducerSettings implements IDataTransferSettings {

        try {
                    sdi.dispose();
                throw new DBException("Processor haven't chosen for data import/export (e.g., XML, CSV, etc.).");

        List<Map<String, Object>> mappings = new ArrayList<>();
            }
                }
        try {
        this.processorProperties = processorProperties;
    ) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                monitor,
 */
 * You may obtain a copy of the License at
                sdi.init(new StreamDataImporterSite(this, entityMapping, processorProperties));

package org.jkiss.dbeaver.tools.transfer.stream;
    public void updateMappingsFromStream(DBRProgressMonitor monitor, DataTransferSettings dataTransferSettings) {
    }
        settings.put("mappings", mappings);
 *
                log.error("IO error while reading entities from stream", e);
import org.jkiss.dbeaver.runtime.DBWorkbench;
        if (entityMapping != null && processor instanceof IStreamDataImporter sdi) {
import org.jkiss.dbeaver.tools.transfer.IDataTransferSettings;
                }
        @NotNull StreamEntityMapping entityMapping,
    public String getSettingsSummary() {
import java.util.*;
                }
                processor.getInstance(),
            StreamTransferProducer producer = (StreamTransferProducer) pipe.getProducer();
            );

                for (Map<String, Object> mapping : JSONUtils.getObjectList(settings, "mappings")) {
                    throw new DBException("Error reading columns from stream", e);
    }
    private Map<String, Object> processorProperties;
    }
    }
                    throw new DBException(
    }
    public StreamProducerSettings() {
            if (producer.getEntityMapping() != null) {
                dataTransferSettings.getProcessorProperties()
            }
        @NotNull DBRProgressMonitor monitor,
                return pendingEntityMappings.addAll(importer.readEntitiesInfo(entityMapping, is));
                producer,


        return "";
            try (InputStream is = Files.newInputStream(entityMapping.getInputFile())) {
            final IMultiStreamDataImporter importer = (IMultiStreamDataImporter) settings.getProcessor().getInstance();
    private int maxRows;
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
                    columnInfos = sdi.readColumnsInfo(entityMapping, is);
        }
    @Override
            log.error("Error loading stream producer settings", e);
                        StreamEntityMapping em = new StreamEntityMapping(monitor, dataTransferSettings.getProject(), mapping);
}
        @NotNull DataTransferSettings dataTransferSettings
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    ) throws DBException {
                if (e instanceof FileNotFoundException &&

    private final Map<String, StreamEntityMapping> entityMapping = new LinkedHashMap<>();

    }
import org.jkiss.dbeaver.DBException;
        List<StreamDataImporterColumnInfo> columnInfos;
                        throw new InvocationTargetException(e);
                    } catch (DBException e) {
        @NotNull StreamTransferProducer producer,


        monitor.beginTask("Update data produces settings from import stream", 1);
                    entityMapping.setStreamColumns(columnInfos);
    }
    }
import java.io.FileNotFoundException;
    }
/*
import org.jkiss.code.NotNull;
            Map<String, Object> emSettings = emc.saveSettings();
 * DBeaver - Universal Database Manager
        return maxRows;
                            "\nLearn more at " + HelpUtils.getHelpExternalReference("Cloud-Storage"), e);
        } catch (Exception e) {
        @NotNull DBRProgressMonitor monitor,
    }

    public Map<String, Object> getProcessorProperties() {
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.Log;
 * Licensed under the Apache License, Version 2.0 (the "License");
                settings.getState().addError(e);
                    }

import org.jkiss.dbeaver.tools.transfer.DataTransferPipe;
    }
                    DBWorkbench.getPlatform().getApplication().isMultiuser() &&
    public void updateProducerSettingsFromStream(
import java.nio.file.Files;
    }
                } finally {
    private static final Log log = Log.getLog(StreamProducerSettings.class);
 * See the License for the specific language governing permissions and
        }
        @NotNull Collection<StreamEntityMapping> pendingEntityMappings
                try {
        }
 *
import org.jkiss.utils.IOUtils;
        monitor.done();
        for (DataTransferPipe pipe : dataTransferSettings.getDataPipes()) {
        @NotNull StreamTransferProducer producer,
    public void saveSettings(Map<String, Object> settings) {
                monitor.done();

                ) {
                    IOUtils.isLocalPath(entityMapping.getInputFile())
        setProcessorProperties(dataTransferSettings.getProcessorProperties());
 * Unless required by applicable law or agreed to in writing, software
            if (emSettings != null) {
            log.warn("Exception during of updating producer settings", e);
        }
            });
            dataTransferSettings.getState().addError(e);
    public void setProcessorProperties(Map<String, Object> processorProperties) {
        return false;

 */

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull DataTransferSettings settings,
            updateProducerSettingsFromStream(
            } finally {
            } catch (Exception e) {
            }
            }
                } else {
        } catch (DBException e) {
    @Override
 *
                    try {
                mappings.add(emSettings);


                        entityMapping.put(em.getEntityName(), em);
        this.maxRows = maxRows;


                updateMappingsFromStream(monitor, dataTransferSettings);
import org.jkiss.dbeaver.tools.transfer.IDataTransferProcessor;
    @Override
        }
        StreamEntityMapping entityMapping = producer.getEntityMapping();
import java.io.InputStream;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }

 * you may not use this file except in compliance with the License.
        @NotNull Map<String, Object> processorProperties

    public void setMaxRows(int maxRows) {
        @NotNull IDataTransferProcessor processor,
