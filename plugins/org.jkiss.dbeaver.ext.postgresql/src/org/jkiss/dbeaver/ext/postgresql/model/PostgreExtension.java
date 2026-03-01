    @Property(viewable = true,editable = true,updatable = true, order = 4, listProvider = SchemaListProvider.class)
    
        throws SQLException
    @Property(viewable = true, order = 6)

            "CREATE EXTENSION " + getName() + lineBreak + "\t" +
    public PostgreExtension(PostgreDatabase database) {
    {

 *
import org.jkiss.code.NotNull;
        return tables;

    }
 * limitations under the License.
        {
        return null;
    @NotNull
        return oid;
    }
        return database;
    private String version;
    private String owner;
    public PostgreDatabase getDatabase() {
            } catch (DBException e) {
import org.jkiss.dbeaver.model.struct.DBSObject;
    }

        return database;
    
    @NotNull
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.Log;
            "-- Extension: " + getName() + lineBreak + lineBreak +
        }
    }
import java.sql.SQLException;
        this.tables = JDBCUtils.safeGetString(dbResult, "tbls");
        return true;
    @Nullable
        return relocatable;
                return new Object[0];

/*

    @Override
 * you may not use this file except in compliance with the License.
    }
        this.database = database;
import org.jkiss.dbeaver.DBException;
import java.sql.ResultSet;
            try {
    private String name;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Property(viewable = true,editable = true, order = 1)
        String lineBreak = System.getProperty(StandardConstants.ENV_LINE_SEPARATOR);
    public void setObjectDefinitionText(String sourceText) throws DBException {
        public Object[] getPossibleValues(PostgreExtension object)
        }
public class PostgreExtension implements PostgreObject, PostgreScriptObject, DBPSystemInfoObject {
        return version;
    private String conditions;
    @Override
    }

    public boolean isPersisted() {
    public void setSchema(String schema) {
    @Override
    @Override

    @Override
    public PostgreExtension(PostgreDatabase database, ResultSet dbResult)
        @Override
        {
        return owner;
    public String getVersion() {
        public boolean allowCustomValue()
        this.version = JDBCUtils.safeGetString(dbResult, "extversion");
    @Property(viewable = true, order = 3)
    public String getName()
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.relocatable = JDBCUtils.safeGetBoolean(dbResult, "extrelocatable");
        return tableConditions != null && tableConditions.containsKey(table.getObjectId());
    }
            "SCHEMA \"" + getSchema() + "\"" + lineBreak + "\t" +
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    
    public String getDescription()
        this.owner = PostgreConstants.PUBLIC_SCHEMA_NAME;
        @Nullable
    public boolean isExtensionTable(PostgreTableBase table) {

    @NotNull
    
        return database.getDataSource();
    }
        return conditions;
    @Property(viewable = true, order = 2)
    public String getConditions() {
}
    }
 */
 * See the License for the specific language governing permissions and
    private Map<Long, String> tableConditions;
    @Override
                return schemas.toArray(new Object[0]);
    @Override
 */
            "VERSION " + version;
            "-- DROP EXTENSION " + getName() + ";" + lineBreak + lineBreak +
package org.jkiss.dbeaver.ext.postgresql.model;
        return name;

                log.error(e);
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
import java.util.Map;
    public void setName(String name) {
    @Property(viewable = true, order = 5)
        return
import org.jkiss.dbeaver.model.DBPSystemInfoObject;
    @NotNull
    private String tables;
        this.database = database;
            return false;
        return tableConditions  == null ? null : tableConditions.get(tableOid);
        throws SQLException

    }
    
    {
import org.jkiss.utils.StandardConstants;
    {
    public DBSObject getParentObject()
    @Override
        this.conditions = JDBCUtils.safeGetString(dbResult, "extcondition");
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull

    private void loadInfo(ResultSet dbResult)
import java.util.Collection;

        @Override
    private static final Log log = Log.getLog(PostgreExtension.class);

        this.oid = JDBCUtils.safeGetLong(dbResult, "oid");
    }
import org.jkiss.dbeaver.model.meta.Property;
                Collection<PostgreSchema> schemas = object.getDatabase().getSchemas(new VoidProgressMonitor());
        this.name = name;        
    public long getObjectId() {
    }

            }
    public String getExternalTableCondition(long tableOid) {
    }
    }
 *
import org.jkiss.code.Nullable;
    public static class SchemaListProvider implements IPropertyValueListProvider<PostgreExtension> {
    private long oid;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public PostgreDataSource getDataSource() {
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
 *
        this.owner = schema;        
 * DBeaver - Universal Database Manager
    private PostgreDatabase database;
 * You may obtain a copy of the License at
    private boolean relocatable;
 * PostgreExtension
    }
    
    public String getTables() {

    {
/**
    }
        this.loadInfo(dbResult);
    public String getSchema() {
        this.owner = JDBCUtils.safeGetString(dbResult, "schema_name");
    }

    {
    public boolean getRelocatable() {
    }
        this.name = JDBCUtils.safeGetString(dbResult, "extname");
    

import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
    @NotNull
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;

    
    @Override
