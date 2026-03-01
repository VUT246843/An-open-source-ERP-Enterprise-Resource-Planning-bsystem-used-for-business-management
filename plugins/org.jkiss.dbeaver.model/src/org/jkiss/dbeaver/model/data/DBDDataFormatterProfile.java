/**
    void setProfileName(@NotNull String name);
 * Licensed under the Apache License, Version 2.0 (the "License");
    String getProfileName();
/*



 */

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 * Unless required by applicable law or agreed to in writing, software
    Locale getLocale();
    @NotNull
 * DBeaver - Universal Database Manager
    void setLocale(@NotNull Locale locale);

import org.jkiss.code.NotNull;
import java.util.Map;

    
import java.io.IOException;
 *

}
    boolean isOverridesParent();
 * Data formatter profile

 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @NotNull
        @NotNull Map<String, Object> properties);
        @NotNull String typeId,
 * See the License for the specific language governing permissions and
public interface DBDDataFormatterProfile {
import java.util.Locale;
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.model.data;


    void saveProfile(@NotNull DBPPreferenceStore store) throws IOException;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    Map<String, Object> getFormatterProperties(@NotNull DBPPreferenceStore store, @NotNull String typeId);

 *
    @NotNull
 */

    void setFormatterProperties(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 * You may obtain a copy of the License at
        @NotNull DBPPreferenceStore store,
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
    DBPPreferenceStore getPreferenceStore();
    DBDDataFormatter createFormatter(@NotNull String typeId, DBSTypedObject type) throws ReflectiveOperationException;

    void reset(@NotNull DBPPreferenceStore store);
 * limitations under the License.
