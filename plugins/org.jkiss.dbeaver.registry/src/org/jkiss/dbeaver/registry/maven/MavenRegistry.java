                        repoID,
                    if (CommonUtils.isNotEmpty(authPassword)) {
        return instance;
                    if (artifact != null) {
    private final List<String> ignoredArtifactVersions = new ArrayList<>();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            for (MavenRepository repository : owner.getActiveRepositories()) {

    }
        } catch (Exception e) {
                    }
            MAVEN_LOCAL_REPO_ID,

    }
                MavenRepository.UnknownRepository,
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
            if (artifact != null) {
    }
    public void saveConfiguration() throws DBException, IOException {
import org.jkiss.dbeaver.model.secret.DBSSecretController;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        if (notFoundVersion != null) {
import org.eclipse.core.runtime.Platform;
        }
                return;
        }
                    repo = new MavenRepository(
    private final Map<String, MavenArtifactVersion> notFoundArtifacts = new HashMap<>();
    public static final String MAVEN_LOCAL_REPO_ID = "local";
        MavenArtifactVersion artifact = findInRepositories(monitor, owner, ref);
        // Try all available repositories (without resolve)
        if (currentRepository != null) {
    private static MavenRegistry instance = null;
        return repositories;
                if (!repository.getScopes().isEmpty()) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                continue;
import org.jkiss.dbeaver.utils.GeneralUtils;
        xml.flush();
            if (repository != currentRepository) {
                            }

                ref.getArtifactId(),
                return artifact;
        xml.setBeautify(true);
 * limitations under the License.
/*
        DBSSecretController secrets = DBSSecretController.getGlobalSecretController();

            }
                    return artifact;
import org.jkiss.dbeaver.Log;
        return notFoundVersion;
        MavenRepository currentRepository = owner == null ? null : owner.getArtifact().getRepository();
                        xml.addAttribute(RegistryConstants.ATTR_SNAPSHOT, repository.isSnapshot());
                    String repoName = repoElement.getAttribute("name");
                            if (!CommonUtils.isEmpty(authInfo.getUserPassword())) {
    public void loadCustomRepositories() {
        XMLBuilder xml = new XMLBuilder(baos, GeneralUtils.UTF8_ENCODING);
            return notFoundVersion;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

                String authPassword = secrets.getPrivateSecretValue("maven/" + repoID + "/auth-password");
        notFoundArtifacts.remove(artifactReference.getId());

import java.nio.charset.StandardCharsets;
            }
                        return artifact;

        return false;
            instance = new MavenRegistry();
        try (var e1 = xml.startElement("maven")) {
        return null;
        }
        this.repositories.addAll(customRepositories);
            loadCustomRepositories();
            MAVEN_LOCAL_REPO_NAME,

import org.jkiss.code.NotNull;
public class MavenRegistry {
 *
                    repositories.add(repo);
        for (MavenRepository repository : repositories) {
    public static final String MAVEN_REPOSITORIES_CONFIG = "maven-repositories.xml";

        if (instance == null) {
        sortRepositories();
                                secrets.setPrivateSecretValue("maven/" + repository.getId() + "/auth-password", authInfo.getUserPassword());
        // Not found
    public MavenRepository findRepository(String id) {
                if (CommonUtils.isNotEmpty(authUser)) {
import org.w3c.dom.Document;
            MavenRepository.RepositoryType.LOCAL);
                ref.getClassifier(),
        String localRepoURL;

        notFoundVersion = MavenArtifactVersion.createInvalidVersion(
                } else if ("ignoreArtifactVersion".equals(ext.getName())) {
                if (repo == null) {

                ref.getFallbackVersion()),
                    List<String> scopes = new ArrayList<>();
            MavenArtifactVersion artifact = currentRepository.findArtifact(monitor, ref);
                            secrets.setPrivateSecretValue("maven/" + repository.getId() + "/auth-user", authInfo.getUserName());
                    if (repository.getType() != MavenRepository.RepositoryType.GLOBAL) {
                            }
                        }
                        MavenRepository.RepositoryType.CUSTOM);
        MavenArtifactVersion notFoundVersion = notFoundArtifacts.get(fullId);
                    }
import java.io.StringReader;
        if (artifact != null) {
                            try (final XMLBuilder.Element e3 = xml.startElement("scope")) {
    @Nullable
                        scopes.add(scopeElement.getAttribute("group"));
        repositories.sort(Comparator.comparingInt(MavenRepository::getOrder));
                        xml.addAttribute("url", repository.getUrl());
                        repoName,
        localRepository = new MavenRepository(
 * Licensed under the Apache License, Version 2.0 (the "License");
                if ("repository".equals(ext.getName())) {
            for (IConfigurationElement ext : extElements) {


                    String repoURL = repoElement.getAttribute("url");
                }
import java.io.ByteArrayOutputStream;
                        xml.addAttribute("name", repository.getName());
package org.jkiss.dbeaver.registry.maven;
    }
 */
                    MavenArtifactVersion artifact = repository.findArtifact(monitor, ref);
                    if (!repository.getScopes().contains(ref.getGroupId())) {
        for (String ver : ignoredArtifactVersions) {
    }
                repo.setOrder(CommonUtils.toInt(repoElement.getAttribute("order")));
    }

        }
                }
            if (repository.getId().equals(id)) {
            repository.resetArtifactCache(artifactReference);
    public void setCustomRepositories(List<MavenRepository> customRepositories) {
    private MavenRegistry() {
            String config = DBWorkbench.getPlatform().getConfigurationController().loadConfigurationFile(MAVEN_REPOSITORIES_CONFIG);
                    xml.addAttribute("order", repository.getOrder());
        notFoundArtifacts.clear();
            }

                    }

            MavenArtifactVersion artifact = localRepository.findArtifact(monitor, ref);
 * See the License for the specific language governing permissions and
                }
    private final List<MavenRepository> repositories = new ArrayList<>();
    // Cache for not found artifact ids. Avoid multiple remote metadata reading
    }
                        if (!CommonUtils.isEmpty(repository.getDescription())) {
    private static final Log log = Log.getLog(MavenRegistry.class);
                        final DBPAuthInfo authInfo = repository.getAuthInfo();

 *
            }
                        repo.getAuthInfo().setUserPassword(authPassword);
            if (CommonUtils.isEmpty(config)) {
            if (!repository.isEnabled()) {
        }
import org.jkiss.utils.xml.XMLBuilder;
                }
                String authUser = secrets.getPrivateSecretValue("maven/" + repoID + "/auth-user");
                    for (Element scopeElement : XMLUtils.getChildElementList(repoElement, "scope")) {
            log.error("Error parsing maven repositories configuration", e);
import org.jkiss.dbeaver.DBException;
        for (MavenRepository repository : repositories) {

            }

            }
                MavenRepository repo = findRepository(repoID);
    private void loadStandardRepositories() {
        // Add new and reorder
        // Create local repository
    }
        }
                iter.remove();
                ref.getGroupId(),
        try {
                            secrets.flushChanges();
                        repoURL,
                    repo.setIsSnapshot(snapshot);
import org.jkiss.dbeaver.registry.RegistryConstants;

    public synchronized static MavenRegistry getInstance() {
    public MavenArtifactVersion findArtifact(@NotNull DBRProgressMonitor monitor, @Nullable MavenArtifactVersion owner, @NotNull MavenArtifactReference ref) {
                    repo.setScopes(scopes);
            IConfigurationElement[] extElements = Platform.getExtensionRegistry().getConfigurationElementsFor(MavenRepository.EXTENSION_ID);
                }
            return artifact;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.runtime.encode.SimpleStringEncrypter;

            }
                repo.setEnabled(CommonUtils.toBoolean(repoElement.getAttribute("enabled")));
        DBWorkbench.getPlatform().getConfigurationController().saveConfigurationFile(
                }
        {
            MAVEN_REPOSITORIES_CONFIG,
    }

                if (CommonUtils.isEmpty(authUser)) {
        sortRepositories();
        } catch (IOException e) {
                    }
            }
            for (MavenRepository repository : repositories) {
 * Unless required by applicable law or agreed to in writing, software
                }
        }
    public static final String MAVEN_LOCAL_REPO_NAME = "Local Repository";
    }
            instance.init();
    public List<MavenRepository> getRepositories() {
import org.jkiss.utils.CommonUtils;
        }
    private void sortRepositories() {
                    xml.addAttribute("id", repository.getId());
                }
                    boolean snapshot = CommonUtils.toBoolean(repoElement.getAttribute("snapshot"));

                                xml.addAttribute("group", scope);
                try (final XMLBuilder.Element e2 = xml.startElement("repository")) {
            }
            if (iter.next().getType() == MavenRepository.RepositoryType.CUSTOM) {
            ref.getVersion());
                    // Check scope (group id)
import org.jkiss.code.Nullable;
                    ignoredArtifactVersions.add(ext.getAttribute("id"));
        if (owner != null) {
            }
                        }
 * You may obtain a copy of the License at
        }
        if (!DBWorkbench.isDistributed()) {
    }
        }

        }
            // Try context repositories
                    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    MavenRepository repository = new MavenRepository(ext);
        sortRepositories();


            localRepoURL,
                        authPassword = SimpleStringEncrypter.INSTANCE.decrypt(authPassword);
                    repositories.add(repository);
    boolean isVersionIgnored(String ref) {
                    authPassword = repoElement.getAttribute("auth-password");
        }
                        continue;
        }
        notFoundArtifacts.put(fullId, notFoundVersion);
        loadStandardRepositories();
    }
                if (repository != currentRepository) {
        return null;
            new MavenArtifact(
            for (Element repoElement : XMLUtils.getChildElementList(reposDocument.getDocumentElement(), "repository")) {

                    }
    public static final String MAVEN_LOCAL_REPO_FOLDER = "maven-local";

import org.jkiss.utils.xml.XMLUtils;
import java.util.*;
                return true;
                MavenArtifactVersion artifact = repository.findArtifact(monitor, ref);
                            xml.addAttribute("description", repository.getDescription());
    private MavenRepository localRepository;
                    repo.getAuthInfo().setUserName(authUser);

 *
        // Clear not-found cache
            localRepoURL = Platform.getInstallLocation().getURL().toString() + "/" + MAVEN_LOCAL_REPO_FOLDER;
        }
        // Load repositories info

        if (localRepository != currentRepository) {

        String fullId = ref.getId();
        log.warn("Maven artifact '" + ref + "' not found in any available repository.");

                        }
    private MavenArtifactVersion findInRepositories(@NotNull DBRProgressMonitor monitor, MavenArtifactVersion owner, @NotNull MavenArtifactReference ref) {
                return artifact;

import org.w3c.dom.Element;
    }
                return repository;
            localRepoURL = Platform.getInstallLocation().getDataArea(MAVEN_LOCAL_REPO_FOLDER).toString();
        localRepository.resetArtifactCache(artifactReference);
                        for (String scope : repository.getScopes()) {
                DBSSecretController secrets = DBSSecretController.getGlobalSecretController();
        for (MavenRepository repository : repositories) {
    @NotNull
}
                String repoID = repoElement.getAttribute("id");
                        if (!CommonUtils.isEmpty(authInfo.getUserName())) {
    public void resetArtifactInfo(MavenArtifactReference artifactReference) {
            // Custom Maven repos are not used in distributed apps
            }
            if (artifact != null) {

            }
    @Nullable
    private void init() {
    }
        // Remove old custom repos
import java.io.IOException;
                if (artifact != null) {
        }
            final Document reposDocument = XMLUtils.parseDocument(new StringReader(config));
                    authUser = repoElement.getAttribute("auth-user");

import org.jkiss.dbeaver.model.connection.DBPAuthInfo;
        try {
import org.eclipse.core.runtime.IConfigurationElement;
                    xml.addAttribute("enabled", repository.isEnabled());
                // Backward compatibility
            if (ref.startsWith(ver)) {
 * you may not use this file except in compliance with the License.
                    if (!CommonUtils.isEmpty(authPassword)) {
        for (Iterator<MavenRepository> iter = this.repositories.iterator(); iter.hasNext(); ) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            baos.toString(StandardCharsets.UTF_8));
