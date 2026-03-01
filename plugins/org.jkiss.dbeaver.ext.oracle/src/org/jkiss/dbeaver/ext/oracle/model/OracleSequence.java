        super(schema, name, false);
        this.lastValue = JDBCUtils.safeGetBigDecimal(dbResult, "LAST_NUMBER");
        if (getIncrementBy() != null) {




        public String getTypeName() {
    }
        public Kind getKind() {
    {
            @Override
    {
    }
    private long cacheSize;
        @NotNull
    {
    private boolean flagOrder;

        this.flagCycle = false;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
package org.jkiss.dbeaver.ext.oracle.model;
        return minValue;
        private final DBSTypeDescriptor valueTypeDescriptor = new DBSTypeDescriptor() {
import java.util.Collection;
    private String sourceText;

    public void setMaxValue(BigDecimal maxValue) {
            public String getTypeName() {
    }

    @NotNull
    @Property(viewable = true, editable = true, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
            }
    }
}
        return flagCycle;
    private boolean flagCycle;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
        return this.valueType;


import java.util.Map;
    {
    public void setMinValue(BigDecimal minValue) {

        return sb.toString();
    public boolean isOrder()
 * Unless required by applicable law or agreed to in writing, software
            sb.append("NOCYCLE ");
            return this.members;
        if (isCycle()) {
            this.valueType = this.getSchema().getDataSource().getLocalDataType(OracleConstants.TYPE_NUMBER);
            return this.members.stream()

    }
        }
        } else {
    }
        );
                return OracleSequence.this.getValueType().getName();
    {
            return OracleSequence.this.getName();
    private class OracleSequenceTypeDescriptor implements DBSTypeDescriptor {
        return super.getName();

        public DBSTypeDescriptor findCompositeMember(@NotNull DBRProgressMonitor monitor, @NotNull String name) throws DBException {
    {

        } else {
        this.minValue = minValue;
        }
        }
            new CompositeMemberInfo(OracleConstants.SEQ_NEXTVAL, valueTypeDescriptor)
    public void setCycle(boolean flagCycle) {
    @Override
            public DBSDataType getUnderlyingType() {
    @Property(viewable = true, editable = true, updatable = true, order = 6)
    @Property(viewable = true, editable = true, updatable = true, order = 4)
 * See the License for the specific language governing permissions and
    @Property(viewable = true, editable = true, updatable = true, order = 2)

 *
        this.minValue = JDBCUtils.safeGetBigDecimal(dbResult, "MIN_VALUE");
            return Kind.COMPOSITE;
import org.jkiss.dbeaver.model.DBPScriptObject;
    public String getName()
        }
    @Property(viewable = true, editable = true, updatable = true, order = 8)
    }
    public void setCacheSize(long cacheSize) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    private BigDecimal minValue;
        StringBuilder sb = new StringBuilder();
    public OracleDataType getValueType() {
            sb.append("ALTER SEQUENCE ");
/**
        @Nullable

    }

        @Override
    }
    }
    private DBSTypeDescriptor typeDescriptor = null;
import java.sql.ResultSet;
        }
        if (isOrder()) {
            sb.append("INCREMENT BY ").append(getIncrementBy()).append(" ");
    }
        };
        this.incrementBy = incrementBy;
        this.lastValue = new BigDecimal(0);
    public boolean isCycle()
        this.flagCycle = flagCycle;
        if (forUpdate) {
            }
        if (valueType == null) {
        this.incrementBy = JDBCUtils.safeGetLong(dbResult, "INCREMENT_BY");
        private final List<CompositeMemberInfo> members = List.of(

            sb.append("CREATE SEQUENCE ");
        if (sourceText == null) {
        }
        this.flagOrder = JDBCUtils.safeGetBoolean(dbResult, "ORDER_FLAG", OracleConstants.RESULT_YES_VALUE);
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        } else {

    @Nullable
 *
    private long incrementBy;
import org.jkiss.code.Nullable;
                .filter(m -> m.name().equalsIgnoreCase(name))
        this.cacheSize = JDBCUtils.safeGetLong(dbResult, "CACHE_SIZE");
            sb.append("CYCLE ");
        }
    public Long getIncrementBy()
 *     http://www.apache.org/licenses/LICENSE-2.0
            this.typeDescriptor = new OracleSequenceTypeDescriptor();

        }
        if (getMinValue() != null) {
        } else {
        this.cacheSize = 0;
        this.flagCycle = JDBCUtils.safeGetBoolean(dbResult, "CYCLE_FLAG", OracleConstants.RESULT_YES_VALUE);
    public DBSTypeDescriptor getTypeDescriptor(@NotNull DBRProgressMonitor monitor) {

import org.jkiss.dbeaver.DBException;
        this.maxValue = null;
import org.jkiss.dbeaver.model.struct.DBSTypeDescriptor;


/*
    public BigDecimal getLastValue()

 */
    @Override
 */
        this.maxValue = JDBCUtils.safeGetBigDecimal(dbResult, "MAX_VALUE");

    public OracleSequence(OracleSchema schema, String name) {
import java.math.BigDecimal;
import org.jkiss.code.NotNull;

        this.maxValue = maxValue;
    private OracleDataType valueType = null;
    }
        this.flagOrder = flagOrder;
import org.jkiss.dbeaver.model.struct.DBSDataType;
            sb.append("ORDER ");
    {

        @Override
        public Collection<CompositeMemberInfo> getCompositeMembers(@NotNull DBRProgressMonitor monitor) throws DBException {
 * limitations under the License.

        @Override
            sb.append("NOCACHE ");
        return incrementBy;
    }
        return flagOrder;
    @Property(viewable = true, editable = true, updatable = true, order = 7)
        this.lastValue = lastValue;
    private BigDecimal lastValue;
        if (this.typeDescriptor == null) {
        sb.append(getFullyQualifiedName(DBPEvaluationContext.DDL)).append(" ");

import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;

            sourceText = buildStatement(false);
    }
            @Nullable
    public void setIncrementBy(Long incrementBy) {
            sb.append("NOORDER ");
        return sourceText;
    }

    }
        return cacheSize;
        this.minValue = null;
    public BigDecimal getMaxValue()
 * distributed under the License is distributed on an "AS IS" BASIS,
        }

    public void setLastValue(BigDecimal lastValue) {

    {
    @Override

import org.jkiss.dbeaver.model.meta.Property;
        @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @NotNull
        @NotNull
        this.flagOrder = false;
        }
        }
        this.cacheSize = cacheSize;

    }
    public long getCacheSize()
        if (getMaxValue() != null) {
                return OracleSequence.this.getValueType();
        }
        if (getCacheSize() > 0) {

    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            @NotNull
 * DBeaver - Universal Database Manager

                .findFirst().map(CompositeMemberInfo::type).orElse(null);
    }
            @Override
    public OracleSequence(OracleSchema schema, ResultSet dbResult)
    @Property(viewable = true, editable = true, updatable = true, order = 5)
            new CompositeMemberInfo(OracleConstants.SEQ_CURRVAL, valueTypeDescriptor),
    public void setOrder(boolean flagOrder) {
 * You may obtain a copy of the License at
    @Property(viewable = true, editable = true, updatable = true, order = 3)
public class OracleSequence extends OracleSchemaObject implements DBSSequence, DBPScriptObject, DBSTypedObjectEx2 {
        return this.typeDescriptor;
        return maxValue;
import org.jkiss.dbeaver.model.struct.rdb.DBSSequence;
    }
        this.incrementBy = 0;
    private BigDecimal maxValue;
            sb.append("CACHE ").append(getCacheSize()).append(" ");
            sb.append("MAXVALUE ").append(getMaxValue()).append(" ");
 *
import org.jkiss.dbeaver.model.struct.DBSTypedObjectEx2;
        super(schema, JDBCUtils.safeGetString(dbResult, "SEQUENCE_NAME"), true);
        return lastValue;
 * you may not use this file except in compliance with the License.

            sb.append("MINVALUE ").append(getMinValue()).append(" ");
        }
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    public String buildStatement(boolean forUpdate) {
        }
import java.util.List;

    public BigDecimal getMinValue()


    }
 * Oracle sequence
