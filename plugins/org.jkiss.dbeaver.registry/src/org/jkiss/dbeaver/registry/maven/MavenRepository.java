                Files.createDirectories(homeFolder);
import java.net.URL;
    public String getDescription() {
}
        this.name = name;

    }
    private String name;

            log.debug("Maven artifact '" + ref + "' not found in repository '" + this + "': " + e.getMessage());
    }
        MavenArtifact artifact = cachedArtifacts.get(ref.getId());
            default:
import org.jkiss.dbeaver.runtime.DBWorkbench;
        this.id = id;
                scopes.add(group);

 * limitations under the License.
    }
 *
        return enabled;
        this.url = source.url;
public class MavenRepository
    }
        this.order = order;
        this.isSnapshot = CommonUtils.toBoolean(config.getAttribute(RegistryConstants.ATTR_SNAPSHOT));
    }
        } else {
        return url;

    }
    public MavenRepository(MavenRepository source) {
 * you may not use this file except in compliance with the License.
    public String toString() {
        this.id = source.id;
        this.order = CommonUtils.toInt(config.getAttribute(RegistryConstants.ATTR_ORDER));
    }
    public void setEnabled(boolean enabled) {
        this.enabled = source.enabled;
        if (artifact == null) {

        }
            }
    @NotNull
    }
    public static final MavenRepository UnknownRepository = new MavenRepository("unknown", "unknown", "https://repo1.maven.org/maven2/", RepositoryType.GLOBAL);
    }
                log.warn("Can't create maven repository '" + name + "' cache folder '" + homeFolder + "'", e);

        cachedArtifacts.remove(artifactReference.getId());
        return order;
        return scopes;
    public MavenRepository(IConfigurationElement config)
                cachedArtifacts.put(ref.getId(), artifact);
    public void setScopes(List<String> scopes) {
        CUSTOM,     // User-defined repository
    }
        this.authInfo.setUserPassword(source.authInfo.getUserPassword());
        switch (type) {
    @Override
        if (type == RepositoryType.LOCAL || type == RepositoryType.CUSTOM) {
        }
        this.type = RepositoryType.GLOBAL;

import org.jkiss.dbeaver.registry.RegistryConstants;


                break;
        if (!url.endsWith("/")) url += "/";
    public synchronized MavenArtifactVersion findArtifact(@NotNull DBRProgressMonitor monitor, @NotNull MavenArtifactReference ref) {
        this.url = urlString;
        if (!Files.exists(homeFolder)) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        this.isSnapshot = source.isSnapshot;

 * Maven repository manager.
                    extPath = ".external/" + repoUrl.getHost() + "/" + repoUrl.getPath();
        this.authInfo.setUserName(source.authInfo.getUserName());
        this.url = url;
    private static final Log log = Log.getLog(MavenRepository.class);

        return homeFolder;
import java.util.Map;
        boolean newArtifact = false;
    public List<String> getScopes() {
        this.description = source.description;
        return description;
    }
                }
            customDriversHome = DriverDescriptor.getExternalDriversStorageFolder();


    }
    @Nullable
    }


            case EXTERNAL:
                    URL repoUrl = new URL(this.url);
        return id;
    }
        Path homeFolder = customDriversHome.resolve("maven/" + extPath);
        }
    public String getUrl() {
    }
    @NotNull
import org.jkiss.code.NotNull;
        try {
    }
        this.name = CommonUtils.toString(config.getAttribute(RegistryConstants.ATTR_NAME), this.id);
    public MavenRepository(String id, String name, String url, RepositoryType type) {
import org.jkiss.utils.CommonUtils;
        EXTERNAL    // POM-defined repository
        this.type = type;

import java.util.ArrayList;
            MavenArtifactVersion version = artifact.resolveVersion(monitor, ref.getVersion(), ref.isResolveOptionalDependencies());
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
    private boolean isSnapshot = false;
        for (IConfigurationElement scope : config.getChildren("scope")) {

import java.nio.file.Files;
    public String getId() {
    }

 * Unless required by applicable law or agreed to in writing, software
    public int getOrder() {
        } catch (IOException e) {
        return type;
/**
import java.net.MalformedURLException;
        this.id = config.getAttribute(RegistryConstants.ATTR_ID);
    }
 *
    private int order;
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
import org.jkiss.dbeaver.model.connection.DBPAuthInfo;
    public enum RepositoryType {
        }
 */
    Path getLocalCacheDir()

        this.url = url;
        this.name = CommonUtils.isEmpty(name) ? id : name;
        String extPath;

    private final DBPAuthInfo authInfo = new DBPAuthInfo();
                break;
        return name;
    public RepositoryType getType() {
    public void setIsSnapshot(boolean snapshot) {

    private String description;

import org.jkiss.dbeaver.Log;
        Path customDriversHome;
        this.scopes.addAll(source.scopes);

    public DBPAuthInfo getAuthInfo() {
/*
        this.enabled = enabled;
 * DBeaver - Universal Database Manager
    }

        return isSnapshot;
            newArtifact = true;

                    extPath = ".external/" + id;
        }
        this.scopes.clear();
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.mavenRepository";
        this.scopes.addAll(scopes);


        //File homeFolder = new File(DBeaverActivator.getInstance().getStateLocation().toFile(), "maven/" + extPath);
        if (DBWorkbench.getPlatform().getApplication().isMultiuser() && !DBWorkbench.getPlatform().getApplication().isDistributed()) {


import org.eclipse.core.runtime.IConfigurationElement;

        this.description = description;
    private final List<String> scopes = new ArrayList<>();
        return url.startsWith("https");
                extPath = id;
        }
    public void setDescription(String description) {
        return url;
import java.util.LinkedHashMap;
            try {
    public boolean isSnapshot() {
import java.io.IOException;


            } catch (IOException e) {
                try {

            final String group = scope.getAttribute("group");
        this.id = id;
            }
        this.name = source.name;
{
import java.util.List;
    private boolean enabled = true;
    private final RepositoryType type;
    public static final String ATTR_ID = "id";
package org.jkiss.dbeaver.registry.maven;
        return authInfo;
    {
        GLOBAL,     // Globally defined repositories (came from plugin.xml)
    }
    public boolean isEnabled() {
    private String url;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public boolean isSecureRepository() {
        this.type = source.type;
import org.jkiss.code.Nullable;
    public static final String ATTR_NAME = "name";
        isSnapshot = snapshot;
            if (newArtifact) {
            if (!CommonUtils.isEmpty(group)) {
 *
        LOCAL,      // Local (deployed locally) repository. It is singleton
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (!urlString.endsWith("/")) urlString += "/";
    synchronized void resetArtifactCache(@NotNull MavenArtifactReference artifactReference) {
    public String getName() {
 * You may obtain a copy of the License at
                } catch (MalformedURLException e) {

            return version;
    }
            // Generally it is ok. Artifact not present in this repository
        this.order = source.order;

    {
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
            return true;
    public void setOrder(int order) {
    }
    }
 * See the License for the specific language governing permissions and
        String urlString = config.getAttribute(RegistryConstants.ATTR_URL);
    }
            customDriversHome = DriverDescriptor.getWorkspaceDriversStorageFolder();

 *     http://www.apache.org/licenses/LICENSE-2.0
    }

    private String id;
    }
    public void setUrl(String url) {
    public void setId(String id) {
            artifact = new MavenArtifact(this, ref.getGroupId(), ref.getArtifactId(), ref.getClassifier(), ref.getFallbackVersion());
    }
    public void setName(String name) {
import java.nio.file.Path;
    private final transient Map<String, MavenArtifact> cachedArtifacts = new LinkedHashMap<>();

    // Copy constructor
            return null;
