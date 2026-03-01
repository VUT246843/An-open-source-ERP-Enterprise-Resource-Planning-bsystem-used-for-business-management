 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DB2StatefulObject
/**
 *
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * @author Denis Forveille
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others

 */
import org.jkiss.dbeaver.model.DBPStatefulObject;
 * Unless required by applicable law or agreed to in writing, software
    DB2DataSource getDataSource();
 * 
import org.jkiss.code.NotNull;
 * limitations under the License.
}

import org.jkiss.dbeaver.ext.db2.model.DB2Schema;
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
    DB2Schema getSchema();
 */
 * You may obtain a copy of the License at
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *

package org.jkiss.dbeaver.ext.db2.editors;
public interface DB2StatefulObject extends DBSObject, DBPStatefulObject {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.struct.DBSObject;
    @NotNull
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;

