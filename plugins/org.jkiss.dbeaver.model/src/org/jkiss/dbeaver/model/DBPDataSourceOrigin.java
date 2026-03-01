    String getDisplayName();
    @NotNull
    /**
 * It can be local configuration or some cloud provider.
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @NotNull
    @NotNull
public interface DBPDataSourceOrigin extends DBPObjectWithDetails<DBPDataSourceContainer> {
    @NotNull

 * See the License for the specific language governing permissions and
     */
    /**


     */
 */

 * DBeaver - Universal Database Manager
    DBPImage getIcon();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import org.jkiss.code.NotNull;

 * limitations under the License.
 *
}
 * You may obtain a copy of the License at

 *     http://www.apache.org/licenses/LICENSE-2.0
        return getType() + (getSubType() == null ? "" : "." + getSubType());

    Map<String, Object> getDataSourceConfiguration();
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
    default String getFullType(){
import java.util.Map;
 * Configuration origin.

    boolean isDynamic();
/**


    }
 */
    @Nullable
/*
     * Origin sub type
    String getSubType();
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model;
    String getType();
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.Nullable;

     * Origin type. Unique
 *
