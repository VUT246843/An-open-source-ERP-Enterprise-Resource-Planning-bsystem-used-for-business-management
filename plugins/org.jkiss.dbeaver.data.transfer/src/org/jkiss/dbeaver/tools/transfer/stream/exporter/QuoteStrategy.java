 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                return s;
    DISABLED("disabled"),
 * Unless required by applicable law or agreed to in writing, software
        value = v;
        } else if ("false".equalsIgnoreCase(v)) {
/*
    }
public enum QuoteStrategy {
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
    ALL("all"),
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
    ALL_INCLUDING_NULLS("all including nulls");
        }


 * limitations under the License.
        }

            return ALL;
 * Licensed under the Apache License, Version 2.0 (the "License");

}
    public static QuoteStrategy fromValue(String v) {
            return DISABLED;
package org.jkiss.dbeaver.tools.transfer.stream.exporter;
        return value;
    private final String value;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
            if (s.value.equals(v)) {
    STRINGS("strings"),
        for (QuoteStrategy s: QuoteStrategy.values()) {
    ALL_BUT_NUMBERS("all but numbers"),

    public String value() {
 *
        // backward compatibility
 * You may obtain a copy of the License at
    }
    }
        // default value if not provided any
    QuoteStrategy(String v) {
 */

        return DISABLED;
        if ("true".equalsIgnoreCase(v)) {
