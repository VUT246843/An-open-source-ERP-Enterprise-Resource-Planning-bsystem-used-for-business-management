 * limitations under the License.

    @Override
            final Object[] objects = selection.toArray();
    public void setSelection(ISelection selection, boolean reveal) {
        public Iterator iterator() {
        private final IStructuredSelection selection;
import org.jkiss.dbeaver.model.struct.DBSEntity;
    }
        } else {
    @Override
/*
            for (int i = 0; i < objects.length; i++) {
            List list = selection.toList();
        }
{
        public ERDSelectionAdapter(IStructuredSelection selection) {
                result[i] = convertObject(objects[i]);
    @Override

 *
        final ISelection selection = graphicalViewer.getSelection();
            }
                public boolean hasNext() {
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
    public ISelection getSelection() {
    private class ERDSelectionAdapter implements IStructuredSelection {
 * See the License for the specific language governing permissions and
import org.eclipse.jface.viewers.IStructuredSelection;
            return new Iterator() {
import java.util.List;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            this.selection = selection;
    @Override
    private static final Log log = Log.getLog(ERDEditorViewer.class);
                public Object next() {
    }

    @Override

            return selection;
        public List toList() {
                result.add(convertObject(list.get(i)));
            final Object firstElement = selection.getFirstElement();
        }

            return result;
 *
        @Override

 *     http://www.apache.org/licenses/LICENSE-2.0
        final GraphicalViewer graphicalViewer = editorPart.getGraphicalViewer();
        @Override
        return editorPart;
            for (int i = 0; i < list.size(); i++) {
            List<Object> result = new ArrayList<>(list.size());
 * ERD viewer adapter
                @Override
    }
 * Unless required by applicable law or agreed to in writing, software
        editorPart.getGraphicalViewer().setSelection(selection);

        public boolean isEmpty() {
            }
}
        }
/*
public class ERDEditorViewer extends Viewer
    public void refresh() {
        }

        public int size() {
import java.util.Iterator;
    @Override
import org.jkiss.dbeaver.ui.editors.erd.part.EntityPart;
            return selection.isEmpty();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public ERDEditorViewer(ERDEditorPart editorPart) {
            final Iterator iterator = selection.iterator();


    }

        @Override

                    return next == null ? null : convertObject(next);
        editorPart.refreshDiagram(true, true);
        @Override
                @Override
            return firstElement == null ? null : convertObject(firstElement);
    public Object getInput() {
    public Control getControl() {


        private Object convertObject(Object object) {
                }
        @Override
                    return iterator.hasNext();
    public ERDEditorPart getEditorPart() {

                final DBSEntity entity = ((EntityPart) object).getEntity().getObject();
        }
    }
        }
            return selection.size();

import org.eclipse.gef.GraphicalViewer;
    }
 * you may not use this file except in compliance with the License.
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.editorPart = editorPart;
        }
    }
import org.eclipse.swt.widgets.Control;
*/
import org.eclipse.jface.viewers.ISelection;

 */
import org.jkiss.dbeaver.model.navigator.DBNUtils;
        return editorPart.getGraphicalViewer().getContents();
        return editorPart.getGraphicalViewer().getControl();
        return graphicalViewer == new StructuredSelection() ? null : graphicalViewer.getSelection();
        }
/**
package org.jkiss.dbeaver.ui.editors.erd.editor;
    private final ERDEditorPart editorPart;
 *
        public Object[] toArray() {

        @Override
        public Object getFirstElement() {
                }
                return entity == null ? null : DBNUtils.getNodeByObject(entity);


import org.eclipse.jface.viewers.StructuredSelection;
    }
import java.util.ArrayList;
            };
            return result;
            return new StructuredSelection();
import org.jkiss.dbeaver.Log;
        if (graphicalViewer == null) {


import org.eclipse.jface.viewers.Viewer;
            return new ERDSelectionAdapter((IStructuredSelection)selection);

 * You may obtain a copy of the License at
            return object;
        }
    public void setInput(Object input) {
            if (object instanceof EntityPart) {

                    final Object next = iterator.next();
 */
        if (selection instanceof IStructuredSelection) {
            }
            final Object[] result = new Object[objects.length];
