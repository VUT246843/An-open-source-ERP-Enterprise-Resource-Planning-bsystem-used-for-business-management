                return super.get(name);

        }
    }
                return getContextInfo(SQLPreferenceConstants.VAR_ACTIVE_DATABASE);
        return null;
                }
}
    public String get(@NotNull String name) {
/*
        this.context = context;
 *
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
                if (file != null) {
import java.util.Objects;
    }
    }
    private final String scriptName;
                    return file.getFullPath().getFileExtension();
import org.eclipse.core.resources.IFile;
 * See the License for the specific language governing permissions and

 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
import org.jkiss.code.Nullable;
            case SQLPreferenceConstants.VAR_FILE_EXT:
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private final DBCExecutionContext context;
 * DBeaver - Universal Database Manager
            default:
    private final DBPDataSourceContainer dataSourceContainer;
            case SQLPreferenceConstants.VAR_DRIVER_NAME:

            case SQLPreferenceConstants.VAR_ACTIVE_PROJECT:
                    return contextDefaults.getDefaultCatalog() == null ? null : contextDefaults.getDefaultCatalog().getName();
            case SQLPreferenceConstants.VAR_FILE_NAME:
 * you may not use this file except in compliance with the License.
    @Nullable
            DBCExecutionContextDefaults<?, ?> contextDefaults = context.getContextDefaults();
 * Unless required by applicable law or agreed to in writing, software
                    return contextDefaults.getDefaultSchema() == null ? null : contextDefaults.getDefaultSchema().getName();
                    return dataSourceContainer == null ? null : dataSourceContainer.getProject().getName();
        switch (name) {
            case SQLPreferenceConstants.VAR_CONNECTION_NAME:
 * distributed under the License is distributed on an "AS IS" BASIS,
                return dataSourceContainer == null ? "?" : dataSourceContainer.getDriver().getFullName();
            case SQLPreferenceConstants.VAR_ACTIVE_DATABASE:
                                      @Nullable DBCExecutionContext context,
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
public class SQLEditorVariablesResolver extends DataSourceVariableResolver {
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    private String getContextInfo(String type) {
                                      @Nullable IFile file, DBPProject project) {
                }
        this.scriptName = scriptName;
                if (type.equals(SQLPreferenceConstants.VAR_ACTIVE_SCHEMA))
            }
        this.file = file;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
                                      @Nullable DBPConnectionConfiguration configuration,
                return getContextInfo(SQLPreferenceConstants.VAR_ACTIVE_SCHEMA);
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
package org.jkiss.dbeaver.ui.editors.sql.handlers;
        super(dataSourceContainer, configuration);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                    return "";
                } else {
 * limitations under the License.

            case SQLPreferenceConstants.VAR_ACTIVE_SCHEMA:
                                      @Nullable String scriptName,
        }
                if (project != null){
                } else {
 *
        if (context != null) {
                return Objects.requireNonNullElse(this.scriptName, "");
                if (type.equals(SQLPreferenceConstants.VAR_ACTIVE_DATABASE))
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final DBPProject project;
    public SQLEditorVariablesResolver(@Nullable DBPDataSourceContainer dataSourceContainer,
import org.jkiss.dbeaver.model.connection.DataSourceVariableResolver;
                    return project.getName();
 *
        this.dataSourceContainer = dataSourceContainer;
        this.project = project;
                return dataSourceContainer == null ? "none" : dataSourceContainer.getName();

    private final IFile file;
            if (contextDefaults != null) {
