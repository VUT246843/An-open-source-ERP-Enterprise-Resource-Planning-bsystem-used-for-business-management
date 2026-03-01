 */
    public abstract int getMajorVersion();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSObject;
package org.jkiss.dbeaver.model.sql.task;
import org.jkiss.dbeaver.model.DBPDataSource;
/*
        }
}

 * Licensed under the Apache License, Version 2.0 (the "License");

 * Unless required by applicable law or agreed to in writing, software
            DBPDataSource dataSource = settings.getObjectList().get(0).getDataSource();
            if (dataSource instanceof JDBCDataSource) {
    public boolean isValidValue(@NotNull SETTINGS settings, @Nullable Object value) throws IllegalArgumentException {
 * distributed under the License is distributed on an "AS IS" BASIS,
                return ((JDBCDataSource) dataSource).isServerVersionAtLeast(getMajorVersion(), getMinorVersion());
 *
    @Override
 *
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
    }
    public abstract int getMinorVersion();
 * you may not use this file except in compliance with the License.
            }
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0


 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.code.Nullable;
 *

 * DBeaver - Universal Database Manager
        if (!settings.getObjectList().isEmpty()) {
public abstract class SQLToolTaskVersionValidator<SETTINGS extends SQLToolExecuteSettings<? extends DBSObject>, Object>
 * See the License for the specific language governing permissions and
        implements IPropertyValueValidator<SETTINGS, Object> {
 * You may obtain a copy of the License at
        return false;

import org.jkiss.dbeaver.model.meta.IPropertyValueValidator;
