package org.jkiss.dbeaver.ext.mysql.edit;
 *
 * See the License for the specific language governing permissions and
        return false;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean canRenameObject(MySQLTableBase object) {

 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
        // Creating partitions separately is not supported in MySQL/MariaDB
    public boolean canDeleteObject(@NotNull MySQLTableBase object) {
/*
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override


    }
public class MySQLPartitionTableManager extends MySQLTableManager {

 *
        return false;
    @Override
 *
 * Unless required by applicable law or agreed to in writing, software
    }
import org.jkiss.dbeaver.ext.mysql.model.MySQLTableBase;
}
 * You may obtain a copy of the License at
        return false;
    }
 */
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager

    public boolean canCreateObject(@NotNull Object container) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
