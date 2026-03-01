
 *
import java.io.File;
        new RuntimePermission("createClassLoader"),
 * See the License for the specific language governing permissions and
        new RuntimePermission("getenv.*")
                driverFilesPermissions.add(new FilePermission(relativeFilePath, "read")); // access to directory

import java.nio.file.Files;
            //We need different permissions to work with a file by relative path and by absolute
import java.security.*;
    }

        for (Permission permission : permissions) {
            if (Files.isDirectory(libraryFile)) {
            return callable.call();
        } catch (Throwable e) {

 * limitations under the License.
                }

        return driverFilesPermissions;
            //unsecured connection created by user
import java.net.SocketPermission;
            String absoluteFilePath = libraryFile.toAbsolutePath().toString();
/*
            noPermissions.add(permission);
            if (libraryFile == null) {
        new NetPermission("*"),
    }

        if (System.getSecurityManager() != null
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
package org.jkiss.dbeaver.utils;
import org.osgi.framework.AdminPermission;
import java.util.List;
                try {
        }
import java.nio.file.Path;
        new ReflectPermission("*"),
                    throw new RuntimeException(e);
        var driver = container.getDriver();
            Path libraryFile = driverLibrary.getLocalFile();
    }
            }
        );
            && DBWorkbench.getPlatform().getApplication().isMultiuser()
import java.util.PropertyPermission;
            new ProtectionDomain[]{new ProtectionDomain(null, noPermissions)}
    }
                    return callable.call();
            var permissions = SecurityManagerUtils.getDefaultPermissions();
            && container.isAccessCheckRequired()
            }
import java.io.FilePermission;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        new AdminPermission(),
            String relativeFilePath = libraryFile.toString();
}
 * Unless required by applicable law or agreed to in writing, software
        new PropertyPermission("*", "read"),

        }
        var driverLibraries = driver.getDriverLibraries();
        } else {
        try {
import org.jkiss.dbeaver.model.connection.DBPDriver;
            }

        noPermissions.setReadOnly();
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
            if (throwable instanceof RuntimeException && throwable.getCause() != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            permissions.addAll(getDriverFilesPermissions(driver));
        return new AccessControlContext(
    private static final List<Permission> DEFAULT_PERMISSIONS = List.of(new SocketPermission("*", "connect"),
import java.lang.reflect.ReflectPermission;
    );
        var driverFilesPermissions = new ArrayList<Permission>();
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
    public static <T> T executeWithAccessControlContext(AccessControlContext controlContext, Callable<T> callable) throws Throwable {
 * you may not use this file except in compliance with the License.
        new RuntimePermission("getClassLoader"),
        Permissions noPermissions = new Permissions();
import java.util.concurrent.Callable;
            return AccessController.doPrivileged((PrivilegedAction<T>) () -> {
                absoluteFilePath += (File.separator + "*"); //access to all files in directory
            driverFilesPermissions.add(new FilePermission(relativeFilePath, "read"));
            driverFilesPermissions.add(new FilePermission(absoluteFilePath, "read"));

public class SecurityManagerUtils {
        for (DBPDriverLibrary driverLibrary : driverLibraries) {
 */
                driverFilesPermissions.add(new FilePermission(absoluteFilePath, "read"));
    }
                relativeFilePath += (File.separator + "*");
 *
    private static List<Permission> getDriverFilesPermissions(DBPDriver driver) {
 *
            }, controlContext);
                throwable = throwable.getCause();
            Throwable throwable = e;
 * You may obtain a copy of the License at
    public static List<Permission> getDefaultPermissions() {
        return new ArrayList<>(DEFAULT_PERMISSIONS);
        }
            return SecurityManagerUtils.executeWithAccessControlContext(SecurityManagerUtils.controlContextOf(permissions), callable);
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.ArrayList;

            throw throwable;
                continue;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static AccessControlContext controlContextOf(List<Permission> permissions) {
        ) {
import java.net.NetPermission;
        new RuntimePermission("accessDeclaredMembers"),
import org.jkiss.dbeaver.runtime.DBWorkbench;
                } catch (Exception e) {
    public static <T> T wrapDriverActions(DBPDataSourceContainer container, Callable<T> callable) throws Throwable {
