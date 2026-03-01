
        return text;
     */


     */
    public static String queryTextByValue(String value) {
                return e;
    private final String dValue;
}
            }

/*
     * @return the DBCompatibilityEnum text
        for (DBCompatibilityEnum e : enums) {
    }
     *            the text
 * Copyright (C) 2010-2024 DBeaver Corp and others
    /**
        return null;

 *
     * 
    private final String text;
     * @param cValue
     *            the dValue
     */
    /**
    public String getcValue() {
     * 
    public String getdValue() {

    }
        this.cValue = cValue;


     *            or dValue
    }
public enum DBCompatibilityEnum {
    /**
     * Query DBCompatibilityEnum text by value.
                return e.text;
     */
     * 
    private final String cValue;
     * 
        return "";
 *
 * limitations under the License.
    /**
     * @return the dValue
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
            }
        DBCompatibilityEnum[] enums = values();
        }
    ORACLE("Oracle", "A", "ORA"), MYSQL("MySQL", "B", "MYSQL"), TEDATA("Teradata", "C", "TD"), POSTGRES("PostgreSQL", "PG", "PG");

     * Gets DBCompatibilityEnum by text.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * @param text
 * See the License for the specific language governing permissions and
            if (e.cValue.equalsIgnoreCase(value) || e.dValue.equalsIgnoreCase(value)) {
     *            the text
     *            the cValue
    /**
     * @return the cValue
    /**
            if (e.getText().equals(text)) {
 *
     * @param text
    private DBCompatibilityEnum(String text, String cValue, String dValue) {
     * Gets Centralized value.
     * @return the text
     * Instantiates a new DBCompatibility enum.
    public static DBCompatibilityEnum of(String text) {
     * Gets Distributed value.
        }
        this.text = text;
    }
     * Gets text.
package org.jkiss.dbeaver.ext.gaussdb.model;
     */
 * you may not use this file except in compliance with the License.
     * @param dValue
 *     http://www.apache.org/licenses/LICENSE-2.0
        for (DBCompatibilityEnum e : enums) {
    }
        this.dValue = dValue;
     */
     * @return the DBCompatibilityEnum
     * 

     * 
     * @param cValue
 * You may obtain a copy of the License at
    }
        DBCompatibilityEnum[] enums = values();
    public String getText() {
 * distributed under the License is distributed on an "AS IS" BASIS,
        return cValue;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return dValue;
 */
