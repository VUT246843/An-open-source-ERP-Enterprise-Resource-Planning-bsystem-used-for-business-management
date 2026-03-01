    }
 *
 * you may not use this file except in compliance with the License.
        return id;
    }
            artifactId = parts[1];
    @NotNull
}
                fallbackVersion = parts[3];
    @Override
    private final String classifier;
 *
            classifier = null;
            groupId = mavenUri;
    }
    @NotNull
    public String getId() {
        version = DEFAULT_MAVEN_VERSION;
     */
    @Nullable
                classifier = null;
        return fallbackVersion;
        this.id = makeId(this);
            id.append(":").append(identifier.getFallbackVersion() != null ? identifier.getFallbackVersion() :
 * Unless required by applicable law or agreed to in writing, software

    private final String fallbackVersion;
        return id.toString();
        return groupId.hashCode() + artifactId.hashCode() + version.hashCode();
    @Nullable
    public static final String VERSION_PATTERN_LATEST = "LATEST";
    @Override
 */
        return getPath();
    @NotNull
    public String getClassifier() {
    @Override
    private boolean resolveOptionalDependencies;
        }
            mavenUri = mavenUri.substring(divPos + 1);
    private final String id;

 *
                fallbackVersion = parts[2];
    public String getPath() {
    private final String groupId;
            artifactId = mavenUri;
    public int hashCode() {
    }
        return artifactId;
        return resolveOptionalDependencies;
    @Override
     *   Can be GROUP:ARTIFACT:FALLABACK_VERSION or
    private final String version;
     *   GROUP:ARTIFACT:CLASSIFIER:FALLABACK_VERSION
        return groupId;
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull String version
    }
    public void setResolveOptionalDependencies(boolean resolveOptionalDependencies) {
            id.append(":").append(identifier.getClassifier());
        StringBuilder id = new StringBuilder();
            }
    public String getVersion() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 * limitations under the License.
        if (identifier.getClassifier() != null) {

 */
            groupId = parts[0];
        this.classifier = CommonUtils.trim(classifier);
    }
            fallbackVersion = null;
        if (parts.length == 1) {
                classifier = parts[2];
public class MavenArtifactReference implements IMavenIdentifier
    @Override


        String[] parts = mavenUri.split(":");

    @Nullable
 * You may obtain a copy of the License at
        int divPos = mavenUri.indexOf('/');
            if (parts.length == 2) {
    private final String artifactId;
        @Nullable String classifier,


        this.fallbackVersion = CommonUtils.trim(fallbackVersion);
                                  identifier.getVersion());
import org.jkiss.code.Nullable;
    @NotNull
    public MavenArtifactReference(



    public static final String VERSION_PATTERN_SNAPSHOT = "SNAPSHOT";
        id = makeId(this);
    public String getFallbackVersion() {
/*
        @Nullable String fallbackVersion,

    private static final String DEFAULT_MAVEN_VERSION = VERSION_PATTERN_RELEASE;
    ) {
    public static final String VERSION_PATTERN_RELEASE = "RELEASE";
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;

 * Copyright (C) 2010-2024 DBeaver Corp and others

        this.artifactId = CommonUtils.trim(artifactId);
        @NotNull String groupId,

        } else {
    }
    @NotNull

    }
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @param ref artifact reference path.
                classifier = null;
import org.jkiss.utils.CommonUtils;
    }
        this.version = CommonUtils.trim(version);
    public String getArtifactId() {
 * See the License for the specific language governing permissions and
    @Override
    public String toString() {
    public MavenArtifactReference(String ref) {
        return id;
        id.append(identifier.getGroupId()).append(":").append(identifier.getArtifactId());
{
    @Override
    @NotNull
 * DBeaver - Universal Database Manager
        this.groupId = CommonUtils.trim(groupId);
        this.resolveOptionalDependencies = resolveOptionalDependencies;
    public boolean isResolveOptionalDependencies() {

        return classifier;
    static String makeId(IMavenIdentifier identifier) {
    @NotNull
    }
    }
                fallbackVersion = null;
    }
        @NotNull String artifactId,
    /**

        }
        }
 * Maven artifact reference

            } else if (parts.length == 3) {
        if (identifier.getFallbackVersion() != null) {
            } else {
package org.jkiss.dbeaver.registry.maven;
        return version;
    @NotNull
        }
        String mavenUri = ref;
        if (divPos >= 0) {
    }
/**
            // No artifact ID
    public String getGroupId() {
    @Nullable

