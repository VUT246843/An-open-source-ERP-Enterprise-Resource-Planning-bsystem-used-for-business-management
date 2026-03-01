                } else {
        this.entityMapping = entityMapping;

            state.put("child", mapping.isChild());

        throws DBException
            if (!CommonUtils.isEmpty(nodeId) && !CommonUtils.isEmpty(processorId)) {
/**
            importer.runImport(monitor, entityMapping.getDataSource(), is, consumer);
                processor
import org.jkiss.code.Nullable;
                DataTransferNodeDescriptor nodeDesc = DataTransferRegistry.getInstance().getNodeById(nodeId);
                state.put("node", object.defaultProcessor.getNode().getId());

/*
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
@DBSerializable("streamTransferProducer")
        @NotNull StreamProducerSettings settings,
            String nodeId = CommonUtils.toString(state.get("node"));
import java.nio.file.Files;
import org.jkiss.utils.CommonUtils;

import org.jkiss.code.NotNull;
public class StreamTransferProducer implements IDataTransferProducer<StreamProducerSettings> {
            if (mapping == null) {
        public void serializeObject(@NotNull DBRRunnableContext runnableContext, @NotNull DBTTask context, @NotNull StreamTransferProducer object, @NotNull Map<String, Object> state) throws DBException {
    public String getObjectContainerName() {
            if (e instanceof DBException dbe) {
        }
            @NotNull DBTTask objectContext,
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public String getObjectName() {
            throw new DBException("IO error", e);


    public DBPDataSourceContainer getDataSourceContainer() {

    public boolean isConfigurationComplete() {
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
import org.jkiss.dbeaver.tools.transfer.IDataTransferProducer;
import org.jkiss.dbeaver.model.DBPImage;
 * DBeaver - Universal Database Manager
    public Path getInputFile() {
                    CommonUtils.toString(state.get("name")),
        }
        return parent == null ? inputFile.toAbsolutePath().toString() : parent.toAbsolutePath().toString();
    @Override
    {
    @Override

 * Data container transfer producer

 * You may obtain a copy of the License at
            );

            DataTransferProcessorDescriptor processor = null;
import org.jkiss.dbeaver.tools.transfer.DTConstants;

    }


    public static final String NODE_ID = "stream_producer";
        // Perform transfer
        if (obj instanceof StreamTransferProducer) {
        return null;
    public boolean equals(Object obj) {
        importer.init(site);
        }

                    CommonUtils.toBoolean(state.get("child"))
        if (!(databaseObject instanceof DBSEntity)) {
 */
    @Override
    @Nullable
        }
}
    }
            final StreamEntityMapping mapping = object.getEntityMapping();
import java.io.IOException;

    public StreamTransferProducer() {
    }

            }
import org.jkiss.dbeaver.model.struct.DBSEntity;
            return defaultProcessor.getIcon();
        return super.equals(obj);
    }
                    DBFUtils.resolvePathFromString(runnableContext, objectContext.getProject(), CommonUtils.toString(state.get("file"))),
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
                    log.warn("Stream producer node " + nodeId + " not found");
        this.defaultProcessor = defaultProcessor;

import org.jkiss.dbeaver.tools.transfer.registry.DataTransferProcessorDescriptor;
    }
import java.util.Map;
                throw dbe;
    public void transferData(
import org.jkiss.dbeaver.model.DBIcon;

                new StreamEntityMapping(

    public StreamEntityMapping getDatabaseObject()
    }
    public DBPImage getObjectContainerIcon() {
        @Override
                throw new DBException("Task configuration incomplete: source file not specified");
    public StreamTransferProducer(@Nullable StreamEntityMapping entityMapping, @Nullable DataTransferProcessorDescriptor defaultProcessor) {
import org.jkiss.dbeaver.model.meta.DBSerializable;
        try (InputStream is = Files.newInputStream(entityMapping.getInputFile())) {
    }
            @NotNull Map<String, Object> state
    private static final Log log = Log.getLog(StreamTransferProducer.class);
        }
    }
    public StreamEntityMapping getEntityMapping() {
import java.nio.file.Path;
 * Unless required by applicable law or agreed to in writing, software
                if (nodeDesc == null) {
        this(entityMapping, null);
        Path inputFile = entityMapping.getInputFile();

    @Override
        }
            return "";
        return entityMapping;
    @Override
    }

import org.jkiss.dbeaver.DBException;
        return entityMapping == null ? null : entityMapping.getDataSource().getContainer();
        @Override

        return inputFile == null ? "N/A" : DBFUtils.convertPathToString(getInputFile());
            }
            return new StreamTransferProducer(
    @Override
        return entityMapping != null;
        Path inputFile = getInputFile();
        Map<String, Object> processorProperties = settings.getProcessorProperties();
    public String getObjectFullName(@NotNull DBRProgressMonitor monitor) throws IOException {
        ) throws DBException {
        } catch (Exception e) {
import org.jkiss.dbeaver.tools.transfer.serialize.DTObjectSerializer;
    @Override
    private final DataTransferProcessorDescriptor defaultProcessor;
        }

        @NotNull DBRProgressMonitor monitor,
    }
    }
            String processorId = CommonUtils.toString(state.get(DTConstants.PROP_PROCESSOR_TYPE));
 * you may not use this file except in compliance with the License.

        } finally {
            }
                        log.warn("Stream processor " + processorId + " not found");
            //throw new DBException("Wrong consumer object for stream producer: " + databaseObject);
        DBPDataSourceContainer dsContainer = getDataSourceContainer();
import org.jkiss.dbeaver.model.app.DBPProject;
package org.jkiss.dbeaver.tools.transfer.stream;
                }
        this(null, null);
        return entityMapping;
    public DBPProject getProject() {
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferRegistry;
            state.put("file", DBFUtils.getUriFromPath(mapping.getInputFile()));
    {
        if (entityMapping == null) {
        StreamDataImporterSite site = new StreamDataImporterSite(settings, entityMapping, processorProperties);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                ),
            throw new DBException("Stream data producer requires data processor");
        }
    public static class ObjectSerializer implements DTObjectSerializer<DBTTask, StreamTransferProducer> {
 *
    private final StreamEntityMapping entityMapping;
 * See the License for the specific language governing permissions and
        return entityMapping == null ? null : entityMapping.getInputFile();
        @Nullable IDataTransferProcessor processor,
    @Override
        if (defaultProcessor != null) {
        @NotNull IDataTransferConsumer consumer,
import org.jkiss.dbeaver.model.fs.DBFUtils;

        DBSObject databaseObject = consumer.getDatabaseObject();
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferNodeDescriptor;
import org.jkiss.dbeaver.model.struct.DBSObject;
 * limitations under the License.
    @Override
    @Override
    }
        if (processor == null) {
                    processor = nodeDesc.getProcessor(processorId);
                    }
    }
import org.jkiss.dbeaver.model.task.DBTTask;
            @NotNull SerializerContext serializeContext,
    }
        return dsContainer == null ? null : dsContainer.getProject();
import org.jkiss.dbeaver.tools.transfer.IDataTransferProcessor;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        public StreamTransferProducer deserializeObject(
            state.put("name", mapping.getEntityName());
            return CommonUtils.equalObjects(entityMapping, ((StreamTransferProducer) obj).entityMapping);
                    if (processor == null) {
            @NotNull DBRRunnableContext runnableContext,
import java.io.InputStream;
        @Nullable DBTTask task)
        Path parent = inputFile.getParent();

        // Initialize importer
            importer.dispose();

            if (object.defaultProcessor != null) {
import org.jkiss.dbeaver.tools.transfer.serialize.SerializerContext;
    @Override
import org.jkiss.dbeaver.tools.transfer.IDataTransferConsumer;
        return entityMapping == null ? null : entityMapping.getName();

    public DBPImage getObjectIcon() {
            }
                state.put(DTConstants.PROP_PROCESSOR_TYPE, object.defaultProcessor.getId());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }
        IStreamDataImporter importer = (IStreamDataImporter) processor;
import org.jkiss.dbeaver.Log;
        return DBIcon.TREE_FOLDER;
    public StreamTransferProducer(@Nullable StreamEntityMapping entityMapping) {
