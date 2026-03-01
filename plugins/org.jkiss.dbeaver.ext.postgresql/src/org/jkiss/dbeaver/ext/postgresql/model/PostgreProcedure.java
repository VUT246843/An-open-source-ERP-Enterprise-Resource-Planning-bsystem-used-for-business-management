
                            aggregateBody.append(delim).append("MSFUNC = ").append(mtransfn);
                    //String paramName = "$" + (i + 1);
                    PostgreProcedureParameter param = new PostgreProcedureParameter(
                    String paramName = argNames == null || argNames.length < inArgTypes.length ? "$" + (i + 1) : argNames[i];
    protected PostgreDataType varArrayType;
        String functionSignature = makeOverloadedName(getSchema(), getName(), params, true, true, true);

                            aggregateBody.append(delim).append("MINVFUNC = ").append(minvtransfn);
        // In general, 'in' arguments may contain only the type without the keyword because it's implied.
                String paramName = argNames == null || argNames.length < allArgTypes.length ? "$" + (i + 1) : argNames[i];
    }
    public List<PostgreDependency> getDependencies(DBRProgressMonitor monitor) throws DBCException {
                    }
    protected boolean leakproof;
                    parameter.add(paramName);
        this.returnsSet = JDBCUtils.safeGetBoolean(dbResult, "proretset");
        this.returnType = returnType;
    @Override
        return container;
        }
        }
            procDDL += body;
            try (JDBCPreparedStatement dbStat = session.prepareStatement(query)) {

                } else {

                }
    protected ProcedureVolatile procVolatile;
                        break;
        return ownerId;
            final PostgreSchema typeContainer = dataType.getParentObject();
                return DBSProcedureType.PROCEDURE;
        }
            this.procTransform = JDBCUtils.safeGetString(dbResult, "protransform");
        return overloadedName;
    @Property(category = CAT_PROPS, viewable = false, order = 13)
        s("SHAREABLE"),
            if (!ArrayUtils.isEmpty(inArgTypes)) {
 * PostgreProcedure
                    }
    }
                try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read procedure body")) {
        private final String keyword;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public String getProcTransform() {
                } else {
        return DBUtils.getQuotedIdentifier(getContainer()) + "." +
                            if (finalmodify != null) {

        return returnType;
                    dataType,
                    Long paramType = inArgTypes[i];
        ProcedureVolatile(String createClause) {
            }
        if (language != null) {
        String delimiter = "$$";// + getProcedureType().name().toLowerCase(Locale.ENGLISH) + "$";
                //String paramName = argNames == null || argNames.length < inArg
                                aggregateBody.append(delim).append("MFINALFUNC_EXTRA");
        if (dataSource.isServerVersionAtLeast(8, 4) && !dataSource.isServerVersionAtLeast(11, 0)) {
        if (this.isPersisted() && !omitHeader) {
                        aggregateBody.append("\n)");

            decl.append("\tLANGUAGE ").append(language).append(lineSeparator);
        if (isSecurityDefiner()) {
        switch (kind) {
    private static final Log log = Log.getLog(PostgreProcedure.class);
    protected float estRows;
            }
                            // Whether aggfinalfn modifies the transition state value:
                        String minvtransfn = JDBCUtils.safeGetString(dbResult, "aggminvtransfn");

 * limitations under the License.
        return name + "_" + getObjectId();
    @Override
    }
    protected long languageId;
    }

        v(DBSProcedureParameterKind.RESULTSET, "variadic"),
                        PostgreProcedureParameter tp = tableParams.get(i);
                    params.get(i).setDefaultValue(defaultValue);

    }
                    decl.append(")");
    }
                    paramName,
                    }
            decl.append("\tWINDOW").append(lineSeparator);
                } catch (SQLException e) {
                    params.add(param);
        final StringJoiner signature = new StringJoiner(", ", "(", ")");
                            }
    public DBSTypedObject getReturnType(@NotNull DBRProgressMonitor monitor) throws DBException {
                } catch (DBCException e) {
import java.sql.ResultSet;
        this.languageId = language.getObjectId();
        public DBSProcedureParameterKind getParameterKind() {
            procDDL += omitHeader ? procSrc : generateFunctionDeclaration(getLanguage(monitor), returnTypeName, procSrc);
        ArgumentMode(@NotNull DBSProcedureParameterKind parameterKind, @Nullable String keyword) {
                        log.warn("Parameter data type [" + paramType + "] not found");
        this.isStrict = JDBCUtils.safeGetBoolean(dbResult, "proisstrict");
            .allMatch(x -> x.getArgumentMode() == ArgumentMode.i);
    protected String body;
            final long retTypeId = JDBCUtils.safeGetLong(dbResult, "prorettype");
        return super.getDescription();
                List<DBEPersistAction> actions = new ArrayList<>();
                            if (CommonUtils.isNotEmpty(mtranstype) && !notResult.equals(mtranstype)) {
        return isAggregate;
    @Override
        } else {
        return execCost;
        }
        if (isWindow()) {
    public void setReturnType(PostgreDataType returnType) {
import org.jkiss.dbeaver.utils.GeneralUtils;
        // Examples of such arguments are: 'in', 'out', 'inout' and 'variadic'.
    @NotNull
    @Property(category = CAT_FLAGS, viewable = true, order = 100)
    }
        }
                            aggregateBody.append(delim).append("DESERIALFUNC = ").append(deserialfn);
    public float getExecCost() {
 * Licensed under the Apache License, Version 2.0 (the "License");
                (getDataSource().isServerVersionAtLeast(9, 4) ? "aggmtransfn, aggminvtransfn,\n" +
                returnType = container.getDatabase().getDataType(monitor, retTypeId);
                    if (defaultValue != null) defaultValue = defaultValue.trim();
        private final String keyword;
                    // Old PG versions. Skip this specific case, because it is not name, but param order number
    @Property(category = DBConstants.CAT_STATISTICS, viewable = false, order = 31)
import org.jkiss.dbeaver.DBException;
        u(DBSProcedureParameterKind.UNKNOWN, null);
    }
                        Double.parseDouble(paramValue);
    }
import org.jkiss.dbeaver.model.exec.DBCException;
            case a:
                }
        Number[] allArgTypes = PostgreUtils.safeGetNumberArray(dbResult, "proallargtypes");
    public List<PostgreProcedureParameter> getInputParameters() {
        }
                        // Inverse transition function for moving-aggregate mode
    public String getOverloadedName() {
        body = sourceText;
            if (!CommonUtils.isEmpty(argDefaultsString)) {
        super.setName(name);


                ArgumentMode mode = ArgumentMode.i;
    @Association
                parameter.add(dataType.getName());
                        }
    }
    protected boolean isWindow;
                    decl.append("TABLE (");
    {
                                aggregateBody.append(delim).append("MSTYPE = ").append(mtranstype);
                    if (paramsAssigned >= argDefaults.length) {
        return body;
                    if (parameterKind == DBSProcedureParameterKind.OUT || parameterKind == DBSProcedureParameterKind.TABLE || parameterKind == DBSProcedureParameterKind.RETURN) {
                    i + 1

                }
 *
        return PostgreUtils.getObjectById(monitor, container.getDatabase().languageCache, container.getDatabase(), languageId);
        }
        if (dataSource.isServerVersionAtLeast(8, 3)) {
                    log.debug("Error parsing function parameters defaults", e);
    protected float execCost;
    @Nullable
            if (showParamNames) {
                    }
                        boolean mfinalextra = JDBCUtils.safeGetBoolean(dbResult, "aggmfinalextra"); // arguments to aggmfinalfn
        String[] argNames = PostgreUtils.safeGetStringArray(dbResult, "proargnames");

            } else {
    }

    protected PostgreDataType returnType;
        }
    enum TransitionModifies {
    }
    @Override
                "CASE aggsortop WHEN 0 THEN NULL ELSE oprname END,\n" +
    public String getSpecificName() {
                }
        this.procSrc = JDBCUtils.safeGetString(dbResult, "prosrc");
    }
    }
    private void loadInfo(DBRProgressMonitor monitor, ResultSet dbResult) {
                decl.append(returnTypeName);
    @Property(category = CAT_FLAGS, viewable = true, order = 103)
    public boolean isWindow() {
        loadInfo(monitor, dbResult);
    ) {
                    } else {

            }
        }
                } else if (oid == 0) {
            .filter(x -> x.getArgumentMode().getKeyword() != null)

    protected PostgreProcedureKind kind;
        if (dataSource.isServerVersionAtLeast(8, 3)) {

    }
            if (!allIn) {
    protected long ownerId;
            String proKind = JDBCUtils.safeGetString(dbResult, "prokind");

    public enum ProcedureVolatile {
        public String getKeyword() {
        if (dataSource.isServerVersionAtLeast(9, 2) && !dataSource.isServerVersionAtLeast(12, 0)) {
                        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read procedure body")) {

                            body = JDBCUtils.queryString(session, "SELECT pg_get_functiondef(" + getObjectId() + ")");
                for (int i = params.size() - 1; i >= 0; i--) {

                if (divPos != -1) {
                ));
    public PostgreProcedure(PostgreSchema schema) {
    @Override
                        if (CommonUtils.isNotEmpty(mfinalfn) && !notResult.equals(mfinalfn)) {

    public long getObjectId() {
                        String mtransfn = JDBCUtils.safeGetString(dbResult, "aggmtransfn");
                    procSrc = JDBCUtils.queryString(session, "SELECT prosrc FROM pg_proc where oid = ?", getObjectId());
            this.leakproof = JDBCUtils.safeGetBoolean(dbResult, "proleakproof");

    }
        return procVolatile;
                            aggregateBody.append(delim).append("SERIALFUNC = ").append(serialfn);
                            }


 * distributed under the License is distributed on an "AS IS" BASIS,
            decl.append("\t").append(functionBody).append("\n");
                } else {
import org.jkiss.dbeaver.model.struct.DBSObject;
            if (isAggregate) {
                                aggregateBody.append(delim).append("FINALFUNC_EXTRA");
        }
    public long getOwnerId() {
        final List<PostgreProcedureParameter> keywordParams = params.stream()
                if (forDDL && paramName.startsWith("$")) {
            String returnTypeName = returnType == null ? null : returnType.getFullTypeName();
    public String generateChangeOwnerQuery(@NotNull String owner, @NotNull Map<String, Object> options) {

    public boolean supportsObjectDefinitionOption(@NotNull String option) {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
            }
                    argDefaults = PostgreValueParser.parseSingleObject(argDefaultsString);
        return params;

        return kind.getName().toUpperCase(Locale.ENGLISH);
                }
                            aggregateBody.append(delim).append("FINALFUNC = ").append(aggfinalfn);
    public ProcedureVolatile getProcVolatile() {
    }
        }

            default:

        return isWindow;
    {
    public void setObjectDefinitionText(String sourceText)
    }
                params.add(new PostgreProcedureParameter(
                            if (mfinalmodify != null) {
                    try {
                    kind = PostgreProcedureKind.f;
    protected long oid;
            makeOverloadedName(getSchema(), getName(), params, true, false, false);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        }
        }
    }
                    try {
            }
            || DBPScriptObject.OPTION_CAST_PARAMS.equals(option);

        }
    {

        try {
        // In our case, they all have associated keywords, so we could abuse it.
            decl.append("\tRETURNS ");
        }

                    String defaultValue = argDefaults[argDefaults.length - 1 - paramsAssigned];
                        }
                }
    public String getBody()
    }
            final PostgreDataType dataType = param.getParameterType();
import org.jkiss.dbeaver.ext.postgresql.PostgreValueParser;
 *
                List<PostgreProcedureParameter> tableParams = getParameters(DBSProcedureParameterKind.TABLE);
    public String getFullQualifiedSignature() {
        return overloadedName == null ? name : overloadedName;
                try {
        return procTransform;
    }
            }
        @Nullable
        return returnsSet;
            this.estRows = JDBCUtils.safeGetFloat(dbResult, "prorows");
                kind = PostgreProcedureKind.a;
    @Override
                    } catch (IllegalArgumentException e) {
        if (estRows > 0 && estRows != DEFAULT_EST_ROWS) {
        this.overloadedName = makeOverloadedName(getSchema(), getName(), params, false, false, false);
        for (PostgreProcedureParameter param : params) {
                        if (CommonUtils.isNotEmpty(minvtransfn) && !notResult.equals(minvtransfn)) {

            .append(functionSignature).append(lineSeparator);
    @Override
        private final String createClause;


                int divPos = configLine.indexOf('=');
                    // No OID so let's use old (bad) way
        i(DBSProcedureParameterKind.IN, "in"),
        // It's a shorthand for procedures that accept a set of arguments and return nothing, making its
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
                        }
import org.jkiss.dbeaver.model.sql.SQLUtils;
                try {
                        continue;
                                JDBCUtils.safeGetString(dbResult, "aggfinalmodify"));
import org.jkiss.code.Nullable;
    }
    }
            return parameterKind;

                            .append("STYPE = ").append(aggtranstype);
        // signature slightly shorter. On the other hand, if procedure has mixed set of argument types,
        if (dataSource.getServerType().supportsStoredProcedures()) {
import org.jkiss.utils.CommonUtils;
        }
    @Property(category = CAT_PROPS, viewable = true, order = 12)
                    for (int i = 0; i < tableParams.size(); i++) {
    public PostgreSchema getSchema() {

 * Unless required by applicable law or agreed to in writing, software
        final String selfName = (quote ? DBUtils.getQuotedIdentifier(schema.getDataSource(), name) : name);
                "format_type(aggtranstype, NULL) as aggtranstype,\n" +
        PostgreSchema schema,
    @Override

import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import java.sql.SQLException;
    protected Object acl;
            if (body == null) {
    public DBSProcedureType getProcedureType()
        }
                        log.debug(e);
            log.debug("Error reading aggregate function body", e);

}
        return DBPScriptObject.OPTION_INCLUDE_COMMENTS.equals(option) 
        return decl.toString();
                varArrayType = container.getDatabase().getDataType(monitor, varTypeId);
                            if (!Pattern.matches("[0-9]+", initval)) {

    }
        b(DBSProcedureParameterKind.INOUT, "inout"),
    }
    }
        }
                }

    @Property(order = 5)
    @Property(viewable = true, editable = true, updatable = true, length = PropertyLength.MULTILINE, order = 200)
                        String fullName = JDBCUtils.safeGetString(dbResult, "identity");
                            }
                "aggtransfn::regproc,\n" +
                    PostgreDataType returnType = getReturnType();
                        String mtranstype = JDBCUtils.safeGetString(dbResult, "aggmtranstype");
    protected String[] config;
        return procDDL;
    }
                PostgreUtils.getObjectGrantPermissionActions(monitor, this, actions, options);
                        final String notResult = "-";
        if (getProcedureType() == DBSProcedureType.FUNCTION && procVolatile != null) {
        return varArrayType;
                }
        return result;
                    // Slip then. This column only persist in special cases
        return PostgreUtils.extractPermissionsFromACL(monitor, this, acl, false);
                        String aggtranstype = JDBCUtils.safeGetString(dbResult, "aggtranstype");
        if (isStrict) {
    }



                    mode,
                    decl.append("\tSET ").append(paramName).append(" = ").append(isNumeric ? paramValue : "'" + paramValue + "'").append(lineSeparator);
                        boolean finalextra = JDBCUtils.safeGetBoolean(dbResult, "aggfinalextra"); // arguments to aggfinalfn
                        // Forward transition function for moving-aggregate mode
                        TransitionModifies finalmodify = null;
        for (PostgreProcedureParameter param : keywordParams) {
            }
                        String deserialfn = JDBCUtils.safeGetString(dbResult, "aggdeserialfn");
        this.kind = kind;
/*

        List<PostgreProcedureParameter> result = new ArrayList<>();
    public void setLanguage(PostgreLanguage language) {
        return result;
            this.keyword = keyword;

    public Collection<PostgrePrivilege> getPrivileges(@NotNull DBRProgressMonitor monitor, boolean includeNestedObjects) throws DBException {
            case w:
        decl.append("AS ").append(delimiter).append("\n");
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        } else {

                        String initval = JDBCUtils.safeGetString(dbResult, "agginitval");

    protected boolean isStrict;
    public static final float DEFAULT_EST_ROWS = 1000.0f;
        boolean omitHeader = CommonUtils.getOption(options, OPTION_DEBUGGER_SOURCE);
                // Check for TABLE parameters and construct
    @Property(category = CAT_FLAGS, viewable = true, order = 104)
                for (int i = 0; i < inArgTypes.length; i++) {
    }

        return kind;
    @Nullable
    @Property(category = CAT_FLAGS, viewable = true, order = 105)
    public String getDescription()
        return isSecurityDefiner;
                        String aggfinalfn = JDBCUtils.safeGetString(dbResult, "aggfinalfn"); // Final function
                "WHERE aggfnoid = ?::regproc";
                if (isProcedure) {

                        decl.append(tp.getName()).append(" ").append(tp.getTypeName());
        v("VOLATILE");
                    String paramValue = configLine.substring(divPos + 1);
            if (procSrc == null) {
            decl.append("\tROWS ").append(CommonUtils.niceFormatFloat(estRows)).append(lineSeparator);
    }
        }
        }
            log.debug(e);
                    DBSProcedureParameterKind parameterKind = params.get(i).getParameterKind();
    public boolean isStrict() {
                            .append("\tSFUNC = ").append(aggtransfn).append(delim)
            .append(DBUtils.getQuotedIdentifier(getContainer())).append(".")

                        if (CommonUtils.isNotEmpty(mtransfn) && !notResult.equals(mtransfn)) {

            "" :
                return DBSProcedureType.FUNCTION;
        }
    @NotNull

    @NotNull
                parameter.add(dataType.getFullyQualifiedName(DBPEvaluationContext.DDL));
    public List<PostgreProcedureParameter> getParameters(@NotNull DBRProgressMonitor monitor) {

                        }
    @Property(category = CAT_PROPS, viewable = false, order = 14)
import org.jkiss.dbeaver.model.meta.PropertyLength;
        if (!dataSource.isServerVersionAtLeast(11, 0)) {
                        } catch (SQLException e) {
        boolean showParamNames,
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
    @Property(category = CAT_FLAGS, viewable = true, order = 102)
    public static final float DEFAULT_COST = 100.0f;
    @Property(category = DBConstants.CAT_STATISTICS, viewable = false, order = 30)
                        String mfinalfn = JDBCUtils.safeGetString(dbResult, "aggmfinalfn");
        ResultSet dbResult)

            for (int i = 0; i < allArgTypes.length; i++) {
            "-- DROP " + getProcedureTypeName() + " " + getFullQualifiedSignature() + ";\n\n";
                            if (finalextra) {
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureParameterKind;
                if (argModes != null && argModes.length == allArgTypes.length) {
            if (CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_COMMENTS) && !CommonUtils.isEmpty(getDescription())) {
        String procDDL = omitHeader || CommonUtils.getOption(options, OPTION_SKIP_DROPS) ?

        s("STABLE"),
        decl.append("CREATE OR REPLACE ").append(getProcedureTypeName()).append(" ")
    protected String procTransform;
    public PostgreProcedure(
    public float getEstRows() {

                        if (CommonUtils.isNotEmpty(aggfinalfn)) {
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
                int paramsAssigned = 0;
            }
        super(schema, false);
                    log.warn("Parameter data type [" + paramType + "] not found");
    public PostgreDatabase getDatabase() {
            this);
    }
    }
    }
            procDDL += ";\n";
            return keyword;
        t(DBSProcedureParameterKind.TABLE, null),
        implements PostgreObject, PostgreScriptObject, PostgrePrivilegeOwner, DBPUniqueObject, DBPOverloadedObject, DBPNamedObject2, DBPRefreshableObject, DBPScriptObjectExt2 {
                            // r if it is read-only, s if the aggtransfn cannot be applied after the aggfinalfn,
 */
            this.procVolatile = provolatile == null ? null : ProcedureVolatile.valueOf(provolatile);
                           SQLUtils.quoteString(this, getDescription()) + ";\n";

    @Override
        TransitionModifies(String keyword) {
                }

            }
                "CASE aggfinalfn WHEN '-'::regproc THEN NULL ELSE aggfinalfn::text END,\n" +
    {
    {
    }
import org.jkiss.dbeaver.model.impl.struct.AbstractProcedure;
    }
    @Override
    @Nullable
    }
        return isStrict;
                    paramsAssigned++;
                    this,
                    } catch (NumberFormatException e) {
        return this.returnType;
                            aggregateBody.append(delim).append("SORTOP = ").append(oprname);
    }


                            aggregateBody.append(delim).append("MFINALFUNC = ").append(mfinalfn);
        if (isPersisted() && (!getDataSource().getServerType().supportsFunctionDefRead() || omitHeader) && !isAggregate) {
            }
    public void setName(@NotNull String name) {
            if (CommonUtils.getOption(options, DBPScriptObject.OPTION_INCLUDE_PERMISSIONS)) {
import org.jkiss.dbeaver.model.*;
    }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read aggregate function body")) {
                        }
                        continue;
                if (!tableParams.isEmpty()) {
        if (execCost > 0 && execCost != DEFAULT_COST) {
                "LEFT JOIN pg_operator ON pg_operator.oid = aggsortop\n" +
                kind = PostgreProcedureKind.w;
                dbStat.setString(1, getFullyQualifiedName(DBPEvaluationContext.DDL));
        } catch (SQLException e) {
            for (String configLine : config) {
                        isNumeric = false;
        return PostgreDependency.readDependencies(monitor, this, true);
                        body = aggregateBody.toString();
            this.execCost = JDBCUtils.safeGetFloat(dbResult, "procost");
                        mode = ArgumentMode.valueOf(argModes[i]);
    protected static final String CAT_FLAGS = "Flags";
                    //String paramName = argNames == null || argNames.length < inArg
    protected String procSrc;
            .collect(Collectors.toList());
                final PostgreDataType dataType = container.getDatabase().getDataType(monitor, paramType);
                            if (mfinalextra) {
                    continue;
    }
            decl.append("\t").append(procVolatile.getCreateClause()).append(lineSeparator);
        if (!getDataSource().getServerType().supportsRoles()) {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

                                initval = "'" + initval + "'";
        // Function signature may only contain a limited set of arguments inside parenthesis.
        } catch (Exception e) {
    public String getProcedureTypeName() {
    @Override
                        aggregateBody.append(fullName).append(" (\n")
 */
                result.add(param);
        o(DBSProcedureParameterKind.OUT, "out"),
    }
import org.jkiss.utils.ArrayUtils;
    }
            }
                procDDL += "\n" + SQLUtils.generateScript(getDataSource(), actions.toArray(new DBEPersistAction[0]), false);
        }
    @Property(category = CAT_FLAGS, viewable = true, order = 101)
        this.languageId = JDBCUtils.safeGetLong(dbResult, "prolang");
            String[] argDefaults = null;
            if (kind == PostgreProcedureKind.a) {
                        if (getDataSource().isServerVersionAtLeast(11, 0)) {
                        }
 *
    @Override
                        // The initial value of the transition state
                    decl.append("SETOF ").append(returnTypeName);


        if (!CommonUtils.isEmpty(functionBody)) {
        public String getCreateClause() {
            this.keyword = keyword;
        }
        try {
                String paramName = param.getName();
import org.jkiss.dbeaver.model.meta.Association;
    @Override
            }
import java.util.*;
            log.error("Error parsing parameters defaults", e);
                boolean isProcedure = false;
    public PostgreDataType getReturnType() {
        return oid;
                        StringBuilder aggregateBody = new StringBuilder("CREATE OR REPLACE AGGREGATE ");
        super(schema, true);
        @NotNull List<PostgreProcedureParameter> params,
                (getDataSource().isServerVersionAtLeast(11, 0) ? ",aggfinalmodify, aggmfinalmodify " : "") +
                            // or w if it writes on the value
    protected boolean isAggregate;

        r("READ_ONLY"),
            }

        if (dataSource.isServerVersionAtLeast(9, 2)) {


    public PostgreRole getOwner(DBRProgressMonitor monitor) throws DBException {

        }
            this.isWindow = JDBCUtils.safeGetBoolean(dbResult, "proiswindow");
/**
                                JDBCUtils.safeGetString(dbResult, "aggmfinalmodify")); // For the aggmfinalfn
    }
    }
import org.jkiss.dbeaver.model.meta.Property;
                        if (i > 0) decl.append(", ");
    @Property(hidden = true, editable = true, updatable = true, order = -1)
        boolean quote,
            decl.append(lineSeparator);
    protected static final String CAT_PROPS = "Properties";
        this.overloadedName = makeOverloadedName(getSchema(), getName(), params, false, false, false);

    }
            case f:
            } else {
            if (param.getParameterKind().isInput()) {
    @Override
            if (varTypeId != 0) {
 * you may not use this file except in compliance with the License.
                "format_type(aggmtranstype, NULL) as aggmtranstype\n" : "") +
    @Property(category = CAT_PROPS, viewable = true, order = 11)
    }
                    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        setName(JDBCUtils.safeGetString(dbResult, "proname"));
            decl.append("\tCOST ").append(CommonUtils.niceFormatFloat(execCost)).append(lineSeparator);
                            aggregateBody.append(delim).append("INITCOND = ").append(initval);
            long[] inArgTypes = PostgreUtils.getIdVector(JDBCUtils.safeGetObject(dbResult, "proargtypes"), dataSource);

                        if (CommonUtils.isNotEmpty(initval)) {
        i("IMMUTABLE"),
    protected String overloadedName;
        }
                            mfinalmodify = TransitionModifies.valueOf(
            this.config = PostgreUtils.safeGetStringArray(dbResult, "proconfig");
    public PostgreLanguage getLanguage(DBRProgressMonitor monitor) throws DBException {
                            }
        }
            }
                    isProcedure = dbResult.getBoolean("prosp");
    public String getUniqueName() {
            if (param.getParameterKind() == kind) {
        }

            decl.append("\tSECURITY DEFINER").append(lineSeparator);
    public boolean isReturnsSet() {
        return DBUtils.getFullQualifiedName(getDataSource(),
        }
                parameter.add("DEFAULT").add(paramDefaultValue);
            if (retTypeId != 0) {

    public PostgreDataType getVarArrayType() {
                result.add(param);
                procDDL += "\nCOMMENT ON " + getProcedureTypeName() + " " + getFullQualifiedSignature() + " IS " +
                            finalmodify = TransitionModifies.valueOf(
    public String toString() {
                    boolean isNumeric = true;
                }

import java.util.regex.Pattern;
        @NotNull String name,
            }
                            }
        }
                        }
            String argDefaultsString = JDBCUtils.safeGetString(dbResult, "arg_defaults");
            if (forDDL && CommonUtils.isNotEmpty(paramDefaultValue)) {
        this.ownerId = JDBCUtils.safeGetLong(dbResult, "proowner");
        decl.append(delimiter).append(lineSeparator);
        StringBuilder decl = new StringBuilder();
            kind = CommonUtils.valueOf(PostgreProcedureKind.class, proKind, PostgreProcedureKind.f);
import java.util.stream.Collectors;

import org.jkiss.dbeaver.model.edit.DBEPersistAction;

    public PostgreProcedureKind getKind() {
                    String returnTypeName = returnType == null ? null : returnType.getFullTypeName();
    @Override
            this.createClause = createClause;
        boolean forDDL
                            }
                        }
            } else if (isWindow) {
            return null;
        return overloadedName;
                    if (isAggregate) {
        }
                    if (dataType == null) {
            }
        String lineSeparator = GeneralUtils.getDefaultLineSeparator();
                        if (CommonUtils.isNotEmpty(oprname)) {
                    }
        if (dataSource.isServerVersionAtLeast(8, 4)) {
    {

                        this, paramName, dataType, ArgumentMode.i, i + 1);
    public enum ArgumentMode {
                final long paramType = allArgTypes[i].longValue();
            this.isAggregate = JDBCUtils.safeGetBoolean(dbResult, "proisagg");
                        }
                        configureAggregateQuery(monitor);
        DBRProgressMonitor monitor,
                        if (CommonUtils.isNotEmpty(deserialfn) && !notResult.equals(deserialfn)) {
        this.description = JDBCUtils.safeGetString(dbResult, "description");
            decl.append("\tSTRICT").append(lineSeparator);
            String provolatile = JDBCUtils.safeGetString(dbResult, "provolatile");
        this.acl = JDBCUtils.safeGetObject(dbResult, "proacl");
        return container.getDatabase();
            body = "-- Aggregate function " + getFullQualifiedSignature() + "\n-- " + e.getMessage();


    protected boolean returnsSet;
        {
        return selfName + signature;
                if (!isPersisted()) {

                if (dataType == null) {
        }
                    throw new DBException("Error reading procedure body", e);
            getContainer(),
    @Property(hidden = true, editable = true, updatable = true, order = -1)
            }


package org.jkiss.dbeaver.ext.postgresql.model;
            || DBPScriptObject.OPTION_INCLUDE_PERMISSIONS.equals(option) 
    public boolean isLeakproof() {
                    body = generateFunctionDeclaration(getLanguage(monitor), returnTypeName, "\n\t-- Enter function body here\n");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                    final PostgreDataType dataType = container.getDatabase().getDataType(monitor, paramType.intValue());
            signature.add(parameter.toString());
            }
    @Override

        for (PostgreProcedureParameter param : params) {
            if (typeContainer.isPublicSchema() || typeContainer.isCatalogSchema()) {

                            throw new DBException("Error reading procedure body", e);
                        String serialfn = JDBCUtils.safeGetString(dbResult, "aggserialfn");
                } catch (SQLException e) {
    @Property(category = CAT_FLAGS, viewable = true, order = 106)
                    }

 * See the License for the specific language governing permissions and
            final StringJoiner parameter = new StringJoiner(" ");
    public void setKind(PostgreProcedureKind kind) {
    protected List<PostgreProcedureParameter> params = new ArrayList<>();
                }
            String paramDefaultValue = param.getDefaultValue();
                    String paramName = configLine.substring(0, divPos);
    protected boolean isSecurityDefiner;
            } else {
        this.isSecurityDefiner = JDBCUtils.safeGetBoolean(dbResult, "prosecdef");
                }

import org.jkiss.dbeaver.Log;

                        }
            }
        }
    protected int[] transformTypes;

        PostgreDataSource dataSource = getDataSource();
                parameter.add(param.getArgumentMode().getKeyword());
        }
                        TransitionModifies mfinalmodify = null;
                        String aggtransfn = JDBCUtils.safeGetString(dbResult, "aggtransfn"); // Transition function
                } else {
        final boolean allIn = keywordParams.stream()
 * You may obtain a copy of the License at
    }
    }

    public boolean isSecurityDefiner() {
        return container.getDatabase().getRoleById(monitor, ownerId);
            String query = "SELECT (pg_identify_object('pg_proc'::regclass, aggfnoid, 0)).identity,\n" +
    }
        private final DBSProcedureParameterKind parameterKind;
            return createClause;
                    if (dbResult.next()) {
                                aggregateBody.append(delim).append("FINALFUNC_MODIFY = ").append(finalmodify.keyword);
        if (!ArrayUtils.isEmpty(config)) {
    public List<PostgreProcedureParameter> getParameters(DBSProcedureParameterKind kind) {
        } else {
            this.parameterKind = parameterKind;
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
                                // Quote non numeric values
                "FROM pg_aggregate\n" +
                    body = this.procSrc;
                        // Data type of the aggregate function's internal transition (state) data
        return leakproof;
    @Property(category = CAT_PROPS, order = 10)
        @NotNull PostgreSchema schema,
                // Assign defaults to last X arguments
    }
                isAggregate = true;
        // we want to always include the keyword to avoid ambiguity.
            String[] argModes = PostgreUtils.safeGetStringArray(dbResult, "proargmodes");


            if (isReturnsSet()) {
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    protected String generateFunctionDeclaration(PostgreLanguage language, String returnTypeName, String functionBody) {
        }
    private void configureAggregateQuery(DBRProgressMonitor monitor) throws DBCException {
    @Override
                                aggregateBody.append(delim).append("MFINALFUNC_MODIFY = ").append(mfinalmodify.keyword);
        this.oid = JDBCUtils.safeGetLong(dbResult, "poid");
        if (!ArrayUtils.isEmpty(allArgTypes)) {
                    }

    public boolean isAggregate() {
                }
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)

                        final String delim = ",\n\t";
                        if (CommonUtils.isNotEmpty(serialfn) && !notResult.equals(serialfn)) {

            if (argDefaults != null && argDefaults.length > 0) {

        return "ALTER " + this.getProcedureTypeName() + " " + this.getFullQualifiedSignature() + " OWNER TO " + owner;
        w("READ_WRITE");
    @NotNull
            final long varTypeId = JDBCUtils.safeGetLong(dbResult, "provariadic");
                        String oprname = JDBCUtils.safeGetString(dbResult, "oprname"); // Associated sort operator
                    kind = PostgreProcedureKind.p;
    }

        return estRows;
                    log.debug("Wrong function configuration parameter [" + configLine + "]");

    @Override

 * DBeaver - Universal Database Manager
    @NotNull
    }
                "aggfinalextra, aggmfinalextra, aggserialfn, aggdeserialfn, aggmfinalfn,\n" +
        return getContainer().getProceduresCache().refreshObject(monitor, getContainer(), this);
public class PostgreProcedure extends AbstractProcedure<PostgreDataSource, PostgreSchema>
    public static String makeOverloadedName(
        if (getProcedureType().hasReturnValue() && !CommonUtils.isEmpty(returnTypeName)) {
        }
            }
        }
            PostgreDataType returnType = getReturnType();
        } catch (IllegalArgumentException e) {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                } else {
        List<PostgreProcedureParameter> result = new ArrayList<>();
        @NotNull
    @Property(viewable = false, order = 3)
                "agginitval, " +
