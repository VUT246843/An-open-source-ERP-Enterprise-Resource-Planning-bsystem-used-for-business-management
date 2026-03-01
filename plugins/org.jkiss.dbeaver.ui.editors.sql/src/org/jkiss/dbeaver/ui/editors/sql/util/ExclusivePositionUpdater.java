                    position.delete();
                    // offset becomes end of event, length adjusted accordingly
    }
import org.eclipse.jface.text.BadPositionCategoryException;
    {

/*
package org.jkiss.dbeaver.ui.editors.sql.util;
 *
                {
                }
 * Licensed under the Apache License, Version 2.0 (the "License");
        int eventNewLength = event.getText() == null ? 0 : event.getText().length();
    public void update(DocumentEvent event)
        int deltaLength = eventNewLength - eventOldLength;
                int length = position.getLength();
            // ignore and return
                {
                    position.setLength(end - newOffset);
 *
                    // leave alone
                else if (end <= eventOffset)
 * distributed under the License is distributed on an "AS IS" BASIS,
                    // event consumes the position - delete it
 * limitations under the License.
        int eventOffset = event.getOffset();

 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
public class ExclusivePositionUpdater implements IPositionUpdater
    {
                else
 * DBeaver - Universal Database Manager
                    continue;
import org.eclipse.jface.text.Position;

        return category;
        {
                else if (end > eventOffset + eventOldLength)

                    int newOffset = eventOffset + eventNewLength;
                }
            Position[] positions = event.getDocument().getPositions(category);
                    position.setLength(eventOffset - offset);
                if (offset >= eventOffset + eventOldLength)
                int offset = position.getOffset();
import org.eclipse.jface.text.DocumentEvent;
        }
    }
                }
                }
    }
        {
                    // event completely renderers to the position - adjust length
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
                    // after change - shift
    public ExclusivePositionUpdater(String category)
                {
                Position position = positions[i];
        catch (BadPositionCategoryException e)
                {

 * you may not use this file except in compliance with the License.

                {
                    // position comes
                    position.setOffset(newOffset);
                if (position.isDeleted())
                    // event extends over end of position - adjust length
                int end = offset + length;
                {

//            _log.debug(EditorMessages.error_badLocationException, e);
                    position.setOffset(offset + deltaLength);
                    position.setLength(length + deltaLength);
        int eventOldLength = event.getLength();
                else if (offset <= eventOffset && end >= eventOffset + eventOldLength)
            }
                    // and length
    @Override


            {

        this.category = category;
 *     http://www.apache.org/licenses/LICENSE-2.0
                {

 */
{
import org.eclipse.jface.text.IPositionUpdater;
                    // event extends from before position into it - adjust offset
    private final String category;

                    // position comes way before change -
        try
                else if (offset < eventOffset)
 * Unless required by applicable law or agreed to in writing, software

 *
                }
 * You may obtain a copy of the License at
                }
    {

                }
}            for (int i = 0; i != positions.length; i++)
    public String getCategory()
