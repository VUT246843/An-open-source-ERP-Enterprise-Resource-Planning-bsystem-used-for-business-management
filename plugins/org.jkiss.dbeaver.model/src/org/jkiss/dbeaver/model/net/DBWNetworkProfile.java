    public DBWHandlerConfiguration getConfiguration(DBWHandlerDescriptor handler) {
    }
                // Backward compatibility
    public void updateConfiguration(@NotNull DBWHandlerConfiguration cfg) {
 * you may not use this file except in compliance with the License.

                String secretId = secret.getId();
                cfg.setSecureProperties(secureProps);
                }
        List<Map<String, Object>> handlersConfigs = new ArrayList<>();
        List<Map<String, Object>> handlerConfigs = JSONUtils.getObjectList(props, "handlers");
                        break;
    public DBWNetworkProfile() {
        DBSSecretBrowser secretBrowser = (DBSSecretBrowser) secretController;
 * DBeaver - Universal Database Manager


                return cfg;
    public List<DBWHandlerConfiguration> getConfigurations() {
 *
        for (DBWHandlerConfiguration  cfg : configurations) {
            if (!DBWorkbench.isDistributed()) {
                        cfg.setUserName(secretController.getPrivateSecretValue(secretId));

    public void setSecretSubject(DBSSecretSubject secretSubject) {
    public String getProfileSource() {
import org.jkiss.dbeaver.model.secret.DBSSecretController;
                handlersConfigs.add(hcProps);
            }
                    case "user":
    @NotNull
    }
import org.jkiss.dbeaver.DBException;


/**
            prefix = secretSubject.getSecretSubjectId();
        this.secretSubject = secretSubject;
            secretValue);
    public DBWHandlerConfiguration getConfiguration(String configId) {
            if (configuration != null) {
 */
            if (Objects.equals(cfg.getId(), c.getId())) {
        if (project != null) {
                switch (secret.getName()) {
import org.jkiss.code.NotNull;
                hcProps.put("id", cfg.getId());
 * distributed under the License is distributed on an "AS IS" BASIS,
            DBWHandlerConfiguration configuration = getConfiguration(configId);
                        // Skip it
        Map<String, Object> props = new LinkedHashMap<>();
        if (!handlersConfigs.isEmpty()) {
import org.jkiss.dbeaver.model.connection.DBPConfigurationProfile;
 *

    @Override
                    default:
 * You may obtain a copy of the License at
        return secretSubject == null ? null : secretSubject.getSecretSubjectId();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            String configId = JSONUtils.getString(hc, "id");
                return cfg;
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.io.StringReader;
 *
        configurations.add(cfg);
import java.util.*;
            return;
        }
            if (!secureProps.isEmpty()) {

                        break;


                        cfg.setPassword(secretController.getPrivateSecretValue(secretId));
            return;
    }

        String secretValue = DBInfoUtils.SECRET_GSON.toJson(props);
        secretController.setPrivateSecretValue(
            }
    private void loadFromLegacySecret(DBSSecretController secretController) throws DBException {

        props.put("profile-id", getProfileId());
    public static final String PROFILE_KEY_PREFIX = "/network-profile/";

        for (DBWHandlerConfiguration  cfg : configurations) {

            }
import org.jkiss.dbeaver.model.rm.RMProjectType;
 */
package org.jkiss.dbeaver.model.net;
        for (int i = 0; i < configurations.size(); i++) {
        props.put("profile-name", getProfileName());
            getSecretKeyId(),


import org.jkiss.dbeaver.model.secret.DBSSecretSubject;
    }
        // Info fields (we don't use them anyhow)
        } else {
            }
            props.put("handlers", handlersConfigs);
            prefix = "global";
    @Override
            Map<String, Object> hcProps = cfg.saveToMap();
                return;
    private final List<DBWHandlerConfiguration> configurations = new ArrayList<>();
import org.jkiss.dbeaver.model.secret.DBSSecret;
    @NotNull
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.secret.DBSSecretBrowser;


        if (secretValue == null) {
 * See the License for the specific language governing permissions and
import org.jkiss.code.Nullable;
            String prefix = "projects/" + getProject().getId() + "/network/" + cfg.getId() + "/profile/" + getProfileId();
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Network configuration profile
            }
                        secureProps.put(secret.getName(), secretController.getPrivateSecretValue(secretId));
import org.jkiss.dbeaver.model.DBInfoUtils;
            if (Objects.equals(cfg.getId(), configId)) {
        return prefix + PROFILE_KEY_PREFIX + getProfileId();

        for (DBWHandlerConfiguration cfg : configurations) {
public class DBWNetworkProfile extends DBPConfigurationProfile {
                    case "password":
 * Unless required by applicable law or agreed to in writing, software
        }
        }
        } else if (secretSubject != null) {
    }
    public void resolveSecrets(DBSSecretController secretController) throws DBException {
/*
    public void persistSecrets(DBSSecretController secretController) throws DBException {
    }
}
            Map<String, String> secureProps = new LinkedHashMap<>();

    public DBWNetworkProfile(DBPProject project) {
    }
    @Nullable
 * limitations under the License.
        return null;
        if (!(secretController instanceof DBSSecretBrowser) || getProject() == null) {
        String prefix;

    public String getSecretKeyId() {
            }
                    case "name":
        for (DBWHandlerConfiguration cfg : configurations) {
    }

        for (Map<String, Object> hc : handlerConfigs) {
    }
    @Override
            if (Objects.equals(cfg.getId(), handler.getId())) {
        String secretValue = secretController.getPrivateSecretValue(getSecretKeyId());
    // Secret key prefix
        DBPProject project = getProject();

        return configurations;
                        continue;
                loadFromLegacySecret(secretController);
        }

                configurations.set(i, cfg);
        }
            prefix = RMProjectType.getPlainProjectId(project);
    @Nullable
        }
        }
        Map<String, Object> props = JSONUtils.parseMap(DBInfoUtils.SECRET_GSON, new StringReader(secretValue));
            }

        }
            }
    }
    }
import org.jkiss.dbeaver.model.data.json.JSONUtils;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return null;
import org.jkiss.dbeaver.model.app.DBPProject;
            DBWHandlerConfiguration c = configurations.get(i);
        super(project);
            if (!hcProps.isEmpty()) {
                        break;
            for (DBSSecret secret : secretBrowser.listSecrets(prefix)) {
    }
        }
                configuration.loadFromMap(hc);
    private transient DBSSecretSubject secretSubject;
