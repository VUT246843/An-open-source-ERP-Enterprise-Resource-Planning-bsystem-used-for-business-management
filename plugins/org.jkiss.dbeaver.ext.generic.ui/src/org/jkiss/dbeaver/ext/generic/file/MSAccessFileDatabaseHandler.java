
    @Override
 */
    protected boolean isSingleDatabaseConnection() {

 *
    }
        return new CompositeObjectId("generic", "msaccess_ucanaccess");

import org.jkiss.code.NotNull;
import java.nio.file.Path;
 */
}
        return fileList.isEmpty() ? "" : fileList.getFirst().toString();

package org.jkiss.dbeaver.ext.generic.file;
    }
/*
import org.jkiss.dbeaver.ui.actions.AbstractFileDatabaseHandler;
 *
    @Override
    }
 * MS Access file handler
    protected String createDatabaseName(@NotNull List<Path> fileList) {
        return "ms access";
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
    protected String createConnectionName(@NotNull List<Path> fileList) {
        return false;

 * Copyright (C) 2010-2026 DBeaver Corp and others

 * limitations under the License.
 * You may obtain a copy of the License at
 *
    @Override
    @Override
    protected CompositeObjectId getDriverReference() {
import java.util.List;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
/**
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.api.CompositeObjectId;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
public class MSAccessFileDatabaseHandler extends AbstractFileDatabaseHandler {
        return createDatabaseName(fileList);

    }

    protected String getDatabaseTerm() {
    @Override
