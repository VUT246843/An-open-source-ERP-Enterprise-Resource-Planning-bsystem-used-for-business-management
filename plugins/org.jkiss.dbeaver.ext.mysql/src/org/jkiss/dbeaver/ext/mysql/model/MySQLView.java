 * Unless required by applicable law or agreed to in writing, software
        //@Property(hidden = true, editable = true, updatable = true, order = -1)
                    if (dbResult.next()) {

import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                        String definition = JDBCUtils.safeGetString(dbResult, "Create View");
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        return additionalInfo;
        ResultSet dbResult)

        public String algorithm;
        if (!isPersisted() || getContainer().isSystem()) {
        private String definer;
                    " FROM " + MySQLConstants.META_TABLE_VIEWS + " WHERE " + MySQLConstants.COL_TABLE_SCHEMA + "=? AND " + MySQLConstants.COL_TABLE_NAME + "=?")) {

                            SQLFormatUtils.formatSQL(getDataSource(), definition));
                throw new DBCException(e, session.getExecutionContext());
    {

        return true;

    @LazyProperty(cacheValidator = AdditionalInfoValidator.class)


            return additionalInfo;
    public MySQLView(
            }
                                String statement;
    }
    @Override
    public List<? extends DBSTableForeignKey> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException

        NONE(null),
    @Override
        synchronized (additionalInfo) {
    @Override
        }
                dbStat.setString(2, getName());
 * you may not use this file except in compliance with the License.
import org.jkiss.code.Nullable;
        public void setAlgorithm(String algorithm) { this.algorithm = algorithm; }
        MySQLCatalog catalog,
import org.jkiss.dbeaver.model.exec.DBCException;
                                }
import java.util.Map;
                        } catch (IllegalArgumentException e) {
    @Nullable
            } catch (SQLException e) {
    }
    {
    public String getName()

 *     http://www.apache.org/licenses/LICENSE-2.0
    {
    {
                throw new DBCException(e, session.getExecutionContext());
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
    {
    {
    private String parseAlgorithm(String ddl) {
            return;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            return "";
/**
    {
    public List<? extends DBSTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException
        public String getDefinition() { return definition; }
        {
        private volatile boolean loaded = false;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException
import org.jkiss.dbeaver.DBException;
import java.sql.ResultSet;

        }
    @NotNull
    @Override
        @Property(viewable = true, order = 7) public String getAlgorithm() { return algorithm; }
    }
        @Override
    public enum CheckOption {
 *
    private void loadAdditionalInfo(DBRProgressMonitor monitor) throws DBCException
import java.util.List;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
public class MySQLView extends MySQLTableBase implements DBSView

    public AdditionalInfo getAdditionalInfo()
 *
        private CheckOption checkOption;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.meta.LazyProperty;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            int divPos = definition.indexOf(" VIEW `");
    public void setObjectDefinitionText(String sourceText) throws DBException
    @NotNull
    {
                                    statement = "CREATE OR REPLACE";
    @PropertyGroup()
        private final String definitionName;
        super(catalog, dbResult);
    public static class AdditionalInfoValidator implements IPropertyCacheValidator<MySQLView> {

        @Property(viewable = true, editable = true, updatable = true, order = 4) public CheckOption getCheckOption() { return checkOption; }
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
    @Nullable
    @Property(hidden = true, editable = true, updatable = true, order = -1)
    {
    }

        }
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Override
    }
        public void setDefiner(String definer) { this.definer = definer; }
    public AdditionalInfo getAdditionalInfo(DBRProgressMonitor monitor) throws DBCException
 */
    }
import org.jkiss.dbeaver.model.meta.IPropertyCacheValidator;
            this.definitionName = definitionName;
    }
    public String getDescription()
            try (JDBCPreparedStatement dbStat = session.prepareStatement(

import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
            if (!additionalInfo.loaded) {
                        additionalInfo.setDefinition(
import java.util.regex.Matcher;
                                }
        getAdditionalInfo().setDefinition(sourceText);
        private String definition;
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.struct.rdb.DBSTableConstraint;
    @Property(viewable = true, editable = true, valueTransformer = DBObjectNameCaseTransformer.class, order = 1)
 * limitations under the License.
            additionalInfo.loaded = true;
        String definition = getAdditionalInfo(monitor).getDefinition();
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @Property(viewable = true, order = 6) public String getDefiner() { return definer; }
                    }
 * MySQLView
        return definition;
        public void setCheckOption(CheckOption checkOption) { this.checkOption = checkOption; }
import org.jkiss.dbeaver.model.DBUtils;
            }
    public List<? extends DBSTableForeignKey> getAssociations(@NotNull DBRProgressMonitor monitor) throws DBException
import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKey;
                dbStat.setString(1, getContainer().getName());
                "SELECT " + MySQLConstants.COL_CHECK_OPTION + "," + MySQLConstants.COL_DEFINER + "," + MySQLConstants.COL_IS_UPDATABLE +
        Matcher matcher = Pattern.compile("ALGORITHM\\s*=\\s*([A-Z_]+) ").matcher(ddl);
                "SHOW CREATE VIEW " + getFullyQualifiedName(DBPEvaluationContext.DDL))) {
    }
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                }
    private final AdditionalInfo additionalInfo = new AdditionalInfo();
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
        {
        public String getDefinitionName()
    public static class AdditionalInfo {
    }
 *
                            additionalInfo.setCheckOption(CheckOption.valueOf(JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_CHECK_OPTION)));
        return matcher.find() ? matcher.group(1) : null;

}
                                additionalInfo.algorithm = parseAlgorithm(definition.substring(0, divPos));
 * Licensed under the Apache License, Version 2.0 (the "License");
    public boolean isView()
    }
import java.sql.SQLException;
                }

    public MySQLView(MySQLCatalog catalog)

    }
    }
    {

                        }
        return null;
        }
                                String params = "";
        public boolean isPropertyCached(@NotNull MySQLView object, @NotNull Object propertyId)
        {
        @Property(viewable = true, order = 5) public boolean isUpdatable() { return updatable; }
            }
{
                                if (!CommonUtils.isEmpty(additionalInfo.algorithm)) {
        }
        return null;
        private boolean updatable;
 * DBeaver - Universal Database Manager
    }
                                    statement = isPersisted() ? "ALTER" : "CREATE";
                        try {
/*
                loadAdditionalInfo(monitor);
    {
    private static final Log log = Log.getLog(MySQLView.class);
 * See the License for the specific language governing permissions and
                        additionalInfo.setDefiner(JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_DEFINER));

 * You may obtain a copy of the License at
                                } else {

import org.jkiss.dbeaver.model.meta.PropertyGroup;
        LOCAL("LOCAL");
    }
                                if (getDataSource().supportsAlterView()) {
package org.jkiss.dbeaver.ext.mysql.model;
        return null;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.struct.rdb.DBSView;
    @Override
    }
    @Override
    {

        return null;
        }
            return object.additionalInfo.loaded;
        return null;
    {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table status")) {


                            log.warn(e);

    public List<? extends DBSTableConstraint> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException
                                definition = statement + " " + params + definition.substring(divPos);
    @Override
                                    params += " ALGORITHM=" + additionalInfo.algorithm + " ";
                        if (definition != null) {


        public void setUpdatable(boolean updatable) { this.updatable = updatable; }
    @Override
        }
        public boolean isLoaded() { return loaded; }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        super(catalog);


    }
import java.util.regex.Pattern;
 */
                            }

    }
import org.jkiss.dbeaver.model.sql.format.SQLFormatUtils;
        return super.getName();
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
                    }
                    if (dbResult.next()) {
        if (definition == null && !isPersisted()) {
    }

                        additionalInfo.setUpdatable("YES".equals(JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_IS_UPDATABLE)));
        CASCADE("CASCADED"),
        CheckOption(String definitionName)
                        }
import org.jkiss.utils.CommonUtils;
            additionalInfo.loaded = true;
import org.jkiss.dbeaver.model.meta.Property;
            return definitionName;
        public void setDefinition(String definition) { this.definition = definition; }
    {
            } catch (SQLException e) {

                            if (divPos != -1) {
