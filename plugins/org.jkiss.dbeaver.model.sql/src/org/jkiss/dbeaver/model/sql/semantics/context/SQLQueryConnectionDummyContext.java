/*
        public String getName() {
        }
        for (List<String> tableName : knownTableNames) {

        @Override
        @Override
package org.jkiss.dbeaver.model.sql.semantics.context;
        public String getFullTypeName() {


            @NotNull String description,
 */

        return new DummyDbObject(
            Map<String, DummyDbObject> children  = catalog.getChildrenMapImpl();
        }

            return this.container;
        DummyDbObject apply(DummyDbObject parent, String name, int index);
        List<String> rawTableName = tableName.stream().map(s -> s == null ? null : this.dialect.getUnquotedIdentifier(s)).toList();
            } else {
        @NotNull


        public DBPDataSource getDataSource() {

        @NotNull
            "Dummy column for purposes of static query semantic analysis",
        DBSEntity table = this.getOrPrepareDummyTable(tableName);
        }
        @Override
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsSourceModel;
        @NotNull
        }
    public List<DBSEntity> findRealTables(@NotNull DBRProgressMonitor monitor, @NotNull List<String> tableName) {
            name,
        @Override
            index,
        return null;
            return Collections.emptyMap();

        @Override
        @NotNull

            return null;
        @Override
            DBIcon.TREE_TABLE,

        public int getTypeID() {
        @Override
        }
        @Override
        return new DummyDbObject(
import org.jkiss.dbeaver.model.*;

            parent,
        // create schema
import org.jkiss.code.Nullable;

            return DummyDbObject.class;
    @Nullable
        return true;
        }

        }

            @NotNull DummyDbObject container,
        @Override
        public long getTypeModifiers() {
        }
        );
    }
        @NotNull
            if (this.childrenByName == null) {
        public <T> void setContextAttribute(@NotNull String attributeName, @Nullable T attributeValue) {

            if (namePart == null) {
            return 0;
        }
        public DBSEntity getParentObject() {

    }
import org.jkiss.dbeaver.model.struct.*;
    }
            return dialect;
            DBIcon.TREE_SCHEMA,
        }

        public <T> T getContextAttribute(@NotNull String attributeName) {
        @Override
        public List<? extends DBSTrigger> getTriggers(@NotNull DBRProgressMonitor monitor) throws DBException {
        return obj instanceof DummyDbObject;
    private final DummyDbObject dummyDataSource;
            return this.name;
        public Object getDataSourceFeature(String featureId) {
        public boolean isPersisted() {
            if (this.container == dummyDataSource) {
        @NotNull
            this.container = container;
            return null;
        @Override
        }
            if (namePart == null) {
        return new DummyDbObject(
                    for (String name : this.childrenNames) {
            return DBPDataKind.STRING;
                    this.childrenByName = Collections.emptyMap();
            DummyDbObject schema = container;
            return this.children != null ? this.children : (this.children = new ArrayList<>(this.getChildrenMapImpl().values()));
        public DBSEntityAttribute getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException {
        @Override
        public long getMaxLength() {
    public SQLQueryResultPseudoColumn resolveGlobalPseudoColumn(@NotNull String name) {
        @Override
        this.knownSchemaNames = new HashSet<>();
        return new DummyDbObject(
        public DummyDbObject(
import org.jkiss.dbeaver.DBException;
        public Collection<? extends DBSEntityAssociation> getAssociations(@NotNull DBRProgressMonitor monitor) throws DBException {

        private final int position;
        @Override
        }
 * See the License for the specific language governing permissions and
            this.name = name;
    private DummyDbObject prepareColumn(DummyDbObject parent, String name, int index) {
        @NotNull SQLDialect dialect,
    protected List<? extends DBSObject> findRealObjectsImpl(@NotNull DBRProgressMonitor monitor, @NotNull List<String> objectName) {
public class SQLQueryConnectionDummyContext extends SQLQueryConnectionContext {
            return Collections.emptyList();
        public boolean isRequired() {
    @FunctionalInterface
        }
        this.knownTableNames = new HashSet<>();
        @Override
        @NotNull Set<String> knownColumnNames,
            parent,
        private Map<String, DummyDbObject> getChildrenMapImpl() {
        );
            name,
        @Override
            return this.position;

        );
            0,
            return 0;
 * DBeaver - Universal Database Manager
        }
            return this.getChildrenMapImpl().get(attributeName);
 * You may obtain a copy of the License at
    }
        }
        @NotNull
        private List<DummyDbObject> getChildrenListImpl() {
        }
                    this.childrenByName = new HashMap<>();
            container = children.computeIfAbsent(namePart, k -> prepareSchema(catalog, k, children.size()));
        public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
                return this.name;
        @Override
import org.jkiss.dbeaver.model.sql.SQLDialect;
        @Override
            return Collections.emptyList();

        public DBPDataSourceContainer getContainer() {
        @Override
            index,
                    }
        private final String name;
        }

            }
        private final DummyDbObject container;
    private DummyDbObject prepareDataSource() {
    private class DummyDbObject implements DBSEntityAttribute, DBSTable, DBSSchema, DBSCatalog, DBPDataSource, DBPImageProvider {
            index,
            @NotNull String name,
}

        private final DummyObjectCtor childCtor;
        @Override

        }
    private final Set<String> knownTableNames;
        @Override
            return this.childrenByName;
    private DummyDbObject prepareCatalog(DummyDbObject parent, String name, int index) {

 *
        return this.findRealTables(monitor, objectName);
            return children.computeIfAbsent(namePart, k -> prepareTable(schema, k, children.size()));
        public void initialize(@NotNull DBRProgressMonitor monitor) throws DBException {
            parent,
        }
        public void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) throws DBException {
 *
            DBIcon.TREE_DATABASE,
        for (int i = 0; i < rawTableName.size() - 2; i++) {

 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.*;
        @Override
        @Override
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

        }
            return null;
        @Override

        }

            this::prepareTable
            this.position = position;
 * Copyright (C) 2010-2025 DBeaver Corp and others

        @NotNull
    private final Set<String> knownSchemaNames;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return table != null ? List.of(table) : Collections.emptyList();
        @Override
        if (rawTableName.size() > 1) {
        @Override

        public List<? extends DBSEntityAttribute> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {

        public DBSEntityType getEntityType() {
        public DBSInstance getDefaultInstance() {
            return Collections.emptyList();
    @Override
        @Override
    }
        @NotNull
            knownCatalogNames,

    public static boolean isDummyObject(@Nullable Object obj) {
    private final Set<String> knownCatalogNames;
        {
        }

            return true;
    private interface DummyObjectCtor {
 * you may not use this file except in compliance with the License.
            return this.getChildrenListImpl();
        @Override

            }
        }
            DummyDbObject catalog = container;
                return DBUtils.getFullQualifiedName(getDataSource(), this.container, this);
            return this.image;
            this::prepareColumn
        );
        public int getOrdinalPosition() {
    }
        public SQLDialect getSQLDialect() {
        }
            this.childrenNames = childrenNames;
            int position,

            return null;
        }
            return null;
        }
        private final DBPImage image;
        }
        // create table
        @Override
        }
        }
        }
            return false;
            "Dummy schema for purposes of static query semantic analysis",



        public Map<String, ?> getContextAttributes() {

        @Override
        @Override
        ) {
        @NotNull
        @NotNull
        }

        public boolean isView() {
        }
            "Dummy table for purposes of static query semantic analysis",
        public String getTypeName() {


        @Nullable
            index,
        // create catalogs


            String namePart = rawTableName.get(i);

                } else {
            "DummyDataSource",
        public Integer getScale() {
    }
            knownSchemaNames,

            @Nullable DummyObjectCtor childCtor
            container = children.computeIfAbsent(namePart, k -> prepareCatalog(catalog, k, children.size()));
        public Collection<? extends DBSInstance> getAvailableInstances() {
            DummyDbObject catalog = container;

import org.jkiss.dbeaver.model.struct.rdb.*;


        }
    }
        }

            null,
            return this.getChildrenListImpl();
        public DBPDataKind getDataKind() {
    @NotNull
            this.image = image;
            }
            return Collections.emptyList();
        private final String description;
        return Collections.emptyList();
        @Override

        @Override
        public Integer getPrecision() {
        this.knownColumnNames = knownColumnNames;
        @NotNull
    }
        }
 * Unless required by applicable law or agreed to in writing, software


        @Override
    }
            null
        public String getDescription() {
            name,
            DBIcon.TREE_FOLDER_DATABASE, // UIIcon.DATABASES,
            this.childCtor = childCtor;
        );
        DummyDbObject container = this.dummyDataSource;
            return 0;
        }

    @Override
    @NotNull
    public boolean isDummy() {
        private final Set<String> childrenNames;

                        this.childrenByName.put(name, childCtor.apply(this, name, i++));

            @NotNull Set<String> childrenNames,
        public boolean isAutoGenerated() {
    ) {
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
    private DBSEntity getOrPrepareDummyTable(@NotNull List<String> tableName) {

        private List<DummyDbObject> children = null;
            knownTableNames,
    private final Set<String> knownColumnNames;
            return null;

        @Override
        }
                return null;
            return null;
        @Override
            parent,
        }
    public List<SQLQueryResultPseudoColumn> obtainRowsetPseudoColumns(@Nullable SQLQueryRowsSourceModel rowsSource) {
            return null;

        public DBPImage getObjectImage() {
    }
    @Override
        return new DummyDbObject(
            Map<String, DummyDbObject> children  = catalog.getChildrenMapImpl();
            String namePart = rawTableName.get(rawTableName.size() - 1);
    public SQLQueryConnectionDummyContext(
        }
            "Dummy data source for purposes of static query semantic analysis",
        @NotNull
        }
            this::prepareCatalog

    }

            this::prepareSchema
        }
            Map<String, DummyDbObject> children  = schema.getChildrenMapImpl();
            this.getOrPrepareDummyTable(tableName);
 * limitations under the License.
            return false;
        }

    @Nullable

    @Override
            return Collections.emptyList();
import org.jkiss.code.NotNull;

 *
        private Map<String, DummyDbObject> childrenByName = null;
            @NotNull DBPImage image,
                    int i = 0;

        @Override
            return this.description;
            Collections.emptySet(),
        public Collection<? extends DBSTableConstraint> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException {
        this.dummyDataSource = this.prepareDataSource();
        @Override
    @NotNull
        @Override
            return true;
        public DBPDataSourceInfo getInfo() {
            this.description = description;
    }
        }
                return null;
        }
    private DummyDbObject prepareSchema(DummyDbObject parent, String name, int index) {
            String namePart = rawTableName.get(rawTableName.size() - 2);
        public Class<? extends DBSObject> getPrimaryChildType(@Nullable DBRProgressMonitor monitor) throws DBException {
        @NotNull
        @Override
            return dummyDataSource;
            return null;
        }
            return null;
    @Override
        super(dialect);
            }
                if (this.childCtor == null) {
            return null;
            knownColumnNames,
    private DummyDbObject prepareTable(DummyDbObject parent, String name, int index) {

        @Override
        public String getDefaultValue() {
        public void removeContextAttribute(@NotNull String attributeName) {

 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull Set<List<String>> knownTableNames

            "Dummy catalog for purposes of static query semantic analysis",
        }
            name,

        public void shutdown(@NotNull DBRProgressMonitor monitor) {
        @Override
            if (namePart == null) {
                return null;

        public DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException {
    }
        }
        this.knownCatalogNames = new HashSet<>();
        public Collection<? extends DBSObject> getChildren(@NotNull DBRProgressMonitor monitor) throws DBException {
        }
            }
        }
        @Override
            DBIcon.TYPE_STRING,
        @NotNull
            return this.getChildrenMapImpl().get(childName);
            return DBSEntityType.TABLE;
        public Collection<? extends DBSEntityAssociation> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException {
        public Collection<? extends DBSTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException {
                }

        @Override
