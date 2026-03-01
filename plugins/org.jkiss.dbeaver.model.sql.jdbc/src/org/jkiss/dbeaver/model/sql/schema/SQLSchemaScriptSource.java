 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @Nullable String specificPrefix

 * SQL schema manager.
import org.jkiss.code.Nullable;
    ) throws IOException, DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
        @Nullable String specificPrefix
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.io.IOException;
public interface SQLSchemaScriptSource {
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;

}
    @Nullable
    ) throws IOException, DBException;
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
        @NotNull DBRProgressMonitor monitor,


 *
 * Upgrades schema version if needed.


        int versionNumber,
 */
 */
import java.io.Reader;
 *
/**
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;

        @NotNull DBRProgressMonitor monitor,
 *
 * limitations under the License.
    Reader openSchemaUpdateScript(
package org.jkiss.dbeaver.model.sql.schema;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
    Reader openSchemaCreateScript(
 * Converts schema create/update scripts into target database dialect.
