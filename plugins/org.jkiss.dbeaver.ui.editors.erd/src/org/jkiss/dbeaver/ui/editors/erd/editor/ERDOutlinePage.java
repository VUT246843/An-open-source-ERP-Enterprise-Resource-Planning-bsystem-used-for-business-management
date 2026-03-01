        super();
 * You may obtain a copy of the License at
     */


    }
        thumbnail =
    public void dispose() {
     */
package org.jkiss.dbeaver.ui.editors.erd.editor;
    public void addSelectionChangedListener(ISelectionChangedListener listener) {
            new ScrollableThumbnail((Viewport) rootEditPart.getFigure());
        thumbnail.setSource(

     */
    public void setSelection(ISelection selection) {
    }

 * you may not use this file except in compliance with the License.
import org.eclipse.swt.SWT;
     */
import org.eclipse.swt.widgets.Control;
    @Override
    }
import org.eclipse.swt.widgets.Canvas;
     * @see org.eclipse.ui.part.IPage#dispose()
    @Override
            rootEditPart.getLayer(LayerConstants.PRINTABLE_LAYERS));
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
    @Override
    @Override
    }
     */

    public ERDOutlinePage(ScalableFreeformRootEditPart rootEditPart) {


    @Override
 *

import org.eclipse.jface.viewers.ISelection;
/**
    public void createControl(Composite parent) {
     * @see org.eclipse.ui.part.IPage#getControl()
    /* (non-Javadoc)
     */
import org.eclipse.draw2d.LightweightSystem;
    private Canvas overview;
import org.eclipse.jface.viewers.StructuredSelection;
        LightweightSystem lws = new LightweightSystem(overview);
    /**
 * overview of a graphical editor.
     * @see org.eclipse.ui.part.IPage#createControl(org.eclipse.swt.widgets.Composite)
 */

 * distributed under the License is distributed on an "AS IS" BASIS,
            getControl().setFocus();
import org.eclipse.jface.viewers.ISelectionChangedListener;
 *
import org.eclipse.draw2d.Viewport;
 * Unless required by applicable law or agreed to in writing, software
        overview = new Canvas(parent, SWT.NONE);
import org.eclipse.draw2d.parts.Thumbnail;
    private ScalableFreeformRootEditPart rootEditPart;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    /**
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
        super.dispose();
     */


        if (getControl() != null)
    public Control getControl() {
import org.eclipse.draw2d.MarginBorder;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class ERDOutlinePage extends Page implements IContentOutlinePage {
        // create canvas and lws
        if (null != thumbnail)
 * DBeaver - Universal Database Manager
import org.eclipse.ui.part.Page;

        // create thumbnail
import org.eclipse.swt.widgets.Composite;
    /* (non-Javadoc)
    }
    @Override
    private Thumbnail thumbnail;
    }
    public void setFocus() {
        thumbnail.setBorder(new MarginBorder(3));

}
    }
 */
     * the control of the overview

 *
import org.eclipse.gef.LayerConstants;
    /* (non-Javadoc)
    public void removeSelectionChangedListener(ISelectionChangedListener listener) {
    public ISelection getSelection() {
     * the root edit part
    /* (non-Javadoc)
     * @param rootEditPart the root edit part to show the overview from
        return StructuredSelection.EMPTY;

        this.rootEditPart = rootEditPart;
     * @see org.eclipse.jface.viewers.ISelectionProvider#setSelection(org.eclipse.jface.viewers.ISelection)
     * Creates a new ERDOutlinePage instance.
        lws.setContents(thumbnail);
import org.eclipse.draw2d.parts.ScrollableThumbnail;
 * limitations under the License.
 * @author Gunnar Wagenknecht
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
/*
 * This is a sample implementation of an outline page showing an
 * See the License for the specific language governing permissions and
    /**
     * the thumbnail
        return overview;
            thumbnail.deactivate();
     *
    @Override

     */
    /**
    }
    }

