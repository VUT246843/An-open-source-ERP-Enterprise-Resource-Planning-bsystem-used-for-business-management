                                        databaseObjects.add((BASE_OBJECT) object);
                if (getProject() == null) {
    }
            if (!CommonUtils.isEmpty(databaseObjectList)) {
    public String getToolUserName() {
    }

        if (project == null) {

import java.util.Map;


                                    DBSObject object = DBUtils.findObjectById(monitor, finalProject, objectId);
                    });
                            monitor.done();
        this.toolUserName = toolUserName;
    }
import org.jkiss.dbeaver.DBException;
            try {
        }
                    if (project == null) {
    }
            query = outputFolder.substring(queryStartPos);
import org.jkiss.dbeaver.runtime.encode.SecuredPasswordEncrypter;
import org.jkiss.dbeaver.model.struct.DBSObject;
                        project = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
import org.jkiss.dbeaver.runtime.DBWorkbench;
    public void loadSettingsFromInput(@NotNull List<BASE_OBJECT> inputObjects, @NotNull Map<String, Object> options) {
import org.jkiss.dbeaver.model.connection.DBPNativeClientLocation;
            propertyMap.put("databaseObjects", objectList);
    protected AbstractNativeToolSettings(@NotNull DBPProject project) {
        databaseObjects.addAll(inputObjects);
    private void setProject(@Nullable DBPProject project) {
            List<String> databaseObjectList = ((DBPPreferenceMap) preferenceStore).getObject("databaseObjects");
import java.util.List;
            // Save input objects to task properties
    }
            setProject(dataSourceContainer == null ? null : dataSourceContainer.getProject());
        if (!outputFolder.endsWith("/")) outputFolder += "/";
    }
    private final List<BASE_OBJECT> databaseObjects = new ArrayList<>();
 * You may obtain a copy of the License at
    public void setDataSourceContainer(DBPDataSourceContainer dataSourceContainer) {
import org.jkiss.code.Nullable;

                if (!CommonUtils.isEmpty(toolUserName)) toolUserName = encryptor.decryptString(toolUserName);
 * See the License for the specific language governing permissions and
                    runnableContext.run(true, true, monitor -> {
    public void loadSettings(DBRRunnableContext runnableContext, DBPPreferenceStore preferenceStore) throws DBException {
            dataSourceContainer = null;
                            log.error("Can't find project '" + projectName + "' for tool configuration");
        if (databaseObjects.isEmpty()) {
                if (!CommonUtils.isEmpty(toolUserPassword)) toolUserPassword = encrypter.decrypt(toolUserPassword);
                            for (String objectId : databaseObjectList) {
        }
        if (dataSourceContainer == null && !CommonUtils.isEmpty(databaseObjects)) {
                } else {
        return null;
    public void setToolUserName(String toolUserName) {

    private String clientHomeName;
    private String extraCommandArgs;
        this.toolUserPassword = toolUserPassword;
                if (!CommonUtils.isEmpty(toolUserPassword)) toolUserPassword = encryptor.decryptString(toolUserPassword);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            } catch (Exception ignored) {
            Collections.addAll(cmd, extraCommandArgs.split(" "));
    }

        if (query != null) {
                                monitor.worked(1);
    public DBPNativeClientLocation findNativeClientHome(String clientHomeId) {
        return project;
        } else {
    private String toolUserName;
    }
                        }
        String query = null;

                DBPProject finalProject = dataSourceContainer.getProject();
                    propertyMap.put("tool.password", encryptor.encryptString(toolUserPassword));
            }
    }
        }
        }

import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;


import java.lang.reflect.InvocationTargetException;
                        .getProject(projectName);


    }
                }
    }
    }
import org.jkiss.dbeaver.model.DBUtils;
 * limitations under the License.
                if (!CommonUtils.isEmpty(toolUserName)) {
            BASE_OBJECT baseObject = databaseObjects.get(0);
    }


import java.util.Collections;

    public String getClientHomeName() {

            try {
    public void setExtraCommandArgs(String extraCommandArgs) {
        if (preferenceStore instanceof DBPPreferenceMap && dataSourceContainer != null) {
    public String getToolUserPassword() {
                            }

 *     http://www.apache.org/licenses/LICENSE-2.0
            toolUserName = preferenceStore.getString("tool.user");
    }
                                    throw new DBException("Can't find database object '" + objectId + "' in project '" + finalProject.getName() + "' for task configuration", e);
 */
    }
    private DBPDataSourceContainer dataSourceContainer;
import java.io.PrintStream;
        this.project = project;
                    String projectName = preferenceStore.getString("project");

        if (!CommonUtils.isEmptyTrimmed(extraCommandArgs)) {

        return databaseObjects;

 * Copyright (C) 2010-2025 DBeaver Corp and others
            for (BASE_OBJECT object : databaseObjects) {
 *

        if (dataSourceContainer == null) {
        extraCommandArgs = preferenceStore.getString(PROP_NAME_EXTRA_ARGS);
    }
import org.jkiss.dbeaver.Log;

    public void setToolUserPassword(String toolUserPassword) {

                }
            }
            dataSourceContainer = baseObject instanceof DBPDataSourceContainer ?
                } catch (InvocationTargetException e) {
        }
import org.jkiss.dbeaver.model.task.DBTTaskSettingsInput;
                                }
    @Nullable
        this.dataSourceContainer = dataSourceContainer;
    private String toolUserPassword;
        this.clientHomeName = clientHome == null ? null : clientHome.getName();

    protected AbstractNativeToolSettings() {
                objectList.add(DBUtils.getObjectFullId(object));
    @Override
    }


        if (clientHomeName != null) {
                        try {

}

        preferenceStore.setValue(PROP_NAME_EXTRA_ARGS, extraCommandArgs);
 * Unless required by applicable law or agreed to in writing, software
                    }
    private DBPProject project;
                }
    }
        // Check URI query
    public DBPProject getProject() {

        }
 * distributed under the License is distributed on an "AS IS" BASIS,
                                monitor.subTask("Load " + objectId);
            dataSourceContainer = databaseObjects.get(0).getDataSource().getContainer();
 * Licensed under the Apache License, Version 2.0 (the "License");
            outputFolder = outputFolder.substring(0, queryStartPos);
        }
                final SecuredPasswordEncrypter encrypter = new SecuredPasswordEncrypter();

        return extraCommandArgs;
        int queryStartPos = outputFolder.lastIndexOf("?");


            }
        if (preferenceStore instanceof DBPPreferenceMap) {
    }
        }
    public List<BASE_OBJECT> getDatabaseObjects() {
                if (!CommonUtils.isEmpty(toolUserPassword)) {
                (DBPDataSourceContainer) baseObject : baseObject.getDataSource().getContainer();
    
        this.project = project;

    public PrintStream getLogWriter() {
        }
                        .getWorkspace()
    public DBPDataSourceContainer getDataSourceContainer() {
        return toolUserPassword;

import org.jkiss.utils.CommonUtils;
                    // Ignore
            String dsID = preferenceStore.getString("dataSource");
                        if (!CommonUtils.isEmpty(projectName)) {
        return clientHomeName;
                DBSValueEncryptor encryptor = getProject().getValueEncryptor();
    public void saveSettings(DBRRunnableContext runnableContext, DBPPreferenceStore preferenceStore) {
    private final String PROP_NAME_EXTRA_ARGS = "tools.wizard." + getClass().getSimpleName() + ".extraArgs";
        preferenceStore.setValue("project", getProject().getName());
        return false;
                if (!CommonUtils.isEmpty(toolUserName)) toolUserName = encrypter.decrypt(toolUserName);

    @Nullable
    }
 * you may not use this file except in compliance with the License.

    public boolean isMutatingTask() {
    private static final Log log = Log.getLog(AbstractNativeToolSettings.class);
                        }
    private DBPNativeClientLocation clientHome;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceMap;
                        } catch (Exception e) {
                dataSourceContainer = getProject().getDataSourceRegistry().getDataSource(dsID);
                    propertyMap.put("tool.user", "");
                                    }
            if (!CommonUtils.isEmpty(dsID)) {
        return toolUserName;
        this.extraCommandArgs = extraCommandArgs;

            }
    }
    @NotNull

        }
                    setProject(project);
    @Nullable
                } else {
    }

        return dataSourceContainer;
                    DBPProject project = CommonUtils.isEmpty(projectName) ? null : DBWorkbench.getPlatform()
public abstract class AbstractNativeToolSettings<BASE_OBJECT extends DBSObject>

    }
        this.clientHome = clientHome;
            Map<String, Object> propertyMap = ((DBPPreferenceMap) preferenceStore).getPropertyMap();
        }
        if (preferenceStore instanceof DBPPreferenceMap) {
                    propertyMap.put("tool.password", "");
    public String getExtraCommandArgs() {
                try {
                log.debug(e);
    protected String makeOutFilePath(String outputFolder, String outputFileName) {
            toolUserPassword = preferenceStore.getString("tool.password");
    private PrintStream logWriter = System.out;

        if (queryStartPos != -1) {
    protected void updateDataSourceContainer() {
                // Backward compatibility
package org.jkiss.dbeaver.tasks.nativetool;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.dbeaver.model.secret.DBSValueEncryptor;

                                } catch (Throwable e) {
                                    if (object != null) {
        String outFile = outputFolder + outputFileName;
/*
                                try {
        this.logWriter = logWriter;
                                        dataSourceContainer = object instanceof DBPDataSourceContainer ? (DBPDataSourceContainer) object : object.getDataSource().getContainer();
import org.jkiss.dbeaver.model.task.DBTTaskSettings;
        }
            outFile += query;
        clientHomeName = preferenceStore.getString("clientHomeName");
 *
                DBSValueEncryptor encryptor = getProject().getValueEncryptor();
import org.jkiss.code.NotNull;
                        monitor.beginTask("Load database object list", databaseObjectList.size());
 * DBeaver - Universal Database Manager
                    propertyMap.put("tool.user", encryptor.encryptString(toolUserName));
                    throw new DBException("Error loading objects configuration", e.getTargetException());
    @Nullable
                } catch (InterruptedException e) {
 *
import java.util.ArrayList;
    public void setLogWriter(PrintStream logWriter) {
    public DBPNativeClientLocation getClientHome() {
            } catch (Exception e) {
    implements DBTTaskSettings, DBTTaskSettingsInput<BASE_OBJECT> {
            }
        return logWriter;
    }
    }
        if (dataSourceContainer != null) {
    public void setClientHome(@Nullable DBPNativeClientLocation clientHome) {
            preferenceStore.setValue("clientHomeName", clientHomeName);
            List<String> objectList = new ArrayList<>();
        return clientHome;
    public void addExtraCommandArgs(List<String> cmd) {

        return outFile;
    }
            preferenceStore.setValue("dataSource", dataSourceContainer.getId());
import org.jkiss.dbeaver.model.app.DBPProject;

                            throw new InvocationTargetException(e);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                        } finally {
                }
