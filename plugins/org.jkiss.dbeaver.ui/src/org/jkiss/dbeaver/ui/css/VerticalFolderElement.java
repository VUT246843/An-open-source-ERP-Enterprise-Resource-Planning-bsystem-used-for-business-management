import org.eclipse.e4.ui.css.swt.dom.CompositeElement;
	protected VerticalFolder getVerticalFolder() {
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
import java.util.Arrays;
 *
 * VerticalFolderElement
		return (VerticalFolder) getNativeWidget();
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.controls.VerticalFolder;
	public Stream<Node> stream() {
		return Arrays.stream(getVerticalFolder().getChildren()).map(this::getElement);
 *
 */
	}
public class VerticalFolderElement extends CompositeElement implements IStreamingNodeList {
	}
import org.eclipse.e4.ui.css.core.dom.IStreamingNodeList;

 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * distributed under the License is distributed on an "AS IS" BASIS,

 *
 * limitations under the License.
package org.jkiss.dbeaver.ui.css;

 * DBeaver - Universal Database Manager
/*
/**
	}
import org.w3c.dom.Node;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.e4.ui.css.core.engine.CSSEngine;
import java.util.stream.Stream;
 */
	@Override

	public VerticalFolderElement(VerticalFolder composite, CSSEngine engine) {

		super(composite, engine);
 * you may not use this file except in compliance with the License.

}
