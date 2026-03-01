
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");

 * distributed under the License is distributed on an "AS IS" BASIS,
    
    
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
    @Override
 * limitations under the License.
    protected AltibaseReplication parent;
    }
    }
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
import org.jkiss.code.Nullable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public AltibaseDataSource getDataSource() {
    }
        return null;
/*


 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
    @NotNull
        super(parent, parent.getName(), false);
        return parent;
    public String getDescription() {
 *
    }

        return false;
public abstract class AltibaseReplicationModule extends AltibaseObject<AltibaseReplication> {
import org.jkiss.code.NotNull;
    public boolean isPersisted() {
    public AltibaseReplication getParentObject() {
        this.parent = parent;
    protected AltibaseReplicationModule(AltibaseReplication parent) {
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
        return parent.getDataSource();
 *
    @Override

    }
 */
package org.jkiss.dbeaver.ext.altibase.model;

    @NotNull
}
