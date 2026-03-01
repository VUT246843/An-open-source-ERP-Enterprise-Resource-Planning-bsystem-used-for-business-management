    public void undo() {
        this.oldValue = this.part.getAttribute().isChecked();

import org.jkiss.dbeaver.ui.editors.erd.part.AttributePart;

 * DBeaver - Universal Database Manager
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    public AttributeCheckCommand(PART part, boolean newValue) {
    public boolean getOldValue() {
        this.part = part;
        part.getFigure().getCheckBox().setSelected(newValue);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
 *


package org.jkiss.dbeaver.ui.editors.erd.command;
 */
 *

/*
    private boolean oldValue;
        part.getAttribute().setChecked(newValue);
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
    }
        part.getFigure().getCheckBox().setSelected(oldValue);
import org.eclipse.gef.commands.Command;
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    private boolean newValue;

        this.newValue = newValue;
    protected PART part;
    public void execute() {
    }
        return oldValue;
} * Licensed under the Apache License, Version 2.0 (the "License");
 *
public class AttributeCheckCommand<PART extends AttributePart> extends Command {
    public boolean getNewValue() {
 * See the License for the specific language governing permissions and


    }
    }
 */
 * Change attribute checked state
 * limitations under the License.
        part.getAttribute().setChecked(oldValue);
 * You may obtain a copy of the License at

/**
        super("Select attribute");
        return newValue;

