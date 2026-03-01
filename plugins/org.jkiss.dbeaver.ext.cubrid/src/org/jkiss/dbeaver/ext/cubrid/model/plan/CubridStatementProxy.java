                                    "getQueryplan",
        } catch (Throwable e) {
                                    statement,
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
                    (String)
            log.debug("error getQueryplan", e);
    public static String getQueryplan(@NotNull Statement statement, @NotNull String query)
 *
/*

 *
 * limitations under the License.
import org.jkiss.dbeaver.Log;

 * DBeaver - Universal Database Manager
        String queryplan = "";
 * See the License for the specific language governing permissions and

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
public class CubridStatementProxy {
 */
            queryplan =
                                    new Class<?>[] {String.class},
        }
    @NotNull
}
 *
 * You may obtain a copy of the License at
            throws SQLException {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.sql.Statement;
package org.jkiss.dbeaver.ext.cubrid.model.plan;
 * you may not use this file except in compliance with the License.

import org.jkiss.utils.BeanUtils;
import java.sql.SQLException;
        try {
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
                                    new String[] {query});
                            BeanUtils.invokeObjectMethod(
        return queryplan;
    private static final Log log = Log.getLog(CubridStatementProxy.class);
 * distributed under the License is distributed on an "AS IS" BASIS,
