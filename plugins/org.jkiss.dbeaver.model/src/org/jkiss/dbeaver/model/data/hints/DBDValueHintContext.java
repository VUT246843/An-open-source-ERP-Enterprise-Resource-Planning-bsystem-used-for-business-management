    Object getHintContextAttribute(@NotNull String name);
import org.jkiss.dbeaver.model.struct.DBSDataContainer;

/*
    void setConfigurationLevel(HintConfigurationLevel level);

 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
 * It is usually a data viewer presentation.
 * Every hint provider may get/set any number of custom attributes here

        DATASOURCE,
    /**
     */


 * you may not use this file except in compliance with the License.

 *
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        ENTITY
 * Context remains the same for a data container (e.g. a table).

package org.jkiss.dbeaver.model.data.hints;
import org.jkiss.dbeaver.model.struct.DBSEntity;
    /**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    enum HintConfigurationLevel {
/**
 * Value hint context.
    DBSDataContainer getDataContainer();
import org.jkiss.code.NotNull;
     * Get context attribute value
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");

    DBSEntity getContextEntity();
}
        GLOBAL,
 * Copyright (C) 2010-2024 DBeaver Corp and others
    void setHintContextAttribute(@NotNull String name, @Nullable Object value);
 */
 * Context can be used by hint providers to keep cache related to data container.
public interface DBDValueHintContext {
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
     * Set context attribute value
 * See the License for the specific language governing permissions and
    @Nullable
    HintConfigurationLevel getConfigurationLevel();
import org.jkiss.code.Nullable;
 */
     */
 *

 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable

