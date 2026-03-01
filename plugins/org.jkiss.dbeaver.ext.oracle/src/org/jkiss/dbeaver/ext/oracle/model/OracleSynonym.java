
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.DBException;
    @Property(viewable = true, linkPossible = true, order = 4)
/**
    public String getName()
        if (objectTypeName == null) {
    }
 * Oracle synonym
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        this.objectName = JDBCUtils.safeGetString(dbResult, OracleConstants.COL_TABLE_NAME);
package org.jkiss.dbeaver.ext.oracle.model;
            return null;
    }
    @Override
        final OracleSchema schema = getDataSource().schemaCache.getCachedObject(objectOwner);

        this.objectTypeName = JDBCUtils.safeGetString(dbResult, OracleConstants.COLUMN_OBJECT_TYPE);
        return objectTypeName;
    @Property(viewable = true, order = 2)
    @Override
import org.jkiss.dbeaver.model.DBPEvaluationContext;
/*
import org.jkiss.dbeaver.model.meta.Property;
            objectOwner,

    private String objectOwner;
            monitor,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
        return OracleObjectType.resolveObject(
        }
    private String dbLink;
    public Object getObjectOwner()
    public OracleObjectType getObjectType()
    private String objectName;
import org.jkiss.dbeaver.model.struct.DBSObject;

import org.jkiss.dbeaver.model.struct.DBSAlias;
        return OracleObjectType.getByType(objectTypeName);
    }
    {
 * See the License for the specific language governing permissions and
import org.jkiss.code.NotNull;
        return null;
    {
            return DBUtils.getQuotedIdentifier(this);
import java.sql.ResultSet;
        this.dbLink = JDBCUtils.safeGetString(dbResult, "DB_LINK");
 * Unless required by applicable law or agreed to in writing, software
        }
    private String objectTypeName;
    }
        }
        return super.getName();
    {

    @Property(viewable = true, order = 5)
            getDataSource(),
            objectName);
    @Property(viewable = true, order = 3)
    @Override
    public OracleSynonym(OracleSchema schema, ResultSet dbResult)
    }
    {
        if (OracleConstants.USER_PUBLIC.equals(getSchema().getName())) {
        Object object = getObject(monitor);
            objectTypeName,


    {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
public class OracleSynonym extends OracleSchemaObject implements DBSAlias {
    }

    }
    }
 *
 */
    public Object getDbLink(DBRProgressMonitor monitor) throws DBException
        super(schema, JDBCUtils.safeGetString(dbResult, "SYNONYM_NAME"), true);
    @Property(viewable = true, editable = true, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
 * you may not use this file except in compliance with the License.
        return schema == null ? objectOwner : schema;
 *
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0

    @NotNull
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
        return super.getFullyQualifiedName(context);

            return (DBSObject) object;
}
            dbLink,

 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getObjectTypeName()
    public DBSObject getTargetObject(DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.DBUtils;
    @NotNull
    }
    public Object getObject(DBRProgressMonitor monitor) throws DBException

    {

        this.objectOwner = JDBCUtils.safeGetString(dbResult, "TABLE_OWNER");
        if (object instanceof DBSObject) {
        return OracleDBLink.resolveObject(monitor, getSchema(), dbLink);
 * limitations under the License.
    {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
