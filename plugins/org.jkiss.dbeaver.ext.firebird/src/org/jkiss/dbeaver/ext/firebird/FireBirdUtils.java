                        String domainTypeName = JDBCUtils.safeGetStringTrimmed(dbResult, 2);
            // We need to use link on the original column syntax here instead of the real type name and modification
        Collection<? extends GenericTableColumn> columns = view.getAttributes(monitor);
        } catch (Exception e) {
                        continue;
            if (!args.isEmpty()) {
    }
                    addProcedureType(sql, param);
                            String paramName = JDBCUtils.safeGetString(rs, 1);
                }
                    sql.append(")\n");
        return sql.toString();
    private static final Log log = Log.getLog(FireBirdUtils.class);
                    dbStat.setString(1, procedure.getName());
                    if (param.getParameterKind() == DBSProcedureParameterKind.RETURN) {
        }
            log.debug(e);
    }
        List<String> domainParameters = domainNames.get(paramName.trim());
                    }
            } else if (procedure.getDataSource().isServerVersionAtLeast(3, 0)) {
                    .append(".")

			e.printStackTrace();
        boolean isFunction = procedure.getProcedureType() == DBSProcedureType.FUNCTION;
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
                    stmt.setString(1, procedure.getName());
        }
import java.util.*;
            sql.append(SQLConstants.KEYWORD_FUNCTION);
            DatabaseMetaData fbMetaData = session.getOriginal().getMetaData();
                                } else {
                        "AND LEFT(rpp.RDB$FIELD_SOURCE, 4) <> 'RDB$'")) {
                }
                try (JDBCPreparedStatement stmt = session.prepareStatement(
/*


        } catch (SQLException e) {
            StringJoiner paramsJoiner = new StringJoiner(" ");
        return sql.toString();
            }
            }
                        }
            }
        FireBirdTriggerType type = trigger.getType();
    private static String getProcedureSourceWithHeader(DBRProgressMonitor monitor, GenericProcedure procedure, String source) throws DBException {
            }
                                if (CommonUtils.isNotEmpty(defaultValue)) {
        }
        GenericDataSource dataSource = param.getDataSource();
        ) {
    public static String getViewSourceWithHeader(DBRProgressMonitor monitor, GenericTableBase view, String source) throws DBException {
    
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameterKind;
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
            sql.append(type.getDisplayName());
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            for (GenericProcedureParameter param : parameters) {
    {
                paramsJoiner.add(parameter);
 * you may not use this file except in compliance with the License.
                        String columnName = JDBCUtils.safeGetStringTrimmed(dbResult, 1);
    private static Pattern VERSION_PATTERN = Pattern.compile(".+\\-V([0-9]+\\.[0-9]+\\.[0-9]+).+");

    public static String getViewSource(DBRProgressMonitor monitor, GenericTableBase view)
        sql.append("CREATE OR ALTER ");
    public static String getTriggerSourceWithHeader(DBRProgressMonitor monitor, FireBirdTrigger trigger, String source) throws DBException {
        }
        String paramName = DBUtils.getQuotedIdentifier(param);
                            String domainName = JDBCUtils.safeGetString(rs, 2);
                sql.append("RETURNS ");
                for (int i = 0; i < args.size(); i++) {
                                        paramName.trim(),
/**
            Map<String, List<String>> domainNames = new HashMap<>();
            return getProcedureSourceWithHeader(monitor, procedure, source);
        if (!CommonUtils.isEmpty(domainParameters)) {
 */
            sql.append("OR ALTER ");
                        }
 * DBeaver - Universal Database Manager
                sql.append(" ").append(defaultValue);
        }
                return null;
            List<GenericProcedureParameter> args = new ArrayList<>();
 * Unless required by applicable law or agreed to in writing, software
                try (JDBCPreparedStatement dbStat = session.prepareStatement(sql))
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    .append(DBUtils.getQuotedIdentifier(dataSource, par.getFieldName()));
    }
                    GenericProcedureParameter param = results.get(0); // According Firebird documentation, functions return just one data type without parameter name
                if (!first) {
        Collection<GenericProcedureParameter> parameters = procedure.getParameters(monitor);
    }
                        sql.append('\t');
            log.debug(e);
                }
            }
                                    domainNames.put(
        if (matcher.matches()) {
 *
            return getTriggerSourceWithHeader(monitor, trigger, source);
                    try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            try (JDBCPreparedStatement dbStat = session.prepareStatement("SELECT RF.RDB$FIELD_NAME,RF.RDB$FIELD_SOURCE FROM RDB$RELATION_FIELDS RF WHERE RF.RDB$RELATION_NAME=?")) {
                if (CommonUtils.isEmpty(source)) {
            }
                if (isFunction) {
                sql.append(")\n");
        }
                                }
            } else {
                        }
        if (version.getMajor() > 2 || (version.getMajor() == 2 && version.getMinor() >= 5)) {
        sql.append("CREATE TRIGGER ").append(trigger.getName()).append(" ");
                    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
            return new Version(matcher.group(1));
                if (param.getParameterKind() == DBSProcedureParameterKind.OUT || param.getParameterKind() == DBSProcedureParameterKind.RETURN) {
                sql.append("(");
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ext.firebird.model.FireBirdTrigger;
    }
        sql.append(paramName).append(" ");
                    return null;
                return null;
                }
                                    domainNames.put(paramName.trim(), new ArrayList<>(Collections.singletonList((domainName.trim()))));
                String sql = "SELECT RDB$FUNCTION_SOURCE FROM RDB$FUNCTIONS WHERE RDB$FUNCTION_NAME =?";


        if (isFunction) {
                                        new ArrayList<>(Arrays.asList((domainName.trim()), defaultValue.trim())));
 * limitations under the License.
import org.jkiss.dbeaver.DBException;
                            String defaultValue = JDBCUtils.safeGetString(rs, 3);
            return null;
                        GenericProcedureParameter param = results.get(i);
import java.sql.DatabaseMetaData;

    }
            sql.append("FOR ").append(DBUtils.getQuotedIdentifier(trigger.getTable()));
        }
                } else {
    	String plan = "";
        sql.append("AS\n").append(source);
        } catch (SQLException ex) {
                    sql.append("\n");
                    results.add(param);
                }
                        if (!CommonUtils.isEmpty(columnName) && !CommonUtils.isEmpty(domainTypeName)) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        if (parameters != null && !parameters.isEmpty()) {
                dbStat.setString(1, table.getName());
                        while (rs.next()) {

                DatabaseMetaData fbMetaData = session.getOriginal().getMetaData();
        }
 * See the License for the specific language governing permissions and
import org.jkiss.utils.CommonUtils;
                    GenericProcedureParameter param = args.get(i);
            }
                        "FROM RDB$PROCEDURE_PARAMETERS rpp " +
public class FireBirdUtils {
import org.jkiss.dbeaver.model.sql.SQLConstants;
 * Firebird utils
            }
    }
import org.osgi.framework.Version;
                sql.append(typeModifiers);
import org.jkiss.dbeaver.ext.generic.model.*;
                    sql.append("(\n");
                    .append(DBUtils.getQuotedIdentifier(dataSource, par.getRelationName()))
        if ((param instanceof FireBirdProcedureParameter par) &&
 */
            sql.append(paramsJoiner.toString());

                    if (i > 0) sql.append(", ");
                    for (int i = 0; i < results.size(); i++) {
		}
                } catch (SQLException e) {
    	return plan;
                {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, view, "Load view source code")) {
            String defaultValue = ((FireBirdProcedureParameter) param).getDefaultValue();
        }
 * You may obtain a copy of the License at
        addProcedureType(sql, param);
            sql.append(" NOT NULL");
        String versionInfo = dataSource.getInfo().getDatabaseProductVersion();
        sql.append("CREATE ");
                CommonUtils.isNotEmpty(par.getFieldName()) && CommonUtils.isNotEmpty(par.getRelationName())
            List<GenericProcedureParameter> results = new ArrayList<>();
import org.jkiss.dbeaver.Log;
                            }

                    while (dbResult.next()) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, procedure, "Load procedure source code")) {
                return null;

        Version version = getFireBirdServerVersion(view.getDataSource());
                    sql.append(", ");
 *
                    }

        StringBuilder sql = new StringBuilder();
			plan = (String) statement.getOriginal().getClass().getMethod("getExecutionPlan").invoke(statement.getOriginal());
    }
            throw new DBException("Error reading column domain types for " + table.getName(), ex);
            String source = (String) fbMetaData.getClass().getMethod("getViewSourceCode", String.class).invoke(fbMetaData, view.getName());
        } else {
			// TODO Auto-generated catch block
        sql.append("AS\n").append(source);
    }
            for (GenericTableColumn column : columns) {
        }
    private static void addProcedureType(@NotNull StringBuilder sql, @NotNull GenericProcedureParameter param) {
                        if (dbResult.nextRow()) {
}
            return null;
                    printParam(sql, param, domainNames);
        Matcher matcher = VERSION_PATTERN.matcher(versionInfo);

                }
            }
        sql.append("VIEW ").append(view.getName()).append(" ");
        } catch (SQLException e) {

                }
    public static String getPlan(JDBCPreparedStatement statement) {
        sql.append("\n").append(source);

            throw new DBException("Can't read source code of procedure '" + procedure.getName() + "'", e);
                            source =  JDBCUtils.safeGetString(dbResult, 1);
import java.util.regex.Pattern;
        if (columns != null) {
            String source = (String) fbMetaData.getClass().getMethod("getTriggerSourceCode", String.class).invoke(fbMetaData, trigger.getName());
        throws DBException
                    return dtMap;
            if (!results.isEmpty()) {
                        if (i < results.size() - 1) sql.append(",");
        } else if (trigger.getTable() != null) {
                } else {
        StringBuilder sql = new StringBuilder();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                    }
            if (procedure.getProcedureType() == DBSProcedureType.PROCEDURE) {
                            if (paramName != null && domainName != null) {
            throw new DBException("Can't read source code of trigger '" + trigger.getName() + "'", e);
                        sql.append('\n');
                }
        throws DBException

            DatabaseMetaData fbMetaData = session.getOriginal().getMetaData();
            sql.append(param.getTypeName());
            log.debug(e);
import org.jkiss.dbeaver.model.sql.SQLUtils;

                            dtMap.put(columnName, domainTypeName);
        return sql.toString();
                domainNames = Collections.unmodifiableMap(domainNames);
            throw new DBException("Can't read source code of view '" + view.getName() + "'", e);
                sql.append(DBUtils.getQuotedIdentifier(column));
        } else {
            if (typeModifiers != null) {
                    }
                        "WHERE RDB$PROCEDURE_NAME = ? " +
    private static void printParam(StringBuilder sql, GenericProcedureParameter param, Map<String, List<String>> domainNames) {
        sql.append(" ").append(procedure.getName()).append(" ");
                first = false;
            if (CommonUtils.isEmpty(source)) {
import java.util.regex.Matcher;
                        printParam(sql, param, domainNames);
                    throw new DBException("Unable to load domains used in procedure", e);
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
            for (String parameter : domainParameters) {
import org.jkiss.dbeaver.model.DBPDataSource;
    public static Version getFireBirdServerVersion(DBPDataSource dataSource) {

    {
import org.jkiss.dbeaver.ext.firebird.model.FireBirdTriggerType;
            String source = "";
        } catch (SQLException e) {
    public static String getTriggerSource(DBRProgressMonitor monitor, FireBirdTrigger trigger)

 *     http://www.apache.org/licenses/LICENSE-2.0
            boolean first = true;
            return getViewSourceWithHeader(monitor, view, source);
                    Map<String, String> dtMap = new HashMap<>();
            }
            return null;
        StringBuilder sql = new StringBuilder();
        if (type.isDbEvent()) {
package org.jkiss.dbeaver.ext.firebird;
		try {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, table, "Read column domain type")) {
        throws DBException
				| SecurityException e) {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        } catch (Exception e) {
            sql.append(SQLConstants.KEYWORD_PROCEDURE);
            return;
            }
    {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, trigger, "Load trigger source code")) {
                    try (JDBCResultSet rs = stmt.executeQuery()) {
            }
            String typeModifiers = SQLUtils.getColumnTypeModifiers(dataSource, param, param.getTypeName(), param.getDataKind());
                        "SELECT RDB$PARAMETER_NAME, RDB$FIELD_SOURCE, RDB$DEFAULT_SOURCE " +
            sql.append(" TYPE OF COLUMN ")
    public static String getProcedureSource(DBRProgressMonitor monitor, GenericProcedure procedure)
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {

        if (notNull) {
            sql.append(")\n");

        }
    }
import java.lang.reflect.InvocationTargetException;
import org.jkiss.dbeaver.model.DBUtils;
            if (CommonUtils.isEmpty(source)) {
        }
    public static Map<String, String> readColumnDomainTypes(DBRProgressMonitor monitor, GenericTableBase table) throws DBException {

        boolean notNull = param.isRequired();
            try (JDBCSession session = DBUtils.openUtilSession(monitor, procedure, "Load domains used in procedure")) {
                    args.add(param);
            if (!CommonUtils.isEmpty(defaultValue)) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        } catch (Exception e) {
        if (param instanceof FireBirdProcedureParameter && param.getParameterKind() == DBSProcedureParameterKind.IN) {
            // Read metadata
            sql.append("(");

            sql.append(" ").append(type.getDisplayName());
        return new Version(0, 0, 0);
import org.jkiss.dbeaver.ext.firebird.model.FireBirdProcedureParameter;
import java.sql.SQLException;
import org.jkiss.code.NotNull;
        }
 *

                source = (String) fbMetaData.getClass().getMethod("getProcedureSourceCode", String.class).invoke(fbMetaData, procedure.getName());
