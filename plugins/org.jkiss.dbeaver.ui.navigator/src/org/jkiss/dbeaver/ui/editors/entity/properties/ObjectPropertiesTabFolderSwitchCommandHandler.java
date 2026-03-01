 * DBeaver - Universal Database Manager
            }
 *
                ObjectPropertiesEditor propsEditor = (ObjectPropertiesEditor) currentPage;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
                TabbedFolderInfo[] foldersInfo = propsEditor.collectFolders(propsEditor);
import org.eclipse.core.commands.AbstractHandler;
        }
import org.jkiss.dbeaver.ui.controls.folders.TabbedFolderInfo;
        IEditorPart editor = HandlerUtil.getActiveEditor(event);
        Integer indexDelta = NEXT_PAGE_COMMAND_ID.equals(event.getCommand().getId()) ? 1 : -1;
    @Nullable
    
                String activeFolderId = propsEditor.getActiveFolderId();
 *     http://www.apache.org/licenses/LICENSE-2.0
                int targetFolderIndex = (activeFolderIndex + indexDelta + foldersInfo.length) % foldersInfo.length;
            if (currentPage instanceof ObjectPropertiesEditor) {
 *
 * you may not use this file except in compliance with the License.

import org.jkiss.utils.ArrayUtils;
    
    }
    public static final String PREV_PAGE_COMMAND_ID = "org.jkiss.dbeaver.entity.propsTab.prevPage";
import org.eclipse.ui.part.MultiPageEditorPart;

    public static final String NEXT_PAGE_COMMAND_ID = "org.jkiss.dbeaver.entity.propsTab.nextPage";
    public Object execute(@NotNull ExecutionEvent event) throws ExecutionException {
import org.jkiss.code.Nullable;
            Object currentPage = pagedEditor.getSelectedPage();
    
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ui.editors.entity.properties;
import org.eclipse.ui.IEditorPart;
        if (indexDelta != null && editor instanceof MultiPageEditorPart) {

 * Copyright (C) 2010-2024 DBeaver Corp and others
                int activeFolderIndex = ArrayUtils.indexOf(foldersInfo, f -> f.getId().equals(activeFolderId));
}

import org.eclipse.core.commands.ExecutionException;
 * limitations under the License.
        return null;
public class ObjectPropertiesTabFolderSwitchCommandHandler extends AbstractHandler {
 *
import org.eclipse.core.commands.ExecutionEvent;
 * See the License for the specific language governing permissions and
import org.eclipse.ui.handlers.HandlerUtil;
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
 */
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            MultiPageEditorPart pagedEditor = (MultiPageEditorPart) editor;
                propsEditor.switchFolder(foldersInfo[targetFolderIndex].getId());
    @Override
