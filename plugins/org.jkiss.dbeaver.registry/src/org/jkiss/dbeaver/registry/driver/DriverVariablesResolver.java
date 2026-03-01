    static final String VAR_DRIVERS_HOME = "drivers_home";
    @Nullable
 *
class DriverVariablesResolver extends SystemVariablesResolver {
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
    public String get(@NotNull String name) {
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
 *
import org.jkiss.dbeaver.utils.SystemVariablesResolver;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
package org.jkiss.dbeaver.registry.driver;
    }
        if (name.equalsIgnoreCase(VAR_DRIVERS_HOME)) {
            return super.get(name);

 * Unless required by applicable law or agreed to in writing, software
            return DriverDescriptor.getCustomDriversHome().toAbsolutePath().toString();
 */
/*
 * limitations under the License.
 * You may obtain a copy of the License at
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
        } else {
}

import org.jkiss.code.Nullable;

