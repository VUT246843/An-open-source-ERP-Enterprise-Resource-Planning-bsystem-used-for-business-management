package org.jkiss.dbeaver.model.connection;
 * This interface can be implemented by data source provider to support native client functions.
    String getProductVersion(DBPNativeClientLocation location);
 * limitations under the License.
 * See the License for the specific language governing permissions and
    default boolean supportsNativeClients() {

     */

 * Copyright (C) 2010-2024 DBeaver Corp and others
/**
    }

        return true;
 * You may obtain a copy of the License at
    String getProductName(DBPNativeClientLocation location);
    DBPNativeClientLocation getDefaultLocalClientLocation();
import java.util.List;
 * Licensed under the Apache License, Version 2.0 (the "License");
     * @return false if provider child doesn't support native clients
 *

public interface DBPNativeClientLocationManager {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Native client manager.
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 *

 */
 * Unless required by applicable law or agreed to in writing, software
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    List<DBPNativeClientLocation> findLocalClientLocations();

    /**
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager

}
