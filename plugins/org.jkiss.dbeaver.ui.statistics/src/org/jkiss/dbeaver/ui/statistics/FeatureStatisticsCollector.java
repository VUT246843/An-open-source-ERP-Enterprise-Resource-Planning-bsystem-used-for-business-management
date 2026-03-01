
        String toPlainText() {
import java.io.IOException;
            @Override

    public static final String ACTIVITY_LOGS_DIR = ".activity-logs";
 * You may obtain a copy of the License at
        }
        if (trackStream == null) {
                log.debug(e);
        return trackStream;
    void startMonitor() {
 *
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.nio.file.Path;
    private void flushStatistics() {
    public void trackFeature(DBRFeature feature, Map<String, Object> parameters) {
        if (trackStream != null) {
            messagesCopy = messages.toArray(new TrackingMessage[0]);
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
        }
            sendCollectedStatistics(true);
            {
        long timestamp;
    @Override

    private void sendCollectedStatistics(boolean detached) {

        DBRFeature feature;
    static Path getActivityLogsFolder() throws IOException {
            return key.toString()
package org.jkiss.dbeaver.ui.statistics;
        if (!UIStatisticsActivator.isTrackingEnabled()) {
            }
        Path logsDir = GeneralUtils.getMetadataFolder().resolve(ACTIVITY_LOGS_DIR);
        TrackingMessage[] messagesCopy;
    }
    }
 *
        synchronized (messages) {
        if (!Files.exists(logsDir)) {
            Path logFile = logsDir

        }
        }

            messages.add(new TrackingMessage(feature, parameters));
}
            BufferedWriter out = getTrackStream();
                return Status.OK_STATUS;
        private String normalizeString(Object key) {
 * DBeaver feature tracker

                    schedule(TRACK_PERIOD);
public class FeatureStatisticsCollector implements DBRFeatureTracker {


            Files.createDirectories(logsDir);
        };
import org.jkiss.code.NotNull;
                .replace("\r", "\\r")
            this.feature = feature;
 */
        }
    @Override
                return "";
            if (key == null) {
        String workspaceId = BaseWorkspaceImpl.readWorkspaceIdProperty() + "-" + BaseWorkspaceImpl.getLocalHostId();
            trackMonitor.cancel();
import java.util.ArrayList;
        return logsDir;

            StringBuilder text = new StringBuilder();
import org.jkiss.dbeaver.model.runtime.features.DBRFeature;
import java.nio.charset.StandardCharsets;
        try {
            startMonitor();
import java.util.List;
                out.write("\n");
            Path logsDir = getActivityLogsFolder();
            return;
            log.debug("Statistics flush error", e);
            }
                .resolve((System.currentTimeMillis() / 1000) + "_" + DBWorkbench.getPlatform().getApplication().getApplicationRunId() + ".log");
            return;

    FeatureStatisticsCollector() {


 *     http://www.apache.org/licenses/LICENSE-2.0

                .replace("&", "\\&")
                    text.append(normalizeString(entry.getKey())).append("=").append(normalizeString(entry.getValue()));
 * See the License for the specific language governing permissions and
                flushStatistics();
                trackStream.close();
        } catch (IOException e) {

import org.jkiss.dbeaver.model.impl.app.BaseWorkspaceImpl;
    }
import java.nio.file.Files;
                }

            return text.toString();
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
            out.flush();

            }
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                setUser(false);
    }
 * DBeaver - Universal Database Manager
                    first = false;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
                for (Map.Entry<?, ?> entry : parameters.entrySet()) {
            }
    private static class TrackingMessage {
import java.util.Map;
            trackMonitor = null;
        public TrackingMessage(DBRFeature feature, Map<String, Object> parameters) {
import org.jkiss.dbeaver.Log;
            trackStream = Files.newBufferedWriter(logFile, StandardCharsets.UTF_8);

                text.append(":");
        if (!UIStatisticsActivator.isTrackingEnabled()) {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
import org.eclipse.core.runtime.IStatus;
            if (messages.isEmpty()) {
            trackStream = null;
                }


            try {
                .replace("\n", "\\n")

    private BufferedWriter trackStream;
        trackMonitor = new AbstractJob("Features") {
    private final List<TrackingMessage> messages = new ArrayList<>();
        }
    }
                        text.append("&");
        stopMonitor();
            text.append(appStartTime).append(":").append(feature.getId());
    private static final boolean SEND_STATS_ON_SHUTDOWN = true;
        new StatisticsTransmitter(workspaceId).send(detached);
import org.jkiss.dbeaver.runtime.DBWorkbench;
            sendCollectedStatistics(false);
            long appStartTime = timestamp - DBWorkbench.getPlatform().getApplication().getApplicationStartTime();
                boolean first = true;
        if (trackMonitor != null) {
import java.io.BufferedWriter;
    void stopMonitor() {

        flushStatistics();
                return;
        }
 * limitations under the License.
/*
        }
        if (trackMonitor != null) {
/**
    }
 * you may not use this file except in compliance with the License.
        }
import org.eclipse.core.runtime.Status;
                if (!isCanceled()) {

    public void dispose() {
                    if (!first) {
        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
            messages.clear();
    }
            trackMonitor.cancel();
        synchronized (messages) {
    @NotNull
            for (TrackingMessage message : messagesCopy) {
            @NotNull

        if (SEND_STATS_ON_SHUTDOWN && UIStatisticsActivator.isTrackingEnabled()) {
                    }
            this.parameters = parameters;
                out.write(message.toPlainText());
import org.jkiss.dbeaver.model.runtime.features.DBRFeatureTracker;

        }
            } catch (IOException e) {
    }
 *
            }
        if (UIStatisticsActivator.isTrackingEnabled()) {
 */
                setSystem(true);
            if (parameters != null && !parameters.isEmpty()) {
    }
            this.timestamp = System.currentTimeMillis();

        trackMonitor.schedule(TRACK_PERIOD);
    private AbstractJob trackMonitor;
    @Override

 * Unless required by applicable law or agreed to in writing, software
        }
                .replace("=", "\\=");

        Map<String, Object> parameters;
    private static final Log log = Log.getLog(FeatureStatisticsCollector.class);
    }
import org.jkiss.dbeaver.utils.GeneralUtils;
    public void startTracking() {
            }
    private BufferedWriter getTrackStream() throws IOException {
    private static final long TRACK_PERIOD = 5000;

