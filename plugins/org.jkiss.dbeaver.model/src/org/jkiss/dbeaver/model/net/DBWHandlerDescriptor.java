     * Handler properties.
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
/*
    String getLabel();


 * Copyright (C) 2010-2026 DBeaver Corp and others
     */
 */
 * you may not use this file except in compliance with the License.


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    String getId();
    @NotNull
import org.jkiss.dbeaver.DBException;
    /**
public interface DBWHandlerDescriptor {
import org.jkiss.code.NotNull;
 *
    boolean isDistributed();
    DBWHandlerType getType();
 *     http://www.apache.org/licenses/LICENSE-2.0
    String getImplClassName();
     */
 * limitations under the License.
}
    @NotNull

 * You may obtain a copy of the License at


     * Unique ID
 * DBeaver - Universal Database Manager

    /**
     * Handler type
     */
    DBPPropertyDescriptor[] getHandlerProperties();
package org.jkiss.dbeaver.model.net;

    @NotNull
    boolean isSecured();

     */
     * Whether this network handler requires a connection to exist on the remote server

     * Can be used for DBWHandlerConfiguration.properties setup.
    <T extends DBWNetworkHandler> T createHandler(Class<T> impl) throws DBException;
    /**

    @NotNull
    String getPrefix();
 * Network handler descriptor
 */
    String getCodeName();
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
/**

    /**
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
 * Licensed under the Apache License, Version 2.0 (the "License");
    String getDescription();

 *
