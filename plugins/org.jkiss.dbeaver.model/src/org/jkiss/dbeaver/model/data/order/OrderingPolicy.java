
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
        return text;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.utils.CommonUtils;
}
    PRIMARY_KEY_ASC(DataMessages.database_resultsets_label_order_policy_primary_key_asc),
    @NotNull
    }
public enum OrderingPolicy {

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
 *
 * See the License for the specific language governing permissions and
    public String getText() {
import org.jkiss.code.NotNull;
    public static OrderingPolicy get(@NotNull DBPPreferenceStore store) {
    private final String text;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager


    PRIMARY_KEY_DESC(DataMessages.database_resultsets_label_order_policy_primary_key_desc);
        String value = store.getString(ModelPreferences.RESULT_SET_ORDERING_POLICY);
    }
import org.jkiss.dbeaver.model.data.messages.DataMessages;
    @NotNull
 *
    }
 */
        return CommonUtils.valueOf(OrderingPolicy.class, value, DEFAULT);
    OrderingPolicy(String text) {
        this.text = text;
import org.jkiss.dbeaver.ModelPreferences;

    DEFAULT(DataMessages.database_resultsets_label_order_policy_default),
/*
package org.jkiss.dbeaver.model.data.order;
