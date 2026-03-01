        throw new IllegalStateException("No suitable DataExporterArrayFormat found");
        this.prefix = prefix;
/*
    }
 * limitations under the License.
    public char getPrefix() {
                return df;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at
    public char getSuffix() {
    }
    public static DataExporterArrayFormat getArrayFormatOnPrefix(char prefix) {
    SQUARE_BRACKETS('[', ']'),
 * DBeaver - Universal Database Manager


            }
    }
            if (prefix == df.prefix) {
    DataExporterArrayFormat(char prefix, char suffix) {
    public static DataExporterArrayFormat getArrayFormat(String bracketPair) {
    private char suffix;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
        }

        for (DataExporterArrayFormat df : DataExporterArrayFormat.values()) {

}
    CURLY_BRACKETS('{', '}'),
 * you may not use this file except in compliance with the License.
        this.suffix = suffix;

    private char prefix;
    BRACKETS('(', ')');
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *
        for (DataExporterArrayFormat df : DataExporterArrayFormat.values()) {
        return prefix;
                return df;
        return suffix;
 */
            bracketPair = bracketPair.trim();
public enum DataExporterArrayFormat {
 *
        }
        return CURLY_BRACKETS;
package org.jkiss.dbeaver.tools.transfer.stream.exporter;
            if (bracketPair.charAt(0) == df.prefix && bracketPair.charAt(bracketPair.length() - 1) == df.suffix) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,

    }
 *

    }
            }
