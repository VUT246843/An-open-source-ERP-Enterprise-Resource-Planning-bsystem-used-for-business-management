 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (type instanceof ClickhouseTableColumn) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
    protected boolean isMultiValue(IValueController controller) {
}
    }
public class ClickhouseEnumValueManager extends EnumValueManager {
    }
 * See the License for the specific language governing permissions and
/*
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
import org.jkiss.dbeaver.ui.data.IValueController;
 * You may obtain a copy of the License at
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        final DBSTypedObject type = controller.getValueType();
    @Override
    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.data.managers.EnumValueManager;
        return false;
import java.util.List;
            return List.copyOf(((ClickhouseTableColumn) type).getEnumEntries().keySet());
        }

    @Override
    protected List<String> getSetValues(IValueController controller, Object value) {
 *
    protected List<String> getEnumValues(IValueController controller) {
import org.jkiss.dbeaver.ext.clickhouse.model.ClickhouseTableColumn;
package org.jkiss.dbeaver.ext.clickhouse.ui;
 * Unless required by applicable law or agreed to in writing, software

    @Override
 */
 * limitations under the License.
        return null;
        return null;


