        }
/*
    private StringBuilder mfinalextraJudge(boolean mfinalextra, StringBuilder aggregateBody, String delim) {
import org.jkiss.dbeaver.DBException;
        if (CommonUtils.isNotEmpty(mtranstype) && !notResult.equals(mtranstype)) {
    private void allArgTypesJudge(Number[] allArgTypes, DBRProgressMonitor monitor, String[] argNames, String[] argModes) {
                tableParamsJudge(tableParams, decl, returnTypeName);
    }
            }
        return "ALTER " + this.getProcedureTypeName() + " " + this.getFullQualifiedSignature() + " OWNER TO " + owner;

                log.warn("Parameter data type [" + paramType + "] not found");
                log.debug("Wrong function configuration parameter [" + configLine + "]");
            if (CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_PERMISSIONS)) {
    }
        this.estRows = JDBCUtils.safeGetFloat(dbResult, "prorows");
    
            mfinalextraJudge(mfinalextra, aggregateBody, delim);
 * See the License for the specific language governing permissions and
        return aggregateBody;
    
        execCostJudge(decl, lineSeparator);
        }
        super(schema);
    }
            if (param.getParameterKind().isInput()) {
    @Override
        if (isAggregate) {

            aggregateBody.append(delim).append("INITCOND = ").append(newInitval);
        if (!getDataSource().getServerType().supportsRoles()) {
    private StringBuilder minvtransfnJudge(String minvtransfn, String notResult, StringBuilder aggregateBody, String delim) {
            decl.append("\tRETURNS ");
            kind = PostgreProcedureKind.a;
    private StringBuilder windowJudge(StringBuilder decl, String lineSeparator) {
    }
                if (parameterKind == DBSProcedureParameterKind.OUT 
                } catch (NumberFormatException e) {
import org.jkiss.dbeaver.ext.kingbase.KingbaseUtils;
    
            }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
                }
    @Override
                String paramName = param.getName();
                        TransitionModifies finalmodify = null;

        if (varTypeId != 0) {

                params.get(i).setDefaultValue(defaultValue);
            int paramsAssigned = 0;
    private void varArrayType(long varTypeId, DBRProgressMonitor monitor) {
        @NotNull String name,
        }
        }
    public boolean isReturnsSet() {
        } else if (isWindow) {
            kindAJudge();
    private StringBuilder aggfinalfnJudge(String aggfinalfn, StringBuilder aggregateBody, 
        return decl;
                } catch (IllegalArgumentException e) {
            allArgTypesJudge(allArgTypes, monitor, argNames, argModes);
    }
    public boolean isWindow() {
        return aggregateBody;
        return aggregateBody;
        if (CommonUtils.isNotEmpty(aggfinalfn)) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import java.util.stream.Collectors;
                        StringBuilder aggregateBody = new StringBuilder("CREATE OR REPLACE AGGREGATE ");
                List<DBEPersistAction> actions = new ArrayList<>();
    
            }
                kind = PostgreProcedureKind.p;
                    continue;
    
    
            aggregateBody.append(delim).append("FINALFUNC_EXTRA");
        if (CommonUtils.isNotEmpty(serialfn) && !notResult.equals(serialfn)) {
        try {
        this.languageId = JDBCUtils.safeGetLong(dbResult, "prolang");
    
    }
        procedureTypeJudge(decl, lineSeparator);
            }
    
                }

        for (PostgreProcedureParameter param : keywordParams) {
        if (kind == PostgreProcedureKind.a) {
    
            aggregateBody.append(delim).append("MFINALFUNC = ").append(mfinalfn);
    private void inArgTypesJudge(long[] inArgTypes, DBRProgressMonitor monitor, String[] argNames) {
            || DBPScriptObject.OPTION_CAST_PARAMS.equals(option);
            } else if (oid == 0) {

                paramName,

            } else {
            .filter(x -> x.getArgumentMode().getKeyword() != null)
        return newArgDefaults;
        if (CommonUtils.isNotEmpty(mfinalfn) && !notResult.equals(mfinalfn)) {
        return overloadedName;
                "FROM sys_aggregate\n" +
                    mode = ArgumentMode.valueOf(argModes[i]);
            bodyJudge(monitor);
        body = sourceText;

import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    
    public PostgreRole getOwner(DBRProgressMonitor monitor) throws DBException {
                String defaultValue = argDefaults[argDefaults.length - 1 - paramsAssigned];
                }
import java.sql.SQLException;
            .collect(Collectors.toList());
            } else {
    public String getFullQualifiedSignature() {
    
        argTypesJudge(allArgTypes, dbResult, monitor, argNames);
    }
        } else {
        return procTransform;
import org.jkiss.dbeaver.model.meta.PropertyLength;
            kindJudge(dbResult);
    private StringBuilder securityJudge(StringBuilder decl, String lineSeparator) {
        procedureJudge(dataSource, dbResult);
        return kind;
        }
                    this, paramName, dataType, ArgumentMode.i, i + 1);
    public String body = getBody();
    }
            mfinalmodifyJudge(mfinalmodify, aggregateBody, delim);
        }
    }
            kind = PostgreProcedureKind.w;
                                JDBCUtils.safeGetString(dbResult, "aggmfinalmodify")); // For the aggmfinalfn
        this.execCost = JDBCUtils.safeGetFloat(dbResult, "procost");
    }
        final long varTypeId = JDBCUtils.safeGetLong(dbResult, "provariadic");
        return decl.toString();
        if (retTypeId != 0) {
            aggregateBody.append(delim).append("FINALFUNC_MODIFY = ").append(finalmodify.keyword);
        strictJudge(decl, lineSeparator);
            if (CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_COMMENTS) && !CommonUtils.isEmpty(getDescription())) {

            decl.append("\tROWS ").append(CommonUtils.niceFormatFloat(estRows)).append(lineSeparator);
        return kind.getName().toUpperCase(Locale.ENGLISH);
    public void setReturnType(PostgreDataType returnType) {
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
        return newProcDDL;
    private StringBuilder mfinalmodifyJudge(TransitionModifies mfinalmodify, StringBuilder aggregateBody, String delim) {
    }

                ",aggfinalmodify, aggmfinalmodify " +
    
                        final String delim = ",\n\t";

        this.overloadedName = makeOverloadedName(getSchema(), getName(), params, false, false, false);
        Number[] allArgTypes = PostgreUtils.safeGetNumberArray(dbResult, "proallargtypes");
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read aggregate function body")) {
            procDDL += omitHeader ? procSrc : generateFunctionDeclaration(getLanguage(monitor), returnTypeName, procSrc);
    }
            decl.append("\tLANGUAGE ").append(language).append(lineSeparator);
        }
        decl.append(delimiter).append(lineSeparator);
    }
    }
        }
    @Property(viewable = false, order = 3)
    
    @Override
import org.jkiss.dbeaver.model.meta.Association;
 * Unless required by applicable law or agreed to in writing, software
        return body;
            decl.append("\tWINDOW").append(lineSeparator);
                        oprNameJudge(oprname, aggregateBody, delim);
        }
                body = this.procSrc;
                paramsAssigned++;
        if (isPersisted() && (!getDataSource().getServerType().supportsFunctionDefRead() || omitHeader) && !isAggregate) {
            String paramName = argNames == null || argNames.length < allArgTypes.length ? "$" + (i + 1) : argNames[i];
        returnTypeJudge(retTypeId, monitor);
                // Check for TABLE parameters and construct
        }
            final long paramType = allArgTypes[i].longValue();
                "CASE aggsortop WHEN 0 THEN NULL ELSE oprname END,\n" +
        windowJudge(decl, lineSeparator);
                "format_type(aggtranstype, NULL) as aggtranstype,\n" +

 * You may obtain a copy of the License at
    
        switch (kind) {
        List<PostgreProcedureParameter> result = new ArrayList<>();
                    log.debug(e);
                    + getFullQualifiedSignature() + " IS " + SQLUtils.quoteString(this, getDescription()) + ";\n";
    
    }
        this.procSrc = JDBCUtils.safeGetString(dbResult, "prosrc");
 * you may not use this file except in compliance with the License.
        for (PostgreProcedureParameter param : params) {
        functionBodyJudge(functionBody, decl);
                String returnTypeName = returnType == null ? null : returnType.getFullTypeName();
        r("READ_ONLY"),
    
        if (estRows > 0 && estRows != DEFAULT_EST_ROWS) {
    @Override
                PostgreUtils.getObjectGrantPermissionActions(monitor, this, actions, options);
                    }
            String argDefaultsString = JDBCUtils.safeGetString(dbResult, "arg_defaults");
        this.isSecurityDefiner = JDBCUtils.safeGetBoolean(dbResult, "prosecdef");
    @Property(category = CAT_FLAGS, viewable = true, order = 105)
import org.jkiss.dbeaver.ext.postgresql.model.*;
        }
    public static String makeOverloadedName(
            }
    public PostgreLanguage getLanguage(DBRProgressMonitor monitor) throws DBException {
    @Override
            }
    public ProcedureVolatile getProcVolatile() {
    private StringBuilder oprNameJudge(String oprname, StringBuilder aggregateBody, String delim) {
    }
        this.procSrc = JDBCUtils.safeGetString(dbResult, "prosrc");
    private String procSrcJudge(DBRProgressMonitor monitor) throws DBException {
        }
    }
        }
        return decl;
    
        setName(JDBCUtils.safeGetString(dbResult, "proname"));
        }
    }
    public String procSrc;
    private StringBuilder execCostJudge(StringBuilder decl, String lineSeparator) {
            if (!allIn) {
        // Function signature may only contain a limited set of arguments inside parenthesis.
                    // Old PG versions. Skip this specific case, because it is not name, but param order number
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    @Override
        if (execCost > 0 && execCost != DEFAULT_COST) {
            case a:
    private StringBuilder serialfnJudge(String serialfn, StringBuilder aggregateBody, String notResult, String delim) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            if (!isPersisted()) {


    @Property(category = CAT_FLAGS, viewable = true, order = 104)
            ));
            }
            if (divPos != -1) {
            if (param.getParameterKind() == kind) {
 */
            }
            for (int i = 0; i < inArgTypes.length; i++) {
                        String mtransfn = JDBCUtils.safeGetString(dbResult, "aggmtransfn");

                        mfinalmodify = TransitionModifies.valueOf(
                procSrc = JDBCUtils.queryString(session, "SELECT prosrc FROM sys_proc where oid = ?", getObjectId());
                "agginitval, " +
        return aggregateBody;
    public float getExecCost() {

        if (!ArrayUtils.isEmpty(inArgTypes)) {
    

        return aggregateBody;
            params.add(new PostgreProcedureParameter(
    private StringBuilder configJudge(StringBuilder decl, String lineSeparator) {
            ArgumentMode mode = ArgumentMode.i;
        return PostgreUtils.getObjectById(monitor, new KingbaseDatabase.LanguageCache(), container.getDatabase(), languageId);
    }
        return ownerId;
        this.ownerId = JDBCUtils.safeGetLong(dbResult, "proowner");
    @Nullable
                if (paramsAssigned >= argDefaults.length) {
    @Override
                try {
        if (!CommonUtils.isEmpty(argDefaultsString)) {
    private StringBuilder returnJudge(String returnTypeName, StringBuilder decl, String lineSeparator) {
    }
    }
        return leakproof;
    @Override
    public PostgreDatabase getDatabase() {
    }
import org.jkiss.dbeaver.model.meta.Property;

   
                Long paramType = inArgTypes[i];
    }
    }
public class KingbaseProcedure extends PostgreProcedure{
        String[] newArgDefaults = argDefaults;
    }
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 200)
        return aggregateBody;
                        // Data type of the aggregate function's internal transition (state) data
            if (i > 0) {
    public String getProcTransform() {
    public List<PostgreProcedureParameter> getParameters(DBSProcedureParameterKind kind) {
    public boolean supportsObjectDefinitionOption(@NotNull String option) {

    @Override
                parameter.add(param.getArgumentMode().getKeyword());
    private void procedureJudge(PostgreDataSource dataSource, ResultSet dbResult) {
    }
        return aggregateBody;
        boolean omitHeader = CommonUtils.getOption(options, OPTION_DEBUGGER_SOURCE);
            case f:
    }
        this.isStrict = JDBCUtils.safeGetBoolean(dbResult, "proisstrict");
    }
            if (showParamNames) {
                kind = PostgreProcedureKind.f;
        }
        }
        @NotNull PostgreSchema schema,
        if (this.isPersisted() && !omitHeader) {
            paramsSetDefaultValue(argDefaults);
    public PostgreProcedureKind kind;
import org.jkiss.code.NotNull;
            aggregateBody.append(delim).append("MSTYPE = ").append(mtranstype);
            configJudge(decl, lineSeparator);
        if (CommonUtils.isNotEmpty(mtransfn) && !notResult.equals(mtransfn)) {
            log.debug(e);
        // we want to always include the keyword to avoid ambiguity.
    }
    public long getPropackageid() {

            decl.append("\tSECURITY DEFINER").append(lineSeparator);

            String provolatile = JDBCUtils.safeGetString(dbResult, "provolatile");
package org.jkiss.dbeaver.ext.kingbase.model;
        if (CommonUtils.isNotEmpty(oprname)) {
        this.returnType = returnType;
        this.kind = kind;

    private String bodyJudge(DBRProgressMonitor monitor) throws DBException {
            returnType = container.getDatabase().getDataType(monitor, retTypeId);
    
                decl.append(", ");
        return oid;
        return super.getDescription();
                        deserialfnJudge(deserialfn, aggregateBody, notResult, delim);
        s("SHAREABLE"),
 *
            aggregateBody.append(delim).append("SERIALFUNC = ").append(serialfn);
                isProcedure = dbResult.getBoolean("prosp");
                        String oprname = JDBCUtils.safeGetString(dbResult, "oprname"); // Associated sort operator
        }
            .append(functionSignature).append(lineSeparator);
            getContainer(),
    private static final Log log = Log.getLog(KingbaseProcedure.class);
        return body;
    private void argTypesJudge(Number[] allArgTypes, ResultSet dbResult, DBRProgressMonitor monitor, String[] argNames) {
                    parameter.add(paramName);
    }
        // In our case, they all have associated keywords, so we could abuse it.
import org.jkiss.dbeaver.ext.postgresql.PostgreValueParser;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(query)) {
    }
        for (int i = 0; i < allArgTypes.length; i++) {
                body = generateFunctionDeclaration(getLanguage(monitor), returnTypeName, "\n\t-- Enter function body here\n");
            long[] inArgTypes = KingbaseUtils.getIdVector(JDBCUtils.safeGetObject(dbResult, "proargtypes"));
                    try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read procedure body")) {
        return aggregateBody;
        this.overloadedName = makeOverloadedName(getSchema(), getName(), params, false, false, false);
    }
    }
    @NotNull
    }
        for (PostgreProcedureParameter param : params) {
        w("READ_WRITE");
    private void kindAJudge() {
                DBSProcedureParameterKind parameterKind = params.get(i).getParameterKind();
    @Override
    public PostgreSchema getSchema() {
    @Property(category = CAT_FLAGS, viewable = true, order = 102)
        } else {
    
            inArgTypesJudge(inArgTypes, monitor, argNames);
 *     http://www.apache.org/licenses/LICENSE-2.0

                        body = JDBCUtils.queryString(session, "SELECT sys_get_functiondef(" + getObjectId() + ")");
        final boolean allIn = keywordParams.stream()
        return decl;
                        aggfinalfnJudge(aggfinalfn, aggregateBody, finalextra, delim, finalmodify);
            }
        } else {
        }
                newProcDDL += "\n" + SQLUtils.generateScript(getDataSource(), actions.toArray(new DBEPersistAction[0]), false);

                        String serialfn = JDBCUtils.safeGetString(dbResult, "aggserialfn");
            }
        boolean quote,
        return selfName + signature;
    public void setName(@NotNull String name) {
                params.add(param);
    }
        StringBuilder decl = new StringBuilder();
                if (dataType == null) {
            PostgreDataType returnType = getReturnType();
                        mtransfnJudge(mtransfn, mtranstype, notResult, aggregateBody, delim);
import java.util.*;
import org.jkiss.utils.ArrayUtils;

    public PostgreDataType getReturnType() {
    @NotNull
    
        return DBPScriptObject.OPTION_INCLUDE_COMMENTS.equals(option) 
    @Property(category = CAT_FLAGS, viewable = true, order = 103)
import org.jkiss.dbeaver.model.struct.DBSObject;
                        String mtranstype = JDBCUtils.safeGetString(dbResult, "aggmtranstype");
    private StringBuilder tableParamsJudge(List<PostgreProcedureParameter> tableParams, StringBuilder decl, String returnTypeName) {
    private void paramsSetDefaultValue(String[] argDefaults) {
 * limitations under the License.
    
        }
        String newInitval = initval;
    public List<PostgreProcedureParameter> getInputParameters() {
        if (!CommonUtils.isEmpty(functionBody)) {
        } catch (Exception e) {

        if (argDefaults != null && argDefaults.length > 0) {
    @Property(category = CAT_PROPS, viewable = false, order = 13)
    }
    }
                newArgDefaults = PostgreValueParser.parseSingleObject(argDefaultsString);
            decl.append("\t").append(procVolatile.getCreateClause()).append(lineSeparator);
        }
    }
    private StringBuilder functionBodyJudge(String functionBody, StringBuilder decl) {
    }
            return null;
        }
                log.debug("Error parsing function parameters defaults", e);
        return result;
                    if (dbResult.next()) {
        }
        securityJudge(decl, lineSeparator);

                "LEFT JOIN sys_operator ON sys_operator.oid = aggsortop\n" +
    private void loadInfo(DBRProgressMonitor monitor, ResultSet dbResult) {
                            .append("\tSFUNC = ").append(aggtransfn).append(delim)
    }
        }
        }
    }
    public long getOwnerId() {
    }
        String[] argNames = PostgreUtils.safeGetStringArray(dbResult, "proargnames");
            TransitionModifies mfinalmodify, StringBuilder aggregateBody, String delim) {
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
                "aggfinalextra, aggmfinalextra, aggserialfn, aggdeserialfn, aggmfinalfn,\n" +
                }
    private void configureAggregateQuery(DBRProgressMonitor monitor) throws DBCException {
                        || parameterKind == DBSProcedureParameterKind.RETURN) {
    }
        final long retTypeId = JDBCUtils.safeGetLong(dbResult, "prorettype");
                return DBSProcedureType.FUNCTION;
            PostgreProcedureParameter tp = tableParams.get(i);
    private String omitHeaderJudge(boolean omitHeader, String procDDL, Map<String, Object> options, 
        return decl;
        if (finalextra) {
                decl.append(returnTypeName);
        return procSrc;
    }
                        boolean mfinalextra = JDBCUtils.safeGetBoolean(dbResult, "aggmfinalextra"); // arguments to aggmfinalfn
        return aggregateBody;
                    Double.parseDouble(paramValue);
        final List<PostgreProcedureParameter> keywordParams = params.stream()
    public void setKind(PostgreProcedureKind kind) {
            body = "-- Aggregate function " + getFullQualifiedSignature() + "\n-- " + e.getMessage();
    }

        }
            .allMatch(x -> x.getArgumentMode() == ArgumentMode.i);
    private void returnTypeJudge(long retTypeId, DBRProgressMonitor monitor) {
        List<PostgreProcedureParameter> result = new ArrayList<>();
            final StringJoiner parameter = new StringJoiner(" ");
                        serialfnJudge(serialfn, aggregateBody, notResult, delim);
        if (!ArrayUtils.isEmpty(allArgTypes)) {
            decl.append("\t").append(functionBody).append("\n");
    


    private StringBuilder initvalJudge(String initval, StringBuilder aggregateBody, String delim) {
        }
        returnJudge(returnTypeName, decl, lineSeparator);
            if (!Pattern.matches("[0-9]+", initval)) {
        return DBUtils.getQuotedIdentifier(getContainer()) + "." +
    enum TransitionModifies {

            "-- DROP " + getProcedureTypeName() + " " + getFullQualifiedSignature() + ";\n\n";
        if (language != null) {
 *
            }
        return isStrict;
                i + 1
            }
                parameter.add(dataType.getFullyQualifiedName(DBPEvaluationContext.DDL));
                }
            decl.append("SETOF ").append(returnTypeName);
                .append(isNumeric ? paramValue : "'" + paramValue + "'").append(lineSeparator);

    }

                "format_type(aggmtranstype, NULL) as aggmtranstype\n" +
    }
            || DBPScriptObject.OPTION_INCLUDE_PERMISSIONS.equals(option) 
        private final String keyword;
        return aggregateBody;
        if (dataSource.getServerType().supportsStoredProcedures()) {
                if (isAggregate) {
    @Property(category = CAT_PROPS, viewable = true, order = 12)
                mode,
                    isNumeric = false;
        return returnType;

 * distributed under the License is distributed on an "AS IS" BASIS,
        }

    ) {
    

        return result;
            }
    @NotNull
        return decl;
        // It's a shorthand for procedures that accept a set of arguments and return nothing, making its
            } catch (SQLException e) {
    public boolean isStrict() {
            } else {
        return aggregateBody;
    @Override
            }
    @Property(category = CAT_PROPS, viewable = true, order = 11)
    private StringBuilder mtransfnJudge(String mtransfn, String mtranstype, String notResult, StringBuilder aggregateBody, String delim) {
    public long propackageid;
        return container.getDatabase().getRoleById(monitor, ownerId);
        if (finalmodify != null) {
            }
    }
    @Override
        String procDDL = omitHeader || CommonUtils.getOption(options, OPTION_SKIP_DROPS) ?
    }
        }
    public float getEstRows() {
                        // The initial value of the transition state
        super(schema);
                if (forDDL && paramName.startsWith("$")) {
    public String toString() {
        }
        return aggregateBody;
    public KingbaseProcedure(DBRProgressMonitor monitor, PostgreSchema schema, ResultSet dbResult) {
        }
    public long getObjectId() {
import org.jkiss.dbeaver.model.DBConstants;
    }
        for (int i = 0; i < tableParams.size(); i++) {
    }
            aggregateBody.append(delim).append("MINVFUNC = ").append(minvtransfn);
                String paramName = argNames == null || argNames.length < inArgTypes.length ? "$" + (i + 1) : argNames[i];
        return overloadedName;
    @Override
    }
                        throw new DBException("Error reading procedure body", e);

        if (mfinalextra) {
import java.sql.ResultSet;
            String query = "SELECT (sys_identify_object('sys_proc'::regclass, aggfnoid, 0)).identity,\n" +
        final String selfName = (quote ? DBUtils.getQuotedIdentifier(schema.getDataSource(), name) : name);
        this.isAggregate = JDBCUtils.safeGetBoolean(dbResult, "proisagg");
            signature.add(parameter.toString());
    
            aggregateBody.append(delim).append("MSFUNC = ").append(mtransfn);
                decl.append("\tSET ").append(paramName).append(" = ")
                "CASE aggfinalfn WHEN '-'::regproc THEN NULL ELSE aggfinalfn::text END,\n" +
            this);
        this.acl = JDBCUtils.safeGetObject(dbResult, "proacl");
import org.jkiss.dbeaver.utils.GeneralUtils;
    }
    }

                    break;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
            log.error("Error parsing parameters defaults", e);
        return name + "_" + getObjectId();
    @NotNull
        } catch (SQLException e) {
                this,
                dbStat.setString(1, getFullyQualifiedName(DBPEvaluationContext.DDL));
    
        if (!ArrayUtils.isEmpty(config)) {
            }
                "aggmtransfn, aggminvtransfn,\n" +
    public PostgreProcedureKind getKind() {
                throw new DBException("Error reading procedure body", e);
    @Association
                        initvalJudge(initval, aggregateBody, delim);
            } else {
                        String aggtransfn = JDBCUtils.safeGetString(dbResult, "aggtransfn"); // Transition function
    }
        languageJudge(language, decl, lineSeparator);
    }
            final PostgreSchema typeContainer = dataType.getParentObject();
                parameter.add(dataType.getName());
import org.jkiss.dbeaver.Log;
            decl.append(")");
    
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Property(category = CAT_FLAGS, viewable = true, order = 106)
            // Assign defaults to last X arguments


                        boolean finalextra = JDBCUtils.safeGetBoolean(dbResult, "aggfinalextra"); // arguments to aggfinalfn
                boolean isNumeric = true;
                    } catch (SQLException e) {
    }
        varArrayType(varTypeId, monitor);
        super.setName(name);
    public DBSProcedureType getProcedureType() {
                String paramValue = configLine.substring(divPos + 1);
        }
 * DBeaver - Universal Database Manager
    public boolean isSecurityDefiner() {
            decl.append("\tSTRICT").append(lineSeparator);
    public void setObjectDefinitionText(String sourceText) {
    
import org.jkiss.dbeaver.model.sql.SQLUtils;
                List<PostgreProcedureParameter> tableParams = getParameters(DBSProcedureParameterKind.TABLE);
                        // Forward transition function for moving-aggregate mode
            }
        return container.getDatabase();
                        String deserialfn = JDBCUtils.safeGetString(dbResult, "aggdeserialfn");
    }
            log.debug("Error reading aggregate function body", e);
            String[] argDefaults = null;


        // In general, 'in' arguments may contain only the type without the keyword because it's implied.
    

        return isWindow;
                dataType,
                try {
                "WHERE aggfnoid = ?::regproc";
    }
    
    private String[] argDefaultsJudge(String argDefaultsString, String[] argDefaults) {
    @Property(category = CAT_FLAGS, viewable = true, order = 101)
        }
}
        if (isWindow()) {
                        String aggfinalfn = JDBCUtils.safeGetString(dbResult, "aggfinalfn"); // Final function
            procDDL += body;
                continue;
    }
                "aggtransfn::regproc,\n" +
                        // Inverse transition function for moving-aggregate mode
        this.languageId = language.getObjectId();
    @Property(hidden = true, editable = true, updatable = true, order = -1)
    public boolean isLeakproof() {
        }
            aggregateBody.append(delim).append("MFINALFUNC_EXTRA");
    }
                        final String notResult = "-";
    }
    }
                        String aggtranstype = JDBCUtils.safeGetString(dbResult, "aggtranstype");
            String returnTypeName = returnType == null ? null : returnType.getFullTypeName();
    }
        this.leakproof = JDBCUtils.safeGetBoolean(dbResult, "proleakproof");

                        minvtransfnJudge(minvtransfn, notResult, aggregateBody, delim);
import org.jkiss.code.Nullable;
    }
    
        final StringJoiner signature = new StringJoiner(", ", "(", ")");
                newProcDDL += "\nCOMMENT ON " + getProcedureTypeName() + " " 
        return decl;
    
    @NotNull
                } else {
        this.procTransform = JDBCUtils.safeGetString(dbResult, "protransform");
        return isSecurityDefiner;
                    continue;
    @Property(category = DBConstants.CAT_STATISTICS, viewable = false, order = 31)
    }
            case w:
            makeOverloadedName(getSchema(), getName(), params, true, false, false);
    public String prokind;
        loadInfo(monitor, dbResult);
    @Property(hidden = true, editable = true, updatable = true, order = -1)
    }
                        
            } catch (SQLException e) {
    @Override
        }
            decl.append(lineSeparator);
            DBRProgressMonitor monitor) throws DBException {
                        finalmodify = TransitionModifies.valueOf(
    
        if (getProcedureType() == DBSProcedureType.FUNCTION && procVolatile != null) {

            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read procedure body")) {
                }
        String newProcDDL = procDDL;
        if (isStrict) {
        estRowsJudge(decl, lineSeparator);
            String proKind = JDBCUtils.safeGetString(dbResult, "prokind");
    
    }
        if (CommonUtils.isNotEmpty(deserialfn) && !notResult.equals(deserialfn)) {
            try {
        if (isSecurityDefiner()) {
    }
            aggregateBody.append(delim).append("MFINALFUNC_MODIFY = ").append(mfinalmodify.keyword);
    }
    public Collection<PostgrePrivilege> getPrivileges(@NotNull DBRProgressMonitor monitor, 
        return procDDL;
            if (dataType == null) {
    @Property(category = CAT_PROPS, viewable = false, order = 14)
            if (forDDL && CommonUtils.isNotEmpty(paramDefaultValue)) {

            }
            final PostgreDataType dataType = param.getParameterType();
        } else {
    }
    
                        mfinalfnJudge(mfinalfn, notResult, mfinalextra, mfinalmodify, aggregateBody, delim);
    public List<PostgreDependency> getDependencies(DBRProgressMonitor monitor) throws DBCException {
        }
    public boolean isAggregate() {
        String lineSeparator = GeneralUtils.getDefaultLineSeparator();
        return isAggregate;
                        aggregateBody.append(fullName).append(" (\n")
            decl.append("\tCOST ").append(CommonUtils.niceFormatFloat(execCost)).append(lineSeparator);
    }

        return params;
    @Property(category = CAT_PROPS, order = 10)
        this.returnsSet = JDBCUtils.safeGetBoolean(dbResult, "proretset");
import org.jkiss.dbeaver.model.DBUtils;
        boolean showParamNames,
            tableParamsSizeJudge(tableParams, decl);
    public PostgreDataType getVarArrayType() {
    }
                        String minvtransfn = JDBCUtils.safeGetString(dbResult, "aggminvtransfn");
            int divPos = configLine.indexOf('=');
                final PostgreDataType dataType = container.getDatabase().getDataType(monitor, paramType.intValue());
    }
import org.jkiss.utils.CommonUtils;
        }
        if (getProcedureType().hasReturnValue() && !CommonUtils.isEmpty(returnTypeName)) {
        decl.append("AS ").append(delimiter).append("\n");
    private void kindJudge(ResultSet dbResult) {
            boolean includeNestedObjects) throws DBException {
                        TransitionModifies mfinalmodify = null;
    public String getProcedureTypeName() {
    
                }
        return procVolatile;
    private StringBuilder procedureTypeJudge(StringBuilder decl, String lineSeparator) {
            procSrcJudge(monitor);
    
    private StringBuilder tableParamsSizeJudge(List<PostgreProcedureParameter> tableParams, StringBuilder decl) {
    public void setLanguage(PostgreLanguage language) {
    @Override
        }
    }
                result.add(param);
        }
    private StringBuilder mfinalfnJudge(String mfinalfn, String notResult, boolean mfinalextra, 
        boolean forDDL
        if (CommonUtils.isNotEmpty(minvtransfn) && !notResult.equals(minvtransfn)) {
        // Examples of such arguments are: 'in', 'out', 'inout' and 'variadic'.
        
    private StringBuilder mtranstypeJudge(String mtranstype, String notResult, StringBuilder aggregateBody, String delim) {
            String paramDefaultValue = param.getDefaultValue();
import org.jkiss.dbeaver.model.DBPScriptObject;
            this.keyword = keyword;
    private StringBuilder strictJudge(StringBuilder decl, String lineSeparator) {
        return returnsSet;
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
        }
                    configureAggregateQuery(monitor);
            mtranstypeJudge(mtranstype, notResult, aggregateBody, delim);
                String paramName = configLine.substring(0, divPos);

                        String initval = JDBCUtils.safeGetString(dbResult, "agginitval");
            finalmodifyJudge(aggregateBody, finalmodify, delim);
        return container;
                return DBSProcedureType.PROCEDURE;
                if (defaultValue != null) {
        return overloadedName == null ? name : overloadedName;


        this.isWindow = JDBCUtils.safeGetBoolean(dbResult, "proiswindow");

                            .append("STYPE = ").append(aggtranstype);
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        // signature slightly shorter. On the other hand, if procedure has mixed set of argument types,
            if (argModes != null && argModes.length == allArgTypes.length) {
                // No OID so let's use old (bad) way
        return varArrayType;
            }
                        || parameterKind == DBSProcedureParameterKind.TABLE 

        }
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    @Property(category = CAT_FLAGS, viewable = true, order = 100)
    }
        return DBUtils.getFullQualifiedName(getDataSource(),
        this.oid = JDBCUtils.safeGetLong(dbResult, "poid");
            try {
                result.add(param);
            finalextraJudge(aggregateBody, finalextra, delim);

        this.persisted = true;
        if (mfinalmodify != null) {
                    log.warn("Parameter data type [" + paramType + "] not found");
            if (typeContainer.isPublicSchema() || typeContainer.isCatalogSchema()) {
        return execCost;
                        String mfinalfn = JDBCUtils.safeGetString(dbResult, "aggmfinalfn");
    

        if (body == null) {
    }
        return getContainer().getProceduresCache().refreshObject(monitor, getContainer(), this);
        TransitionModifies(String keyword) {
    }

            for (int i = params.size() - 1; i >= 0; i--) {
            decl.append("TABLE (");
        String delimiter = "$$"; // + getProcedureType().name().toLowerCase(Locale.ENGLISH) + "$";
                        String fullName = JDBCUtils.safeGetString(dbResult, "identity");
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getUniqueName() {


    

                newInitval = "'" + initval + "'";
        }
    
    private StringBuilder estRowsJudge(StringBuilder decl, String lineSeparator) {
        return aggregateBody;
            aggregateBody.append(delim).append("DESERIALFUNC = ").append(deserialfn);
    @Property(order = 5)
 *
            String[] argModes = PostgreUtils.safeGetStringArray(dbResult, "proargmodes");
    @Property(category = DBConstants.CAT_STATISTICS, viewable = false, order = 30)
            newProcDDL += ";\n";
            "" :
            }

        return decl;
            }
        }
                log.debug("Error get procedure.", e);
    public List<PostgreProcedureParameter> getParameters(@NotNull DBRProgressMonitor monitor) {
    public String getDescription() {
                                JDBCUtils.safeGetString(dbResult, "aggfinalmodify"));

    public String getSpecificName() {
    }

            kind = CommonUtils.valueOf(PostgreProcedureKind.class, proKind, PostgreProcedureKind.f);
        this.description = JDBCUtils.safeGetString(dbResult, "description");
        if (CommonUtils.isNotEmpty(initval)) {
                }
    }

    
        decl.append("CREATE OR REPLACE ").append(getProcedureTypeName()).append(" ")
            varArrayType = container.getDatabase().getDataType(monitor, varTypeId);
        }
    
    protected String generateFunctionDeclaration(PostgreLanguage language, String returnTypeName, String functionBody) {
        @NotNull List<PostgreProcedureParameter> params,
            this.procVolatile = provolatile == null ? null : ProcedureVolatile.valueOf(provolatile);
    }
    public String getBody() {
        return decl;
    private StringBuilder finalextraJudge(StringBuilder aggregateBody, boolean finalextra, String delim) {
        }
        return decl;
    
    }
            } catch (DBCException e) {
        } else {
            argDefaults = argDefaultsJudge(argDefaultsString, argDefaults);
            boolean finalextra, String delim, TransitionModifies finalmodify) {
            if (isReturnsSet()) {

            boolean isProcedure = false;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
    private StringBuilder deserialfnJudge(String deserialfn, StringBuilder aggregateBody, String notResult, String delim) {
        return PostgreDependency.readDependencies(monitor, this, true);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                PostgreProcedureParameter param = new PostgreProcedureParameter(
            decl.append(tp.getName()).append(" ").append(tp.getTypeName());
    @Override
        this.config = PostgreUtils.safeGetStringArray(dbResult, "proconfig");
    private StringBuilder languageJudge(PostgreLanguage language, StringBuilder decl, String lineSeparator) {
        }
        this.propackageid = JDBCUtils.safeGetLong(dbResult, "propackageid");
    
        if (!tableParams.isEmpty()) {
    public KingbaseProcedure(PostgreSchema schema) {
        return propackageid;
                parameter.add("DEFAULT").add(paramDefaultValue);
            String delim) {
            .append(DBUtils.getQuotedIdentifier(getContainer())).append(".")

    }
    public String getOverloadedName() {
            final PostgreDataType dataType = container.getDatabase().getDataType(monitor, paramType);
            } else {
                        aggregateBody.append("\n)");
import java.util.regex.Pattern;
                } else {
        }
            aggregateBody.append(delim).append("SORTOP = ").append(oprname);
        } catch (IllegalArgumentException e) {
        String functionSignature = makeOverloadedName(getSchema(), getName(), params, true, true, true);
    public String generateChangeOwnerQuery(@NotNull String owner, @NotNull Map<String, Object> options) {
            isAggregate = true;
        return decl;
        }
    }
            aggregateBody.append(delim).append("FINALFUNC = ").append(aggfinalfn);
        }
            if (isProcedure) {
                // Quote non numeric values
    }
    }
        return decl;
        return estRows;
                PostgreDataType returnType = getReturnType();

    }
    

   
                    defaultValue = defaultValue.trim();
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameterKind;
    @Nullable
        if (procSrc == null) {
                }
    
        procDDL = omitHeaderJudge(omitHeader, procDDL, options, monitor);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return PostgreUtils.extractPermissionsFromACL(monitor, this, acl, false);
        try {
        for (String configLine : config) {
                        body = aggregateBody.toString();
                    }
            default:
        PostgreDataSource dataSource = getDataSource();
        return decl;
    private StringBuilder finalmodifyJudge(StringBuilder aggregateBody, TransitionModifies finalmodify, 
    }
        }
    @Override
