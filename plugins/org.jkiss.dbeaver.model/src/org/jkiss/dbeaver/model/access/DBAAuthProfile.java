
import java.util.LinkedHashMap;
    // Secret key prefix
import org.jkiss.dbeaver.DBException;
    }
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.model.data.json.JSONUtils;
 *
    @Override
        // Additional auth props

    private void loadFromLegacySecret(DBSSecretController secretController) throws DBException {


        if (!CommonUtils.isEmpty(getProperties())) {
        // Primary props

        return userPassword;
    }
    }
        this.savePassword = source.savePassword;
        Map<String, Object> props = new LinkedHashMap<>();
    private String authModelId;
    public void persistSecrets(DBSSecretController secretController) throws DBException {
        props.put("profile-name", getProfileName());
    public String getUserPassword() {
        secretController.setPrivateSecretValue(
    public void setAuthModelId(String authModelId) {

import org.jkiss.dbeaver.model.rm.RMProjectType;

        userName = JSONUtils.getString(props, "user");
/**
        this.userName = userName;

    public DBAAuthProfile(DBPProject project) {
 * You may obtain a copy of the License at
        userPassword = JSONUtils.getString(props, "password");
import org.jkiss.dbeaver.model.connection.DBPAuthModelDescriptor;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

    private boolean savePassword;
    public boolean isSavePassword() {
        this.userName = source.userName;
 * distributed under the License is distributed on an "AS IS" BASIS,
        props.put("profile-id", getProfileId());
            getSecretKeyId());
import org.jkiss.dbeaver.model.connection.DBPConfigurationProfile;
            secretValue);
        secretController.flushChanges();
            return;

        return authModelId;
            loadFromLegacySecret(secretController);

 *
 *
    public void setUserName(String userName) {
    }
    }
        this.savePassword = savePassword;
        if (getUserName() != null) {

    public void setUserPassword(String userPassword) {
    public DBAAuthProfile(DBAAuthProfile source) {
        Map<String, Object> props = JSONUtils.parseMap(DBInfoUtils.SECRET_GSON, new StringReader(secretValue));
/*

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 * Unless required by applicable law or agreed to in writing, software

        this.userPassword = userPassword;

    }

        // Info fields (we don't use them anyhow)
    @Override

 * limitations under the License.


 * DBeaver - Universal Database Manager
        }
    private String userName;
            // Backward compatibility


        }
        return RMProjectType.getPlainProjectId(getProject()) + PROFILE_KEY_PREFIX + getProfileId();
 */
    }
    public void setSavePassword(boolean savePassword) {
            props.put("properties", getProperties());
    }
 * See the License for the specific language governing permissions and

 * Authentication properties.


 * you may not use this file except in compliance with the License.
 * Auth profile.
        String secretValue = DBInfoUtils.SECRET_GSON.toJson(props);
    }
        this.authModelId = source.authModelId;
import java.io.StringReader;
    }
        String secretValue = secretController.getPrivateSecretValue(
import org.jkiss.utils.CommonUtils;
            props.put("password", getUserPassword());
    }
package org.jkiss.dbeaver.model.access;
    public static final String PROFILE_KEY_PREFIX = "/auth-profile/";
        super(project);
    public String getSecretKeyId() {
        return userName;
            props.put("user", getUserName());
        super(source);
import org.jkiss.dbeaver.model.secret.DBSSecretController;
        this.authModelId = authModelId;
    private String userPassword;
}
 */
        }
public class DBAAuthProfile extends DBPConfigurationProfile {
    public void resolveSecrets(DBSSecretController secretController) throws DBException {

    public String getAuthModelId() {
        setProperties(JSONUtils.deserializeStringMap(props, "properties"));
    }
    public String getUserName() {
import org.jkiss.dbeaver.runtime.DBWorkbench;
import java.util.Map;
        if (getUserPassword() != null) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return DBWorkbench.getPlatform().getDataSourceProviderRegistry().getAuthModel(authModelId);
    }
            getSecretKeyId(),
    public DBPAuthModelDescriptor getAuthModel() {
        return savePassword;
        if (secretValue == null) {
        }

import org.jkiss.dbeaver.model.DBInfoUtils;
        this.userPassword = source.userPassword;
        // Auth profiles were not supported in legacy versions
