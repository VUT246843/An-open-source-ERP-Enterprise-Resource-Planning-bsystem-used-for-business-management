    @NotNull

    CLIENT_SIDE(DataMessages.database_resultsets_label_order_mode_always_client),
 * Unless required by applicable law or agreed to in writing, software
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
        return CommonUtils.valueOf(OrderingStrategy.class, value, SMART);
    public String getText() {
    SERVER_SIDE(DataMessages.database_resultsets_label_order_mode_always_server);
}

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.data.messages.DataMessages;
    private final String text;
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
    public static OrderingStrategy get(@NotNull DBPPreferenceStore store) {
 *
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.dbeaver.ModelPreferences;
        this.text = text;
        String value = store.getString(ModelPreferences.RESULT_SET_ORDERING_STRATEGY);
        return text;

 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
 *
    @NotNull
 * you may not use this file except in compliance with the License.
/*
package org.jkiss.dbeaver.model.data.order;

 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
    }
public enum OrderingStrategy {
    SMART(DataMessages.database_resultsets_label_order_mode_smart),
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.utils.CommonUtils;

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
    OrderingStrategy(String text) {
