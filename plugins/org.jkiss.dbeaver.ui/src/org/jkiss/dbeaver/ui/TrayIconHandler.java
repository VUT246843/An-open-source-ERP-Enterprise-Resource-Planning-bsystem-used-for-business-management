    }
        return SystemTray.isSupported();
                case IStatus.ERROR -> TrayIcon.MessageType.ERROR;
                    activeShell.setMinimized(false);
import org.eclipse.swt.widgets.Shell;
        });
                    showMainWindow();
 *     http://www.apache.org/licenses/LICENSE-2.0

 * distributed under the License is distributed on an "AS IS" BASIS,
                case IStatus.INFO -> TrayIcon.MessageType.INFO;
            return;
/*
import java.awt.event.MouseEvent;
            }
    private void showMainWindow() {
    }
        try {
            logoFile = RuntimeUtils.getPlatformFile(UIIcon.DBEAVER_LOGO.getLocation());
                default -> TrayIcon.MessageType.NONE;
    public void show()
        });


package org.jkiss.dbeaver.ui;
        // Add tooltip and menu to tray icon
import org.jkiss.dbeaver.utils.GeneralUtils;
                }
 * Tray icon handler
        Path logoFile;
            if (activeShell != null){
        } catch (Throwable e) {
 */
import java.awt.*;
        if (trayItem != null) {

            SystemTray.getSystemTray().add(trayItem);
                if (e.getButton() == MouseEvent.BUTTON1) {

    {
import org.jkiss.dbeaver.utils.RuntimeUtils;
            public void mouseReleased(MouseEvent e)
            log.error("Error showing tray notification", e);
/**
        }
            if (trayItem == null) {
import java.awt.event.MouseAdapter;

            showItem.addActionListener(e -> showMainWindow());
import org.jkiss.dbeaver.Log;
 */

        if (trayItem != null) {
    // AWT tray icon. SWT TrayItem do not support displayMessage function
    private TrayIcon trayItem;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        {
 * you may not use this file except in compliance with the License.
    }
 * You may obtain a copy of the License at
            log.error(e);
 * See the License for the specific language governing permissions and
            PopupMenu popupMenu = new PopupMenu();
            popupMenu.add(showItem);
        trayItem = new TrayIcon(Toolkit.getDefaultToolkit().getImage(logoFile.toAbsolutePath().toString()));
            SystemTray.getSystemTray().remove(trayItem);
 * Unless required by applicable law or agreed to in writing, software
    }
import java.io.IOException;
            trayItem = null;
        }

        try {
            @Override
            Shell activeShell = UIUtils.getActiveWorkbenchShell();
    public void notify(String message, int status)
        trayItem.setImageAutoSize(true);
    public static boolean isSupported() {
 * DBeaver - Universal Database Manager
 *
                if (activeShell.getMinimized()) {
import org.eclipse.core.runtime.IStatus;
                activeShell.forceActive();
        trayItem.addMouseListener(new MouseAdapter() {
                } catch (Exception e) {
    public void hide()
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
        // area
    }
            {
        }


                    show();
        } catch (AWTException e) {
 * limitations under the License.

        });

        trayItem.setToolTip(GeneralUtils.getProductTitle());

    private static final Log log = Log.getLog(TrayIconHandler.class);
    {
        // Add the trayIcon to system tray/notification

import java.nio.file.Path;
            return;
    {
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        try {
                }
            trayItem.setPopupMenu(popupMenu);
            log.error(e);
            }
                    return;
            trayItem.displayMessage(GeneralUtils.getProductTitle(), message, type);
public class TrayIconHandler {
        trayItem.addActionListener(e -> {
            }
                case IStatus.WARNING -> TrayIcon.MessageType.WARNING;
                try {
        }
        } catch (IOException e) {
        }
            TrayIcon.MessageType type = switch (status) {
            MenuItem showItem = new MenuItem("Show DBeaver");

            };
        }
                }
        UIUtils.asyncExec(() -> {
}
                    log.warn("Can't show tray item", e);
