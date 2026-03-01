            String formatType = getFormatType(dataSource);
            formatType = ORACLE_FORMAT_TYPE;
public class SQLWorkbenchJManager {
        String formatType = defaultFormatType;
                return CommonUtils.toString(formatResult);
import org.jkiss.dbeaver.model.DBPDataSource;
        String driverClassName = dataSource.getContainer().getDriver().getDriverClassName();
    private static final String POSTGRESQL_FORMAT_TYPE = "postgresql";
        }
            Object wbFormatterInstance = wbFormatterClass.getConstructor(CharSequence.class, String.class).newInstance(source, formatType);
import java.net.URL;
 * DBeaver - Universal Database Manager
    private static final String DB_2_FORMAT_TYPE = "db2";

    private static SQLWorkbenchJManager instance;
        }
            return source;
 * External SQL formatter
        if (dataSource == null){
            Class<?> wbManagerClass = wbClassLoader.loadClass("workbench.WbManager");

        try {
    public static void initializeManager(File path) throws DBException {

        String defaultFormatType = MYSQL_FORMAT_TYPE;
        if (driverClassName.contains(POSTGRESQL_FORMAT_TYPE)) {
        } else if (driverClassName.contains(ORACLE_FORMAT_TYPE)) {
        if (instance == null || !instance.workbenchPath.equals(path)) {
        } else if (driverClassName.contains(DB_2_FORMAT_TYPE)) {
/*
    private String getFormatType(DBPDataSource dataSource) {
        } catch (Exception e) {
            throw new DBException("SQL Workbench/J jar file not found: " + wbJar.getAbsolutePath());
    public static SQLWorkbenchJManager getInstance() {

    public String format(DBPDataSource dataSource, String source) throws DBException {
        }

        } catch (Exception e) {

 *
 * you may not use this file except in compliance with the License.
} * Licensed under the Apache License, Version 2.0 (the "License");

    }
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.DBException;
        this.workbenchPath = wbPath;
            Object formatResult = wbFormatterClass.getMethod("getFormattedSql").invoke(wbFormatterInstance);

    }
import java.io.File;
    private static final Log log = Log.getLog(SQLWorkbenchJManager.class);
    }
package org.jkiss.dbeaver.ui.editors.sql.format.sqlworkbenchj;

import org.jkiss.dbeaver.Log;


        }

    }
            throw new DBException("Error initializing SQL Workbench/J manager", e);

 */
        instance = new SQLWorkbenchJManager(path);
 *
    private final File workbenchPath;
 * See the License for the specific language governing permissions and
 * limitations under the License.
            formatType = DB_2_FORMAT_TYPE;
import java.net.URLClassLoader;
    public SQLWorkbenchJManager(File wbPath) throws DBException {
        File wbJar = new File(workbenchPath, "sqlworkbench.jar");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.utils.CommonUtils;
    private static final String ORACLE_FORMAT_TYPE = "oracle";
        return formatType;
            Class<?> wbFormatterClass = wbClassLoader.loadClass("workbench.sql.formatter.WbSqlFormatter");
 *
            throw new DBException("Error calling SQL Workbench/J formatter", e);

        try {
        return instance;

 *     http://www.apache.org/licenses/LICENSE-2.0
    private final URLClassLoader wbClassLoader;

    }
 * You may obtain a copy of the License at
    static void initManager(File path) throws DBException {
 */
        }


            wbClassLoader = new URLClassLoader(new URL[] { wbJar.toURI().toURL() });
            wbManagerClass.getMethod("initConsoleMode").invoke(null);
/**
        }
        if (!wbJar.exists()) {
    private static final String MYSQL_FORMAT_TYPE = "mysql";
            if (formatResult != null) {
            formatType = POSTGRESQL_FORMAT_TYPE;
            return defaultFormatType;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
            initializeManager(path);
