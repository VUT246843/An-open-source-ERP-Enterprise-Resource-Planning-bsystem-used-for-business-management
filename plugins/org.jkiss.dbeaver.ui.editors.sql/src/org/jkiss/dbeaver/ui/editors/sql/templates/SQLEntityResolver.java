        for (DBSObject child : children) {
 *

    }
import org.jkiss.dbeaver.model.DBUtils;
            objectContainer = (DBSObjectContainer)DBUtils.getObjectByPath(monitor, executionContext, objectContainer, catalogName, schemaName, null);
 * limitations under the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/*
        }
        }
 * DBeaver - Universal Database Manager
        }
import org.eclipse.jface.text.templates.TemplateVariable;
    @Override
            return;
        if (objectContainer == null) {
import java.util.Collection;
    {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.struct.DBSEntity;


        if (objectContainer != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    SQLEntityResolver()
    }
}
        if (objectContainer == null) {
    protected void resolveObjects(DBRProgressMonitor monitor, DBCExecutionContext executionContext, TemplateContext context, List<DBSEntity> entities) throws DBException
        super("table", "Database table");
/**
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        }
    static void makeProposalsFromChildren(DBRProgressMonitor monitor, DBSObjectContainer container, List<DBSEntity> names) throws DBException
    }
        }
            makeProposalsFromChildren(monitor, objectContainer, entities);
 * See the License for the specific language governing permissions and
        String schemaName = schemaVariable == null ? null : schemaVariable.getDefaultValue();
            objectContainer = DBUtils.getSelectedObject(executionContext, DBSObjectContainer.class);
    public void resolve(TemplateVariable variable, TemplateContext context)
        }

import org.jkiss.dbeaver.DBException;
            return;
 */
            // Possibly neither catalogs nor schemas are supported
 * Licensed under the Apache License, Version 2.0 (the "License");
            ((SQLVariable)variable).setResolver(this);
 *
            if (child instanceof DBSEntity) {
    {

        if (!CommonUtils.isEmpty(catalogName) || !CommonUtils.isEmpty(schemaName)) {
 *
import org.eclipse.jface.text.templates.TemplateContext;
        Collection<? extends DBSObject> children = container.getChildren(monitor);
import org.jkiss.utils.CommonUtils;
 * Entity resolver
 * Unless required by applicable law or agreed to in writing, software
        super.resolve(variable, context);
    {
    {
            // Find container for specified schema/catalog
        }
    {
                names.add((DBSEntity) child);
        String catalogName = catalogVariable == null ? null : catalogVariable.getDefaultValue();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } else {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
class SQLEntityResolver extends SQLObjectResolver<DBSEntity> {
package org.jkiss.dbeaver.ui.editors.sql.templates;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
    }
            objectContainer = DBUtils.getAdapter(DBSObjectContainer.class, executionContext.getDataSource());
        DBSObjectContainer objectContainer = DBUtils.getAdapter(DBSObjectContainer.class, executionContext.getDataSource());
        resolveTables(monitor, executionContext, context, entities);
        TemplateVariable catalogVariable = ((SQLContext) context).getTemplateVariable(SQLContainerResolver.VAR_NAME_CATALOG);
 */

import org.jkiss.dbeaver.model.struct.DBSObject;
    static void resolveTables(DBRProgressMonitor monitor, DBCExecutionContext executionContext, TemplateContext context, List<DBSEntity> entities) throws DBException
        if (CommonUtils.isEmpty(children)) {
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
import java.util.List;
        if (variable instanceof SQLVariable) {
        TemplateVariable schemaVariable = ((SQLContext) context).getTemplateVariable(SQLContainerResolver.VAR_NAME_SCHEMA);

            }


