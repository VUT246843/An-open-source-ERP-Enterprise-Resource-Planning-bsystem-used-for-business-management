 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.model.connection;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.

import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
 *

 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Copyright (C) 2010-2024 DBeaver Corp and others
public interface DBPDriverSubstitutionDescriptor extends DBPNamedObject {
    String getId();
}
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPNamedObject;
 * You may obtain a copy of the License at
/*
 * See the License for the specific language governing permissions and
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    String getDriverId();
    DBPDriverSubstitution getInstance();
    @NotNull
    @NotNull

 *
    @NotNull
    String getProviderId();
    @NotNull
