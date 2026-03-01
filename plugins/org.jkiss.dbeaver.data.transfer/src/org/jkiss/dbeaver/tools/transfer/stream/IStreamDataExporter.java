import org.jkiss.dbeaver.DBException;
        throws DBException, IOException;
        throws DBException, IOException;
    void exportRow(DBCSession session, DBCResultSet resultSet, Object[] row)
import org.jkiss.dbeaver.model.exec.DBCResultSet;
    void init(IStreamDataExporterSite site)

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

import org.jkiss.dbeaver.tools.transfer.IDataTransferProcessor;
 * You may obtain a copy of the License at
        throws DBException;
 * Licensed under the Apache License, Version 2.0 (the "License");
    void exportHeader(DBCSession session)
        throws DBException, IOException;
 * Unless required by applicable law or agreed to in writing, software

 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
 */

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

import org.jkiss.dbeaver.model.exec.DBCSession;

 *
}
public interface IStreamDataExporter extends IDataTransferProcessor {
 */
package org.jkiss.dbeaver.tools.transfer.stream;
    void exportFooter(DBRProgressMonitor monitor)
 * limitations under the License.
 * IStreamDataExporter
 *     http://www.apache.org/licenses/LICENSE-2.0
    void dispose();

 * Copyright (C) 2010-2024 DBeaver Corp and others
/**

import java.io.IOException;


/*
