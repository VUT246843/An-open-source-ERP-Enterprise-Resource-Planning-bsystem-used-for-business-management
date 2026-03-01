    public static int compareValues(Comparable val1, Comparable val2) {
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
            double cmpr = ((Number) val1).doubleValue() - ((Number) val2).doubleValue();
            return cmpr < 0 ? -1 : (cmpr > 0 ? 1 : 0);
        } else {
 * you may not use this file except in compliance with the License.
public class AggregateUtils {
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (val1 instanceof Number && val2 instanceof Number) {
 *
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * AggregateUtils
 *
 * DBeaver - Universal Database Manager
 * limitations under the License.
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

 * Copyright (C) 2010-2024 DBeaver Corp and others
            return val1.compareTo(val2);
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.data.aggregate;
 */
}
        } else if (val1.getClass() == val2.getClass()) {
/**
            return 0;
 *
/*
 * Unless required by applicable law or agreed to in writing, software

