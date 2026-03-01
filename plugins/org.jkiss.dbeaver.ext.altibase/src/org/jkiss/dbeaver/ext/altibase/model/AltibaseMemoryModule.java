        this.allocSizeInBytes = JDBCUtils.safeGetLong(dbResult, "ALLOC_SIZE");
 *     http://www.apache.org/licenses/LICENSE-2.0
        return name;
 * limitations under the License.

        return allocSizeInBytes;
    public String getName() {
    private String name;
        super((AltibaseDataSource) parent.getDataSource(), true);

package org.jkiss.dbeaver.ext.altibase.model;
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
    public long getAllocCount() {
import org.jkiss.code.NotNull;

        this.allocCount = JDBCUtils.safeGetLong(dbResult, "ALLOC_COUNT");
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * Copyright (C) 2010-2024 DBeaver Corp and others

    @Property(viewable = true, order = 3)
    }
    }
    private long allocSizeInBytes;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * Unless required by applicable law or agreed to in writing, software
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
public class AltibaseMemoryModule extends AltibaseGlobalObject {
    @NotNull
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
import org.jkiss.utils.ByteNumberFormat;
    @Property(viewable = true, order = 1)
 * See the License for the specific language governing permissions and


    public long getAllocSize() {
import org.jkiss.dbeaver.model.meta.Property;
 * You may obtain a copy of the License at
    private long allocCount;

 * you may not use this file except in compliance with the License.
    @Property(viewable = true, order = 2, formatter = ByteNumberFormat.class)
        return allocCount;
 *
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

}    }
        this.name = JDBCUtils.safeGetString(dbResult, "NAME");
    AltibaseMemoryModule(GenericStructContainer parent, JDBCResultSet dbResult) {
