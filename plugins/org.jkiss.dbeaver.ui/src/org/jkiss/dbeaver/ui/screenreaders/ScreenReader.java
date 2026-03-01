        return this.screenReaderName;
public enum ScreenReader {

    }
    DEFAULT("Default"), // $NON-NLS-0$
 * See the License for the specific language governing permissions and

}
    }
        }
        }
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ui.screenreaders;

                }
            result = ScreenReader.DEFAULT;
     */
 *
            }
            for (ScreenReader reader : ScreenReader.values()) {
        ScreenReader result = null;
        if (result == null) {
        }
     */
                    break;

 * Licensed under the Apache License, Version 2.0 (the "License");
     * The general method to retrieve screen reader by name and value or return
                if (scereenReader.equals(reader.name())) {

     * Gets the reader abbreviation name
 */
     * @param scereenReader
 *     http://www.apache.org/licenses/LICENSE-2.0

        return result;
/*
     * @return
 * distributed under the License is distributed on an "AS IS" BASIS,
                result = getScreenReaderByName(scereenReader);
                if (scereenReaderName.equalsIgnoreCase(reader.getScreenReaderName())) {
    JAWS("JAWS"), // $NON-NLS-0$
        if (scereenReader != null) {
    private ScreenReader(String name) {
    NVDA("NVDA"), // $NON-NLS-0$

    public static ScreenReader getScreenReader(String scereenReader) {
            }
    }
        this.screenReaderName = name;
            for (ScreenReader reader : ScreenReader.values()) {
    public String getScreenReaderName() {
            if (result == null) {
     * @return - name
    }
     *
    /**
    OTHER("Other"); // $NON-NLS-0$
 *
    private String screenReaderName;
    private static ScreenReader getScreenReaderByName(String scereenReaderName) {
    NARRATOR("Narrator"), // $NON-NLS-0$
     * default
                }

 *
 * DBeaver - Universal Database Manager
        return ScreenReader.DEFAULT;
                    result = reader;
        if (scereenReaderName != null) {
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
                    return reader;
     *
            }
    /**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
