    @Nullable

 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0

 * distributed under the License is distributed on an "AS IS" BASIS,
     */
 *

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.data.DBDDataFilter;
     * Opens new results container with specified data container and filter
    @Nullable
    /**

import org.jkiss.code.NotNull;
 * Result set provider
     * Data container (table or something).
package org.jkiss.dbeaver.ui.controls.resultset;
    /**
 * DBeaver - Universal Database Manager
 *
 *

    boolean isReadyToRun();
     * May be null if results container is hosted by some external file editor.
 * limitations under the License.

    void openNewContainer(DBRProgressMonitor monitor, @NotNull DBSDataContainer dataContainer, @NotNull DBDDataFilter newFilter);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }

     * Owner project.
public interface IResultSetContainer extends DBPContextProvider, IResultSetProvider {
 */
 * Unless required by applicable law or agreed to in writing, software

 */
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
}
     */
     * @param dataContainer data container
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBPContextProvider;
import org.jkiss.dbeaver.model.app.DBPProject;

/**
     */
/*
    DBPProject getProject();
    default IResultSetContainer getParentContainer() {
     * @param newFilter     data filter
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Nullable
     * @return data container or null

    DBSDataContainer getDataContainer();
    /**
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return null;
    IResultSetDecorator createResultSetDecorator();
