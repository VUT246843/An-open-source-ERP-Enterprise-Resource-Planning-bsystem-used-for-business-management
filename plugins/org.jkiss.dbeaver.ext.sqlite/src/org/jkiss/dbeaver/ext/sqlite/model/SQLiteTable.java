                        } else { // should never happen

                    .filter(fk -> fk.refersToTable(this))
        this.hasStrictTyping = hasStrictTyping;
    }
            true,
    @Override
    public SQLiteTableForeignKey getAssociation(@NotNull DBRProgressMonitor monitor, String name) throws DBException {
                    .map(fk -> (SQLiteTableForeignKey) fk)
                    }
    @Override
                }
        true,
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
        List<GenericUniqueKey> constraints = getConstraints(new VoidProgressMonitor());
        .map(name -> new DBDPseudoAttribute(


                        return true;
        if (this.getDataSource().isServerVersionAtLeast(3, 30)) { // obtain metainfo in a normal way
                    .forEach(list::add);
            this.getDataSource() instanceof SQLiteDataSource dataSource &&
        DBDPseudoAttribute.PropagationPolicy.TABLE_LOCAL
            } else {

    private DBDPseudoAttribute[] allPseudoAttributes = null;
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.DBException;
        SQLiteMessages.pseudo_column_rowid_description,
            Collection<? extends GenericTableForeignKey> tableForeignKeys = table.getAssociations(monitor);

        return (SQLiteTableForeignKey) super.getAssociation(monitor, name);

    @SuppressWarnings("unchecked")
import org.jkiss.dbeaver.model.data.DBDPseudoAttributeContainer;
                tableForeignKeys
                    .filter(a -> !columnNames.contains(a.getName())) // all names are lowercased here
                    }
        return new DBDPseudoAttribute[] { PSEUDO_ATTR_ROWID };
}
        } else {
 * Licensed under the Apache License, Version 2.0 (the "License");
    private static final List<DBDPseudoAttribute> ALL_KNOWN_PSEUDO_ATTRS = Stream.of("rowid", "oid", "_rowid_")
        return (Collection<SQLiteTableForeignKey>) super.getAssociations(monitor);
 * You may obtain a copy of the License at
                        throw new DBException("Failed to obtain isWithoutRowId flag for table", e);
                    .toArray(DBDPseudoAttribute[]::new);
    public List<SQLiteTableColumn> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
        "$alias.rowid",
            SQLiteMessages.pseudo_column_rowid_description,
 * limitations under the License.
    public Collection<SQLiteTableForeignKey> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException {
        }

        "rowid",
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    throw new DBException("Failed to obtain isWithoutRowId flag for table", e);
            dataSource.supportsStrictTyping() &&
        @Override
    protected boolean isTruncateSupported() {
public class SQLiteTable extends GenericTable implements DBDPseudoAttributeContainer,DBPNamedObject2 {
    public DBDPseudoAttribute[] getAllPseudoAttributes(@NotNull DBRProgressMonitor monitor) throws DBException {
        if (!isPersisted() || !getDataSource().getInfo().supportsReferentialIntegrity() || monitor.isForceCacheUsage()) {
package org.jkiss.dbeaver.ext.sqlite.model;
import org.jkiss.code.NotNull;
        return list;
        // https://www.sqlite.org/releaselog/3_8_2.html - Added support for WITHOUT ROWID tables.
        return (List<SQLiteTableColumn>) super.getAttributes(monitor);
    public void setHasStrictTyping(boolean hasStrictTyping) {
                    dbStat.setString(1, this.getName());
            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Obtaining table's extra metadata")) {
import org.jkiss.code.Nullable;
import java.util.*;
            DBDPseudoAttribute.PropagationPolicy.TABLE_LOCAL
import java.sql.SQLException;
                }
 *
            return new ArrayList<>();
    public boolean isHasStrictTyping() {
            null,
        }
import org.jkiss.dbeaver.model.struct.rdb.DBSTableConstraint;
    public static class TableStrictTypingValidator implements IPropertyValueValidator<SQLiteTable, Object> {
                    return true;
        hasStrictTyping = dbResult != null &&
                    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.model.data.DBDPseudoAttribute;
    private boolean obtainIsWithoutRowId(@NotNull DBRProgressMonitor monitor) throws DBException {

    @Override
    }
    }
        public boolean isValidValue(@NotNull SQLiteTable object, @Nullable Object value) throws IllegalArgumentException {
    }
        }
    @SuppressWarnings("unchecked")
            return null;
        if (this.allPseudoAttributes == null) {
            }
    }
        //                      to provide information about the on-disk representation of WITHOUT ROWID tables.


                try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
                String sql = "SELECT EXISTS(SELECT rowid, oid, _rowid_ FROM " + tableName + ") as test";
            name,
                    .map(a -> a.getName().toLowerCase())
                    String msg = e.getMessage();
        // https://www.sqlite.org/releaselog/3_30_0.html - The index_info and index_xinfo pragmas are enhanced
                } catch (SQLException e) {
        if (constraints != null) {

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

 * See the License for the specific language governing permissions and
                    .collect(Collectors.toSet());

import org.jkiss.dbeaver.ext.sqlite.internal.SQLiteMessages;
import org.jkiss.dbeaver.model.DBUtils;
            DBDPseudoAttributeType.ROWID,
    private boolean hasStrictTyping;
                    .filter(fk -> fk instanceof SQLiteTableForeignKey)
            null,
        return hasStrictTyping;

                    if (msg.contains("rowid") || msg.contains("oid") || msg.contains("_rowid_")) { // "no such column: rowid"
            }

    );
            if (isWithoutRowId) {
        }
 * DBeaver - Universal Database Manager
 *

                    try (JDBCResultSet resultSet = dbStat.executeQuery()) {
import java.util.stream.Stream;
 */
    @Override
                            resultSet.getBoolean("test");
                this.allPseudoAttributes = DBDPseudoAttribute.EMPTY_ARRAY;

    @Override
            JDBCUtils.safeGetBoolean(dbResult, "STRICT"); //$NON-NLS-1$
                this.allPseudoAttributes = ALL_KNOWN_PSEUDO_ATTRS.stream()
import org.jkiss.dbeaver.model.meta.Property;
    }
import java.util.stream.Collectors;
import org.jkiss.dbeaver.ext.generic.model.*;
                Set<String> columnNames = this.getAttributes(monitor).stream()
        return false;
 *
        null,
                if (cons.getConstraintType() == DBSEntityConstraintType.PRIMARY_KEY) {
        }
    }
import org.jkiss.dbeaver.model.data.DBDPseudoAttributeType;
    public SQLiteTable(GenericStructContainer container, @Nullable String tableName, @Nullable String tableType, @Nullable JDBCResultSet dbResult) {
            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Obtaining table's extra metadata")) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
            return false;
    public DBDPseudoAttribute[] getPseudoAttributes() throws DBException {
                            // 1. rowid presented --> isWithoutRowId is false

                //     then that name always refers the explicitly declared column and cannot be used to retrieve the integer rowid value.
/*
            if (Objects.nonNull(tableForeignKeys)) {
                //     If a table contains a user defined column named "rowid", "oid" or "_rowid_",
                        }

                    } else {
                try (JDBCPreparedStatement dbStat = session.prepareStatement("SELECT EXISTS(SELECT 1 FROM pragma_index_info(?)) as isWithoutRowId")) {
        for (GenericTableBase table : getDataSource().getTables(monitor)) {
    // We use ROWID only if we don't have primary key. Looks like it is the only way to determine ROWID column presence.
                // see https://www.sqlite.org/lang_createtable.html#rowid (5. ROWIDs and the INTEGER PRIMARY KEY):
    private static final DBDPseudoAttribute PSEUDO_ATTR_ROWID = new DBDPseudoAttribute(
                }
                String tableName = this.getFullyQualifiedName(DBPEvaluationContext.DML);
    }
    }
    @Override
        if (hasPrimaryKey()) {
        }
 * you may not use this file except in compliance with the License.
                } catch (SQLException e) {

    }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Property(visibleIf = TableStrictTypingValidator.class, viewable = true, editable = true, order = 40)
                    try (JDBCResultSet resultSet = dbStat.executeQuery()) {

                            // 2. user-defined columns for all known rowid names presented --> pseudo-columns will be excluded anyway
                    .stream()
        )).toList();
            }
                            // All known rowid names resolved, so two possible situations:
import org.jkiss.dbeaver.model.DBPNamedObject2;
        return this.allPseudoAttributes;

        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }
                            return false;
            for (DBSTableConstraint cons : constraints) {
 * Unless required by applicable law or agreed to in writing, software

            boolean isWithoutRowId = this.obtainIsWithoutRowId(monitor);
    @Override
        super(container, tableName, tableType, dbResult);
                        return resultSet.next() && resultSet.getBoolean("isWithoutRowId");
    @Nullable
        } else if (this.getDataSource().isServerVersionAtLeast(3, 8)) { // try to execute query with all the possible rowid names
            }
        return false;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.meta.IPropertyValueValidator;
            }
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
            return object.getDataSource() instanceof SQLiteDataSource dataSource &&
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBPEvaluationContext;

    private boolean hasPrimaryKey() throws DBException {
        List<SQLiteTableForeignKey> list = new ArrayList<>();
                        if (resultSet.next()) {
        DBDPseudoAttributeType.ROWID,
                            throw new DBException("Failed to obtain isWithoutRowId flag for table due to unexpected investigation result");
    public Collection<SQLiteTableForeignKey> getAssociations(@NotNull DBRProgressMonitor monitor) throws DBException {
                dataSource.supportsStrictTyping();
