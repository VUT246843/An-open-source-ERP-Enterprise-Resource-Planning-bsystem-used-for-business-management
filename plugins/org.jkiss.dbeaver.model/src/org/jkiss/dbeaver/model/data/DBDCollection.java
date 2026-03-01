public interface DBDCollection extends DBDComplexValue, List<Object> {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * @author Serge Rider
 * DBeaver - Universal Database Manager
 *
package org.jkiss.dbeaver.model.data;
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
 *
 * Collection of items.
 */
    DBSDataType getComponentType();

    DBDValueHandler getComponentValueHandler();
    Object getItem(int index);
    int getItemCount();
 */

/**
 * Unless required by applicable law or agreed to in writing, software

    void setItem(int index, Object value);
 * Licensed under the Apache License, Version 2.0 (the "License");
/*


 * You may obtain a copy of the License at
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.DBSDataType;
 *     http://www.apache.org/licenses/LICENSE-2.0
}import java.util.List;
import org.jkiss.code.NotNull;
 *


 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Item index is zero-based.
 * limitations under the License.

    void setContents(Object[] contents);
    @NotNull


 *
