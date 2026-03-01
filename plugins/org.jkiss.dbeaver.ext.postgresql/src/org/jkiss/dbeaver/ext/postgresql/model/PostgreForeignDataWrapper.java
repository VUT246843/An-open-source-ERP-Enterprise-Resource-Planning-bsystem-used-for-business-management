 *
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
        return getDatabase().getRoleById(monitor, ownerId);
 */

    private void loadInfo(ResultSet dbResult)

    }
    @Property(viewable = true, order = 2)
    public PostgreForeignDataWrapper(PostgreDatabase database, ResultSet dbResult)
 * limitations under the License.
import org.jkiss.dbeaver.model.meta.Property;
                "-- DROP FOREIGN DATA WRAPPER " + getName() + ";\n\n" +

    }
 * DBeaver - Universal Database Manager
    @Override
    @Override
    public PostgreProcedure getHandler(DBRProgressMonitor monitor) throws DBException {

 *     http://www.apache.org/licenses/LICENSE-2.0
import java.sql.ResultSet;

        this.oid = JDBCUtils.safeGetLong(dbResult, "oid");
 * See the License for the specific language governing permissions and
/*
        throws SQLException
 * Unless required by applicable law or agreed to in writing, software
        this.name = JDBCUtils.safeGetString(dbResult, "fdwname");
}
 * You may obtain a copy of the License at
    @Property(viewable = false, order = 10)
    private long validatorProcId;
    }
    private long handlerSchemaId;
 *
    public void setObjectDefinitionText(String sourceText) throws DBException {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
        return
    private long ownerId;

        return name;
        return options;
        this.handlerSchemaId = JDBCUtils.safeGetLong(dbResult, "handler_schema_id");

    public String[] getOptions() {
    {
    @NotNull
        this.options = PostgreUtils.safeGetStringArray(dbResult, "fdwoptions");
        return getDatabase().getProcedure(monitor, handlerSchemaId, handlerProcId);
    public PostgreRole getOwner(DBRProgressMonitor monitor) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    private String name;
    @Override
import java.sql.SQLException;
    public String getName()
    }

    {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;


    }
    private String[] options;

public class PostgreForeignDataWrapper extends PostgreInformation implements PostgreScriptObject {
    }
                "OPTIONS " + PostgreUtils.getOptionsString(this.options);

    @Override
    @Property(viewable = false, order = 10)
        PostgreProcedure validator = getValidator(monitor);
    private long oid;
 *
        PostgreProcedure handler = getHandler(monitor);

        this.ownerId = JDBCUtils.safeGetLong(dbResult, "fdwowner");
import org.jkiss.dbeaver.DBException;
/**
        super(database);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }

        return oid;
package org.jkiss.dbeaver.ext.postgresql.model;
                (validator == null ? "" : "VALIDATOR " + validator.getName() + "\n\t") +
    }
        throws SQLException
    public PostgreProcedure getValidator(DBRProgressMonitor monitor) throws DBException {
 */
    private long handlerProcId;
        this.handlerProcId = JDBCUtils.safeGetLong(dbResult, "fdwhandler");

    }
        this.validatorProcId = JDBCUtils.safeGetLong(dbResult, "fdwvalidator");
 * PostgreForeignDataWrapper
    @Property(viewable = false, order = 8)
import org.jkiss.code.NotNull;
    {
import java.util.Map;

    @Property(viewable = true, order = 5)

            "-- Foreign data wrapper: " + getName() + "\n\n" +
    @NotNull
        return getDatabase().getProcedure(monitor, handlerSchemaId, validatorProcId);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                (handler == null ? "" : "HANDLER " + handler.getName() + "\n\t") +
    public long getObjectId() {
                "CREATE FOREIGN DATA WRAPPER " + getName() + "\n\t" +
        this.loadInfo(dbResult);
