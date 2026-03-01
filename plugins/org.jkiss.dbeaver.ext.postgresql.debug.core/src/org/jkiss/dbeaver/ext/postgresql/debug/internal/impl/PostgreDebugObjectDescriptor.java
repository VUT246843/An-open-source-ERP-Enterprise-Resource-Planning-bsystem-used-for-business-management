

 *
        return proname;
    }
 * Copyright (C) 2017-2018 Andrew Khitrin (ahitrin@gmail.com)
 */
public class PostgreDebugObjectDescriptor implements DBGObjectDescriptor {
 * See the License for the specific language governing permissions and
        this.proname = proname;

    @Override
    public Map<String, Object> toMap() {
@SuppressWarnings("nls")


    public String toString() {
 * You may obtain a copy of the License at
        return map;
    public PostgreDebugObjectDescriptor(Integer oid, String proname, String owner, String schema, String lang) {
    }
    }
    public String getOwner() {


        this.lang = lang;
    private final String proname;
import java.util.Map;
        this.oid = oid;
    public String getLang() {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)

 * Unless required by applicable law or agreed to in writing, software
        return lang;
    private final String owner;
    public Integer getID() {
/*
        return schema;
    private final String schema;
    @Override
    private final String lang;
        super();

    public String getName() {
        map.put("oid", oid);
 * you may not use this file except in compliance with the License.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getSchema() {
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

    @Override

}
    }
    }
                + schema + ")";
 * DBeaver - Universal Database Manager
 * limitations under the License.

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("proname", proname);
package org.jkiss.dbeaver.ext.postgresql.debug.internal.impl;

 *
        return oid;


import org.jkiss.dbeaver.debug.DBGObjectDescriptor;
    private final Integer oid;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        this.schema = schema;

        return "id:" + String.valueOf(oid) + ", name: `" + proname + "(" + lang + ")" + ", user: " + owner + "("
        map.put("lang", lang);

import java.util.HashMap;
        return owner;
    @Override
        map.put("schema", schema);
        map.put("owner", owner);
    }
        this.owner = owner;

