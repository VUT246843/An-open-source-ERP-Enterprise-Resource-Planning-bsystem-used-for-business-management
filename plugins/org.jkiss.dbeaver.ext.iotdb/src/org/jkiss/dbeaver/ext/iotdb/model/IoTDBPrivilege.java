        return kind;
    private final IoTDBDataSource dataSource;

        this.name = name;
import org.jkiss.dbeaver.model.access.DBAPrivilege;
 * See the License for the specific language governing permissions and
    @Override
        return dataSource;
import org.jkiss.dbeaver.ext.iotdb.IoTDBPrivilegeInfo;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSObject;
    public DBPDataSource getDataSource() {
 *
    @NotNull
 * you may not use this file except in compliance with the License.
        return dataSource;
public class IoTDBPrivilege implements DBAPrivilege {
 */

    }
    @Override
import org.jkiss.dbeaver.model.meta.Property;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at

    public boolean isPersisted() {

    public IoTDBPrivilegeInfo.Kind kind;
        this.kind = kind;
    public String getName() {

    }
package org.jkiss.dbeaver.ext.iotdb.model;
        return true;

    public String getDescription() {
    @Override
                          String name,
    @Override
    public DBSObject getParentObject() {

 * limitations under the License.
    }
    public final String name;
    @Property(viewable = true, order = 1)
    }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public IoTDBPrivilegeInfo.Kind getKind() {
        this.dataSource = dataSource;
/*


 * Copyright (C) 2010-2024 DBeaver Corp and others
        return name;
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
                          IoTDBPrivilegeInfo.Kind kind) {
 *
    @Override

import org.jkiss.dbeaver.model.DBPDataSource;
 * DBeaver - Universal Database Manager
    public IoTDBPrivilege(IoTDBDataSource dataSource,
 *
}
    @Nullable
        return null;
import org.jkiss.code.Nullable;

