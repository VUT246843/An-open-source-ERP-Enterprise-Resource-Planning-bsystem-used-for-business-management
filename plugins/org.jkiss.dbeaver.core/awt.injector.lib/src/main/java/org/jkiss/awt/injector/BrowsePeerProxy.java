import javax.swing.*;
    public boolean browseFileDirectory(File file) {
        peer.mail(mailtoURL);


    }
import java.io.IOException;
    }
        peer.addAppEventListener(listener);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void requestForeground(boolean allWindows) {
    BrowsePeerProxy(

 * Licensed under the Apache License, Version 2.0 (the "License");
        peer.print(file);
 * DBeaver - Universal Database Manager


            }
 * See the License for the specific language governing permissions and
        peer.setOpenFileHandler(openFileHandler);
 */
    public boolean moveToTrash(File file) {
    @Override
        return peer.browseFileDirectory(file);
    public void setQuitHandler(QuitHandler quitHandler) {
        peer.setOpenURIHandler(openURIHandler);

    }
    public void removeAppEventListener(SystemEventListener listener) {
    @Override

 *
        try {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
        peer.enableSuddenTermination();
        }
    public void print(File file) throws IOException {
                return true;
    @Override
    public void browse(URI uri) throws IOException {
    }

        DesktopPeer peer,
            Boolean success = this.isBrowseSupportedCallable.call();

    }
    }
            // ignored
    }
    public void edit(File file) throws IOException {
    }
        peer.openHelpViewer();

        peer.requestForeground(allWindows);
    }
        peer.open(file);


    @Override
        } catch (Exception ignored) {
    private final Callable<Boolean> isBrowseSupportedCallable;
        peer.print(file);
    @Override
    @Override
import java.awt.peer.*;
    ) {
    @Override
    @Override
    }
                return;

import java.util.function.Function;
        Function<URI, Boolean> browseFunction

    }
    public void openHelpViewer() {
        this.peer = peer;
        peer.removeAppEventListener(listener);
    @Override
    public void setOpenFileHandler(OpenFilesHandler openFileHandler) {

        this.isBrowseSupportedCallable = isBrowseSupportedInteraction;
 *     http://www.apache.org/licenses/LICENSE-2.0

 *

    }
        peer.browse(uri);
    }
    private final DesktopPeer peer;
 * You may obtain a copy of the License at
        peer.setPreferencesHandler(preferencesHandler);

    }
    @Override
    public void setAboutHandler(AboutHandler aboutHandler) {
    }
    public void setPrintFileHandler(PrintFilesHandler printFileHandler) {
    @Override
 * Unless required by applicable law or agreed to in writing, software
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    public void setDefaultMenuBar(JMenuBar menuBar) {
    @Override
    @Override

/*
        } catch (Exception ignored) {
    public boolean isSupported(Desktop.Action action) {
        peer.setAboutHandler(aboutHandler);
    }
package org.jkiss.awt.injector;
    public void addAppEventListener(SystemEventListener listener) {
        peer.setQuitStrategy(strategy);
    @Override

        peer.disableSuddenTermination();
    }
import java.net.URI;

    }
 *
class BrowsePeerProxy implements DesktopPeer {
            // ignored
            if (success) {

        return peer.moveToTrash(file);
    @Override
        peer.setQuitHandler(quitHandler);
        this.browseFunction = browseFunction;
        Callable<Boolean> isBrowseSupportedInteraction,
    public void setQuitStrategy(QuitStrategy strategy) {
        try {
    @Override
 * you may not use this file except in compliance with the License.
        peer.setPrintFileHandler(printFileHandler);
            Boolean success = this.browseFunction.apply(uri);

    }
    public void enableSuddenTermination() {

        return peer.isSupported(action);
import java.util.concurrent.Callable;

        }
    public void open(File file) throws IOException {
import java.io.File;
        peer.setDefaultMenuBar(menuBar);
    }
    }
 * limitations under the License.
    private final Function<URI, Boolean> browseFunction;
    public void setOpenURIHandler(OpenURIHandler openURIHandler) {
    public void disableSuddenTermination() {
}
    public void setPreferencesHandler(PreferencesHandler preferencesHandler) {
    public void mail(URI mailtoURL) throws IOException {
import java.awt.*;
    @Override
    @Override
    }
    @Override
            }
import java.awt.desktop.*;

    @Override

            if (success) {
