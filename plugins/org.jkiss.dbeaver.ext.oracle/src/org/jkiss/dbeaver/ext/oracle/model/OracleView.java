    }
                boolean first = true;
            if (!additionalInfo.loaded && monitor != null) {
        public OracleView getSuperView() {

            return OracleDataType.resolveDataType(monitor, getDataSource(), typeOwner, typeName.toString());
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        return new DBEPersistAction[] {
import org.jkiss.dbeaver.model.meta.Property;
        return OracleSourceType.VIEW;
        }
        public Object getType(DBRProgressMonitor monitor) {
        return additionalInfo;
            newFormat = (OracleDDLFormat) options.get(OracleConstants.PREF_KEY_DDL_FORMAT);
/*
            if (CommonUtils.isEmpty(viewSourceText)) {
            }

    }
        }
    private final AdditionalInfo additionalInfo = new AdditionalInfo();
                    } else {

import java.sql.ResultSet;
                        }
            }
 */
                            String superViewName = JDBCUtils.safeGetString(dbResult, "SUPERVIEW_NAME");
        super(schema, dbResult);
    private String viewSourceText;
        private OracleView superView;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                        additionalInfo.typeName = JDBCUtils.safeGetStringTrimmed(dbResult, "VIEW_TYPE");
    public boolean isView() {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                             + viewDefinitionText;
                    }
                } else {
        private String typeText;
import org.jkiss.dbeaver.ext.oracle.model.source.OracleSourceObject;
 * Unless required by applicable law or agreed to in writing, software

        this.viewText = source;
        }
                        additionalInfo.setOidText(JDBCUtils.safeGetStringTrimmed(dbResult, "OID_TEXT"));
        public void setOidText(String oidText) {
            return;
        @Property(viewable = false, order = 11)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    @NotNull
                    viewText = OracleUtils.getDDL(monitor, getTableTypeName(), this, newFormat, options);
 * distributed under the License is distributed on an "AS IS" BASIS,
                loadAdditionalInfo(monitor);
        @Property(viewable = false, order = 10, supportsPreview = true)
        public String getTypeText() {
        if (viewText == null || (currentDDLFormat != newFormat && isPersisted())) {
    @Override
            new OracleObjectPersistAction(
package org.jkiss.dbeaver.ext.oracle.model;
                    }
    @Override
                        additionalInfo.typeOwner = JDBCUtils.safeGetStringTrimmed(dbResult, "VIEW_TYPE_OWNER");
                    "FROM " + OracleUtils.getAdminAllViewPrefix(monitor, getDataSource(), "VIEWS") + " WHERE OWNER=? AND VIEW_NAME=?")
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    }
    @LazyProperty(cacheValidator = AdditionalInfoValidator.class)
    @Override
    @Override
            this.oidText = oidText;

 *
    public void refreshObjectState(@NotNull DBRProgressMonitor monitor) throws DBCException {


    private static final Log log = Log.getLog(OracleView.class);
    @PropertyGroup()
                return "-- Oracle view definition is not available";
    @Override
}
                dbStat.setString(1, getContainer().getName());

        private String typeName;
                    "SELECT TEXT,TYPE_TEXT,OID_TEXT,VIEW_TYPE_OWNER,VIEW_TYPE" + (isOracle9 ? ",SUPERVIEW_NAME" : "") + "\n" +
 *
        }
    @NotNull
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        private String typeOwner;
 * See the License for the specific language governing permissions and
                }
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
                    if (dbResult.next()) {

            } catch (DBException e) {
        }
        if (CommonUtils.isEmpty(viewText)) {
import org.jkiss.dbeaver.model.meta.PropertyGroup;
        return super.refreshObject(monitor);
            }
        OracleDDLFormat newFormat = OracleDDLFormat.FULL;
 * you may not use this file except in compliance with the License.
        if (viewText == null) {
            loadAdditionalInfo(monitor);
        }

        }
import org.jkiss.dbeaver.Log;
        super(schema, name, false);
    @Override

import org.jkiss.dbeaver.model.struct.DBSObject;
    @Property(hidden = true, editable = true, updatable = true, order = -1)
        boolean isFormatInOptions = !CommonUtils.isEmpty(options) && options.containsKey(OracleConstants.PREF_KEY_DDL_FORMAT);
    @Override
 * OracleView
            return additionalInfo;
 */
    }
    }
        return super.getName();
            ) {
        return viewText;

 * limitations under the License.
            return typeText;
    public String getViewText() {
            boolean isOracle9 = getDataSource().isAtLeastV9();

            try {
                "Compile view",
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
    @Override
    protected String getTableTypeName() {
public class OracleView extends OracleTableBase implements OracleSourceObject, DBSView {
                    additionalInfo.loaded = true;
                paramsList.append(")");
            StringBuilder paramsList = new StringBuilder();
            if (attributes != null) {


        OracleSchema schema,
    }
        }
    // Generated from ALL_VIEWS

                            }
    }
                JDBCPreparedStatement dbStat = session.prepareStatement(
            return viewSourceText;
                        viewDefinitionText = JDBCUtils.safeGetString(dbResult, "TEXT");
    }

import org.jkiss.dbeaver.model.meta.LazyProperty;
    }
                        paramsList.append(",");
            } catch (SQLException e) {
        if (isFormatInOptions) {

 * Copyright (C) 2010-2025 DBeaver Corp and others
import java.util.Collection;
                    first = false;
    }

                }
            if (typeOwner == null) {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

            viewSourceText = "CREATE OR REPLACE VIEW " + getFullyQualifiedName(DBPEvaluationContext.DDL) + paramsList + "\nAS\n"
    public void setObjectDefinitionText(String source) {
                for (OracleTableColumn column : attributes) {
                        additionalInfo.setTypeText(JDBCUtils.safeGetStringTrimmed(dbResult, "TYPE_TEXT"));
        @Property(viewable = false, editable = true, order = 5)
import org.jkiss.utils.CommonUtils;
            }

                            if (!CommonUtils.isEmpty(superViewName)) {
            additionalInfo.loaded = true;
            Collection<OracleTableColumn> attributes = getAttributes(monitor);
            currentDDLFormat = OracleDDLFormat.getCurrentFormat(getDataSource());
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
    }

                }
import org.jkiss.dbeaver.model.DBUtils;

        ResultSet dbResult
    ) {
                log.warn("Error getting view definition from system package", e);
    @Property(viewable = true, editable = true, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
/**
    public OracleView(OracleSchema schema, String name) {
import org.jkiss.dbeaver.model.struct.rdb.DBSView;
        private String oidText;
        }

        this.viewText = null;
                    if (!first) {
import java.sql.SQLException;
        @Property(viewable = false, order = 12)
                    viewText = OracleUtils.getDDL(monitor, getTableTypeName(), this, currentDDLFormat, options);
                        log.warn("Cannot find view '" + getFullyQualifiedName(DBPEvaluationContext.UI) + "' metadata");
                throw new DBCException(e, session.getExecutionContext());
    public OracleSourceType getSourceType() {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table status")) {
        if (!isPersisted()) {
        }
                OracleObjectType.VIEW,
            }
        };
        }
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    }
                                additionalInfo.setSuperView(getContainer().getView(monitor, superViewName));
        this.additionalInfo.loaded = false;
                "ALTER VIEW " + getFullyQualifiedName(DBPEvaluationContext.DDL) + " COMPILE"
    }
    }
        return "VIEW";
                    currentDDLFormat = newFormat;
                paramsList.append("\n(");
    public class AdditionalInfo extends TableAdditionalInfo {
    private void loadAdditionalInfo(DBRProgressMonitor monitor) throws DBException {
 *
            this.typeText = typeText;
    public OracleView(
        }

                return null;
                    paramsList.append(DBUtils.getQuotedIdentifier(column));
 * DBeaver - Universal Database Manager

                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
    public void setViewText(String viewText) {
        this.valid = OracleUtils.getObjectStatus(monitor, this, OracleObjectType.VIEW);
        }
                        if (isOracle9) {
        public void setSuperView(OracleView superView) {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            this.superView = superView;

            return superView;

    public AdditionalInfo getAdditionalInfo(DBRProgressMonitor monitor) throws DBException {
    public DBEPersistAction[] getCompileActions(DBRProgressMonitor monitor) {
import org.jkiss.dbeaver.model.exec.DBCException;
        public void setTypeText(String typeText) {
            return oidText;
            )
        }
                dbStat.setString(2, getName());
        String viewDefinitionText = null; // It is truncated definition text
        this.viewSourceText = null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
        return viewText;
    }
        synchronized (additionalInfo) {
        }
    private OracleDDLFormat currentDDLFormat;
        if (viewDefinitionText != null) {
import java.util.Map;
        public String getOidText() {
    public String getName() {
import org.jkiss.dbeaver.DBException;
    public AdditionalInfo getAdditionalInfo() {


    }
    private String viewText;
        return true;
            try (
        this.viewText = viewText;
                if (viewText == null || !isFormatInOptions) {
            }
