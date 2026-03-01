import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * distributed under the License is distributed on an "AS IS" BASIS,
                    metaModel.getContributorBundle());
 * Licensed under the Apache License, Version 2.0 (the "License");
                    metaModels.put(driverClass, metaModel);
        return metaModel.getInstance();

 * you may not use this file except in compliance with the License.
    public GenericMetaModelDescriptor getStandardMetaModel() {
 */
            }
        }
                }
            // Try to get model by driver class
import java.util.stream.Stream;
            .toList();
import org.jkiss.dbeaver.Log;

            metaModel = metaModels.get(dataSourceContainer.getDriver().getDriverClassName());
    private GenericMetaModelRegistry(IExtensionRegistry extensionRegistry) {
    }

        for (GenericMetaModelDescriptor metaModel : metaModelDescriptors) {
 *
            for (String driverClass : metaModel.getDriverClass()) {
    private static volatile GenericMetaModelRegistry instance = null;




import org.eclipse.core.runtime.IExtensionRegistry;
            }
            metaModel = getStandardMetaModel();
    private final Map<String, GenericMetaModelDescriptor> metaModels = new HashMap<>();
 * Copyright (C) 2010-2026 DBeaver Corp and others
        }
        }
import org.eclipse.core.runtime.Platform;
        metaModels.put(GenericConstants.META_MODEL_STANDARD, new GenericMetaModelDescriptor());
        return metaModels.get(GenericConstants.META_MODEL_STANDARD);
            for (String replaces : metaModel.getModelReplacements()) {
        for (GenericMetaModelDescriptor metaModel : metaModelDescriptors) {
            }
                }
import java.util.HashMap;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModelDescriptor;
                var replacedMetaModel = metaModels.replace(replaces, metaModel);
    }
        // Now substitute replaced meta models
                log.warn("Meta model '" + metaModelId + "' not recognized. Default one will be used");

 * See the License for the specific language governing permissions and
                continue;
 * limitations under the License.
 *
        }
            metaModel = metaModels.get(metaModelId.toString());
        }
    private static final String EXTENSION_ID = "org.jkiss.dbeaver.generic.meta";
                    log.debug("Meta model '" + metaModel.getId() + "' declares replacement of unknown meta model '" + replaces + "'");
        if (metaModel == null) {
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
        // Add "root" meta models that don't replace other meta models
                for (String driverClass : replacedMetaModel.getDriverClass()) {
            .map(GenericMetaModelDescriptor::new)
    static final protected Log log = Log.getLog(GenericMetaModelRegistry.class);
                metaModels.putIfAbsent(driverClass, metaModel);
        Object metaModelId = dataSourceContainer.getDriver().getDriverParameter(GenericConstants.PARAM_META_MODEL);
    }
            if (metaModels.putIfAbsent(metaModel.getId(), metaModel) != null) {
public class GenericMetaModelRegistry {
        }
                    metaModels.get(metaModel.getId()).getContributorBundle() + "\n\t" +
 * DBeaver - Universal Database Manager
                if (replacedMetaModel == null) {
    public synchronized static GenericMetaModelRegistry getInstance() {
                    continue;
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
        var metaModelDescriptors = Stream.of(extensionRegistry.getConfigurationElementsFor(EXTENSION_ID))
            }
package org.jkiss.dbeaver.ext.generic;
            if (metaModel == null) {
                log.debug("Duplicate meta model ID '" + metaModel.getId() + "' detected:\n\t" +
        if (metaModel == null) {
 *

 *     http://www.apache.org/licenses/LICENSE-2.0
        return instance;
            }
        if (metaModelId != null && !GenericConstants.META_MODEL_STANDARD.equals(metaModelId)) {
                continue;
            instance = new GenericMetaModelRegistry(Platform.getExtensionRegistry());

    }
    public GenericMetaModel getMetaModel(DBPDataSourceContainer dataSourceContainer) throws DBException {
        GenericMetaModelDescriptor metaModel = null;

/*
}

            if (!metaModel.getModelReplacements().isEmpty()) {
        if (instance == null) {
import org.jkiss.dbeaver.DBException;
import java.util.Map;
