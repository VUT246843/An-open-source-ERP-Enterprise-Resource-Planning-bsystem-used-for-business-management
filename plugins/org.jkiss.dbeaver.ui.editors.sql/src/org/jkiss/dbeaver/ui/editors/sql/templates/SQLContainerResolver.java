            return;

    static final String VAR_NAME_SCHEMA = "schema";
    {
 * limitations under the License.
 *
 */
            }
/**
            makeProposalsFromChildren(monitor, executionContext, objectContainer, entities);
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        if (CommonUtils.isEmpty(children)) {
    {
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
    private void makeProposalsFromChildren(DBRProgressMonitor monitor, DBCExecutionContext executionContext, DBSObjectContainer container, List<T> names) throws DBException
    }
    protected void resolveObjects(DBRProgressMonitor monitor, DBCExecutionContext executionContext, TemplateContext context, List<T> entities) throws DBException
 * Copyright (C) 2010-2024 DBeaver Corp and others
            if (activeContainer != null && activeContainer != container) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (objectType.isInstance(child)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
            DBSObjectContainer activeContainer = DBUtils.getSelectedObject(executionContext, DBSObjectContainer.class);
    @Override
                names.add(objectType.cast(child));
import org.jkiss.dbeaver.model.DBUtils;
public class SQLContainerResolver<T extends DBSObjectContainer> extends SQLObjectResolver<T> {


    private Class<T> objectType;

    }
/*
 * Unless required by applicable law or agreed to in writing, software
        this.objectType = objectType;
        for (DBSObject child : children) {
 *
 * See the License for the specific language governing permissions and
import org.eclipse.jface.text.templates.TemplateContext;
import java.util.List;
        }



import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        DBSObjectContainer objectContainer = DBUtils.getAdapter(DBSObjectContainer.class, executionContext.getDataSource());
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        super(id, title);
            // Nothing found - maybe we should go deeper in active container
        Collection<? extends DBSObject> children = container.getChildren(monitor);
        }
import java.util.Collection;
        }
    }
    private static final Log log = Log.getLog(SQLContainerResolver.class);
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.

import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.Log;

            }
    SQLContainerResolver(String id, String title, Class<T> objectType)
 * You may obtain a copy of the License at
                makeProposalsFromChildren(monitor, executionContext, activeContainer, names);
}
        if (names.isEmpty()) {
    static final String VAR_NAME_CATALOG = "catalog";
package org.jkiss.dbeaver.ui.editors.sql.templates;
 * Container resolver
 *
        if (objectContainer != null) {
import org.jkiss.dbeaver.model.struct.DBSObject;
    {
