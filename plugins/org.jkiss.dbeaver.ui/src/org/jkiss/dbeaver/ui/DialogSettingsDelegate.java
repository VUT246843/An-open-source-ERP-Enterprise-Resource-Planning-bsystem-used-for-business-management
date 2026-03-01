        dialogSettings.put(key, value);
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
    }

        dialogSettings.put(key, value);
    @Override
    @Override

 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 */
        return dialogSettings.getInt(key);
}
 * you may not use this file except in compliance with the License.

        IDialogSettings section = dialogSettings.getSection(sectionName);
    @Override
    }
    public void put(String key, double value) {
        }
    @Override
    }
        return ss;

    }
    }
    }

    public String[] getArray(String key) {
    public void put(String key, long value) {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    @Override

 * See the License for the specific language governing permissions and
import org.eclipse.jface.dialogs.IDialogSettings;
        DBPSettingsSection[] ss = new DBPSettingsSection[sections.length];
        return dialogSettings.getArray(key);
    public String get(String key) {
    private final IDialogSettings dialogSettings;
    @Override
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
        return section == null ? null : new DialogSettingsDelegate(section);
            ss[i] = new DialogSettingsDelegate(sections[i]);
 * DBeaver - Universal Database Manager
        return dialogSettings.get(key);
        return dialogSettings.getDouble(key);
            return null;
        return new DialogSettingsDelegate(
 *

    @Override



    }
    public float getFloat(String key) throws NumberFormatException {

    @Override
    public DBPSettingsSection addNewSection(String name) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void put(String key, int value) {
    }
        if (section instanceof DialogSettingsDelegate) {
    }
    @Override
    @Override
            dialogSettings.addSection(((DialogSettingsDelegate) section).dialogSettings);
    public DBPSettingsSection[] getSections() {

    public double getDouble(String key) throws NumberFormatException {
 */
        this.dialogSettings = dialogSettings;
    @Override
    @Override

    public void put(String key, String value) {
    public void put(String key, float value) {
        return dialogSettings.getLong(key);
    }
 * You may obtain a copy of the License at
        } else {
    }
            this.dialogSettings.addNewSection(name));


        if (sections == null) {
/**

    public void put(String key, boolean value) {

    }
    public boolean getBoolean(String key) {
        }
        dialogSettings.put(key, value);
        }

 *
    public DBPSettingsSection getSection(String sectionName) {
    }
    }
    public int getInt(String key) throws NumberFormatException {
    }
 * DBPSettingsSection impl which delegates everything to IDialogSettings
 *
            throw new IllegalArgumentException("Section must extend DialogSettingsDelegate");
        return dialogSettings.getFloat(key);
    public void put(String key, String[] value) {
    @Override
    @Override

        dialogSettings.put(key, value);
    public long getLong(String key) throws NumberFormatException {
    public DialogSettingsDelegate(IDialogSettings dialogSettings) {
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ui;
import org.jkiss.dbeaver.model.preferences.DBPSettingsSection;
    @Override
public class DialogSettingsDelegate implements DBPSettingsSection {
        IDialogSettings[] sections = dialogSettings.getSections();

        dialogSettings.put(key, value);
        dialogSettings.put(key, value);
    @Override
    @Override
        return dialogSettings.getBoolean(key);

    public String getName() {


    public void addSection(DBPSettingsSection section) {
    }
    }
        for (int i = 0; i < sections.length; i++) {
    }
        return dialogSettings.getName();
        dialogSettings.put(key, value);
