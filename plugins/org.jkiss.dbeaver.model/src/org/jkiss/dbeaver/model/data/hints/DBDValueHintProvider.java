     */
 * You may obtain a copy of the License at
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
    int OPTION_ROW_EXPANDED = 1 << 4; // Passed row is expanded (has sub-rows)
 * See the License for the specific language governing permissions and
 */
        COLUMN,
/*


    }
 */
    /**
    int OPTION_INLINE = 1;          // Default tip for data viewer grid
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * DBeaver - Universal Database Manager

 * Copyright (C) 2010-2024 DBeaver Corp and others
    int OPTION_ACTION_TOOLTIP = 1 << 3; // Tooltip for hint action button
public interface DBDValueHintProvider {
    int OPTION_ADVANCED = 1 << 1;   // ?


        CELL,
 *
    int OPTION_APPROXIMATE = 1 << 5; // Return hints ignoring actual row values
 * Abstract hint provider
 * Unless required by applicable law or agreed to in writing, software
    enum HintObject {
    int OPTION_TOOLTIP = 1 << 2;    // Hint for tooltip. Maybe return different hint (extended)
     * Hint object: cell, column or row
package org.jkiss.dbeaver.model.data.hints;
 *
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
        ROW,
 *     http://www.apache.org/licenses/LICENSE-2.0
