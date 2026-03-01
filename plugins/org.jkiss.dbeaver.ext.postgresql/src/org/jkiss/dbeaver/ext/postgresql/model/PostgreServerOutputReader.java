        return PostgreOutputSeverity.values();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                severity = parts.get(SERVER_ERROR_MESSAGE_SEVERITY);
        PostgreOutputSeverity(@NotNull String name) {
    }
import org.jkiss.dbeaver.model.impl.AsyncServerOutputReader;
        LOG("Log"),
        }
        public String getName() {
 * limitations under the License.

 */
import org.jkiss.dbeaver.model.exec.output.DBCServerOutputReaderExt;
            if (parts.containsKey(SERVER_ERROR_MESSAGE_SEVERITY)) {
        } catch (Throwable ignored) {
 * You may obtain a copy of the License at
            return null;

    @Override
import org.jkiss.code.NotNull;
        private final String name;
        INFO("Info"),
        }
            final Map<Character, String> parts = BeanUtils.getFieldValue(obj, SERVER_ERROR_MESSAGE_MESSAGE_PARTS);
        NOTICE("Notice"),
                severity = parts.get(SERVER_ERROR_MESSAGE_SEVERITY_LOCALIZED);
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import java.util.Map;
package org.jkiss.dbeaver.ext.postgresql.model;
    private static final String PSQL_WARNING_GET_SERVER_ERROR_MESSAGE_METHOD = "getServerErrorMessage";

        }
        output.println(getSeverity(warning), warning.getMessage());
}
     *
    private static final Character SERVER_ERROR_MESSAGE_SEVERITY_LOCALIZED = 'S';
public class PostgreServerOutputReader extends AsyncServerOutputReader implements DBCServerOutputReaderExt {
            } else {
    private static DBCOutputSeverity getSeverity(@NotNull Throwable warning) {
            return null;
            final String severity;
        @Override
     * @see <a href="https://www.postgresql.org/docs/current/protocol-error-fields.html">55.8. Error and Notice Message Fields</a>
 * you may not use this file except in compliance with the License.
        try {
            }
    private static final String PSQL_WARNING_CLASS = "org.postgresql.util.PSQLWarning";

        ERROR("Error");
/*
import org.jkiss.dbeaver.model.exec.output.DBCOutputSeverity;
 *     http://www.apache.org/licenses/LICENSE-2.0
    private static final String SERVER_ERROR_MESSAGE_MESSAGE_PARTS = "mesgParts";
 * See the License for the specific language governing permissions and
    protected void dumpWarning(@NotNull DBCOutputWriter output, @NotNull Throwable warning) {
    public DBCOutputSeverity[] getSupportedSeverities(@NotNull DBCExecutionContext context) {

            this.name = name;

            final Object obj = BeanUtils.invokeObjectMethod(warning, PSQL_WARNING_GET_SERVER_ERROR_MESSAGE_METHOD);
import org.jkiss.dbeaver.model.exec.output.DBCOutputWriter;
import org.jkiss.code.Nullable;
    @Override

     * Retrieves severity of the warning.
 * Unless required by applicable law or agreed to in writing, software
    @Nullable
 *
            return name;
        if (!PSQL_WARNING_CLASS.equals(warning.getClass().getName())) {
 *
    }
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
import org.jkiss.utils.BeanUtils;
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
        @NotNull
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    private enum PostgreOutputSeverity implements DBCOutputSeverity {

     */
    /**
    private static final Character SERVER_ERROR_MESSAGE_SEVERITY = 'V';


    }
            return PostgreOutputSeverity.valueOf(severity);
        WARNING("Warning"),
        DEBUG("Debug"),

