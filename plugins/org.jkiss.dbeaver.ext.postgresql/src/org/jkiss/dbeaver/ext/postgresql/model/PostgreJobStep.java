    @Property(hidden = true, editable = true, updatable = true)
    @Override
    @NotNull
        public String getName() {
        return enabled;
    private String remoteConnectionString;
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
        this.name = JDBCUtils.safeGetString(dbResult, "jstname");
        public Object[] getPossibleValues(PostgreJobStep object) {
        this.job = job;
    public void setEnabled(boolean enabled) {

        @Override
            this.name = name;
    @Property(viewable = true, editable = true, updatable = true, order = 2)

    @Override
        return job.getDatabase();
    @Property(viewable = true, editable = true, updatable = true, order = 4)
    public void setKind(@NotNull StepKind kind) {
    public void setPersisted(boolean persisted) {
    public void setName(@NotNull String name) {

        this.targetDatabase = targetDatabase;
 *
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Override
        this.remoteConnectionString = JDBCUtils.safeGetString(dbResult, "jstconnstr");


    @NotNull
        return persisted;
    }
 */
        @NotNull
    }
        }
    private ActionKind onError;
    public enum StepKind implements DBPNamedObject {

    @Property(viewable = true, editable = true, updatable = true, order = 6, listProvider = DatabaseListProvider.class)
import java.util.List;
    }
        i("Ignore");
    @NotNull
 * you may not use this file except in compliance with the License.
    private boolean persisted;
    }
    public PostgreJobStep(@NotNull PostgreJob job, @NotNull ResultSet dbResult) {
    public PostgreDatabase getTargetDatabase() {
    @NotNull

    }
        }
import org.jkiss.dbeaver.DBException;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.remoteConnectionString = remoteConnectionString;

            this.name = name;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return objects.toArray();
    }
    }
    @Override
        this.kind = CommonUtils.valueOf(StepKind.class, JDBCUtils.safeGetString(dbResult, "jstkind"));
        b("Batch");
        return job.getStepCache().refreshObject(monitor, job, this);

        return enabled ? DBSObjectState.ACTIVE : DBSObjectState.NORMAL;
        this.code = source;
        return onError;
    private String description;
    public PostgreJob getParentObject() {
    @Override
    public long getObjectId() {


    @Override
        private final String name;

    }
        return description;
        this.targetDatabase = job.getDatabase();

    }
    @Nullable
        this.persisted = true;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void setRemoteConnectionString(@NotNull String remoteConnectionString) {
    public void setDescription(@NotNull String description) {
    }
    }
    @NotNull
    private final PostgreJob job;
        return name;
        }
            final List<PostgreDatabase> objects = new ArrayList<>(object.getDataSource().getDatabases());
    public void setOnError(@NotNull ActionKind onError) {
        this.onError = ActionKind.f;
import org.jkiss.dbeaver.model.*;


        this.kind = StepKind.s;
        this.enabled = JDBCUtils.safeGetBoolean(dbResult, "jstenabled");
        s("SQL"),
    public void setTargetDatabase(@Nullable PostgreDatabase targetDatabase) {
    @Property(viewable = true, editable = true, updatable = true, order = 1)
    public boolean isPersisted() {
    @Override
    @Nullable
        return kind;
    @Override
    private final long id;
        @Override
    @Override
    public String getRemoteConnectionString() {
import org.jkiss.code.Nullable;
    @NotNull
            return false;

    public void setObjectDefinitionText(String source) {
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) {
    public static class DatabaseListProvider implements IPropertyValueListProvider<PostgreJobStep> {
    private boolean enabled;
    @NotNull

    }
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) {
    public boolean isEnabled() {
        this.onError = CommonUtils.valueOf(ActionKind.class, JDBCUtils.safeGetString(dbResult, "jstonerror"));
    }
import java.util.Map;
package org.jkiss.dbeaver.ext.postgresql.model;
 * Unless required by applicable law or agreed to in writing, software
        this.name = name;

    public PostgreJobStep(@NotNull PostgreJob job, @NotNull String name) {
 *
    }

import org.jkiss.code.NotNull;
        }
        this.persisted = persisted;
        this.id = JDBCUtils.safeGetInt(dbResult, "jstid");

    private String code;
    public enum ActionKind implements DBPNamedObject {
        this.targetDatabase = getDataSource().getDatabase(JDBCUtils.safeGetString(dbResult, "jstdbname"));
    public ActionKind getOnError() {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,


        this.code = "";
        @Nullable
        return id;
    private String name;
        }
    public String getDescription() {
        // not implemented
 * Licensed under the Apache License, Version 2.0 (the "License");
}

        f("Fail"),

import java.util.ArrayList;
    @Nullable
        this.description = description;

    public String getName() {
    }
    }
    @Override
    }
    @Property(viewable = true, editable = true, updatable = true, order = 3)
    }
    }
    private PostgreDatabase targetDatabase;
        return remoteConnectionString;
    @Override
        @NotNull

        this.description = "";
    @Override
    }


        this.id = 0;
        return job;
    public StepKind getKind() {
        this.remoteConnectionString = "";
 * DBeaver - Universal Database Manager
    public PostgreDataSource getDataSource() {
        return job.getDataSource();
    }
        StepKind(@NotNull String name) {
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
 * You may obtain a copy of the License at
            objects.add(null);
    private StepKind kind;
    }
        @Override
        this.kind = kind;
        this.persisted = false;
    public DBSObjectState getObjectState() {
        this.job = job;
    @NotNull

        s("Success"),
            return name;

import org.jkiss.dbeaver.model.struct.DBSObjectState;

    @Override
    }
import java.sql.ResultSet;
 * limitations under the License.
 *
        return targetDatabase;
 * See the License for the specific language governing permissions and
        this.enabled = true;
    @Override
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Property(viewable = true, editable = true, updatable = true, order = 7)
public class PostgreJobStep implements PostgreObject, PostgreScriptObject, DBPNamedObject2, DBPRefreshableObject, DBPSaveableObject, DBPStatefulObject {
        this.enabled = enabled;
        public boolean allowCustomValue() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        @Override
/*
        this.code = JDBCUtils.safeGetString(dbResult, "jstcode");
    public PostgreDatabase getDatabase() {
            return name;
        this.name = name;
        private final String name;

import org.jkiss.utils.CommonUtils;
    }

        this.onError = onError;

    @NotNull


        return code;

    }

import org.jkiss.dbeaver.model.meta.Property;
        ActionKind(@NotNull String name) {

    @Property(viewable = true, editable = true, updatable = true, order = 5)
        }
        this.description = JDBCUtils.safeGetString(dbResult, "jstdesc");
    }
        public String getName() {
