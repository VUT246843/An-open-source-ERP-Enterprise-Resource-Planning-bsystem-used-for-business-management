    public String getColumnName()
import org.jkiss.utils.CommonUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
}
 */
    public boolean isSupported()
 * limitations under the License.
    {
    {
    public GenericMetaColumn(IConfigurationElement cfg)
        return supported;
            this.columnIndex = Integer.valueOf(indexStr);
        String supportedStr = cfg.getAttribute("supported");
import org.eclipse.core.runtime.IConfigurationElement;
 * Meta column mapping
 *
        return columnIndex;
    }
 *
/*
public class GenericMetaColumn {
    {
        this.columnName = cfg.getAttribute("name");
        } else {
 * you may not use this file except in compliance with the License.


    private final String id;
package org.jkiss.dbeaver.ext.generic.model.meta;
 * Unless required by applicable law or agreed to in writing, software
    public int getColumnIndex()

/**
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private final Integer columnIndex;
        return columnIndex == null ? columnName : columnIndex;

        if (!CommonUtils.isEmpty(indexStr)) {
        this.id = cfg.getAttribute("id");
    public Object getColumnIdentifier()
    {

            this.columnIndex = null;
    private final boolean supported;
    }
    public String getId()
    {
    }
 *
 * See the License for the specific language governing permissions and

 * distributed under the License is distributed on an "AS IS" BASIS,
        return id;
        return columnName;
 * You may obtain a copy of the License at
    private final String columnName;

    {
        String indexStr = cfg.getAttribute("index");
        this.supported = !"false".equals(supportedStr);
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        }
    }
    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
 */

