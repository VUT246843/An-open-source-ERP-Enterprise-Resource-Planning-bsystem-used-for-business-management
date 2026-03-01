 * FireBirdDataSource
    AFTER_INSERT_OR_UPDATE(18),
    FireBirdTriggerType(int type, boolean dbEvent) {
 * distributed under the License is distributed on an "AS IS" BASIS,

    AFTER_UPDATE(4),
    BEFORE_UPDATE(3),
 *
        return dbEvent;

 * limitations under the License.
    }

 * See the License for the specific language governing permissions and
{
/*
 */
    public String getDisplayName() {
    }
        return type;
    ON_TRANSACTION_COMMIT(8195, true),
 *
            }
    BEFORE_DELETE(5),
    public int getType() {
    ON_CONNECT(8192, true),
    }
            if (tt.type == type) {
}
    BEFORE_INSERT(1),
    private final int type;
    public boolean isDbEvent() {
    BEFORE_INSERT_OR_DELETE(25),
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
    AFTER_DELETE(6),

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


    static FireBirdTriggerType getByType(int type) {
 * you may not use this file except in compliance with the License.
    BEFORE_INSERT_OR_UPDATE(17),
    BEFORE_UPDATE_OR_DELETE(27),
 */
        this(type, false);
 * You may obtain a copy of the License at
    AFTER_INSERT(2),
    BEFORE_INSERT_OR_UPDATE_OR_DELETE(113),
/**
    AFTER_UPDATE_OR_DELETE(28),
    AFTER_INSERT_OR_DELETE(26),
    private final boolean dbEvent;
        return null;
        for (FireBirdTriggerType tt : values()) {
package org.jkiss.dbeaver.ext.firebird.model;
    ON_TRANSACTION_START(8194, true),
        this.dbEvent = dbEvent;
 * Unless required by applicable law or agreed to in writing, software
public enum FireBirdTriggerType
        this.type = type;
    AFTER_INSERT_OR_UPDATE_OR_DELETE(114),
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

    }
        return name().replace('_', ' ');
 * DBeaver - Universal Database Manager
    ON_TRANSACTION_ROLLBACK (8196, true);

    FireBirdTriggerType(int type) {
                return tt;
    ON_DISCONNECT(8193, true),

