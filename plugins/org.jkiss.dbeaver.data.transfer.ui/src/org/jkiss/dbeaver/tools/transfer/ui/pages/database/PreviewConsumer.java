                return super.isCanceled() || fetchEnded;
public class PreviewConsumer extends DatabaseTransferConsumer {
    private final int previewRowCount;
    }
 * limitations under the License.
    ) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.dbeaver.tools.transfer.ui.pages.database;
    }
        super.fetchRow(session, resultSet);

        setPreview(true);
 * See the License for the specific language governing permissions and
}
 *
            @Override

            public boolean isCanceled() {
    public DBRProgressMonitor getCtlMonitor() {
        return getPreviewRows();
        DBRProgressMonitor monitor,
        DatabaseMappingContainer mappingContainer, int previewRowCount
 *
import org.jkiss.dbeaver.tools.transfer.database.DatabaseMappingContainer;

        return ctlMonitor;
            fetchEnded = true;
    private boolean fetchEnded;

 * you may not use this file except in compliance with the License.
/*
import org.jkiss.dbeaver.model.exec.DBCException;
        if (getPreviewRows().size() >= previewRowCount) {
        }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.DBCResultSet;
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final DBRProgressMonitor ctlMonitor;
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
    public List<Object[]> getRows() {
    @Override
        super(mappingContainer.getTarget());
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void fetchRow(@NotNull DBCSession session, @NotNull DBCResultSet resultSet) throws DBCException {
import org.jkiss.dbeaver.model.runtime.ProxyProgressMonitor;
            return;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.List;
    }



        ctlMonitor = new ProxyProgressMonitor(monitor) {
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.jkiss.dbeaver.tools.transfer.database.DatabaseTransferConsumer;
            }
import org.jkiss.dbeaver.model.exec.DBCSession;
 */
        this.previewRowCount = previewRowCount;

    public PreviewConsumer(
        };
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
