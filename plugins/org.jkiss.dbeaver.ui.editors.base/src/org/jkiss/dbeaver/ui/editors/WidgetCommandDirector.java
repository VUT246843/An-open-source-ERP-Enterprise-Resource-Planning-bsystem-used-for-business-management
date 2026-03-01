    {
/*
 * See the License for the specific language governing permissions and
    @Override
    }
    }
 * limitations under the License.
    public void removeHandlerListener(IHandlerListener handlerListener)
        return true;
    public boolean isEnabled()
/**

}
                text.invokeAction(widgetCommand);
        return null;
        return true;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public Object execute(ExecutionEvent event) throws ExecutionException
    }
 *
 * Command director
    {


import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.handlers.HandlerUtil;
package org.jkiss.dbeaver.ui.editors;
    public void dispose()
 * DBeaver - Universal Database Manager
    }

import org.eclipse.ui.ISources;
    }

            }

    {
 *
 * Unless required by applicable law or agreed to in writing, software
    {
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
            Text text = (Text)control;
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
            if (ITextEditorActionDefinitionIds.LINE_START.equals(commandID) ||


import org.eclipse.core.commands.ExecutionEvent;
                text.setSelection(text.getCharCount());
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
public class WidgetCommandDirector implements IHandler {
            if (widgetCommand != null) {
    {

                text.setSelection(0);
        if (control instanceof Text) {
                ITextEditorActionDefinitionIds.TEXT_END.equals(commandID)) {
import org.eclipse.core.commands.IHandlerListener;
    @Override
        }
 * You may obtain a copy of the License at
    {
 */
import org.eclipse.swt.custom.StyledText;
            StyledText text = (StyledText)control;
import org.eclipse.swt.widgets.Text;

    @Override

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public boolean isHandled()

            } else if (ITextEditorActionDefinitionIds.LINE_END.equals(commandID) ||
 *
        } else if (control instanceof StyledText) {
 * you may not use this file except in compliance with the License.
import org.eclipse.core.commands.ExecutionException;
    @Override
                ITextEditorActionDefinitionIds.TEXT_START.equals(commandID)) {
    @Override
        Object control = HandlerUtil.getVariable(event, ISources.ACTIVE_FOCUS_CONTROL_NAME);

    public void addHandlerListener(IHandlerListener handlerListener)
        String commandID = event.getCommand().getId();
            Integer widgetCommand = TextEditorUtils.getTextEditorActionMap().get(commandID);
