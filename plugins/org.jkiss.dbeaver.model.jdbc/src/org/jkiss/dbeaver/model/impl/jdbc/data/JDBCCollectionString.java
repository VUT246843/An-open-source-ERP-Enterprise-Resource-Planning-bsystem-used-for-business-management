

        return value;
 * You may obtain a copy of the License at

    }
/**
        this.value = value;
        super(monitor, type, valueHandler, value == null ? null : new Object[] { value });
 * Original string representation provided by driver.
    public String makeArrayString(char ... brackets) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 * Collection made from string.
        this.value = value;
 *
/*
}
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.data.DBDValueHandler;

import org.jkiss.dbeaver.model.struct.DBSDataType;
 *

    }

    private String value;
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
        super(monitor, type, valueHandler, contents);
 */
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @NotNull

 * See the License for the specific language governing permissions and
 *
            return super.makeArrayString(brackets);
        }
public class JDBCCollectionString extends JDBCCollection {
        if (isModified()) {
    }
    JDBCCollectionString(@NotNull DBRProgressMonitor monitor, DBSDataType type, DBDValueHandler valueHandler, String value) {
 */
    JDBCCollectionString(@NotNull DBRProgressMonitor monitor, DBSDataType type, DBDValueHandler valueHandler, String value, Object[] contents) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.model.impl.jdbc.data;
