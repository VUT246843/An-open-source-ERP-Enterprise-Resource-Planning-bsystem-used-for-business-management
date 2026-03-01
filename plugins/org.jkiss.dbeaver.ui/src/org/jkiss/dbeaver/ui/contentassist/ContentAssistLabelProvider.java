        if (element instanceof DBPImageProvider) {
 *
 * See the License for the specific language governing permissions and



 * Unless required by applicable law or agreed to in writing, software
public class ContentAssistLabelProvider extends BaseLabelProvider implements ILabelProvider {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.graphics.Image;
        return element instanceof IContentProposal ? ((IContentProposal) element).getLabel() : CommonUtils.toString(element);
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
 */
    }
/*
    }
 * limitations under the License.
            return image == null ? null : DBeaverIcons.getImage(image);
    @Override
import org.eclipse.jface.viewers.ILabelProvider;
import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.eclipse.jface.viewers.BaseLabelProvider;
package org.jkiss.dbeaver.ui.contentassist;
    public Image getImage(Object element) {
import org.jkiss.dbeaver.model.DBPImage;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
            DBPImage image = ((DBPImageProvider) element).getObjectImage();
import org.jkiss.utils.CommonUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPImageProvider;
        return null;
import org.eclipse.jface.fieldassist.IContentProposal;
 * You may obtain a copy of the License at
    public String getText(Object element) {
 *
 * DBeaver - Universal Database Manager
        }
}
 * you may not use this file except in compliance with the License.
