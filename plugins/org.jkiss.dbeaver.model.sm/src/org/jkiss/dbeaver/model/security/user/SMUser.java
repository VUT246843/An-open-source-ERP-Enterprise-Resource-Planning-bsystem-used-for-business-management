        return enabled ? null : disableDate;
import java.time.Instant;
    private Instant disableDate;
    private String disabledBy;

        return enabled ? null : disabledBy;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
        @Nullable String authRole
        return enabled;
    @Property(viewable = true, order = 1)
        return subjectId;
        boolean enabled,
package org.jkiss.dbeaver.model.security.user;
        super(userId, metaParameters, secretStorage);

 *
        @NotNull String[] teams,
        this.disableReason = disableReason;
        @NotNull String userId,
        this.disabledBy = disabledBy;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        boolean secretStorage,
import java.util.Map;

        boolean enabled,

    @NotNull
    public void enableUser(boolean enabled) {
        this.disableDate = disableDate;
    }

        @Nullable Map<String, String> metaParameters,
 *
    public void setAuthRole(String authRole) {
    }

    }
        this.userTeams = userTeams;
    private boolean enabled;
        return authRole;

    public boolean isEnabled() {
    @Property(viewable = true, order = 3)
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    }
        this.enabled = enabled;
        @Nullable String disabledBy,
}
    public Instant getDisableDate() {
        return enabled ? null : disableReason;
    }
    @Nullable

    }
        return userTeams;
    @NotNull
        boolean enabled,
    private String disableReason;
    private String authRole;

    public String getDisableReason() {


    }
    @Property(viewable = true, order = 2)
        @NotNull String userId,
    }
        this.authRole = authRole;
 * you may not use this file except in compliance with the License.

    @Nullable
    }
        this(userId, null, new String[0], enabled, authRole, secretStorage, disableDate, disabledBy, disableReason);
    ) {
    public String[] getUserTeams() {
    public SMUser(
        return subjectId;
    @Nullable
    @Override
    private String[] userTeams;
    }
    public void setUserTeams(@NotNull String[] userTeams) {
        @NotNull String userId,
    }
import org.jkiss.dbeaver.model.meta.Property;
 *

    }
    ) {
    public SMUser(
    public String getAuthRole() {

        @Nullable Instant disableDate,
        this.enabled = enabled;
 */
 * limitations under the License.
    @Nullable
public class SMUser extends SMSubject {
        this.userTeams = teams;
    public String getName() {

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
        @Nullable String disableReason
        this.authRole = authRole;
        @Nullable String authRole,
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*

        @Nullable String disableReason
import org.jkiss.code.Nullable;
        this(userId, null, new String[0], enabled, authRole, true, null, null, null);

    @Nullable
    @NotNull

        @Nullable String authRole,
    public String getDisabledBy() {
    ) {
        @Nullable Instant disableDate,
 * See the License for the specific language governing permissions and
        @Nullable String disabledBy,
import org.jkiss.code.NotNull;
    public SMUser(
        boolean secretStorage,
 * You may obtain a copy of the License at

    public String getUserId() {
