import org.eclipse.gef.requests.CreationFactory;
	{
 * you may not use this file except in compliance with the License.
 * limitations under the License.
	@Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
	{

 *
/*
	}
 */

 *
import org.eclipse.gef.dnd.TemplateTransferDropTargetListener;
 */
{

 *
package org.jkiss.dbeaver.ui.editors.erd.dnd;
}
		super(viewer);
 * Provides a listener for dropping templates onto the editor drawing
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	public DataEditDropTargetListener(EditPartViewer viewer)
 * You may obtain a copy of the License at
    protected CreationFactory getFactory(Object template)

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.gef.EditPartViewer;
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
 */
	}


		return new DataElementFactory(template);
 * See the License for the specific language governing permissions and
public class DataEditDropTargetListener extends TemplateTransferDropTargetListener
 * DBeaver - Universal Database Manager
 * Created on Jul 14, 2004
