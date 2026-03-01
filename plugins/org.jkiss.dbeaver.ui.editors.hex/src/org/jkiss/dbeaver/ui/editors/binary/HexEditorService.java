 * you may not use this file except in compliance with the License.
    public byte[] getHexContent(Control control) {
 * See the License for the specific language governing permissions and
    public Control createHexControl(Composite parent, boolean readOnly) {
            content.get(buffer, 0);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.nio.ByteBuffer;
    @Override
    }
import org.eclipse.swt.widgets.Composite;
        GridData gd = new GridData(GridData.FILL_BOTH);
    }
import org.jkiss.dbeaver.Log;
        hexEditControl.setContent(bytes, charset);
package org.jkiss.dbeaver.ui.editors.binary;

    }

        return hexEditControl;
 *     http://www.apache.org/licenses/LICENSE-2.0
}
import org.jkiss.dbeaver.ui.data.IHexEditorService;
        return buffer.array();
    @Override
            log.error(e);
 * Unless required by applicable law or agreed to in writing, software
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        gd.heightHint = 200;
        } catch (IOException e) {
        gd.minimumWidth = hexEditControl.computeSize(SWT.DEFAULT, SWT.DEFAULT).x;
        BinaryContent content = hexEditControl.getContent();
 */

 * DBeaver - Universal Database Manager
        ByteBuffer buffer = ByteBuffer.allocate((int) content.length());
 *
 * Hex editor service implementation
 *
import java.io.IOException;
        HexEditControl hexEditControl = (HexEditControl) control;
public class HexEditorService implements IHexEditorService {

        hexEditControl.setLayoutData(gd);
/*
        HexEditControl hexEditControl = new HexEditControl(parent, readOnly ? SWT.READ_ONLY : SWT.NONE, 6, 8);
 * limitations under the License.

        HexEditControl hexEditControl = (HexEditControl) control;
import org.eclipse.swt.widgets.Control;
        try {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
/**
    public void setHexContent(Control control, byte[] bytes, String charset) {
 */
import org.eclipse.swt.SWT;
    private static final Log log = Log.getLog(HexEditorService.class);
    @Override

        }

import org.eclipse.swt.layout.GridData;
 * Copyright (C) 2010-2024 DBeaver Corp and others

