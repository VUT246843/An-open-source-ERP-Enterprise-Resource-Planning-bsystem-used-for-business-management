            properties = new LinkedHashMap<>();


 */
    public void persistConfiguration() {
package org.jkiss.dbeaver.model.virtual;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
    }
    @Override
}
        return ds == null ? null : ds.getProject();
        return CommonUtils.isEmpty(properties) ? null : (T) properties.get(name);
    public DBPDataSourceContainer getDataSourceContainer() {
import org.jkiss.code.Nullable;
    }
 * Virtual model object
    public DBPProject getProject() {

    public Map<String, Object> getProperties() {
 */
 * you may not use this file except in compliance with the License.
            this.properties = new LinkedHashMap<>(src.properties);
        return properties == null ? Collections.emptyMap() : properties;

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
public abstract class DBVObject implements DBSObject {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (properties == null) {
    private Map<String, Object> properties;
import org.jkiss.utils.CommonUtils;
    }
    }
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected void loadPropertiesFrom(@NotNull Map<String, Object> map, String elemName) {
    @NotNull
    public void setProperty(String name, @Nullable Object value) {
 *
    @Nullable
    @Override

            dataSource.persistConfiguration();
 * See the License for the specific language governing permissions and
        if (dataSource != null) {

        this.properties = null;
    }
import java.util.Map;
        if (!CommonUtils.isEmpty(src.properties)) {

            if (value == null) {
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Nullable
/*
        DBPDataSourceContainer ds = getDataSourceContainer();


        }
    @Nullable
    /**
        }
    private DBVTransformSettings transformSettings;

        properties = JSONUtils.deserializeProperties(map, elemName);
    }
        return true;
        }
            }
    protected void clearProperties() {
    }
    public DBVTransformSettings getTransformSettings() {

    }
import java.util.Collections;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.data.json.JSONUtils;


     */

    }

    protected void copyFrom(@NotNull DBVObject src) {
            properties.put(name, value);

     * Property value can be String, Number, Boolean, List or Map

    }
        DBPDataSourceContainer dataSource = getDataSourceContainer();
    }
/**
    }

        }
     * @param name property name
        return transformSettings;
        return parentObject == null ? null : parentObject.getDataSourceContainer();
        } else {
            properties.remove(name);
import org.jkiss.code.NotNull;
    public <T> T getProperty(@NotNull String name) {
                return;
        if (value == null) {
    public abstract DBVContainer getParentObject();
    public void setTransformSettings(DBVTransformSettings transformSettings) {
        this.transformSettings = transformSettings;
        DBVContainer parentObject = getParentObject();
import org.jkiss.dbeaver.model.app.DBPProject;
    static final Log log = Log.getLog(DBVObject.class);
    abstract public boolean hasValuableData();
 * You may obtain a copy of the License at


    public boolean isPersisted() {

import org.jkiss.dbeaver.Log;
import java.util.LinkedHashMap;
