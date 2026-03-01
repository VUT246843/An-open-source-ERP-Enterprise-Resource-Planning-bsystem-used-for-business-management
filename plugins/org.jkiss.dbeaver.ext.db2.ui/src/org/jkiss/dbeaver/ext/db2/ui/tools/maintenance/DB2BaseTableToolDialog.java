import org.eclipse.swt.SWT;
                TreeColumn msgColumn = new TreeColumn(objectTree, SWT.NONE);
            public void processObjectResults(@NotNull DB2Table db2Table, @Nullable DBCStatement statement, @Nullable DBCResultSet resultSet) throws DBCException
                } catch (SQLException e) {
                    if (treeItem != null) {
                        subItem.setFont(f);
    }
                            }
/*

                            subItem.setText(i, rsMetaData.getColumnName(i + 1));
                        for (int i = 0; i < rsMetaData.getColumnCount(); i++) {
package org.jkiss.dbeaver.ext.db2.ui.tools.maintenance;
import org.jkiss.utils.CommonUtils;
                    new TreeColumn(objectTree, SWT.NONE);


        super(partSite, title, objects, true);
import org.jkiss.dbeaver.model.exec.DBCException;

 *
                        // Display the column names
 *
            {

            @Override
            @Override
import java.sql.SQLException;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.


 * You may obtain a copy of the License at
import java.util.Collection;
                                subItem.setText(i, CommonUtils.toString(resultSet.getAttributeValue(i)));
    {
                        }
                for (int i = 0; i < nbExtraColumns; i++) {
import org.jkiss.dbeaver.ui.editors.sql.dialogs.SQLScriptProgressListener;

import org.jkiss.dbeaver.model.exec.DBCStatement;
                    TreeItem treeItem = getTreeItem(db2Table);
        final int nbExtraColumns = getNumberExtraResultingColumns();
    protected int getNumberExtraResultingColumns()

            }
import org.eclipse.ui.IWorkbenchPartSite;
                        subItem = new TreeItem(treeItem, SWT.NONE);
 * Licensed under the Apache License, Version 2.0 (the "License");
                msgColumn.setText(DB2Messages.dialog_table_tools_result);
 * DBeaver - Universal Database Manager
    }
                            subItem = new TreeItem(treeItem, SWT.NONE);
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCResultSetMetaDataImpl;
                            subItem.setGrayed(true);
                    return;
    {
            protected void createStatusColumns(Tree objectTree)
    {
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
        return new SQLScriptStatusDialog<DB2Table>(getTitle() + " " + DB2Messages.dialog_table_tools_progress, null) {
    public DB2BaseTableToolDialog(IWorkbenchPartSite partSite, String title, Collection<DB2Table> objects)
            {
            }
    @Override
                if (resultSet == null) {
                JDBCResultSetMetaDataImpl rsMetaData = (JDBCResultSetMetaDataImpl) resultSet.getMeta();
                    }
                    Font f = UIUtils.makeBoldFont(treeItem.getFont());
/**
import org.jkiss.dbeaver.model.exec.DBCResultSet;
        };
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
                // Retrive column names
 * limitations under the License.
import org.jkiss.dbeaver.ui.editors.sql.dialogs.SQLScriptStatusDialog;
                        treeItem.setExpanded(true);
                }
import org.eclipse.swt.widgets.TreeColumn;
import org.jkiss.dbeaver.ui.UIUtils;

                    throw new DBCException(e.getMessage());
 */
import org.jkiss.code.Nullable;
 * distributed under the License is distributed on an "AS IS" BASIS,
                        // Display the data for each row

                            for (int i = 0; i < rsMetaData.getColumnCount(); i++) {
import org.eclipse.swt.graphics.Font;
 */
                }
import org.eclipse.swt.widgets.TreeItem;
            // DF: This method is for tools that return resultsets
import org.jkiss.dbeaver.ext.db2.model.DB2Table;

                }
import org.jkiss.dbeaver.ui.editors.sql.dialogs.GenerateMultiSQLDialog;
        return 0;
}
                        TreeItem subItem = null;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
                        while (resultSet.nextRow()) {
 * See the License for the specific language governing permissions and
import org.eclipse.swt.widgets.Tree;
                        }

    }
                try {
 * Base Dialog for DB2 Tools Dialogs

public abstract class DB2BaseTableToolDialog extends GenerateMultiSQLDialog<DB2Table> {
    protected SQLScriptProgressListener<DB2Table> getScriptListener()
import org.jkiss.dbeaver.ext.db2.ui.internal.DB2Messages;
import org.jkiss.code.NotNull;
