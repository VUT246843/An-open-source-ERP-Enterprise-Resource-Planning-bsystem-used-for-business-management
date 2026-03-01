

/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
public class OracleObjectDeclarationViewer extends SQLSourceViewer {
 *
    protected void contributeEditorCommands(IContributionManager toolBarManager) {
 * you may not use this file except in compliance with the License.
 *
/*
}
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.ext.oracle.model.OracleSchema;
 * DBeaver - Universal Database Manager
    protected boolean isReadOnly() {
        if (sourceObject instanceof OracleTableBase || sourceObject instanceof OracleSchema) {
    }
            OracleEditorUtils.addDDLControl(toolBarManager, sourceObject, this);

    @Override
 * See the License for the specific language governing permissions and
    }
    public OracleObjectDeclarationViewer() {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
        super.contributeEditorCommands(toolBarManager);

import org.eclipse.jface.action.IContributionManager;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.oracle.model.OracleTableBase;
        return true;

 * You may obtain a copy of the License at
 */

    @Override


 */
 * Unless required by applicable law or agreed to in writing, software
        }
        DBSObject sourceObject = getSourceObject();
package org.jkiss.dbeaver.ext.oracle.ui.editors;
 * OracleObjectDeclarationViewer helps to view object declaration, but not change it
import org.jkiss.dbeaver.ui.editors.sql.SQLSourceViewer;
