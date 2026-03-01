 * limitations under the License.
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    @Override
 * SQLServerSourceViewEditor
        DBSObjectWithScript sourceObject = getSourceObject();
    @Override

    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.ext.mssql.model.SQLServerProcedure;
package org.jkiss.dbeaver.ext.mssql.ui.editors;
import org.jkiss.dbeaver.ext.mssql.model.SQLServerView;
        getInputPropertySource().setPropertyValue(monitor, "objectDefinitionText", sourceText);
import org.jkiss.dbeaver.model.struct.DBSObjectWithScript;
        }


 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
    {
    {
 * You may obtain a copy of the License at
        return true;
    protected boolean isReadOnly()
/**
        if (sourceObject instanceof SQLServerView || sourceObject instanceof SQLServerTableTrigger || sourceObject instanceof SQLServerProcedure) {
 *
            return false;

    {
 *
 *

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.editors.sql.SQLSourceViewer;

    protected void setSourceText(DBRProgressMonitor monitor, String sourceText)
    }
 * Unless required by applicable law or agreed to in writing, software

    public SQLServerSourceViewEditor()
/*
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.mssql.model.SQLServerTableTrigger;

public class SQLServerSourceViewEditor extends SQLSourceViewer<DBSObjectWithScript> {
}
