            || object instanceof DBSTrigger
        return AIEngineRegistry.getInstance().getEngineDescriptor(
     *
        @Nullable DBCExecutionContext context
        return Stream.of(models).collect(Collectors.toMap(
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.struct.DBSObject;
        return null;
    private static void showAutoCommitDisabledNotification() {


        }
        if (dmlRule == AIQueryConfirmationRule.DISABLE_AUTOCOMMIT) {
 * DBeaver - Universal Database Manager
        @Nullable DBCExecutionContext executionContext
    }
        ) {
        }
        if (queryCategories.contains(SQLQueryCategory.DML) && isConfirmationNeeded(AIConstants.AI_CONFIRM_DML)) {
        @NotNull DBSObject obj
        // Try to find more generic model
                return Optional.of(model);
            AIMessages.ai_execute_query_auto_commit_disabled_message
            settings.setScope(AIDatabaseScope.CURRENT_DATASOURCE);
     * Checks if the given DBPObject is eligible for AI description.
    }
        return Optional.empty();


            settings.setScope(AIDatabaseScope.CURRENT_SCHEMA);
    public static void disableAutoCommitIfNeeded(
     */
                    return scriptObject.getObjectDefinitionText(
            // default scope
import org.jkiss.dbeaver.model.exec.DBCTransactionManager;
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
                showAutoCommitDisabledNotification();

            settings.setScope(AIDatabaseScope.CURRENT_DATABASE);
            AIQueryConfirmationRule.class,
        String tmpName = modelName;
 * you may not use this file except in compliance with the License.
            || DBUtils.isHiddenObject(obj)
    ) throws DBException {
            || dbpObject instanceof DBSEntityConstraint;
import org.jkiss.dbeaver.model.impl.DataSourceContextProvider;

            return true;
import org.jkiss.dbeaver.model.secret.DBSSecretController;
            .orElse(null);
public final class AIUtils {
            }
     *

        @NotNull DBPDataSource dataSource,
        String scriptText = scriptElements.stream()
import org.jkiss.dbeaver.model.ai.registry.AISettingsManager;
import org.jkiss.dbeaver.model.sql.SQLUtils;
        for (;;) {
    public static boolean isExcludableObject(
import org.jkiss.dbeaver.model.ai.*;
                            DBPScriptObject.OPTION_SKIP_INDEXES, true, // Exclude indexes
        }
        );
            .map(SQLScriptElement::getDataSource)
        }
 * See the License for the specific language governing permissions and
    ) {
        }
                tmpName = tmpName.substring(0, divPos);
            String message = isCommand ? AIMessages.ai_execute_command_confirm_ddl_message :
            AISettingsManager.getInstance().getSettings().activeEngine()
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.rdb.*;
        @NotNull DBRProgressMonitor monitor,
        DBWorkbench.getPlatformUI().showWarningNotification(
        return true;
 */

            return Optional.empty();
    private static boolean isConfirmationNeeded(@NotNull String actionName) {
        @Nullable String defaultValue
        }
import org.jkiss.dbeaver.model.ai.engine.AIModel;
            || dbpObject instanceof DBSTrigger
    public static boolean confirmExecutionIfNeeded(
            // TODO: change behavior in multiuser mode
            || dbpObject instanceof DBSTableColumn
        Set<SQLQueryCategory> queryCategories = SQLQueryCategory.categorizeScript(scriptElements);
 *
     * @return true if the object can be described by AI, false otherwise
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
            serviceSQL.confirmQueryExecution(title, message, scriptText, getContextProvider(scriptElements), true) :
                            DBPScriptObject.OPTION_INCLUDE_COMMENTS, false,
        if (queryCategories.contains(SQLQueryCategory.DDL) && isConfirmationNeeded(AIConstants.AI_CONFIRM_DDL)) {

import org.jkiss.dbeaver.DBException;
import org.jkiss.code.Nullable;
            AIMessages.ai_execute_query_auto_commit_disabled_title,
            || DBNUtils.getNodeByObject(monitor, obj, false) == null;
        }
            DBWorkbench.getPlatform().getPreferenceStore().getString(actionName),
            AIQueryConfirmationRule.CONFIRM
        }
                AIMessages.ai_execute_query_confirm_sql_message;
     */
        }
        return configuration.isValidConfiguration();
        if (CommonUtils.isEmpty(secretValue)) {
            return;
    ) {
}
            AIModel::name,
    /**
        return serviceSQL != null ?
        );
    ) {
                        )
            return confirmExecute(AIMessages.ai_execute_query_title, message, dataSource, scriptElements);
                    log.debug(e);
    public static void updateScopeSettingsIfNeeded(

                AIMessages.ai_execute_query_confirm_other_message;
                    );
        @NotNull List<SQLScriptElement> scriptElements,
        return new DataSourceContextProvider(dataSource);

        AIQueryConfirmationRule dmlRule = CommonUtils.valueOf(
 * Unless required by applicable law or agreed to in writing, software
        }
 *
        @NotNull List<SQLScriptElement> scriptElements
    public static String getSecretValueOrDefault(
     * Retrieves the DDL for the given DBSObject if applicable.
    }
        @NotNull DBRProgressMonitor monitor,
    /**
 * limitations under the License.
    }
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
    public static Optional<AIModel> getModelByName(@NotNull Map<String, AIModel> models, @Nullable String modelName) {
import org.jkiss.dbeaver.model.*;
        return DBUtils.isSystemObject(obj)
            String message = isCommand ? AIMessages.ai_execute_command_confirm_other_message :
import org.jkiss.dbeaver.model.struct.DBSEntity;

    }
     * @param dbpObject the object to check
        }
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.sql.SQLQueryCategory;
 *
import org.jkiss.dbeaver.model.sql.SQLScriptElement;
            Function.identity()
        @NotNull String message,
    }
        String delimiter = SQLUtils.getDefaultScriptDelimiter(dataSource.getSQLDialect());
        DBCExecutionContextDefaults<?, ?> contextDefaults = executionContext.getContextDefaults();
            if (model != null) {
    }
        @NotNull DBPDataSource dataSource,
import org.jkiss.dbeaver.model.ai.registry.AIEngineDescriptor;
            } else {
 * Copyright (C) 2010-2026 DBeaver Corp and others
    /**
        if (queryCategories.contains(SQLQueryCategory.UNKNOWN) && isConfirmationNeeded(AIConstants.AI_CONFIRM_OTHER)) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    }
import org.jkiss.dbeaver.model.navigator.DBNUtils;
            return confirmExecute(AIMessages.ai_execute_query_title, message, dataSource, scriptElements);
    public static Map<String, AIModel> modelMap(@NotNull AIModel ... models) {
import java.util.*;
    public static String getObjectDDL(@Nullable DBSObject object, @NotNull DBRProgressMonitor monitor) {
        if (settings.getScope() != null || !container.isConnected()) {

    }
        @NotNull String secretId,
        }
    ) {
        return secretValue;
            return;
import org.jkiss.dbeaver.Log;

            return descriptor.getDriver().isEmbedded();
                AIMessages.ai_execute_query_confirm_ddl_message;
    public static AIEngineDescriptor getActiveEngineDescriptor() {
        modelName = modelName.toLowerCase(Locale.ROOT);
        if (contextDefaults.getDefaultSchema() != null || contextDefaults.supportsSchemaChange()) {
            return confirmExecute(AIMessages.ai_execute_query_title, message, dataSource, scriptElements);
     * If the secret value is empty, it returns the provided default value.

import org.jkiss.dbeaver.model.struct.DBSEntityConstraint;
            DBCTransactionManager txnManager = DBUtils.getTransactionManager(context);
            settings.setScope(AIDatabaseScope.CURRENT_DATABASE);
import org.jkiss.dbeaver.model.ai.registry.AIEngineRegistry;
        return dbpObject instanceof DBSEntity
            AIQueryConfirmationRule.CONFIRM
    private static final Log log = Log.getLog(AIUtils.class);
            int divPos = tmpName.lastIndexOf('-');
            String message = isCommand ? AIMessages.ai_execute_command_confirm_sql_message :
     * @param object  the DBSObject from which to retrieve the DDL
        boolean isCommand
    ) throws DBException {

            .map(Object::toString)
            AIModel model = models.get(tmpName);
    }
        if (!SQLQueryCategory.categorizeScript(scriptElements).contains(SQLQueryCategory.DML)) {
        if (modelName == null || modelName.isEmpty()) {
            }
        UIServiceSQL serviceSQL = DBWorkbench.getService(UIServiceSQL.class);
import org.jkiss.dbeaver.model.ai.engine.AIEngineProperties;
        }
    }
     */
                } catch (DBException e) {
        if (DBWorkbench.getPlatform().getApplication().isMultiuser()) {
        @NotNull String title,
                }

            if (divPos > 0) {
        if (executionContext == null || executionContext.getContextDefaults() == null) {
package org.jkiss.dbeaver.model.ai.utils;


        @NotNull DBPDataSourceContainer container,
        AIEngineProperties configuration = aiSettings.getEngineConfiguration(aiSettings.activeEngine());
                            DBPScriptObject.OPTION_SKIP_DROPS, true // Exclude --DROP
        }
        if (queryCategories.contains(SQLQueryCategory.SQL) && isConfirmationNeeded(AIConstants.AI_CONFIRM_SQL)) {
            DBWorkbench.getPlatformUI().confirmAction(title, message, true);
     * Retrieves a secret value from the global secret controller.

            if (object instanceof DBPScriptObject scriptObject) {
        @NotNull AIContextSettings settings,
        } else if (contextDefaults.getDefaultCatalog() != null || contextDefaults.supportsCatalogChange()) {
            String message = isCommand ? AIMessages.ai_execute_command_confirm_dml_message :
            if (txnManager != null && txnManager.isAutoCommit()) {
            || object instanceof DBSEntityConstraint
            return;
        }
        String secretValue = DBSSecretController.getGlobalSecretController().getPrivateSecretValue(secretId);
    @NotNull
                try {
        return CommonUtils.valueOf(
 * You may obtain a copy of the License at
    private static boolean confirmExecute(
    @NotNull
        ));
        AISettings aiSettings = AISettingsManager.getInstance().getSettings();
    @NotNull
     * @param monitor the progress monitor
                txnManager.setAutoCommit(monitor, false);
                AIMessages.ai_execute_query_confirm_dml_message;
                        monitor, Map.of(

            || dbpObject instanceof DBSProcedure
import java.util.function.Function;
            || dbpObject instanceof DBSSchema
        if (dbpObject instanceof DataSourceDescriptor descriptor) {
import java.util.stream.Stream;
        } else {

    }
        @NotNull List<SQLScriptElement> scriptElements,
        ) == AIQueryConfirmationRule.CONFIRM;
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.stream.Collectors;
        DBPDataSource dataSource = script.stream().findFirst()
            AIQueryConfirmationRule.class,
                            DBPScriptObject.OPTION_INCLUDE_NESTED_OBJECTS, false,
            return defaultValue;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            || obj instanceof DBSTablePartition
                break;
    public static boolean hasValidConfiguration() throws DBException {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    private static DBPContextProvider getContextProvider(@NotNull List<SQLScriptElement> script) {
import org.jkiss.dbeaver.model.ai.internal.AIMessages;
            DBWorkbench.getPlatform().getPreferenceStore().getString(AIConstants.AI_CONFIRM_DML),
    }
    @Nullable
            .collect(Collectors.joining(delimiter + "\n"));
    public static boolean isEligible(@Nullable DBPObject dbpObject) {
        );
        if (object instanceof DBSProcedure
            }
            || object instanceof DBSView

            return confirmExecute(AIMessages.ai_execute_query_title, message, dataSource, scriptElements);
    }
    }
import org.jkiss.dbeaver.runtime.ui.UIServiceSQL;
