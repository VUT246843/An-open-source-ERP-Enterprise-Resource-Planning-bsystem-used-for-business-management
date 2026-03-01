        return !driver.getDriverReplacementsInfo().isEmpty();
                JSONUtils.field(jsonWriter, PRODUCT_ID_LABEL, Platform.getProduct().getId());
            try (JsonWriter jsonWriter = DB_GSON.newJsonWriter(mdWriter)) {
    }
            log.error("Directory by path '" + directory + "' does not exists"); //$NON-NLS-1$
    private void publishDataBaseInfo(@NotNull Path path) {

                    JSONUtils.serializeObjectList(jsonWriter, DB_CATEGORY_LABEL, driver.getCategories());
 * Copyright (C) 2010-2026 DBeaver Corp and others
                jsonWriter.flush();
    private static final Gson DB_GSON = new GsonBuilder()
        if (!path.toFile().isDirectory()) {
    private boolean isRequireToDownload(DriverDescriptor driver) {
            return;
                    }
    private static final String OUTPUT_DATABASES_JSON = "database.drivers.json"; //$NON-NLS-1$
            log.error("Target location is not a directory '" + directory + "'"); //$NON-NLS-1$
    private static final Log log = Log.getLog(DataBaseInfoHandler.class);
        List<DataSourceProviderDescriptor> dataSourceProviders = dataSourceRegistry.getDataSourceProviders();
        try (Writer mdWriter = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
import java.util.List;
}
import org.jkiss.dbeaver.model.data.json.JSONUtils;
                    JSONUtils.field(jsonWriter, DB_NAME_LABEL, driver.getName());
            for (DriverDescriptor driverDescriptor : providerDescriptor.getEnabledDrivers()) {
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;

                JSONUtils.field(jsonWriter, PRODUCT_DESCRIPTION_LABEL, Platform.getProduct().getDescription());
import org.jkiss.dbeaver.registry.DataSourceProviderDescriptor;
import picocli.CommandLine;
    private static final String DB_CATEGORY_LABEL = "category"; //$NON-NLS-1$
import java.io.IOException;

            .map(DBPDriverLibrary::getLocalFile)
 *
                JSONUtils.field(jsonWriter, PRODUCT_NAME_LABEL, GeneralUtils.getProductName());
        } catch (IOException e) {
 * You may obtain a copy of the License at
                    jsonWriter.endObject();
                JSONUtils.field(jsonWriter, PRODUCT_VERSION_LABEL, GeneralUtils.getPlainVersion());
 * Licensed under the Apache License, Version 2.0 (the "License");
    private List<DriverDescriptor> getSupportedDBInstances() {
import com.google.gson.Strictness;
            .filter(Objects::nonNull)
        List<DriverDescriptor> supportedDataBases = new ArrayList<>();
    description = "Show list of supported database drivers in json format.")
            .map(path -> path.toAbsolutePath().toString())
        if (drivers.isEmpty()) {
            }
        return supportedDataBases;
    private static final String DB_REQUIRE_DOWNLOAD_LABEL = "download"; //$NON-NLS-1$
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
import java.io.Writer;
        for (DataSourceProviderDescriptor providerDescriptor : dataSourceProviders) {
import org.jkiss.code.NotNull;
            .findAny().isEmpty();
    private static final String DB_NAME_LABEL = "name"; //$NON-NLS-1$
 * limitations under the License.
    private static final String PRODUCT_ID_LABEL = "id"; //$NON-NLS-1$

public class DataBaseInfoHandler extends CLIAbstractSubcommand {
                supportedDataBases.add(driverDescriptor);
    private static final String DB_ADITIONAL_FEATURE_LABEL = "pro"; //$NON-NLS-1$
import com.google.gson.Gson;
        .setStrictness(Strictness.LENIENT)
 * See the License for the specific language governing permissions and
import java.nio.file.Files;
        }
        }
    private static final String PRODUCT_EDITION_LABEL = "edition"; //$NON-NLS-1$
                jsonWriter.endObject();
import java.util.Collections;
                jsonWriter.name(DATABASES_LABEL);

    private static final String DB_EMBEDDED_LABEL = "embedded"; //$NON-NLS-1$
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
 *     http://www.apache.org/licenses/LICENSE-2.0
                jsonWriter.setIndent(JSONUtils.DEFAULT_INDENT);

                jsonWriter.endArray();
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 */
                        JSONUtils.field(jsonWriter, DB_REQUIRE_DOWNLOAD_LABEL, Boolean.TRUE);
@CommandLine.Command(name = "database-driver-list", aliases = {"-database-driver-list", "-databaseList"},
    private String directory;
        if (!path.toFile().exists()) {
    private static final String PRODUCT_NAME_LABEL = "name"; //$NON-NLS-1$
            }
    private static final String PRODUCT_DESCRIPTION_LABEL = "description"; //$NON-NLS-1$
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
 * DBeaver - Universal Database Manager
        }
        publishDataBaseInfo(path.resolve(OUTPUT_DATABASES_JSON));
            .stream()
/*
        return driver.getDriverLibraries()
                    }
 *
import java.nio.file.Path;
 *
import com.google.gson.GsonBuilder;
        List<DriverDescriptor> drivers = getSupportedDBInstances();
import java.util.Objects;
import org.eclipse.core.runtime.Platform;

                    if (isRequireToDownload(driver)) {
    private static final String DATABASES_LABEL = "databases"; //$NON-NLS-1$
                JSONUtils.field(jsonWriter, PRODUCT_EDITION_LABEL, Platform.getProduct().getProperty("appEdition")); //$NON-NLS-1$

import org.jkiss.dbeaver.Log;
package org.jkiss.dbeaver.ui.app.standalone.cli;
                jsonWriter.beginObject();
                jsonWriter.beginArray();
    }

    private static final String PRODUCT_VERSION_LABEL = "version"; //$NON-NLS-1$
            log.error(e);
                for (DriverDescriptor driver : drivers) {
    public void run() {
        .serializeNulls()
                }
        Collections.sort(supportedDataBases, (DriverDescriptor o1, DriverDescriptor o2) -> o1.getName().compareTo(o2.getName()));
                        JSONUtils.field(jsonWriter, DB_ADITIONAL_FEATURE_LABEL, Boolean.TRUE);
import org.jkiss.dbeaver.utils.GeneralUtils;
            return;
        .create();
import java.nio.charset.StandardCharsets;
    @CommandLine.Parameters(index = "0", description = "Export directory", arity = "1")
        }
                    if (isExtendedInPro(driver)) {
    }
 * Unless required by applicable law or agreed to in writing, software
                    if (driver.isEmbedded()) {
                        JSONUtils.field(jsonWriter, DB_EMBEDDED_LABEL, Boolean.TRUE);
import org.jkiss.dbeaver.model.cli.CLIAbstractSubcommand;
            return;
        }
        Path path = Path.of(directory);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        DataSourceProviderRegistry dataSourceRegistry = DataSourceProviderRegistry.getInstance();
                    }
 * you may not use this file except in compliance with the License.
                    jsonWriter.beginObject();
    @Override
    private boolean isExtendedInPro(DriverDescriptor driver) {
