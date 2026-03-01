    private Status status;
import org.jkiss.dbeaver.DBException;
                                 boolean persisted) {
    @Override
import org.jkiss.code.NotNull;
    public Status getStatus() {
import java.util.Map;

}

    public DamengTableConstraint(GenericTableBase table, String name, DBSEntityConstraintType constraintType, JDBCResultSet dbResult,
    public long getObjectId() {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPScriptObject;

        return status;
public class DamengTableConstraint extends GenericUniqueKey implements DBPObjectWithLongId, DBSTableCheckConstraint, DBPScriptObject {
        this.checkInfo = expression;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
 * you may not use this file except in compliance with the License.
 * Dameng Constraint
 * You may obtain a copy of the License at
/**
import org.jkiss.dbeaver.model.struct.rdb.DBSTableCheckConstraint;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
 * See the License for the specific language governing permissions and
        return checkInfo;

 *
import java.sql.Timestamp;
        return id;
        this.id = JDBCUtils.safeGetLong(dbResult, DamengConstants.ID);
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
    @Override
    @Property(viewable = true, order = 1)

 */
    private Timestamp createTime;

    }
    }

    public Timestamp getCreateTime() {
import org.jkiss.dbeaver.model.meta.Property;
        this.checkInfo = JDBCUtils.safeGetString(dbResult, "CHECKINFO");

    @Property(viewable = true, order = 7)
        return DamengUtils.getDDL(monitor, this, DamengConstants.ObjectType.CONSTRAINT, this.getTable().getSchemaName());
        return createTime;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * Unless required by applicable law or agreed to in writing, software
    private long id;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public String getCheckConstraintDefinition() {
    public void setCheckConstraintDefinition(String expression) {

 * @since 2024/10/13
    }
import org.jkiss.dbeaver.ext.dameng.DamengConstants;
/*
    @NotNull
        this.status = "Y".equals(JDBCUtils.safeGetString(dbResult, "VALID")) ? Status.VALID : Status.INVALID;
        INVALID,
 *
    @Override



    public enum Status {
 * DBeaver - Universal Database Manager
        this.createTime = JDBCUtils.safeGetTimestamp(dbResult, DamengConstants.CRTDATE);
 * limitations under the License.
package org.jkiss.dbeaver.ext.dameng.model;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    @Property(viewable = true, order = 6)
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        super(table, name, null, constraintType, persisted);
import org.jkiss.dbeaver.ext.generic.model.GenericUniqueKey;
        VALID,
    @Override
    @Property(viewable = true, order = 5)
    }

 * @author Baishengkai

    private String checkInfo;
    }

 */
 *
import org.jkiss.dbeaver.model.DBPObjectWithLongId;
