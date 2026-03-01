import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        @NotNull JDBCSession session,
    protected GenericUniqueKey fetchObject(
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            GenericUtils.getColumn(tableCache.getDataSource(), GenericConstants.OBJECT_PRIMARY_KEY, JDBCConstants.PK_NAME)
        @NotNull JDBCSession session,
        try {
    @Nullable
        @NotNull JDBCResultSet dbResult
    protected JDBCStatement prepareObjectsStatement(
import org.jkiss.dbeaver.ext.generic.model.meta.GenericMetaObject;
    private final GenericMetaObject pkObject;
        @NotNull String pkName,
        return parentName.toUpperCase(Locale.ENGLISH) + "_PK";
}
import org.jkiss.dbeaver.DBException;
        @NotNull JDBCSession session,
            );
 * limitations under the License.
    }
        @Nullable GenericTableBase forParent
        pkObject = tableCache.getDataSource().getMetaObject(GenericConstants.OBJECT_PRIMARY_KEY);
            parent,
import java.util.Locale;
    }
        @NotNull GenericUniqueKey object,

        @NotNull GenericTableBase parent,
    ) throws SQLException, DBException {
 * Unless required by applicable law or agreed to in writing, software

        } catch (SQLException e) {
 */
import org.jkiss.code.NotNull;
import java.sql.SQLException;

            pkName,
        }
                throw new SQLException(e);
                owner,
import org.jkiss.code.Nullable;
 *
    }
            }
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCCompositeCache;
        super(
            tableCache,
    @Override

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    }
            } else {
            if (forParent == null) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return parent.getDataSource().getMetaModel().createConstraintColumnsImpl(session, parent, object, pkObject, dbResult);
 * distributed under the License is distributed on an "AS IS" BASIS,

package org.jkiss.dbeaver.ext.generic.model;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCConstants;
                forParent
    @Nullable
        int keySeq = GenericUtils.safeGetInt(pkObject, dbResult, JDBCConstants.KEY_SEQ);
                session,
            true
    @NotNull
            return owner.getDataSource().getMetaModel().prepareUniqueConstraintsLoadStatement(
import java.util.List;
    protected String getDefaultObjectName(JDBCResultSet dbResult, String parentName) {
        @NotNull GenericStructContainer owner,
    protected GenericTableConstraintColumn[] fetchObjectRow(
        @NotNull JDBCResultSet dbResult
    @Override

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
    @Override
/**
            throw e;
public class ConstraintKeysCache
        @NotNull GenericTableBase parent,
 *
            owner.getDataSource().getMetaModel().getUniqueConstraintType(dbResult),
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

import org.jkiss.dbeaver.ext.generic.GenericConstants;
    protected void cacheChildren(@NotNull DBRProgressMonitor monitor, @NotNull GenericUniqueKey primaryKey, @NotNull List<GenericTableConstraintColumn> rows) {
/*
 * Copyright (C) 2010-2025 DBeaver Corp and others
    ) throws SQLException {
    ) throws SQLException, DBException {

        @NotNull GenericStructContainer owner,
 * See the License for the specific language governing permissions and
            dbResult,
            GenericUtils.getColumn(tableCache.getDataSource(), GenericConstants.OBJECT_PRIMARY_KEY, JDBCConstants.TABLE_NAME),

 */
    }
    @Override
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;

    extends JDBCCompositeCache<GenericStructContainer, GenericTableBase, GenericUniqueKey, GenericTableConstraintColumn> {

        );
        );
        return owner.getDataSource().getMetaModel().createConstraintImpl(
            GenericTableBase.class,
 * Index cache implementation
        primaryKey.setAttributeReferences(rows);
        } catch (Exception e) {
    ConstraintKeysCache(TableCache tableCache) {
                throw new SQLException("Global primary keys read not supported", e);
