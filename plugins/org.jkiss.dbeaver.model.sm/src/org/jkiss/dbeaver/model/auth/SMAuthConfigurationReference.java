


    @NotNull
        this.authProviderId = authProviderId;
 * limitations under the License.
    public boolean equals(Object o) {

        @Nullable String authProviderConfigurationId
    ) {
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getAuthProviderConfigurationId() {
import java.util.Objects;
    @Override
 *
    private final String authProviderId;

import org.jkiss.code.Nullable;
 *
    public String toString() {

    }
        return authProviderId + ":" + authProviderConfigurationId;
import org.jkiss.code.NotNull;
    public int hashCode() {
    }
            that.authProviderConfigurationId);
/*
public class SMAuthConfigurationReference {
 */
        SMAuthConfigurationReference that = (SMAuthConfigurationReference) o;
        return Objects.hash(authProviderId, authProviderConfigurationId);
    @NotNull

    }
    @Override
    }
    }
    public String getAuthProviderId() {
    @Override

 * DBeaver - Universal Database Manager
        return authProviderId;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (o == null || getClass() != o.getClass()) return false;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
    public SMAuthConfigurationReference(
        @NotNull String authProviderId,
    }
 *
        this.authProviderConfigurationId = authProviderConfigurationId;
}
package org.jkiss.dbeaver.model.auth;
    @Nullable

    private final String authProviderConfigurationId;
        if (this == o) return true;
        return Objects.equals(authProviderId, that.authProviderId) && Objects.equals(authProviderConfigurationId,
 * You may obtain a copy of the License at
        return authProviderConfigurationId;
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
