    String OPTION_SKIP_BIND_VALUES = "data.manipulate.skipBindValues";//$NON-NLS-1$
 */
    @NotNull
 * DBeaver - Universal Database Manager

import java.util.List;
        @NotNull DBCSession session,
    String INSERT_NONE_METHOD = "<None>";
import java.util.Map;
    }
        @NotNull DBCExecutionSource source)
    ExecuteBatch updateData(
package org.jkiss.dbeaver.model.struct;
    String OPTION_DISABLE_BATCHES = "data.manipulate.disableBatches";//$NON-NLS-1$
        @NotNull DBSAttributeBase[] attributes,
        @NotNull DBSAttributeBase[] updateAttributes,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    DBCStatistics truncateData(
        throws DBException;
    String FEATURE_DATA_UPDATE = "data.update";
import org.jkiss.dbeaver.model.exec.DBCException;
    ExecuteBatch insertData(
import org.jkiss.dbeaver.model.exec.DBCStatistics;
        void add(@NotNull Object[] attributeValues) throws DBCException;
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
        @NotNull DBCExecutionSource source)
import org.jkiss.dbeaver.model.data.DBDDataReceiver;

import org.jkiss.dbeaver.model.exec.DBCSession;
    String FEATURE_DATA_INSERT = "data.insert";


    @NotNull
/*
import org.jkiss.dbeaver.DBException;
        @NotNull
        DBCStatistics execute(@NotNull DBCSession session, @NotNull Map<String, Object> options) throws DBException;

        @Nullable DBDDataReceiver keysReceiver,
        @NotNull DBSAttributeBase[] keyAttributes,

    ExecuteBatch deleteData(
    @NotNull
        throws DBException;
            @NotNull Map<String, Object> options
    String FEATURE_DATA_DELETE = "data.delete";
        @NotNull DBCExecutionSource source,
 */
}

        throws DBException;
 * Data manipulator.

    interface ExecuteBatch extends AutoCloseable {
 *
    String FEATURE_DATA_TRUNCATE = "data.truncate";
 * Extends data container and provides additional methods to manipulate underlying data.
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull DBCSession session,
        @NotNull DBCExecutionSource source)
        @Nullable DBDDataReceiver keysReceiver,
/**
    String OPTION_USE_CURRENT_DIALECT_SETTINGS = "data.manipulate.useCurrentDialect";//$NON-NLS-1$


 * you may not use this file except in compliance with the License.
            @NotNull DBCSession session,
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.exec.DBCExecutionSource;
 * distributed under the License is distributed on an "AS IS" BASIS,

    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");


        ) throws DBException;
        @NotNull DBCSession session,
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
        @NotNull Map<String, Object> options)
        @NotNull DBCSession session,

        throws DBException;
 * Copyright (C) 2010-2025 DBeaver Corp and others

    String OPTION_INSERT_REPLACE_METHOD = "data.manipulate.insertReplaceMethod";//$NON-NLS-1$
 *
 *
 * You may obtain a copy of the License at
        @NotNull DBSAttributeBase[] keyAttributes,
import org.jkiss.code.NotNull;

        void generatePersistActions(
public interface DBSDataManipulator extends DBSDataContainer {
        void close();
            @NotNull List<DBEPersistAction> actions,
    String OPTION_MULTI_INSERT_BATCH_SIZE = "data.manipulate.multiInsertBatchSize";//$NON-NLS-1$
    String OPTION_USE_MULTI_INSERT = "data.manipulate.useMultiInsert";//$NON-NLS-1$
