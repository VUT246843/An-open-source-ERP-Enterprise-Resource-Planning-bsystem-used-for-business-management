 * Unless required by applicable law or agreed to in writing, software
public class PostgreDebugControllerFactory implements DBGControllerFactory {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.debug.DBGController;
import java.util.Map;
import org.jkiss.dbeaver.debug.DBGException;
    }

package org.jkiss.dbeaver.ext.postgresql.debug.internal.impl;

/*
 * you may not use this file except in compliance with the License.

 */
 * See the License for the specific language governing permissions and
        return new PostgreDebugController(dataSource, context);
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 *
 * Copyright (C) 2017-2018 Andrew Khitrin (ahitrin@gmail.com)
import org.jkiss.dbeaver.debug.DBGControllerFactory;
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)

 *
}
    public DBGController createController(DBPDataSourceContainer dataSource, Map<String, Object> context) throws DBGException {
