    public void addRow(DashboardDatasetRow row) {
import java.util.ArrayList;

package org.jkiss.dbeaver.model.dashboard.data;
    }

        return rows;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
    public String[] getColumnNames() {
 *

import java.util.List;

        return columnNames;
    }
/**
        this.columnNames = columnNames;
public class DashboardDataset {
        rows.add(row);
/*
 * Unless required by applicable law or agreed to in writing, software
    private final List<DashboardDatasetRow> rows = new ArrayList<>();



 * Dashboard raw dataset
 */
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

    private final String[] columnNames;
 * limitations under the License.
 */
    }
 * you may not use this file except in compliance with the License.
 *
 *
    public DashboardDataset(String[] columnNames) {
    public List<DashboardDatasetRow> getRows() {
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
