 *
        this.users = users;
    public boolean hasUsers() {
        return criteria;
    }
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

        this.ipAddresses = ipAddresses;
    @NotNull
        this.users = users;
 *
import java.util.Set;
 * DBeaver - Universal Database Manager
    public QMAdminEventCriteria(QMEventCriteria criteria, @NotNull Set<String> users, @NotNull Set<String> ipAddresses) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public Set<String> getIpAddresses() {
        this.ipAddresses = ipAddresses;
    private final QMEventCriteria criteria;

    }

 * Copyright (C) 2010-2026 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    }

    @NotNull

 * limitations under the License.
    @NotNull
    public Set<String> getUsers() {
        return !users.isEmpty();
    @NotNull
 * you may not use this file except in compliance with the License.
    public void setUsers(@NotNull Set<String> users) {
        return ipAddresses;
 * Unless required by applicable law or agreed to in writing, software
public class QMAdminEventCriteria {


 * Licensed under the Apache License, Version 2.0 (the "License");
    public QMEventCriteria getCriteria() {

        this.criteria = criteria;

 * See the License for the specific language governing permissions and
    public void setIpAddresses(@NotNull Set<String> ipAddresses) {
}
    }
    private Set<String> users;
import org.jkiss.code.NotNull;
 */

package org.jkiss.dbeaver.model.qm.filters;
        return users;
    private Set<String> ipAddresses;
    }

/*
    }
 * You may obtain a copy of the License at

