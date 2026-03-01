        this.state = state;
    public int getPid() {


        map.put(APP_PROP, application);
        map.put(PID, pid);
 *
 */
    @Override
    }
    }
    }
        return pid;
        map.put(STATE_PROP, state);

    }
 * Copyright (C) 2017-2018 Andrew Khitrin (ahitrin@gmail.com)
    public PostgreDebugSessionInfo(int pid, String user, String application, String state, String query) {
/*
    public static final String STATE_PROP = "state";
 *

public class PostgreDebugSessionInfo implements DBGSessionInfo {
    }

import org.jkiss.dbeaver.debug.DBGSessionInfo;
    public String getState() {
    final int pid;

        return query;

 * Licensed under the Apache License, Version 2.0 (the "License");
        this.application = application;
    public String getApplication() {
                + state + ", query: " + query.replace('\n', '\\');
    public String getQuery() {
 * you may not use this file except in compliance with the License.
    @Override




        return state;
        this.user = user;
 * distributed under the License is distributed on an "AS IS" BASIS,


 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
import java.util.HashMap;


    public static final String PID = "pid";
    public static final String CREATE_LISTEN = "CREATE LISTEN";
    public static final String APP_PROP = "application";
    public String getTitle() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    public static final String QUERY_PROP = "query";

        return pid;
 * DBeaver - Universal Database Manager
 * limitations under the License.
import java.util.Map;
    }
    public Integer getID() {

 *
        map.put(USER_PROP, user);

@SuppressWarnings("nls")
}
        return map;

        this.pid = pid;
package org.jkiss.dbeaver.ext.postgresql.debug.internal.impl;
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
        super();
    }
    public String getUser() {
        return "pid:" + String.valueOf(pid) + ", user: " + user + ", application: `" + application + "`, state: "
    final String query;
        return user;
        this.query = query;
        return getApplication();
    }
    final String state;
    @Override
 * You may obtain a copy of the License at


    public String toString() {
    final String application;

        map.put(QUERY_PROP, query);
    }
    public static final String USER_PROP = "user";
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        Map<String, Object> map = new HashMap<String, Object>();

    public Map<String, Object> toMap() {
    final String user;
        return application;
 * Unless required by applicable law or agreed to in writing, software
