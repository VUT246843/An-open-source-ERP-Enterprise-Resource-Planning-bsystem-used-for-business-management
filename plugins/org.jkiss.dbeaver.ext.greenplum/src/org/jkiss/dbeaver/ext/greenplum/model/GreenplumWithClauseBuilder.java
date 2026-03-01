 *
    }

    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
            withClauseBuilder.append("\n)");
        } else if (tableIsGreenplumWithRelOptions(table, tableBase)) {
}
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        } else if (tableSupportsAndHasOids(table)) {
        return withClauseBuilder.toString();
 * Licensed under the Apache License, Version 2.0 (the "License");
                String option = options[i];
package org.jkiss.dbeaver.ext.greenplum.model;


            }
 * Copyright (C) 2019 Gavin Shaw (gshaw@pivotal.io)
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTable;
            String[] options = tableBase.getRelOptions();
    }

            for (int i = 1; i < options.length; i++) {
                withClauseBuilder.append(format(",\n\t%s", option));
    private static boolean tableIsGreenplumWithRelOptions(PostgreTable table, PostgreTableBase tableBase) {
public class GreenplumWithClauseBuilder {
import static java.lang.String.format;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTableBase;
/*
 */
    public static String generateWithClause(PostgreTable table, PostgreTableBase tableBase) {
 * DBeaver - Universal Database Manager
    private static boolean tableSupportsAndHasOids(PostgreTable table) {
        return table.getDataSource().getServerType().supportsOids() && table.isHasOids();
        StringBuilder withClauseBuilder = new StringBuilder();
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software

 * Copyright (C) 2019 Nikhil Pawar (npawar@pivotal.io)

                withClauseBuilder.append(format(",\n\t%s", option));
 * Copyright (C) 2019 Zach Marcin (zmarcin@pivotal.io)

        if (tableSupportsAndHasOids(table) && tableIsGreenplumWithRelOptions(table, tableBase)) {
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2019 Dmitriy Dubson (ddubson@pivotal.io)
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return table instanceof GreenplumTable && tableBase.getRelOptions() != null;
 *     http://www.apache.org/licenses/LICENSE-2.0
            for (String option : tableBase.getRelOptions()) {
            withClauseBuilder.append("\n)");
            withClauseBuilder.append(format("\nWITH (\n\t%s", options[0]));
 * See the License for the specific language governing permissions and
        }

            withClauseBuilder.append("\nWITH (\n\tOIDS=").append(table.isHasOids() ? "TRUE" : "FALSE");
 * You may obtain a copy of the License at
            withClauseBuilder.append("\nWITH (\n\tOIDS=").append(table.isHasOids() ? "TRUE" : "FALSE");
            withClauseBuilder.append("\n)");
