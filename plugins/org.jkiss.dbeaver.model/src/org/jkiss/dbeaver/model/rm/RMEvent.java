    public RMEvent(@NotNull Action action, @NotNull RMProject project) {
    @NotNull

 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
}
    }
    }
 * You may obtain a copy of the License at
    }
    }
import org.jkiss.code.Nullable;
 * Licensed under the Apache License, Version 2.0 (the "License");
public class RMEvent {
        PROJECT_ADD,
        this.action = action;
    public enum Action {
    private final RMProject project;

        return resourcePath;
        return action;
import java.util.Map;
 * distributed under the License is distributed on an "AS IS" BASIS,
        this(action, project, null, Map.of());
        this(action, project, resourcePath, Map.of());
    @Nullable

    @Nullable
 * Copyright (C) 2010-2025 DBeaver Corp and others
        PROJECT_DELETE,
    public Action getAction() {
 * you may not use this file except in compliance with the License.
    @NotNull

        this.resourcePath = resourcePath;
        this.project = project;
    @NotNull
    public RMEvent(@NotNull Action action, @NotNull RMProject project, @Nullable String resourcePath, @NotNull Map<String, Object> parameters) {
    public RMProject getProject() {
    }
    private final Map<String, Object> parameters;

 * limitations under the License.
        return project;
 *
 * Unless required by applicable law or agreed to in writing, software
 *
 *
 * DBeaver - Universal Database Manager

    private final Action action;
    private final String resourcePath;
package org.jkiss.dbeaver.model.rm;
 * See the License for the specific language governing permissions and
    @NotNull
    public Map<String, Object> getParameters() {
    public String getResourcePath() {
 */
        return Map.copyOf(parameters);
    public RMEvent(@NotNull Action action, @NotNull RMProject project, @NotNull String resourcePath) {
import org.jkiss.code.NotNull;

        RESOURCE_ADD,
    }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull

/*

        this.parameters = parameters;

    }
        RESOURCE_DELETE,

        PROJECT_UPDATE

