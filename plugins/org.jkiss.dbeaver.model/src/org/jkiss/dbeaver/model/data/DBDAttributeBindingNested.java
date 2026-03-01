
import org.jkiss.utils.CommonUtils;
    public DBPDataSource getDataSource() {
    public String getRowIdentifierStatus() {
    @NotNull
package org.jkiss.dbeaver.model.data;
     * Meta attribute (obtained from result set)

    @Override
    @Override
public abstract class DBDAttributeBindingNested extends DBDAttributeBinding implements DBCAttributeMetaData {
    }
    }
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
}
    protected DBDAttributeBindingNested(
import org.jkiss.dbeaver.model.exec.DBCAttributeMetaData;
        this.parent = parent;


 *
        return obj instanceof DBDAttributeBindingNested &&
        return parent.getMetaAttribute().isReadOnly();
 * DBeaver - Universal Database Manager
    @Override
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Nested attribute binding
    }
        return parent.getDataSource();
 */
 * limitations under the License.
     */
        @NotNull DBDAttributeBinding parent,


        return null;

 * Licensed under the Apache License, Version 2.0 (the "License");
     * Row identifier (may be null)

    protected final DBDAttributeBinding parent;
 * Unless required by applicable law or agreed to in writing, software

    @NotNull

    public DBDAttributeBinding getParentObject() {
        return parent;
    public DBDRowIdentifier getRowIdentifier() {
 * You may obtain a copy of the License at
    public boolean equals(Object obj) {
    @Override
    /**

    @NotNull
    @Override
        return this;
/**
    }
import org.jkiss.dbeaver.model.struct.DBSEntityReferrer;
        return parent.getMetaAttribute().getEntityMetaData();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
    }
        return parent.getRowIdentifier();
    }

    public List<DBSEntityReferrer> getReferrers() {
import org.jkiss.dbeaver.model.exec.DBCEntityMetaData;
    /**
        return parent.getRowIdentifierStatus();
/*
    {
            CommonUtils.equalObjects(parent, ((DBDAttributeBindingNested) obj).parent);
    @NotNull
    public boolean isReadOnly() {
    }
    @Nullable
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
import org.jkiss.dbeaver.model.DBPDataSource;
    public DBCAttributeMetaData getMetaAttribute() {
        super(valueHandler);
    @Nullable
 */
import java.util.List;
    }

import org.jkiss.code.Nullable;
    public DBCEntityMetaData getEntityMetaData() {
     */
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
    }
        @NotNull DBDValueHandler valueHandler)
