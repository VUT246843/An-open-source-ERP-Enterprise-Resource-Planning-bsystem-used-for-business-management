        @NotNull QMTranslationHistoryItem item
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
 *


 * Unless required by applicable law or agreed to in writing, software
        queryHistory.computeIfAbsent(
 *
package org.jkiss.dbeaver.ui.ai.legacy;
            return new ArrayList<>(queries);
    public static void saveTranslationHistory(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull DBSLogicalDataSource dataSource,

 * You may obtain a copy of the License at
        if (!CommonUtils.isEmpty(queries)) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            .add(item);
    ) {
        List<QMTranslationHistoryItem> queries = queryHistory.get(dataSource.getDataSourceContainer().getId());
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.logical.DBSLogicalDataSource;
import org.jkiss.dbeaver.model.qm.QMTranslationHistoryItem;
    public static List<QMTranslationHistoryItem> readTranslationHistory(@NotNull DBSLogicalDataSource dataSource) {
}
    }
 * DBeaver - Universal Database Manager
import org.jkiss.utils.CommonUtils;
    private static final Map<String, List<QMTranslationHistoryItem>> queryHistory = new HashMap<>();
 * you may not use this file except in compliance with the License.

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
            dataSource.getDataSourceContainer().getId(), s -> new ArrayList<>())
import java.util.*;

 */
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
        return Collections.emptyList();
public class InMemoryHistoryManager {
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
        }

