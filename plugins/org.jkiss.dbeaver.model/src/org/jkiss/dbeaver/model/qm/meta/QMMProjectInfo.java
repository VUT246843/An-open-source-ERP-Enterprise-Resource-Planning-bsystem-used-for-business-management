 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        this.path = builder.path;
        }
        this.isAnonymous = builder.isAnonymous;
    }
 */
            .getSessionContext()
    private final UUID uuid;
        public Builder() {
            return this;
 *
            return this;
    public QMMProjectInfo(DBPProject project) {
    private final String path;
 * DBeaver - Universal Database Manager
import java.util.UUID;
    @Include
 *
public class QMMProjectInfo {
        private String name;
    public String getId() {
        public Builder setId(String id) {
    private QMMProjectInfo(Builder builder) {
        return id;
        }

package org.jkiss.dbeaver.model.qm.meta;
    public UUID getUuid() {

        }
        private String id;

            return this;
    public static final class Builder {
        }
        this.id = project.getId();
    }
    public String getPath() {
    }
    }

        public QMMProjectInfo build() {
/*

        return uuid;
 * limitations under the License.

        this.isAnonymous = projectSession == null || projectSession.getSessionPrincipal() == null;
 * you may not use this file except in compliance with the License.
    }

        return isAnonymous;
        this.path = project.getAbsolutePath().toString();

    public static Builder builder() {
        this.name = project.getName();
 *     http://www.apache.org/licenses/LICENSE-2.0

            this.id = id;
        return name;
 * Copyright (C) 2010-2024 DBeaver Corp and others

    public boolean isAnonymous() {

 *

}
 * Licensed under the Apache License, Version 2.0 (the "License");

    public String getName() {
    }
            .findSpaceSession(project);
    private final String id;
 * Unless required by applicable law or agreed to in writing, software
        this.uuid = UUID.randomUUID();

        var projectSession = project

            isAnonymous = anonymous;
        }
    private final String name;

        public Builder setName(String name) {
    private final boolean isAnonymous;
            this.path = path;
        return path;
            return new QMMProjectInfo(this);
import org.jkiss.dbeaver.model.app.DBPProject;
        public Builder setPath(String path) {
        this.name = builder.name;
        public Builder setAnonymous(boolean anonymous) {
 * distributed under the License is distributed on an "AS IS" BASIS,

        return new Builder();

 * See the License for the specific language governing permissions and
            this.name = name;
    }
        private String path;

        this.uuid = project.getProjectID();
        }
 * You may obtain a copy of the License at
    }
        private boolean isAnonymous;
            return this;
        this.id = builder.id;
