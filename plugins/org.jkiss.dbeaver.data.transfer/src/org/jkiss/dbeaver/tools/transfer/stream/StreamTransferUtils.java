public class StreamTransferUtils {
 *
/*
 *
        }

 */

                    .replace("\\r", "\r");
    }
 * limitations under the License.
 *
 * you may not use this file except in compliance with the License.
            return delimString
    private static final String DEF_DELIMITER = ",";

        String delimString = CommonUtils.toString(properties.get(propName), null);
    public static String getDelimiterString(Map<String, Object> properties, String propName) {
import org.jkiss.utils.CommonUtils;
 */
}
 *     http://www.apache.org/licenses/LICENSE-2.0

package org.jkiss.dbeaver.tools.transfer.stream;

        } else {
                    .replace("\\t", "\t")
    private static final Log log = Log.getLog(StreamTransferUtils.class);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.Log;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Stream transfer serialize


/**
        if (CommonUtils.isEmpty(delimString)) {
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
import java.util.Map;
            return DEF_DELIMITER;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
                    .replace("\\n", "\n")
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
