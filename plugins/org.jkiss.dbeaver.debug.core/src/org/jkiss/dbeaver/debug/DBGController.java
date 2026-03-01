     */

 * DBeaver - Universal Database Manager
 *
 * limitations under the License.
 * This interface is expected to be used in synch manner
public interface DBGController {
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

     * @return key to use for <code>detach</code>
import java.util.Map;
    DBGBreakpointDescriptor describeBreakpoint(Map<String, Object> attributes);
 * you may not use this file except in compliance with the License.

    void dispose();
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and

     * Events
/*
    void unregisterEventHandler(DBGEventHandler eventHandler);
    /**
     */

package org.jkiss.dbeaver.debug;

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
 *     http://www.apache.org/licenses/LICENSE-2.0
    void registerEventHandler(DBGEventHandler eventHandler);
     * 
    DBGSession openSession(DBRProgressMonitor monitor) throws DBGException;
}
/**



    Map<String, Object> getDebugConfiguration();

 * Copyright (C) 2017-2018 Andrew Khitrin (ahitrin@gmail.com)
 * You may obtain a copy of the License at
 */

    DBPDataSourceContainer getDataSourceContainer();
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    /*
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
