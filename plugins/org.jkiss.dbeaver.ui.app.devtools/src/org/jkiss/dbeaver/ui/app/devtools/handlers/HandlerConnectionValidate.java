                try (final DBCStatement dbStat = session.prepareStatement(DBCStatementType.EXEC, "SELECT x.attributes FROM \"public\".entry x LIMIT 200", true, false, false)) {
        }
    }
import org.eclipse.jface.viewers.ISelection;

 * See the License for the specific language governing permissions and
                                System.out.println(cellValue);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.core.commands.ExecutionException;
    @Override
        }
import org.jkiss.dbeaver.model.exec.DBCStatement;

}
import org.eclipse.jface.viewers.IStructuredSelection;
                        try (final DBCResultSet dbResult = dbStat.openResultSet()) {
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at

    public Object execute(ExecutionEvent event) throws ExecutionException {

                            while (dbResult.nextRow()) {
            if (element instanceof DBNDatabaseNode) {
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
import org.eclipse.core.commands.AbstractHandler;

import org.jkiss.dbeaver.model.exec.DBCResultSet;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBException;
                        }
            final Object element = ((IStructuredSelection) selection).getFirstElement();
import org.jkiss.dbeaver.model.DBPDataSource;
                    }
            try (final DBCSession session = DBUtils.openUtilSession(new VoidProgressMonitor(), dataSource, "test")) {
    private void validateNode(DBPDataSource dataSource) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (selection instanceof IStructuredSelection) {
    }
import org.eclipse.core.commands.ExecutionEvent;
 * limitations under the License.
 *
                    if (dbStat.executeStatement()) {
import org.jkiss.dbeaver.model.DBUtils;
                validateNode(((DBNDatabaseNode)element).getDataSource());
public class HandlerConnectionValidate extends AbstractHandler {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
 *
                                final Object cellValue = dbResult.getAttributeValue(0);
package org.jkiss.dbeaver.ui.app.devtools.handlers;
        return null;
                            }
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        try {
 *

import org.jkiss.dbeaver.model.exec.DBCStatementType;
                }

import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
import org.jkiss.dbeaver.model.exec.DBCSession;
            e.printStackTrace();
 */
import org.eclipse.ui.handlers.HandlerUtil;
        } catch (DBException e) {
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
