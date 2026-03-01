        return page;
        return userIdMask;
        this.userIdMask = null;
    @Nullable
        this.userIdMask = userIdMask;
    }
    public String toString() {
    public String getUserIdMask() {
 * Unless required by applicable law or agreed to in writing, software
        return "SMUserFilter{" +

 * See the License for the specific language governing permissions and
    }
    public DBPPage getPage() {
 * You may obtain a copy of the License at
    }
    }


 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    private Boolean enabledState;

}
    }

package org.jkiss.dbeaver.model.security.user;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    private DBPPage page;

public class SMUserFilter {
        this.page = page;
        return enabledState;
            "enabledState=" + enabledState +
    public SMUserFilter(@NotNull DBPPage page) {
    @Nullable
import org.jkiss.dbeaver.model.DBPPage;
    @Override
    private String userIdMask;
    }
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.userIdMask = userIdMask;
 * limitations under the License.
    public void setEnabledState(@Nullable Boolean enabledState) {
    @Nullable
 *
            '}';

    public SMUserFilter(@Nullable String userIdMask, @Nullable Boolean enabledState, @NotNull DBPPage page) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
        this.page = page;
            ", page=" + page +

 * DBeaver - Universal Database Manager
        this.enabledState = enabledState;
    @NotNull
    }
    public void setPage(@NotNull DBPPage page) {
    public void setUserIdMask(@Nullable String userIdMask) {
    @Nullable
    @NotNull

    public Boolean getEnabledState() {
        this.enabledState = enabledState;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.Nullable;
import org.jkiss.code.NotNull;

    }
/*
        this.enabledState = null;

            ", userIdMask='" + userIdMask + '\'' +
        this.page = page;
 *

