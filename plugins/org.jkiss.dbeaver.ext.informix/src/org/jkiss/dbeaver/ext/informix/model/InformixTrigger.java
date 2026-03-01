        d("INSTEAD OF Delete"),
 *

    }
        i("INSTEAD OF Insert"),
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
 * See the License for the specific language governing permissions and
/*
    public enum TriggerEventType {

        U("UPDATE"),
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    public String getEventType() {
import org.jkiss.dbeaver.model.meta.Property;
        return eventType.getEventType();
public class InformixTrigger extends GenericTableTrigger {
            this.eventType = eventType;
    }
        this.afterValue = JDBCUtils.safeGetString(resultSet, "new");

            this.eventType = CommonUtils.valueOf(TriggerEventType.class, eventTypeLetter);
        String eventTypeLetter = JDBCUtils.safeGetString(resultSet, "event");
    private TriggerEventType eventType;
    @Property(viewable = true, order = 6)
        return super.getDescription();
        }
    @Override
    private final String beforeValue;
    @Property(viewable = true, order = 5)
        private final String eventType;

package org.jkiss.dbeaver.ext.informix.model;
 * Unless required by applicable law or agreed to in writing, software
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.code.NotNull;

        return afterValue;

 * Licensed under the Apache License, Version 2.0 (the "License");
        u("INSTEAD OF Update");
    }
        public String getEventType() {

 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
 * limitations under the License.
        return beforeValue;
            return eventType;
    private final String collation;

    public InformixTrigger(@NotNull GenericTableBase container, String name, @NotNull JDBCResultSet resultSet) {

    }
import org.jkiss.code.Nullable;
    // Hide property
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public String getCollation() {
    private final String afterValue;
 * You may obtain a copy of the License at
        S("SELECT"),

    }
        if (CommonUtils.isNotEmpty(eventTypeLetter)) {
        this.beforeValue = JDBCUtils.safeGetString(resultSet, "old");
        TriggerEventType(String eventType) {
        super(container, name, null);
import org.jkiss.dbeaver.ext.generic.model.GenericTableTrigger;
        return collation;
    @Property(viewable = true, order = 8)
        D("DELETE"),


    public String getAfterValue() {
 *
import org.jkiss.utils.CommonUtils;

        }
        I("INSERT"),
    @Nullable
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
    public String getBeforeValue() {
    }
 *
    public String getDescription() {
 * you may not use this file except in compliance with the License.
        this.collation = JDBCUtils.safeGetString(resultSet, "collation");
    @Property(viewable = true, order = 7)
