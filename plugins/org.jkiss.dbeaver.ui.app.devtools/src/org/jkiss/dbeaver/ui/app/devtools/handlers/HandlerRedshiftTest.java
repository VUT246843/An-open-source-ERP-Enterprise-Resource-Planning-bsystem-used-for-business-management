        return null;
                    try {
        return session.prepareStatement(DBCStatementType.EXEC, query, true, false, false);
        if (HandlerUtil.getCurrentSelection(event) instanceof IStructuredSelection selection) {
                @Override
 * See the License for the specific language governing permissions and
                    }

                try (final DBCResultSet results1 = stat.openResultSet()) {
import java.util.ArrayList;
    }
            List<Thread> startedThreads = startThreads(session);

                        && databaseNode.getDataSource().getContainer().getDriver().getProviderId().equals("redshift")) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    throw new ExecutionException("", e);
                    if (databaseNode != null
    }
    public Object execute(ExecutionEvent event) throws ExecutionException {
    }
            }
 * Unless required by applicable law or agreed to in writing, software


import org.eclipse.jface.viewers.IStructuredSelection;
                    }
                }
        return startedThreads;

        }
        List<Thread> startedThreads = new ArrayList<>();
            throw new RuntimeException(e);

            }
    }
import org.eclipse.core.commands.ExecutionEvent;
                        System.out.println(results1.getAttributeValue(0));

import org.eclipse.core.commands.AbstractHandler;

    @Override
 *
                    while (results1.nextRow()) {
package org.jkiss.dbeaver.ui.app.devtools.handlers;
 * DBeaver - Universal Database Manager
        String query = "SELECT 'hello world! - " + index + "'";
            if (stat.executeStatement()) {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
import java.util.List;
        for (int i = 0; i < 50; i++) {
            };
            System.out.println("Run tests");
/*

                        runQuery(session, finalI);
        System.out.println("\tFinished for thread " + index);
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
        }
                }
                    } else {
import org.eclipse.ui.handlers.HandlerUtil;
                    }
                thread.join();
import org.jkiss.dbeaver.DBException;
            thread.start();
 * distributed under the License is distributed on an "AS IS" BASIS,
        try (var stat = prepareStatement(session, query)) {

            for (Thread thread : startedThreads) {
            Thread thread = new Thread("Thread " + finalI) {
    }

public class HandlerRedshiftTest extends AbstractHandler {

                        && databaseNode.getDataSource() != null
    private static DBCStatement prepareStatement(DBCSession session, String query) throws DBCException {
                        test(databaseNode.getDataSource());
        }
                }
import org.eclipse.core.commands.ExecutionException;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                try {
            if (selection.getFirstElement() instanceof DBNDatabaseNode databaseNode) {
        try (final DBCSession session = DBUtils.openUtilSession(new VoidProgressMonitor(), dataSource, "test")) {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.DBUtils;
        //String query = "SELECT u.* FROM public.users AS u LIMIT 2 OFFSET %s".formatted(index * 2);
        System.out.println("Run for thread " + index);
        }
                } catch (DBCException e) {
            startedThreads.add(thread);
 */
import org.jkiss.dbeaver.model.exec.*;
            }
 *

import org.jkiss.dbeaver.runtime.DBWorkbench;
        } catch (InterruptedException e) {
 * limitations under the License.
                    } catch (DBException e) {
}

                        e.printStackTrace();

                public void run() {

    private static void runQuery(DBCSession session, int index) throws DBException {
    private void test(DBPDataSource dataSource) throws DBCException {

                        DBWorkbench.getPlatformUI().showWarningNotification("Warning", "Please select connected Redshift connection");


import org.jkiss.code.NotNull;
    @NotNull
            int finalI = i;
 * You may obtain a copy of the License at
        System.out.println("Finished");
    private static List<Thread> startThreads(DBCSession session) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
