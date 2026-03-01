    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
import org.jkiss.code.NotNull;
    @NotNull
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
/*


 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    }
    public void setEditIntention(@NotNull DBPConnectionEditIntention editIntention) {
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui;
 * DBeaver - Universal Database Manager
 *

    public DBPConnectionEditIntention getEditIntention() {
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.registry.configurator.DBPConnectionEditIntention;

 * Unless required by applicable law or agreed to in writing, software
    private DBPConnectionEditIntention editIntention = DBPConnectionEditIntention.DEFAULT;
 * you may not use this file except in compliance with the License.
        return this.editIntention;
public abstract class AbstractObjectPropertyConfigurator<OBJECT, SETTINGS> implements IObjectPropertyConfigurator<OBJECT, SETTINGS> {
 * limitations under the License.
        this.editIntention = editIntention;
 */
}
