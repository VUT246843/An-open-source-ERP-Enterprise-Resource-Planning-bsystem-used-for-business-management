                                            row.append(dbResult.getAttributeValue(i))
 *
 *
        var contexts = new ArrayList<DBCExecutionContext>();
                                                .append("|");
    public Object execute(ExecutionEvent event) throws ExecutionException {
        }
                from all_rows AS data1
        return null;
import java.util.stream.IntStream;
}public class HandlerConnectionStressTest extends AbstractHandler {
            ),
                            false,
 *
            "");
                UNION ALL\s
        } finally {
            }
            if (element instanceof DBNDatabaseNode) {
                    }
                        int x4 = ThreadLocalRandom.current().nextInt(0, 100);

                        } catch (Exception e) {
                                        var row = new StringBuilder("|");
            e.printStackTrace();
            limit {max};
import org.jkiss.dbeaver.model.DBUtils;
/*

 * You may obtain a copy of the License at
                });
                stressTest(((DBNDatabaseNode) element).getDataSource(), maxConnections);
                            sql,
            "Number of connections",
import org.eclipse.jface.viewers.ISelection;
                select *
import org.jkiss.dbeaver.ui.dialogs.EnterNameDialog;
        try {
import org.eclipse.core.commands.AbstractHandler;
                            if (dbStat.executeStatement()) {
                                        for (int i = 0; i < COLUMNS_COUNT; i++) {
                                }
                                        row.append(" - ")
            """;
 * See the License for the specific language governing permissions and
import org.jkiss.utils.CommonUtils;
    private static final String DUMMY_SQL =
            IntStream.range(0, maxConnections).parallel()
import org.jkiss.dbeaver.model.exec.*;
                                            .append(++rowCount)
            sub_select AS (
                JOIN all_rows on 1=1
        String connectionsCount = EnterNameDialog.chooseName(UIUtils.getActiveWorkbenchShell(),
                            e.printStackTrace();
                        }
             \s
                            .replace("{max}", String.valueOf(max));
    private static final int CONNECTIONS_COUNT = 50;

 * limitations under the License.
                                .openIsolatedContext(new VoidProgressMonitor(), "Stress test", null));
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
                        int x2 = ThreadLocalRandom.current().nextInt(0, 100);
 */
package org.jkiss.dbeaver.ui.app.devtools.handlers;
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
                                    }

                from sub_select
                        int x5 = ThreadLocalRandom.current().nextInt(0, 100);
            contexts.stream().parallel()
                select id as sub_id
                        }
                            false)) {
                                try (final DBCResultSet dbResult = dbStat.openResultSet()) {
                    } catch (Exception e) {
import org.jkiss.dbeaver.model.DBPDataSource;
                select id as rows_id
                        try {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                            true,
                            .replace("{x4}", String.valueOf(x4))
                        e.printStackTrace();
                        "Stress test")) {
        """
import org.eclipse.core.commands.ExecutionEvent;
                                            .append(" " + session.getExecutionContext().getContextId());
                        var sql = DUMMY_SQL.replace("{x1}", String.valueOf(x1))
            SELECT rows_id,rows_id,rows_id,rows_id,rows_id,rows_id,rows_id,rows_id,rows_id,rows_id
    }

            for (var context : contexts) {
//                                        System.out.println(row);
                                    int rowCount = 0;
    private void stressTest(DBPDataSource dataSource, int maxConnections) {

                        DBCExecutionPurpose.USER_SCRIPT,
                    try (DBCSession session = context.openSession(new VoidProgressMonitor(),
            )
import org.eclipse.ui.handlers.HandlerUtil;
                            }
import org.jkiss.dbeaver.ui.UIUtils;
                                        }
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
 * Unless required by applicable law or agreed to in writing, software

    private static final int COLUMNS_COUNT = 10;
                                    while (dbResult.nextRow()) {
                .forEach(context -> {
                            .replace("{x2}", String.valueOf(x2))
                from (values({x1},{x1}),({x2},{x2}),({x3},{x3}),({x4},{x4}),({x5},{x5})) as t_name(id, quantity)
import java.util.ArrayList;
        }
            with recursive all_rows as (
            }

                        int x3 = ThreadLocalRandom.current().nextInt(0, 100);
        if (selection instanceof IStructuredSelection) {
import org.eclipse.jface.viewers.IStructuredSelection;
                .forEach(i -> {
                        try (DBCStatement dbStat = session.prepareStatement(DBCStatementType.EXEC,
                            .replace("{x5}", String.valueOf(x5))
                            .replace("{x3}", String.valueOf(x3))
                DBUtils.closeSafely(context);
import java.util.concurrent.ThreadLocalRandom;
 * you may not use this file except in compliance with the License.
        } catch (Exception e) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                            contexts.add(dataSource.getDefaultInstance()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (CommonUtils.isEmpty(connectionsCount)) {
                        int x1 = ThreadLocalRandom.current().nextInt(0, 100);
                        int max = ThreadLocalRandom.current().nextInt(1000, 100_000);
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
            final Object element = ((IStructuredSelection) selection).getFirstElement();
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;

import org.eclipse.core.commands.ExecutionException;
                    }
            connectionsCount = String.valueOf(CONNECTIONS_COUNT);
            FROM sub_select\s
    @Override
                );
        int maxConnections = Integer.parseInt(connectionsCount);
    }
