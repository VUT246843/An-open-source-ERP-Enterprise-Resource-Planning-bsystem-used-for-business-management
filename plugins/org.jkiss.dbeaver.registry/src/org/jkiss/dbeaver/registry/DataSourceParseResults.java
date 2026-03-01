    public final Set<DBPDataSourceContainer> removedDataSources = new LinkedHashSet<>();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public final Set<DBPDataSourceContainer> addedDataSources = new LinkedHashSet<>();
    public final Set<DBPDataSourceContainer> updatedDataSources = new LinkedHashSet<>();

 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
public class DataSourceParseResults {
}
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.Set;
import java.util.LinkedHashSet;
 *
import org.jkiss.dbeaver.model.DBPDataSourceFolder;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.registry;

 * you may not use this file except in compliance with the License.
 */
    public final Set<DBPDataSourceFolder> removedFolders = new LinkedHashSet<>();
    public final Set<DBPDataSourceFolder> addedFolders = new LinkedHashSet<>();
/*
 *
    public final Set<DBPDataSourceFolder> updatedFolders = new LinkedHashSet<>();
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

 * DBeaver - Universal Database Manager
 *
