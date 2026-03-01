    @NotNull
import org.jkiss.code.NotNull;
    DBSTable getParentTable();

/**
package org.jkiss.dbeaver.model.struct.rdb;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
    }
 *
     * Return true for partitions directly connected with paren tables

import org.jkiss.dbeaver.model.struct.DBSObject;
 * Unless required by applicable law or agreed to in writing, software

    DBSTablePartition getPartitionParent();
    /**
     */
 * limitations under the License.


 */

 *
    boolean isSubPartition();
     * Return true if partition is subpartition
 * DBSTablePartition

 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
 */
import org.jkiss.code.Nullable;
    @Nullable
    default boolean needFullPath() {
        return true;
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
     */
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
public interface DBSTablePartition extends DBSObject {
