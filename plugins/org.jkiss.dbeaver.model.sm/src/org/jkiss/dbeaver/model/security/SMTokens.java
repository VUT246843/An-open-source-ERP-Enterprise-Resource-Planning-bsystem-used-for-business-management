 */

        this.smRefreshToken = smRefreshToken;
import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
    public String getSmAccessToken() {
        return smRefreshToken;

 * See the License for the specific language governing permissions and
    public String getSmRefreshToken() {
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
    @NotNull
        return smAccessToken;
 * limitations under the License.
    private final String smAccessToken;
 *
        this.smAccessToken = smAccessToken;
}
package org.jkiss.dbeaver.model.security;
    }
 * Unless required by applicable law or agreed to in writing, software
    private final String smRefreshToken;
 *
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
    public SMTokens(@NotNull String smAccessToken, @NotNull String smRefreshToken) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    @NotNull

 * distributed under the License is distributed on an "AS IS" BASIS,
/*

    @NotNull
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class SMTokens {
    }
