    private boolean viewsIncluded() {
 *
import org.jkiss.dbeaver.model.DBPScriptObject;
    @Override
                }
}
import java.util.Map;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        Map<String, Object> options = super.getSourceOptions();
                    setChecked(viewsIncluded());

 * Copyright (C) 2010-2024 DBeaver Corp and others
                @Override
 */
            new Action("Include views", Action.AS_CHECK_BOX) {
        super.contributeEditorCommands(toolBarManager);
        toolBarManager.add(ActionUtils.makeActionContribution(

import org.jkiss.dbeaver.ext.db2.model.DB2Table;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.ActionUtils;

    }
    protected Map<String, Object> getSourceOptions() {
                public void run() {
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.utils.CommonUtils;
/*

 * limitations under the License.
            getDatabaseEditorInput().getAttribute(DBPScriptObject.OPTION_SCRIPT_INCLUDE_VIEWS), true);
    public DB2TableDDLEditor() {
 * You may obtain a copy of the License at
    protected void contributeEditorCommands(IContributionManager toolBarManager) {

            }, true));
import org.jkiss.dbeaver.model.DBIcon;
import org.eclipse.jface.action.Separator;
package org.jkiss.dbeaver.ext.db2.ui.editors;
                    setImageDescriptor(DBeaverIcons.getImageDescriptor(DBIcon.TREE_VIEW));
 *
    @Override
import org.eclipse.jface.action.Action;
        options.put(DBPScriptObject.OPTION_SCRIPT_INCLUDE_VIEWS, viewsIncluded());
        toolBarManager.add(new Separator());
 * Unless required by applicable law or agreed to in writing, software
                    refreshPart(this, true);
    }
                }
                    setToolTipText("Include views to the DDL");
        return options;
                    getDatabaseEditorInput().setAttribute(DBPScriptObject.OPTION_SCRIPT_INCLUDE_VIEWS, isChecked());

public class DB2TableDDLEditor extends SQLSourceViewer<DB2Table> {

                {
import org.jkiss.dbeaver.ui.DBeaverIcons;

import org.jkiss.dbeaver.ui.editors.sql.SQLSourceViewer;

        return CommonUtils.getBoolean(
import org.eclipse.jface.action.IContributionManager;

