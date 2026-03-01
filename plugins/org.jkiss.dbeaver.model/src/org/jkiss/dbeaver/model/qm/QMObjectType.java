    QMObjectType(String title, List<QMMetaObjectType> types) {
        this.title = title;
 *
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.model.qm;
import java.util.List;
import java.util.Collection;
        return types;
    private final List<QMMetaObjectType> types;
    }
import java.util.ArrayList;
    public static String toString(Collection<QMObjectType> objectTypes) {


 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
                objectTypes.add(QMObjectType.valueOf(otName));
    }
    session("Session", List.of(QMMetaObjectType.CONNECTION_INFO)),
        }
        for (QMObjectType type : objectTypes) {
        }
 * You may obtain a copy of the License at
            names.add(type.name());
    }
/*

 * distributed under the License is distributed on an "AS IS" BASIS,

    public List<QMMetaObjectType> getTypes() {
}
    public static Collection<QMObjectType> fromString(String str) {
    }
    }
                // just scrip bad names
/**
import org.jkiss.dbeaver.model.qm.meta.QMMetaObjectType;
        return title;
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final String title;

            }

 * Object type
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 *
    public String getTitle() {
 */

        return objectTypes;
        List<QMObjectType> objectTypes = new ArrayList<>();

        return CommonUtils.makeString(names, ',');
        for (String otName : CommonUtils.splitString(str, ',')) {
    query("Queries", List.of());
public enum QMObjectType {
        this.types = types;
 */
            try {
    txn("Transactions", List.of(QMMetaObjectType.TRANSACTION_INFO, QMMetaObjectType.TRANSACTION_SAVEPOINT_INFO)),
 * limitations under the License.
        List<String> names = new ArrayList<>(objectTypes.size());

import org.jkiss.utils.CommonUtils;
            } catch (IllegalArgumentException e) {

 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
