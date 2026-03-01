                    if (version == null) {
                        version,
/*
        for (MavenProfile profile : profiles) {
    public List<MavenArtifactDependency> getDependencies() {

            for (MavenArtifactVersion i : imports) {
            // Do not parse dependencies of non-active profiles (most likely they will fail).
                    }
        return artifact.getRepository().getLocalCacheDir().resolve(
        profiles.add(defaultProfile);
    private String description;
                String activeByDefault = XMLUtils.getChildElementBody(activationElement, "activeByDefault");
import org.jkiss.utils.CommonUtils;

        }
            if (activationElement != null) {
            Element dmElement = XMLUtils.getChildElement(element, "dependencyManagement");
                    return version;
                        continue;
            // Dependencies
            return;
    }
        try (InputStream mdStream = Files.newInputStream(localPOM)) {
                        return dmArtifact;

            if (licensesElement != null) {
    public String getId() {
        }
    @Override
        }
        String pomURL = getRemotePOMLocation();
import java.net.URISyntaxException;
    @Nullable
 * You may obtain a copy of the License at
        Document pomDocument;
    @Override
        if (value == null) {
                } else if (depManagement || (!optional && includesScope(scope, resolveOptionalDependencies))) {

                //                return new File(new URL(externalURL).toURI());




            try {
                return Path.of(GeneralUtils.makeURIFromFilePath(getRemotePOMLocation()));
        }
        try (InputStream is = WebUtils.openConnection(monitor, pomURL, artifact.getRepository().getAuthInfo(), null).getInputStream()) {
    private static final String DEFAULT_PROFILE_ID = "#root";
                MavenArtifactDependency dmInfo = depManagement ? null : findDependencyManagement(groupId, artifactId);
                }
                        log.error("Can't resolve artifact [" + groupId + ":" + artifactId + "] version. Skip.");
            if (!CommonUtils.isEmpty(parentDependencies)) {
        List<MavenArtifactDependency> dependencies = new ArrayList<>();
        }
                }
    MavenArtifactVersion(
    ) {
                    if (version == null && dmInfo != null) {

                        parentVersion);
        if (imports != null) {
    }
    }
        this.snapshotVersion = snapshotVersion;
    ) {
    }
                                    CommonUtils.notEmpty(XMLUtils.getChildElementBody(exclusion, "groupId")),
            cachePOM(monitor, localPOM);
                return Path.of(externalURL);

        Map<String, MavenRepository> result = new LinkedHashMap<>();
        return artifact.getGroupId();
                        MavenArtifactReference.VERSION_PATTERN_RELEASE,
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
import org.jkiss.utils.xml.XMLUtils;
    private List<MavenArtifactDependency> parseDependencies(
                            dependency.addExclusion(

    public String getClassifier() {
    private final List<MavenArtifactLicense> licenses = new ArrayList<>();
        return invalidVersion;
    private final IVariableResolver propertyResolver = new IVariableResolver() {
                    }
                if (scope == null && dmInfo != null) {
            }
    private final MavenArtifact artifact;
                        scope,
                for (MavenArtifactDependency dmArtifact : profile.dependencyManagement) {
                if (dependencyManagement != null) {

    private boolean invalidVersion;
            Element licensesElement = XMLUtils.getChildElement(root, "profiles");
    @Override
                                dependency.addExclusion(dmEx);
                        CommonUtils.getBoolean(optionalString));
            scope == MavenArtifactDependency.Scope.RUNTIME ||

                        if (dmExclusions != null) {
                    return parent != null ? parent.version : null;
                }
        }
        MavenProfile defaultProfile = new MavenProfile(DEFAULT_PROFILE_ID);
    public static final String PROP_PROJECT_PARENT_VERSION = "project.parent.version";
            for (MavenProfile profile : v.profiles) {
                    ));
 */
        url = CommonUtils.trim(XMLUtils.getChildElementBody(root, "url"));


        parseProfile(monitor, defaultProfile, root, true, resolveOptionalDependencies);
                        version);
                    profile.active = MavenArtifact.versionMatches(System.getProperty(StandardConstants.ENV_JAVA_VERSION), jdk);
        return parent == null ? null : parent.findDependencyManagement(groupId, artifactId);

                        classifier,
            }
                    result.add(dependency);
        }
                if (!CommonUtils.isEmpty(jdk)) {
                    // Import another pom
                    }
                        (dmInfo != null && dmInfo.isOptional()) :
                        }
    public String getPath() {
    private final List<MavenProfile> profiles = new ArrayList<>();
        List<MavenRepository> repositories = new ArrayList<>();
import java.io.InputStream;
public class MavenArtifactVersion implements IMavenIdentifier {
            for (Element dep : XMLUtils.getChildElementList(dependenciesElement, "dependency")) {
        monitor.worked(1);

    private static String verifyVersionString(@Nullable String version) throws IOException {
                    }
                // Resolve scope
    public String getName() {
        if (description != null) {
        @NotNull DBRProgressMonitor monitor,
                    MavenArtifactReference importReference = new MavenArtifactReference(
        if (version != null && (version.contains("/") || version.contains("\\"))) {
                String parentClassifier = CommonUtils.trim(XMLUtils.getChildElementBody(parentElement, "classifier"));
    }

    @NotNull
        packaging = CommonUtils.trim(XMLUtils.getChildElementBody(root, "packaging"));
                    // Exclusions
        if (repsElement != null) {
import java.nio.file.Files;
    @NotNull
        return artifact.getRepository().getLocalCacheDir().resolve(
                case PROP_PROJECT_PARENT_VERSION:
                        }
                }
                String groupId = evaluateString(XMLUtils.getChildElementBody(dep, "groupId"));
    private String evaluateString(String value) {
    }
    private String name;
                        return evaluateString(value);
        {
                        parentClassifier,
                        for (MavenRepository repository : pr) {
    }
                    XMLUtils.getChildElementBody(repElement, "url"),
                } catch (IOException e) {
                        importReference.setResolveOptionalDependencies(true);
            switch (name) {
                if (osElement != null) {
    }
    }
            }
    private MavenArtifactDependency findDependencyManagement(String groupId, String artifactId) {
        return result;
                    }
    }
    public String getPackaging() {


        {
                log.warn("Bad repository URL", e);
import org.jkiss.code.NotNull;
    private static final Log log = Log.getLog(MavenArtifactVersion.class);

                }
        description = CommonUtils.trim(XMLUtils.getChildElementBody(root, "description"));
        monitor.subTask("Load POM " + this);
    public String getExternalURL() {
        @Nullable

                    log.debug("Skip legacy repository [" + repository + "]");
            }
        } catch (XMLException e) {
    private void loadPOM(DBRProgressMonitor monitor, boolean resolveOptionalDependencies) throws IOException {
                        continue;
                    if (imports == null) {
        return profiles;

                    // TODO: implement real properties checks. Now enable all profiles with !prop
                        artifactId,
import org.jkiss.dbeaver.runtime.WebUtils;
    }
        }
        for (MavenArtifactVersion v = MavenArtifactVersion.this; v != null; v = v.parent) {
 *
    private final List<MavenRepository> repositories = new ArrayList<>();
                    if (dmInfo != null) {
                }
        {
            }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                String scopeName = XMLUtils.getChildElementBody(dep, "scope");
                        log.error("Imported artifact [" + importReference + "] not found. Skip.");
    @Override
            }

    }
        }
                        log.error("Artifact [" + this + "] parent [" + parentReference + "] not found");
            artifact.getGroupId() + "/" + artifact.getVersionFileName(version, fileExt));
                    return dependencyManagement;
                for (Element profElement : XMLUtils.getChildElementList(licensesElement, "profile")) {
        }
                for (MavenProfile profile : v.profiles) {
        this.snapshotVersion = false;
                    }
            }
 * Maven artifact version descriptor (POM).
                MavenArtifactDependency dependencyManagement = i.findDependencyManagement(groupId, artifactId);
        }
                String optionalString = XMLUtils.getChildElementBody(dep, "optional");
    }
            (resolveOptionalDependencies && scope == MavenArtifactDependency.Scope.PROVIDED);
        return dependencies;
    public MavenArtifactVersion getParent() {
    private MavenArtifactVersion parent;
        }
    };
    }
        }
        boolean resolveOptionalDependencies,
        return artifact.getFileURL(version, MavenArtifact.FILE_POM, snapshotVersion);
                        XMLUtils.getChildElementBody(prop, "url")
        return
                    if (parent == null) {
                            for (MavenArtifactReference dmEx : dmExclusions) {

                }
        return version;
                    if (value != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    CommonUtils.toBoolean(XMLUtils.getChildElementBody(releasesElement, "enabled"));
    public List<MavenArtifactLicense> getLicenses() {
        }
    @Override
        @NotNull MavenArtifact artifact,
    }

            return;
        // Default profile
            pomDocument = XMLUtils.parseDocument(mdStream);
                }
    public MavenArtifact getArtifact() {
                    if (pr != null) {
    @Nullable
    public static final String PROP_PROJECT_GROUP_ID = "project.groupId";
    }

                try {
    public Path getCacheFile() {
            return null;
    public static final String PROP_PROJECT_ARTIFACT_ID = "project.artifactId";
        @Override
            }
        // Repositories
            // Activation
        return licenses;
                                    ""));
        List<MavenArtifactDependency> result = new ArrayList<>();

        }
                String parentGroupId = CommonUtils.trim(XMLUtils.getChildElementBody(parentElement, "groupId"));
                    scope = MavenArtifactDependency.Scope.COMPILE;
        }
    }
    public String getGroupId() {
            try (OutputStream os = Files.newOutputStream(localPOM)) {
 *
        }
                        imports = new ArrayList<>();
import org.jkiss.dbeaver.runtime.IVariableResolver;

            }
    @NotNull
                                    CommonUtils.notEmpty(XMLUtils.getChildElementBody(exclusion, "artifactId")),

                    profiles.add(profile);
                }
    }
                }
            // Properties

        this.artifact = artifact;
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.version = version;
    public String getDescription() {
            }
                    Files.createDirectories(folder);
    }
    private void parseProfile(DBRProgressMonitor monitor, MavenProfile profile, Element element, boolean isDefault, boolean resolveOptionalDependencies) {
            String externalURL = getExternalURL(fileExt);
        return getPath();
                for (Element prop : XMLUtils.getChildElementList(propsElement)) {
                    licenses.add(new MavenArtifactLicense(
    {
            }
import org.w3c.dom.Element;
                    parent = MavenRegistry.getInstance().findArtifact(monitor, this, parentReference);
                    if (version == null) {
                        optional);
                for (Element prop : XMLUtils.getChildElementList(licensesElement, "license")) {
        return new MavenArtifactVersion(artifact, version);
 * DBeaver - Universal Database Manager
        return artifact.getClassifier();
                }
                String classifier = evaluateString(XMLUtils.getChildElementBody(dep, "classifier"));
    @NotNull
            scope == MavenArtifactDependency.Scope.COMPILE ||
 *     http://www.apache.org/licenses/LICENSE-2.0
    public String getFallbackVersion() {
            if (propsElement != null) {
            profile.dependencies = parseDependencies(monitor, element, false, resolveOptionalDependencies);
            }
                boolean enabled = releasesElement == null ||
                    continue;

                    }
    }
        return url;
                    scope = dmInfo.getScope();

                    String propName = XMLUtils.getChildElementBody(propElement, "name");
    }
            }
            if (licensesElement != null) {
    }
    private void cachePOM(DBRProgressMonitor monitor, Path localPOM) throws IOException {
                }
                if (propElement != null) {

                                    null,
                    log.warn("Broken dependency reference: " + groupId + ":" + artifactId);
}                    MavenArtifactReference parentReference = new MavenArtifactReference(
                String parentArtifactId = CommonUtils.trim(XMLUtils.getChildElementBody(parentElement, "artifactId"));
        @NotNull Element element,
                    Element exclusionsElement = XMLUtils.getChildElement(dep, "exclusions");

                    imports.add(importedVersion);
    public Collection<MavenRepository> getActiveRepositories() {
        defaultProfile.active = true;
        // Check in imported BOMs
            for (Element repElement : XMLUtils.getChildElementList(repsElement, "repository")) {
    }
                        parentArtifactId,
                if (parentGroupId == null || parentArtifactId == null || parentVersion == null) {
                String layout = XMLUtils.getChildElementBody(repElement, "layout");
            } catch (URISyntaxException e) {
import org.jkiss.dbeaver.Log;
                        groupId,
                Element releasesElement = XMLUtils.getChildElement(repElement, "releases");
                // Resolve version
    @Nullable
    }
                case PROP_PROJECT_ARTIFACT_ID:
                    return artifact.getArtifactId();
            // Licenses

import org.w3c.dom.Document;
                dependencies.addAll(parentDependencies);
    }
        }
                    List<MavenRepository> pr = profile.getRepositories();
            if (parentElement != null) {
                }
        }
    }
        Element repsElement = XMLUtils.getChildElement(element, "repositories");
                        XMLUtils.getChildElementBody(prop, "name"),
            }

            Element parentElement = XMLUtils.getChildElement(root, "parent");
            if (Files.notExists(folder)) {
                String artifactId = evaluateString(XMLUtils.getChildElementBody(dep, "artifactId"));
                log.warn(e);
            case "", MavenArtifact.PACKAGING_BUNDLE, MavenArtifact.PACKAGING_MAVEN_PLUGIN, MavenArtifact.FILE_POM ->
        }
        if (artifact.getRepository().getType() == MavenRepository.RepositoryType.LOCAL) {
        @NotNull String version) {

package org.jkiss.dbeaver.registry.maven;
        @NotNull DBRProgressMonitor monitor,
        return description;
            }
        return GeneralUtils.replaceVariables(value, propertyResolver);

                    XMLUtils.getChildElementBody(repElement, "name"),
                dependencies.addAll(profile.dependencies);
        Element dependenciesElement = XMLUtils.getChildElement(element, "dependencies");
    }
                        classifier,

    }
    private String url;
import java.util.*;
                    MavenRepository.RepositoryType.EXTERNAL);
        return artifact.getArtifactId();
                        dmArtifact.getArtifactId().equals(artifactId)) {
        }
        }

                        profile.active = true;
        @NotNull MavenArtifact artifact,
            Element propsElement = XMLUtils.getChildElement(element, "properties");
            Element activationElement = XMLUtils.getChildElement(element, "activation");
                    }
            Element licensesElement = XMLUtils.getChildElement(root, "licenses");
/**
        Element root = pomDocument.getDocumentElement();
                    }
import org.jkiss.code.Nullable;
import java.io.IOException;
    private final boolean snapshotVersion;
                MavenArtifact.FILE_JAR;
                        version = dmInfo.getVersion();
            }
                        artifactId,
    }
        if (artifact.getRepository().getType() == MavenRepository.RepositoryType.LOCAL) {
                    if (importedVersion == null) {
                        parentGroupId,
                    (optionalString == null ?

                }
            result.put(rep.getId(), rep);
        return repositories;
        return name;
                                    CommonUtils.notEmpty(XMLUtils.getChildElementBody(exclusion, "classifier")),
                        this.version = parentReference.getVersion();
                    if (dmArtifact.getGroupId().equals(groupId) &&
                    if (!profile.isActive()) {
    private String version;
                    }
    }

        return artifact.toString() + ":" + version;
        if (artifact.getRepository().getType() == MavenRepository.RepositoryType.LOCAL) {

                    // TODO: maybe we should include optional or PROVIDED
        loadPOM(monitor, resolveOptionalDependencies);

                }
    public String getVersion() {
                            result.put(repository.getId(), repository);
                MavenRepository repository = new MavenRepository(
            // Parent
                    profile.properties.put(prop.getTagName(), XMLUtils.getElementBody(prop));
                if (enabled) {
                    MavenArtifactDependency.Scope.class, scopeName.toUpperCase(Locale.ENGLISH), null);
                    }
            }
                String version = evaluateString(XMLUtils.getChildElementBody(dep, "version"));
                if (profile.isActive()) {
                    throw new IOException("Can't create cache folder '" + folder.toAbsolutePath() + "'", e);
        boolean depManagement,
                            }
                    XMLUtils.getChildElementBody(repElement, "id"),
import org.jkiss.dbeaver.utils.GeneralUtils;
                    String value = profile.properties.get(name);
                Element osElement = XMLUtils.getChildElement(activationElement, "os");

        this.invalidVersion = true;
        version = CommonUtils.trim(XMLUtils.getChildElementBody(root, "version"));
                IOUtils.fastCopy(is, os);
                    MavenProfile profile = new MavenProfile(XMLUtils.getChildElementBody(profElement, "id"));
                }
    public List<MavenProfile> getProfiles() {
            for (MavenRepository repository : parseRepositories(element)) {

        this.version = verifyVersionString(evaluateString(this.version));
            throw new IOException("Invalid Maven version string: " + version);
                }
                        log.error("Missing imported artifact [" + groupId + ":" + artifactId + "] version. Skip.");
                    profile.active = CommonUtils.getBoolean(activeByDefault);
    private String getRemotePOMLocation() {
    @Override
                    }
                return Path.of(GeneralUtils.makeURIFromFilePath(externalURL));
        boolean snapshotVersion
        return artifact.getFileURL(version, getPackagingFileExtension(), snapshotVersion);
    }

        return MavenArtifactReference.makeId(this);
 */
        return version;
                profile.dependencyManagement = parseDependencies(monitor, dmElement, true, resolveOptionalDependencies);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


                if (scope == null) {
    private String packaging;

                    repositories.add(repository);
        }

        Path localPOM = getLocalPOM();
    @NotNull
        public String get(@NotNull String name) {
        if (!isDefault) {
        return parent;
                    parseProfile(monitor, profile, profElement, false, resolveOptionalDependencies);
    }
        for (MavenRepository rep : repositories) {
        name = CommonUtils.trim(XMLUtils.getChildElementBody(root, "name"));
        }
                if (!CommonUtils.isEmpty(activeByDefault)) {
        return artifact.getFallbackVersion();
                profile.addRepository(repository);
                        continue;
                        List<MavenArtifactReference> dmExclusions = dmInfo.getExclusions();
        }

            artifact.getGroupId() + "/" + artifact.getVersionFileName(version, MavenArtifact.FILE_POM));
                    if (exclusionsElement != null) {
        for (MavenProfile profile : profiles) {
        this.artifact = artifact;
    public String getUrl() {
    private Path getLocalPOM() {
        if (dependenciesElement != null) {
    }
    ) throws IOException {
                String jdk = XMLUtils.getChildElementBody(activationElement, "jdk");
                        groupId,
                    }
                    }
            } catch (Exception e) {

    public boolean isInvalidVersion() {
    public String getExternalURL(String fileType) {
    @NotNull
        boolean resolveOptionalDependencies
            if (profile.isActive() && profile.dependencyManagement != null) {
                                new MavenArtifactReference(
    public static final String PROP_PROJECT_VERSION = "project.version";
 *
 * limitations under the License.
                    }
                        for (Element exclusion : XMLUtils.getChildElementList(exclusionsElement, "exclusion")) {
            return null;
        return packaging;
            // Profiles
 * See the License for the specific language governing permissions and
    }
        if (!Files.exists(localPOM)) {
                }
            List<MavenArtifactDependency> parentDependencies = parent.getDependencies();
import org.jkiss.utils.StandardConstants;
import org.jkiss.utils.IOUtils;

                case PROP_PROJECT_GROUP_ID:
    }
import java.io.OutputStream;
                        }
    private List<MavenArtifactVersion> imports;
                if (depManagement && scope == MavenArtifactDependency.Scope.IMPORT) {
    private boolean includesScope(MavenArtifactDependency.Scope scope, boolean resolveOptionalDependencies) {

                    MavenArtifactDependency dependency = new MavenArtifactDependency(
        final String packaging = CommonUtils.notEmpty(this.packaging);

            for (MavenArtifactVersion v = MavenArtifactVersion.this; v != null; v = v.parent) {
 * you may not use this file except in compliance with the License.
                Element propElement = XMLUtils.getChildElement(activationElement, "property");
    }
    public String toString() {
                    log.error("Broken parent reference: " + parentGroupId + ":" + parentArtifactId + ":" + parentVersion);
    @Override

                boolean optional = !resolveOptionalDependencies &&
                    if (propName != null && propName.startsWith("!")) {
            if (profile.isActive() && !CommonUtils.isEmpty(profile.dependencies)) {
        @NotNull MavenArtifact artifact,
        {
                if ("legacy".equals(layout)) {
                }

    }
            // Repositories
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.utils.xml.XMLException;

                String parentVersion = CommonUtils.trim(XMLUtils.getChildElementBody(parentElement, "version"));
        @NotNull String version,
        }
                    if (resolveOptionalDependencies) {
            Path folder = localPOM.getParent();
        @NotNull String version
                    MavenArtifactVersion importedVersion = MavenRegistry.getInstance().findArtifact(monitor, this, importReference);
                } else {
            }
        return artifact.getFileURL(version, fileType, snapshotVersion);
        return artifact;
        return switch (packaging) { // empty packaging
        return result.values();
                case PROP_PROJECT_VERSION:
            description = CommonUtils.compactWhiteSpaces(description.trim());
        {
            try {
            if (dmElement != null) {
                if (groupId == null || artifactId == null) {
        if (!profile.active) {
    public String getArtifactId() {
                    continue;
        if (parent != null) {
        repositories.addAll(parseRepositories(root));
import java.nio.file.Path;
    private MavenArtifactVersion(
            default -> packaging;
        String fileExt = getPackagingFileExtension();
    private String getPackagingFileExtension() {
                    //String propValue = XMLUtils.getChildElementBody(propElement, "value");
            throw new IOException("Error parsing POM", e);
            }

                        null,
        };
        this.version = CommonUtils.trim(version);
            }
                    return artifact.getGroupId();
                    if (this.version == null) {
    private List<MavenRepository> parseRepositories(Element element)
    public static MavenArtifactVersion createInvalidVersion(
                MavenArtifactDependency.Scope scope = scopeName == null ? null : CommonUtils.valueOf(
        {
