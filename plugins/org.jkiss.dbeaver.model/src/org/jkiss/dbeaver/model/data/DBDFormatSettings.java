 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
public interface DBDFormatSettings {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
/**



 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and

     * Default value handler
 * limitations under the License.

 *
    boolean isUseNativeNumericFormat();

    /**
}
     * @return profile
 *
/*

     * @return value handler instance
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     */
 * distributed under the License is distributed on an "AS IS" BASIS,
     * Gets current context's data formatter profile
 */

    /**
    DBDValueHandler getDefaultValueHandler();
    @NotNull
 * You may obtain a copy of the License at
 * Data preferences
    boolean isUseNativeDateTimeFormat();
 * Licensed under the Apache License, Version 2.0 (the "License");
    boolean isUseScientificNumericFormat();
    DBDDataFormatterProfile getDataFormatterProfile();
     */
 */

package org.jkiss.dbeaver.model.data;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
