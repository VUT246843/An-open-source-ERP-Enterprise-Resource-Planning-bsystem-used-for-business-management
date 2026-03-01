import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.

 */
 * limitations under the License.
 * See the License for the specific language governing permissions and
    boolean isStatisticsCollected();

 * DBPObjectStatisticsCollector
 */
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.DBException;
 *
    void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException;
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
public interface DBPObjectStatisticsCollector {
}

    /**
 * distributed under the License is distributed on an "AS IS" BASIS,

/**
     */
     * Loads statistics for child objects.
package org.jkiss.dbeaver.model;
/*

 * Unless required by applicable law or agreed to in writing, software
