                    // But, probably, table(s) were deleted, and we lost our producer(s).
                if (source.getDatabaseObject() != null) initObjects.add(source.getDatabaseObject());
        List<DBSEntity> entities = dataPipes.stream().sequential()
            Class<? extends IDataTransferConsumer> consumerType = dataPipes.get(0).getConsumer().getClass();
        } else {
        if (processorNode == consumer) {
        return producerSettings;
public class DataTransferSettings implements DBTTaskSettings {
    }
            this.consumer = null;
        CommonUtils.shiftRight(dataPipes, pipe);
        CommonUtils.shiftLeft(dataPipes, pipe);
        this.producer = producer;
        return initProducers;
                .collect(Collectors.toList());

 *     http://www.apache.org/licenses/LICENSE-2.0
                }
    }
        List<DBSEntity> simpleTables = new ArrayList<>();

    // When we create new task its settings are empty. We need to load defaults from saved settings (usually data transfer dialog settings)
    public void selectProducer(DataTransferNodeDescriptor producer, DataTransferProcessorDescriptor processor, boolean rewrite) {
    private DataTransferNodeDescriptor consumer;
    public Map<String, Object> getNodeSettingsMap(@NotNull DataTransferNodeDescriptor node) {
        this.initConsumers = consumers == null ? null : consumers.toArray(new IDataTransferConsumer[0]);
        this(
    }
            if (!CommonUtils.isEmpty(processorId)) {
                    pipe.setConsumer(null);
                .map(pipe -> (DBSEntity) pipe.getProducer().getDatabaseObject())

                    // Legacy code support
                        if (!DataTransferRegistry.getInstance().getAvailableProducers(initObjects).contains(producerNode)) {
            String processorId = CommonUtils.toString(config.get(DTConstants.PROP_PROCESSOR_TYPE));
            this.selectConsumer(savedConsumer, savedProcessor, false);

                // This may happen when task was saved for db-> settings
            if (consumer != null) {


    }
        boolean isExport)
        dataPipes.clear();
                DBPProject project = initConsumer.getProject();
    @NotNull
    public int getMaxJobCount() {
    public boolean isPipeChangeRestricted() {
import org.jkiss.code.NotNull;

        DataTransferProcessorDescriptor savedProcessor = this.processor;
    }
        @Nullable Collection<? extends IDataTransferConsumer> consumers,
                if (nodeObj instanceof Map) {
        }
                    case "streamTransferProducer" -> {
        this(producers,
        if (this.producerOptional && this.producer != null) {
            log.warn("Unable to sort database entities!");
 * Copyright (C) 2010-2025 DBeaver Corp and others
                            information.addDataSource(task.getProject().getDataSourceRegistry().getDataSource(dsID));
/**
                    }
            }
 * Unless required by applicable law or agreed to in writing, software


        @Nullable Collection<? extends IDataTransferConsumer> consumers,
                    DTMessages.data_transfer_settings_title_find_consumer,
            task.getProject(),
    public DataTransferSettings(
    public Map<DataTransferProcessorDescriptor, Map<String, Object>> getProcessorPropsHistory() {
            }
            this.producer = null;
                pipe.setProducer(null);

            }
            List<Map<String, Object>> nodeList = JSONUtils.getObjectList(config, dtNodeType);
        );
        initProducers = new IDataTransferProducer[0];
    }
        initObjects.clear();

            if (!rewrite && pipe.getConsumer() != null) {


        try {
            // Processor belongs to non-database nodes anyway
        Map<String, Object> config = task.getProperties();

                            taskLog.error(e);
        }
        boolean isTaskRunning)
                DataTransferPipe pipe = dataPipes.get(0);
        }
            DataTransferPipe pipe = dataPipes.get(i);
        if (!ArrayUtils.isEmpty(initConsumers)) {
        return consumer;
        }
        DataTransferProcessorDescriptor savedProcessor = null;
            this.selectProducer(savedProducer, savedProcessor, false);
            consumers,
        loadNodeSettings(runnableContext, consumer);
            this.selectProducer(this.producer, savedProcessor, false);
        IDataTransferSettings producerSettings = getNodeSettings(producerNode);
        }
    }
            !task.getProperties().isEmpty(),
                    }

                        } else {
        this.producer = producer;
    public void processPipeLater(@NotNull DataTransferPipe pipe) {
    public List<DBSObject> getSourceObjects() {
                selectConsumer(consumerDesc, null, false);
    }

    public static <T> List<T> getNodesFromLocation(@NotNull DBRProgressMonitor monitor, DBTTask task, DataTransferState state, Log taskLog, String nodeType, Class<T> nodeClass) {
    }
                    }
            if (consumerDesc != null) {
    private static final Log log = Log.getLog(DataTransferSettings.class);
                    DataTransferProcessorDescriptor nodeProcessor = node.getProcessor(processorId);
    public DataTransferProcessorDescriptor getProcessor() {
        @Nullable Collection<? extends IDataTransferProducer> producers,
import org.jkiss.dbeaver.DBException;
    private transient int curPipeNum = 0;
    public void clearDataPipes() {
        if (settings == null) {
                dataPipes.add(new DataTransferPipe(null, target));
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
            for (IDataTransferConsumer<?,?> target : initConsumers) {
        return JSONUtils.getObject(configurationMap, node.getNodeClass().getSimpleName());
        }
            DBSEntity entity1 = (DBSEntity) dbsObject1;
                String processorId = procIter.getKey();
    private boolean consumerOptional;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                return idx1 - idx2;
                        }
                    case "databaseTransferConsumer" -> {
    }
        if (this.consumerOptional && savedConsumer != null) {
        dataPipes.sort((pipe1, pipe2) -> { //fixme rewrite
        return producer;
                    int divPos = processorId.indexOf(':');
        {
                        if (nodeClass.isInstance(node)) {
    }
                if (initProducers[i].getDatabaseObject() != null) initObjects.add(initProducers[i].getDatabaseObject());
        if (!nodeUpdateRestricted) {
                        state.addError(e);
        return DBWorkbench.getPlatform().getWorkspace().getActiveProject();
    }
        } catch (InterruptedException e) {
        return dataPipes;

                savedProcessor = processorNode.getProcessor(processorId);
                    try {
    }

                    log.error(e);
            } else {
                if (project != null) {
                } catch (DBException e) {
        return initConsumers;

            } else if (producer2 == null) {
        // Initialize pipes with loaded settings
            }
                if (!CommonUtils.isEmpty(producerId)) {
                    state.addError(new DBException("Processor '" + processorId + "' not found in '" + processorNode.getName() + "'"));
/*
            }
            }
        @NotNull DBRProgressMonitor monitor,
        if (producer != null && processor != null) {
                DataTransferNodeDescriptor node = registry.getNodeByType(target.getClass());
                .filter(pipe -> pipe.getProducer() != null && pipe.getProducer().getDatabaseObject() instanceof DBSEntity)
            IDataTransferProducer<?> producer2 = pipe2.getProducer();
    }
            idx1 = cyclicTables.indexOf(entity1);
                        taskLog.error(e);

                return -1;
    }
            int idx2 = views.indexOf(entity2);
 * limitations under the License.
            }
        Map<String, Object> processorsSection = JSONUtils.getObject(config, DTConstants.PROP_PROCESSORS_LIST);
        return producerOptional;
                    return project;
                }
            // Make pipes
    // if it's not required -- e.g., when we're editing an exiting task

            if (producer != null) {
            selectDefaultNodes,
                if (node != null) {
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferProducer;
                if (!CommonUtils.isEmpty(consumerId)) {
                this.producer = pipe.getProducer() == null ? null : registry.getNodeByType(pipe.getProducer().getClass());
            return DBWorkbench.getPlatformUI().runWithProgress(loader);
        }
        }
        @Nullable Collection<? extends IDataTransferProducer> producers,
        for (DataTransferPipe pipe : dataPipes) {
 * you may not use this file except in compliance with the License.
        initializePipes(producers, consumers, isExport);
                DBWorkbench.getPlatformUI().showError(
            if (producer1 == null && producer2 == null) {
                try {
        this.consumer = consumer;


    }
            return savedSettings;

    private boolean pipeChangeRestricted;
    public synchronized DataTransferPipe acquireDataPipe(@NotNull DBRProgressMonitor monitor, @Nullable DBTTask task) {

    private final Map<String, Object> configurationMap;
        } catch (InvocationTargetException e) {
            for (Map.Entry<String, Object> procIter : processorsSection.entrySet()) {
        }
                return 1;
    }
        }
    }
        final IDataTransferSettings settings = getNodeSettings(node);

    private List<DataTransferPipe> dataPipes;
    {

        }
                        + (isExport ? ". Please check your source containers" : ""));
    // New hacky flag. Helps to understand - do the task running already? Or are we just checking task settings?
            }
        boolean isTaskRunning)
                    DTMessages.data_transfer_settings_message_find_data_consumer);

        } else if (!ArrayUtils.isEmpty(initConsumers)) {
                        }
                    } finally {
                } catch (DBException e) {
        // Collect objects
                        Map<String, Object> location = JSONUtils.getObject(nodeObj, "location");
            nodeSettings.put(node, settings);
        }
            consumerOptional = isExport;//initProducers[0] instanceof IDataTransferNodePrimary;
        this.consumer = consumer;
            if (producerDesc != null) {
                            this.setConsumer(consumerNode);
    public Map<String, Object> getProcessorProperties() {
                            state.addError(e);

                        if (!DataTransferRegistry.getInstance().getAvailableConsumers(initObjects).contains(consumerNode)) {
            if (initProducers.length != initConsumers.length) {
        this.state = state;
                    // In this case, we had data transfer from table(s) to a file or another container.
    public DataTransferSettings(
            }

    public static final int DEFAULT_THREADS_NUM = 1;
        for (DataTransferPipe pipe : dataPipes) {
                try {

        if (consumer != null && processor != null) {
    }
                // Both producer and consumer set are primary
            return;
                String propNamesId = CommonUtils.toString(procSection.get(DTConstants.PROP_NAME));
    }
            // Set default producer
import org.jkiss.dbeaver.runtime.DBWorkbench;
            } else {
    public DataTransferSettings(
    }

            configuration,
                    }
                    if (consumerNode != null) {
    }

        }
        if (nodes != null) {
                continue;
    private DBPProject getProjectFromPipes() {
        @NotNull DataTransferState state,
                        }
                    state.addError(e);
            null,
                    // Usually, consumers do not have any special info, so we can delete extra items.
            }

    @Nullable
            }
        @Nullable Collection<? extends IDataTransferProducer> producers,
        if (producerSettings == null) {
                switch (type) {
        this.setShowFinalMessage(CommonUtils.getBoolean(config.get("showFinalMessage"), this.isShowFinalMessage()));
                DBPProject project = initProducer.getProject();
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
        }

        return nodeSettingsLoaded;
        return showFinalMessage;
                consumerOptional = true;
 * DataTransferSettings
        if (!selectDefaultNodes) {
            if (!(dbsObject1 instanceof DBSEntity) && !(dbsObject2 instanceof DBSEntity)) {
    }
                dataPipes.add(new DataTransferPipe(source, null));
        return producerProcessor;
    private final Map<DataTransferProcessorDescriptor, Map<String, Object>> processorPropsHistory = new HashMap<>();
        } else {
import org.jkiss.dbeaver.model.struct.DBStructUtils;
import org.jkiss.dbeaver.model.task.DBTTask;
                        processorId = processorId.substring(divPos + 1);
                        }
                initObjects.add(object);
            }
        MonitorRunnableContext runnableContext = new MonitorRunnableContext(monitor);
                log.error(e);
                }

 *
        this.setMaxJobCount(CommonUtils.toInt(config.get("maxJobCount"), DataTransferSettings.DEFAULT_THREADS_NUM));
        }

    public void loadNodeSettings(DBRProgressMonitor monitor) {
}

            }
    public static boolean isExportTask(DBTTask task) {

                        }
        return project;
        }
        if (maxJobCount > 0) {
        IDataTransferSettings settings = nodeSettings.get(node);
        Object nodeList = config.get(nodeType);
            this.consumer = null;
                        }
        {
                return 0;
                pipe.setConsumer(null);
                DataTransferNodeDescriptor node = DataTransferRegistry.getInstance().getNodeById(nodeId);
            producerOptional = true;
                    pipe.setConsumer(consumerNode);
            consumerOptional = true;
        }
                    this.consumer = node;
            getTaskOrSavedSettings(task, configuration),
            producerOptional = !isExport;//initConsumers[0] instanceof IDataTransferNodePrimary;
        }
                    case "databaseTransferProducer" -> {
            producerOptional = true;
        }
            getNodesFromLocation(monitor, task, state, taskLog, "producers", IDataTransferProducer.class),
                            result.add(nodeClass.cast(node));
            }

            // Do this only if consumer/producer weren't set explicitly

                String consumerId = CommonUtils.toString(config.get(DTConstants.PROP_CONSUMER_TYPE));
                    log.error(e);

            this.maxJobCount = maxJobCount;

import org.jkiss.dbeaver.model.runtime.DBRRunnableWithReturn;
                    }
    private boolean isTaskRunning;
    public void processPipeEarlier(@NotNull DataTransferPipe pipe) {
            }
                        if (producerNode.hasProcessors()) {
    private boolean showFinalMessage = true;
            }
            } else {
        this.producerOptional = !isExport;
                        information.addLocation(JSONUtils.getString(nodeConfig, "outputFolder"));
            for (Object inputObject : nodes) {
        });
        return state;
            throw new DBException("Settings load interrupted", e);
    // Dirty code to examine DT configuration and extract all DS or IO references
    public void setProducer(DataTransferNodeDescriptor producer) {
    public void setPipeChangeRestricted(boolean pipeChangeRestricted) {
                        nodeId = processorId.substring(0, divPos);
            DBSObject object = isExport ? pipe.getProducer().getDatabaseObject() : pipe.getConsumer().getDatabaseObject();
    }
                this.consumer = pipe.getConsumer() == null ? null : registry.getNodeByType(pipe.getConsumer().getClass());
        @NotNull Log taskLog,
    {
            }
            for (IDataTransferNode<?> initConsumer : initConsumers) {
                            producerNode = null;
                }
            state.put(nodeType, inputObjects);
        @NotNull Map<String, Object> configuration,
    private boolean producerOptional;
        List<DBSEntity> views = new ArrayList<>();
            DBSObject dbsObject2 = producer2.getDatabaseObject();
            isExitingTask,
        DataTransferNodeDescriptor savedConsumer = null, savedProducer = null, processorNode = null;
        }
    {
import org.jkiss.dbeaver.model.struct.DBSObject;
        for (String dtNodeType : dtNodeTypes) {
        // Don't update producer and consumer if it's not required (#9687)
        boolean isExitingTask,
                // Leave only optional consumer then
    }
            }
    private void selectProducer(DataTransferNodeDescriptor producer) {
        if (processor == null) {

                } else {
            }
    }
            for (IDataTransferProducer<?> source : initProducers) {

        this.processor = processor;
        return processor;
        // Configure pipes
                if (target.getDatabaseObject() != null) initObjects.add(target.getDatabaseObject());
            return;
        this.pipeChangeRestricted = pipeChangeRestricted;
        // Configure pipes

        DataTransferRegistry registry = DataTransferRegistry.getInstance();
                return null;
                consumerOptional = false;
 * You may obtain a copy of the License at
                return 0;
    }
import org.jkiss.utils.CommonUtils;

                            savedProducer = this.producer;
            this.processor = null;
    private transient boolean nodeSettingsLoaded = false;
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferRegistry;
        List<DBSEntity> cyclicTables = new ArrayList<>();
                }
 */
                }
            {
        }
                    Map<String, Object> props = new HashMap<>();
            }


        String[] dtNodeTypes = { "producers", "consumers" };
                String nodeId = CommonUtils.toString(procSection.get("@node"));
            if (idx1 != -1 || idx2 != -1) {
            }
        loadNodeSettings(runnableContext, producer);
                        if (consumerNode.hasProcessors()) {
            }
                if (project != null) {
            }
                }
        this.processor = processor;
    }
        return consumerOptional;
        this.nodeSettingsLoaded = true;

    @Nullable
                    if (divPos != -1) {
                return -1;
                if (node != null) {
    }
                            consumerNode = null;
    }
            DataTransferNodeDescriptor consumerDesc = registry.getNodeByType(consumerType);
        if (curPipeNum >= dataPipes.size()) {

                            savedConsumer = this.consumer;

                    }
                } catch (Exception e) {
        this.initProducers = producers == null ? null : producers.toArray(new IDataTransferProducer[0]);
    public void setDataPipes(List<DataTransferPipe> dataPipes, boolean isExport) {
    }
        for (int i = 0; i < dataPipes.size(); i++) {
            }
                            processorNode = producerNode;
            // Restore consumer/producer from saved configuration
            isTaskRunning);
        }
        @NotNull DBTTask task,
        this.producer = producer;
                DBWorkbench.getPlatformUI().showError(DTMessages.data_transfer_settings_title_find_producer, DTMessages.data_transfer_settings_message_find_data_producer);
        boolean selectDefaultNodes,
    }
        boolean isExport,
    }
                            savedConsumer = consumerNode;
                    // To show task wizard to the user.
                    }
            isExportTask(task),


            for (int i = 0; i < initProducers.length; i++) {
                    // Check that this producer is allowed
            DataTransferNodeDescriptor producerDesc = registry.getNodeByType(producerType);
        this.configurationMap = configuration;
        List<T> result = new ArrayList<>();
            // Both producers and consumers specified

    }

        if (settings != null && rawSettings != null) {
            throw new DBException("Cannot find node descriptor for " + node.getClass().getName());
    // Hacky flag. Says that pipe selection is frozen.
import org.jkiss.dbeaver.model.task.DBTTaskInfoCollector;
                        if (this.consumer == null){
        } catch (DBException e) {
                        } else {
            if (pipe.getProducer() != null && pipe.getConsumer() != null) {
        return taskSettings;

                    pipe.setProducer((IDataTransferProducer<?>) producer.createNode());

        return initObjects;
            // Set default consumer
            if (!rewrite && pipe.getProducer() != null) {
        processorPropsHistory.put(processor, properties);
        this.project = project != null ? project : getProjectFromPipes();
    }
            } catch (DBException e) {
                        String entityId = JSONUtils.getString(location, "entityId");
import org.jkiss.utils.ArrayUtils;
                            savedProducer = producerNode;
            return;
            state,
            DBTaskUtils.isTaskExists(task),
        try {

        }
                    if (!CommonUtils.isEmpty(initObjects)) {
 */
                    throw new IllegalArgumentException("Producers number must match consumers number"
                return idx1 - idx2;

                        if (this.producer == null) {
        return maxJobCount;

        Map<String, Object> taskSettings = JSONUtils.getObject(task.getProperties(), "configuration");
                    pipe.setProducer(null);
                        if (entityId != null) {
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferProcessorDescriptor;
    private boolean producerProcessor;
        this.isTaskRunning = isTaskRunning;
                        }

    private DataTransferProcessorDescriptor processor;
    public void setMaxJobCount(int maxJobCount) {
    public boolean isShowFinalMessage() {
            isExport,

                    }
import java.util.*;
    private final DataTransferState state;
    public IDataTransferConsumer<?,?>[] getInitConsumers() {
        DataTransferNodeDescriptor producerNode = DataTransferRegistry.getInstance().getNodeByType(node.getClass());
        @NotNull Map<String, Object> configuration,
package org.jkiss.dbeaver.tools.transfer;
    private final DBPProject project;
    @NotNull
    private int maxJobCount = DEFAULT_THREADS_NUM;
            settings.loadSettings(runnableContext, this, rawSettings);

                if (CommonUtils.isEmpty(nodeId)) {
    public DBPProject getProject() {

                    if (producerNode != null) {
                selectProducer(producerDesc);
    private IDataTransferProducer<?>[] initProducers;
            for (IDataTransferNode<?> initProducer : initProducers) {
    public boolean isProducerOptional() {
                        }

                return 1;
import org.jkiss.dbeaver.Log;
                }
        }
            producerProcessor = true;
            } else if (!(dbsObject1 instanceof DBSEntity)) {
    private final List<DBSObject> initObjects = new ArrayList<>();
                Map<String, Object> nodeConfig = JSONUtils.getObject(dtConfig,
        }
                }
        if (!ArrayUtils.isEmpty(initProducers) && !ArrayUtils.isEmpty(initConsumers)) {
            return null;
        return task.getType().getId().equals(DTConstants.TASK_EXPORT);
            if (producerOptional && consumerOptional) {
import org.jkiss.dbeaver.model.struct.DBSEntity;
        this.consumerOptional = isExport;
            }
                dataPipes.add(new DataTransferPipe(initProducers[i], initConsumers[i]));
        }
                producerOptional = false;
                            this.setProducer(producerNode);
    public void setProcessorProperties(Map<String, Object> properties) {
        }

    }
                }
        }
                    if (nodeProcessor != null) {
                }

        if (this.producerOptional && savedProducer != null) {

    // Makes sense for special case like multi-file import
import java.util.stream.Collectors;
        boolean isExitingTask,
        loadSettings(configuration);
                    } catch (Exception e) {
            } else if (dbsObject2 == null) {
    }
                return 1;
    }

                    }
        return result;
        @NotNull DataTransferState state,
        boolean isExport,
            } else {
                        for (String prop : CommonUtils.splitString(propNamesId, ',')) {
                }
                    initConsumers = Arrays.copyOf(initConsumers, initProducers.length);
        @Nullable DBPProject project,
        @Nullable Collection<? extends IDataTransferConsumer> consumers,
        SerializerContext serializeContext = new SerializerContext();
import org.jkiss.dbeaver.model.task.DBTaskUtils;
            // Make pipes
            for (Map<String, Object> nodeObj : nodeList) {
        this.showFinalMessage = showFinalMessage;

            idx2 = cyclicTables.indexOf(entity2);
            IDataTransferProducer<?> producer1 = pipe1.getProducer();
    public IDataTransferSettings getNodeSettings(DataTransferNodeDescriptor node) {
            // Now cleanup all nodes. We needed them only to load default producer/consumer settings
                    }
                    return project;
        return pipeChangeRestricted;
            throw new DBException("Cannot find node settings for " + producerNode.getName());
    public IDataTransferProducer<?>[] getInitProducers() {
    public IDataTransferSettings getNodeSettings(IDataTransferNode node) throws DBException {
import org.jkiss.dbeaver.model.runtime.MonitorRunnableContext;
import org.jkiss.dbeaver.model.app.DBPProject;
            isTaskRunning

            {
    public void loadSettings(Map<String, Object> config) {

        }
        }
            if (!processorPropsHistory.containsKey(processor)) {
            DBStructUtils.sortTableList(monitor, entities, simpleTables, cyclicTables, views);
            if (dbsObject1 == null && dbsObject2 == null) {
        }

    }
        }
            int idx1 = views.indexOf(entity1);

    public DataTransferNodeDescriptor getConsumer() {
    // Hacky flag too. Skip nodes (producer and consumer) update
        } else if (!ArrayUtils.isEmpty(initProducers)) {
            }
    private final boolean nodeUpdateRestricted;
                    Character.toUpperCase(type.charAt(0)) + type.substring(1));
        // Now determine main producer and consumer and processor
                    if (!CommonUtils.isEmpty(initObjects)) {
                    continue;
                return 0;
        this.dataPipes = dataPipes;
                        for (Throwable e : serializeContext.resetErrors()) {
    public static DataTransferSettings loadSettings(DBRRunnableWithReturn<DataTransferSettings> loader) throws DBException {
        DataTransferRegistry registry = DataTransferRegistry.getInstance();
    private @Nullable IDataTransferConsumer<?,?>[] initConsumers;
    public List<DataTransferPipe> getDataPipes() {
        if (nodeList instanceof Collection) {
        return result;
            throw new DBException("Error loading settings", e.getTargetException());
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.model.data.json.JSONUtils;

    }
            try {
            log.debug("No processor selected - no properties");
        if (initProducers != null) {
                        }
    public boolean isNodeSettingsLoaded() {
    @NotNull
import org.jkiss.dbeaver.model.task.DBTTaskSettings;
                        }
            if (idx1 != -1 || idx2 != -1) {
        if (processorNode != null) {
        if (initConsumers != null) {
                        processorPropsHistory.put(nodeProcessor, props);
            throw new IllegalStateException("No processor selected");
        initObjects.clear();

            MonitorRunnableContext runnableContext = new MonitorRunnableContext(monitor);
            this.selectConsumer(this.consumer, savedProcessor, false);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            state,
        @NotNull DataTransferState state,

    private DataTransferNodeDescriptor producer;
            }
                // Something went wrong
            Class<? extends IDataTransferProducer> producerType = dataPipes.get(0).getProducer().getClass();
        }
        }
                continue;
                processorPropsHistory.put(processor, new HashMap<>());
        }
import org.jkiss.code.Nullable;
            }
    }
    }
            }
                    pipe.initPipe(this, i, dataPipes.size());
    public boolean isConsumerOptional() {
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull Map<String, Object> configuration,
        initConsumers = new IDataTransferConsumer[0];
                            props.put(prop, procSection.get(prop));
            return null;
        final Map<String, Object> rawSettings = getNodeSettingsMap(node);
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferNodeDescriptor;
            if (!processorPropsHistory.containsKey(processor)) {
        if (node == null) {
        Map<String, Object> dtConfig = JSONUtils.getObject(config, "configuration");
        boolean isTaskRunning) {
    public void selectConsumer(DataTransferNodeDescriptor consumer, DataTransferProcessorDescriptor processor, boolean rewrite) {

            this.producer = null;
    }
                }

                }
    @NotNull
    public void setShowFinalMessage(boolean showFinalMessage) {
            for (Object nodeObj : (Collection<?>)nodeList) {

                        Object node = DTUtils.deserializeObject(runnableContext, serializeContext, task, (Map<String, Object>) nodeObj);
                    DataTransferNodeDescriptor producerNode = DataTransferRegistry.getInstance().getNodeById(producerId);
        if (this.consumerOptional && this.consumer != null) {
    public void sortDataPipes(DBRProgressMonitor monitor) {
        this.producerOptional = false;
    public boolean isProducerProcessor() {
                settings = node.createSettings();
    @Nullable
            return simpleTables.indexOf(entity1) - simpleTables.indexOf(entity2);
    public static void saveNodesLocation(DBRRunnableContext runnableContext, DBTTask task, Map<String, Object> state, Collection<IDataTransferNode<?>> nodes, String nodeType)  throws DBException {
            }
    private void loadNodeSettings(@NotNull MonitorRunnableContext runnableContext, @Nullable DataTransferNodeDescriptor node) {

        return processorPropsHistory.get(processor);
                processorPropsHistory.put(processor, new HashMap<>());
                            processorNode = consumerNode;

        this.nodeUpdateRestricted = isExitingTask;
        if (processor == null) {
    public DataTransferState getState() {
            List<Map<String, Object>> inputObjects = new ArrayList<>();
                if (!isTaskRunning && initProducers.length < initConsumers.length && initProducers[0] instanceof DatabaseTransferProducer) {
                }

                try {
    }
        this.consumerOptional = false;

    public static void collectTaskInfo(DBTTask task, DBTTaskInfoCollector.TaskInformation information) {
        return processorPropsHistory;
                            String dsID = entityId.split("/")[0];
        if (taskSettings.isEmpty() && !savedSettings.isEmpty()) {
            }
        curPipeNum++;
                inputObjects.add(DTUtils.serializeObject(runnableContext, task, inputObject));
                if (savedProcessor == null) {
    private static Map<String, Object> getTaskOrSavedSettings(@NotNull DBTTask task, @NotNull Map<String, Object> savedSettings) {
                String producerId = CommonUtils.toString(config.get(DTConstants.PROP_PRODUCER_TYPE));
    private void initializePipes(
 *
    }

                Map<String, Object> procSection = (Map<String, Object>) procIter.getValue();
        // Load processor properties

 * DBeaver - Universal Database Manager
        this.initObjects.clear();
            DBSObject dbsObject1 = producer1.getDatabaseObject();
            } else if (producer1 == null) {
    }
    }
    public DataTransferNodeDescriptor getProducer() {
                    case "streamTransferConsumer" -> {
import java.lang.reflect.InvocationTargetException;
        Map<String, Object> config = task.getProperties();
            } else if (dbsObject1 == null) {
        boolean selectDefaultNodes,
    }
            }
        for (DataTransferPipe pipe : dataPipes) {
                String type = JSONUtils.getString(nodeObj, "type");
        DataTransferPipe result = dataPipes.get(curPipeNum);
                    }
            // Make pipes

        return settings;

                    IDataTransferConsumer<?,?> consumerNode = (IDataTransferConsumer<?,?>) consumer.createNode();

            producerProcessor = false;
        if (nodeSettingsLoaded) {
import org.jkiss.dbeaver.tools.transfer.internal.DTMessages;
            if (object != null) {
    private final Map<DataTransferNodeDescriptor, IDataTransferSettings> nodeSettings = new HashMap<>();

 *
    }
            } else if (!(dbsObject2 instanceof DBSEntity)) {
            getNodesFromLocation(monitor, task, state, taskLog, "consumers", IDataTransferConsumer.class),
    @NotNull

        }
    public void setConsumer(DataTransferNodeDescriptor consumer) {
        this.dataPipes = new ArrayList<>();
                return -1;
            DBSEntity entity2 = (DBSEntity) dbsObject2;
        if (producerNode == null) {
import org.jkiss.dbeaver.tools.transfer.serialize.SerializerContext;
            for (IDataTransferConsumer<?,?> target : initConsumers) {
                if (CommonUtils.isEmpty(type)) {
            if (!dataPipes.isEmpty()) {
                    // Check that this consumer is allowed
                    DataTransferNodeDescriptor consumerNode = DataTransferRegistry.getInstance().getNodeById(consumerId);
