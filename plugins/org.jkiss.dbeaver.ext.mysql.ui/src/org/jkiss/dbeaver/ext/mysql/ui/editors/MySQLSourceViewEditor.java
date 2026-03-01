
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ext.mysql.model.MySQLSourceObject;
    {
    }
package org.jkiss.dbeaver.ext.mysql.ui.editors;
        return false;
 * limitations under the License.
    }
 */
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
/*
    public MySQLSourceViewEditor()
/**
    protected boolean isReadOnly()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected void setSourceText(DBRProgressMonitor monitor, String sourceText)
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


}
    {
    @Override
public class MySQLSourceViewEditor extends SQLSourceViewer<MySQLSourceObject> {
 * MySQLSourceViewEditor
import org.jkiss.dbeaver.ui.editors.sql.SQLSourceViewer;

        getInputPropertySource().setPropertyValue(monitor, "objectDefinitionText", sourceText);
    }
 *
    {

 *
 */
