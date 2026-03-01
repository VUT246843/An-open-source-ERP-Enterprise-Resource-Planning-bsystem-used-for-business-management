        return options == null ? Collections.emptyMap() : options;
    public Boolean getEnabled() {
        OBJECT_ADD,
        OBJECT_SELECT,
 * DBPEvent
    }
import java.util.Map;
    private final Object data;

    }
        OBJECT_REMOVE,
    public void setOptions(Map<String, Object> options) {
/*


    @NotNull

    @Nullable
/**
 * distributed under the License is distributed on an "AS IS" BASIS,

    }
    {
    }
 */
    public Object getData() {

    private final Action action;
        return action;
        this.enabled = enabled;
        this.options = options;
        OBJECT_UPDATE,
    }
    public Map<String, Object> getOptions() {
 */
        this.object = object;
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Copyright (C) 2010-2024 DBeaver Corp and others


 *

    public Action getAction()
    public DBPEvent(Action action, DBSObject object) {

    public static final Object REORDER = new Object();
{
        this.object = object;
    }
import org.jkiss.code.NotNull;
        return object;
        this.data = data;
 * You may obtain a copy of the License at
    }
}

 * Licensed under the Apache License, Version 2.0 (the "License");
        return enabled;

    public enum Action
 *
package org.jkiss.dbeaver.model;
import java.util.Collections;
        this(action, object, null);
    }
        AFTER_CONNECT,
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 *
    private Boolean enabled;
        this.action = action;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.struct.DBSObject;
    public DBPEvent(Action action, DBSObject object, @Nullable Object data) {
        this.data = data;
    }
    }

        this.action = action;
    {
    public static final Object RENAME = new Object();

    public DBPEvent(Action action, DBSObject object, boolean enabled, @Nullable Object data) {

public class DBPEvent
    public DBPEvent(Action action, DBSObject object, boolean enabled) {
        this(action, object, enabled, null);
    public DBSObject getObject() {
    }
        return data;
 * DBeaver - Universal Database Manager

 * you may not use this file except in compliance with the License.
 * limitations under the License.
        BEFORE_CONNECT,
    private Map<String, Object> options;
    private final DBSObject object;
