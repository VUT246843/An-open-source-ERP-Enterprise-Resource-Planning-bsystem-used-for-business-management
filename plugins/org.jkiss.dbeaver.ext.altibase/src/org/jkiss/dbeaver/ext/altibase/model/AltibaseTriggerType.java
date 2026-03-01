
 * limitations under the License.

    ON_TRANSACTION_COMMIT(8195, true),
 * you may not use this file except in compliance with the License.
    private final boolean dbEvent;
 */
/**

 * DBeaver - Universal Database Manager
    static AltibaseTriggerType getByType(int type) {
    AFTER_INSERT_OR_DELETE(26),
            }
    }
/*

    AFTER_UPDATE_OR_DELETE(28),
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        for (AltibaseTriggerType tt : values()) {
    }

    public boolean isDbEvent() {
 * See the License for the specific language governing permissions and

 * FireBirdDataSource
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
}
    private final int type;
        this(type, false);
                return tt;
 *
 *
 */

    BEFORE_DELETE(5),
            if (tt.type == type) {
    }
        return name().replace('_', ' ');
 * Licensed under the Apache License, Version 2.0 (the "License");
public enum AltibaseTriggerType {
        return null;
    BEFORE_UPDATE_OR_DELETE(27),
    AltibaseTriggerType(int type) {
    public String getDisplayName() {
 * You may obtain a copy of the License at
    public int getType() {
    AFTER_UPDATE(4),
    ON_DISCONNECT(8193, true),
    ON_CONNECT(8192, true),
    ON_TRANSACTION_START(8194, true),
    BEFORE_INSERT(1),

    BEFORE_INSERT_OR_UPDATE(17),
    AFTER_INSERT(2),
    BEFORE_UPDATE(3),
    BEFORE_INSERT_OR_DELETE(25),
        return dbEvent;
        return type;
    AFTER_DELETE(6),
 * distributed under the License is distributed on an "AS IS" BASIS,
    AFTER_INSERT_OR_UPDATE(18),
    BEFORE_INSERT_OR_UPDATE_OR_DELETE(113),
package org.jkiss.dbeaver.ext.altibase.model;
    }

    }
    AFTER_INSERT_OR_UPDATE_OR_DELETE(114),
    ON_TRANSACTION_ROLLBACK(8196, true);
        this.dbEvent = dbEvent;
    AltibaseTriggerType(int type, boolean dbEvent) {
        this.type = type;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 *
    }
