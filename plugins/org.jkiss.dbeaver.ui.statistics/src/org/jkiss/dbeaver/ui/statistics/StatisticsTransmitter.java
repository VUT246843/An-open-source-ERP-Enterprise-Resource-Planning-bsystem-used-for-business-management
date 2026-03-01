
        try {
            log.debug("Statistics file is read-only, skipping transmission: " + logFile);
    private static final String URL_TEMPLATE = "https://%s/send-statistics";
 * Unless required by applicable law or agreed to in writing, software

                List<Path> logFiles = list
                    .getAdditionalApplicationProperties());
import org.jkiss.code.NotNull;
                }
            ((HttpURLConnection) urlConnection).setFixedLengthStreamingMode(Files.size(logFile));
            }
                        if (sessionId.equals(appSessionId)) {
                            break;
 *
            }


        }
            ((HttpURLConnection) urlConnection).disconnect();
import java.nio.charset.StandardCharsets;
            parametersMap.put("OS", CommonUtils.notEmpty(System.getProperty(StandardConstants.ENV_OS_NAME)));
            try {
                }
                endpoint + "?session=" + sessionId + "&time=" + timestamp,
                    String fileName = logFile.getFileName().toString();
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.utils.HttpConstants;
            parametersMap.put("Application-Name", GeneralUtils.getProductName());
            } catch (IOException ex) {
                parametersMap
                    sendStatistics(monitor, false);
 * DBeaver - Universal Database Manager

            if (DBWorkbench.isPlatformStarted()) {
                    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        if (Files.exists(logFile) && !Files.isWritable(logFile)) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
                5000,
import org.jkiss.dbeaver.model.runtime.LoggingProgressMonitor;
            parametersMap.put("Timezone", TimeZone.getDefault().getID());
            try (OutputStream outputStream = urlConnection.getOutputStream()) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            Path activityLogsFolder = FeatureStatisticsCollector.getActivityLogsFolder();
                if (inputStream != null) {

                "POST",
        } finally {
import org.jkiss.utils.StandardConstants;
import java.nio.file.Path;
                    setSystem(true);
import java.util.stream.Stream;


    }
                        if (sessionId.equals(appSessionId)) {
                log.debug("Error deleting file with usage statistics '" + logFile.toAbsolutePath() + "'.", ex);
                    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.runtime.WebUtils;
                null,
import java.net.URLConnection;
    }
            parametersMap.put("Locale", Locale.getDefault().toString());
                    if (sendActiveSession) {
    private void sendStatistics(DBRProgressMonitor monitor, boolean sendActiveSession) {
            log.debug("Error sending statistics file '" + logFile.toAbsolutePath() + "'.", e);
import java.io.IOException;
import org.eclipse.core.runtime.IStatus;
            new AbstractJob("Usage statistics transmitter") {
        endpoint = URL_TEMPLATE.formatted(STATS_HOSTS);
            } catch (IOException e) {
            log.debug("Schedule collected statistics send");



            String appSessionId = DBWorkbench.getPlatform().getApplication().getApplicationRunId();
    public void send(boolean detached) {
                0,
        } catch (Exception e) {
 */
                for (Path logFile : logFiles) {
                }
                protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        }
import org.jkiss.dbeaver.utils.GeneralUtils;
    public static final String STATS_HOSTS = /*<STATS-PROD-URL*/"stats.dbeaver.com"/*/>*/;
    private static final Log log = Log.getLog(StatisticsTransmitter.class);
            parametersMap.put("Application-Version", GeneralUtils.getProductVersion().toString());
public class StatisticsTransmitter {
 * limitations under the License.
            }
            return;
            }
                    String sessionId = parts[1];
                        }
            try (InputStream inputStream = urlConnection.getInputStream()) {
                Files.copy(logFile, outputStream);
 *
            parametersMap.put(HttpConstants.HEADER_CONTENT_TYPE, HttpConstants.CONTENT_TYPE_TEXT_PLAIN);
 * You may obtain a copy of the License at
import java.io.InputStream;
        if (detached) {
            URLConnection urlConnection = WebUtils.openURLConnection(

                {
                            sendLogFile(logFile, timestamp, sessionId);
                @NotNull
        }
 * See the License for the specific language governing permissions and
    private final String workspaceId;
            parametersMap.put("Country", Locale.getDefault().getISO3Country());
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        } else {
import java.nio.file.Files;
                return;
            try (Stream<Path> list = Files.list(activityLogsFolder)) {
                        continue;
                }
import java.io.ByteArrayOutputStream;
                    IOUtils.copyStream(inputStream, buffer);
                workspaceId,
 *
        this.workspaceId = workspaceId;
    }
                            continue;
                @Override
                    if (parts.length != 2) {
        //log.debug("Sending statistics file '" + logFile.toAbsolutePath() + "'");
        try {
            }
                log.debug("Error reading statistics server response");
/*
import java.util.*;
}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    return Status.OK_STATUS;
            }
                    }
            if (Files.exists(activityLogsFolder) && !Files.isWritable(activityLogsFolder)) {
import java.net.HttpURLConnection;
                parametersMap.putAll(DBWorkbench.getPlatform().getApplication()
                    String timestamp = parts[0];
            log.error("Error sending statistics", e);
            Map<String, String> parametersMap = new HashMap<>();
import org.jkiss.dbeaver.Log;

        } catch (Exception e) {
            }.schedule(3000);
                    } else {
    private final String endpoint;
                        sendLogFile(logFile, timestamp, sessionId);
        }
import org.jkiss.utils.CommonUtils;
                );
package org.jkiss.dbeaver.ui.statistics;
import org.eclipse.core.runtime.Status;
            log.debug("Send collected statistics");
import org.jkiss.utils.IOUtils;
                        }
                    String[] parts = fileName.split("_");
import java.io.OutputStream;
                    .toList();
 * you may not use this file except in compliance with the License.
                    fileName = fileName.substring(0, fileName.length() - 4);
                Files.delete(logFile);
                            // This is active session
    private void sendLogFile(Path logFile, String timestamp, String sessionId) {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    .filter(path -> path.getFileName().toString().endsWith(".log"))
    public StatisticsTransmitter(String workspaceId) {
                    log.debug("Statistics sent (" + buffer.toString(StandardCharsets.UTF_8) + ")");
                log.debug("Read-only metadata folder - can't send statistics");

            sendStatistics(new LoggingProgressMonitor(log), true);

