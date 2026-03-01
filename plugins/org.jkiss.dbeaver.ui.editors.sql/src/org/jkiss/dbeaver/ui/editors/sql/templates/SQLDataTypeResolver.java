}
 */
        if (dataTypeProvider != null) {
    private static final Log log = Log.getLog(SQLDataTypeResolver.class);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Override
                    result[index++] = dataType.getName();
 *
package org.jkiss.dbeaver.ui.editors.sql.templates;
 *

 * limitations under the License.
import org.jkiss.utils.CommonUtils;
import java.util.Collection;
import org.jkiss.dbeaver.Log;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.DBSDataType;

    }

                }
        if (executionContext == null) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * you may not use this file except in compliance with the License.
    }
                for (DBSDataType dataType : localDataTypes) {
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Data type resolver
 * See the License for the specific language governing permissions and
public class SQLDataTypeResolver extends TemplateVariableResolver {
/**
import org.eclipse.jface.text.templates.TemplateContext;
                return result;
                int index = 0;
            if (!CommonUtils.isEmpty(localDataTypes)) {
import org.jkiss.dbeaver.model.DBPContextProvider;
    protected String[] resolveAll(final TemplateContext context)
 * Unless required by applicable law or agreed to in writing, software
            final Collection<? extends DBSDataType> localDataTypes = dataTypeProvider.getLocalDataTypes();
import org.jkiss.dbeaver.model.DBPDataTypeProvider;
        return super.resolveAll(context);
        super("type", "Data type");
 *     http://www.apache.org/licenses/LICENSE-2.0
                String[] result = new String[localDataTypes.size()];

            return super.resolveAll(context);

        }
 *
        final DBCExecutionContext executionContext = ((DBPContextProvider) context).getExecutionContext();

            }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.jface.text.templates.TemplateVariableResolver;
 */
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBUtils;
    {

 * You may obtain a copy of the License at
        DBPDataTypeProvider dataTypeProvider = DBUtils.getAdapter(DBPDataTypeProvider.class, executionContext.getDataSource());
    public SQLDataTypeResolver()
    {
        }
