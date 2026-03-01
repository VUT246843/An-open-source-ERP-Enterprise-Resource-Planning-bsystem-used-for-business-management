import org.jkiss.code.NotNull;
    }
 * You may obtain a copy of the License at
        return fileList.isEmpty() ? "" : fileList.getFirst().toString();
    protected String createDatabaseName(@NotNull List<Path> fileList) {
 * See the License for the specific language governing permissions and

 *
 * limitations under the License.
 * DuckDB file handler
    @Override
import java.nio.file.Path;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software

    @Override

 */
/**
        return "duckdb";
    protected CompositeObjectId getDriverReference() {
/*
 * DBeaver - Universal Database Manager
 *
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


    @Override

    }
import org.jkiss.api.CompositeObjectId;
    }
    }
import java.util.List;
 * distributed under the License is distributed on an "AS IS" BASIS,
    protected String createConnectionName(@NotNull List<Path> fileList) {
        return new CompositeObjectId("duckdb", "duckdb_jdbc");
public class DuckDBFileDatabaseHandler extends AbstractFileDatabaseHandler {
import org.jkiss.dbeaver.ui.actions.AbstractFileDatabaseHandler;
    protected String getDatabaseTerm() {
 *
    protected boolean isSingleDatabaseConnection() {

        return false;
 * you may not use this file except in compliance with the License.
    @Override
}
package org.jkiss.dbeaver.ext.duckdb.ui;
        return createDatabaseName(fileList);
 * Licensed under the Apache License, Version 2.0 (the "License");

