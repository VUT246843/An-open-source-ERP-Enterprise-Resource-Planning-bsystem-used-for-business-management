                        final Object item = iter.next();
                        DBCCompileError error = new DBCCompileError(
                }

            final ISelectionProvider selectionProvider = partSite.getSelectionProvider();

import java.util.List;
                        hasErrors = true;
                try (ResultSet dbResult = dbStat.executeQuery()) {
package org.jkiss.dbeaver.ext.oracle.ui.actions;
    protected List<OracleSourceObject> getOracleSourceObjects(UIElement element) {
        OracleStatefulObject schemaObject,
    public static boolean logObjectErrors(
import org.jkiss.dbeaver.model.exec.compile.DBCCompileLog;
                ISelection selection = selectionProvider.getSelection();
import org.jkiss.dbeaver.utils.RuntimeUtils;
/**
                            objects.add(sourceObject);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.jface.viewers.ISelection;
        List<OracleSourceObject> objects = new ArrayList<>();
 */
 * Unless required by applicable law or agreed to in writing, software
                dbStat.setString(3, objectType.getTypeName());
 *
import org.jkiss.dbeaver.ext.oracle.model.source.OracleStatefulObject;
import org.eclipse.ui.commands.IElementUpdater;
                            dbResult.getInt("POSITION"));
                            compileLog.error(error);
import java.util.Iterator;
            return false;
                        if (error.isError()) {
                "SELECT * FROM " + OracleUtils.getSysSchemaPrefix(schemaObject.getDataSource()) + "ALL_ERRORS WHERE OWNER=? AND NAME=? AND TYPE=? ORDER BY SEQUENCE")) {
 */
import java.util.ArrayList;
}                            "ERROR".equals(dbResult.getString("ATTRIBUTE")),
import org.jkiss.dbeaver.ext.oracle.model.OracleUtils;
        try {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                            dbResult.getString("TEXT"),
                    while (dbResult.next()) {
            }
                }
    {
                            dbResult.getInt("LINE"),
    }
        OracleObjectType objectType)
            if (objects.isEmpty()) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        }
import org.jkiss.dbeaver.ext.oracle.model.source.OracleSourceObject;
                final IWorkbenchPart activePart = partSite.getPart();

                    objects.add(sourceObject);
    private static final Log log = Log.getLog(OracleTaskHandler.class);
                    for (Iterator<?> iter = ((IStructuredSelection) selection).iterator(); iter.hasNext(); ) {
                        if (sourceObject != null) {
import org.eclipse.jface.viewers.IStructuredSelection;
            }

{
        }
                    return !hasErrors;
        return objects;
                        final OracleSourceObject sourceObject = RuntimeUtils.getObjectAdapter(item, OracleSourceObject.class);

import org.eclipse.ui.menus.UIElement;
                if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
import org.jkiss.dbeaver.model.exec.compile.DBCCompileError;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
import java.sql.ResultSet;
 * You may obtain a copy of the License at
    }
 * See the License for the specific language governing permissions and
                        } else {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.Log;
                        }
 * limitations under the License.
import org.eclipse.core.commands.AbstractHandler;
        JDBCSession session,
                    boolean hasErrors = false;
                if (sourceObject != null) {
                dbStat.setString(2, schemaObject.getName());
            if (selectionProvider != null) {
        if (partSite != null) {
            }
public abstract class OracleTaskHandler extends AbstractHandler implements IElementUpdater
                    }
                        }

                    }
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
/*
import org.eclipse.jface.viewers.ISelectionProvider;
 * you may not use this file except in compliance with the License.
        IWorkbenchPartSite partSite = UIUtils.getWorkbenchPartSite(element.getServiceLocator());
import org.jkiss.dbeaver.ext.oracle.model.OracleObjectType;
 *
            log.error("Can't read user errors", e);
                            compileLog.warn(error);
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.ui.IWorkbenchPartSite;
                dbStat.setString(1, schemaObject.getSchema().getName());
                }
        DBCCompileLog compileLog,
 * Base task handler
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.ui.IWorkbenchPart;
        } catch (Exception e) {
                final OracleSourceObject sourceObject = RuntimeUtils.getObjectAdapter(activePart, OracleSourceObject.class);
