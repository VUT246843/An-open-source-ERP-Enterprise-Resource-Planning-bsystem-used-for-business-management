}
        this.authRole = authRole;
        public SMUserProvisioningBuilder metaParameters(Map<String, String> metaParameters) {
            this.userId = userId;
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
        }

        private Map<String, String> metaParameters;
        return userId;

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    @NotNull
        private String userId;
        public static SMUserProvisioningBuilder aSMUserProvisioning() {
import org.jkiss.code.Nullable;
    public String getAuthRole() {

 *     http://www.apache.org/licenses/LICENSE-2.0
        private String authRole;

        }
    public Map<String, String> getMetaParameters() {
    }

 * limitations under the License.
    }
    private final String authRole;
 * you may not use this file except in compliance with the License.

 */
/*
 *
 * See the License for the specific language governing permissions and
        }
        public SMUserProvisioningBuilder authRole(String authRole) {
            return new SMUserProvisioningBuilder();
        this.userId = userId;
public class SMUserProvisioning {
        }

        this.metaParameters = metaParameters;

            return new SMUserProvisioning(userId, metaParameters, authRole);
    private final Map<String, String> metaParameters;
    public static SMUserProvisioningBuilder builder() {

            this.authRole = authRole;
        public SMUserProvisioningBuilder userId(String userId) {

        }


    @Nullable
 *

        private SMUserProvisioningBuilder() {
    @Nullable
    private final String userId;
        return new SMUserProvisioningBuilder();
            return this;

 * Unless required by applicable law or agreed to in writing, software
 *

import java.util.Map;

    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
    public SMUserProvisioning(@NotNull String userId, @NotNull Map<String, String> metaParameters, @Nullable String authRole) {

    }
        }
    public static final class SMUserProvisioningBuilder {
        return metaParameters;
        return authRole;
package org.jkiss.dbeaver.model.security.user;
        public SMUserProvisioning build() {
            return this;
    public String getUserId() {
            this.metaParameters = metaParameters;
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
            return this;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @NotNull
    }
    }
