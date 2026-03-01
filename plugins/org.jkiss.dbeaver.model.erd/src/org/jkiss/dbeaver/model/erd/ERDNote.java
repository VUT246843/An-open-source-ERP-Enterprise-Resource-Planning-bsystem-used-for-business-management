    }

    public void fromMap(@NotNull ERDContext context, Map<String, Object> map) {
    }
import java.util.LinkedHashMap;
        return map;
 *

import org.jkiss.utils.CommonUtils;
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
    }
 */
 */
    @Override
 *
        return getObject();
    @Override

        super.setObject(CommonUtils.notEmpty(object));
 *     http://www.apache.org/licenses/LICENSE-2.0
        super(CommonUtils.notEmpty(text));
    public String getName() {

package org.jkiss.dbeaver.model.erd;
    @Override
import org.jkiss.code.NotNull;
 * Simple text note
    }
    }
/*
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public ERDNote(String text) {

        setObject(JSONUtils.getString(map, "note"));
 * you may not use this file except in compliance with the License.

    @Override
 * limitations under the License.

        map.put("note", getObject());
    public void setObject(String object) {
    public Map<String, Object> toMap(@NotNull ERDContext context, boolean fullInfo) {

}
import java.util.Map;
 * DBeaver - Universal Database Manager
    @NotNull
 * See the License for the specific language governing permissions and
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.data.json.JSONUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
public class ERDNote extends ERDElement<String> {
 *
        Map<String, Object> map = new LinkedHashMap<>();
 * Licensed under the Apache License, Version 2.0 (the "License");
