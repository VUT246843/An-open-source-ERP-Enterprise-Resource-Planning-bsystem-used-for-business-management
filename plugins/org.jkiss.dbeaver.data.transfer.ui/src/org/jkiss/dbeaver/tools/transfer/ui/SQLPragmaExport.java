import org.jkiss.dbeaver.Log;
            true,
            };
import org.jkiss.utils.CommonUtils;
            false
        );
    }
}
        final DataTransferProcessorDescriptor processor = registry.getProcessor(PROCESSOR_ID_PREFIX + type);
            Map.of(
                consumerNode.getNodeClass().getSimpleName(), createConsumerSettings(parameters)
        return JSONUtils.getObject(parameters, DTConstants.PROP_CONSUMER_TYPE);

        properties.put(DTConstants.PROP_NAME, names.toString());
    public static final String PARAMETER_TYPE = "type";
    }

        UIUtils.asyncExec(() -> {
    ) throws DBException {
        if (processor == null) {
                producerNode.getNodeClass().getSimpleName(), createProducerSettings(parameters),

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.tools.transfer.DataTransferState;
import java.util.StringJoiner;
import org.jkiss.dbeaver.DBException;
        return RESULT_CONSUME_PRAGMA | RESULT_CONSUME_QUERY;

import org.jkiss.dbeaver.model.sql.SQLPragmaHandler;
    }
            names.add(property.getId());
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull DBRProgressMonitor monitor,
            new DataTransferState(),
 *
                protected boolean includePipesConfigurationPage() {
    private static Map<String, Object> createProcessorSettings(
            if (propertyDescriptor == null) {

            new TaskConfigurationWizardDialog(UIUtils.getActiveWorkbenchWindow(), wizard).open();
                }
            properties.put(property.getKey(), PropertyDescriptor.convertString(CommonUtils.toString(property.getValue()), propertyDescriptor.getDataType()));
                DTConstants.PROP_CONSUMER_TYPE, consumerNode.getId(),
    @Override
    ) {
        @NotNull DataTransferProcessorDescriptor processor,

            throw new DBException("Can't find processor of type '" + type + "'");

            ),
import org.jkiss.dbeaver.tools.transfer.stream.StreamTransferConsumer;
                DTConstants.PROP_PROCESSOR_TYPE, processor.getId(),
package org.jkiss.dbeaver.tools.transfer.ui;
        @NotNull Map<String, Object> parameters

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.tools.transfer.ui.wizard.DataTransferWizard;
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager

        if (CommonUtils.isEmpty(type)) {
        @NotNull Map<String, Object> parameters
        return JSONUtils.getObject(parameters, DTConstants.PROP_PRODUCER_TYPE);
    private static final String CONSUMER_NODE_ID = "stream_consumer";
    private static Map<String, Object> createConsumerSettings(

import org.jkiss.dbeaver.tools.transfer.registry.DataTransferProcessorDescriptor;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
                log.debug("Skipping unknown property " + property.getKey());
            Collections.singleton(new DatabaseTransferProducer(container, null)),
        for (DBPPropertyDescriptor property : processor.getProperties()) {
 *
                @Override
        final DataTransferSettings settings = new DataTransferSettings(
import org.jkiss.dbeaver.ui.UIUtils;


import org.jkiss.dbeaver.tasks.ui.wizard.TaskConfigurationWizardDialog;
                    return includePipes;
            Collections.singleton(new StreamTransferConsumer()),

import org.jkiss.dbeaver.model.impl.PropertyDescriptor;
    private static final String PROCESSOR_ID_PREFIX = CONSUMER_NODE_ID + ":stream.";
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
import java.util.Map;
 * See the License for the specific language governing permissions and
        final boolean includePipes = JSONUtils.getBoolean(parameters, PARAMETER_INCLUDE_PIPES, false);
/*

        // TODO: Do we need to sanitize input data here?
        final DataTransferNodeDescriptor producerNode = registry.getNodeById(PRODUCER_NODE_ID);
            properties.put(property.getId(), property.getDefaultValue());

        final StringJoiner names = new StringJoiner(",");
    @NotNull
        return properties;
                ),
    @NotNull
        }
        final Map<String, Object> properties = new HashMap<>();
            final DataTransferWizard wizard = new DataTransferWizard(null, settings, true) {
                DTConstants.PROP_PROCESSORS_LIST, Map.of(
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferRegistry;
        final DataTransferNodeDescriptor consumerNode = registry.getNodeById(CONSUMER_NODE_ID);
            false,
                    processor.getFullId(), createProcessorSettings(processor, parameters)
        final DataTransferRegistry registry = DataTransferRegistry.getInstance();
import org.jkiss.dbeaver.tools.transfer.DataTransferSettings;

        // TODO: Do we need to sanitize input data here?
import org.jkiss.dbeaver.tools.transfer.registry.DataTransferNodeDescriptor;
        }
import java.util.Collections;
        final String type = JSONUtils.getString(parameters, PARAMETER_TYPE);

import org.jkiss.code.NotNull;
    public static final String PARAMETER_INCLUDE_PIPES = "includePipesConfiguration";
 */
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferProducer;
        @NotNull DBSDataContainer container,


 *     http://www.apache.org/licenses/LICENSE-2.0
        }
import org.jkiss.dbeaver.tools.transfer.DTConstants;
public class SQLPragmaExport implements SQLPragmaHandler {
            final DBPPropertyDescriptor propertyDescriptor = processor.getProperty(property.getKey());
 * Copyright (C) 2010-2026 DBeaver Corp and others
import java.util.HashMap;
    @NotNull
        for (Map.Entry<String, Object> property : JSONUtils.getObject(parameters, DTConstants.PROP_PROCESSOR_TYPE).entrySet()) {
            throw new DBException("`type` attribute is mandatory");
 * Unless required by applicable law or agreed to in writing, software
    }
                DTConstants.PROP_PRODUCER_TYPE, producerNode.getId(),

        @NotNull Map<String, Object> parameters) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        });

            }
import org.jkiss.dbeaver.model.data.json.JSONUtils;
 * limitations under the License.
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
                continue;
    private static final Log log = Log.getLog(SQLPragmaExport.class);
    public int processPragma(
    private static final String PRODUCER_NODE_ID = "database_producer";
            true,
 *
    private static Map<String, Object> createProducerSettings(@NotNull Map<String, Object> parameters) {
