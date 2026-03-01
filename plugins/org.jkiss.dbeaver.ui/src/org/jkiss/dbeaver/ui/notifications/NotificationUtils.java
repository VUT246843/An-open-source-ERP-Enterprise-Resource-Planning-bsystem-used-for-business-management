    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
    private static final String NOTIFICATIONS_KEY_SOUND_FILE = ".soundFile"; //$NON-NLS-1$
            @NotNull
    private static void sendNotification(@NotNull String id, @NotNull Supplier<AbstractNotification> notificationSupplier) {
    }
        final AbstractJob job = new AbstractJob("Play notification sound") {
    private static boolean isPopupEnabled(@NotNull String id) {
import java.io.File;
 */
        return settings;
 *
        }
    }
} * You may obtain a copy of the License at
        sendNotification(id, () -> new DatabaseNotification(dataSource, id, text, messageType, feedback));
import org.jkiss.dbeaver.Log;
 * distributed under the License is distributed on an "AS IS" BASIS,

/*
        job.setSystem(true);
import org.jkiss.dbeaver.model.DBPMessageType;

    private static boolean isSoundEnabled(@NotNull String id) {
package org.jkiss.dbeaver.ui.notifications;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
            }
        final String enablePopupKey = NOTIFICATIONS_SETTINGS_PREFIX + id + NOTIFICATIONS_KEY_ENABLE_POPUP;
import org.jkiss.utils.CommonUtils;
            @Override

        };
    }

        final String enableSoundKey = NOTIFICATIONS_SETTINGS_PREFIX + id + NOTIFICATIONS_KEY_ENABLE_SOUND;

 * you may not use this file except in compliance with the License.
    @Nullable
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBPDataSource;
import java.util.Collections;
            public void done(IJobChangeEvent event) {
        return DBWorkbench.getPlatform().getPreferenceStore().getBoolean(ModelPreferences.NOTIFICATIONS_ENABLED)
            }
    private static final Log log = Log.getLog(NotificationUtils.class);
    }
import org.eclipse.core.runtime.jobs.JobChangeAdapter;

import org.jkiss.code.Nullable;
            } catch (Exception e) {
        } else if (settings.getSoundFile() == null) {
            return null;
    }

        final DBPPreferenceStore preferences = DBWorkbench.getPlatform().getPreferenceStore();
    private static void scheduleNotificationSound(@NotNull NotificationSoundProvider provider) {
    @NotNull

    private static final String NOTIFICATIONS_KEY_ENABLE_SOUND = ".enableSound"; //$NON-NLS-1$
        }

    private static final String NOTIFICATIONS_SETTINGS_PREFIX = "notifications.settings."; //$NON-NLS-1$
 * Licensed under the Apache License, Version 2.0 (the "License");
        preferences.setValue(enableSoundKey, settings.isPlaySound());
        final String soundFileKey = NOTIFICATIONS_SETTINGS_PREFIX + id + NOTIFICATIONS_KEY_SOUND_FILE;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * limitations under the License.
    }
                    .getFloat(ModelPreferences.NOTIFICATIONS_SOUND_VOLUME) / 100.0f);
                sound.play(DBWorkbench.getPlatform()
 *
        preferences.setDefault(enableSoundKey, notification.isSoundEnabled());
        final DBPPreferenceStore preferences = DBWorkbench.getPlatform().getPreferenceStore();
            }

        sendNotification(id, () -> new GeneralNotification(id, title, text, messageType, feedback));
import org.jkiss.dbeaver.ui.registry.NotificationRegistry;
        if (isPopupEnabled(id)) {
            throw new IllegalArgumentException("Can't find notification '" + id + "'");


import org.jkiss.dbeaver.ModelPreferences;
        if (isSoundEnabled(id) && DBWorkbench.getPlatform()
        job.setUser(false);
        job.addJobChangeListener(new JobChangeAdapter() {
import org.eclipse.core.runtime.jobs.IJobChangeEvent;



        try {
import java.util.function.Supplier;
                return Status.OK_STATUS;
    public static void setNotificationSettings(@NotNull String id, @NotNull NotificationSettings settings) {
        settings.setSoundFile(CommonUtils.isEmpty(preferences.getString(soundFileKey)) ? null : new File(preferences.getString(soundFileKey)));
        final NotificationDescriptor notification = NotificationRegistry.getInstance().getNotification(id);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        preferences.setValue(soundFileKey, settings.getSoundFile() == null ? "" : settings.getSoundFile().toString());
                log.debug("Error sending notification", e);

                sound.close();
    public static void sendNotification(String id, String title, String text, DBPMessageType messageType, Runnable feedback) {
                    .getPreferenceStore()
            return BeepSoundProvider.INSTANCE;
    }
        if (!settings.isPlaySound()) {
    }
            && getNotificationSettings(id).isPlaySound();
        }
            @Override
import org.jkiss.dbeaver.model.runtime.AbstractJob;
    private static final DatabaseNotificationSink NOTIFICATION_SINK = new DatabaseNotificationSink();
        job.schedule();
 *
        final NotificationSettings settings = NotificationUtils.getNotificationSettings(id);
            throw new IllegalArgumentException("Can't find notification '" + id + "'");

        });

        final String enableSoundKey = NOTIFICATIONS_SETTINGS_PREFIX + id + NOTIFICATIONS_KEY_ENABLE_SOUND;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        } catch (DBException e) {
        return DBWorkbench.getPlatform().getPreferenceStore().getBoolean(ModelPreferences.NOTIFICATIONS_ENABLED)
            return;
    private static NotificationSoundProvider getNotificationSoundProvider(@NotNull String id) {
            final NotificationSoundProvider soundProvider = getNotificationSoundProvider(id);
            && getNotificationSettings(id).isShowPopup();
        preferences.setDefault(enablePopupKey, true);
            if (soundProvider != null) {
            log.debug("Unable to play notification sound", e);
import org.eclipse.core.runtime.Status;

        final NotificationSettings settings = new NotificationSettings();
        final String enablePopupKey = NOTIFICATIONS_SETTINGS_PREFIX + id + NOTIFICATIONS_KEY_ENABLE_POPUP;

            try {
        settings.setShowPopup(preferences.getBoolean(enablePopupKey));
        final NotificationDescriptor notification = NotificationRegistry.getInstance().getNotification(id);
import org.jkiss.dbeaver.ui.notifications.sounds.BeepSoundProvider;
        final NotificationSound sound;
 * DBeaver - Universal Database Manager
        settings.setPlaySound(preferences.getBoolean(enableSoundKey));
        if (notification == null) {
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {


    public static void sendNotification(DBPDataSource dataSource, String id, String text, DBPMessageType messageType, Runnable feedback) {
            .getPreferenceStore()

import org.jkiss.dbeaver.ui.notifications.sounds.FileSoundProvider;
        preferences.setValue(enablePopupKey, settings.isShowPopup());
            return new FileSoundProvider(settings.getSoundFile());
public abstract class NotificationUtils {

            }
        }

            .getBoolean(ModelPreferences.NOTIFICATIONS_SOUND_ENABLED)) {


        }
        final String soundFileKey = NOTIFICATIONS_SETTINGS_PREFIX + id + NOTIFICATIONS_KEY_SOUND_FILE;
                scheduleNotificationSound(soundProvider);
        } else {
                NOTIFICATION_SINK.notify(new NotificationSinkEvent(Collections.singletonList(notificationSupplier.get())));
            sound = provider.create();
    private static final String NOTIFICATIONS_KEY_ENABLE_POPUP = ".enablePopup"; //$NON-NLS-1$
    public static NotificationSettings getNotificationSettings(@NotNull String id) {
        }
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.registry.NotificationDescriptor;
import org.eclipse.core.runtime.IStatus;

import org.jkiss.dbeaver.DBException;
        preferences.setDefault(enablePopupKey, true);
        if (notification == null) {
        preferences.setDefault(enableSoundKey, notification.isSoundEnabled());
