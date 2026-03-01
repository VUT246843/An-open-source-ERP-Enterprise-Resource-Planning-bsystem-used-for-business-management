        return new LinkedHashMap<>(contextAttributes);
        return container;
    @Override
import org.jkiss.dbeaver.model.DBPAdaptable;
    public <T> T getContextAttribute(@NotNull String attributeName) {


    @Override
    public AbstractDataSource(@NotNull DBPDataSourceContainer container) {
public abstract class AbstractDataSource implements DBPDataSource, DBSObject, DBPAdaptable {
    @NotNull
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
        return container.getName();

    @NotNull
    @Nullable
    }
    }
    private final Map<String, Object> contextAttributes = new LinkedHashMap<>();
        return container.getDescription();
package org.jkiss.dbeaver.model.impl;
 * DBeaver - Universal Database Manager
 * limitations under the License.
    }
}
    }
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        return true;
    @Override
    }

    @Override
import java.util.Map;
    public DBPDataSourceContainer getContainer() {

    }
        return null;
    public void removeContextAttribute(@NotNull String attributeName) {
    public DBPDataSource getDataSource() {
 *
        contextAttributes.remove(attributeName);
        return this;

    public <T> T getAdapter(@NotNull Class<T> adapter) {
    @SuppressWarnings("unchecked")
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
        return "datasource id=" + getContainer().getId();
/**

 *
    }
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

    }
import java.util.LinkedHashMap;
    @Override
    }
    public String getName() {
 * Unless required by applicable law or agreed to in writing, software
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override

 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBPDataSource;
    @NotNull
    public Object getDataSourceFeature(String featureId) {
    @Override
 * See the License for the specific language governing permissions and
    }
 * Abstract DataSource.
    public Map<String, ?> getContextAttributes() {
 * You may obtain a copy of the License at
    public String toString() {
    public boolean isPersisted() {
    public DBSObject getParentObject() {
    @Override


import org.jkiss.code.NotNull;
    protected final DBPDataSourceContainer container;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        this.container = container;

    public <T> void setContextAttribute(@NotNull String attributeName, @Nullable T attributeValue) {
        contextAttributes.put(attributeName, attributeValue);
    @Override
 */
        return container;
        return (T) contextAttributes.get(attributeName);
    }

import org.jkiss.code.Nullable;
    public String getDescription() {
 */


 * you may not use this file except in compliance with the License.
    @Override
    }
    }

    @Override
        return null;

