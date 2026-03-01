 *
     * Retrieves policy data value from system environment or Windows registry

     *
 *
     * @param propertyName - property name
 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
    /**
 *     http://www.apache.org/licenses/LICENSE-2.0
    /**
 * You may obtain a copy of the License at
}
     * Return boolean value of policy data property
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
     */
    boolean isPolicyEnabled(@NotNull String propertyName);
    @Nullable
 * you may not use this file except in compliance with the License.
     * @param property  policy data property
    Object getPolicyValue(@NotNull String propertyName);
 */
     * @return policy data value or {@code null} if not found
     * @return - boolean value
package org.jkiss.dbeaver.model.app;
     * @return policy data value or {@code null} if not found
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
 * Provides policy data
 *
     *
     */
     */
/*

/**
    Object getPolicyProperty(@NotNull String property);
     *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**
     * @param propertyName  policy property name
import org.jkiss.code.Nullable;
 * limitations under the License.

public interface DBPPolicyProvider {
import org.jkiss.code.NotNull;

    @Nullable
     * Retrieves policy data value from system environment or Windows registry
 * Unless required by applicable law or agreed to in writing, software
