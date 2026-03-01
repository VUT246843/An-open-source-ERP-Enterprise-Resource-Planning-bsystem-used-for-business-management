        if (this.configurator != null) {
        if (this.configurator != null) {
 * You may obtain a copy of the License at
        if (this.configurator != null) {
    @Override
        }
    public boolean isComplete() {
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others

    }
            this.configurator.saveSettings(settings);
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void createControl(@NotNull Composite parent, OBJECT object, @NotNull Runnable propertyChangeListener) {
 * you may not use this file except in compliance with the License.
    @Override
 *
        } else {
    }
            return this.configurator.getErrorMessage();
import org.jkiss.code.NotNull;
    public void saveSettings(@NotNull SETTINGS settings) {
            return true;
 *

    public String getErrorMessage() {
            this.configurator.loadSettings(settings);
    @Override
    public void loadSettings(@NotNull SETTINGS settings) {
 * Unless required by applicable law or agreed to in writing, software
 */
 * limitations under the License.
    @Override
    }
        if (this.configurator != null) {
import org.eclipse.swt.widgets.Composite;

        }
        } else {
    public void resetSettings(@NotNull SETTINGS settings) {
}        this.configurator.createControl(parent, object, propertyChangeListener);
        }
 * See the License for the specific language governing permissions and

            this.configurator.resetSettings(settings);
public abstract class ObjectPropertyConfiguratorWrapper<OBJECT, SETTINGS>  extends AbstractObjectPropertyConfigurator<OBJECT, SETTINGS> {

import org.jkiss.code.Nullable;
    @Override
    }
            return this.configurator.isComplete();
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
        }
        this.configurator = createConfigurator();
        if (this.configurator != null) {

 * DBeaver - Universal Database Manager
        }
 *
/*
package org.jkiss.dbeaver.ui;
    private IObjectPropertyConfigurator<OBJECT, SETTINGS> configurator = null;

    protected abstract IObjectPropertyConfigurator<OBJECT, SETTINGS> createConfigurator();
            return null;
