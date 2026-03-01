    protected String createConnectionName(@NotNull List<Path> fileList) {
    protected String createDatabaseName(@NotNull List<Path> fileList) {
        return SQLiteUtils.DRIVER_REFERENCE;
/**
 *
    }
    protected String getDatabaseTerm() {
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

import org.jkiss.api.CompositeObjectId;
        return false;
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class SQLiteFileDatabaseHandler extends AbstractFileDatabaseHandler {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 * Unless required by applicable law or agreed to in writing, software
    protected CompositeObjectId getDriverReference() {
    }
package org.jkiss.dbeaver.ext.sqlite.ui;
 * See the License for the specific language governing permissions and
import java.util.List;
 *

    }
import org.jkiss.dbeaver.ext.sqlite.SQLiteUtils;


    @Override
        return "sqlite file";

    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0


 * SQLite file handler
/*
    }
 * DBeaver - Universal Database Manager
}
 *
    protected boolean isSingleDatabaseConnection() {
import java.nio.file.Path;
 */

 * Copyright (C) 2010-2025 DBeaver Corp and others
        return createDatabaseName(fileList);
import org.jkiss.dbeaver.ui.actions.AbstractFileDatabaseHandler;
    @Override
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 * limitations under the License.
        return fileList.isEmpty() ? "" : fileList.getFirst().toString();
    @Override
    }
