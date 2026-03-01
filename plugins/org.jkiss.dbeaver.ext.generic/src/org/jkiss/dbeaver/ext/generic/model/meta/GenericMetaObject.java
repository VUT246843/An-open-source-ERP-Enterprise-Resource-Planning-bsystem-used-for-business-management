    public String getType()
import java.util.HashMap;
 * Unless required by applicable law or agreed to in writing, software
/*

    {
        this.type = cfg.getAttribute("type");
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
            columnsMap.put(column.getId(), column);
        return readQuery;
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
        for (IConfigurationElement columnCfg : cfg.getChildren("column")) {
 */

 * limitations under the License.
    public GenericMetaColumn getColumn(String id)
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.core.runtime.IConfigurationElement;
 * distributed under the License is distributed on an "AS IS" BASIS,


package org.jkiss.dbeaver.ext.generic.model.meta;
 * Meta object description
    }
            GenericMetaColumn column = new GenericMetaColumn(columnCfg);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
    }
    private final String readQuery;

    private final String type;
/**
    public GenericMetaObject(IConfigurationElement cfg)
public class GenericMetaObject {
    {

 */
}

        this.readQuery = cfg.getAttribute("read-query");
        return columnsMap.get(id);
import java.util.Map;
    {
    private final Map<String, GenericMetaColumn> columnsMap = new HashMap<>();
    public String getReadQuery()
        }
 * You may obtain a copy of the License at
        return type;

 * DBeaver - Universal Database Manager

 * See the License for the specific language governing permissions and
 *
 *
    }
