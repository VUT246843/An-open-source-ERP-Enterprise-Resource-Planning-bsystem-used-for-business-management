    public String getFallbackVersion() {
        if (localVersion == null) {
        Matcher matcher = hrefPattern.matcher(dir);

 */
        boolean resolveOptionalDependencies) throws IOException
                }

        MavenArtifactVersion localVersion = getVersion(versionInfo);
    }
                log.error("Bad version specification: " + versionSpec);
    }
    public static final String MAVEN_METADATA_XML = "maven-metadata.xml";
                        invalid = true;
        @Nullable String classifier,

import org.jkiss.code.NotNull;
                            throw new IOException("Bad version pattern: " + regex);

            } else if (versionRange != null) {
    public Date getLastUpdate() {
import org.jkiss.dbeaver.runtime.WebUtils;
            }
    }
 *
 *
            }

        String dir = baos.toString();
                lastTag = null;
                versionRange = VersionRange.createFromVersionSpec(versionSpec);
            }

        } catch (Exception e) {
        return firstChar == '[' || firstChar == '(' || firstChar == '{' ||
    public String getVersion() {
            } catch (Exception e) {
package org.jkiss.dbeaver.registry.maven;
        String dir = groupId.replace('.', '/') + "/" + artifactId;
    private final MavenRepository repository;
            List<String> allVersions = versions;
                    }
        return fallbackVersion;
                        snapshotVersions.add(currentSnapshotVersion);
                } else {
    @NotNull
        } else {
        if (version != null) {
        }
        VersionRange versionRange = null;
        DBRProgressMonitor monitor,
            public void saxStartElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName, @NotNull Attributes attributes) throws XMLException {
        latestVersion = null;
            || versionRef.equals(MavenArtifactReference.VERSION_PATTERN_LATEST) || (
            throw new IOException("Empty artifact " + this + " version");
    private String releaseVersion;
        } catch (Exception e) {
        }
        return artifactId;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @NotNull
        this.artifactId = CommonUtils.trim(artifactId);
        @NotNull MavenRepository repository,
        boolean snapshotVersion = repository.isSnapshot() && versionRef.contains(MavenArtifactReference.VERSION_PATTERN_SNAPSHOT);
                continue;
                    } else if ("release".equals(lastTag)) {
        this.groupId = CommonUtils.trim(groupId);
            public String currentSnapshotVersion;
            }
                        } catch (Exception e) {
    public String toString() {
            } else {
    public void loadMetadata(DBRProgressMonitor monitor, String version) throws IOException {
    public MavenArtifactVersion getVersion(String versionStr) {
                    } else if ("extension".equals(lastTag) && !"jar".equals(data)) {
        SAXReader reader = new SAXReader(mdStream);
    @Override
    @NotNull
    }
                log.debug("Error loading version info: " + e.getMessage());
        }

        if (CommonUtils.isEmpty(versionRef)) {
 * DBeaver - Universal Database Manager
    public String getGroupId() {
        }
        lastUpdate = null;
            String href = matcher.group(1);
public class MavenArtifact implements IMavenIdentifier
        sb.append(".").append(fileType);
        String versionInfo;
        boolean snapshotVersion
    }
                    } else if ("classifier".equals(lastTag)
        }
        if (snapshotVersion) {
                            throw new IOException("Artifact '" + this + "' has empty snapshot version list");
            switch (versionRef) {
                            Pattern versionPattern = Pattern.compile(regex);
                href = href.substring(0, href.length() - 1);
 */
    public String getClassifier() {
import java.util.regex.Pattern;
            lastChar == ']' || lastChar == ')' || lastChar == '}' ||
                    insideSnapshotVersion = true;
        if (versionSpec.isEmpty()) {

                    }

                    if (!invalid) {
}
    @NotNull
            }
                }
        releaseVersion = null;
                        versionInfo = null;
import java.io.IOException;
            }
                            log.warn(e);
                fileType
    private final String groupId;
    private final List<String> versions = new ArrayList<>();

    public static final String FILE_POM = "pom";
import java.util.Collection;

        return groupId;
        for (MavenArtifactVersion version : localVersions) {
    private transient boolean metadataLoaded = false;
            loadMetadata(monitor, versionRef);
    {
            } catch (IOException e) {
        if (lookupVersion && !metadataLoaded) {
                    }
            }
        return getId();


        } finally {
    }

import java.util.Date;

            return false;
    }
        if (!isVersionPattern(versionSpec)) {

                    if (snapshotVersion) {
    }
        @Nullable String fallbackVersion)
        snapshotVersions.clear();
    @NotNull


    public static final String FILE_JAR = "jar";
import org.jkiss.dbeaver.Log;
import org.xml.sax.Attributes;
        // Filter versions according to spec
/*
            }

                        versions.add(data);
        versions.clear();
                        }
                versionInfo = versionRef;
        metadataLoaded = true;
                matches = true;
        char firstChar = versionSpec.charAt(0), lastChar = versionSpec.charAt(versionSpec.length() - 1);

                    break;
    public static boolean versionMatches(String version, String versionSpec) {
        }
        List<String> filtered = new ArrayList<>();
import org.jkiss.code.Nullable;
            public String lastTag;
        return repository.getUrl() + dir + "/";
    private void removeIgnoredVersions() {
                    if (versionRef.startsWith("{") && versionRef.endsWith("}")) {
        while (matcher.find()) {
            public void saxEndElement(@NotNull SAXReader reader, @Nullable String namespaceURI, @NotNull String localName) throws XMLException {
            return false;

    public MavenRepository getRepository() {
            if (versionInfo == null) {
            public boolean insideSnapshotVersion = false;
                log.error("Bad version pattern: " + versionSpec);
    @NotNull

        }
                versionInfo = getVersionFromSpec(versionRef);
                versionInfo = VersionUtils.findLatestVersion(allVersions);
        return version;
            removeIgnoredVersions();
                        latestVersion = data;
import org.jkiss.utils.xml.SAXListener;
        } catch (XMLException e) {
            log.debug(e);
    }
        monitor.subTask("Load metadata " + this);
        String versionStr,
        }
import org.jkiss.dbeaver.registry.maven.versioning.DefaultArtifactVersion;

    }
            }
            } catch (XMLException e1) {
            if (divPos != -1) {
            if (versionRef.startsWith("[") || versionRef.startsWith("(")) {
                    if ("version".equals(lastTag)) {
                    break;
            if (matches) {
            // Metadata xml not found. It happens in rare cases. Let's try to get directory listing

    ) throws IllegalArgumentException, IOException {
import org.jkiss.utils.CommonUtils;
    @Nullable
    public static final String PACKAGING_BUNDLE = "bundle";
                    throw new IOException("Artifact '" + this + "' has empty version list");
 *
        } catch (IOException e) {
    }
        return null;
            // Regex - find most recent version matching this pattern
    }

                if (localName.equals("snapshotVersion")) {
        // The repository is a SNAPSHOT repo, artifact metadata is stored inside the version
            @Override
                    }
    private static boolean isVersionPattern(String versionSpec) {
                log.warn("Error parsing artifact directory", e);
    private Date lastUpdate;
    public MavenArtifactVersion resolveVersion(
            loadMetadata(monitor, null);
import java.util.List;
                }
    @Nullable
            @Override
                case MavenArtifactReference.VERSION_PATTERN_RELEASE:
    @Nullable
                    }
            public void saxText(@NotNull SAXReader reader, @NotNull String data) throws XMLException {
        return localVersion;
            monitor.worked(1);
    }
                        } catch (NumberFormatException e) {
    @Override
        try {
    private void parseMetadata(InputStream mdStream) throws IOException, XMLException {

            MavenRegistry.getInstance().isVersionIgnored(groupId + ":" + artifactId + ":" + version));
 * See the License for the specific language governing permissions and
            try {
import java.io.ByteArrayOutputStream;
        Pattern hrefPattern = Pattern.compile("a href=\"(.+)/?\"");
    }
            boolean matches;
    }
                lastTag = localName;
                    } else if ("snapshotVersion".equals(lastTag)) {
        if (version == null) {
    }
            }
                    break;
    @Nullable
                Pattern versionPattern = Pattern.compile(versionSpec.substring(1, versionSpec.length() - 1));
        boolean resolveOptionalDependencies,
                            versionInfo = VersionUtils.findLatestVersion(versions);
    String getFileURL(String version, String fileType, boolean snapshotVersion) {
{
    @NotNull
 * You may obtain a copy of the License at
    String getVersionFileName(@NotNull String version, @NotNull String fileType) {
                        versionInfo = getVersionFromSpec(versionRef);
    private final List<MavenArtifactVersion> localVersions = new ArrayList<>();
        for (String version : versions) {
                    try {
        if (CommonUtils.isEmpty(versions) && !metadataLoaded) {
        boolean lookupVersion = predefinedVersion || isVersionPattern(versionRef) || snapshotVersion;
        }
                        invalid = true;
            if (versionPattern != null) {
            log.warn("Error parsing artifact metadata", e);
                href = href.substring(divPos + 1);

        IOUtils.copyStream(dirStream, baos);
            versionRef.equals(MavenArtifactReference.VERSION_PATTERN_SNAPSHOT) && !getRepository().isSnapshot());

        this.repository = repository;
        }
        @NotNull String versionRef,
        }
    public MavenArtifact(
import org.jkiss.utils.IOUtils;
    private static final Log log = Log.getLog(MavenArtifact.class);
            sb.append('-').append(classifier);
                case MavenArtifactReference.VERSION_PATTERN_LATEST:
    }
                filtered.add(version);
            );
        boolean setActive,

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
                        releaseVersion = data;
        StringBuilder sb = new StringBuilder();
        }
import org.jkiss.dbeaver.registry.maven.versioning.VersionRange;
        this.classifier = CommonUtils.trim(classifier);
            metadataPath += version + "/";
                        versionInfo = VersionUtils.findLatestVersion(snapshotVersions);

                    currentSnapshotVersion = null;
        return getBaseArtifactURL() + version + "/" + getVersionFileName(version, fileType);
    private void parseDirectory(InputStream dirStream) throws IOException, XMLException {
        this.fallbackVersion = CommonUtils.trim(fallbackVersion);
            boolean invalid = false;
                        insideSnapshotVersion = true;
        }
    }
    private String getVersionFromSpec(String versionRef) throws IOException {
    }
        return filtered;
                versionPattern = Pattern.compile(versionSpec.substring(1, versionSpec.length() - 1));
                    } else if ("latest".equals(lastTag)) {
import java.util.ArrayList;
    @Override
    public static final String PACKAGING_MAVEN_PLUGIN = "maven-plugin";
                VersionUtils.findLatestVersion(snapshotVersions),
            while (href.endsWith("/")) {
                    insideSnapshotVersion = false;
        }
                    if (!CommonUtils.isEmpty(versionInfo) && VersionUtils.isBetaVersion(versionInfo)) {
                        // Regex - find most recent version matching this pattern
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
            }
    }
                return versionPattern.matcher(version).matches();
            try {
        @NotNull String groupId,
        metadataPath += MAVEN_METADATA_XML;
            }
                            versions.removeIf(s -> !versionPattern.matcher(s).matches());
        }
/**
                // Some IO error - not fatal
            }
        try {
            parseMetadata(mdStream);
            }
                            lastUpdate = new Date(Long.parseLong(data));
                matches = versionPattern.matcher(version).matches();
                parseDirectory(dirStream);
            localVersions.add(version);
            try {
    @Override
        versions.removeIf(version ->
                        && !data.equals(classifier)) {

                matches = versionRange.containsVersion(new DefaultArtifactVersion(version));
        return classifier;
    private final String classifier;
            if (CommonUtils.equalObjects(version.getVersion(), versionStr)) {
 * Maven artifact descriptor
import java.io.InputStream;
            if (range.getRecommendedVersion() != null) {
                localVersion = makeLocalVersion(monitor, versionInfo, lookupVersion, resolveOptionalDependencies, snapshotVersion);
            version = new MavenArtifactVersion(monitor, this, versionStr, resolveOptionalDependencies, snapshotVersion);
        });
                    }
                versionInfo = range.getRecommendedVersion().toString();
 * you may not use this file except in compliance with the License.
    private String latestVersion;
                return version;
            }
    }
        if (lookupVersion) {

                    } else {
    public void loadMetadata(DBRProgressMonitor monitor) throws IOException {
            versions.add(href);
            int divPos = href.lastIndexOf('/');
                        String regex = versionRef.substring(1, versionRef.length() - 1);
                // Use latest version
        @NotNull DBRProgressMonitor monitor,
        @NotNull String artifactId,
            return versions;

        } else {


        String versionInfo;
            throw new IOException("Bad version pattern: " + versionRef, e);
    @Nullable
    private final String fallbackVersion;
        return MavenArtifactReference.makeId(this);
    @NotNull
    }
            loadMetadata(monitor);
        sb.append(artifactId).append("-").append(version);
                default:
 * limitations under the License.
    private final List<String> snapshotVersions = new ArrayList<>();
                        }

import org.jkiss.utils.xml.XMLException;

        boolean predefinedVersion = versionRef.equals(MavenArtifactReference.VERSION_PATTERN_RELEASE)
            } else {
        MavenArtifactVersion version = getVersion(versionStr);
    @Nullable
        }
import java.util.regex.Matcher;
    {
 * Unless required by applicable law or agreed to in writing, software
            } catch (Exception e) {
                if (insideSnapshotVersion) {
    private String getBaseArtifactURL() {
            @Override
            }
        try (InputStream mdStream = WebUtils.openConnection(monitor, metadataPath, getRepository().getAuthInfo(), null).getInputStream()) {
            }
        return lastUpdate;
        loadMetadata(monitor, null);


    }
            versionSpec.contains(",");
            if (href.equals("..")) {
        }
            return getBaseArtifactURL() + versions.get(0) + "/" + getVersionFileName(
import org.jkiss.dbeaver.utils.VersionUtils;
        Pattern versionPattern = null;
                        }
    }
            VersionRange range = VersionRange.createFromVersionSpec(versionRef);
            } else {
                        currentSnapshotVersion = data;
                if ("snapshotVersion".equals(localName)) {
            }
                        break;
    public String getId() {
        return "";

    @NotNull
    public String getArtifactId() {
        return versionInfo;

    }

                versionInfo = range.getRestrictions().get(0).getLowerBound().toString();
        if (snapshotVersion) {
    private final String artifactId;
    private MavenArtifactVersion makeLocalVersion(
                    } else if ("lastUpdate".equals(lastTag)) {
                return VersionRange.createFromVersionSpec(versionSpec).containsVersion(new DefaultArtifactVersion(version));
                versionInfo = null;
                    if ("value".equals(lastTag)) {
        return sb.toString();
                            List<String> versions = new ArrayList<>(allVersions);
 * distributed under the License is distributed on an "AS IS" BASIS,
                    versionInfo = releaseVersion;
                }
                    invalid = false;
                if (allVersions.isEmpty()) {
                        if (snapshotVersions.isEmpty()) {
    public Collection<String> getAvailableVersions(DBRProgressMonitor monitor, String versionSpec) throws IOException {
                    versionInfo = latestVersion;
        if (versionSpec.startsWith("{") && versionSpec.endsWith("}")) {
import org.jkiss.utils.xml.SAXReader;
 *     http://www.apache.org/licenses/LICENSE-2.0
            } else if (!range.getRestrictions().isEmpty()) {
        String metadataPath = getBaseArtifactURL();
        }
        reader.parse(new SAXListener() {
                        try {
            try (InputStream dirStream = WebUtils.openConnection(monitor, getBaseArtifactURL(), getRepository().getAuthInfo(), null).getInputStream()) {
        if (FILE_JAR.equals(fileType) && !CommonUtils.isEmpty(classifier)) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
            if (versionSpec.startsWith("{") && versionSpec.endsWith("}")) {
            } else {

        return repository;

    @Nullable
