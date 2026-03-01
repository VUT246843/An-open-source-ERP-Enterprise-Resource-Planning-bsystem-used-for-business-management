 *     http://www.apache.org/licenses/LICENSE-2.0
 *
        triggeredActionLevel = JDBCUtils.safeGetString(resultSet, "TRIGGERED_ACTION_LEVEL");


        return super.getDescription();
    @Property(viewable = true, order = 8)


        return triggerEvent;
    public String getTriggerEvent() {
import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
        definition = JDBCUtils.safeGetString(resultSet, "DEFINITION");
    @Property(viewable = true, order = 6)
import java.util.Date;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        return triggeredActionLevel;
    @Property(viewable = true, order = 7)
 * limitations under the License.
    public boolean isValid() {
    }
    private final String definition;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
    private final boolean isValid;

        return isValid;
import org.jkiss.code.Nullable;


    private final String triggeredActionLevel;
        return createTime;
        return definition;

    private final Date createTime;
 * Unless required by applicable law or agreed to in writing, software
    public HANATrigger(@NotNull GenericTableBase container, String name, @NotNull JDBCResultSet resultSet) {
        return isEnabled;
 * you may not use this file except in compliance with the License.
        isValid = JDBCUtils.safeGetBoolean(resultSet, "IS_VALID");
import org.jkiss.dbeaver.model.meta.Property;
package org.jkiss.dbeaver.ext.hana.model;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String getTriggerActionTime() {
    private final String triggerEvent;


    }
    @Property(viewable = true, order = 9)
    }
    public String getTriggeredActionLevel() {
/*
    private final String triggerActionTime;
        triggerEvent = JDBCUtils.safeGetString(resultSet, "TRIGGER_EVENT");
        return triggerActionTime;
 * See the License for the specific language governing permissions and
    @Property(viewable = true, order = 5)
public class HANATrigger extends GenericTableTrigger {
        createTime = JDBCUtils.safeGetDate(resultSet, "CREATE_TIME");
    @Property(viewable = true, order = 10)
        triggerActionTime = JDBCUtils.safeGetString(resultSet, "TRIGGER_ACTION_TIME");
}
    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
    // Hide property
 * You may obtain a copy of the License at
    public boolean isEnabled() {
    }
        isEnabled = JDBCUtils.safeGetBoolean(resultSet, "IS_ENABLED");

 * Copyright (C) 2010-2024 DBeaver Corp and others

    @Nullable
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ext.generic.model.GenericTableBase;
 *
    private final boolean isEnabled;
    public Date getCreateTime() {
    public String getDefinition() {
        super(container, name, null);
    @Override
    public String getDescription() {
import org.jkiss.dbeaver.ext.generic.model.GenericTableTrigger;
    }
 *

    }
