                    throws InvocationTargetException, InterruptedException
import org.jkiss.utils.CommonUtils;
            return super.resolveAll(context);
            };
 * Entity resolver
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
                        throw new InvocationTargetException(e);

            RuntimeUtils.runTask(runnable, "Resolve attributes", 1000);
        super("column", "Table column");
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others

                            }

 * limitations under the License.


 * You may obtain a copy of the License at
                        if (!CommonUtils.isEmpty(entities)) {
    protected String[] resolveAll(final TemplateContext context)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
import org.eclipse.jface.text.templates.TemplateVariableResolver;
                }
        }
/**
package org.jkiss.dbeaver.ui.editors.sql.templates;
import org.jkiss.dbeaver.DBException;
        if (!CommonUtils.isEmpty(tableName)) {
 * you may not use this file except in compliance with the License.
                {
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.struct.DBSEntity;
import org.jkiss.dbeaver.model.DBPContextProvider;
                public void run(DBRProgressMonitor monitor)

        if (variable instanceof SQLVariable) {
import org.jkiss.dbeaver.utils.RuntimeUtils;
                for (int i = 0; i < attributes.size(); i++) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        TemplateVariable tableVariable = ((SQLContext) context).getTemplateVariable("table");
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
        super.resolve(variable, context);
import org.jkiss.dbeaver.model.DBUtils;
public class SQLAttributeResolver extends TemplateVariableResolver {
    }
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    private static final Log log = Log.getLog(SQLAttributeResolver.class);
            if (!CommonUtils.isEmpty(attributes)) {
                    try {
 * Unless required by applicable law or agreed to in writing, software
 */
                    result[i] = entity.getName();
 * Licensed under the Apache License, Version 2.0 (the "License");
                                attributes.addAll(CommonUtils.safeCollection(table.getAttributes(monitor)));
            ((SQLVariable)variable).setResolver(this);
                        }
 */

/*
    {
 *
import java.util.List;
import java.lang.reflect.InvocationTargetException;
                }
        if (executionContext == null) {
                            if (table != null) {
                    DBSEntityAttribute entity = attributes.get(i);
import org.eclipse.jface.text.templates.TemplateContext;
 *
    public SQLAttributeResolver()

                @Override
                    } catch (DBException e) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
            DBRRunnableWithProgress runnable = new DBRRunnableWithProgress() {
        return super.resolveAll(context);
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
}
 * See the License for the specific language governing permissions and
    public void resolve(TemplateVariable variable, TemplateContext context)
            final List<DBSEntityAttribute> attributes = new ArrayList<>();
        final String tableName = tableVariable == null ? null : tableVariable.getDefaultValue();
                    }
    {
                String[] result = new String[attributes.size()];
import java.util.ArrayList;
        }
                return result;
import org.eclipse.jface.text.templates.TemplateVariable;
                        SQLEntityResolver.resolveTables(monitor, executionContext, context, entities);
    {
                        List<DBSEntity> entities = new ArrayList<>();
 *
                            DBSEntity table = DBUtils.findObject(entities, tableName);

    @Override
        final DBCExecutionContext executionContext = ((DBPContextProvider) context).getExecutionContext();
