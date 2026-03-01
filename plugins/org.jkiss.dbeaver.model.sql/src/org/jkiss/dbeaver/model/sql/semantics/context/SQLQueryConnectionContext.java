        } else {
        if (objs.isEmpty()) {
            return Collections.emptyList();
     * Find real table referenced by its name in the database
    @NotNull
     */
                }
    /**
     */
 *     http://www.apache.org/licenses/LICENSE-2.0
            return objectType.getTypeClass().isInstance(objs.getFirst()) ? objs : Collections.emptyList();
public abstract class SQLQueryConnectionContext {
 *
     * Find real object of given type referenced by its name in the database
        //  each alias expansion should be treated as a virtual table
import org.jkiss.dbeaver.DBException;
     * Resolve target object for alias
            return objs.stream().filter(o ->  objectType.getTypeClass().isInstance(o)).toList();
    public final List<? extends DBSObject> findRealObjects(
    public abstract List<SQLQueryResultPseudoColumn> obtainRowsetPseudoColumns(@Nullable SQLQueryRowsSourceModel rowsSource);
        List<? extends DBSObject> objs = this.findRealObjectsImpl(monitor, objectName);
        List<? extends DBSObject> objs = this.findRealObjectsImpl(monitor, tableName);
    @Nullable
                DBSObject obj = expandAliases(monitor, objs.get(i));

 *
    @NotNull
/*
     */
    }

import org.jkiss.dbeaver.Log;
            } catch (DBException e) {
    public List<DBSEntity> findRealTables(@NotNull DBRProgressMonitor monitor, @NotNull List<String> tableName) {
        @NotNull SQLDialect dialect
 * DBeaver - Universal Database Manager
        // TODO consider differentiating direct references vs expanded aliases:

    /**


 * limitations under the License.
        // TODO treat alias as a virtual table instead of blind expansion!
            for (int i  = 0; i < objs.size(); i++) {
import org.jkiss.code.Nullable;

            return Collections.emptyList();
    protected abstract List<? extends DBSObject> findRealObjectsImpl(@NotNull DBRProgressMonitor monitor, @NotNull List<String> objectName);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    ) {
    }
            }
 *
                log.debug("Can't resolve target object for alias '" + aliasObject.getName() + "'", e);
    /**
            }
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
            try {
 * You may obtain a copy of the License at
        }


                obj = null;
        this.dialect = dialect;
 * you may not use this file except in compliance with the License.
        } else {
import java.util.ArrayList;
            return results;

    @NotNull
    @Nullable
 * Unless required by applicable law or agreed to in writing, software
    public abstract SQLQueryResultPseudoColumn resolveGlobalPseudoColumn(@NotNull String name);
 * See the License for the specific language governing permissions and
        } else if (objs.size() == 1) {
import org.jkiss.dbeaver.model.struct.*;
package org.jkiss.dbeaver.model.sql.semantics.context;
        @NotNull DBSObjectType objectType,
    private static final Log log = Log.getLog(SQLQueryConnectionContext.class);
    public static DBSObject expandAliases(@NotNull DBRProgressMonitor monitor, @Nullable DBSObject obj) {
        while (obj instanceof DBSAlias aliasObject) {
import java.util.Collections;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        }
    }
import org.jkiss.dbeaver.model.sql.SQLDialect;
        @NotNull List<String> objectName
        }
    protected SQLQueryConnectionContext(
                obj = aliasObject.getTargetObject(monitor);
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
                    results.add((DBSEntity) obj);
 * distributed under the License is distributed on an "AS IS" BASIS,
    ) {
}
            List<DBSEntity> results = new ArrayList<>(objs.size());
import org.jkiss.dbeaver.model.struct.rdb.DBSView;
import java.util.List;
    @NotNull
    public abstract boolean isDummy();
                if (obj instanceof DBSTable || obj instanceof DBSView) {

    @NotNull

        if (objs.isEmpty()) {
        return obj;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public final SQLDialect dialect;
    }
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsSourceModel;
import org.jkiss.code.NotNull;
