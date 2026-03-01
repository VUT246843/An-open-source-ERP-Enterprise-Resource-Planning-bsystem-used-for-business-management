 * Copyright (C) 2010-2024 DBeaver Corp and others

 * limitations under the License.
 *
/*
    @Property(viewable = true, editable = true, updatable = false, order = 10)
        super(container, name, description);
    }
        return sequence;
    }
 * FireBirdTrigger

 */
    @Property(viewable = true, editable = true, updatable = false, order = 11)
 * You may obtain a copy of the License at

    private final int sequence;
import org.jkiss.dbeaver.model.meta.Property;
    public boolean isSystem() {
 * distributed under the License is distributed on an "AS IS" BASIS,
        return isSystem;
    }
public abstract class FireBirdTrigger<OWNER extends DBSObject> extends GenericTrigger implements DBPSystemObject {
}
 * DBeaver - Universal Database Manager
/**
    public int getSequence() {

    public String getTriggerType() {
    }

import org.jkiss.dbeaver.ext.generic.model.GenericTrigger;
 *

    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.isSystem = isSystem;
        this.sequence = sequence;
    public FireBirdTrigger(OWNER container, String name, String description, FireBirdTriggerType type, int sequence, boolean isSystem) {
    private final FireBirdTriggerType type;
package org.jkiss.dbeaver.ext.firebird.model;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
        return type;

import org.jkiss.dbeaver.model.struct.DBSObject;
        this.type = type;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
 */
        return type.getDisplayName();

    private final boolean isSystem;
    }

 * Unless required by applicable law or agreed to in writing, software
    public FireBirdTriggerType getType() {
import org.jkiss.dbeaver.model.DBPSystemObject;
 * See the License for the specific language governing permissions and
