                        if (CommonUtils.equalObjects(originalValue, newValue)) {
        this.widget = widget;
                ((List)widget).setSelection((String[])value);
                {
import java.util.Calendar;
            return;
    {

                        }
    {
                            objectEditor.removeChangeCommand(curCommand);
                        }
            }
            } else if (widget instanceof Combo) {
        DBEPropertyHandler<OBJECT_TYPE> handler)
import org.jkiss.dbeaver.model.struct.DBSObject;

            return ((Button)widget).getSelection();
                {
package org.jkiss.dbeaver.ui.editors;
            }
        }
                        @Override
            cl.set(Calendar.DAY_OF_MONTH, dateTime.getDay());
        } else if (widget instanceof DateTime) {

 * See the License for the specific language governing permissions and
        this.objectEditor = objectEditor;
                    if (curCommand != null) {
    }
                log.warn("Control " + widget + " is not supported");
import org.jkiss.code.NotNull;
            cl.set(Calendar.MILLISECOND, 0);
import org.eclipse.swt.SWT;
        widget.addListener(SWT.FocusIn, listener);

 * distributed under the License is distributed on an "AS IS" BASIS,

 *
        WidgetListener listener = new WidgetListener();
            cl.set(Calendar.HOUR_OF_DAY, dateTime.getHours());
                ((Combo)widget).setText(CommonUtils.toString(value));
 * Licensed under the Apache License, Version 2.0 (the "License");
        } else if (widget instanceof Combo) {
            return ((Combo)widget).getText();

                dateTime.setMonth(cl.get(Calendar.MONTH));
        DBEPropertyHandler<OBJECT_TYPE> handler)
            switch (event.type) {
            if (widget instanceof Text) {
 * Unless required by applicable law or agreed to in writing, software
    private final DBEPropertyHandler<OBJECT_TYPE> handler;
        } else {
            }
        new ControlPropertyCommandListener<>(objectEditor, widget, handler);
                case SWT.FocusIn:
            cl.set(Calendar.YEAR, dateTime.getYear());
            if (changingValue) {
                }
 * limitations under the License.

            return null;
import org.jkiss.dbeaver.model.edit.prop.DBECommandProperty;
            cl.set(Calendar.MINUTE, dateTime.getMinutes());

            log.warn("Control " + widget + " is not supported");
import org.eclipse.swt.events.DisposeListener;
}
 * DBeaver - Universal Database Manager
                cl.setTime((Date)value);
                }
import org.eclipse.swt.events.DisposeEvent;
            return cl.getTime();
                        public void redoCommand(@NotNull DBECommandProperty<OBJECT_TYPE> command)
                            writeWidgetValue(command.getNewValue());
                dateTime.setYear(cl.get(Calendar.YEAR));
                dateTime.setHours(cl.get(Calendar.HOUR_OF_DAY));
            public void widgetDisposed(DisposeEvent e)
 *
                        } else {
    private static final Log log = Log.getLog(ControlPropertyCommandListener.class);
    private final Widget widget;
        if (widget == null || widget.isDisposed()) {
/**
    {
                        {
        widget.addListener(SWT.FocusOut, listener);
                    // Forgot current command
            return ((List)widget).getSelection();
                            writeWidgetValue(command.getOldValue());
import org.jkiss.dbeaver.Log;
                    break;
        Widget widget,
        if (widget instanceof Text) {
    }
import org.jkiss.dbeaver.model.edit.DBECommandReflector;
        } else if (widget instanceof Button) {
            }
    }
 *
            Calendar cl = Calendar.getInstance();
    public static <OBJECT_TYPE extends DBSObject> void create(
        AbstractDatabaseObjectEditor<OBJECT_TYPE> objectEditor,
                //widget.removeListener();
            cl.set(Calendar.MONTH, dateTime.getMonth());
                            curCommand = null;

                    break;
    private final AbstractDatabaseObjectEditor<OBJECT_TYPE> objectEditor;
        widget.addDisposeListener(new DisposeListener() {
                    if (curCommand == null) {
        {
                        curCommand = null;
                    break;

        }
 * You may obtain a copy of the License at
                case SWT.FocusOut:
        @Override
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
                    }
            return null;
                dateTime.setMinutes(cl.get(Calendar.MINUTE));

                    };
                ((Button)widget).setSelection(value != null && Boolean.TRUE.equals(value));
            } else if (widget instanceof Button) {
        if (widget == null || widget.isDisposed()) {
                }
                    }
                Calendar cl = Calendar.getInstance();
        });
            changingValue = false;
            cl.set(Calendar.SECOND, dateTime.getSeconds());
                dateTime.setSeconds(cl.get(Calendar.SECOND));
                dateTime.setDay(cl.get(Calendar.DAY_OF_MONTH));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            } else if (widget instanceof Spinner) {
        } else if (widget instanceof List) {
        } finally {
                        @Override
import org.jkiss.dbeaver.model.edit.prop.DBEPropertyHandler;
                        }
                    originalValue = readWidgetValue();
 * Copyright (C) 2010-2025 DBeaver Corp and others
                        public void undoCommand(@NotNull DBECommandProperty<OBJECT_TYPE> command)
            DateTime dateTime = (DateTime) widget;
                            curCommand = new DBECommandProperty<>(objectEditor.getDatabaseObject(), handler, originalValue, newValue);
            } else if (widget instanceof List) {
    private void writeWidgetValue(Object value)
    private Object readWidgetValue()
                        }
        try {
import java.util.Date;
        }
        AbstractDatabaseObjectEditor<OBJECT_TYPE> objectEditor,
            return ((Text)widget).getText();
            {
                ((Spinner)widget).setSelection(CommonUtils.toInt(value));
                    } else {

        }
                {
        } else if (widget instanceof Spinner) {
                            curCommand.setNewValue(newValue);
    public ControlPropertyCommandListener(
 * Abstract object command
/*
                ((Text)widget).setText(CommonUtils.toString(value));
import org.eclipse.swt.widgets.*;
        widget.addListener(SWT.Modify, listener);
            } else {
 */
                        {
        public void handleEvent(Event event)
                        if (!CommonUtils.equalObjects(newValue, originalValue)) {
            } else if (widget instanceof DateTime) {
    private class WidgetListener implements Listener {
                    final Object newValue = readWidgetValue();
        Widget widget,
    //private Object newValue;
        }
                case SWT.Modify:
            @Override
                            objectEditor.addChangeCommand(curCommand, commandReflector);
                DateTime dateTime = (DateTime) widget;
        changingValue = true;
    }
    private Object originalValue;
    private DBECommandProperty<OBJECT_TYPE> curCommand;
        this.handler = handler;
    }
                            objectEditor.updateChangeCommand(curCommand, commandReflector);
                    DBECommandReflector<OBJECT_TYPE, DBECommandProperty<OBJECT_TYPE>> commandReflector = new DBECommandReflector<OBJECT_TYPE, DBECommandProperty<OBJECT_TYPE>>() {
            return ((Spinner)widget).getSelection();
public class ControlPropertyCommandListener<OBJECT_TYPE extends DBSObject> {
                return;
import org.jkiss.utils.CommonUtils;
                // not supported
    {
    private boolean changingValue = false;
