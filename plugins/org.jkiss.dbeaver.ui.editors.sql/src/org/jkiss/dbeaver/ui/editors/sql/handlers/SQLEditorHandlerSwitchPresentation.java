 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
import org.eclipse.core.commands.ExecutionException;
 * You may obtain a copy of the License at
}
        final SQLEditor editor = RuntimeUtils.getObjectAdapter(HandlerUtil.getActiveEditor(event), SQLEditor.class);
        }
import java.util.Map;
    public static final String PARAM_PRESENTATION_ID = "presentationId";
 *
    @Override
 *


        return null;
        if (CommonUtils.isEmpty(presentationId)) {
        }
                    SQLPresentationDescriptor::getId
        public Map<?, ?> getParameterValues() {
        }
    public static class ParameterValues implements IParameterValues {
        }
    }

import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
 */

                .collect(Collectors.toMap(
                ));
 * limitations under the License.
import org.eclipse.core.commands.IParameterValues;
        @Override

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
            return null;
 * Unless required by applicable law or agreed to in writing, software
        } else {
            editor.showExtraPresentation(presentationId);
            return SQLPresentationRegistry.getInstance().getPresentations().stream()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.stream.Collectors;
                    SQLPresentationDescriptor::getLabel,
    public Object execute(ExecutionEvent event) throws ExecutionException {
        final SQLPresentationDescriptor descriptor = editor.getExtraPresentationDescriptor();
import org.eclipse.core.commands.AbstractHandler;
        final String presentationId = event.getParameter(PARAM_PRESENTATION_ID);
import org.jkiss.utils.CommonUtils;
        if (descriptor != null && descriptor.getId().equals(presentationId)) {
import org.eclipse.core.commands.ExecutionEvent;

            editor.showExtraPresentation((SQLPresentationDescriptor) null);
import org.jkiss.dbeaver.ui.editors.sql.registry.SQLPresentationDescriptor;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.utils.RuntimeUtils;
import org.jkiss.dbeaver.ui.editors.sql.registry.SQLPresentationRegistry;

 *     http://www.apache.org/licenses/LICENSE-2.0
        if (editor == null) {
import org.eclipse.ui.handlers.HandlerUtil;
    public static final String CMD_SWITCH_PRESENTATION_ID = "org.jkiss.dbeaver.ui.editors.sql.switch.presentation";
 * See the License for the specific language governing permissions and
            return null;

/*
public class SQLEditorHandlerSwitchPresentation extends AbstractHandler {
    }
package org.jkiss.dbeaver.ui.editors.sql.handlers;
