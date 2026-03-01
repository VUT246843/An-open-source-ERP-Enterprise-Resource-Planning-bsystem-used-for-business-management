 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.access.DBAPrivilege;

 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
import org.jkiss.code.NotNull;
    protected AltibasePriv(AltibaseGrantee user, String name) {
 * Unless required by applicable law or agreed to in writing, software
        super(user, name, true);

    public String getName() {
 * You may obtain a copy of the License at
 */
/*
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ext.altibase.model;
 *
 *
}
        return super.getName();
 * you may not use this file except in compliance with the License.

public class AltibasePriv extends AltibaseObject<AltibaseGrantee> implements DBAPrivilege {
 * distributed under the License is distributed on an "AS IS" BASIS,

