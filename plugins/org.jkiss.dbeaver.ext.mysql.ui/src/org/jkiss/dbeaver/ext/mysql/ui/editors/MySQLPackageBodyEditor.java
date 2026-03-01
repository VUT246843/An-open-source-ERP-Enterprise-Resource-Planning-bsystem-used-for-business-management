 *
import org.jkiss.dbeaver.ui.editors.sql.SQLSourceViewer;
    @Override
    protected String getSourceText(DBRProgressMonitor monitor) throws DBException {
 * MySQLPackageBodyEditor
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
    }

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    {
    }
    protected void setSourceText(DBRProgressMonitor monitor, String sourceText) {
/**
 *
    }
    protected boolean isReadOnly()
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager

    @Override
public class MySQLPackageBodyEditor extends SQLSourceViewer<MySQLSourceObject> {

    }
 */
 * Licensed under the Apache License, Version 2.0 (the "License");

        getInputPropertySource().setPropertyValue(
import org.jkiss.dbeaver.model.DBPScriptObjectExt;
        return ((DBPScriptObjectExt)getSourceObject()).getExtendedDefinitionText(monitor);
 * limitations under the License.
package org.jkiss.dbeaver.ext.mysql.ui.editors;
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
            sourceText);
            "extendedDefinitionText",

 * You may obtain a copy of the License at

        return false;
    @Override
    public MySQLPackageBodyEditor()
/*

 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.mysql.model.MySQLSourceObject;
 *

            monitor,
} * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;
