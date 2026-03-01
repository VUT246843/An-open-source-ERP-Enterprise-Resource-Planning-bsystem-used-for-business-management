 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,

    DBPExternalConfiguration getExternalConfiguration();

package org.jkiss.dbeaver.model;
import org.jkiss.dbeaver.model.net.DBWNetworkProfile;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.List;

 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2025 DBeaver Corp and others
    List<DBWNetworkProfile> getAvailableNetworkProfiles();
 *
 */
 * External datasource provider origin.
import org.jkiss.code.NotNull;
 */
}
import org.jkiss.code.Nullable;
    /**
 *
 * You may obtain a copy of the License at

     */

/*
 * Unless required by applicable law or agreed to in writing, software

 * limitations under the License.
public interface DBPDataSourceOriginExternal extends DBPDataSourceOrigin {
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
     * Returns external configuration ID.
    /**
     * Returns network profiles available in this origin
     */
    @NotNull
