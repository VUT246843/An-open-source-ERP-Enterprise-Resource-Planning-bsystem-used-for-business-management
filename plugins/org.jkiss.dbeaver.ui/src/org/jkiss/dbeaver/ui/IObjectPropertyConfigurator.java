        return null;
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
    default String getErrorMessage() {
}
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
    void saveSettings(@NotNull SETTINGS settings);
 */
 * See the License for the specific language governing permissions and
 * IObjectPropertyConfigurator
package org.jkiss.dbeaver.ui;
    void resetSettings(@NotNull SETTINGS settings);
 *

 *
 *
    }

     * @param object                 Object
import org.eclipse.swt.widgets.Composite;
 * You may obtain a copy of the License at
     * @param propertyChangeListener Can be called upon UI control change to update page completeness and other things.
    boolean isComplete();
import org.jkiss.code.Nullable;
     */

 */

     * @param parent                 Parent composite
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
 * limitations under the License.


 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
    void loadSettings(@NotNull SETTINGS settings);
/**
    /**
public interface IObjectPropertyConfigurator<OBJECT, SETTINGS> {


    void createControl(@NotNull Composite parent, OBJECT object, @NotNull Runnable propertyChangeListener);
