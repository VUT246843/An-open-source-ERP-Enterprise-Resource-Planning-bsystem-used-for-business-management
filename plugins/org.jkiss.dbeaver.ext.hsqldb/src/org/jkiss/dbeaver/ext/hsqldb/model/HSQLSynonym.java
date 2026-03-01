        super(container, JDBCUtils.safeGetString(dbResult, "SYNONYM_NAME"), null);
    @Override

import org.jkiss.dbeaver.DBException;
            log.error("Schema '" + targetSchemaName + "' not found");
    protected HSQLSynonym(GenericStructContainer container, JDBCResultSet dbResult) {

        return null;
 * limitations under the License.
public class HSQLSynonym extends GenericSynonym {
/*

        GenericSchema schema = getDataSource().getSchema(targetSchemaName);

    public String getTargetObjectType() {
 *
}
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.DBSObject;
 * See the License for the specific language governing permissions and
    @Property(viewable = true, order = 4)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
 */
    private String targetSchemaName;
        if (schema == null) {
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    private static final Log log = Log.getLog(HSQLSynonym.class);
 *
    }
        targetObjectName = JDBCUtils.safeGetString(dbResult, "OBJECT_NAME");
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.Log;
    }
    @Property(viewable = true, order = 3)

 *
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * HSQLSynonym
        targetObjectType = JDBCUtils.safeGetString(dbResult, "OBJECT_TYPE");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * You may obtain a copy of the License at
        targetSchemaName = JDBCUtils.safeGetString(dbResult, "OBJECT_SCHEMA");
        } else {
 * you may not use this file except in compliance with the License.
        }

 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.model.meta.Property;
    private String targetObjectName;
        return targetObjectType;
    private String targetObjectType;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public DBSObject getTargetObject(DBRProgressMonitor monitor) throws DBException {
package org.jkiss.dbeaver.ext.hsqldb.model;
import org.jkiss.dbeaver.ext.generic.model.GenericSynonym;
            return schema.getTable(monitor, targetObjectName);
 * DBeaver - Universal Database Manager
