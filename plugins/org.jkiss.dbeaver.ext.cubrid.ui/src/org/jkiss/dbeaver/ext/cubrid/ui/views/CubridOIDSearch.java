import java.sql.ResultSet;
                .getMethod("getNewInstance", loader.loadClass("cubrid.jdbc.driver.CUBRIDConnection"), String.class)
    public void searchOID(@Nullable String oidString, @Nullable Tree resultTree) {
import org.eclipse.swt.widgets.Display;

import org.jkiss.dbeaver.runtime.DBWorkbench;
        try {
            }

            String tableName = (String) BeanUtils.invokeObjectMethod(oidObject, "getTableName");
import org.jkiss.dbeaver.ext.cubrid.ui.internal.CubridMessages;

        this.session = session;
            child.setText("table name: " + tableName);

import org.eclipse.swt.widgets.Tree;
import java.util.List;
                CubridMessages.cubrid_oid_search_error_title,
    }
                         child = new TreeItem(parentTree, SWT.NONE);
                .invoke(null, conn, oidString);
                .loadClass("cubrid.sql.CUBRIDOIDImpl")
            Object oidObject = loader
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
import java.sql.Connection;
import java.util.ArrayList;
                    for (int i = 1; i <= attrName.length; i++) {
                }
            try (ResultSet result = metaData.getColumns(null, null, tableName, null)) {
 * You may obtain a copy of the License at
                         child.setText(column + ": " + value);
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            ClassLoader loader = conn.getClass().getClassLoader();
}
import org.jkiss.code.Nullable;

 *
 */
import org.jkiss.utils.BeanUtils;

 *
            try (ResultSet result = (ResultSet) BeanUtils.invokeObjectMethod(
                new Class<?>[] {String[].class},
            Display.getDefault().asyncExec(() -> parentTree.setExpanded(true));
/*
import java.sql.DatabaseMetaData;
            );
            }
 * See the License for the specific language governing permissions and
                oidObject, "getValues",
            List<String> columns = new ArrayList<>();

                true

    private JDBCSession session;
                         String column = attrName[i - 1];
 * Unless required by applicable law or agreed to in writing, software
                while (result.next()) {
                }
                    columns.add(result.getString("COLUMN_NAME"));

import org.eclipse.swt.widgets.TreeItem;
    public CubridOIDSearch(JDBCSession session) {
        } catch (Throwable e) {
import org.eclipse.swt.SWT;
            TreeItem child = new TreeItem(parentTree, SWT.NONE);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * limitations under the License.
                while (result.next()) {
                new Object[] {attrName})
 * DBeaver - Universal Database Manager
public class CubridOIDSearch {
    }
            TreeItem parentTree = new TreeItem(resultTree, SWT.NONE);
 * distributed under the License is distributed on an "AS IS" BASIS,
                CubridMessages.cubrid_oid_search_error_message,
            Connection conn = session.getOriginal();
        }
            DBWorkbench.getPlatformUI().showMessageBox(

 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.cubrid.ui.views;
            String[] attrName = columns.toArray(new String[0]);

 * you may not use this file except in compliance with the License.
            DatabaseMetaData metaData = conn.getMetaData();
            ) {
            parentTree.setText(oidString);
                         Object value = result.getObject(i);
