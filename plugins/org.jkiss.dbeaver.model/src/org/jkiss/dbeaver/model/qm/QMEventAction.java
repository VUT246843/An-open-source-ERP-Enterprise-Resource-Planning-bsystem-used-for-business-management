
 * Unless required by applicable law or agreed to in writing, software
        this.id = id;

 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
        for (QMEventAction action : values()) {
    public static QMEventAction getById(int id) {
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
                return action;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public int getId() {
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *
    ;
 * limitations under the License.
    }
        return BEGIN;

 * See the License for the specific language governing permissions and
 *
    QMEventAction(int id) {
    END(1),
}
    private final int id;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        }
 * You may obtain a copy of the License at
public enum QMEventAction {
package org.jkiss.dbeaver.model.qm;
    }
        return id;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    BEGIN(0),
    UPDATE(2),
/*
            if (action.id == id) {
