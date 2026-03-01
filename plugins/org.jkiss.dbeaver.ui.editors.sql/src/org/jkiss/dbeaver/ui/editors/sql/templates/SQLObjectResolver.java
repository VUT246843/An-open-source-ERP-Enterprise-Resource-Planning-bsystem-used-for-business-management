 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super(type, description);
 * See the License for the specific language governing permissions and


                        } catch (DBException e) {
                            throw new InvocationTargetException(e);
                    public void run(DBRProgressMonitor monitor)
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.lang.reflect.InvocationTargetException;
 * you may not use this file except in compliance with the License.
                        }
    private static final Log log = Log.getLog(SQLObjectResolver.class);
                            resolveObjects(monitor, executionContext, context, entities);

    public SQLObjectResolver(String type, String description)
                T entity = entities.get(i);
                RuntimeUtils.runTask(new DBRRunnableWithProgress() {
package org.jkiss.dbeaver.ui.editors.sql.templates;
 *
                result[i] = entity.getName();
import org.eclipse.jface.text.templates.TemplateVariableResolver;
 */

import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
import org.jkiss.utils.CommonUtils;
 * Abstract object resolver
                        try {
                    @Override
 * DBeaver - Universal Database Manager
        if (context instanceof DBPContextProvider) {
        final List<T> entities = new ArrayList<>();
 *
    protected String[] resolveAll(final TemplateContext context)
        }
 * limitations under the License.
/*
    {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            if (executionContext != null) {
 * You may obtain a copy of the License at
                        throws InvocationTargetException, InterruptedException {
 *
            for (int i = 0; i < entities.size(); i++) {

    }
    protected abstract void resolveObjects(DBRProgressMonitor monitor, DBCExecutionContext executionContext, TemplateContext context, List<T> entities) throws DBException;
import java.util.List;
        if (!CommonUtils.isEmpty(entities)) {
import org.eclipse.jface.text.templates.TemplateContext;
}
        }
import java.util.ArrayList;
            }
        return super.resolveAll(context);
                }, "Resolve object references", 1000);
            final DBCExecutionContext executionContext = ((DBPContextProvider) context).getExecutionContext();
 */
import org.jkiss.dbeaver.DBException;
    {
import org.jkiss.dbeaver.model.struct.DBSObject;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    }
            return result;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
import org.jkiss.dbeaver.model.DBPContextProvider;
 * Unless required by applicable law or agreed to in writing, software
    }
public abstract class SQLObjectResolver<T extends DBSObject> extends TemplateVariableResolver {
            String[] result = new String[entities.size()];
            }


import org.jkiss.dbeaver.utils.RuntimeUtils;
import org.jkiss.dbeaver.Log;
/**
