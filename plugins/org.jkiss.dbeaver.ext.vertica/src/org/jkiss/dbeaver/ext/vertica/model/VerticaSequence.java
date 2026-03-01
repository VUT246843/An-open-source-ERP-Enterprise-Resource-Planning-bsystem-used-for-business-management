import org.jkiss.dbeaver.model.struct.DBSObject;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) {
/*
        this.cacheCount = 25000;
import org.jkiss.code.Nullable;
    public Long getIncrementBy() {
    @Override
    @Override
    }
import java.util.Map;
        return super.getIncrementBy().longValue();
import org.jkiss.dbeaver.Log;
 * Unless required by applicable law or agreed to in writing, software
    }
        this.schema = (VerticaSchema) container.getSchema();
                ddl.append("\n\t").append(isCycle ? "" : "NO ").append("CYCLE;");
    public Long getLastValue() {
                StringBuilder ddl = new StringBuilder();
        return table;
            }
public class VerticaSequence extends GenericSequence implements GenericScriptObject, DBPRefreshableObject {
                }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        GenericTableBase table = null;

    }
import org.jkiss.dbeaver.model.meta.PropertyLength;
package org.jkiss.dbeaver.ext.vertica.model;
    @Property(viewable = true, order = 11)

    @Property(viewable = true, editable = true, updatable = true, order = 5)
 * See the License for the specific language governing permissions and
    @Property(viewable = true, order = 1)
                ddl.append("CREATE SEQUENCE ")
    }

 *
        return cacheCount;

    @Property(viewable = true, editable = true, updatable = true, order = 2)

 * DBeaver - Universal Database Manager
    @Override

    private long cacheCount;
    @Override
                    ddl.append("\n\tCACHE ").append(cacheCount);

        this.name = name;
        }
    private String name;
        super(container, name, description, lastValue, minValue, maxValue, incrementBy);
 * limitations under the License.
        this.identityTableName = identityTableName;
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;

import org.jkiss.dbeaver.model.DBPEvaluationContext;
    public Long getMinValue() {
    @Override
    }
    @NotNull
    @Property(viewable = true, editable = true, updatable = true, order = 3)
                if (getLastValue() != null) {
    @Property(viewable = true, length = PropertyLength.MULTILINE, editable = true, updatable = true, order = 10)

    public long getCacheCount() {
        return super.getMaxValue().longValue();
                source = "CREATE SEQUENCE " + getFullyQualifiedName(DBPEvaluationContext.DML);
import org.jkiss.code.NotNull;
        }
            return null;
        this.cacheCount = cacheCount;
        try {
        return name;
                    ddl.append("\n\tSTART WITH ").append(getLastValue());
 * you may not use this file except in compliance with the License.
                }



                } else {
    public void setCacheCount(long cacheCount) {
                    .append("\n\tMAXVALUE ").append(getMaxValue());
        if (CommonUtils.isEmpty(identityTableName)) {
    private static final Log log = Log.getLog(VerticaSequence.class);
 * distributed under the License is distributed on an "AS IS" BASIS,
            table = schema.getTable(monitor, identityTableName);
import org.jkiss.dbeaver.model.DBPRefreshableObject;

    @Override
 */
    @Nullable
    @Property(viewable = true, editable = true, updatable = true, order = 8)
    @Property(viewable = true, editable = true, updatable = true, order = 7)
                        .append(SQLUtils.quoteString(this, description)).append(";");
    public VerticaSequence(GenericStructContainer container, String name, String description, Number lastValue, Number minValue, Number maxValue, Number incrementBy, String identityTableName, long cacheCount, boolean isCycle) {
            log.debug("Can't find identity table", e);
    private final VerticaSchema schema;
        this.cacheCount = cacheCount;
    public void setCycle(boolean cycle) {
import org.jkiss.dbeaver.ext.generic.model.GenericScriptObject;
        this.name = name;
        return source;
                    .append("\n\tMINVALUE ").append(getMinValue())

    private String source;

    }

import org.jkiss.dbeaver.ext.generic.model.GenericSequence;
 *
    public void setDescription(String description) {
import org.jkiss.dbeaver.model.meta.Property;
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) {

                }
            if (!isPersisted()) {
        return description;
    public void setName(@NotNull String name) {

 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    }
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    }
    private boolean isCycle;
    @NotNull
        if (source == null) {
        return super.getLastValue().longValue();
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.sql.SQLUtils;
    }
    public boolean isCycle() {
    public VerticaSequence(@NotNull GenericStructContainer container, @NotNull String name) {
    }
import org.jkiss.utils.CommonUtils;
    public Long getMaxValue() {

    }
    }
    @Nullable
                    .append(getFullyQualifiedName(DBPEvaluationContext.DML))
        } catch (DBException e) {
        this.description = description;
    public String getDescription() {
                if (!CommonUtils.isEmpty(description)) {
        isCycle = cycle;
    }

}

                source = ddl.toString();
                    ddl.append("\n\nCOMMENT ON SEQUENCE ").append(getFullyQualifiedName(DBPEvaluationContext.DML)).append(" IS ")
    public String getName() {
    @Override

    private String description;
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        this.schema = (VerticaSchema) container.getSchema();
            } else {

                    .append("\n\tINCREMENT BY ").append(getIncrementBy())
    private String identityTableName;
    public GenericTableBase getIdentityTableName(DBRProgressMonitor monitor) {
        }
        this.description = description;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
        return super.getMinValue().longValue();
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
        this.isCycle = isCycle;
        return isCycle;
        source = null;
        super(container, name);

                if (cacheCount <= 1) {
import org.jkiss.dbeaver.DBException;
    @Property(viewable = true, editable = true, updatable = true, order = 4)
        return this;
                    ddl.append("\n\tNO CACHE");
