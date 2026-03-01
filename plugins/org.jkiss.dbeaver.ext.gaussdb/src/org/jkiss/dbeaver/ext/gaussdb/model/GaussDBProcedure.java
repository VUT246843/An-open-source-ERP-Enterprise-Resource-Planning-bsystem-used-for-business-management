            } catch (SQLException e) {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreProcedure;
    public GaussDBProcedure(DBRProgressMonitor monitor, PostgreSchema schema, ResultSet dbResult) {

            }
        if (this.isPersisted() && !omitHeader) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        String procDDL = omitHeader || CommonUtils.getOption(options, OPTION_SKIP_DROPS) ?
    }

        super(monitor, schema, dbResult);
            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read procedure body")) {
    public long getPropackageid() {
    public String body = getBody();
        if (isPersisted() && (!getDataSource().getServerType().supportsFunctionDefRead() || omitHeader) && !isAggregate()) {
                throw new DBException("Error reading procedure body", e);
                List<DBEPersistAction> actions = new ArrayList<>();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * distributed under the License is distributed on an "AS IS" BASIS,
                body = generateFunctionDeclaration(getLanguage(monitor), returnTypeName, "\n\t-- Enter function body here\n");
            procDDL = getObjectDefinitionTextWhenBodyNull(monitor, procDDL);
            procDDL = getObjectDefinitionTextWhenPersisted(monitor, omitHeader, procDDL);
                procDDL += "\nCOMMENT ON " + getProcedureTypeName() + " " + getFullQualifiedSignature() + " IS "
                PostgreUtils.getObjectGrantPermissionActions(monitor, this, actions, options);
            }
package org.jkiss.dbeaver.ext.gaussdb.model;
            }

            }

import java.util.Map;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataType;
import org.jkiss.code.NotNull;

            procDDL += ";\n";

                String returnTypeName = returnType == null ? null : returnType.getFullTypeName();

    public String procSrc;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        this.propackageid = JDBCUtils.safeGetLong(dbResult, "propackageid");
                }
        super(schema);
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String prokind;
    @Override
 *
    }
    @Property(hidden = true, editable = true, updatable = true, order = -1)

    }
            } else if (getObjectId() == 0) {
        return (procDDL + (omitHeader ? procSrc : generateFunctionDeclaration(getLanguage(monitor), returnTypeName, procSrc)));
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
        String procDDL) throws DBCException, DBException {
import org.jkiss.dbeaver.ext.postgresql.model.PostgreSchema;
                body = this.procSrc;
 * You may obtain a copy of the License at
                    body = res == null ? this.procSrc : res.substring(4, res.length() - 2);
        if (procSrc == null) {
                PostgreDataType returnType = getReturnType();
public class GaussDBProcedure extends PostgreProcedure {
    }
}
    private String getObjectDefinitionTextWhenPersisted(DBRProgressMonitor monitor, boolean omitHeader,
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.DBCException;
                // No OID so let's use old (bad) way
 * DBeaver - Universal Database Manager
 *
        this.procSrc = JDBCUtils.safeGetString(dbResult, "prosrc");

        return procDDL;
import java.util.List;
        return (procDDL + body);
import java.sql.SQLException;
            if (CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_COMMENTS) && !CommonUtils.isEmpty(getDescription())) {
    public GaussDBProcedure(PostgreSchema schema) {
                procDDL += "\n" + SQLUtils.generateScript(getDataSource(), actions.toArray(new DBEPersistAction[0]), false);
    }
                procSrc = JDBCUtils.queryString(session, "SELECT prosrc FROM pg_proc where oid = ?", getObjectId());
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return propackageid;
                } catch (SQLException e) {
        }
import org.jkiss.dbeaver.model.sql.SQLUtils;
                    throw new DBException("Error reading procedure body", e);
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
        String returnTypeName = returnType == null ? null : returnType.getFullTypeName();
 * limitations under the License.
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
                try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read procedure body")) {
        } else {
            if (!isPersisted()) {
                    + SQLUtils.quoteString(this, getDescription()) + ";\n";
        boolean omitHeader = CommonUtils.getOption(options, OPTION_DEBUGGER_SOURCE);
import org.jkiss.dbeaver.model.DBUtils;
 *
import java.util.ArrayList;
            "" :
                    String res = JDBCUtils.queryString(session, "SELECT pg_get_functiondef(" + getObjectId() + ")");
import java.sql.ResultSet;


import org.jkiss.utils.CommonUtils;
/*
            "-- DROP " + getProcedureTypeName() + " " + getFullQualifiedSignature() + ";\n\n";

import org.jkiss.dbeaver.model.meta.Property;
        PostgreDataType returnType = getReturnType();
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
            } else {
    public long propackageid;
    }
        if (body == null) {
 * See the License for the specific language governing permissions and
            if (CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_PERMISSIONS)) {
 */

        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


        }
    @NotNull
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.DBPScriptObject;
    private String getObjectDefinitionTextWhenBodyNull(DBRProgressMonitor monitor, String procDDL) throws DBException, DBCException {
