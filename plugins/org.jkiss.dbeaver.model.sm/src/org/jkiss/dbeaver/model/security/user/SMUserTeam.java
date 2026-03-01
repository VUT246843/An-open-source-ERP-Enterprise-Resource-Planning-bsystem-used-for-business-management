    @Nullable
    ) {
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class SMUserTeam extends SMTeam {
 * limitations under the License.
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
 *
import org.jkiss.code.NotNull;
        this.teamRole = teamRole;


 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final String teamRole;
    }
 */
    public SMUserTeam(
import org.jkiss.code.Nullable;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        super(smTeam.getTeamId(), smTeam.getTeamName(), smTeam.getDescription(), smTeam.isSecretStorage());
}
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");

    @Nullable
 * See the License for the specific language governing permissions and
        @NotNull SMTeam smTeam, @Nullable String teamRole
package org.jkiss.dbeaver.model.security.user;
        return teamRole;
 *
    public String getTeamRole() {
/*
 * You may obtain a copy of the License at
