
public class CPPSQLConverter extends SourceCodeSQLConverter {
 * you may not use this file except in compliance with the License.
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            String line = sourceLines[i];

            }
 * limitations under the License.
        for (int i = 0; i < sourceLines.length; i++) {
            if (i < sourceLines.length - 1) {
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected void convertSourceLines(StringBuilder result, String[] sourceLines, String lineDelimiter, Map<String, Object> options) {
 *
import org.jkiss.utils.CommonUtils;
 */
 *
                result.append(";");
}
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui.editors.sql.convert.impl;
                result.append("\n");
 * CPPSQLConverter
 * DBeaver - Universal Database Manager
            } else {

/*
/**

 *
 */

import java.util.Map;
            result.append('"').append(CommonUtils.escapeJavaString(line)).append(lineDelimiter).append('"');
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
