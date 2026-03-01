import java.sql.SQLException;

            } else {
    }
    }
 * See the License for the specific language governing permissions and
                getDataSource(), actions.toArray(new DBEPersistAction[0]), false));
    @NotNull
                }
        return definition;
        if (options != null) {
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
            if (isPersisted()) {
            throw new DBException("View '" + getName() + "' doesn't exist");
    public String getName()
import org.jkiss.utils.CommonUtils;
    }
 *
        PostgreSchema catalog,

        return source;
        }

        return super.getName();

        if (!actions.isEmpty()) {
import java.util.ArrayList;
                        source = PostgreUtils.getViewDDL(monitor, this, definition, options);
import java.util.Collection;
        }

                    PostgreTableColumnManager.addColumnCommentAction(actions, column);

import org.jkiss.dbeaver.model.DBPEvaluationContext;

                    } catch (SQLException e) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 */
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistActionComment;
            Collection<PostgreTrigger> triggers = getTriggers(monitor);
            needRefresh = CommonUtils.toBoolean(options.get(DBPScriptObject.OPTION_REFRESH));
    private String fetchViewQueryResultIfItNull(JDBCSession session) throws SQLException, DBException {
        this.source = sourceText;
                source = "";
                        }
import org.jkiss.dbeaver.model.DBPScriptObject;
import org.jkiss.dbeaver.DBException;
 *

    protected String readExtraDefinition(JDBCSession session, Map<String, Object> options) throws DBException {

        return null;

        super(catalog, dbResult);
    }
        return true;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            if (!CommonUtils.isEmpty(triggers)) {
        boolean needRefresh = false;
    public PostgreViewBase(
    public String getSource() {
        if (source == null || needRefresh) {

    @NotNull
public abstract class PostgreViewBase extends PostgreTableReal implements DBSView {
/**
        String definition = JDBCUtils.queryString(session, "SELECT pg_get_viewdef(" + getObjectId() + ", true)");
                    }
 * You may obtain a copy of the License at
                }
    @Override
    }
import java.util.List;
            ddl.append("\n\n").append(SQLUtils.generateScript(
        if (isPersisted() && CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_PERMISSIONS)) {
                if (!CommonUtils.isEmpty(column.getDescription())) {
                        String definition = fetchViewQueryResultIfItNull(session);
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
                }
        return super.refreshObject(monitor);
        return null;
        if (CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_COMMENTS)) {
                        throw new DBException("Error reading view definition: " + e.getMessage(), e);
            }
import org.jkiss.dbeaver.model.meta.Property;
                            this.source += "\n" + extDefinition;

                actions.add(
        if (isPersisted()) {
            }

        }
                for (PostgreTrigger trigger : triggers) {
    }
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        if (extDefinition != null) {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

 * distributed under the License is distributed on an "AS IS" BASIS,
                source = getDataSource().getServerType().readViewDDL(monitor, this);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
import org.jkiss.dbeaver.model.struct.rdb.DBSView;
        super(catalog);
}
                    actions.add(new SQLDatabasePersistActionComment(getDataSource(), "View Triggers"));
                    try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read view definition")) {
            }
    public void setObjectDefinitionText(String sourceText) {

        }
import org.jkiss.dbeaver.ext.postgresql.edit.PostgreTableColumnManager;
        return ddl.toString();
                        "COMMENT ON " + getTableTypeName() + " " + getFullyQualifiedName(DBPEvaluationContext.DDL) + " IS " + SQLUtils.quoteString(this, getDescription())));
    @Property(hidden = true, editable = true, updatable = true, order = -1)
import org.jkiss.dbeaver.ModelPreferences;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException
    public PostgreViewBase(PostgreSchema catalog)
    @Override
 */
    {
    }

 * Unless required by applicable law or agreed to in writing, software
            }
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    {
        this.source = null;
    public boolean isView()

import java.sql.ResultSet;
    public Collection<? extends DBSTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException {
import java.util.Map;
        List<DBEPersistAction> actions = new ArrayList<>();

            for (PostgreTableColumn column : CommonUtils.safeCollection(getAttributes(monitor))) {
        ResultSet dbResult)
    {
    @Override
    @Override
import org.jkiss.dbeaver.model.sql.SQLUtils;
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        if (definition == null) {
    {
                        String extDefinition = readExtraDefinition(session, options);
    @Override
        }
import org.jkiss.dbeaver.model.struct.DBSObject;

import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
 *
        // Do not use view id as a parameter. For some reason it doesn't work for Redshift
 * limitations under the License.

 * you may not use this file except in compliance with the License.
 * PostgreViewBase
                }
            PostgreUtils.getObjectGrantPermissionActions(monitor, this, actions, options);
    @Property(viewable = true, editable = true, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.model.DBUtils;
                    actions.add(new SQLDatabasePersistAction("Create trigger", trigger.getObjectDefinitionText(monitor, options)));

    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
        StringBuilder ddl = new StringBuilder(source);
    {
                    new SQLDatabasePersistAction("Comment",
package org.jkiss.dbeaver.ext.postgresql.model;

        }
    private String source;
import org.jkiss.code.NotNull;
                if (getDataSource().getContainer().getPreferenceStore().getBoolean(ModelPreferences.META_EXTRA_DDL_INFO)) {
/*
    }
    @Override
            if (getDescription() != null) {
    }
                if (source == null) {
