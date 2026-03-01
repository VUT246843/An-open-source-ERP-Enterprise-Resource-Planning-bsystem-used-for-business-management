                if (removedProperties != null) {
    }
        return false;
    public boolean isOpen() {

                final var newResourcePath = CommonUtils.normalizeResourcePath(pathsPair.getSecond());
    @Override
    }
    @Override

 * limitations under the License.
        this.projectPath = projectPath;
import java.util.Collection;
        if (projectName != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public boolean isVirtual() {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        @Nullable SMSessionContext sessionContext,
 *
            for (var resourcePath : resourcesPaths) {
    }

    /**
        return false;
import org.jkiss.dbeaver.registry.DataSourceRegistry;
     * Method for Bulk Update of resources properties paths

            return projectName.toString();
        loadMetadata();
}

    protected Path projectPath;

import org.jkiss.dbeaver.model.auth.SMSessionContext;
 * you may not use this file except in compliance with the License.

    public String getName() {
            }
    public boolean canUpdateProjectName() {
 * See the License for the specific language governing permissions and
import java.nio.file.Path;
    public void setAbsolutePath(@NotNull Path projectPath) {
        flushMetadata();



    }
    public void ensureOpen() {
    public boolean isUseSecretStorage() {
import org.jkiss.utils.Pair;
        super(workspace, sessionContext);
                final var oldResourcePath = CommonUtils.normalizeResourcePath(pathsPair.getFirst());
        @NotNull DBPWorkspace workspace,
        return getMetadataPath().resolve(METADATA_STORAGE_FILE);
 * Unless required by applicable law or agreed to in writing, software

        }
     */

        }
                    resourceProperties.put(newResourcePath, resProps);
    @NotNull
 * DBeaver - Universal Database Manager

import org.jkiss.utils.CommonUtils;
        if (propertiesChanged) {

 */
    public LocalProjectImpl(
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
        return projectPath.getFileName().toString();
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull Path projectPath

        Object projectName = this.getProjectProperty(PROP_PROJECT_NAME);
import org.jkiss.code.Nullable;
            for (var pathsPair : oldToNewPaths) {
import org.jkiss.dbeaver.model.app.DBPWorkspace;
    }
    }
        synchronized (metadataSync) {
     * Method for Bulk Remove of resources properties
    public boolean resetResourcesPropertiesBatch(@NotNull Collection<String> resourcesPaths) {
    }
    public void moveResourcePropertiesBatch(@NotNull Collection<Pair<String, String>> oldToNewPaths) {

        synchronized (metadataSync) {
import org.jkiss.dbeaver.model.impl.app.BaseProjectImpl;
                var removedProperties = resourceProperties.remove(CommonUtils.normalizeResourcePath(resourcePath));
        loadMetadata();
public class LocalProjectImpl extends BaseProjectImpl {
        }
    public Path getAbsolutePath() {
        return propertiesChanged;
                }
    @Override
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    @NotNull
    @Override
    }
    public Path getMetadataFilePath() {

                if (resProps != null) {
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
                final var resProps = resourceProperties.remove(oldResourcePath);
        }
    @NotNull
    ) {
    }
        this.projectPath = projectPath;
import org.jkiss.code.NotNull;
    @Override
package org.jkiss.dbeaver.registry.project;
    @Override
     */
     * @param oldToNewPaths collection of OldPath to NewPath pairs
        return true;
                }
                    propertiesChanged = true;
            flushMetadata();
        boolean propertiesChanged = false;
/*

    protected DBPDataSourceRegistry createDataSourceRegistry() {
        return false;
 * You may obtain a copy of the License at
    }
            }
     *
    @NotNull
        return projectPath;
    @Override
        return new DataSourceRegistry<>(this);
 *
    /**
