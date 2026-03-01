
}
import org.eclipse.gef.EditDomain;
	{
 */
/*
	{
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
 * Created on Aug 12, 2004
	 * implicit constructor
 *     http://www.apache.org/licenses/LICENSE-2.0
	}

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*

 */
 * PaletteViewerProvider subclass used for initialising drag and drop
import org.eclipse.gef.dnd.TemplateTransferDragSourceListener;
	public ERDPaletteViewerProvider(EditDomain graphicalViewerDomain)
 * See the License for the specific language governing permissions and
import org.eclipse.gef.ui.palette.PaletteViewer;
 * distributed under the License is distributed on an "AS IS" BASIS,
		super(graphicalViewerDomain);
public class ERDPaletteViewerProvider extends PaletteViewerProvider
	 */
	/**
 *
import org.eclipse.gef.ui.palette.PaletteViewerProvider;
 */
 * limitations under the License.
 *
	}
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ui.editors.erd.editor;
    protected void configurePaletteViewer(PaletteViewer viewer)
/**
		viewer.addDragSourceListener(new TemplateTransferDragSourceListener(viewer));
	@Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
		super.configurePaletteViewer(viewer);
{
 * DBeaver - Universal Database Manager

 * @author Serge Rider
