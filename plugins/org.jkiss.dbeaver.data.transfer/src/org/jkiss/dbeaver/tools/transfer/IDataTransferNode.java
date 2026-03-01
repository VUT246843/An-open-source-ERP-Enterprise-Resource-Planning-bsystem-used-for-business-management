 * See the License for the specific language governing permissions and
 *
/**
 *
    DBPImage getObjectContainerIcon();
    DBSObject getDatabaseObject();


 * Licensed under the Apache License, Version 2.0 (the "License");
    default String getObjectFullName(@NotNull DBRProgressMonitor monitor) throws IOException {
 * you may not use this file except in compliance with the License.
}
    }
import org.jkiss.code.NotNull;

 * Copyright (C) 2010-2025 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPImage;
    DBPProject getProject();

    String getObjectContainerName();
    DBPImage getObjectIcon();
import org.jkiss.dbeaver.model.struct.DBSObject;
 * You may obtain a copy of the License at

 * limitations under the License.
 */
package org.jkiss.dbeaver.tools.transfer;

    DBPDataSourceContainer getDataSourceContainer();

/*
 * Abstract node
    String getObjectName();
 *

    @Nullable
import java.io.IOException;
        return getObjectName();

 * Unless required by applicable law or agreed to in writing, software
 */

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

public interface IDataTransferNode<SETTINGS extends IDataTransferSettings> {

import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
    boolean isConfigurationComplete();
 * distributed under the License is distributed on an "AS IS" BASIS,

