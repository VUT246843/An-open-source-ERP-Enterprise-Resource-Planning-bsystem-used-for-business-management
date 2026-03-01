
 * distributed under the License is distributed on an "AS IS" BASIS,
/*


import org.jkiss.dbeaver.debug.DBGBreakpointDescriptor;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    @Override

    public Map<String, Object> toMap() {

        return lineNo;
import org.jkiss.dbeaver.ext.postgresql.debug.PostgreDebugConstants;
public class PostgreDebugBreakpointDescriptor implements DBGBreakpointDescriptor {
        this.targetId = -1;

    public boolean isOnStart() {
 */
        map.put("onStart", onStart);
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.postgresql.debug.internal.impl;
    private final boolean onStart;
import java.util.Map;
        map.put("targetId", String.valueOf(targetId));

    }
    public boolean isAll() {
 * you may not use this file except in compliance with the License.
        this.onStart = lineNo < 0;
        map.put(PostgreDebugConstants.ATTR_FUNCTION_OID, String.valueOf(oid));

 * DBeaver - Universal Database Manager
import java.util.HashMap;
    public PostgreDebugBreakpointDescriptor(Object oid, long lineNo) {
 *
    private final Object oid;
        return all;
 * limitations under the License.

        return onStart;
import org.eclipse.core.resources.IMarker;
    public long getLineNo() {
        return oid;
 */
/**

    public long getTargetId() {
 * PG breakpoint.
    private final boolean all;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        long oid = CommonUtils.toLong(attributes.get(PostgreDebugConstants.ATTR_FUNCTION_OID));
        return targetId;
    }
import org.jkiss.utils.CommonUtils;
    private final long targetId;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

        Map<String, Object> map = new HashMap<>();
    @Override
 * It contains PG-specific info for IDatabaseBreakpoint
    public Object getObjectId() {
 * You may obtain a copy of the License at
    }
    }
 * Copyright (C) 2017-2018 Andrew Khitrin (ahitrin@gmail.com)
    }
        return map;
        this.oid = oid;

 * See the License for the specific language governing permissions and
        return "PostgreDebugBreakpointDescriptor [obj=" + oid + ", properties=" + toMap() + "]";
        map.put("all", all);
        this.all = true;
    public static DBGBreakpointDescriptor fromMap(Map<String, Object> attributes) {
    private final long lineNo;

 *

        return new PostgreDebugBreakpointDescriptor(oid, parsed);
}
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.lineNo = lineNo;
    }
    public String toString() {
        long parsed = CommonUtils.toLong(attributes.get(IMarker.LINE_NUMBER));

