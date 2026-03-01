/*
    public static String TAG_BACKUP = "backup";
 * DBeaver - Universal Database Manager
    @NotNull
    @NotNull
        this.classType = new ObjectType(cfg, "class");

 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable


            } catch (DBException e) {
import org.jkiss.dbeaver.DBException;
    }
                instance = classType.createInstance(JDBCDatabaseBackupHandler.class);
 *
    }
        this.dialect = cfg.getAttribute("dialect");
        return instance;
    public JDBCDatabaseBackupHandler getInstance() {
        super(cfg);
        }
import org.jkiss.code.NotNull;
                throw new IllegalStateException("Can not instantiate backup '" + classType.getImplName() + "'", e);
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
import org.eclipse.core.runtime.IConfigurationElement;
public class JDBCDatabaseBackupDescriptor extends AbstractDescriptor {
            try {



 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.model.sql.backup;
        return dialect;
    public JDBCDatabaseBackupDescriptor(@NotNull IConfigurationElement cfg) {
    private JDBCDatabaseBackupHandler instance;
    private final String dialect;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
    public String getDialect() {
 * limitations under the License.
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and

 * Licensed under the Apache License, Version 2.0 (the "License");
            }
 *
}
    @NotNull
    }
        if (instance == null) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.Nullable;
    @Nullable
 * You may obtain a copy of the License at
 *
 */
    private final ObjectType classType;
