    private void notifyListeners(DBCScriptContextListener.ContextAction contextAction, String paramName, Object paramValue) {
    }



            for (VariableInfo v : varList) {
        this.sourceFile = sourceFile;
            }
        ArrayList<VariableInfo> vCopy;
import org.jkiss.utils.CommonUtils;
        if (command.isEmptyCommand()) {
    @Override
        this(parentContext, contextProvider, sourceFile, new OutputWriterAdapter(new PrintWriter(outputWriter)), parametersProvider);

        DBCExecutionContext executionContext = contextProvider.getExecutionContext();
import org.jkiss.dbeaver.model.impl.OutputWriterAdapter;
import org.jkiss.dbeaver.model.connection.DataSourceVariableResolver;
    }
        if (!unquoted.equals(name)) {
    }
import org.jkiss.dbeaver.model.exec.DBCScriptContextListener;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        synchronized (variables) {
        @Nullable Path sourceFile,

        notifyListeners(op == null ? DBCScriptContextListener.ContextAction.ADD : DBCScriptContextListener.ContextAction.UPDATE, name, value);
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.data.DBDDataReceiver;

            Object value = parentContext.getVariable(name);
            parentContext.setPragma(id, params);
                } else {
                useDefaults
    @Override
        this.pragmas.putAll(context.pragmas);
    private DBCScriptContextListener[] getListenersCopy() {
    public DBCOutputWriter getOutputWriter() {
                    varValue = variables.get(normalizedParamName);
    ) throws DBException {
            return true;

        if (variables.containsKey(getNormalizedVarName(name))) {
        }
            List<VariableInfo> varList;
            );
                dataReceiverSupplier,
        this.data.putAll(context.data);
        return contextVarResolver.get(name);
        return null;
            }
    }
import org.jkiss.dbeaver.model.exec.DBCScriptContext;
    ) {
import org.jkiss.dbeaver.model.DBUtils;
            throw new DBException("Command '" + command.getCommand() + "' not supported");
            } else if (driver != null) {
            parentContext.setVariable(name, value);
            return SQLControlResult.success();
    }
import org.jkiss.dbeaver.model.sql.registry.SQLCommandsRegistry;
            notifyListeners(ov == null ? DBCScriptContextListener.ContextAction.ADD : DBCScriptContextListener.ContextAction.UPDATE, v);

        this.contextProvider = contextProvider;
    @Override
        boolean useDefaults
    private boolean ignoreParameters;
    private final Map<String, VariableInfo> variables = new LinkedHashMap<>();
    }
    public Object getVariable(String name) {
        }
import org.jkiss.dbeaver.model.sql.registry.SQLCommandHandlerDescriptor;
        return contextVarResolver.get(name) != null;
    private final SQLScriptContext parentContext;
import java.io.Writer;
    }
        return sourceFile;
            unquoted = DBUtils.getUnQuotedIdentifier(name, AbstractSQLDialect.DEFAULT_IDENTIFIER_QUOTES);
    @Override
            }
    }
        if (v != null) {
        this.outputWriter = outputWriter;
            }
                ignoreParameters = true;
    }
    public void setParameterDefaultValue(String name, Object value) {
        @NotNull DBRProgressMonitor monitor,
            // Convert unquoted identifiers to uppercase
    }
        params.putAll(defaultParameters);
    public <T> T getData(String key) {
    @Nullable

                if (varValue == null) {
    public boolean hasVariable(String name) {
    private final Map<String, Object> defaultParameters = new HashMap<>();
        if (parentContext != null) {
        }


        @Nullable SQLScriptContext parentContext,
        return true;
            vCopy = new ArrayList<>(this.variables.values());
    public void copyFrom(SQLScriptContext context) {
            pragmas.put(id, params);
    @Override
        SQLCommandHandlerDescriptor commandHandler = SQLCommandsRegistry.getInstance().getCommandHandler(command.getCommandId());


        DBCScriptContextListener[] lc = getListenersCopy();
            unquoted = DBUtils.getUnQuotedIdentifier(contextProvider.getExecutionContext().getDataSource(), name);
    public void removeDefaultParameterValue(String name) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            }
    private void notifyListeners(DBCScriptContextListener.ContextAction contextAction, VariableInfo variableInfo) {
    {
        if (parentContext != null) parentContext.removeDefaultParameterValue(name);
 * DBeaver - Universal Database Manager

    }
        VariableInfo variableInfo = variables.get(getNormalizedVarName(name));
        }
        if (ignoreParameters) {
        @NotNull DBPContextProvider contextProvider,
        for (VariableInfo v : variables.values()) {
    }
    }
    public void removeVariable(String name) {
        }
        Object p = defaultParameters.remove(getNormalizedVarName(name));
    ) {
    public DBCExecutionContext getExecutionContext() {
import org.jkiss.dbeaver.model.connection.DBPDriver;


        }
        DBPDataSourceContainer dataSourceContainer = executionContext == null ? null : executionContext.getDataSource().getContainer();
                varList = new ArrayList<>();
 */
    @Nullable

        if (listeners != null) {
        @NotNull DBCOutputWriter outputWriter,
    @Override
        return outputWriter;

        instance.save();
                return true;

        @NotNull Writer outputWriter,
                }

        return defaultParameters.get(getNormalizedVarName(name));
        return parentContext;
    public Map<String, Map<String, Object>> getPragmas() {
        } else {
        this.ignoreParameters = ignoreParameters;
    @NotNull
        }
            params.put(v.name, v.value);
    // Persistence

            return parentContext.getPragmas();
    public List<VariableInfo> getVariables() {
import java.nio.file.Path;
import org.jkiss.utils.ArrayUtils;
        VariableInfo v = new VariableInfo(name, value, VariableType.VARIABLE);

        }
        if (parentContext != null) {

import org.jkiss.code.NotNull;
    public void setData(String key, Object value) {
                this,

                getNormalizedVarName(ve.getKey()),
    ////////////////////////////////////////////////////
    @Nullable
            parentContext.removeVariable(name);
        }
        @NotNull DBPContextProvider contextProvider,
        }
            parentContext.setVariables(variables);
            variables.clear();
        if (parametersProvider != null) {
        }
    public SQLScriptContext(
    }
                    parameter.setValue(CommonUtils.toString(varValue));
    }
 * limitations under the License.
            }
        notifyListeners(ov == null ? DBCScriptContextListener.ContextAction.ADD : DBCScriptContextListener.ContextAction.UPDATE, v);
        if (parentContext != null) {
        synchronized (this) {
/*
    public void setVariable(String name, Object value) {
        this.variables.clear();
        }
    @Override
package org.jkiss.dbeaver.model.sql;
    }
        } else {

            parentContext.setParameterDefaultValue(name, value);
        return commandHandler.createHandler().handleCommand(monitor, command, this);
    }

    public boolean hasDefaultParameterValue(String name) {
            if (listeners != null) {
                v);
            for (SQLQueryParameter parameter : parameters) {
        pragmas.clear();
    public Path getSourceFile() {
            return true;
 * SQL script execution context

        final SQLQueryParameterRegistry instance = SQLQueryParameterRegistry.getInstance();
    }
            } else {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }

                return Arrays.copyOf(listeners, listeners.length);
    public Map<String, Object> getAllParameters() {

        }
 *
            } else if (!paramsResult) {
 *
import org.jkiss.dbeaver.DBException;
    }
        VariableInfo ov = variables.put(getNormalizedVarName(name), v);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        @Nullable SQLParametersProvider parametersProvider
import org.jkiss.code.Nullable;
        @NotNull Supplier<DBDDataReceiver> dataReceiverSupplier,

    @Override
import org.jkiss.dbeaver.model.DBPContextProvider;
        if (contextProvider.getExecutionContext() != null) {

    @NotNull

    }
        SQLVariablesRegistry.getInstance().updateVariables(driver, dataSource, vCopy);

        Object op = defaultParameters.put(getNormalizedVarName(name), value);

    public void saveVariables(DBPDriver driver, DBPDataSourceContainer dataSource) {
        }
            return variableInfo.value;
    }
 *
    public void setPragma(@NotNull String id, @Nullable Map<String, Object> params) {

    }
        if (parentContext != null) {
    ////////////////////////////////////////////////////
    public boolean fillQueryParameters(
    @Override
            listeners = new DBCScriptContextListener[] { listener };
                    varValue = ((VariableInfo)varValue).value;
import java.util.function.Supplier;
    public synchronized void removeListener(DBCScriptContextListener listener) {
    private final SQLParametersProvider parametersProvider;

        }
        // Bind parameters
        this.parametersProvider = parametersProvider;
        }
    }
        this.data.clear();
    @Nullable

        } else {
        if (lc != null) {

        return params;
            dataSourceContainer == null ? null : dataSourceContainer.getConnectionConfiguration());
        return executionContext == null ?
    private final Path sourceFile;
            if (paramsResult == null) {
            listeners = ArrayUtils.remove(DBCScriptContextListener.class, listeners, listener);
    private final DBCOutputWriter outputWriter;
import java.util.*;

        @Nullable SQLParametersProvider parametersProvider)
        }
                String normalizedParamName = getNormalizedVarName(parameter.getName());
        return new ArrayList<>(variables.values());
    @Override
                variables.put(getNormalizedVarName(v.name), v);
            for (DBCScriptContextListener l : lc) l.variableChanged(contextAction, variableInfo);
                query,

        }
        }
        if (variableInfo != null) {
    public boolean isIgnoreParameters() {
        if (parentContext != null) {
                Object varValue = variables.get(normalizedVarName);
        if (CommonUtils.isEmpty(parameters)) {
                varList = SQLVariablesRegistry.getInstance().getDataSourceVariables(dataSource);
            Boolean paramsResult = parametersProvider.prepareStatementParameters(
        Map<String, Object> params = new LinkedHashMap<>(defaultParameters.size() + variables.size());
    private final IVariableResolver contextVarResolver;
            variables.clear();
        } else {
            notifyListeners(DBCScriptContextListener.ContextAction.DELETE, v);
    }
        }

            dataSourceContainer,
    }
        this.variables.putAll(context.variables);
            for (DBCScriptContextListener l : lc) l.parameterChanged(contextAction, paramName, paramValue);
        } else {
                if (varValue == null) {
    public Object getParameterDefaultValue(String name) {

            return true;
    }
            if (value != null) {


 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.sql.registry.SQLQueryParameterRegistry;

        @Nullable Path sourceFile,
        } else {
public class SQLScriptContext implements DBCScriptContext {
        synchronized (variables) {
        }
            VariableInfo ov = this.variables.put(
    @Override
        if (parentContext != null) {
        synchronized (variables) {
        this.variables.clear();
            return pragmas;
/**
    private String getNormalizedVarName(String name) {
        @Nullable SQLScriptContext parentContext,
                }
                return false;
            return unquoted;
        }
    @NotNull
            return name.toUpperCase();
        @NotNull SQLQuery query,
            }

    }
    public void loadVariables(DBPDriver driver, DBPDataSourceContainer dataSource) {
    }
import org.jkiss.dbeaver.model.exec.output.DBCOutputWriter;
        DBCScriptContextListener[] lc = getListenersCopy();
import org.jkiss.dbeaver.runtime.IVariableResolver;
    }
        String unquoted;
                String normalizedVarName = getNormalizedVarName(parameter.getVarName());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.data.put(key, value);
            if (parentContext.hasVariable(name)) {
            VariableInfo v = new VariableInfo(ve.getKey(), ve.getValue(), VariableType.VARIABLE);
    }
    }
        }
    @NotNull
import java.io.PrintWriter;
        List<SQLQueryParameter> parameters = query.getParameters();
    }

    private final Map<String, Object> data = new HashMap<>();

    @Nullable
    }
            // Resolve parameters (only if it is the first fetch)
        }
    @Nullable
    public SQLScriptContext(
    public void clearStatementContext() {
    public SQLScriptContext getParentContext() {
                }
        this.parentContext = parentContext;
    private final DBPContextProvider contextProvider;
        if (parentContext != null) {
    public void setIgnoreParameters(boolean ignoreParameters) {
        return ignoreParameters;
        return (T)data.get(key);
        }
                if (varValue != null) {
            (parentContext == null ? null : parentContext.getExecutionContext()) : executionContext;

 * See the License for the specific language governing permissions and


                    varValue = defaultParameters.get(normalizedParamName);
                parameters,

        @NotNull SQLControlCommand command
        instance.deleteParameter(name);
        for (Map.Entry<String, Object> ve : variables.entrySet()) {
        if (defaultParameters.containsKey(getNormalizedVarName(name))){
import org.jkiss.dbeaver.model.sql.registry.SQLVariablesRegistry;

    public void setVariables(Map<String, Object> variables) {

            if (dataSource != null) {
        DBCExecutionContext executionContext = contextProvider.getExecutionContext();
        if (parentContext != null) {
    private final Map<String, Map<String, Object>> pragmas = new HashMap<>();
            listeners = ArrayUtils.add(DBCScriptContextListener.class, listeners, listener);
            return true;

    public synchronized void addListener(DBCScriptContextListener listener) {
    }
        if (commandHandler == null) {
    @Override
                varList = SQLVariablesRegistry.getInstance().getDriverVariables(driver);
                return true;
        }
        SQLUtils.fillQueryParameters(query, parameters);
        if (listeners == null) {

 * Licensed under the Apache License, Version 2.0 (the "License");
 */
        }
        if (lc != null) {
        this.contextVarResolver = new DataSourceVariableResolver(
        }
    public void clearVariables() {

    }
}

    private DBCScriptContextListener[] listeners = null;
import org.jkiss.dbeaver.model.impl.sql.AbstractSQLDialect;
        return parentContext != null && parentContext.hasDefaultParameterValue(name);
    public SQLControlResult executeControlCommand(
                return value;
        this.pragmas.clear();
    // Listeners
        VariableInfo v = variables.remove(getNormalizedVarName(name));
        }



        notifyListeners(DBCScriptContextListener.ContextAction.DELETE, name, p);

