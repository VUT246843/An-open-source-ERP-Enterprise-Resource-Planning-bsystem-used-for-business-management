 */
 * Licensed under the Apache License, Version 2.0 (the "License");

 * You may obtain a copy of the License at
    @Nullable
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.model.preferences;


 *
/**
    void resetPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id);

    Object getEditableValue();
}
public interface DBPPropertySource {
 * Property source
    Object getPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id);
    boolean isPropertySet(@NotNull String id);
import org.jkiss.code.NotNull;

    DBPPropertyDescriptor[] getProperties();
 * Unless required by applicable law or agreed to in writing, software

 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
    boolean isPropertyResettable(@NotNull String id);

 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @NotNull
    @NotNull

    void setPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull String id, @Nullable Object value);
/*
import org.jkiss.code.Nullable;
    void resetPropertyValueToDefault(@NotNull String id);
 *     http://www.apache.org/licenses/LICENSE-2.0


 *
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

