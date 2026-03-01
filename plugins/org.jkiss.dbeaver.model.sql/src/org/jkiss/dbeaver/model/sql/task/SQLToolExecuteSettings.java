import org.jkiss.dbeaver.model.task.DBTTaskSettingsInput;
 */


                        OBJECT_TYPE object = (OBJECT_TYPE) DBUtils.findObjectById(monitor, project, objectId);
    public void loadConfiguration(@NotNull DBRRunnableContext runnableContext, @NotNull Map<String, Object> config, @NotNull DBPProject project) {
import org.jkiss.code.NotNull;
    public void setObjectList(List<OBJECT_TYPE> objectList) {
                }
            Map<String, Object> objectInfo = new LinkedHashMap<>();

 *
                objectList.addAll(objList);
import java.util.LinkedHashMap;
    public void saveConfiguration(Map<String, Object> config) {
            objectInfo.put("project", obj.getDataSource().getContainer().getProject().getName());

 *
    }
            runnableContext.run(true, true, monitor -> {
                    } catch (DBException e) {
                List<OBJECT_TYPE> objList = new ArrayList<>();

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.utils.CommonUtils;
    }
        objectList.addAll(inputObjects);
                        }
        for (OBJECT_TYPE obj : objectList) {
 * limitations under the License.
        this.objectList = objectList;
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    protected SQLToolExecuteSettings() {
                    String objectId = CommonUtils.toString(objectConfig.get("objectId"));
    private List<OBJECT_TYPE> objectList = new ArrayList<>();
    private final List<Throwable> warnings = new ArrayList<>();
    public List<OBJECT_TYPE> getObjectList() {
            objectInfo.put("objectId", DBUtils.getObjectFullId(obj));
}

                        log.error("Can't find object '" + objectId + "' in project '" + project.getName() + "'");
        }
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.DBUtils;

public class SQLToolExecuteSettings<OBJECT_TYPE extends DBSObject> implements DBTTaskSettingsInput<OBJECT_TYPE> {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            objectsConfig.add(objectInfo);

        config.put("objects", objectsConfig);


        List<Map<String, Object>> objectsConfig = new ArrayList<>();
    public void loadSettingsFromInput(@NotNull List<OBJECT_TYPE> inputObjects, @NotNull Map<String, Object> options) {
    public List<Throwable> getWarnings() {
        return warnings;
 * Unless required by applicable law or agreed to in writing, software
/**
import org.jkiss.dbeaver.model.struct.DBSObject;
/*
                            objList.add(object);
                for (Map<String, Object> objectConfig : JSONUtils.getObjectList(config, "objects")) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        @Override
    private static final Log log = Log.getLog(SQLToolExecuteSettings.class);
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
import java.util.Map;
import java.util.List;
    }
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
            });
 * distributed under the License is distributed on an "AS IS" BASIS,
        try {

    }
                    }
import java.util.ArrayList;
 * SQLToolExecuteSettings
                    try {
 * DBeaver - Universal Database Manager
    }
    }
                        if (object != null) {
import org.jkiss.dbeaver.model.data.json.JSONUtils;
            // ignore
        return objectList;
        } catch (InvocationTargetException e) {
 * See the License for the specific language governing permissions and


package org.jkiss.dbeaver.model.sql.task;
        } catch (InterruptedException e) {
import org.jkiss.dbeaver.Log;
import java.lang.reflect.InvocationTargetException;
 */
            log.error(e.getTargetException());
 * you may not use this file except in compliance with the License.
                        warnings.add(e);
