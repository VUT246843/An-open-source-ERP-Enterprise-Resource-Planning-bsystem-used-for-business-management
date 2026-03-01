
    }
import org.eclipse.core.expressions.PropertyTester;
/**
            if (clazz.getName().equals(className)) {
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others

/*
        if (!(receiver instanceof IDatabaseEditor)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
public class DatabaseEditorPropertyTester extends PropertyTester
    @Override
        return false;

 *
        }
 */
        return false;
 *     http://www.apache.org/licenses/LICENSE-2.0
            } else {
                return testObjectClass(databaseEditor, typeName);
 *
        }
 * You may obtain a copy of the License at
            return false;
                return true;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        IDatabaseEditor databaseEditor = (IDatabaseEditor) receiver;

{
        super();
            }
                IEditorPart activeEditor = mpEditor.getActiveEditor();
    private static boolean testObjectClass(Object object, String className)
 * Licensed under the Apache License, Version 2.0 (the "License");
                MultiPageAbstractEditor mpEditor = (MultiPageAbstractEditor)databaseEditor;
 * DatabaseEditorPropertyTester
            if (databaseEditor instanceof MultiPageAbstractEditor) {
        for (Class<?> clazz = object.getClass(); clazz != Object.class; clazz = clazz.getSuperclass()) {

        }
                return activeEditor != null && testObjectClass(activeEditor, typeName);
package org.jkiss.dbeaver.ui.editors;
 * See the License for the specific language governing permissions and
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
    }
 */
    public static final String PROP_ACTIVE = "active";
            }
 * limitations under the License.
} * you may not use this file except in compliance with the License.
    public DatabaseEditorPropertyTester() {
import org.eclipse.ui.IEditorPart;
        if (property.equals(PROP_ACTIVE)) {

 * Unless required by applicable law or agreed to in writing, software
 *
 * DBeaver - Universal Database Manager
    }
            String typeName = String.valueOf(expectedValue);
