    Set<String> getSubjectPermissions(String subjectId) throws DBException;
    void addUserTeams(@NotNull String userId, @NotNull String[] teamIds, @NotNull String grantorId) throws DBException;

        @Nullable String disableReason
    SMUser[] findUsers(@NotNull SMUserFilter filter) throws DBException;
     * @throws DBException the db exception


     * @param subjectId     the subject id
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull String objectId,
     * @param defaultAuthRole the default auth role

     *
 * You may obtain a copy of the License at
    /**
    // Permissions
 * See the License for the specific language governing permissions and
        @NotNull SMObjectType objectType
    /**
    ) throws DBException;
        @NotNull Set<String> permissions,
 * Unless required by applicable law or agreed to in writing, software
        @NotNull String userId,

     */
     */
     * @param userId the user id
    ///////////////////////////////////////////
    SMTeam findTeam(String teamId) throws DBException;
    void createUser(

     *
    /**
    void invalidateAllTokens() throws DBException;
        @NotNull Set<String> subjectIds,
    String[] getUserLinkedProviders(@NotNull String userId) throws DBException;
 *
        @NotNull Set<String> permissions
    void deleteAllSubjectObjectPermissions(
     * @return the subject object permission grants
     *
     * @param authProviderId the auth provider id
    SMTeam createTeam(
        boolean enabled,
     * @return the user by id
 * you may not use this file except in compliance with the License.

 * Admin interface
     * @param userId         the user id
    SMUser getUserById(String userId) throws DBException;
     * @param credentials    the credentials
        @NotNull Map<String, String> metaParameters,
        @NotNull Set<String> subjectIds,

     * Creates a new team with specified team id that will be in lower-case.
    void enableUser(
        @NotNull String subjectId,
        @NotNull String userId,
     * @return the user team [ ]


import java.util.List;
    SMUserTeam[] getUserTeams(String userId) throws DBException;

     */
     * Gets user teams.
     * @param permissionIds the permission ids

    /**
 *
     */
import org.jkiss.dbeaver.model.security.user.*;
     * Gets user by id.
        @NotNull String grantor
    ) throws DBException;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    ) throws DBException;
     * @throws DBException the db exception

     * @throws DBException the db exception
        @Nullable String description,
     */
 * limitations under the License.

     * @param subjectId the subject id

        @NotNull SMObjectType objectType
    int countUsers(@NotNull SMUserFilter filter) throws DBException;
    void updateTeam(String teamId, String name, String description) throws DBException;
    void deleteTeam(String teamId, boolean force) throws DBException;
        @NotNull SMObjectType objectType,
    /**
     * Delete user credentials for specified provider.
    /**
     * @param userId the user id
    void deleteObject(



     * Method for enabling/disabling user.

        @NotNull String userId,

import org.jkiss.code.NotNull;
    SMTeam[] readAllTeams() throws DBException;
    void setUserTeams(String userId, String[] teamIds, String grantorId) throws DBException;
     * @return the subject permissions
        @NotNull SMObjectType smObjectType
     * Gets subject permissions.

    ) throws DBException;


     */
    List<SMObjectPermissionsGrant> getSubjectObjectPermissionGrants(
    void importUsers(@NotNull SMUserImportList userImportList) throws DBException;
        @NotNull SMObjectType objectType,
    @NotNull
    void deleteObjectPermissions(
    @NotNull
public interface SMAdminController extends SMController {
        @NotNull String projectId,
    ) throws DBException;
        @NotNull String userId,
    /**
     * @param userId         the user id
    @NotNull
    ) throws DBException;
    ) throws DBException;
    SMUser[] findUsers(String userNameMask) throws DBException;
    /**
 */
     * Create user.
     * @param grantorId     the grantor id

    // General
     * @throws DBException the db exception

    void setUserCredentials(
    void setSubjectPermissions(String subjectId, List<String> permissionIds, String grantorId) throws DBException;
    // Credentials
        @NotNull String authProviderId,
    // Users
        @NotNull Set<String> objectIds,

    // Teams


     */
     * @param userId the user id
     *
        @NotNull String authProviderId
     * Delete all assigned object permissions for subject

 */
 *
import java.util.Map;
     */
     *
        @Nullable String name,
 * DBeaver - Universal Database Manager
        @NotNull Set<String> objectIds,
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.DBException;
     * Sets subject permissions.

    /**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Set;

     *
     * @param enabled         the enabled
    ///////////////////////////////////////////

     * @throws DBException the db exception
        @NotNull Map<String, Object> credentials
    /**
        @Nullable String disabledBy,

    @NotNull
     *
package org.jkiss.dbeaver.model.security;
    void deleteUser(String userId) throws DBException;
     * @return the string [ ]
    @NotNull
    @NotNull
     *
    void setUserAuthRole(@NotNull String userId, @Nullable String authRole) throws DBException;
    ) throws DBException;
     *
     */
    List<SMTeamMemberInfo> getTeamMembersInfo(@NotNull String teamId) throws DBException;
 * Licensed under the Apache License, Version 2.0 (the "License");

        @NotNull String grantor
    void deleteUserTeams(@NotNull String userId, @NotNull String[] teamIds) throws DBException;
    ) throws DBException;

     * @param authProviderId the auth provider id


        @NotNull String teamId,
    void setUserTeamRole(@NotNull String userId, @NotNull String teamId, @Nullable String teamRole) throws DBException;

     * @throws DBException the db exception
}

     * @throws DBException the db exception
     * Returns list of auth provider IDs associated with this user
/*
 * distributed under the License is distributed on an "AS IS" BASIS,


    void setSubjectMetas(@NotNull String subjectId, @NotNull Map<String, String> metaParameters) throws DBException;
    ///////////////////////////////////////////
        boolean enabled,
     * @param metaParameters  the meta parameters
     * @throws DBException the db exception
/**
     * @param subjectId    the subject id
    ) throws DBException;
     * @throws DBException the db exception
    ///////////////////////////////////////////
     * Sets user credentials for specified provider.
        @Nullable String defaultAuthRole
     */
    /**
    SMPropertyDescriptor[] getMetaParametersBySubjectType(SMSubjectType subjectType) throws DBException;

    /**
     */
    void addObjectPermissions(

     * @param userId          the user id
     */
    @NotNull
        @NotNull String subjectId,

     * Gets subject object permission grants.
    void deleteUserCredentials(
     * @param smObjectType the sm object type
