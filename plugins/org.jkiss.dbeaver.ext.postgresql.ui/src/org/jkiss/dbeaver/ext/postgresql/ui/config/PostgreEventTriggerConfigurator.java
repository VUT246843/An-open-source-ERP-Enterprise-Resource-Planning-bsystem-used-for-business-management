 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.widgets.Composite;
package org.jkiss.dbeaver.ext.postgresql.ui.config;
        private Combo eventCombo;
                TriggerEventEditPage editPage = new TriggerEventEditPage(trigger);
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
        return new UITask<PostgreEventTrigger>() {
            eventCombo.setText(defaultEvent.name());

                eventCombo.add(type.name());
                    eventType = CommonUtils.valueOf(PostgreEventTrigger.TriggerEventTypes.class, eventCombo.getText());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
            for (PostgreEventTrigger.TriggerEventTypes type : PostgreEventTrigger.TriggerEventTypes.values()) {
import org.jkiss.dbeaver.ui.UIUtils;
            protected PostgreEventTrigger runTask() {
                }
            return PostgreMessages.dialog_trigger_label_title;
import org.jkiss.code.NotNull;
            }
/*
                @Override
        TriggerEventEditPage(PostgreTriggerBase trigger) {
 * You may obtain a copy of the License at
import org.eclipse.swt.widgets.Combo;
    static class TriggerEventEditPage extends PostgreTriggerEditPage {
 * DBeaver - Universal Database Manager
public class PostgreEventTriggerConfigurator implements DBEObjectConfigurator<PostgreEventTrigger> {
                trigger.setName(editPage.getEntityName());

 * Unless required by applicable law or agreed to in writing, software
                if (!editPage.edit()) {
import java.util.Map;
                public void widgetSelected(SelectionEvent e) {
            super(trigger);
import org.jkiss.code.Nullable;
 *
        }
            eventCombo.addSelectionListener(new SelectionAdapter() {
        @Override
import org.eclipse.swt.events.SelectionEvent;
    }
                trigger.setFunction(editPage.selectedFunction);
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTriggerBase;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreEventTrigger;
        public void addExtraCombo(Composite parent) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Postgre sequence configurator
            });
import org.eclipse.swt.SWT;
                    return null;

            eventCombo = UIUtils.createLabelCombo(parent, PostgreMessages.dialog_trigger_label_combo_event_type, PostgreMessages.dialog_trigger_label_combo_event_type_tip, SWT.DROP_DOWN | SWT.READ_ONLY);
 * distributed under the License is distributed on an "AS IS" BASIS,
    public PostgreEventTrigger configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object parent, @NotNull PostgreEventTrigger trigger, @NotNull Map<String, Object> options) {

import org.eclipse.swt.events.SelectionAdapter;
                return trigger;
    @Override
                trigger.setEventType(editPage.eventType);
        @Override
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
/**
            }
            PostgreEventTrigger.TriggerEventTypes defaultEvent = PostgreEventTrigger.TriggerEventTypes.values()[0];


import org.jkiss.dbeaver.ext.postgresql.PostgreMessages;
 * See the License for the specific language governing permissions and
}
 */
        public String getTitle() {
        PostgreEventTrigger.TriggerEventTypes eventType;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.UITask;

        }.execute();
        }
                }
import org.jkiss.dbeaver.model.edit.DBECommandContext;
            @Override
import org.jkiss.utils.CommonUtils;


import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
            eventType = defaultEvent;
        }
 *
 */
