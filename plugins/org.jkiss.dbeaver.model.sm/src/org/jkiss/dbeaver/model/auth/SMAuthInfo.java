    private final String smRefreshToken;

            .setAppSessionId(appSessionId)
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
        private Map<SMAuthConfigurationReference, Object> authData;
                error,
                authRole,
    public static SMAuthInfo successChildSession(
    @Nullable
     * Deprecated, use smAccessToken instead
        public Builder setAuthStatus(SMAuthStatus authStatus) {
    @Nullable
        @Nullable String smSignOutLink,
    private final SMAuthPermissions authPermissions;
        return redirectUrl;
    public boolean isMainAuth() {
    public static SMAuthInfo error(


                signOutLink,
            .setAppSessionId(appSessionId)
    @Nullable
        public Builder setMainAuth(boolean mainAuth) {
    ) {
        @Nullable String signInLink,
        return forceSessionsLogout;

    }


            return new SMAuthInfo(
        return signOutLink;
    public Map<SMAuthConfigurationReference, Object> getAuthData() {
        return mainAuth;
        @NotNull String authAttemptId,
        @Nullable String smSignInLink,
        private SMAuthStatus authStatus;
        }
        @NotNull Map<SMAuthConfigurationReference, Object> authData,
            .build();
        }
    private final String errorCode;
                forceSessionsLogout,
        @NotNull Map<SMAuthConfigurationReference, Object> authData,
    }
    @Nullable


            this.authAttemptId = authAttemptId;
    private static final class Builder {
    ) {
        @NotNull Map<SMAuthConfigurationReference, Object> authData,
    public String getAuthAttemptId() {
        private boolean forceSessionsLogout;
            .setAuthData(authData)
        this.signOutLink = smSignOutLink;
        this.smRefreshToken = smRefreshToken;
        @NotNull String authAttemptId,
    @NotNull
    }
            return this;
    @Nullable
 * limitations under the License.
        public Builder setAuthRole(String authRole) {
            this.authRole = authRole;
        public Builder setForceSessionsLogout(boolean forceSessionsLogout) {


 * Unless required by applicable law or agreed to in writing, software
        private String signOutLink;
        return new Builder()
        public Builder setAuthData(Map<SMAuthConfigurationReference, Object> authData) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            .setMainAuth(mainAuth)
        public Builder setSignInLink(String signInLink) {
        public Builder setSmAccessToken(String smAccessToken) {
    /**
    }
    private final String smAccessToken;
        return errorCode;
            .setAuthStatus(SMAuthStatus.IN_PROGRESS)
        private boolean mainAuth;
        boolean mainAuth,
            .setSmAccessToken(accessToken)
}
        @NotNull String authAttemptId,
            .setAuthData(authData)
        @Nullable String smRefreshToken,
    ) {
    }

        this.appSessionId = appSessionId;
        private String authRole;
                authData,
        @NotNull String appSessionId
        public SMAuthInfo build() {
            this.authStatus = authStatus;
        }
        this.forceSessionsLogout = forceSessionsLogout;
                authStatus,
                authAttemptId,
    @Nullable
        this.mainAuth = mainAuth;
        @Nullable String authRole,
            return this;
            return this;
        public Builder setSmRefreshToken(String smRefreshToken) {
        return authAttemptId;

    public String getSmAccessToken() {

    }


        this.authRole = authRole;
    }
        @NotNull SMAuthPermissions smAuthPermissions,
    }
        return redirectUrl;
 * DBeaver - Universal Database Manager
    @Nullable
            return this;
        @Nullable String refreshToken,
import org.jkiss.dbeaver.model.security.user.SMAuthPermissions;
        return appSessionId;
    @NotNull
        @Nullable String errorCode,

        private String signInLink;
        @Nullable String errorCode,
        private String appSessionId;
    @Nullable
        private SMAuthPermissions authPermissions;
                authPermissions,
        private String error;
    public String getAppSessionId() {
        public Builder setAppSessionId(String appSessionId) {
    public SMAuthStatus getAuthStatus() {
        this.authPermissions = authPermissions;
            .setMainAuth(mainAuth)
    @Nullable
        this.smAccessToken = smAccessToken;
            .setAuthAttemptId(authAttemptId)

            this.smRefreshToken = smRefreshToken;
    public String getSmRefreshToken() {

        boolean mainAuth,
    }
            this.appSessionId = appSessionId;
            .setAuthPermissions(permissions)
        boolean forceSessionsLogout,
        public Builder setAuthPermissions(SMAuthPermissions authPermissions) {
            .setAuthAttemptId(authAttemptId)

 * distributed under the License is distributed on an "AS IS" BASIS,
            return this;
            .setSignOutLink(signOutLink)
    private final String appSessionId;
    @Deprecated
        return error;
    @NotNull

        @NotNull String authAttemptId,
        }
        return authStatus;
                mainAuth,
                errorCode,
            .setMainAuth(false)
        @Nullable String signOutLink,
        if (smAuthToken != null) {
    public boolean isForceSessionsLogout() {

            .setAuthAttemptId(authAttemptId)
    ) {
            .setAppSessionId(appSessionId)
        return authRole;
    }

    public SMAuthPermissions getAuthPermissions() {
        public Builder setErrorCode(String errorCode) {
            .setAuthStatus(SMAuthStatus.ERROR)
            this.signOutLink = signOutLink;
        public Builder setAuthAttemptId(String authAttemptId) {
    }
        @NotNull String authAttemptId,
    private final SMAuthStatus authStatus;
        @Nullable SMAuthPermissions authPermissions,
    @Nullable
    @Nullable
            return this;
 *
        boolean mainAuth,
            .setMainAuth(mainAuth)
    }
    @NotNull
        @Nullable String smAccessToken,

        @Nullable String error,
package org.jkiss.dbeaver.model.auth;
    public String getRedirectUrl() {
    ) {
    @Nullable //Backward compatibility

            .setAuthPermissions(smAuthPermissions)
    @NotNull
 *

        return new Builder().setAuthStatus(SMAuthStatus.SUCCESS)

                appSessionId
            return this;

        @NotNull String appSessionId

            return this;
    }
        return new Builder()
        }
            return this;
public class SMAuthInfo {


        @Nullable String authRole,
            .setSmRefreshToken(refreshToken)
        }


     */
        @NotNull String appSessionId
            this.authData = authData;


        this.redirectUrl = smSignInLink;
        }
    private String smAuthToken;
    @Nullable
    @NotNull
        @NotNull String authAttemptId,
            .setAuthAttemptId(authAttemptId)
        return smAccessToken;
        return new Builder().setAuthStatus(SMAuthStatus.SUCCESS)
        }
    private final String error;
    }
    private final String signOutLink;
 * you may not use this file except in compliance with the License.
        @NotNull String accessToken,
 */
        this.authData = authData;
    ) {
        private String authAttemptId;
    @Nullable
    private final boolean mainAuth;
                smRefreshToken,

    }
    public static SMAuthInfo inProgress(
            .build();
import org.jkiss.code.Nullable;
    private final String authRole;
        private String smAccessToken;

    }
                smAccessToken,
            this.signInLink = signInLink;
    private SMAuthInfo(
    public static SMAuthInfo expired(
            .setAuthAttemptId(authAttemptId)
        @NotNull SMAuthStatus authStatus,
        @NotNull String appSessionId

import org.jkiss.code.NotNull;
            .setAuthStatus(SMAuthStatus.EXPIRED)


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        boolean forceSessionsLogout,
        }

            return smAuthToken;
    public String getSignOutLink() {
            this.error = error;

 * Copyright (C) 2010-2025 DBeaver Corp and others
    @NotNull
 * See the License for the specific language governing permissions and
    public String getSignInLink() {

        this.authStatus = authStatus;
    private final String authAttemptId;
    }
        @NotNull Map<SMAuthConfigurationReference, Object> authData,
        @NotNull String appSessionId
        }
        private String smRefreshToken;
            .setSignInLink(signInLink)
        boolean mainAuth,
            .setForceSessionsLogout(forceSessionsLogout)
        return authPermissions;
            this.forceSessionsLogout = forceSessionsLogout;
 * You may obtain a copy of the License at
    @Nullable
            this.errorCode = errorCode;
    public String getError() {
    @NotNull

        return authData;
        return smRefreshToken;
    }
        private Builder() {

            return this;
        @NotNull String error,
        public Builder setError(String error) {
    }
        @NotNull String appSessionId
                signInLink,
            .setError(error)

        public Builder setSignOutLink(String signOutLink) {
    public static SMAuthInfo successMainSession(
            this.authPermissions = authPermissions;
            this.mainAuth = mainAuth;
            .build();

/*
        @NotNull Map<SMAuthConfigurationReference, Object> authData,
    @Nullable
        SMAuthPermissions permissions,
            );

 *
    }
            .build();
        private String errorCode;

            return this;
    public String getAuthRole() {
    @Nullable
    private final Map<SMAuthConfigurationReference, Object> authData;
        this.error = error;
        return new Builder()
    public String getErrorCode() {
            return this;
    private final boolean forceSessionsLogout;

            return this;
            return this;
            .setMainAuth(true)
        this.errorCode = errorCode;
        }
            .setAppSessionId(appSessionId)
        }
        }
            this.smAccessToken = smAccessToken;
    }
        }
            .build();
        }
    private final String redirectUrl;
        }
        this.authAttemptId = authAttemptId;
            .setAppSessionId(appSessionId)

    }
        }
            .setErrorCode(errorCode)
            .setAuthData(authData)
import java.util.Map;
            .setAuthData(authData)
            .setAuthRole(authRole)
