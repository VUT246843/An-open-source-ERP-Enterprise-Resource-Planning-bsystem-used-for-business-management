    public static void setPartBackground(IEditorPart editor, Composite composite) {
}
        Composite rootComposite = composite;
import org.jkiss.dbeaver.model.DBPDataSourceContainerProvider;

                dsContainer = context.getDataSource().getContainer();
import org.jkiss.dbeaver.ui.controls.ToolbarSeparatorContribution;
 */

        contributionManager.add(ActionUtils.makeCommandContribution(
        if (tabFolder != null) {
/*

            rootComposite.setData(CSSUtils.DATABASE_EDITOR_COMPOSITE_DATASOURCE, dsContainer);
import org.eclipse.ui.IWorkbenchSite;
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
                tabFolder = (CTabFolder) c.getParent();
        if (composite == null || composite.isDisposed()) {
            EditorsMessages.database_editor_command_refresh_name,
            workbenchSite,
 *
            }
        ));
            UIIcon.RESET,
        DBPDataSourceContainer dsContainer = null;
            workbenchSite,
 * distributed under the License is distributed on an "AS IS" BASIS,
        contributionManager.add(ActionUtils.makeCommandContribution(
import org.eclipse.ui.IWorkbenchCommandConstants;
            rootComposite.setBackground(bgColor);
import org.eclipse.jface.action.IContributionManager;

        } else {
            workbenchSite,
            }
            EditorsMessages.database_editor_command_revert_name,
 * limitations under the License.
import org.eclipse.ui.IEditorPart;
            Color bgColor = UIUtils.getConnectionColor(dsContainer.getConnectionConfiguration());
            DBCExecutionContext context = cp.getExecutionContext();
import org.eclipse.swt.graphics.Color;
        }
    public static void contributeStandardEditorActions(IWorkbenchSite workbenchSite, IContributionManager contributionManager) {
            EditorsMessages.database_editor_command_refresh_tip,
    // Associates editor with datasource
            true
import org.jkiss.dbeaver.ui.UIIcon;
            dsContainer = dscp.getDataSourceContainer();
 * Copyright (C) 2010-2025 DBeaver Corp and others
public class DatabaseEditorUtils {
        }
            UIIcon.REFRESH,
        }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 *
            rootComposite.setBackground(null);
        }
            tabFolder.setBorderVisible(false);
 * Unless required by applicable law or agreed to in writing, software
            IWorkbenchCommandConstants.FILE_SAVE,
import org.jkiss.dbeaver.ui.ActionUtils;
                break;
/**
            EditorsMessages.database_editor_command_save_name,
        contributionManager.add(ActionUtils.makeCommandContribution(
    }
            IWorkbenchCommandConstants.FILE_REVERT,
import org.jkiss.dbeaver.ui.css.CSSUtils;

 * DB editor utils
        contributionManager.add(new ToolbarSeparatorContribution(true));
            UIIcon.SAVE,
            EditorsMessages.database_editor_command_revert_tip,
import org.eclipse.swt.custom.CTabFolder;
            EditorsMessages.database_editor_command_save_tip,
    }
        if (dsContainer == null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
            if (context != null) {
import org.jkiss.dbeaver.ui.UIUtils;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBPContextProvider;
            if (!c.isDisposed() && c.getParent() instanceof CTabFolder) {
            return;
            IWorkbenchCommandConstants.FILE_REFRESH,

        for (Composite c = composite; c != null; c = c.getParent()) {

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        if (editor instanceof DBPDataSourceContainerProvider dscp) {
package org.jkiss.dbeaver.ui.editors;
            true
        contributionManager.add(new ToolbarSeparatorContribution(true));
                //rootComposite = c;
import org.eclipse.swt.widgets.Composite;
 */
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.editors.internal.EditorsMessages;
            true
        CTabFolder tabFolder = null;
 *
        } else if (editor instanceof DBPContextProvider cp) {
        ));

        ));
