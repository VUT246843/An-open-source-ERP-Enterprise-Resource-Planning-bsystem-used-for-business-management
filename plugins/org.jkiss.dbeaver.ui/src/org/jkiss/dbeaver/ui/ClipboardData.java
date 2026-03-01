package org.jkiss.dbeaver.ui;
/**
import java.util.IdentityHashMap;
        final Object[] objects = formats.values().toArray(new Object[size]);
        return !formats.isEmpty();
            clipboard.setContents(objects, transfers);

    }
 * limitations under the License.
        final int size = formats.size();
    }
 */
 * Unless required by applicable law or agreed to in writing, software
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.eclipse.swt.dnd.Clipboard;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    public void pushToClipboard(Display display) {


import java.util.Map;

 * DBeaver - Universal Database Manager

        } finally {
public class ClipboardData
    }
    }
        return formats.containsKey(transfer);
    public boolean hasTransfer(Transfer transfer) {
            clipboard.dispose();
 */
        }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
{
    }
 *
    public boolean hasData() {
    public void addTransfer(Transfer transfer, Object data) {
 * Clipboard data
 * See the License for the specific language governing permissions and
}/*
 * you may not use this file except in compliance with the License.
    public ClipboardData() {
        formats.put(transfer, data);
 * Copyright (C) 2010-2024 DBeaver Corp and others



        try {

        Clipboard clipboard = new Clipboard(display);
 * Licensed under the Apache License, Version 2.0 (the "License");
        final Transfer[] transfers = formats.keySet().toArray(new Transfer[size]);
 * You may obtain a copy of the License at
import org.eclipse.swt.widgets.Display;
    private final Map<Transfer, Object> formats = new IdentityHashMap<>();
import org.eclipse.swt.dnd.Transfer;

