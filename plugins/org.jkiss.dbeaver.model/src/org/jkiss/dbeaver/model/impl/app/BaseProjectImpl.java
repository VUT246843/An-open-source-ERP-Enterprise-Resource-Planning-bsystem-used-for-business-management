    }
            fileSystemManager = null;
        }
                                        resProperties.put(propName, propValue);

                }
    private static final String EMPTY_PROJECT_TEMPLATE = """
                    jsonWriter.endObject();
                resourceProperties.put(newResourcePath, resProps);
                // Run it directly in distributed UI (because it may trigger other conflicting
            dataSourceRegistry = null;

    public UUID getProjectID() {
 *
        synchronized (resourcesSync) {
                        }
        }
                    return;
        return metadataFolder;
import org.jkiss.dbeaver.utils.ContentUtils;
    @Nullable
                    jsonWriter.flush();
                    }
    public void setResourceProperties(@NotNull String resourcePath, @NotNull Map<String, Object> newProps) {
        if (isInMemory()) {
                resourceProperties = new TreeMap<>();
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
import java.nio.file.Files;
            }
        resourcePath = CommonUtils.normalizeResourcePath(resourcePath);
        loadMetadata();
                }
    }
            if (resourceProperties == null) {
    // Misc
                try (Reader mdReader = Files.newBufferedReader(mdFile, StandardCharsets.UTF_8)) {
        return new SecretKeySpec(LOCAL_KEY_CACHE, DefaultValueEncryptor.KEY_ALGORITHM);
    public static final String PROP_PROJECT_ID = "id";
    @Override
                    if (resProps.isEmpty()) {

    @Override


import java.io.Reader;
                log.error(e.getMessage(), e);
    @Override
            }
    protected volatile Map<String, Map<String, Object>> resourceProperties;
            }
            if (isInMemory()) {
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
        loadMetadata();
    private boolean inMemory;
    }
                        }
                    properties = JSONUtils.parseMap(METADATA_GSON, settingsReader);
        return getAbsolutePath().resolve(METADATA_FOLDER);
        }
    public String getRuntimeProperty(@NotNull String key) {
                }
                Path mdFile = getMetadataFolder(true).resolve(METADATA_STORAGE_FILE);
        LEGACY,     // Old format (before 6.1 version
        ProjectSyncJob() {
                                    }
        if (Files.exists(projectFile)) {
    ////////////////////////////////////////////////////////
                            jsonWriter.name(propEntry.getKey());
                }
    }
    private ProjectSyncJob metadataSyncJob;
import java.util.concurrent.ConcurrentHashMap;
            } catch (IOException e) {
                // Parse metadata
                                jsonReader.endObject();

        ensureOpen();
        return runtimeProperties.get(key);
            Runnable registryOpener = () -> {
                    }
                if (start != -1 && end != -1) {
    @Override
    public static final String PROP_PROJECT_NAME = "name";
import org.jkiss.dbeaver.utils.RuntimeUtils;
        return null;
    private void saveProperties() {

        }
                if (resProps.remove(propName) == null) {
    public boolean isPrivateProject() {
        synchronized (resourcesSync) {
    }
    public static final Gson METADATA_GSON = new GsonBuilder()
    }
        }

            return projectDescription.toString();
    }
import org.jkiss.dbeaver.model.secret.DBSSecretSubject;
    // Realm
    public BaseProjectImpl(@NotNull DBPWorkspace workspace, @Nullable SMSessionContext sessionContext) {
        Path settingsFile = getMetadataFolder(true).resolve(SETTINGS_STORAGE_FILE);
        this.inMemory = inMemory;


        this.sessionContext = sessionContext == null ? workspace.getAuthContext() : sessionContext;
    public void setRuntimeProperty(@NotNull String key, String value) {
        <projects>
import org.jkiss.dbeaver.model.fs.DBFFileSystemManager;
        MODERN,     // 6.1+ version
        }
    private final SMSessionContext sessionContext;
                if (fileSystemManager == null) {

        return fileSystemManager;
            Map<String, Object> resProps = resourceProperties.remove(oldResourcePath);
    public Map<String, Object> getResourceProperties(@NotNull String resourcePath) {

    public void refreshProject(DBRProgressMonitor monitor) {
        return hadProperties;
        return true;

            throw new IllegalStateException("Can't obtain secret key");
    protected SecretKey getLocalSecretKey() {
                                    String resourceName = jsonReader.nextName();
            }
        Path projectFile = projectPath.resolve(PROJECT_FILE);


        }
    public void dispose() {
        .create();
        if (description != null) {
    }
                            }
                    }
    private volatile ProjectFormat format = ProjectFormat.UNKNOWN;
        <natures>
        return null;
                            } else if (value instanceof Number) {
                                jsonWriter.value((Boolean) value);
            if (resProps == null) {
    }
                    return Status.OK_STATUS;
    @NotNull
    @NotNull
                resourceProperties.put(resourcePath, resProps);
        }
        Files.writeString(projectFile, EMPTY_PROJECT_TEMPLATE.replace("${project-name}", name));
        }
        runtimeProperties.put(key, value);
        return name.startsWith(".");

        <buildSpec>
    }
                return Files.size(path) > 0;
                for (var property : properties.entrySet()) {
        boolean hadProperties;
import org.jkiss.dbeaver.model.app.DBPWorkspace;
 * you may not use this file except in compliance with the License.
            properties.put(PROP_PROJECT_NAME, newName);

 * DBeaver - Universal Database Manager
                        return;
        synchronized (resourcesSync) {
    private static final Log log = Log.getLog(BaseProjectImpl.class);
        }

    }
        if (projectID == null) {
        return format;

            hadProperties = resourceProperties.remove(resourcePath) != null;
                if (CommonUtils.isEmpty(resourceProperties) && !Files.exists(mdFile)) {
    @Nullable


    protected final Object resourcesSync = new Object();
    public Object getResourceProperty(@NotNull String resourcePath, @NotNull String propName) {
                            } else {
        .serializeNulls()
            }
    public DBPDataSourceRegistry getDataSourceRegistry() {
    }
import org.jkiss.dbeaver.Log;
        <comment></comment>
    }
    public void setResourceProperty(@NotNull String resourcePath, @NotNull String propName, @Nullable Object propValue) {
            Map<String, Object> resProps = resourceProperties.get(resourcePath);
            return resourceProperties.get(resourcePath);
                                    while (jsonReader.hasNext()) {
                } catch (Throwable e) {
            if (DBWorkbench.isDistributed() || DBWorkbench.getPlatform().getApplication().isMultiuser()) {
                        jsonWriter.endObject();
    }

                        for (var propEntry : resProps.entrySet()) {
    @NotNull
            if (!Files.exists(configFolder)) {
    @Nullable

        UNKNOWN,    // Project is not open or corrupted
    public void setProjectProperty(@NotNull String propName, @Nullable Object propValue) {

            log.error("Error writing project '" + getName() + "' setting to "  + settingsFile.toAbsolutePath(), e);
    @Override
    public boolean isRegistryLoaded() {

        }
                }
                        while (jsonReader.hasNext()) {
        if (projectDescription != null) {
import org.jkiss.code.NotNull;
                                    Map<String, Object> resProperties = new HashMap<>();
        }
        return dataSourceRegistry;
            // if this is a web app, we want to wait the sync job
            }
        synchronized (resourcesSync) {
    @Override
            return resources.toArray(String[]::new);
    // By default does nothing
                    jsonWriter.endObject();
                Object oldValue = resProps.put(propName, propValue);
            if (content.contains("<name>") && content.contains("</name>")) {
     */
    public void updateProject(@Nullable String newName, @Nullable String description) throws DBException {
        if (isInMemory() || DBWorkbench.isDistributed()) {
            saveProperties();

     * @param name project name
    private static final byte[] LOCAL_KEY_CACHE = new byte[] { -70, -69, 74, -97, 119, 74, -72, 83, -55, 108, 45, 101, 61, -2, 84, 74 };

        synchronized (this) {
            }
        }
                    try (JsonReader jsonReader = METADATA_GSON.newJsonReader(mdReader)) {
                if (propValue == null) {
            }
    }
import org.eclipse.core.runtime.IStatus;
                    final String propName = property.getKey();
    @NotNull
    }

        }
    // Called by model itself when some project-dependent entities change their state
 * limitations under the License.
                                }
                            } else if (value instanceof Boolean) {

            try {
import com.google.gson.Gson;
        if (key == null) {
                try (Writer mdWriter = Files.newBufferedWriter(mdFile, StandardCharsets.UTF_8);
                projectID = UUID.randomUUID();

            if (CommonUtils.isEmpty(idStr)) {
    }
    public static final String PROP_PROJECT_DESCRIPTION = "description";
    }
                }
        resourcePath = CommonUtils.normalizeResourcePath(resourcePath);
    protected void flushMetadata() {
    private volatile DBFFileSystemManager fileSystemManager;
    ////////////////////////////////////////////////////////
                        break;
    @Override
        return true;
    }
import java.nio.charset.StandardCharsets;
    public static boolean isHiddenProjectName(@NotNull String name) {

            } catch (IOException e) {
    private volatile Map<String, String> runtimeProperties = new ConcurrentHashMap<>();
            if (metadataSyncJob == null) {
    public String toString() {
        if (create && !Files.exists(metadataFolder)) {
                    }
        }
    @Override
                        ensureOpen();
            } else {


        loadMetadata();
            }
        resourcePath = CommonUtils.normalizeResourcePath(resourcePath);
        }
            Path settingsFile = getMetadataPath().resolve(SETTINGS_STORAGE_FILE);
        } catch (Exception e) {
    }
    // Properties
        return "project/" + getId();
        loadMetadata();
import org.jkiss.dbeaver.model.data.json.JSONUtils;
        newResourcePath = CommonUtils.normalizeResourcePath(newResourcePath);
    @NotNull
            }
    @Override
    public DBSValueEncryptor getValueEncryptor() throws DBException {
    public Path getMetadataFolder(boolean create) {
                int start = content.indexOf("<name>");
    @Override
                        jsonReader.beginObject();
                }
    }
            }

            synchronized (this) {
            saveProperties();


    @Override
            loadProperties();
                }

                registryOpener.run();
        }
        }
        Object projectName = this.getProjectProperty(PROP_PROJECT_NAME);
    @Override
    }
    public boolean resetResourceProperties(@NotNull String resourcePath) {
    public void setInMemory(boolean inMemory) {
    }


        </projectDescription>""";
    }
    }
    private class ProjectSyncJob extends AbstractJob {

    public void updateProjectNature() {

                    }
    protected void loadProperties() {
    @Override
    protected void setFormat(ProjectFormat format) {
                            if (value == null) {
            return properties.get(propName);
            return projectName.toString();
            }
    @Override
                                        Object propValue = switch (jsonReader.peek()) {
    public boolean isInMemory() {
        <name>${project-name}</name>
                                    jsonReader.endObject();
                    jsonWriter.name("resources");

    // Secure storage
            }
                    return;
            if (propValue == null) {
        resourcePath = CommonUtils.normalizeResourcePath(resourcePath);
    }
                boolean containsRequiredProperties = true;
            }
package org.jkiss.dbeaver.model.impl.app;
                    return;
    }
     * Replace project name in .project file
            Files.writeString(settingsFile, settingsString);
            fileSystemManager.close();
    public ProjectFormat getFormat() {
        synchronized (metadataSync) {
            } else {

        }
    public String getDisplayName() {
        if (properties != null) {
            this.resourceProperties.put(resourcePath, new LinkedHashMap<>(newProps));
    @Override
import org.jkiss.code.Nullable;

    }
        SecretKey key = getLocalSecretKey();
    }
    }
        }
    }
            for (var resource : resourceProperties.entrySet()) {

                log.error("Error creating metadata folder" + metadataFolder, e);
 * Unless required by applicable law or agreed to in writing, software
        Map<String, Object> properties = new LinkedHashMap<>();
    public boolean supportsRealmFeature(@NotNull String feature) {
        if (hadProperties) {

                } catch (Throwable e) {
                projectID = UUID.randomUUID();
        synchronized (resourcesSync) {
        @NotNull
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        String settingsString = METADATA_GSON.toJson(properties);
            return;
        }
        if (fileSystemManager == null) {
    }

    @NotNull
        loadMetadata();
        oldResourcePath = CommonUtils.normalizeResourcePath(oldResourcePath);

        }
                            if ("resources".equals(topName)) {

            }
    }

                Map<String, Map<String, Object>> mdCache = new TreeMap<>();
import com.google.gson.Strictness;


    }
            }


                    if (!props.containsKey(propName) || !Objects.equals(props.get(propName), propValue)) {
        </buildSpec>
import com.google.gson.GsonBuilder;
                metadataSyncJob.schedule(100);
            setName("Project '" + BaseProjectImpl.this.getName() + "' sync job");
                    synchronized (metadataSync) {
    @NotNull

                }
            String content = Files.readString(projectFile);
                                            case NUMBER -> jsonReader.nextDouble();
            dataSourceRegistry.dispose();
                        jsonReader.endObject();
            if (propValue == null) {
            ContentUtils.makeFileBackup(getMetadataFolder(false).resolve(METADATA_STORAGE_FILE));
            flushMetadata();
import com.google.gson.stream.JsonReader;


    public enum ProjectFormat {
    @NotNull
        }
            this.properties.putAll(properties);
                    final Object propValue = property.getValue();
                    fileSystemManager = new DBFFileSystemManager(this);
        return true;
    public static final String PROJECT_FILE = ".project";
        if (fileSystemManager != null) {
        this.workspace = workspace;
    public DBPWorkspace getWorkspace() {
    }
            } else {
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
            try {
                                        String propName = jsonReader.nextName();
                    jsonWriter.beginObject();
                int end = content.indexOf("</name>", start);
                // Parse metadata
        if (dataSourceRegistry == null) {
                properties.remove(propName);
    public String getDescription() {
import javax.crypto.SecretKey;
                        if (dataSourceRegistry == null) {
        return fileNotEmpty;
            Path mdFile = getMetadataPath().resolve(METADATA_STORAGE_FILE);
    @Override

            if (resourceProperties != null) {
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
            if (resProps != null) {
    }
    @NotNull
                resProps = new LinkedHashMap<>();
    @Override

            if (fileExistsAndNonEmpty(mdFile)) {
                final Map<String, Object> props = resource.getValue();
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
        }
 * You may obtain a copy of the License at
                                jsonWriter.nullValue();
    private final DBPWorkspace workspace;
                try (Reader settingsReader = Files.newBufferedReader(settingsFile, StandardCharsets.UTF_8)) {

import org.jkiss.dbeaver.model.runtime.AbstractJob;
            properties = new LinkedHashMap<>();
                        Map<String, Object> resProps = resEntry.getValue();
import org.jkiss.utils.CommonUtils;

            }
        if (projectName != null) {
                }
    public DBNModel getNavigatorModel() {
    @Override

            }
import org.jkiss.dbeaver.model.secret.DBSValueEncryptor;
                        containsRequiredProperties = false;
    protected void setResourceProperties(Map<String, Map<String, Object>> resourceProperties) {
                Files.createDirectories(metadataFolder);
        }
        return getName();
        return getName();
            }
            loadProperties();
    // E.g. when we save/load datasource registry
            if (DBWorkbench.getPlatform().getApplication().isMultiuser()) {
            if (fileExistsAndNonEmpty(settingsFile)) {
                if (containsRequiredProperties) {
                        resourceProperties.remove(resourcePath);
        }
                                            case NULL -> null;
        }
                                jsonReader.beginObject();


    private volatile Map<String, Object> properties;
    }
                                        };
    @NotNull

    public boolean hasRealmPermission(@NotNull String permission) {
import org.eclipse.core.runtime.Status;
    
    @NotNull
                if (dataSourceRegistry == null) {
import java.nio.file.Path;
        <projectDescription>
    }
            final List<String> resources = new ArrayList<>();
                            String topName = jsonReader.nextName();
                Files.createDirectories(configFolder);

    @Nullable

        try {
    @Nullable
                } catch (IOException e) {
            };
    @Override
    ////////////////////////////////////////////////////////
        setProjectProperties(properties);
            Path configFolder = settingsFile.getParent();

                metadataSyncJob.run(new VoidProgressMonitor());
    @Override
        @Override
    public String[] findResources(@NotNull Map<String, ?> properties) throws DBException {
    public static void updateProjectFile(@NotNull Path projectPath, @NotNull String name) throws IOException {
        if (isInMemory() || DBWorkbench.isDistributed()) {
    }
        if (inMemory) {
        </natures>
            properties.put(PROP_PROJECT_DESCRIPTION, CommonUtils.notEmpty(description));

                RuntimeUtils.runTask(monitor -> registryOpener.run(), "Load registry", 0);
                     JsonWriter jsonWriter = METADATA_GSON.newJsonWriter(mdWriter)
        synchronized (resourcesSync) {
        return sessionContext;
                        resourceProperties = mdCache;
    // Resources
                        jsonWriter.name(resEntry.getKey());
        return getName();
                                            case BOOLEAN -> jsonReader.nextBoolean();
        flushMetadata();
 *
                this.setProjectProperty(PROP_PROJECT_ID, projectID.toString());
        }
                        jsonWriter.beginObject();
    public SMSessionContext getSessionContext() {

        synchronized (metadataSync) {
        }
    public static final String SETTINGS_STORAGE_FILE = "project-settings.json";
                                    if (!resProperties.isEmpty()) {
import com.google.gson.stream.JsonWriter;

                metadataSyncJob = new ProjectSyncJob();
                    } else {
    }
    @Override
 * See the License for the specific language governing permissions and

            }
        synchronized (resourcesSync) {
    @Override
                    String newContent = content.substring(0, start + 6) + name + content.substring(end);
        synchronized (metadataSync) {
        }
import java.io.IOException;
            super("Project metadata sync");
        return new DefaultValueEncryptor(key);
    }
        return false;
    }
        }
    }
    public void setProjectProperties(@NotNull Map<String, Object> properties) {
                if (Objects.equals(oldValue, propValue)) {
        synchronized (resourcesSync) {
            }
    public DBFFileSystemManager getFileSystemManager() {
                    jsonWriter.beginObject();
                                    jsonReader.beginObject();
        flushMetadata();
    @Override
    private volatile DBPDataSourceRegistry dataSourceRegistry;

                    }
        Path metadataFolder = getMetadataPath();
                            }
                }

            return Status.OK_STATUS;
    public void moveResourceProperties(@NotNull String oldResourcePath, @NotNull String newResourcePath) {
                properties = new LinkedHashMap<>();
                }
    @Override
        }
                        }
                    // No props + no new value - ignore

    @Override
                        // No changes
        }
                                jsonWriter.value((Number) value);
            }
                return resProps.get(propName);
                return;
    public static final String METADATA_STORAGE_FILE = "project-metadata.json";
        return workspace;
    protected Path getMetadataPath() {

                // anonymous project does not have properties file, so we need to generate random uuid
import java.io.Writer;
            synchronized (metadataSync) {
public abstract class BaseProjectImpl implements DBPProject, DBSSecretSubject {
/*
                properties.put(propName, propValue);

    @Override
    }
        boolean fileNotEmpty = false;
            Map<String, Object> resProps = resourceProperties.get(resourcePath);
            return;
            return;
        if (Files.exists(path)) {
    private UUID projectID;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.runtime.DBWorkbench;
    ////////////////////////////////////////////////////////
        resourcePath = CommonUtils.normalizeResourcePath(resourcePath);
    @NotNull
                                while (jsonReader.hasNext()) {
                    if (!content.equals(newContent)) {
                    for (var resEntry : resourceProperties.entrySet()) {
    @Override

    ////////////////////////////////////////////////////////
    }
        Object projectDescription = this.getProjectProperty(PROP_PROJECT_DESCRIPTION);
        return inMemory;


                                        mdCache.put(resourceName, resProperties);
                    // Nothing to save and metadata file doesn't exist
import org.jkiss.dbeaver.model.app.DBPProject;
    }
                // UI interactions which may freeze app)
    protected void loadMetadata() {
        if (CommonUtils.isNotEmpty(newName)) {
                    log.error("Error reading project '" + getName() + "' metadata from "  + mdFile.toAbsolutePath(), e);
        </projects>
                    resources.add(resource.getKey());
    }
            if (resProps != null) {
    }
     * @param projectPath path to project folder
            } else {
    public String getSecretSubjectId() {
import javax.crypto.spec.SecretKeySpec;
                    log.error("Error reading project '" + getName() + "' setting from "  + settingsFile.toAbsolutePath(), e);


                ) {
    /**
        }

    }
                return projectID;
            } else {
        flushMetadata();
    private boolean fileExistsAndNonEmpty(@NotNull Path path) {

    public boolean isEncryptedProject() {
        if (dataSourceRegistry != null) {
            this.resourceProperties = resourceProperties;

        return projectID;

                                    }
            return;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        synchronized (metadataSync) {
    protected final Object metadataSync = new Object();
    @NotNull

        <?xml version="1.0" encoding="UTF-8"?>
    protected abstract DBPDataSourceRegistry createDataSourceRegistry();
                projectID = UUID.fromString(idStr);
        synchronized (resourcesSync) {
        this.format = format;

            loadProperties();
    public String getId() {
                        Files.writeString(projectFile, newContent);
 *
                                jsonWriter.value(CommonUtils.toString(value));
    @Override
            String idStr = CommonUtils.toString(this.getProjectProperty(PROP_PROJECT_ID), null);

    @Nullable
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    @Override
        loadMetadata();
                                            default -> jsonReader.nextString();
        .setStrictness(Strictness.LENIENT)
                            dataSourceRegistry = createDataSourceRegistry();
            return;
                    // No changes
import java.util.*;
        }
            <nature>org.jkiss.dbeaver.DBeaverNature</nature>

        loadMetadata();
                            Object value = propEntry.getValue();
import org.jkiss.dbeaver.model.auth.SMSessionContext;
                    log.error("Error flushing project metadata", e);
        return dataSourceRegistry != null;
            if (properties == null) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public Object getProjectProperty(String propName) {
import org.jkiss.dbeaver.model.navigator.DBNModel;
        return null;
