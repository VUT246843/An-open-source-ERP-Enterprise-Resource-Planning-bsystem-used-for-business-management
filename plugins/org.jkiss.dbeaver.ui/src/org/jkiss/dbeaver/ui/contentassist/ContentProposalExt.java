        super(content, label, description);
    @Nullable
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
        super(content, label, description, cursorPosition);
        super(content);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public ContentProposalExt(String content, String label, String description, int cursorPosition) {
    public ContentProposalExt(String content, String label, String description) {
    }

        this.image = image;
    public ContentProposalExt(String content, String label, String description, int cursorPosition, DBPImage image) {
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    @Override
 * See the License for the specific language governing permissions and
        this.image = image;
    private DBPImage image;

 *

/*
package org.jkiss.dbeaver.ui.contentassist;
 *     http://www.apache.org/licenses/LICENSE-2.0
        super(content, description);
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
        return image;

import org.jkiss.dbeaver.model.DBPImageProvider;
 *
    public void setObjectImage(DBPImage image) {
import org.eclipse.jface.fieldassist.ContentProposal;
import org.jkiss.dbeaver.model.DBPImage;
    public DBPImage getObjectImage() {
import org.jkiss.code.Nullable;
    public ContentProposalExt(String content, String label, String description, DBPImage image) {
        this.image = image;
 * you may not use this file except in compliance with the License.
    public ContentProposalExt(String content, String description) {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,


 * Unless required by applicable law or agreed to in writing, software

    }



    }
 *
        super(content, label, description, cursorPosition);
 */
public class ContentProposalExt extends ContentProposal implements DBPImageProvider {

 * limitations under the License.
    public ContentProposalExt(String content) {
        super(content, label, description);
    }
}
