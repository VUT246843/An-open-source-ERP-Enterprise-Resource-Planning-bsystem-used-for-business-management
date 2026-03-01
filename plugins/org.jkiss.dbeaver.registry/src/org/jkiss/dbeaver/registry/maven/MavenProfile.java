        return id;
    public List<MavenRepository> getRepositories() {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
/**
        return dependencyManagement;
    List<MavenRepository> repositories;
    }

    }

    public String getId() {
        return active;
    boolean active;
    }
            repositories = new ArrayList<>();
        return id;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.util.List;
/*
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
    Map<String, String> properties = new LinkedHashMap<>();
    public boolean isActive() {
    public List<MavenArtifactDependency> getDependencies() {
    }
    }
        repositories.add(repository);
package org.jkiss.dbeaver.registry.maven;

        return repositories;
 */
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
public class MavenProfile {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public Map<String, String> getProperties() {
    private final String id;

import java.util.ArrayList;
 *

    List<MavenArtifactDependency> dependencies;
    List<MavenArtifactDependency> dependencyManagement;


 */

    @Override

 * Unless required by applicable law or agreed to in writing, software
        return properties;
 *
        return dependencies;
    public List<MavenArtifactDependency> getDependencyManagement() {
 * Maven build profile

 * limitations under the License.

        if (repositories == null) {

 *
}

        this.id = id;
    }
        }
    void addRepository(MavenRepository repository) {
import java.util.Map;
    public String toString() {

 * See the License for the specific language governing permissions and
    public MavenProfile(String id) {
import java.util.LinkedHashMap;
