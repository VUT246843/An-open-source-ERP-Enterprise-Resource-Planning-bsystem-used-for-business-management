        return function == null ? null : function.getReturnType();
        return name;
 * Unless required by applicable law or agreed to in writing, software
            schema,
public class PostgreAggregate implements PostgreObject, DBPOverloadedObject, DBPObjectWithLazyDescription {
            false);
    }

    public DBSObject getParentObject() {
        return schema.getDatabase();
    @NotNull


    private long oid;
import org.jkiss.code.NotNull;
        throws SQLException, DBException {
    public PostgreProcedure getFunction() throws DBException {
        return schema.getDataSource();
            function.getInputParameters(),
    @NotNull
        throws SQLException, DBException {
    @Property(viewable = true, order = 10)
        }


    }
    @Override
    private String name;
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 100)

    @Override
    @Property(viewable = true, order = 3)
        return oid;
    }
    }
    @Override
        this.function = schema.getProcedure(monitor, this.oid);
 * Copyright (C) 2010-2025 DBeaver Corp and others
            true,
    @Property(viewable = false, order = 80)
        this.oid = JDBCUtils.safeGetLong(dbResult, "proc_oid");

    }
        return result;

    @Property(viewable = true, order = 1)
    }
 */
    public boolean isPersisted() {
    @Override
    public long getObjectId() {

    private boolean persisted;
            return null;
import org.jkiss.dbeaver.model.DBPObjectWithLazyDescription;
    }
import org.jkiss.dbeaver.model.meta.Property;
    public PostgreDataSource getDataSource() {
    public PostgreAggregate(DBRProgressMonitor monitor, PostgreSchema schema, ResultSet dbResult)
    @Override

 * DBeaver - Universal Database Manager
    @Property(viewable = true, order = 2)
 * limitations under the License.

    }

import org.jkiss.dbeaver.DBException;
/*
    }
    public String getOverloadedName() {

 * You may obtain a copy of the License at
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.DBSObject;
import java.util.ArrayList;
 * you may not use this file except in compliance with the License.
    @Override
    public PostgreDatabase getDatabase() {
    @Override
        this.persisted = true;

        this.name = JDBCUtils.safeGetString(dbResult, "proc_name");
    private final PostgreSchema schema;
    @NotNull
import java.sql.ResultSet;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPOverloadedObject;
    public List<PostgreDataType> getInputTypes(DBRProgressMonitor monitor) throws DBException {
    @Override
    }
    private PostgreProcedure function;
    @NotNull
        for (PostgreProcedureParameter param : function.getInputParameters()) {
        return persisted;

        return null;
        return function == null ? name : PostgreProcedure.makeOverloadedName(
        return function;
        this.loadInfo(monitor, dbResult);

}

    public PostgreDataType getOutputType(DBRProgressMonitor monitor) throws DBException {
        if (function == null) {

    @Override

 * distributed under the License is distributed on an "AS IS" BASIS,
    public String getDescription(@NotNull DBRProgressMonitor monitor) throws DBException {

        return schema;
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    private void loadInfo(DBRProgressMonitor monitor, ResultSet dbResult)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
import org.jkiss.dbeaver.model.meta.PropertyLength;

    {
            result.add(param.getParameterType());
        return function == null ? null : function.getDescription();
            name,
 * PostgreAggregate
import java.util.List;
        this.schema = schema;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
        List<PostgreDataType> result = new ArrayList<>();
    public String getName()
 *
            false,
 *
package org.jkiss.dbeaver.ext.postgresql.model;
 */
 * See the License for the specific language governing permissions and

 *
    }
import java.sql.SQLException;
    public String getDescription() {
/**
