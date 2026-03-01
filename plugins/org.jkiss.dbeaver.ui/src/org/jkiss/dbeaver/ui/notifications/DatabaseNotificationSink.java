import org.eclipse.jface.window.Window;
        if (store.getBoolean(ScreenReaderPreferences.PREF_FORCE_FOCUS_ON_EDITOR)) {
    private final WeakHashMap<Object, Object> cancelledTokens = new WeakHashMap<>();
        popup.setContents(toDisplay);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        // set focus for all screen readers



                        collectNotifications();
                            if (!currentlyNotifying.isEmpty()) {
            }
                                showPopup();
            return currentlyNotifying;
        }
        if (popup != null) {
    private static final boolean runSystem = true;
    }
 * You may obtain a copy of the License at
        currentlyNotifying.addAll(event.getNotifications());
        popup.setDelayClose(store.getInt(ModelPreferences.NOTIFICATIONS_CLOSE_DELAY_TIMEOUT));
        }
            popup.close();

    private final Job openJob = new Job("Database notifications") {

import org.eclipse.swt.widgets.Display;
                }

    public DatabaseNotificationSink() {
    public Set<AbstractNotification> getNotifications() {
                openJob.join();
                        currentlyNotifying.removeIf(notification -> notification.getToken() != null
import java.util.*;
                        schedule(1000);
        cleanNotified();
 * distributed under the License is distributed on an "AS IS" BASIS,
                                }
            }
                            }
                            List<AbstractNotification> notifications = popup.getNotifications();
            }
                        return Status.OK_STATUS;
            try {
    private final Set<AbstractNotification> currentlyNotifying = Collections.synchronizedSet(notifications);
        Shell shell = new Shell(PlatformUI.getWorkbench().getDisplay());

                        synchronized (DatabaseNotificationSink.class) {
                    if (!PlatformUI.isWorkbenchRunning()) {
import org.eclipse.ui.PlatformUI;
        }

                        }
        popup.setFadingEnabled(false);
                                if (notification.getToken() != null) {
        Collections.sort(toDisplay);
    private void cleanNotified() {
            } finally {
                if (popup != null && !DBWorkbench.getPlatform().isShuttingDown()) {
                // ignore

                        }
            if (monitor.isCanceled()) {
 * you may not use this file except in compliance with the License.
 * limitations under the License.
                    if (display == null || display.isDisposed()) {
 *
 *
        popup.open();

                    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    private final Set<AbstractNotification> notifications = new HashSet<>();
        protected IStatus run(IProgressMonitor monitor) {
                        if (popup != null && popup.getReturnCode() == Window.CANCEL) {
        @Override
//										popup.close();
 *

                return Status.CANCEL_STATUS;
                    schedule(popup.getDelayClose() / 2);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
                    display.asyncExec(() -> {

    private void showPopup() {
        popup = new DatabaseNotificationPopup(shell);

    }
/*
                            && cancelledTokens.containsKey(notification.getToken()));
 */
    }
    }
import org.eclipse.core.runtime.IProgressMonitor;
                            for (AbstractNotification notification : notifications) {
import org.jkiss.dbeaver.ui.screenreaders.ScreenReaderPreferences;
    }

public class DatabaseNotificationSink {
        openJob.schedule(DELAY_OPEN);
import org.eclipse.core.runtime.Status;
    /** public for testing */

     */
    private DatabaseNotificationPopup popup;
                        return Status.OK_STATUS;
                                    cancelledTokens.put(notification.getToken(), null);
 * Licensed under the Apache License, Version 2.0 (the "License");


        }

 * DBeaver - Universal Database Manager

 * Unless required by applicable law or agreed to in writing, software

        List<AbstractNotification> toDisplay = new ArrayList<>(currentlyNotifying);
    };

    /**
}

import org.eclipse.core.runtime.Platform;
        }
import org.eclipse.swt.widgets.Shell;
    private void collectNotifications() {
    public void notify(NotificationSinkEvent event) {

     * public for testing purposes
        popup.setBlockOnOpen(false);
import org.eclipse.core.runtime.IStatus;
        openJob.setSystem(runSystem);

                            }
    private static final long DELAY_OPEN = 200;
        synchronized (DatabaseNotificationSink.class) {
            return Status.OK_STATUS;

        if (!openJob.cancel()) {
                    Display display = PlatformUI.getWorkbench().getDisplay();
        final DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    }
    }
            } catch (InterruptedException e) {
            try {
                }
import org.eclipse.core.runtime.jobs.Job;
import org.jkiss.dbeaver.ModelPreferences;
                    });
            popup.setFocus();

                        // Not initialized yet?
package org.jkiss.dbeaver.ui.notifications;
        currentlyNotifying.clear();
                if (Platform.isRunning()) {
