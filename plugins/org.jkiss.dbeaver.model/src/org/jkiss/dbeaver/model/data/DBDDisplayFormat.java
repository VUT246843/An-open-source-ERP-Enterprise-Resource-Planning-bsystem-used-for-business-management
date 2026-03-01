
public enum DBDDisplayFormat {
 *
 *
        }
    ;
/**
 * distributed under the License is distributed on an "AS IS" BASIS,

package org.jkiss.dbeaver.model.data;
        }
* Values display format
        try {
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (string == null || string.isEmpty()) {
            return UI;
 * DBeaver - Universal Database Manager
import java.util.Locale;
    public static DBDDisplayFormat safeValueOf(String string) {
    EDIT,   // Format for editor

*/
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } catch (IllegalArgumentException e) {
 * you may not use this file except in compliance with the License.
    NATIVE  // SQL format
    }
 *
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
}
            return UI;
 * Unless required by applicable law or agreed to in writing, software
            return valueOf(string.toUpperCase(Locale.ENGLISH));
    UI,     // To represent in UI
 */
