            ResultSetMetaData md = dbResult.getMetaData();
import java.io.PrintWriter;

        }
/**
    }
        if (traceEnabled) {
    public static boolean isApiTraceEnabled() {
 * See the License for the specific language governing permissions and
 *
 */

            traceWriter = writer;
 * Copyright (C) 2010-2024 DBeaver Corp and others

    }
                Object colValue = dbResult.getObject(i);
        boolean traceEnabled = CommonUtils.toBoolean(System.getProperty("dbeaver.jdbc.trace"));
import org.jkiss.utils.CommonUtils;
 * limitations under the License.

 */
            int count = md.getColumnCount();
/*
package org.jkiss.dbeaver.model.impl.jdbc;

                log.error("Error opening JDBC trace file", e);
import java.nio.file.Files;
        traceWriter.println(QUERY_DIVIDER);
            log.debug(e);
 * JDBCTrace
    public static void traceQueryBegin(String string) {
    private static final String QUERY_DIVIDER = "=======================================================";
        traceWriter.println(string);

        try {


    }
            try {
 * You may obtain a copy of the License at

                traceWriter.print(colValue + "\t|\t");
 * distributed under the License is distributed on an "AS IS" BASIS,
}
            for (int i = 1; i <= count; i++) {
import java.nio.charset.StandardCharsets;
    }
 * you may not use this file except in compliance with the License.
 *
            } catch (IOException e) {

        } catch (Exception e) {
            PrintWriter writer;
            traceWriter.flush();
        }
            }
 *
        if (!apiTraceEnabled) return;
        if (!apiTraceEnabled) return;
                writer = null;
            log.debug(e);
    }
            traceWriter.println();
        try {
    private static final boolean apiTraceEnabled;

 *     http://www.apache.org/licenses/LICENSE-2.0
    }

        if (!apiTraceEnabled) return;
            }
                writer = new PrintWriter(Files.newBufferedWriter(traceFile, StandardCharsets.UTF_8), true);
import java.sql.ResultSetMetaData;
        } catch (Exception e) {
    // API trace
            int count = md.getColumnCount();
        traceWriter.println(RS_DIVIDER);
            Path traceFile = DBWorkbench.getPlatform().getWorkspace().getMetadataFolder().resolve("jdbc-api-trace.log");
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
        return apiTraceEnabled;
    static {

    public static void dumpResultSetOpen(ResultSet dbResult) {
import java.sql.ResultSet;
public class JDBCTrace {
    /////////////////////////////////////////////////////////////
        } else {
            traceWriter.println();
import java.nio.file.Path;
            for (int i = 1; i <= count; i++) {
    private static final PrintWriter traceWriter;
        traceWriter.flush();
            traceWriter = null;
 * Unless required by applicable law or agreed to in writing, software
    {
import org.jkiss.dbeaver.runtime.DBWorkbench;
                traceWriter.print(md.getColumnName(i) + " [" + md.getColumnTypeName(i) + "]\t|\t");
            ResultSetMetaData md = dbResult.getMetaData();
import org.jkiss.dbeaver.Log;
 * DBeaver - Universal Database Manager
        apiTraceEnabled = traceEnabled;
import java.io.IOException;
        }
    private static final String RS_DIVIDER =    "-------------------------------------------------------";
            traceWriter.flush();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        traceWriter.println(RS_DIVIDER);
    public static void dumpResultSetRow(ResultSet dbResult)
    private static final Log log = Log.getLog(JDBCTrace.class);
    public static void dumpResultSetClose() {
