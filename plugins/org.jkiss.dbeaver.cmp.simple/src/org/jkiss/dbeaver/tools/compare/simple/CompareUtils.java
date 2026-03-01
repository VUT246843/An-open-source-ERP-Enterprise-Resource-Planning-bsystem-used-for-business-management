            return CommonUtils.equalObjects(value1, value2);
                }
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class CompareUtils {
    {
        } else {
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
            }

 * you may not use this file except in compliance with the License.
                    return false;
 * limitations under the License.
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.DBSObject;

                 curValue1 = curValue1.getParentObject(), curValue2 = curValue2.getParentObject())
 * Copyright (C) 2010-2024 DBeaver Corp and others
                if (curValue1 instanceof DBPDataSourceContainer) {
                 curValue1 != null && curValue2 != null;
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
            {
 * DBeaver - Universal Database Manager
            for (DBSObject curValue1 = (DBSObject) value1, curValue2 = (DBSObject) value2;
    }
                    return false;
                if (curValue1.getClass() != curValue2.getClass()) {
package org.jkiss.dbeaver.tools.compare.simple;
                }
        }

    public static boolean equalPropertyValues(Object value1, Object value2)
            return true;
 * Unless required by applicable law or agreed to in writing, software
                    return true;
                if (!CommonUtils.equalObjects(curValue1.getName(), curValue2.getName())) {
 *
/*
 */
 *
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                }
}
 * Compare utils
        if (value1 instanceof DBSObject && value2 instanceof DBSObject) {

