    @NotNull
                ref = new MavenArtifactReference(
        }
    private MavenArtifactReference reference;
                    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
    @NotNull
    public DBIcon getIcon() {
    @Override
    public void setIgnoreDependencies(boolean ignoreDependencies) {

    }
        if (artifactVersion != null) {
 * Unless required by applicable law or agreed to in writing, software
    @Nullable
            throw new IOException(String.format("Maven artifact %s %s is not found", path, versionMessageError));
        return reference;
            }
    public boolean isIgnoreDependencies() {



    }

            MavenArtifactReference ref = reference;
        if (path.endsWith("]")) {
    private String preferredVersion;


        ignoreDependencies = CommonUtils.toBoolean(config.getAttribute("ignore-dependencies"));
        if (platformFile != null) {
    public String getDescription() {
        return reference.getId();
        MavenArtifactVersion localVersion = resolveLocalVersion(monitor, forceUpdate);
            String versionMessageError = preferredVersion != null ? String.format(":%s", preferredVersion) : "";
    }
        // Nothing fits - just return plain url
public class DriverLibraryMavenArtifact extends DriverLibraryAbstract {
        return this.localVersion;

    @NotNull
    @Nullable
                return true;

    public boolean isSecureDownload(@NotNull DBRProgressMonitor monitor) {
        if (loadOptionalDependencies) {
import java.nio.file.Path;
    public boolean isInvalidLibrary() {

    @Override
 *
        this.reference = new MavenArtifactReference(path);
    }
                }
            log.warn("Error resolving artifact version", e);
                    reference.getFallbackVersion(),
     */
        if (localVersion.getArtifact().getRepository().getType() == MavenRepository.RepositoryType.LOCAL) {
    public DriverLibraryMavenArtifact(
            if (divPos != -1) {
    }
        }
     * If true then library version was forcibly set by user. Do not upgrade it automatically.

        MavenArtifactVersion localVersion = getArtifactVersion(monitor);
        super(driver, type, path);
    }
        } catch (IOException e) {
        this.path = PATH_PREFIX + reference.toString();
        if (forceUpdate) {
        return null;
        }
    public String getPreferredVersion() {
        return ignoreDependencies;
    public DriverLibraryMavenArtifact(@NotNull DriverDescriptor driver, @NotNull IConfigurationElement config) {
import org.jkiss.dbeaver.Log;
                            new DriverLibraryMavenDependency(
            Collection<String> availableVersions = artifactVersion.getArtifact().getAvailableVersions(monitor, reference.getVersion());

    }
        this.preferredVersion = version;
                }
    /**
    @Override
import org.jkiss.code.Nullable;
            }

            return localVersion.getCacheFile();
        this.originalPreferredVersion = this.preferredVersion;
    public void setLoadOptionalDependencies(boolean loadOptionalDependencies) {
    public boolean isLoadOptionalDependencies() {
    @Override
        return new DriverLibraryMavenArtifact(driver, this);
        }

        }
                }
        return version;
        this.preferredVersion = preferredVersion;
/**
        return reference.toString();
 * You may obtain a copy of the License at
        if (isInvalidLibrary()) {
    public void setPreferredVersion(@Nullable String version) {
        return forcedVersion;
    private static final Log log = Log.getLog(DriverLibraryMavenArtifact.class);
        initArtifactReference(preferredVersion);
    public DBPDriverLibrary copyLibrary(@NotNull DriverDescriptor driverDescriptor) {
                                dependency


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


    public void resetVersion() {
import java.io.IOException;
 */
    }
        MavenArtifactVersion localVersion = getArtifactVersion(monitor);
                    ref.setResolveOptionalDependencies(true);
        }
            return localVersion.getVersion();
    @Override
    @Override
    }
        }
        super(driver, config);
    protected MavenArtifactVersion getArtifactVersion(DBRProgressMonitor monitor) {
                        continue;
        }
    }
            return localVersion.getArtifact().getRepository().isSecureRepository();
import org.jkiss.dbeaver.model.connection.DBPDriverLibrary;
        List<DriverLibraryMavenDependency> dependencies = new ArrayList<>();
    public void setReference(MavenArtifactReference reference) {
        this.localVersion = null;
        return false;
            MavenRegistry.getInstance().resetArtifactInfo(reference);
    ) {

    public String getId() {
        this.loadOptionalDependencies = loadOptionalDependencies;
    @NotNull
                    preferredVersion = version;
        this.preferredVersion = originalPreferredVersion;

            }
    }
    @Override
    throws IOException, InterruptedException {
    @NotNull



                        dependencies.add(
        return reference.getVersion();
            this.reference.setResolveOptionalDependencies(true);
    }
 *
                    reference.getArtifactId(),
            return dependencies;
            return preferredVersion;
    }
    }
        if (version == null) {
        return DBIcon.APACHE;

    }
        if (this.localVersion == null) {
                                this,
        }

            return platformFile;
            List<MavenArtifactDependency> artifactDeps = localVersion.getDependencies();
    public String getVersion() {
                    }
 * DBeaver - Universal Database Manager
            int divPos = path.lastIndexOf('[');
    public void setForcedVersion(boolean forcedVersion) {
        MavenArtifactVersion localVersion = resolveLocalVersion(monitor, false);

        this.originalPreferredVersion = this.preferredVersion;
    @Override
    }

        MavenArtifactVersion artifactVersion = getArtifactVersion(monitor);
            // Relative file does not exist - use plain one
    @Override
                return availableVersions;
            if (localVersion == null) {
package org.jkiss.dbeaver.registry.driver;

        }
        return localVersion == null || localVersion.isInvalidVersion();
    public String getExternalURL(DBRProgressMonitor monitor) {
        this.loadOptionalDependencies = copyFrom.loadOptionalDependencies;
        return dependencies;
    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                path = path.substring(0, divPos);
import java.util.ArrayList;

            this.localVersion = MavenRegistry.getInstance().findArtifact(monitor, null, ref);
import java.util.Collections;
    private boolean ignoreDependencies;
        return null;

                                depArtifact,
        // Try to get local file
                    reference.getGroupId(),
    private void initArtifactReference(String preferredVersion) {
            return localVersion.getArtifact().getRepository().getAuthInfo();
    public boolean isForcedVersion() {
                    } else {
        return null;
        @NotNull DriverDescriptor driver,
    }
        super.downloadLibraryFile(monitor, forceUpdate, taskName);
        }
            if (preferredVersion != null) {
        return true;
        MavenArtifactVersion version = getArtifactVersion(monitor);
    @Nullable
        Path platformFile = detectLocalFile();
    @Override

        if (localVersion != null) {
    }
    public void downloadLibraryFile(@NotNull DBRProgressMonitor monitor, boolean forceUpdate, String taskName)
 * See the License for the specific language governing permissions and
        try {
            }
        loadOptionalDependencies = CommonUtils.toBoolean(config.getAttribute("load-optional-dependencies"));
                if (preferredVersion == null) {
    }
        return Collections.emptyList();


            return localVersion.getExternalURL();
            if (availableVersions != null) {
    public Collection<String> getAvailableVersions(@NotNull DBRProgressMonitor monitor) throws IOException {
 * distributed under the License is distributed on an "AS IS" BASIS,
                );

    }
    }
        if (ignoreDependencies) {
    public String getDisplayName() {
                            ));
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.utils.CommonUtils;
                    if (isDependencyExcluded(monitor, dependency)) {
                        dependency.setBroken(true);
        }

            MavenArtifactVersion localVersion = resolveLocalVersion(monitor, false);
    protected boolean isDependencyExcluded(DBRProgressMonitor monitor, MavenArtifactDependency dependency) {
    private Path detectLocalFile() {
    }
        }
    }
            return localVersion.getDescription();
        this.ignoreDependencies = ignoreDependencies;
    }
 * you may not use this file except in compliance with the License.
        this.reference = copyFrom.reference;
        initArtifactReference(null);
        this.localVersion = null;
    }
/*

    public Path getLocalFile() {
        this.reference = reference;
    }
 * DriverLibraryDescriptor
    @Override
        if (localVersion != null) {
    public Collection<? extends DBPDriverLibrary> getDependencies(@NotNull DBRProgressMonitor monitor) throws IOException {
            // No need to download local artifacts
    public static final String PATH_PREFIX = "maven:/";
        if (preferredVersion != null && !preferredVersion.isEmpty()) {
import org.jkiss.dbeaver.model.connection.DBPAuthInfo;

    protected DBPAuthInfo getAuthInfo(DBRProgressMonitor monitor) {
                    if (depArtifact != null) {

                String version = path.substring(divPos + 1, path.length() - 1);
        }
import org.jkiss.code.NotNull;

        this.originalPreferredVersion = copyFrom.originalPreferredVersion;
        super(driver, copyFrom);
                if (loadOptionalDependencies) {
import java.util.List;
        MavenRegistry.getInstance().resetArtifactInfo(reference);
    @Override
    public boolean isDownloadable() {
        this.localVersion = copyFrom.localVersion;


        this.ignoreDependencies = copyFrom.ignoreDependencies;
        @NotNull String path,
        if (localVersion != null) {
        }
            return;
    protected MavenArtifactVersion resolveLocalVersion(DBRProgressMonitor monitor, boolean forceUpdate) throws IOException {
    @Override
        return null;

import org.eclipse.core.runtime.IConfigurationElement;
        }
            return true;
 * Licensed under the Apache License, Version 2.0 (the "License");
                    preferredVersion
        this.preferredVersion = copyFrom.preferredVersion;
                    MavenArtifactVersion depArtifact = MavenRegistry.getInstance().findArtifact(monitor, localVersion, dependency);
    }
        if (localVersion != null) {
        this.forcedVersion = forcedVersion;
import org.jkiss.dbeaver.registry.maven.*;
    }

    }
        }

import org.jkiss.dbeaver.model.DBIcon;
    }
import java.util.Collection;
    private boolean loadOptionalDependencies;
    private boolean forcedVersion;
 *
    @Nullable
    @Nullable
    }
    protected MavenArtifactVersion localVersion;
 */
                for (MavenArtifactDependency dependency : artifactDeps) {
        }
        @NotNull FileType type,
            }


                    reference.getClassifier(),
        @Nullable String preferredVersion
        if (localVersion != null) {
            if (!CommonUtils.isEmpty(artifactDeps)) {
            throw new IOException("Maven artifact '" + getDisplayName() + "' cannot be resolved in external repositores");
        this.localVersion = null;
    private final String originalPreferredVersion;

}
        return null;
    }
    }
    }
        return preferredVersion;
    public MavenArtifactReference getReference() {
        assert driver != null;
        if (localVersion != null) {
    private DriverLibraryMavenArtifact(@NotNull DriverDescriptor driver, @NotNull DriverLibraryMavenArtifact copyFrom) {
        return loadOptionalDependencies;
