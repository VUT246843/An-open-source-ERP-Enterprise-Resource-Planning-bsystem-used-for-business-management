    ) throws DBException;
    void setObjectPermissions(
     * @throws DBException the db exception
    boolean isSessionPersisted(@NotNull String id) throws DBException;
        @NotNull String objectId,
     */

        @NotNull SMObjectType objectType
    Map<String, Object> getCurrentUserParameters() throws DBException;
    List<SMObjectPermissionsGrant> getObjectPermissionGrants(
package org.jkiss.dbeaver.model.security;
        @Nullable String objectId,
     */
    ) throws DBException;
    // Permissions
        @NotNull Map<String, String> settings
    ///////////////////////////////////////////
/**

     * @throws DBException the db exception
    @NotNull

    /**
     * @throws DBException the db exception
    ) throws DBException;
     * Updates session.
        @NotNull String subjectId,
        @NotNull SMObjectType objectType,

    /**
    @NotNull

     * @throws DBException the db exception
        @NotNull SMObjectType smObjectType

    /**

import org.jkiss.dbeaver.model.security.user.SMUser;
/*
import java.util.List;
    @NotNull
     */
    ///////////////////////////////////////////
import org.jkiss.code.NotNull;
    String[] getCurrentUserLinkedProviders() throws DBException;
     * Gets token permissions.
 *
        @NotNull SMObjectType objectType,
     */
    void setCurrentUserParameters(@NotNull Map<String, Object> parameters) throws DBException;
    @NotNull
    void setObjectSettings(
     * @return the user team [ ]
     * @throws DBException the db exception
    @NotNull
     * @param name  the name
     *
    /**

     * @return the object permissions
     */
    @NotNull
     * Invalidate current sm session and tokens
     * @return the user
     * @param objectType the object type
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @deprecated use {@link SMAdminController#addObjectPermissions} or {@link SMAdminController#deleteObjectPermissions}
        @NotNull Set<String> subjectIds,
     * @throws DBException the db exception
     */

    @NotNull
     *
     *

    void setCurrentUserCredentials(
     * Sets user settings for a specified object.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    SMAuthPermissions getTokenPermissions() throws DBException;
    Set<String> getUserPermissions(String userId) throws DBException;
    ///////////////////////////////////////////
    ) throws DBException;

     */
    List<SMObjectPermissions> getAllAvailableObjectsPermissions(@NotNull SMObjectType objectType) throws DBException;
    /**
     * @throws DBException the db exception

    SMObjectPermissions getObjectPermissions(
     * @param parameters the parameters
     * @throws DBException the db exception
        @Nullable String[] settingIds
     * @param credentials    the credentials
        @NotNull String projectId,
    SMTokens refreshSession(@NotNull String refreshToken) throws DBException;

     * Gets user teams.
import org.jkiss.dbeaver.model.auth.SMAuthCredentialsManager;
     *
        @NotNull Set<String> objectIds,
    @NotNull
     */
    SMAuthCredentialsManager, SMAuthController {
     * Gets user parameters.
     * @param objectType the object type

     */
    @Deprecated
    // Permissions
     */


        @Nullable SMObjectType objectType,
     * @return the user credentials
        @NotNull String objectId,
     * @return the token permissions
    /**
     *


    ) throws DBException;
    void updateSession(@NotNull String sessionId, @NotNull Map<String, Object> parameters) throws DBException;
 * Unless required by applicable law or agreed to in writing, software
        @NotNull Map<String, Object> credentials
     * Sets user parameter.
    String[] getTeamMembers(@NotNull String teamId) throws DBException;

     * If value in map entry is null then setting is deleted.
     * Gets all available objects permissions.
     *
    // Auth providers

 * You may obtain a copy of the License at
     * Gets object permissions.
     * Gets user permissions.
 *     http://www.apache.org/licenses/LICENSE-2.0
     * @param value the value
    @NotNull
    /**
     * @return the all available objects permissions
    /**
    /**
     * @throws DBException the db exception
import org.jkiss.code.Nullable;
     * Sets user credentials for specified provider.


    /**
    @NotNull
     *
    void logout() throws DBException;
     */
     * @param sessionId  the session id
    boolean hasAccessToUsers(@NotNull String teamRole, @NotNull Set<String> userIds) throws DBException;
     * Gets user credentials for specified provider
    ///////////////////////////////////////////
    /**
    ) throws DBException;
     * @param authProviderId the auth provider id
     * Refresh current sm session and generate new token
    /**
     */
        @NotNull String projectId,
     * @param objectId   the object id
    /**
    Map<String, Object> getCurrentUserCredentials(@NotNull String authProviderId) throws DBException;
     *
     * @return the string [ ]
    @NotNull

import java.util.Map;
import java.util.Set;

     */
        @NotNull String grantor
    ///////////////////////////////////////////
    /**
     */
    /**
        @NotNull String authProviderId,
import org.jkiss.dbeaver.model.security.user.SMUserTeam;
 * Admin interface
public interface SMController extends DBPObjectController, DBInternalDatabaseInformationProvider,
    ///////////////////////////////////////////
        @NotNull String objectId,

     *

     * @param userId the user id
     */
    @NotNull
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2026 DBeaver Corp and others
     * IF object type and id are null then returns all project settings
     *
     * @throws DBException the db exception

     * Returns list of auth provider IDs associated with this user
    void setCurrentUserParameter(@NotNull String name, @Nullable Object value) throws DBException;


    /**
     */
 * DBeaver - Universal Database Manager
     * checks that the current suer has the required role and is a member of the same teams as the specified list of

 *
        @NotNull String objectId,

     */
     */
import org.jkiss.dbeaver.model.security.user.SMObjectPermissions;
import org.jkiss.dbeaver.model.security.user.SMAuthPermissions;
}
        @NotNull Set<String> permissions,
     * @throws DBException if the current session is not found or something went wrong
     * @return the user permissions
     */
    @NotNull
     * Reads user settings.
    SMAuthProviderDescriptor[] getAvailableAuthProviders() throws DBException;
    // Users
    // Sessions
        @NotNull SMObjectType objectType
import org.jkiss.dbeaver.DBException;
     *
    /**
    // Credentials
    /**
import org.jkiss.dbeaver.model.DBInternalDatabaseInformationProvider;
     * @throws DBException if the current refresh token invalid
    /**
     * @param authProviderId the auth provider id
     * users

 */
     * @throws DBException the db exception

 * limitations under the License.
    @NotNull
    ) throws DBException;
import org.jkiss.dbeaver.model.DBPObjectController;
     * Sets user parameters.
    void deleteAllObjectPermissions(
    SMUser getCurrentUser() throws DBException;
    SMUserTeam[] getCurrentUserTeams() throws DBException;
     *
     *
     * @throws DBException the db exception
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    List<SMObjectSettings> getObjectSettings(



 */
     *
     * @throws DBException the db exception
     * @param subjectId  the subject id
     * @return the user parameters
     *
 * See the License for the specific language governing permissions and
     * Gets current active user.
