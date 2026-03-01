 *
 * limitations under the License.
/*
    public static final int STEP_OVER = 0x0002;
    public static final int CHANGE = 0x0010;
    public static final int BREAKPOINT = 0x0010;
     */
    public DBGEvent(Object source, int kind) {

        super(source);
        this.kind = kind;
    public static final int MODEL_SPECIFIC = 0x0020;

    public static final int RESUME = 0x0001;
    }
public class DBGEvent extends EventObject {
    public int getKind() {
    public static final int CREATE = 0x0004;

    public int getDetails() {
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.debug;
 *
    private static final long serialVersionUID = 1L;
import java.util.EventObject;
    private int details;
 * DBeaver - Universal Database Manager
}
    public DBGEvent(Object source, int kind, int details) {
 * See the License for the specific language governing permissions and
    public static final int STEP_RETURN = 0x0004;
        this.details = details;
    public static final int STEP_END = 0x0008;
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
        return details;
    }

 */
 * Copyright (C) 2010-2024 DBeaver Corp and others

    public static final int SUSPEND = 0x0002;
 * Copyright (C) 2017-2018 Andrew Khitrin (ahitrin@gmail.com)
    public static final int UNSPECIFIED = 0;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
     * The event detail constants
    private int kind;
        this(source, kind, UNSPECIFIED);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static final int CLIENT_REQUEST = 0x0020;


    }
 * You may obtain a copy of the License at
    public static final int TERMINATE = 0x0008;
    /*
    /*
    public static final int STEP_INTO = 0x0001;
     */
        return kind;
     * The event kind constants

    }
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)



 * distributed under the License is distributed on an "AS IS" BASIS,

