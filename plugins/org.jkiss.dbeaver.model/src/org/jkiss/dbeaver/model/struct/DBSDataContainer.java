    String FEATURE_DATA_READ_FETCHED = "data.read.fetched";

     * @param dataFilter data filter. May be null
     * @param session source
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.dbeaver.model.data.DBDDataFilter;
     * @return number of rows in container. May return negative values if count feature is not available
    long FLAG_FETCH_SEGMENT         = 1 << 4;
    String FEATURE_DATA_MODIFIED_ON_REFRESH = "data.modifying";
        long flags,
    @NotNull
        @NotNull DBCSession session,
 *     http://www.apache.org/licenses/LICENSE-2.0
     * @param fetchSize fetch size
    long FLAG_READ_PSEUDO           = 1 << 1;
    long FLAG_REFRESH               = 1 << 8;

        throws DBException;
 *
     * @param session session
        int fetchSize)
    long FLAG_NONE                  = 0;
     */
     *
     *
 *

    String FEATURE_KEY_VALUE = "data.key.value";
public interface DBSDataContainer extends DBSObject {
     * @param dataFilter data filter (may be null)
        long firstRow,
 * distributed under the License is distributed on an "AS IS" BASIS,
    /**
 */
        @NotNull DBDDataReceiver dataReceiver,
     * Reads data from container and pushes it into receiver


        @Nullable DBCExecutionSource source,
import org.jkiss.dbeaver.model.exec.DBCSession;
    String FEATURE_DATA_SEARCH = "data.search";
     */
 * Provides facilities to query object for data.
    long FLAG_USE_SELECTED_COLUMNS  = 1 << 3;
 * Data container.
import org.jkiss.code.NotNull;
    }
    /**

import org.jkiss.dbeaver.model.exec.DBCException;
        return ArrayUtils.contains(getSupportedFeatures(), feature);
     * @param maxRows total rows to fetch (<= 0 means fetch everything)
     * @param flags read flags. See FLAG_ constants
        @NotNull DBCSession session,

import org.jkiss.dbeaver.model.exec.DBCExecutionSource;
     * @return number of fetched rows
     * Features supported by implementation
    long FLAG_USE_FETCHED_ROWS      = 1 << 5;
     * @param source execution source
    default boolean isFeatureSupported(@NotNull String feature) {
    String FEATURE_DATA_FILTER = "data.filter";
     */
 * DBeaver - Universal Database Manager
    DBCStatistics readData(
 * You may obtain a copy of the License at
        long maxRows,
 *
     * @throws DBCException on any error
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");

    String FEATURE_DATA_COUNT = "data.count";
package org.jkiss.dbeaver.model.struct;
 * Any data container MUST support data read. Other function may be not supported (client can check it with {@link #getSupportedFeatures()}).
 */
import org.jkiss.dbeaver.model.exec.DBCStatistics;
    long countData(
        @Nullable DBDDataFilter dataFilter,
        long flags)

     * @param flags read flags. See FLAG_ constants
     * @return supported features
    String FEATURE_DATA_SELECT = "data.select";
import org.jkiss.dbeaver.model.data.DBDDataReceiver;
    DBPDataSource getDataSource();

     * @throws DBCException on any error
     * @param source       source
    long FLAG_USE_SELECTED_ROWS     = 1 << 2;
     * @param dataReceiver data receiver. Works as a data pipe
 * limitations under the License.
        @NotNull DBCExecutionSource source,
        throws DBException;
import org.jkiss.code.Nullable;
    @NotNull
    /**
import org.jkiss.dbeaver.model.DBPDataSource;
 * you may not use this file except in compliance with the License.
        @Nullable DBDDataFilter dataFilter,
     * @param firstRow first row number (<= 0 means do not use it)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    String[] getSupportedFeatures();

import org.jkiss.utils.ArrayUtils;
 * Unless required by applicable law or agreed to in writing, software
    @Nullable
/**
}
     * Counts data rows in container.
/*
import org.jkiss.dbeaver.DBException;
