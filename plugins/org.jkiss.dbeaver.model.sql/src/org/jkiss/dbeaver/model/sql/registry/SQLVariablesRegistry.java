        }
            if (configSaver != null) {

                    varDetails.put("type", v.type.name());
    private final Map<DBPDriver, List<DBCScriptContext.VariableInfo>> driverVariables = new HashMap<>();
                    varMap.put(v.name, v.value);
                    con = (DBPDataSourceContainer)so;
                    } else {
//                driverId = configName.substring(CONFIG_FILE_TYPE_DRIVER.length() + 1);
            if (!configName.endsWith(CONFIG_FILE_SUFFIX)) {
        try (Stream<Path> stream = Files.list(configLocation)) {
        }
/*

import org.eclipse.core.runtime.IStatus;
                vars.addAll(variables);
                    this.connectionVariables.put(dataSourceId, variables);
import org.jkiss.dbeaver.model.data.json.JSONUtils;
 *
}
        } catch (IOException e) {
                Path configFile = configLocation.resolve(fileName);
    public static final String CONFIG_FILE_TYPE_CONNECTION = "con"; //$NON-NLS-1$
import org.jkiss.dbeaver.model.exec.DBCScriptContext;
            }
        } catch (IOException e) {
        }
 *
    }
    public static final String CONFIG_FILE_SUFFIX = ".json"; //$NON-NLS-1$
                } else if (dataSourceId != null) {
                            entry.getKey(),
import java.nio.file.Files;
        }
                            CommonUtils.valueOf(DBCScriptContext.VariableType.class, type, DBCScriptContext.VariableType.VARIABLE));
            }
        }
    }
                variables = connectionVariables.get(con.getId());
import org.jkiss.dbeaver.Log;
            return Status.OK_STATUS;
                variables = driverVariables.get(driver);
    private Path getConfigLocation() {
 * limitations under the License.
                List<DBCScriptContext.VariableInfo> variables = new ArrayList<>();
                        this.driverVariables.put(driver, variables);
                    DBCScriptContext.VariableInfo variableInfo;
        .serializeNulls()
        try (InputStream is = Files.newInputStream(file)) {
                    } else {
            log.error(e);
import org.jkiss.dbeaver.model.connection.DBPDriver;
            if (driver != null && !saveLock.contains(driver)) saveLock.add(driver);
        }
                    @Nullable DBPDataSourceContainer dataSource)
    private static final Gson CONFIG_GSON = new GsonBuilder()
            List<Object> toSave;
        if (variables == null) {
import java.nio.charset.StandardCharsets;
import org.jkiss.utils.CommonUtils;
//            String driverId = null, conId = null;
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        return variables == null ? Collections.emptyList() : new ArrayList<>(variables);


//            } else if (configName.startsWith(CONFIG_FILE_TYPE_CONNECTION)) {

                            value,
        Path configLocation = getConfigLocation();
        Path[] configFiles;
        ConfigSaver() {
            if (driver != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        private void flushConfig(List<Object> toSave) {
            if (dataSource != null && !saveLock.contains(dataSource)) saveLock.add(dataSource);
                fileName = CommonUtils.escapeFileName(fileName);
                        variableInfo = new DBCScriptContext.VariableInfo(
                vars.addAll(variables);

        if (registry == null) {
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
        List<DBCScriptContext.VariableInfo> variables = driverVariables.get(driver);
            }

                            DBCScriptContext.VariableType.VARIABLE);
                            entry.getValue(),
    private class ConfigSaver extends AbstractJob {
import java.io.InputStreamReader;
                map.put("datasource", con.getId());
        @Nullable DBPDriver driver,
            } else {
                    if (entry.getValue() instanceof Map) {
            configSaver = new ConfigSaver();
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

//            }

import java.nio.file.Path;
                if (driverId != null) {
//                conId = configName.substring(CONFIG_FILE_TYPE_DRIVER.length() + 1);
        } else if (driver != null) {

import org.jkiss.code.Nullable;
                        String type = JSONUtils.getString(valueMap, "type");
                .filter(f -> f.getFileName().toString().startsWith(CONFIG_FILE_PREFIX))
        for (Path configFile : configFiles) {
                            log.debug("Invalid variable declaration (" + entry.getKey() + ")");
                }
                    return;
            }

                    fileName = CONFIG_FILE_PREFIX + CONFIG_FILE_TYPE_DRIVER + "-" + driver.getFullId() + CONFIG_FILE_SUFFIX;
            synchronized (saveLock) {
                    fileName = CONFIG_FILE_PREFIX + CONFIG_FILE_TYPE_CONNECTION + "-" + ((DBPDataSourceContainer) so).getId() + CONFIG_FILE_SUFFIX;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import com.google.gson.GsonBuilder;
    {
        .create();

                        variableInfo = new DBCScriptContext.VariableInfo(
            List<DBCScriptContext.VariableInfo> vars = connectionVariables.get(dataSource.getId());

import com.google.gson.Gson;

import org.jkiss.dbeaver.model.sql.internal.SQLModelActivator;
            if (vars == null) {
import java.io.InputStream;
    public List<DBCScriptContext.VariableInfo> getDriverVariables(DBPDriver driver) {

                } else {
            String configName = configFile.getFileName().toString();

                Map<String, Object> map = JSONUtils.parseMap(CONFIG_GSON, r);
                DBPDriver driver = null;
        }
                saveConfigToFile(configFile, driver, con);
//                continue;
    @NotNull
//                for (DBCScriptContext.VariableInfo v : variables) {
            setSystem(true);
    }
    private void loadVariables() {
                map.put("driver", driver.getFullId());

                } else {
            registry.loadVariables();
public class SQLVariablesRegistry {
import org.jkiss.dbeaver.utils.RuntimeUtils;
    public static final String VARIABLES_STORE_DIR = "variables";
                Map<String, Object> varSrc = JSONUtils.getObject(map, "variables");
                String driverId = JSONUtils.getString(map, "driver");
        .setStrictness(Strictness.LENIENT)
                if (so instanceof DBPDriver) {
        }
package org.jkiss.dbeaver.model.sql.registry;
 * You may obtain a copy of the License at
            map.put("variables", varMap);
        if (dataSource != null) {
        }
            configFiles = stream
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
        return result;
    public void updateVariables(
            }
                return;
 */
        saveConfig(driver, dataSource);
            if (!Files.exists(configLocation)) {
    private SQLVariablesRegistry() {
        List<DBCScriptContext.VariableInfo> variables = connectionVariables.get(dataSource);
                    variables.add(variableInfo);
            try (Reader r = new InputStreamReader(is, StandardCharsets.UTF_8)) {
import com.google.gson.Strictness;

 * you may not use this file except in compliance with the License.
    private ConfigSaver configSaver;
                saveLock.clear();
    }
            } else {
                            continue;
    private static SQLVariablesRegistry registry;
            flushConfig(toSave);
                connectionVariables.put(dataSource.getId(), new ArrayList<>(variables));

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    varDetails.put("value", v.value);
                        }
        return RuntimeUtils.getPluginStateLocation(SQLModelActivator.getInstance()).resolve(VARIABLES_STORE_DIR);
                String dataSourceId = JSONUtils.getString(map, "datasource");
import java.io.IOException;
        @Nullable DBPDataSourceContainer dataSource,
    @NotNull
                    DBPDriver driver = DBWorkbench.getPlatform().getDataSourceProviderRegistry().findDriver(driverId);
 * Unless required by applicable law or agreed to in writing, software
                }
        .setPrettyPrinting()
            } else {
            Map<String, Object> varMap = new LinkedHashMap<>();
                log.debug("Skip variables config: bad file extension (" + configFile + ")");
                if (v.type == DBCScriptContext.VariableType.VARIABLE) {
        @NotNull List<DBCScriptContext.VariableInfo> variables)

//                log.debug("Skip variables config: unrecognized variables target (" + configFile.getAbsolutePath() + ")");

                        Object value = valueMap.get("value");
//                }

        @NotNull
import java.io.Reader;

                    if (driver == null) {
                    continue;

        }
import java.util.*;
            registry = new SQLVariablesRegistry();
 *
//                    varMap.put(v.name, v);
    private static final Log log = Log.getLog(SQLVariablesRegistry.class);
                continue;


            } else if (con != null) {
//                Map<String, DBCScriptContext.VariableInfo> varMap = new LinkedHashMap<>();
                DBPDataSourceContainer con = null;
            }
                } else if (so instanceof DBPDataSourceContainer) {
        List<DBCScriptContext.VariableInfo> result = new ArrayList<>(variables);
            return;
        if (Files.notExists(configLocation)) {
 * See the License for the specific language governing permissions and
import java.util.stream.Stream;
                            entry.getKey(),
                String fileName;

            configSaver.schedule(1000);
            Path configLocation = getConfigLocation();
            return;
            List<DBCScriptContext.VariableInfo> vars = driverVariables.get(driver.getId());
            for (DBCScriptContext.VariableInfo v : variables) {
            if (vars == null) {
                } catch (IOException e) {
                log.debug("Both driver and connection are null");
    }
        result.addAll(getDriverVariables(dataSource.getDriver()));
            }

            }
    public static final String CONFIG_FILE_PREFIX = "sql-variables-"; //$NON-NLS-1$
import org.eclipse.core.runtime.Status;
                try {
//            configName = configName.substring(CONFIG_FILE_PREFIX.length(), configName.length() - CONFIG_FILE_SUFFIX.length());


            }
                    }
    }
//            } else {
    public List<DBCScriptContext.VariableInfo> getDataSourceVariables(DBPDataSourceContainer dataSource) {
        @Override
            return getDriverVariables(dataSource.getDriver());
                    log.error("Error creating variables storage location: " + configLocation, e);
                }
    {
                .toArray(Path[]::new);
            loadVariablesFromFile(configFile);
    private final Map<String, List<DBCScriptContext.VariableInfo>> connectionVariables = new HashMap<>();
    void saveConfig(@Nullable DBPDriver driver,
                }

 * DBeaver - Universal Database Manager
    }
                        log.debug("Driver '" + driverId + "' not found. Saved variables ignored (" + file + ")");
                configSaver.cancel();
                log.error(e);
                Files.writeString(configFile, CONFIG_GSON.toJson(map, Map.class));
            try {
            } catch (IOException e) {

    }
                }
            List<DBCScriptContext.VariableInfo> variables;


                    }
        private void saveConfigToFile(Path configFile, DBPDriver driver, DBPDataSourceContainer con) {

                    driver = (DBPDriver) so;
import org.jkiss.dbeaver.model.runtime.AbstractJob;
            }
                    Map<String, Object> varDetails = new LinkedHashMap<>();
 * Licensed under the Apache License, Version 2.0 (the "License");
            log.debug(e);
        synchronized (saveLock) {
                toSave = new ArrayList<>(saveLock);
    public static final String CONFIG_FILE_TYPE_DRIVER = "driver"; //$NON-NLS-1$
                for (Map.Entry<String, Object> entry : varSrc.entrySet()) {
                        if (value == null || type == null) {
    private void loadVariablesFromFile(Path file) {
    private final List<Object> saveLock = new ArrayList<>();
                        Map<String, Object> valueMap = (Map<String, Object>) entry.getValue();
        return registry;
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                    varMap.put(v.name, varDetails);
            super("Tab folders configuration save");
    public static synchronized SQLVariablesRegistry getInstance() {
//            if (configName.startsWith(CONFIG_FILE_TYPE_DRIVER)) {
    }
                driverVariables.put(driver, new ArrayList<>(variables));
            }
                    Files.createDirectories(configLocation);
                configSaver = null;
            for (Object so : toSave) {
            Map<String, Object> map = new LinkedHashMap<>();
