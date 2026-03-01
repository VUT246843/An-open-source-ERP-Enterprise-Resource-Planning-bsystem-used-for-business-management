 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.meta.Property;
 * limitations under the License.

    public String getCollation() {

import org.jkiss.utils.CommonUtils;
    private TriggerEventType eventType;
        super(container, name, null);
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    public String getDescription() {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
    @Override
            this.eventType = eventType;
    }
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
        public String getEventType() {

            this.eventType = CommonUtils.valueOf(TriggerEventType.class, eventTypeLetter);
        private final String eventType;

        return super.getDescription();
        return eventType.getEventType();

 * See the License for the specific language governing permissions and
 *
}
 *
        D("DELETE"), I("INSERT"), U("UPDATE"), S("SELECT"), d("INSTEAD OF Delete"), i("INSTEAD OF Insert"),

        if (CommonUtils.isNotEmpty(eventTypeLetter)) {

public class GBase8sTableTrigger extends GenericTableTrigger {
 *
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public enum TriggerEventType {
/**
    private final String collation;
            return eventType;
    public GBase8sTableTrigger(@NotNull GenericTableBase container, String name, @NotNull JDBCResultSet resultSet) {

    }
 */
        }
 * @author Chao Tian
    }

    @Property(viewable = true, order = 5)
        String eventTypeLetter = JDBCUtils.safeGetString(resultSet, "event");
        return collation;
        this.collation = JDBCUtils.safeGetString(resultSet, "collation");
package org.jkiss.dbeaver.ext.gbase8s.model;
        private TriggerEventType(String eventType) {
    }

    public String getEventType() {
    }
 */
import org.jkiss.dbeaver.ext.generic.model.GenericTableTrigger;
        }
    @Property(viewable = true, order = 6)
/*
import org.jkiss.code.Nullable;
        u("INSTEAD OF Update");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
