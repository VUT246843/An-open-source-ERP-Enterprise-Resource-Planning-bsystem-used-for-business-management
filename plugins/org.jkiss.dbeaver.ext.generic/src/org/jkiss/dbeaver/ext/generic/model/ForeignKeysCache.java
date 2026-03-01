 * you may not use this file except in compliance with the License.
                log.warn("Can't find PK table " + pkTable.getFullyQualifiedName(DBPEvaluationContext.DDL) + " column " + pkColumnName);
                        pk = pkConstraint;
            }
        if (CommonUtils.isEmpty(fkColumnName)) {
            pk = DBUtils.findObject(pkTable.getConstraints(session.getProgressMonitor()), pkName);
        String fkTableSchema = GenericUtils.safeGetStringTrimmed(foreignKeyObject, dbResult, JDBCConstants.FKTABLE_SCHEM);
 * limitations under the License.
    public void clearCache() {
            log.warn("Can't find PK table " + DBUtils.getObjectFullName(referencedConstraint.getParentObject(), DBPEvaluationContext.DML)
            }
                    + pkColumn.getName() + ". Making fake one.");
                    + " for foreign key " + fkName + " in table " + parent.getName());

                        if (index.isUnique() && DBUtils.getConstraintAttribute(session.getProgressMonitor(), index, pkColumn) != null) {
            log.warn("Empty FK column for table " + foreignKey.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + " PK column "
    }
        int keySeq = GenericUtils.safeGetInt(foreignKeyObject, dbResult, JDBCConstants.KEY_SEQ);
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModel;
            int deleteRuleNum = GenericUtils.safeGetInt(foreignKeyObject, dbResult, JDBCConstants.DELETE_RULE);
 *
        DBSForeignKeyModifyRule deleteRule;
        boolean trimNames = owner.getDataSource().getMetaModel().isTrimObjectNames();
        @NotNull GenericStructContainer owner,
    @Override
        @NotNull JDBCResultSet dbResult
        if (CommonUtils.isEmpty(pkTableCatalog) && parentCatalog != null) {
            GenericUtils.getColumn(tableCache.getDataSource(), GenericConstants.OBJECT_FOREIGN_KEY, JDBCConstants.FK_NAME)
                        .createConstraintImpl(pkTable, pkName, DBSEntityConstraintType.PRIMARY_KEY, dbResult, true);
import org.jkiss.dbeaver.ext.generic.GenericConstants;
/*
        }
        return new GenericTableForeignKeyColumnTable[] {
            GenericUtils.getColumn(tableCache.getDataSource(), GenericConstants.OBJECT_FOREIGN_KEY, JDBCConstants.FKTABLE_NAME),
}
            }
                + " column " + pkColumnName);
        fkIndex = 1;
        int keySeq = GenericUtils.safeGetInt(foreignKeyObject, dbResult, JDBCConstants.KEY_SEQ);
                if (fakePk == null) {
public class ForeignKeysCache

        String pkTableCatalog = GenericUtils.safeGetStringTrimmed(foreignKeyObject, dbResult, JDBCConstants.PKTABLE_CAT);


            .findTable(session.getProgressMonitor(), pkTableCatalog, pkTableSchema, pkTableName);
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyDeferability;
        if (CommonUtils.isEmpty(pkTableName)) {
        @NotNull GenericTableForeignKey foreignKey,
            fkName = parent.getName().toUpperCase() + "_FK_" + pkTable.getName().toUpperCase(Locale.ENGLISH);
                GenericUniqueKey fakePk;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCCompositeCache;

        GenericTableColumn fkColumn = foreignKey.getTable().getAttribute(session.getProgressMonitor(), fkColumnName);
/**
        return owner.getDataSource().getMetaModel().prepareForeignKeysLoadStatement(session, owner, forParent);
    private final GenericMetaObject foreignKeyObject;
                log.warn("Can't find unique key for table " + pkTable.getFullyQualifiedName(DBPEvaluationContext.DDL) + " column "
                pk = fakePk;
            referencedConstraint,
                            break;
            if (pkColumn == null) {
        super(

            new GenericTableForeignKeyColumnTable(foreignKey, fkColumn, keySeq, (GenericTableColumn) pkColumn.getAttribute())
        DBSCatalog parentCatalog = DBUtils.getParentOfType(DBSCatalog.class, owner);
        }
        if (!CommonUtils.isEmpty(pkName)) {
        }
    @Nullable
        } else {
            : GenericUtils.safeGetString(foreignKeyObject, dbResult, JDBCConstants.PKTABLE_NAME);
        String pkName = trimNames ?
        int keySeq = GenericUtils.safeGetInt(foreignKeyObject, dbResult, JDBCConstants.KEY_SEQ);
                log.debug("Unique key '" + pkName + "' not found in table " + pkTable.getFullyQualifiedName(DBPEvaluationContext.DDL)
        boolean trimNames = parent.getDataSource().getMetaModel().isTrimObjectNames();
 * DBeaver - Universal Database Manager
            if (pk == null) {
    ) throws SQLException, DBException {
            }
        }
        @NotNull String fkName,
            }
            int deferabilityNum = GenericUtils.safeGetInt(foreignKeyObject, dbResult, JDBCConstants.DEFERRABILITY);
            };
        @NotNull GenericTableBase parent, @NotNull GenericTableForeignKey foreignKey, @NotNull JDBCResultSet dbResult

import org.jkiss.utils.CommonUtils;
            updateRule = foreignKeyFetcher.fetchUpdateRule(foreignKeyObject, dbResult);
                    pkName = "primary_key";
        pkMap.clear();
    ForeignKeysCache(TableCache tableCache) {

        String pkTableSchema = GenericUtils.safeGetStringTrimmed(foreignKeyObject, dbResult, JDBCConstants.PKTABLE_SCHEM);
                log.warn("Can't find PK table " + pkTableName);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                        }
                if (pkName == null) {
 */
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    }
                        && DBUtils.getConstraintAttribute(session.getProgressMonitor(), pkConstraint, pkColumn) != null) {
        String pkTableFullName = DBUtils.getSimpleQualifiedName(pkTableCatalog, pkTableSchema, pkTableName);
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer owner, @Nullable
    ) throws SQLException, DBException {



            : GenericUtils.safeGetString(foreignKeyObject, dbResult, JDBCConstants.PKCOLUMN_NAME);
            pkColumnName

        String fkName = "FK_" + parentName + "_" + pkTableName;
        GenericTableBase pkTable = parent.getDataSource()
            // Try to use FK catalog/schema
 */
        @NotNull List<GenericTableForeignKeyColumnTable> rows
                    }
        return fkName;
    @Nullable
        DBSForeignKeyModifyRule updateRule;
 * You may obtain a copy of the License at
                return null;
        if (CommonUtils.isEmpty(fkName)) {
        if (referencedConstraint == null) {
        String pkTableName = trimNames ?
    }
                default -> DBSForeignKeyDeferability.UNKNOWN;
    protected GenericTableForeignKeyColumnTable[] fetchObjectRow(
            deferability = switch (deferabilityNum) {
            GenericUtils.safeGetStringTrimmed(foreignKeyObject, dbResult, JDBCConstants.PK_NAME)
    @Override
                case DatabaseMetaData.importedKeyInitiallyDeferred -> DBSForeignKeyDeferability.INITIALLY_DEFERRED;
        DBSEntityAttributeRef pkColumn = DBUtils.getConstraintAttribute(
        @NotNull GenericTableBase parent,
        if (pkTable == null) {
                GenericUtils.safeGetStringTrimmed(foreignKeyObject, dbResult, JDBCConstants.PKCOLUMN_NAME)
 * Foreign key cache
            pkTable = parent.getDataSource().findTable(session.getProgressMonitor(), fkTableCatalog, fkTableSchema, pkTableName);
        foreignKeyObject = tableCache.getDataSource().getMetaObject(GenericConstants.OBJECT_FOREIGN_KEY);
 * See the License for the specific language governing permissions and
                    if (pkConstraint.getConstraintType().isUnique()
        }
    @Override
                    for (GenericTableIndex index : indexes) {
            String pkColumnName = trimNames ?
        }
            fkTableCatalog = parentCatalog.getName();
 * Copyright (C) 2010-2025 DBeaver Corp and others
        DBSEntityReferrer pk = null;
            if (uniqueKeys != null) {


        };
            session.getProgressMonitor(),
            }
            log.warn("Null reference constraint in FK '" + foreignKey.getFullyQualifiedName(DBPEvaluationContext.DDL) + "'");
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
        String fkTableCatalog = GenericUtils.safeGetStringTrimmed(foreignKeyObject, dbResult, JDBCConstants.FKTABLE_CAT);
                fakePk.addColumn(new GenericTableConstraintColumn(fakePk, pkColumn, keySeq));
        );
                    pkMap.put(pkFullName, fakePk);
            int updateRuleNum = GenericUtils.safeGetInt(foreignKeyObject, dbResult, JDBCConstants.UPDATE_RULE);
            : GenericUtils.safeGetString(foreignKeyObject, dbResult, JDBCConstants.FKCOLUMN_NAME);
        super.clearCache();
        }
        foreignKey.setColumns(monitor, rows);
                }
            deleteRule = foreignKeyFetcher.fetchDeleteRule(foreignKeyObject, dbResult);
import java.util.*;
            .createTableForeignKeyImpl(parent, fkName, null, pk, deleteRule, updateRule, deferability, true);

                String pkFullName = pkTable.getFullyQualifiedName(DBPEvaluationContext.DDL) + "." + pkName;
            if (pkTable == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
package org.jkiss.dbeaver.ext.generic.model;

        if (fkIndex > 1 && keySeq == 1) {
        );
        @NotNull DBRProgressMonitor monitor,
            } else {
    @NotNull
        if (pkColumn == null) {
import org.jkiss.dbeaver.model.struct.DBSEntityAttributeRef;
                case DatabaseMetaData.importedKeyInitiallyImmediate -> DBSForeignKeyDeferability.INITIALLY_IMMEDIATE;
        if (fkColumn == null) {
                log.debug("PK table " + pkTableFullName + " was taken from FK container.");
            log.warn(
        // Find PK
            deferability = foreignKeyFetcher.fetchDeferability(foreignKeyObject, dbResult);

            if (pk == null) {
    ) {
    private final Map<String, GenericUniqueKey> pkMap = new HashMap<>();
        }
            GenericTableColumn pkColumn = pkTable.getAttribute(session.getProgressMonitor(), pkColumnName);
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaModelForeignKeyFetcher;
        }
            GenericUtils.safeGetStringTrimmed(foreignKeyObject, dbResult, JDBCConstants.PKCOLUMN_NAME)
                Collection<? extends GenericTableIndex> indexes = pkTable.getIndexes(session.getProgressMonitor());
            deleteRule = JDBCUtils.getCascadeFromNum(deleteRuleNum);
                "Can't find FK table " + foreignKey.getTable().getFullyQualifiedName(DBPEvaluationContext.DDL) + " column " + fkColumnName);
    }
            return null;

            GenericUtils.safeGetStringTrimmed(foreignKeyObject, dbResult, JDBCConstants.FKCOLUMN_NAME)
            return null;
            : GenericUtils.safeGetString(foreignKeyObject, dbResult, JDBCConstants.PK_NAME);
import org.jkiss.dbeaver.model.struct.DBSEntityReferrer;
                }
    protected String getDefaultObjectName(JDBCResultSet dbResult, String parentName) {
        if (CommonUtils.isEmpty(fkTableCatalog) && parentCatalog != null) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            if (pk == null) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
            tableCache,
 *
            // [JDBC] Some drivers return empty foreign key names
        fkIndex = 1;

                        break;
import org.jkiss.code.Nullable;
        @NotNull JDBCSession session,
        }
                if (indexes != null) {
                    fakePk.getTable().addUniqueKey(fakePk);
        }
 *
    extends JDBCCompositeCache<GenericStructContainer, GenericTableBase, GenericTableForeignKey, GenericTableForeignKeyColumnTable> {
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaObject;
    @Override

        if (metaModel instanceof GenericMetaModelForeignKeyFetcher foreignKeyFetcher) {
                // No PK. Let's try unique indexes
                }
    }
            GenericTableBase.class,
        @NotNull JDBCSession session,
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
        DBSForeignKeyDeferability deferability;
import java.sql.SQLException;
            return null;
    }
            pkTableCatalog = parentCatalog.getName();
                    fakePk = pkTable.getDataSource().getMetaModel()
                return null;
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;
                fakePk = pkMap.get(pkFullName);
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    private int fkIndex;
                case DatabaseMetaData.importedKeyNotDeferrable -> DBSForeignKeyDeferability.NOT_DEFERRABLE;
        return owner.getDataSource().getMetaModel()
                for (GenericUniqueKey pkConstraint : uniqueKeys) {
                    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        }
        String pkColumnName = trimNames ?
    protected GenericTableForeignKey fetchObject(
            Collection<GenericUniqueKey> uniqueKeys = pkTable.getConstraints(session.getProgressMonitor());
                // Too bad. But we have to create new fake PK for this FK
        final String pkTableName = GenericUtils.safeGetStringTrimmed(foreignKeyObject, dbResult, JDBCConstants.PKTABLE_NAME);
    protected void cacheChildren(
                }
import org.jkiss.dbeaver.DBException;
            return null;
    }
                            pk = index;
 * Unless required by applicable law or agreed to in writing, software
    @Override
                + pkColumnName);
    @Override
                    // Add this fake constraint to it's owner
            log.debug("Null PK table name");
import org.jkiss.dbeaver.model.DBUtils;
        String fkColumnName = trimNames ?
            fkName += "_" + fkIndex;
import java.sql.DatabaseMetaData;
    GenericTableBase forParent) throws SQLException {
        DBSEntityReferrer referencedConstraint = foreignKey.getReferencedConstraint();

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (pk == null) {
        GenericMetaModel metaModel = owner.getDataSource().getMetaModel();
            updateRule = JDBCUtils.getCascadeFromNum(updateRuleNum);
                : GenericUtils.safeGetString(foreignKeyObject, dbResult, JDBCConstants.PKCOLUMN_NAME);
            return null;
            GenericUtils.safeGetStringTrimmed(foreignKeyObject, dbResult, JDBCConstants.PKTABLE_NAME)
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
        fkIndex++;
