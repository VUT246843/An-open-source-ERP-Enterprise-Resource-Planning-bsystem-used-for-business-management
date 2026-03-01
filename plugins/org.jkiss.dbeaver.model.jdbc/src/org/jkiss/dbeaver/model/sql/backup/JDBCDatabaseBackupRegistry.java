            }
                parseAttribute(ext);
            instance.loadExtensions(Platform.getExtensionRegistry());
        if (instance == null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        }
        this.descriptors.add(providerDescriptor);
    public static final String SQL_BACKUP_EXTENSION_ID = "org.jkiss.dbeaver.sqlBackup";
    private JDBCDatabaseBackupRegistry() {


    private void parseAttribute(@NotNull IConfigurationElement ext) {
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


        return instance;
    }
        return new ArrayList<>(descriptors);

import org.jkiss.dbeaver.model.sql.SQLDialect;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
            instance = new JDBCDatabaseBackupRegistry();

 * Copyright (C) 2010-2024 DBeaver Corp and others
                return descriptor;
        for (JDBCDatabaseBackupDescriptor descriptor : getDescriptors()) {
 * limitations under the License.
        for (IConfigurationElement ext : extConfigs) {
 */
    }
import org.jkiss.code.NotNull;
    private synchronized void loadExtensions(@NotNull IExtensionRegistry registry) {
 *
}
public class JDBCDatabaseBackupRegistry {
 * You may obtain a copy of the License at
    private final List<JDBCDatabaseBackupDescriptor> descriptors = new ArrayList<>();
 *
 * you may not use this file except in compliance with the License.
 *
            if (JDBCDatabaseBackupDescriptor.TAG_BACKUP.equals(ext.getName())) {
    public List<JDBCDatabaseBackupDescriptor> getDescriptors() {
    private static JDBCDatabaseBackupRegistry instance = null;

    }

    public synchronized static JDBCDatabaseBackupRegistry getInstance() {
    }
import java.util.ArrayList;
import org.eclipse.core.runtime.Platform;

            if (sqlDialect.getDialectId().equals(descriptor.getDialect())) {
package org.jkiss.dbeaver.model.sql.backup;
        }
    }
    public JDBCDatabaseBackupDescriptor getCurrentDescriptor(@NotNull SQLDialect sqlDialect) {

        return null;
/*
import org.eclipse.core.runtime.IExtensionRegistry;
        IConfigurationElement[] extConfigs = registry.getConfigurationElementsFor(SQL_BACKUP_EXTENSION_ID);
        }
import java.util.List;
import org.eclipse.core.runtime.IConfigurationElement;
 * DBeaver - Universal Database Manager

 * distributed under the License is distributed on an "AS IS" BASIS,
        JDBCDatabaseBackupDescriptor providerDescriptor = new JDBCDatabaseBackupDescriptor(ext);
 * See the License for the specific language governing permissions and
