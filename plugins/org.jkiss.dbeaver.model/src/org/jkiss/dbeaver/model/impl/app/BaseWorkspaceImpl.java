            log.error(e);
                    true);
    public DBPProject createProject(@NotNull String name, @Nullable String description) throws DBException {
            }
            byte[] messageDigest = md.digest(hardwareAddress);
    @NotNull
            try (InputStream is = Files.newInputStream(versionFile)) {
    @Override
    // Options
    @Override
 * you may not use this file except in compliance with the License.
    public SMSessionContext getAuthContext() {
            if (project.getId().equals(projectId)) {

import org.jkiss.utils.SecurityUtils;

        try {
import org.jkiss.dbeaver.DBException;

    }

        return activeProject;
    public DBPPlatform getPlatform() {
        DBVModel.checkGlobalCacheIsEmpty();

        throw new DBException("Not supported");

            // Generate new UUID
                log.debug("Cannot detect local network interface");
    }
            if (ni == null) {

            MessageDigest md = MessageDigest.getInstance("MD5");
        throw new DBException("Not supported");
        return props;

import org.jkiss.dbeaver.model.impl.auth.SessionContextImpl;
    @Override

    }
            log.debug(e);
/*
        return platform;
    protected SMSession acquireWorkspaceSession(@NotNull DBRProgressMonitor monitor) throws DBException {
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean supportsRealmFeature(@NotNull String feature) {
    protected static final String PROP_PROJECT_ACTIVE = "project.active";
            for (int i = 0; i < messageDigest.length; i++) {
        String workspaceId = workspaceInfo.getProperty(WORKSPACE_ID);
                lValue += (long)messageDigest[i] << (i * 8);
                36).toUpperCase();
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
            if (ni == null || ni.getHardwareAddress() == null) {
        return null;
 *
    protected BaseWorkspaceImpl(@NotNull DBPPlatform platform, @NotNull Path workspacePath) {
import org.jkiss.dbeaver.model.app.DBPProject;

        }
        Properties props = new Properties();
        Path metadataFolder = GeneralUtils.getMetadataFolder();
                    if (ni.getHardwareAddress() != null) {
    public static void writeWorkspaceInfo(Path metadataFolder, Properties props) {
        }
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.DBConstants;
            System.exit(101);
 * Copyright (C) 2010-2026 DBeaver Corp and others
    @NotNull
    @NotNull
            dispose();
            this.getAuthContext().addSession(acquireWorkspaceSession(new VoidProgressMonitor()));
 */
    public DBPImage getResourceIcon(DBPAdaptable resourceAdapter) {
        throw new DBException("Not supported");
            workspaceId = "D" + Long.toString(

    }

                Enumeration<NetworkInterface> niEnum = NetworkInterface.getNetworkInterfaces();
 * BaseWorkspaceImpl.
    public void renameProject(@NotNull DBPProject project, @NotNull String newName) throws DBException {
package org.jkiss.dbeaver.model.impl.app;
                Math.abs(SecurityUtils.generateRandomLong()),
import java.io.OutputStream;
            }
        // Check workspace ID
            workspaceInfo.setProperty(WORKSPACE_ID, workspaceId);
        }

    }
        return true;
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.auth.SMSession;
        } catch (Exception e) {
 * limitations under the License.
                    }
                        break;
    @Override
    @Override

        }

            BaseWorkspaceImpl.writeWorkspaceInfo(metadataFolder, workspaceInfo);
    @Nullable
    }
import org.jkiss.dbeaver.utils.GeneralUtils;
        return readWorkspaceId(metadataFolder);
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

        try {
    protected DBPProject activeProject;

            if (!(e instanceof DBInterruptedException)) {
import java.net.NetworkInterface;
import org.jkiss.code.NotNull;
        for (DBPProject project : getProjects()) {
    private final SessionContextImpl workspaceAuthContext;
    public boolean isReadOnly() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void initializeWorkspaceSession() {
            props.store(os, "DBeaver workspace version");

import org.jkiss.dbeaver.model.app.DBPPlatform;

        } catch (DBException e) {
    }

import org.jkiss.dbeaver.Log;
            byte[] hardwareAddress = ni.getHardwareAddress();
    public static final String DEFAULT_RESOURCES_ROOT = "Resources"; //$NON-NLS-1$
    public static String readWorkspaceIdProperty() {
    @Override
import org.jkiss.dbeaver.runtime.DBInterruptedException;
    private final Path workspacePath;
import org.jkiss.dbeaver.model.virtual.DBVModel;
                log.debug(e);
 *

    }
                }
            } catch (Exception e) {
    }
    public static Properties readWorkspaceInfo(Path metadataFolder) {
import org.jkiss.dbeaver.utils.RuntimeUtils;
    public void dispose() {

            }
    public Path getAbsolutePath() {

import org.jkiss.code.Nullable;
 * See the License for the specific language governing permissions and
        return workspaceId;
    @Override

        return true;
    }

    }
    public boolean hasRealmPermission(@NotNull String permission) {
            }
    }
        return false;
    protected final DBPPlatform platform;
            }
import java.nio.file.Path;
    public Path getMetadataFolder() {
}
import org.jkiss.dbeaver.model.auth.SMSessionContext;
                    "Authentication error",
                        "\n" + e.getMessage(),
                    "Error authenticating application user: " +
    @NotNull

    private static final String WORKSPACE_ID = "workspace-id";
    @Override
        Properties workspaceInfo = BaseWorkspaceImpl.readWorkspaceInfo(metadataFolder);

        // Acquire workspace session
    }
    }
                    ni = niEnum.nextElement();
        if (Files.exists(versionFile)) {
    }
import java.nio.file.Files;
        Path versionFile = metadataFolder.resolve(DBConstants.WORKSPACE_PROPS_FILE);
                return project;
/**
        return getAbsolutePath().resolve(METADATA_FOLDER);
            return "XXXXXXXXXX";
        return true;
            // Use MD5
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (CommonUtils.isEmpty(workspaceId)) {
        }
    public static String getLocalHostId() {
    @NotNull
    }
    }
        Path versionFile = metadataFolder.resolve(DBConstants.WORKSPACE_PROPS_FILE);
    @Override
    @Override
    }

    @NotNull
        return workspaceAuthContext;


    @Override
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        return new LocalWorkspaceSession(this);
import java.net.InetAddress;
        return workspacePath;

    public abstract void initializeProjects();
    }
        this.platform = platform;

                props.load(is);
import org.jkiss.dbeaver.model.app.DBPWorkspace;

                log.error(e);


    public void deleteProject(@NotNull DBPProject project) throws DBException {
                DBWorkbench.getPlatformUI().showMessageBox(
    public boolean isActive() {
        try (OutputStream os = Files.newOutputStream(versionFile)) {
        }

 * DBeaver - Universal Database Manager
        this.workspacePath = workspacePath;
        // Here we get local machine identifier. It is hashed and thus depersonalized
import org.jkiss.dbeaver.model.DBPImage;
import org.jkiss.dbeaver.model.DBPAdaptable;
    @Nullable
 *
        return null;
    }
            long lValue = 0;
                return "NOMACADDR";
    @Override
    ////////////////////////////////////////////////////////
 * You may obtain a copy of the License at
 */
            }

import java.security.MessageDigest;

import java.util.Properties;
import java.io.InputStream;
import java.util.Enumeration;
    @NotNull
public abstract class BaseWorkspaceImpl implements DBPWorkspace {
        this.workspaceAuthContext = new SessionContextImpl(null);
            NetworkInterface ni = NetworkInterface.getByInetAddress(localHost);
                while (niEnum.hasMoreElements()) {
            return Long.toString(Math.abs(lValue), 36).toUpperCase();
        } catch (Exception e) {
    public static String readWorkspaceId(Path metadataFolder) {
    @Override
    private static final Log log = Log.getLog(BaseWorkspaceImpl.class);
    }
 * Unless required by applicable law or agreed to in writing, software
    public DBPProject getActiveProject() {
    @NotNull
            InetAddress localHost = RuntimeUtils.getLocalHostOrLoopback();

    @Override
    public DBPProject getProjectById(@NotNull String projectId) {
    }
    @Nullable

