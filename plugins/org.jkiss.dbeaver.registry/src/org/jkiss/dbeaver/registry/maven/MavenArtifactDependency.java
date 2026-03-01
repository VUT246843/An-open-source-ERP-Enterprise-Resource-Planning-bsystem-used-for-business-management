        IMPORT

import java.util.List;
 * See the License for the specific language governing permissions and

        SYSTEM,
    public boolean isBroken() {
    private final boolean optional;

public class MavenArtifactDependency extends MavenArtifactReference {
        this.scope = scope;
        boolean optional
 * Maven artifact license references

        if (exclusions == null) {
        return broken;
 *
        }

 * You may obtain a copy of the License at
        this.broken = broken;

    }
import org.jkiss.code.Nullable;
    ) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
 * limitations under the License.
    public boolean isOptional() {

    private final Scope scope;
    }
        PROVIDED,
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

/**
    private boolean broken;
        @NotNull String version,

    public MavenArtifactDependency(
        super(groupId, artifactId, classifier, null, version);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public enum Scope {
 *
 */
        @Nullable String classifier,
        Scope scope,
package org.jkiss.dbeaver.registry.maven;
import java.util.ArrayList;
 * you may not use this file except in compliance with the License.
        RUNTIME,
    public List<MavenArtifactReference> getExclusions() {
        return exclusions;
        return scope;
        exclusions.add(ref);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    private List<MavenArtifactReference> exclusions;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
            exclusions = new ArrayList<>();
    }
        @NotNull String artifactId,
    public void setBroken(boolean broken) {
    void addExclusion(MavenArtifactReference ref) {
        TEST,
        return optional;
    }
 * DBeaver - Universal Database Manager
    public Scope getScope() {

 * Unless required by applicable law or agreed to in writing, software
        COMPILE,
        @NotNull String groupId,
        this.optional = optional;

 */
 *
/*
}
