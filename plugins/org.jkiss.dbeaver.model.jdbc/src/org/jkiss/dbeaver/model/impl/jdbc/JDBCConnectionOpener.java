            }

                return driverInstance.connect(url, connectProps);
    }
import org.jkiss.dbeaver.model.access.DBAAuthSubjectCredentials;
        @Nullable Driver driverInstance,
                    connected = true;
                return DriverManager.getConnection(url, connectProps);
    private final Driver driverInstance;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

            if (authResult instanceof DBAAuthSubjectCredentials sc) {
import java.lang.reflect.InvocationTargetException;
        @NotNull JDBCDataSource dataSource,
 *
                Field driversInitializedField = DriverManager.class.getDeclaredField("driversInitialized");
    private Connection connection;
        this.url = url;
    private final String url;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.dataSource = dataSource;
            connection = jdbcConnection;
        this.driverInstance = driverInstance;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    ) {
            } catch (Throwable e) {
        this.driver = driver;
            try {
        return error;
                }
            boolean connected = false;
                // Just ignore it
            // Reset DriverManager cache
        }
    private final JDBCDataSource dataSource;
            Connection jdbcConnection = null;
 * limitations under the License.
 *
        }
 * You may obtain a copy of the License at
        @NotNull Properties connectProps,
 *
        } catch (Throwable e) {
        ClassLoader originalClassLoader = Thread.currentThread().getContextClassLoader();
            if (!connected) {
import org.jkiss.code.Nullable;

        Thread.currentThread().setContextClassLoader(driver.getDriverLoader(dataSource.getContainer()).getClassLoader());
import java.sql.Connection;
 * Unless required by applicable law or agreed to in writing, software

 * distributed under the License is distributed on an "AS IS" BASIS,
            } else {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            // Use PrivilegedAction in case we have explicit subject
    public void run(DBRProgressMonitor monitor1) throws InvocationTargetException, InterruptedException {
import java.util.Properties;
import java.sql.DriverManager;
    public JDBCConnectionOpener(
                jdbcConnection = this.run();
        } finally {
import org.jkiss.dbeaver.model.connection.DBPDriver;
 * Licensed under the Apache License, Version 2.0 (the "License");

        this.connectProps = connectProps;
        @Nullable Object authResult
                driversInitializedField.setAccessible(true);
            error = e;
    @Override
        try {
/*
        @NotNull DBPDriver driver,
            Thread.currentThread().setContextClassLoader(originalClassLoader);
 * DBeaver - Universal Database Manager
class JDBCConnectionOpener implements DBRRunnableWithProgress, PrivilegedExceptionAction<Connection> {
        // Set context class loaded to driver class loader
    public Throwable getError() {
            // Otherwise just open connection directly
                driversInitializedField.set(null, false);
import java.security.PrivilegedExceptionAction;
                Subject authSubject = sc.getAuthSubject();
    }
import java.lang.reflect.Field;
        try {
            }
    @Override
import org.jkiss.code.NotNull;
import java.sql.Driver;

    public Connection getConnection() {
    private final DBPDriver driver;
        return connection;
        this.authResult = authResult;
}
    public Connection run() throws Exception {
    }
 * you may not use this file except in compliance with the License.
import javax.security.auth.Subject;
                if (authSubject != null) {
            }
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
    private final Object authResult;
package org.jkiss.dbeaver.model.impl.jdbc;
    //private static final Log log = Log.getLog(JDBCConnectionOpener.class);
    }
    private Throwable error;
            }
        @NotNull String url,
            if (driverInstance == null) {
 */
                    jdbcConnection = Subject.doAs(authSubject, this);
 * See the License for the specific language governing permissions and

            // Open connection
    private final Properties connectProps;

