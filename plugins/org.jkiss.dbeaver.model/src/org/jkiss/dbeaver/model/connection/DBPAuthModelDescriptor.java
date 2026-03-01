 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * You may obtain a copy of the License at

import org.jkiss.dbeaver.model.DBPNamedObject;
import org.jkiss.code.Nullable;

    @NotNull
    DBPAuthModelDescriptor getReplacedBy(@NotNull DBPDriver driver);
 * limitations under the License.
    String getDescription();

 * See the License for the specific language governing permissions and


/**
 * distributed under the License is distributed on an "AS IS" BASIS,
    boolean isApplicableTo(DBPDriver driver);
 */
    boolean isCloudModel();
    <T extends DBAAuthCredentials> DBAAuthModel<T> getInstance();
    boolean requiresLocalConfiguration();
    DBPImage getIcon();
    @NotNull
    @Nullable
    @NotNull

    @Nullable
 */
import org.jkiss.dbeaver.model.DBPImage;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
}
    // Model works in desktop application only
import org.jkiss.code.NotNull;
    // Auth model which replaced this one. Usually null
    /**
 *     http://www.apache.org/licenses/LICENSE-2.0
     * Null - if additional authorization is not required
 * Unless required by applicable law or agreed to in writing, software
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
    @NotNull
    // Model works in cloud mode only



    String getImplClassName();
    DBPPropertySource createCredentialsSource(@Nullable DBPDataSourceContainer dataSource, @Nullable DBPConnectionConfiguration configuration);

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.access.DBAAuthModel;
    String getId();
 * you may not use this file except in compliance with the License.
    // Model needs a configuration on a local FS

 *
    boolean isDesktopModel();
     * Returns id of required external authorization.
package org.jkiss.dbeaver.model.connection;
 * Data source provider descriptor
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;

 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.access.DBAAuthCredentials;
    String getRequiredAuthProviderId();

public interface DBPAuthModelDescriptor extends DBPNamedObject, DBPDriverLibraryProvider {

     */
    boolean isDefaultModel();
