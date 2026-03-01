 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.e4.ui.css.core.dom.IElementProvider;
 * DBeaver - Universal Database Manager
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");

    public Element getElement(Object element, CSSEngine engine) {
    }

public class ConElementProvider implements IElementProvider {
import org.jkiss.dbeaver.ui.ConComposite;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
}
        if (element instanceof ConComposite mc) {
        return null;
    @Override
 *
import org.eclipse.e4.ui.css.core.engine.CSSEngine;
 *
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
        }
package org.jkiss.dbeaver.ui.css;

 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
            return new ConCompositeElement(mc, engine);
 */
 *

import org.w3c.dom.Element;
