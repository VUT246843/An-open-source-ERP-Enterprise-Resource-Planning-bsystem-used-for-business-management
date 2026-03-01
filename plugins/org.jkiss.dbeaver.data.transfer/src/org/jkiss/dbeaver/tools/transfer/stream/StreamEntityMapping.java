    }
    }
        String inputFileName = CommonUtils.toString(config.get("inputFile"));





        }
        long firstRow,
    @NotNull
            StreamDataImporterColumnInfo oldColumn = streamColumns.get(index);
    @Override
    public StreamDataImporterColumnInfo getStreamColumn(String name) {
 *
    public StreamEntityMapping(@NotNull Path inputFile) {
    public DBCStatistics readData(

            }
        this.child = child;
import org.jkiss.utils.CommonUtils;
import java.nio.file.Path;

    @NotNull
        this(inputFile, getEntityNameFromFile(inputFile), false);
        return DBSEntityType.TABLE;
    }
                return;
        return null;
    }


    private final Path inputFile;
 *
    @Override
            StreamDataImporterColumnInfo newColumn = mapping.streamColumns.get(index);
        long flags,
        for (int index = 0; index < streamColumns.size(); index++) {
import java.util.*;
    public Path getInputFile() {
 * distributed under the License is distributed on an "AS IS" BASIS,
}
    @Override
            return false;
import org.jkiss.dbeaver.model.DBUtils;

        StreamEntityMapping that = (StreamEntityMapping) o;
        }

                if (other.getName().equalsIgnoreCase(name)) {
    @NotNull
        return dataSource;

        return dataSource;
    }
        return null;
                return false;

    @NotNull
    @Override
    public String getEntityName() {
            }
            inputFileName = this.entityName;
            this.streamColumns.add(column);
    public DBPDataSource getDataSource() {
        return mappings;
    @Override
        this.streamColumns.clear();


import org.jkiss.dbeaver.model.exec.DBCException;
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
        return DBUtils.findObject(streamColumns, attributeName);
    public String getName() {
    public DBSObject getParentObject() {
    public long countData(@NotNull DBCExecutionSource source, @NotNull DBCSession session, @Nullable DBDDataFilter dataFilter, long flags) {
/*
        }
    StreamEntityMapping(
            return inputFile.toUri().toString();
    @Override
        return inputFile;
    }
    }

        return new String[] {FEATURE_DATA_SELECT};
    public Collection<? extends DBSEntityAssociation> getReferences(@NotNull DBRProgressMonitor monitor) {
 *
        @NotNull DBRProgressMonitor monitor,
        }
 * you may not use this file except in compliance with the License.


    public List<StreamDataImporterColumnInfo> getStreamColumns() {
        return -1;
    }
        return null;
        return Objects.hash(inputFile, entityName);
    }
package org.jkiss.dbeaver.tools.transfer.stream;
        if (streamColumns.size() != mapping.streamColumns.size()) {

        DBDDataFilter dataFilter,
        this.entityName = CommonUtils.toString(config.get("entityId"));
    @Override
        if (CommonUtils.isEmpty(inputFileName)) {
public class StreamEntityMapping implements DBSEntity, DBSDataContainer, DBPQualifiedObject {
        this.entityName = entityName;
            if (!collides) {
import org.jkiss.dbeaver.model.fs.DBFUtils;
    }
    private final List<StreamDataImporterColumnInfo> streamColumns = new ArrayList<>();
        @Nullable DBPProject project,
        return true;
import org.jkiss.dbeaver.model.exec.DBCStatistics;
        return null;
        this.dataSource = new StreamDataSource(entityName);
 * You may obtain a copy of the License at
    public boolean isSameColumns(@NotNull StreamEntityMapping mapping) {
        }

    }
    public DBSEntityType getEntityType() {
    @NotNull
        this.child = false;
        }
    public boolean equals(Object o) {
    }

    @Override
    }
        @NotNull Map<String, Object> config
    @Override
import org.jkiss.dbeaver.model.data.DBDDataReceiver;
    @Override
    @Override
import org.jkiss.code.NotNull;
    public DBSEntityAttribute getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException {
    @Override
import org.jkiss.dbeaver.DBException;
    @Override
import org.jkiss.dbeaver.model.DBPQualifiedObject;
import org.jkiss.dbeaver.model.struct.*;
            boolean collides = false;
        for (int i = 0; i < streamColumns.size() + 1; i++) {
                    break;
    }
    }
import org.jkiss.dbeaver.tools.transfer.stream.model.StreamDataSource;
    @NotNull
    }
        for (StreamDataImporterColumnInfo col : streamColumns) {
    }
        if (o == null || getClass() != o.getClass()) return false;
    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;

    }
    public StreamEntityMapping(@NotNull Path inputFile, @NotNull String entityName, boolean child) {
                }
    public boolean isPersisted() {
    }
    ) throws DBCException {

        return streamColumns;
    private static String getEntityNameFromFile(@NotNull Path inputFile) {
            }
 * DBeaver - Universal Database Manager
        Map<String, Object> mappings = new LinkedHashMap<>();
    @Override
 * limitations under the License.
    private final boolean child;


            if (name.equals(col.getName())) {
    }
    private final String entityName;
        if (this == o) return true;
    ) throws DBException {
        this.inputFile = DBFUtils.resolvePathFromString(monitor, project, inputFileName);
                return col;
    @Override
        return true;
        } else {

    public boolean isChild() {
            final String name = i > 0 ? column.getName() + '_' + i : column.getName();
        mappings.put("entityId", entityName);
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        this.inputFile = inputFile;
    private final DBPDataSource dataSource;
 * Unless required by applicable law or agreed to in writing, software

    }
            return fileName.toString();

    }
    @NotNull
        @Nullable DBCExecutionSource source,
import org.jkiss.code.Nullable;
        return inputFile.equals(that.inputFile) && entityName.equals(that.entityName);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return child;
    public String[] getSupportedFeatures() {
import org.jkiss.dbeaver.model.data.DBDDataFilter;
                column.setName(name);
    }
        return entityName;
        throw new DBCException("Not implemented");
        long maxRows,
        if (fileName != null) {
        this.dataSource = new StreamDataSource(entityName);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    }
    Map<String, Object>saveSettings() {
    @NotNull
    public Collection<? extends DBSEntityConstraint> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException {
import org.jkiss.dbeaver.model.DBPDataSource;
 */
        @NotNull DBCSession session,
                    collides = true;
    public int hashCode() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
        for (StreamDataImporterColumnInfo column : streamColumns) {
            if (!oldColumn.getName().equals(newColumn.getName())) {

        int fetchSize


        @NotNull DBDDataReceiver dataReceiver,
            for (StreamDataImporterColumnInfo other : streamColumns) {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.app.DBPProject;

    }
import org.jkiss.dbeaver.model.exec.DBCExecutionSource;
    public Collection<? extends DBSEntityAssociation> getAssociations(@NotNull DBRProgressMonitor monitor) {

    void setStreamColumns(List<StreamDataImporterColumnInfo> streamColumns) {

    public List<StreamDataImporterColumnInfo> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
        }
    }
        return streamColumns;
    }
        return getName();

            }
        Path fileName = inputFile.getFileName();
        return entityName;
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        return null;
    public String getDescription() {
import org.jkiss.dbeaver.model.exec.DBCSession;
    @NotNull
            ensureNameIsUnique(column);
    private void ensureNameIsUnique(@NotNull StreamDataImporterColumnInfo column) {
    }
    @NotNull
    @Override
