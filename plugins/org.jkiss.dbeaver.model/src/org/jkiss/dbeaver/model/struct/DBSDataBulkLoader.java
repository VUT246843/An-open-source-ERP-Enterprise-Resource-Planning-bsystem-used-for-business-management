
        @NotNull DBCExecutionSource source,
/**
 * you may not use this file except in compliance with the License.
 */
        @NotNull DBSAttributeBase[] attributes,
 * distributed under the License is distributed on an "AS IS" BASIS,

        void finishBulkLoad(@NotNull DBCSession session) throws DBCException;
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
        void addRow(@NotNull DBCSession session, @NotNull Object[] attributeValues) throws DBCException;

        @NotNull Map<String, Object> options)
    interface BulkLoadManager extends AutoCloseable {
 *     http://www.apache.org/licenses/LICENSE-2.0

 *
public interface DBSDataBulkLoader {
 * Unless required by applicable law or agreed to in writing, software
/*
import org.jkiss.dbeaver.model.exec.DBCException;

        int batchSize,

        void close();

 *


 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.DBCSession;
        @NotNull DBSDataContainer dataContainer,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
 * DBeaver - Universal Database Manager
    BulkLoadManager createBulkLoad(
}
import org.jkiss.dbeaver.model.exec.DBCExecutionSource;
package org.jkiss.dbeaver.model.struct;

 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * limitations under the License.
 * See the License for the specific language governing permissions and
    }
        void flushRows(@NotNull DBCSession session) throws DBCException;
        throws DBCException;
import java.util.Map;
        @NotNull DBCSession session,
 * Data bulk loader
import org.jkiss.code.NotNull;
