    public String getConnectionUrl() {

    public String getDriverId() {
    @NotNull
        this.containerName = container.getName();
    private final String projectId;
import org.jkiss.code.NotNull;
    }
    @Override
    @NotNull
 */
        return containerName;
/**
 * You may obtain a copy of the License at
 */
    @NotNull
public class QMMDataSourceConnectErrorInfo extends QMMObject implements QMMDataSourceInfo {
        this.containerId = container.getId();
    public String getContainerId() {
    public QMMConnectionInfo getConnection() {
    @Nullable

    }

    private final String errorType;
        super(QMMetaObjectType.CONNECTION_ERROR_INFO);
    @NotNull
    public String getErrorType() {
    @Override
        return errorMessage;
    }
} * limitations under the License.
    @Override
    public QMMDataSourceConnectErrorInfo(
    }
 *
    @NotNull
        return connectionUrl;
        this.connectionUrl = container.getConnectionConfiguration().getUrl();
    @NotNull
    }
        return driverId;
    @NotNull
    @NotNull
    private final String connectionUrl;
        return errorType;
 * you may not use this file except in compliance with the License.
    @NotNull

 * Unless required by applicable law or agreed to in writing, software
    }

package org.jkiss.dbeaver.model.qm.meta;
 *
    @Override

    public String getErrorMessage() {
        this.driverId = container.getDriver().getId();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
/*
        @Nullable String errorMessage

    private final String errorMessage;
    @Nullable
    }
    @NotNull
    @Override

 * QM model data source connect error info.

        this.errorType = errorType;
    private final String containerName;
        return projectId;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.errorMessage = errorMessage;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return "";
    @Nullable
 *
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
        this.projectId = container.getProject().getId();


    }
    @Override
    ) {
 * See the License for the specific language governing permissions and

    }
    private final String driverId;
    public String getProjectId() {
        return containerId;
    private final String containerId;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return null;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        @NotNull String errorType,
    public String getText() {
    public String getContainerName() {
        @NotNull DBPDataSourceContainer container,
