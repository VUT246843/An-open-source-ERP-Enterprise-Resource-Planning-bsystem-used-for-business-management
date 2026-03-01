        if (diagram instanceof ERDContainerDecorated decoratedDiagram) {

                    attributeVisibility = visualInfo.attributeVisibility;
    }

 *
                }
}

 * you may not use this file except in compliance with the License.
                    attributeVisibility = decoratedDiagram.getAttributeVisibility();
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.erd.*;
 */
    private static final Log log = Log.getLog(ERDContentProviderDecorated.class);
                if (visualInfo != null) {
        fillEntityFromObject(monitor, diagram, otherEntities, erdEntity, new ERDAttributeSettings(attributeVisibility, alphabeticalOrder));
            attributeVisibility = decoratedDiagram.getDecorator().supportsAttributeVisibility() ?
public class ERDContentProviderDecorated extends ERDContentProviderDefault {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
    public void fillEntityFromObject(@NotNull DBRProgressMonitor monitor, @NotNull ERDDiagram diagram,
            }
/**
                                     @NotNull List<ERDEntity> otherEntities, @NotNull ERDEntity erdEntity) throws DBCException {
                }

import org.jkiss.dbeaver.ui.editors.erd.editor.ERDViewStyle;
                EntityDiagram.NodeVisualInfo visualInfo = decoratedDiagram.getVisualInfo(erdEntity.getObject(), false);
 * See the License for the specific language governing permissions and
 *
 * Unless required by applicable law or agreed to in writing, software
        }
                if (attributeVisibility == null) {
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.Log;
        ERDAttributeVisibility attributeVisibility = ERDAttributeVisibility.ALL;
 */
            alphabeticalOrder = decoratedDiagram.hasAttributeStyle(ERDViewStyle.ALPHABETICAL_ORDER);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * DBeaver - Universal Database Manager

    }
import org.jkiss.code.NotNull;
    public ERDContentProviderDecorated() {
 * limitations under the License.
            if (attributeVisibility == null) {
 * ERD content provider decorated
import org.jkiss.dbeaver.model.exec.DBCException;
    @Override
                erdEntity.getAttributeVisibility() : ERDAttributeVisibility.ALL;
        boolean alphabeticalOrder = false;
package org.jkiss.dbeaver.ui.editors.erd.model;
 *     http://www.apache.org/licenses/LICENSE-2.0

import java.util.List;
 *
