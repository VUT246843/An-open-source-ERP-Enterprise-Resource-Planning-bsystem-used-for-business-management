    String getDescription();
 * You may obtain a copy of the License at
    @NotNull
 * limitations under the License.
/*
import org.jkiss.code.NotNull;
}
 * you may not use this file except in compliance with the License.

 */

    void setParent(@Nullable DBPDataSourceFolder parent);
    @NotNull
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
    DBPDataSourceRegistry getDataSourceRegistry();

 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Nullable
 *
 */

    DBPDataSourceFolder[] getChildren();
 * Datasource folder
 * DBeaver - Universal Database Manager
import org.jkiss.code.Nullable;
/**
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
 * Licensed under the Apache License, Version 2.0 (the "License");

package org.jkiss.dbeaver.model;
    DBPDataSourceFolder getParent();
    @Nullable
 *


    boolean canMoveTo(@NotNull DBPDataSourceFolder folder);
    String getFolderPath();

public interface DBPDataSourceFolder extends DBPNamedObject2 {
    @NotNull

