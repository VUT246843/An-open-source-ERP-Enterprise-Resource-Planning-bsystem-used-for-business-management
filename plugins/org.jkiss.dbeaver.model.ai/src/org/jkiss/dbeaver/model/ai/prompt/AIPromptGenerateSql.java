        DBSLogicalDataSource dataSource = dsSupplier.get();
import org.jkiss.dbeaver.runtime.DBWorkbench;
 *
import org.jkiss.dbeaver.model.ai.impl.AIPromptUtils;
        }
 * Unless required by applicable law or agreed to in writing, software


            default -> "Joins and sub‑queries are allowed.";

        return SQL_GENERATOR_ID;
 * limitations under the License.
    protected void initializePrompt(@Nullable AIDatabaseContext context) {
 * See the License for the specific language governing permissions and
        addJoinInstructions(builder);
        String joinHint = switch (joinRule) {
import org.jkiss.dbeaver.model.ai.engine.AIDatabaseContext;
        AISqlJoinRule joinRule = CommonUtils.valueOf(
 * DBeaver - Universal Database Manager
}
    ) {
            builder
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
        );
import org.jkiss.dbeaver.model.logical.DBSLogicalDataSource;
        builder.addInstructions(AIPromptUtils.createGeneralRulesInstructions());
        builder.addInstructions(joinHint);
                .addContexts(AIPromptUtils.describeDataSourceInfo(dataSource))
 *     http://www.apache.org/licenses/LICENSE-2.0
            case SUB_QUERY -> "Use sub‑queries only.";
        builder.addOutputFormats(AIPromptUtils.SQL_OUTPUT_FORMATS);
        if (dataSource != null) {
import org.jkiss.utils.CommonUtils;


package org.jkiss.dbeaver.model.ai.prompt;

import org.jkiss.code.Nullable;
 * You may obtain a copy of the License at
        };
/*
        @NotNull DBSLogicalDataSourceSupplier dsSupplier,
            AISqlJoinRule.DEFAULT
        @NotNull AIPromptAbstract builder
public class AIPromptGenerateSql extends AIPromptAbstract {
 * you may not use this file except in compliance with the License.

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    public static void addSqlGenerateInstructions(
 *
import org.jkiss.dbeaver.model.ai.AISqlJoinRule;
        addSqlGenerateInstructions(() -> context == null ? null : context.getDataSource(), this);
            AISqlJoinRule.class,
                .addInstructions(AIPromptUtils.createGenerateQueryInstructions(dataSource));
    public static final String SQL_GENERATOR_ID = "sql";
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.jkiss.dbeaver.model.logical.DBSLogicalDataSourceSupplier;
            case JOIN -> "Use joins only.";
            DBWorkbench.getPlatform().getPreferenceStore().getString(AIConstants.AI_JOIN_RULE),
    @NotNull
    @Override

    }
    @Override

 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
import org.jkiss.dbeaver.model.ai.AIConstants;
    public static void addJoinInstructions(@NotNull AIPromptAbstract builder) {
    public String generatorId() {
import org.jkiss.code.NotNull;
 */
