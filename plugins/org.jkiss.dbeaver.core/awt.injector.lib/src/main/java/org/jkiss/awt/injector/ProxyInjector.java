
 * Licensed under the Apache License, Version 2.0 (the "License");
        Field peerField = desktopClass.getDeclaredField("peer");
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.net.URI;
        Desktop desktop = Desktop.getDesktop();
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
    }
            peerField.set(desktop, new BrowsePeerProxy(peer, isBrowseSupportedCallable, browseFunction));
 *


 * See the License for the specific language governing permissions and
        Callable<Boolean> isBrowseSupportedCallable,
        }
}
        Class<? extends Desktop> desktopClass = desktop.getClass();
        Object peerObject = peerField.get(desktop);
        Function<URI, Boolean> browseFunction
 *
import java.util.function.Function;
 * you may not use this file except in compliance with the License.
    ) throws NoSuchFieldException, IllegalAccessException {
        peerField.setAccessible(true);
import java.util.concurrent.Callable;
        if (peerObject != null) {
import java.awt.peer.DesktopPeer;
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.awt.injector;
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
import java.lang.reflect.Field;
            DesktopPeer peer = (DesktopPeer) peerObject;
    public void injectBrowseInteraction(
 */
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.awt.*;
public class ProxyInjector {
 *
