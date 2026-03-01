            }
            throw new DBCException("Error copying dataset on remote server", e);

 * You may obtain a copy of the License at
/*
    public void flushRows(@NotNull DBCSession session) throws DBCException {
        }
    private Object copyManager;
    public PostgreCopyLoader(PostgreDataSource dataSource) {
        } catch (Exception e) {
    @Override

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.io.IOException;
        }
            } catch (IOException e) {
            // Get method copyIn(final String sql, Reader from, int bufferSize)
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.sql.Connection;
            throw new DBCException("Error saving CSV data", e);
    @Override

    private Path csvFile;

        }
        int batchSize,
            }
                        strValue = convertStringValueToCell(strValue);
                    ArrayUtils.indexOf(attributes, attr)
                    attr,
        @NotNull DBSDataContainer dataContainer,
                Files.createFile(csvFile);
            }
                if (hasCell) {
    }
import java.util.List;
    }
    @Override
            ClassLoader driverClassLoader = pgConnection.getClass().getClassLoader();
                hasCell = true;
    @NotNull

 * //        new CopyManager((BaseConnection) conn)
 *
    public void close() {
        return '"' +
            } catch (IOException ex) {
import org.jkiss.dbeaver.model.data.DBDValueHandler;
                DBDValueHandler valueHandler = DBUtils.findValueHandler(session, attr);
            log.debug("CSV has been imported (" + rowCount + ")");
                PostgreTableColumn attr = tableAttrs.get(i);
 * Unless required by applicable law or agreed to in writing, software
        @NotNull DBCExecutionSource source,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

        @NotNull DBCSession session,
            if (e instanceof InvocationTargetException) {
        try {
        this.table = (PostgreTableReal) dataContainer;

                csvFile.toFile().deleteOnExit();

    private int copyBufferSize = 100 * 1024;
import java.lang.reflect.Method;
            this.srcPos = srcPos;
            try {

            Object rowCount;
        } catch (IOException e) {

                session.getProgressMonitor().subTask("Commit COPY");
import org.jkiss.dbeaver.model.struct.DBSDataBulkLoader;
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.nio.file.Files;
        @NotNull Map<String, Object> options) throws DBCException
    private static final Log log = Log.getLog(PostgreCopyLoader.class);
 * //                new BufferedReader(new FileReader("data.csv"))
        session.getProgressMonitor().subTask("Copy into " + tableFQN);

                mappings[i] = mapping;
                    }
                        line.append(srcValue);
        } catch (IOException e) {
        }
/**
    private Writer csvWriter;
        } catch (IOException e) {
import org.jkiss.dbeaver.model.DBUtils;
    }

        csvWriter = null;
                txnManager.commit(session);
    }
            List<? extends PostgreTableColumn> tableAttrs = CommonUtils.safeList(table.getAttributes(session.getProgressMonitor()));
        for (AttrMapping mapping : mappings) {
                rowCount = copyInMethod.invoke(copyManager, queryText, csvReader, copyBufferSize);
        return this;
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.utils.ArrayUtils;
            Class<?> baseConnectionClass = Class.forName("org.postgresql.core.BaseConnection", true, driverClassLoader);
 *
import org.jkiss.dbeaver.Log;
        String queryText = "COPY " + tableFQN + " FROM STDIN (FORMAT CSV, ESCAPE '\\')";
                );
            throw new DBCException("Can't instantiate CopyManager", e);
            strValue.replace("\"", "\\\"") +
            csvWriter = new BufferedWriter(
    public void addRow(@NotNull DBCSession session, @NotNull Object[] attributeValues) throws DBCException {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;

                );
            // Commit changes
    @Override
 * //            .copyIn(
import org.jkiss.dbeaver.model.exec.DBCException;
        @NotNull DBSAttributeBase[] attributes,
    }
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
        }
    private String convertStringValueToCell(String strValue) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                log.debug("Error deleting CSV file " + csvFile, e);
 */
            tableAttrs.removeIf(a -> a.getOrdinalPosition() < 0);
            this.valueHandler = valueHandler;
            if (mapping.srcPos >= 0) {
    @Override
            if (txnManager != null && !txnManager.isAutoCommit()) {
import java.io.Writer;
    }


            csvWriter.write(line.toString());
        String tableFQN = table.getFullyQualifiedName(DBPEvaluationContext.DML);
            csvWriter.close();
}
                    valueHandler,
            csvWriter.flush();
        }
package org.jkiss.dbeaver.ext.postgresql.model;
                Object srcValue = attributeValues[mapping.srcPos];
import java.io.BufferedWriter;
 * //            );

        try {
        boolean hasCell = false;
            mappings = new AttrMapping[tableAttrs.size()];
            }
                    if (srcValue instanceof Number) {
import java.io.Reader;
            }
        this.dataSource = dataSource;
                            mapping.tableAttr, srcValue, DBDDisplayFormat.NATIVE);
                    line.append(",");
            for (int i = 0; i < tableAttrs.size(); i++) {
 *
                if (!DBUtils.isNullValue(srcValue)) {
            copyManager = copyManagerClass.getConstructor(baseConnectionClass).newInstance(pgConnection);


 */
            Path tempFolder = DBWorkbench.getPlatform().getTempFolder(session.getProgressMonitor(), "postgesql-copy-datasets");
            try (Reader csvReader = Files.newBufferedReader(csvFile, StandardCharsets.UTF_8)) {
                e = ((InvocationTargetException) e).getTargetException();
                copyBufferSize
                }
    }
                Files.newBufferedWriter(csvFile, StandardCharsets.UTF_8),
        try {
        AttrMapping(PostgreTableColumn tableAttr, DBDValueHandler valueHandler, int srcPos) {
            Class<?> copyManagerClass = Class.forName("org.postgresql.copy.CopyManager", true, driverClassLoader);
    private PostgreTableReal table;

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.exec.DBCTransactionManager;

import java.util.Map;
    private static class AttrMapping {
import java.lang.reflect.InvocationTargetException;
        line.append("\n");
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        }
        try {
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.runtime.DBWorkbench;
        StringBuilder line = new StringBuilder();

                AttrMapping mapping = new AttrMapping(
                Files.delete(csvFile);
        try {
            log.debug(e);

            }
        }
    }
            throw new DBCException("Error writing CSV line", e);
import org.jkiss.dbeaver.model.exec.DBCExecutionSource;
            try {
import org.jkiss.utils.CommonUtils;
                        line.append(strValue);
            copyInMethod = copyManagerClass.getMethod("copyIn", String.class, Reader.class, Integer.TYPE);
import java.nio.file.Path;


            DBCTransactionManager txnManager = DBUtils.getTransactionManager(session.getExecutionContext());
            csvWriter.flush();

import java.nio.charset.StandardCharsets;
    {
                throw new IOException("Can't create CSV file " + csvFile);
    public void finishBulkLoad(@NotNull DBCSession session) throws DBCException {
                    } else {
            }
 * Copyright (C) 2010-2025 DBeaver Corp and others
            csvFile = tempFolder.resolve(CommonUtils.escapeFileName(table.getFullyQualifiedName(DBPEvaluationContext.DML)) + "-" + System.currentTimeMillis() + ".csv");  //$NON-NLS-1$ //$NON-NLS-2$
        if (csvFile != null && Files.exists(csvFile)) {
 * //                "COPY table1 FROM STDIN (FORMAT csv)",
    private AttrMapping[] mappings;


            Connection pgConnection = ((JDBCSession) session).getOriginal();
    private Method copyInMethod;
 * Bulk loader based on CopyManager

        int srcPos;
 *
 * limitations under the License.
            this.tableAttr = tableAttr;
            // Use reflection to create copy manager
                        String strValue = mapping.valueHandler.getValueDisplayString(

public class PostgreCopyLoader implements DBSDataBulkLoader, DBSDataBulkLoader.BulkLoadManager {

        } catch (Throwable e) {
        PostgreTableColumn tableAttr;
        DBDValueHandler valueHandler;
    public BulkLoadManager createBulkLoad(
    private final PostgreDataSource dataSource;
            '"';
                }
