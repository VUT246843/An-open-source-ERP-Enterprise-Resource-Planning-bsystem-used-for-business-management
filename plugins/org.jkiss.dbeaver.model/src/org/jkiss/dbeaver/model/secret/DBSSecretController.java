        throws DBException {

    ) throws DBException {
    long FEATURE_SHARED_SECRETS_EDIT = 1 << 3;
        throw new DBException("Session secret controller not found");
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull DBSSecretObject secretObject

 *

    ) throws DBException {
    }
    default void setPrivateSecretValue(@NotNull DBSSecretObject secretObject, @NotNull DBSSecretValue secretValue)

 * distributed under the License is distributed on an "AS IS" BASIS,
            return secretKeeper.getSecretController();
    }
/*
        var secretController = getSessionSecretControllerOrNull(spaceSession);
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.model.auth.SMSessionSecretKeeper;
    @NotNull
public interface DBSSecretController {
        @NotNull DBSSecretObject secretObject

     * Syncs any changes with file system/server
    long FEATURE_SHARED_SECRETS_VIEW = 1 << 2;
        return List.of();
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.model.secret;
 * you may not use this file except in compliance with the License.
    /**
 * Unless required by applicable law or agreed to in writing, software
    }
        }
 *
/**
        @NotNull DBSSecretObject secretObject,
    @Nullable
import java.util.List;
    long FEATURE_PRIVATE_SECRETS_VIEW = 1;
    @NotNull

    void flushChanges() throws DBException;
        @NotNull DBSSecretValue secretValue

}
    }
    default long getSupportedFeatures() throws DBException {
    default void setSubjectSecretValue(
            return secretController;
        return FEATURE_PRIVATE_SECRETS_VIEW | FEATURE_PRIVATE_SECRETS_EDIT | FEATURE_SHARED_SECRETS_VIEW | FEATURE_SHARED_SECRETS_EDIT;
        SMSessionSecretKeeper secretKeeper = DBUtils.getAdapter(SMSessionSecretKeeper.class, spaceSession);
        return getSessionSecretController(DBWorkbench.getPlatform().getWorkspace().getWorkspaceSession());


import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.code.NotNull;
    }


 * See the License for the specific language governing permissions and

    default void deleteProjectSecrets(@NotNull String projectId) throws DBException {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (secretKeeper != null) {
    @NotNull
    }
 * Secret manager API
    ) throws DBException {
 *     http://www.apache.org/licenses/LICENSE-2.0
    default void deleteObjectSecrets(
     */
    @NotNull

    long FEATURE_PRIVATE_SECRETS_EDIT = 1 << 1;
        @NotNull String subjectId,
import org.jkiss.code.Nullable;

        @NotNull DBSSecretObject secretObject
    }

    String getPrivateSecretValue(@NotNull String secretId) throws DBException;
    static DBSSecretController getSessionSecretController(SMSession spaceSession) throws DBException {


    }
 */
    void setPrivateSecretValue(@NotNull String secretId, @Nullable String secretValue) throws DBException;
import org.jkiss.dbeaver.DBException;
    static DBSSecretController getSessionSecretControllerOrNull(SMSession spaceSession) throws DBException {
    }
    ) throws DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    default List<DBSSecretValue> listAllSharedSecrets(
    }
 * limitations under the License.
    @NotNull
        setPrivateSecretValue(secretValue.getId(), secretValue.getValue());
    static DBSSecretController getGlobalSecretController() throws DBException {
import org.jkiss.dbeaver.model.DBUtils;
    }
import org.jkiss.dbeaver.model.auth.SMSession;
        return null;
    static DBSSecretController getProjectSecretController(DBPProject project) throws DBException {

 *
    @Nullable
 */
        return getSessionSecretController(project.getWorkspaceSession());
    List<DBSSecretValue> discoverCurrentUserSecrets(
        if (secretController != null) {
    default void deleteSubjectSecrets(@NotNull String subjectId) throws DBException {
 * DBeaver - Universal Database Manager

        }


