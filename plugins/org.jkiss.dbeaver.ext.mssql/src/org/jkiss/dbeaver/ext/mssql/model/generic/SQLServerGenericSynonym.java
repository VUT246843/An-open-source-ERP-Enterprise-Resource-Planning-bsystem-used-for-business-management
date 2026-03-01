import org.jkiss.dbeaver.model.DBUtils;
package org.jkiss.dbeaver.ext.mssql.model.generic;
        if (schema == null) {
        super(container, name, description);
        String schemaName = DBUtils.getUnQuotedIdentifier(getDataSource(), targetObjectName.substring(0, divPos + 1));
    @Override
 * limitations under the License.

        if (divPos == -1) {
    }

        return DBUtils.getFullQualifiedName(
            getParentObject(),
import org.jkiss.dbeaver.ext.generic.model.GenericSynonym;
        return schema.getChild(monitor, objectName);
    public DBSObject getTargetObject(DBRProgressMonitor monitor) throws DBException {
        }
    }

}
 * You may obtain a copy of the License at
 *
            log.debug("Bad target object name '" + targetObjectName + "' for synonym '" + getName() + "'");
import org.jkiss.dbeaver.ext.generic.model.GenericSchema;
public class SQLServerGenericSynonym extends GenericSynonym implements DBPQualifiedObject {
import org.jkiss.dbeaver.model.DBPQualifiedObject;
 *
        }
 */
 * DBeaver - Universal Database Manager
    @Property(viewable = true, order = 20)
    public SQLServerGenericSynonym(GenericStructContainer container, String name, String description, String targetObjectName) {
import org.jkiss.dbeaver.model.struct.DBSObject;
            return null;
    }
    private static final Log log = Log.getLog(SQLServerGenericSynonym.class);
            getDataSource(),
* SQL server synonym
import org.jkiss.code.NotNull;
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    @NotNull
/*


 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.meta.Property;
/**
import org.jkiss.dbeaver.DBException;

import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.generic.model.GenericCatalog;
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    private String targetObjectName;
            return null;
        GenericCatalog database = getParentObject().getCatalog();
            log.debug("Schema '" + schemaName + "' not found for synonym '" + getName() + "'");
 * See the License for the specific language governing permissions and
        int divPos = targetObjectName.indexOf("].[");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.targetObjectName = targetObjectName;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        String objectName = DBUtils.getUnQuotedIdentifier(getDataSource(), targetObjectName.substring(divPos + 2));
        GenericSchema schema = database.getSchema(monitor, schemaName);

 *     http://www.apache.org/licenses/LICENSE-2.0
            this);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.Log;
*/
 * Unless required by applicable law or agreed to in writing, software
