import org.jkiss.dbeaver.model.runtime.OSDescriptor;
import org.jkiss.dbeaver.model.net.DBWHandlerRegistry;
import java.io.IOException;
import org.jkiss.dbeaver.model.sql.SQLDialectMetadataRegistry;
/**


     * Task controller can read and change tasks configuration file

    DBWHandlerRegistry getNetworkHandlerRegistry();
 * distributed under the License is distributed on an "AS IS" BASIS,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    DBPDataFormatterRegistry getDataFormatterRegistry();
    DBNModel getNavigatorModel();
    DBACertificateStorage getCertificateStorage();
    /**

    @NotNull

 * Licensed under the Apache License, Version 2.0 (the "License");
    

}
    /**
import java.nio.file.Path;

    @NotNull
import org.jkiss.dbeaver.model.qm.QMRegistry;

    Path getTempFolder(@NotNull DBRProgressMonitor monitor, @NotNull String name) throws IOException;

    @NotNull

     */


     * Returns platform configuration controller,
    @Deprecated // use navigator model from DBPProject
    DBDRegistry getValueHandlerRegistry();
 */
    QMRegistry getQueryManager();
     */
    /**

import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderRegistry;

    @NotNull
     * which keeps product configuration which can be shared with other users.
    DBPWorkspace getWorkspace();
     */

    @NotNull
 * See the License for the specific language governing permissions and
    DBFRegistry getFileSystemRegistry();
import org.jkiss.dbeaver.model.edit.DBERegistry;
import org.jkiss.dbeaver.model.navigator.DBNModel;
     * which keeps plugin configuration which can be shared with other users.
    @Deprecated
     * Returns global QM registry
    @NotNull
    default boolean isUnitTestMode() {


 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.fs.DBFRegistry;

    @NotNull
    @NotNull
    }

     * which keeps configuration which can be shared with other users.
    /**
        return false;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    DBConfigurationController getPluginConfigurationController(@Nullable String pluginId);
     */
     */
 * DBPPlatform
    boolean isShuttingDown();
 *
    /**

    DBTTaskController getTaskController();
     * File controller allows to read/write binary files (e.g. custom driver libraries)
 *
    @NotNull
import org.jkiss.dbeaver.model.DBConfigurationController;
    @NotNull

    DBPDataSourceProviderRegistry getDataSourceProviderRegistry();
     * Local config files are used to store some configuration specific to local machine only.
    @NotNull

     * Returns configuration controller,
    DBERegistry getEditorsRegistry();
    @NotNull
    /**
    @NotNull

    @NotNull
     */

    @NotNull
import org.jkiss.dbeaver.model.data.DBDRegistry;
import org.jkiss.code.Nullable;
    
    DBPPreferenceStore getPreferenceStore();
    DBConfigurationController getProductConfigurationController();
    @NotNull
import org.jkiss.code.NotNull;
package org.jkiss.dbeaver.model.app;
/*
    @NotNull
    Path getApplicationConfiguration();
 *
    @NotNull
     */
    @NotNull
    Path getLocalConfigurationFile(String fileName);

    OSDescriptor getLocalSystem();
 * limitations under the License.
    DBFileController getFileController();
    DBConfigurationController getConfigurationController();
     * Returns configuration controller,
 */
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.task.DBTTaskController;
    DBPApplication getApplication();
import org.jkiss.dbeaver.model.DBFileController;
 *     http://www.apache.org/licenses/LICENSE-2.0
public interface DBPPlatform {
    @NotNull
    SQLDialectMetadataRegistry getSQLDialectRegistry();
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    /**

    @NotNull
