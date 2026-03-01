package org.jkiss.dbeaver.ext.clickhouse.model;
/*
import org.jkiss.dbeaver.ext.generic.model.GenericView;
    }

import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
        super(container, tableName, tableType, dbResult);
 *
{
 *
    @Override
 * ClickhouseView

 */
    public String generateTableUpdateSet() {
        return "";
        return "ALTER TABLE " + tableName + " UPDATE ";
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
    private static final Log log = Log.getLog(ClickhouseView.class);

 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String generateTableUpdateBegin(@NotNull String tableName) {

 * you may not use this file except in compliance with the License.
public class ClickhouseView extends GenericView
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**
    @NotNull
 * limitations under the License.
    @Override
 *
    public ClickhouseView(GenericStructContainer container, @Nullable String tableName, @Nullable String tableType, @Nullable JDBCResultSet dbResult) {
    
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }

 */
 * Licensed under the Apache License, Version 2.0 (the "License");
}
    }
