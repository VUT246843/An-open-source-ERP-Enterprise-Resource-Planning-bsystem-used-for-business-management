
                    }
    @Override
                                    continue;
                for (DBPDriverLibrary lib : driver.getDriverLibraries()) {
            if (export) {
                                            }
                                                json,
    private static final Log log = Log.getLog(DriverDescriptorSerializerModern.class);
import java.util.Map;
            JSONUtils.field(json, RegistryConstants.ATTR_NAME, driver.getName());
            JSONUtils.field(json, RegistryConstants.ATTR_CLASS, driver.getDriverClassName());
            }
            }
import java.io.OutputStream;
                                            json.endObject();
                        JSONUtils.fieldNE(json, RegistryConstants.ATTR_TYPE, lib.getType().name());
                            JSONUtils.field(json, RegistryConstants.ATTR_EMBEDDED, true);
                    if (export && !lib.isDisabled()) {
                json.name("native-clients");
                                            }
            JSONUtils.field(json, RegistryConstants.ATTR_CUSTOM, driver.isCustom());
 * Copyright (C) 2010-2025 DBeaver Corp and others

                                    json.name("files");
import org.jkiss.dbeaver.model.data.json.JSONUtils;
            }
 * Unless required by applicable law or agreed to in writing, software
                json.name("libraries");
        }
                        json.name(substitutePathVariables(pathSubstitutions, lib.getPath()));
                                    }
                JSONUtils.field(json, RegistryConstants.ATTR_DISABLED, true);
                        }
                json.beginObject();
import org.jkiss.utils.CommonUtils;
                }
            if (!CommonUtils.isEmpty(driver.getCategory())) {
 * DBeaver - Universal Database Manager
                    if (location.getPath() != null) {
                json.endObject();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                                    json.beginObject();
            JSONUtils.field(json, "allowsEmptyPassword", driver.isAnonymousAccess());
                JSONUtils.field(json, RegistryConstants.ATTR_CUSTOM_DRIVER_LOADER, driver.isCustomDriverLoader());
                        json.endObject();
                        if (lib.isEmbedded()) {
                                }
            JSONUtils.fieldNE(json, RegistryConstants.ATTR_PORT, driver.getDefaultPort());
    void serializeDrivers(OutputStream os, List<DataSourceProviderDescriptor> providers) throws IOException {
                json.endObject();
                }
            }
                                            if (file.getFile() == null) {
                        if (!CommonUtils.isEmpty(lib.getPreferredVersion())) {
                        json.name(paramEntry.getKey());
 * limitations under the License.
/*
                        continue;
                                if (!CommonUtils.isEmpty(files)) {
            if (!CommonUtils.isEmpty(driver.getConnectionProperties())) {

                }

                        json.beginObject();

                        json.value(CommonUtils.toString(paramEntry.getValue()));
                json.endObject();

                // Libraries
                                }
                for (Map.Entry<String, Object> paramEntry : driver.getCustomParameters().entrySet()) {
                    }
/**
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
            if (!CommonUtils.isEmpty(driver.getNativeClientHomes())) {
                    if (driver.isCustom() || !CommonUtils.equalObjects(paramEntry.getValue(), driver.getDefaultParameters().get(paramEntry.getKey()))) {

                            JSONUtils.field(json, RegistryConstants.ATTR_DISABLED, true);
                    json.endObject();
                json.name("driver-parameters");
                                            );
import org.jkiss.dbeaver.registry.RegistryConstants;
                        if (!export) {

            }
                                    for (DriverFileInfo file : files) {
                    }
                                            json.beginObject();
                json.beginObject();
                        if (lib.isDisabled()) {
                                            json.name(file.getId());
        json.beginObject();

            }
import com.google.gson.stream.JsonWriter;
                    }
                    }
                JSONUtils.fieldNE(json, RegistryConstants.ATTR_PROVIDER, driver.getProviderDescriptor().getId());
                                            if (!CommonUtils.isEmpty(file.getVersion())) {
import org.jkiss.dbeaver.model.connection.DBPNativeClientLocation;
                for (Map.Entry<String, Object> propEntry : driver.getConnectionProperties().entrySet()) {
                            JSONUtils.field(json, RegistryConstants.ATTR_VERSION, lib.getPreferredVersion());
                    {
            if (!CommonUtils.isEmpty(driver.getDriverLibraries())) {
                            }
            JSONUtils.field(json, RegistryConstants.ATTR_PROPAGATE_DRIVER_PROPERTIES, driver.isPropagateDriverProperties());
                                            JSONUtils.field(
                        JSONUtils.fieldNE(json, RegistryConstants.ATTR_PATH, location.getPath().getAbsolutePath());
        {
                    if (!CommonUtils.equalObjects(propEntry.getValue(), driver.getDefaultConnectionProperties().get(propEntry.getKey()))) {
import org.jkiss.dbeaver.registry.DataSourceProviderDescriptor;
            JSONUtils.field(json, RegistryConstants.ATTR_ID, driver.getId());
                        }
 *
package org.jkiss.dbeaver.registry.driver;
import java.io.IOException;
}
                }
            }

            JSONUtils.fieldNE(json, RegistryConstants.ATTR_DESCRIPTION, driver.getDescription());
public class DriverDescriptorSerializerModern extends DriverDescriptorSerializer {

import org.jkiss.dbeaver.Log;
    }
        json.endObject();

            JSONUtils.field(json, RegistryConstants.ATTR_EMBEDDED, driver.isEmbedded());
 *
 * You may obtain a copy of the License at

                                                JSONUtils.field(json, RegistryConstants.ATTR_VERSION, file.getVersion());
                json.beginObject();
    public static final String DRIVERS_FILE_NAME = "drivers-configuration.json"; //$NON-NLS-1$
import java.util.List;
                        }
            // Parameters
                    json.name(location.getName());
                                List<DriverFileInfo> files = dld.getResolvedFiles().get(lib);
            if (!CommonUtils.isEmpty(driver.getCustomParameters())) {
            JSONUtils.field(json, RegistryConstants.ATTR_INSTANTIABLE, driver.isInstantiable());
                        JSONUtils.field(json, RegistryConstants.ATTR_CUSTOM, lib.isCustom());
                                    json.endObject();
                        }
import org.jkiss.dbeaver.model.connection.DBPDriverLoader;
                                                continue;
                    json.beginObject();

                                        {
            if (driver.isDisabled()) {
                                if (!(driverLoader instanceof DriverLoaderDescriptor dld)) {
                                                RegistryConstants.ATTR_PATH,
        Map<String, String> pathSubstitutions = getPathSubstitutions();
        json.name(driver.getId());
                json.name("connection-properties");
 */
            if (driver.isCustomDriverLoader()) {
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
            JSONUtils.field(json, RegistryConstants.ATTR_ANONYMOUS, driver.isAnonymousAccess());
                for (DBPNativeClientLocation location : driver.getNativeClientHomes()) {
 */
                                                substitutePathVariables(pathSubstitutions, file.getFile().toAbsolutePath().toString())
                JSONUtils.fieldNE(json, RegistryConstants.ATTR_CATEGORY, driver.getCategory());
    public void serializeDriver(JsonWriter json, DriverDescriptor driver, boolean export) throws IOException {
                json.endObject();
                        json.value(CommonUtils.toString(propEntry.getValue()));
            }
    }
            // Client homes
            // Properties
            JSONUtils.fieldNE(json, RegistryConstants.ATTR_URL, driver.getSampleURL());
                        json.name(CommonUtils.toString(propEntry.getKey()));
 * See the License for the specific language governing permissions and



 *     http://www.apache.org/licenses/LICENSE-2.0

            JSONUtils.fieldNE(json, RegistryConstants.ATTR_CATEGORIES, String.join(",", driver.getCategories()));
                                        }
 * Licensed under the Apache License, Version 2.0 (the "License");
                            for (DBPDriverLoader driverLoader : driver.getAllDriverLoaders()) {
                json.beginObject();
 * you may not use this file except in compliance with the License.
                                                log.warn("File missing in " + file.getId());
 * DriverDescriptorSerializerModern
