

    {
        return getPath();
    public static final String DOWNLOAD_DIR = "remote";
    public DriverLibraryRemote(@NotNull  DriverDescriptor driver, FileType type, String url) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
public class DriverLibraryRemote extends DriverLibraryLocal
import org.jkiss.code.NotNull;
/*
            log.error(e);
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
    }
import org.jkiss.dbeaver.Log;
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
    public String getExternalURL(DBRProgressMonitor monitor) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    }
 */
        return new DriverLibraryRemote(driverDescriptor, this);
            }
    @NotNull
import org.jkiss.utils.ArrayUtils;

    private static final Log log = Log.getLog(DriverLibraryRemote.class);
    }


 *
    @Override
                return DOWNLOAD_DIR + path;
        if (pos <= 0) {
}
import org.eclipse.core.runtime.IConfigurationElement;
 * You may obtain a copy of the License at
            return false;

            if (path.startsWith("/")) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
{
    @Nullable
/**
    @Override
    public boolean isDownloadable()
    public DriverLibraryRemote(@Nullable DriverDescriptor driver, @NotNull IConfigurationElement config) {
    };

        int pos = url.indexOf(":/");
    private DriverLibraryRemote(@NotNull DriverDescriptor driver, @NotNull DriverLibraryRemote copyFrom) {
        "ftp",
        super(driver, type, url);
    public static boolean supportsURL(String url) {
        try {
    }


    }
        super(driver, config);
                return DOWNLOAD_DIR + "/" + path;
        }
        "https",
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.registry.driver;

        "http",
 *
import java.net.URL;
 * limitations under the License.
            final String path = new URL(getPath()).getPath();
        return true;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * you may not use this file except in compliance with the License.

            return getPath();
    }
    @Override
    public static final String[] SUPPORTED_PROTOCOLS = {
            } else {
import org.jkiss.code.Nullable;
    }
    protected String getLocalFilePath() {
    public DBPDriverLibrary copyLibrary(@NotNull DriverDescriptor driverDescriptor) {
    @Override

        return ArrayUtils.contains(SUPPORTED_PROTOCOLS, url.substring(0, pos));
        super(driver, copyFrom);
 * DriverLibraryRemote
import java.net.MalformedURLException;
        } catch (MalformedURLException e) {

 * See the License for the specific language governing permissions and
