
    boolean getBoolean(String key);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager

    String[] getArray(String key);
 */
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.model.preferences;
/*
 *
    void addSection(DBPSettingsSection section);
    void put(String key, String value);
 *
    float getFloat(String key) throws NumberFormatException;
    void put(String key, float value);
    void put(String key, double value);
    DBPSettingsSection[] getSections();
 * See the License for the specific language governing permissions and
    void put(String key, boolean value);
 * you may not use this file except in compliance with the License.
    String get(String key);
    void put(String key, long value);

}
    void put(String key, String[] value);

    long getLong(String key) throws NumberFormatException;
 *
    int getInt(String key) throws NumberFormatException;
    DBPSettingsSection getSection(String sectionName);


    double getDouble(String key) throws NumberFormatException;
    void put(String key, int value);
    String getName();
 * You may obtain a copy of the License at

public interface DBPSettingsSection {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
    DBPSettingsSection addNewSection(String name);
 * limitations under the License.
