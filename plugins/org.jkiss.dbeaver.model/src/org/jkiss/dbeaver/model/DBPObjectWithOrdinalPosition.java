 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
 * Object with ordered position.
 *     http://www.apache.org/licenses/LICENSE-2.0

 * limitations under the License.
    @Override
 *

 * See the License for the specific language governing permissions and
    default int compareTo(@NotNull DBPObjectWithOrdinalPosition o) {
 * Unless required by applicable law or agreed to in writing, software
 */
}
        return Integer.compare(getOrdinalPosition(), o.getOrdinalPosition());
    int getOrdinalPosition();
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.model;
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.code.NotNull;
/**
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
/*

 *
public interface DBPObjectWithOrdinalPosition extends Comparable<DBPObjectWithOrdinalPosition> {
