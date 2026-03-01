        String urlString,
            return downloadRemoteFile(monitor, taskName, externalURL, outputStream, authInfo);
                if (connection instanceof HttpURLConnection httpConnection) {
    ) throws IOException {
                log.warn("Invalid proxy port: " + proxyPort);
        return connection;
import java.nio.file.Path;
                        long totalDownloadTime = (long) (elapsedTime * contentLength / (double) totalRead);
        }
                    throw new InterruptedException();
import org.jkiss.dbeaver.utils.GeneralUtils;
                connection.setRequestProperty(HttpConstants.HEADER_AUTHORIZATION, "Basic " + encoded);
                            String.format("%.2f%%", totalRead / (double) contentLength * 100),
                        long remainingDownloadTime = totalDownloadTime - elapsedTime;
import org.jkiss.dbeaver.utils.RuntimeUtils;
        // The value of getContentLength() may be -1 and this should not be handled, see IProgressMonitor#UNKNOWN
    }
 */
import org.jkiss.dbeaver.model.messages.ModelMessages;
            for (Map.Entry<String, String> me : headers.entrySet()) {
    }
            String message = String.format("Too many redirects (%d times to %s)", retryNumber, urlString);
                    if (contentLength >= 0) {
        final URLConnection connection = (proxy == null ? url.openConnection() : url.openConnection(proxy));
    ) throws IOException, InterruptedException {
        monitor.beginTask(taskName + " - " + externalURL, contentLength);
                    final int responseCode = httpConnection.getResponseCode();
        } else {
        }

 * WebUtils
            final long startTime = System.currentTimeMillis();
import java.net.*;
     * Opens URL connection
                    if (responseCode != 200) {
     */

                }
            httpConnection.setInstanceFollowRedirects(true);
                String encoded = Base64.getEncoder().encodeToString(
        connection.setConnectTimeout(timeout);
                        if (responseCode == HttpURLConnection.HTTP_MOVED_TEMP || responseCode == HttpURLConnection.HTTP_MOVED_PERM || responseCode == HttpURLConnection.HTTP_SEE_OTHER) {
        final NumberFormat numberFormat = new ByteNumberFormat(ByteNumberFormat.BinaryPrefix.ISO);
import org.jkiss.dbeaver.model.connection.DBPAuthInfo;
            HttpURLConnection.setFollowRedirects(true);
 * See the License for the specific language governing permissions and
        String externalURL,
        }
                GeneralUtils.getProductTitle());
        try (final OutputStream outputStream = Files.newOutputStream(localFile)) {
import java.util.Map;
            monitor.done();
                            remainingDownloadTime > 0 ? RuntimeUtils.formatExecutionTime(remainingDownloadTime) : "-"
    }
        if (connection instanceof HttpURLConnection httpConnection) {
        DBPAuthInfo authInfo,
        }
        if ("POST".equals(method)) {
    ) throws IOException {
                IOException ioException = new IOException(message, e);
            log.debug("Retry number " + retryNumber);
        if (retryNumber > MAX_RETRY_COUNT) {
    }
        return openConnection(urlString, null, referrer);
                }
 */
                        long elapsedTime = currentTime - startTime;
package org.jkiss.dbeaver.runtime;
    }
    public static URLConnection openConnection(DBRProgressMonitor monitor, String urlString, DBPAuthInfo authInfo, String referrer) throws IOException {
                    }
                monitorWithExceptionContext.addException(ioException);
                        }));
                log.debug(message, e);
     * @param authInfo    authenticate info.
        OutputStream outputStream,
            proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
        Map<String, String> headers
 * DBeaver - Universal Database Manager
    private static final Log log = Log.getLog(WebUtils.class);
        String taskName,
                // Set auth info
        }

 *
                totalRead += count;
import java.text.NumberFormat;
                if (count <= 0) {
        try (final InputStream inputStream = connection.getInputStream()) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
import org.jkiss.utils.ByteNumberFormat;
        Proxy proxy = null;
import java.io.IOException;
        int timeout,
                if (monitor instanceof ProgressMonitorWithExceptionContext monitorWithExceptionContext) {
                if (monitor.isCanceled()) {
                String message = String.format("Exception during a connection to %s", connection.getURL().toString());
                            numberFormat.format(contentLength),
 * limitations under the License.
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
            } catch (Exception e) {
    @NotNull
                outputStream.write(buffer, 0, count);
        @NotNull DBRProgressMonitor monitor,
        }
import org.jkiss.dbeaver.ModelPreferences;
                }
                    } else {
        DBPAuthInfo authInfo
        String method,
            long totalRead = 0;
    public static URLConnection openURLConnection(
                }
        Path localFile,
import org.jkiss.utils.HttpConstants;
    public static long downloadRemoteFile(
        int retryNumber,
            if (referrer != null) {
            try {
 * You may obtain a copy of the License at
                    }
import java.util.Base64;
            long updateTime = 0;
            if (authInfo != null && !CommonUtils.isEmpty(authInfo.getUserName())) {

            if (proxyPort <= 0) {
        String referrer,
    public static URLConnection openURLConnection(
        DBPAuthInfo authInfo,
        if (headers != null) {
    public static URLConnection openConnection(String urlString, String referrer) throws IOException {
import org.jkiss.dbeaver.Log;
                    monitorWithExceptionContext.addException(ioException);
    /**
    private static final int MAX_RETRY_COUNT = 10;
                }
                        }

            }
        log.debug("Open [" + urlString + "]");
                            return openURLConnection(newUrl, authInfo, referrer, retryNumber + 1);
            int proxyPort = prefs.getInt(ModelPreferences.UI_PROXY_PORT);
     * @return  URL connection
import org.jkiss.code.NotNull;
        DBPPreferenceStore prefs = DBWorkbench.getPlatform().getPreferenceStore();
        final int contentLength = connection.getContentLength();
            }
 * you may not use this file except in compliance with the License.
                throw ioException;

     * @param urlString   URL
                        updateTime = currentTime;
                            String newUrl = connection.getHeaderField("Location");


        } finally {
        URL url = new URL(urlString);
                final int count = inputStream.read(buffer);
        Map<String, String> headers
                HttpConstants.HEADER_USER_AGENT,  //$NON-NLS-1$
        String referrer,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        final URLConnection connection = openConnection(externalURL, authInfo, null);
 * distributed under the License is distributed on an "AS IS" BASIS,
        int retryNumber,
public class WebUtils {

/*
        } else if (retryNumber > 1) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Unless required by applicable law or agreed to in writing, software
    return openURLConnection(null, urlString, authInfo, referrer, method, retryNumber, timeout, headers);

    }
        final byte[] buffer = new byte[8192 * 4];
import org.jkiss.dbeaver.model.runtime.ProgressMonitorWithExceptionContext;
                    (authInfo.getUserName() + ":" + CommonUtils.notEmpty(authInfo.getUserPassword())).getBytes(GeneralUtils.UTF8_CHARSET));
 *     http://www.apache.org/licenses/LICENSE-2.0
        String taskName,
    @NotNull
                long currentTime = System.currentTimeMillis();
                    HttpConstants.HEADER_X_REFERRER,  //$NON-NLS-1$
        return openURLConnection(urlString, authInfo, referrer, "GET", retryNumber, 10000, null);
        String externalURL,
    public static URLConnection openConnection(String urlString, DBPAuthInfo authInfo, String referrer) throws IOException {
     * @param retryNumber retry number
import java.io.InputStream;
                connection.connect();

 * Licensed under the Apache License, Version 2.0 (the "License");
            IOException ioException = new IOException(message);
        @NotNull DBRProgressMonitor monitor,

        }
                    return totalRead;
        return openURLConnection(urlString, authInfo, referrer, 1);
                if (currentTime - updateTime > 1000) {
    }
        if (!CommonUtils.isEmpty(proxyHost)) {
                        monitor.subTask(NLS.bind(ModelMessages.dialog_web_download_text_unknown, numberFormat.format(totalRead)));

    @NotNull
        String proxyHost = prefs.getString(ModelPreferences.UI_PROXY_HOST);

            }
                        throw new IOException("Can't open '" + connection.getURL() + "': " + httpConnection.getResponseMessage());
    @NotNull
            }
                connection.setRequestProperty(me.getKey(), me.getValue());
            connection.setRequestProperty(
            }
        String method,
    public static long downloadRemoteFile(
import org.eclipse.osgi.util.NLS;
    }
    ) throws IOException, InterruptedException {
/**

                            numberFormat.format(totalRead),
        @Nullable DBRProgressMonitor monitor,
                        monitor.subTask(NLS.bind(ModelMessages.dialog_web_download_text_known, new Object[]{
        monitor.subTask("Download file '" + externalURL + "'");
            httpConnection.setRequestMethod(method); //$NON-NLS-1$
                connection.setRequestProperty(
            }
            }
import org.jkiss.code.Nullable;
            if (monitor instanceof ProgressMonitorWithExceptionContext monitorWithExceptionContext) {
     * @param referrer    Referrer (who opens the URL?)
        return openURLConnection(monitor, urlString, authInfo, referrer, "GET", 1, 10000, null);
import java.io.OutputStream;
            throw ioException;
                        referrer);
import org.jkiss.utils.CommonUtils;
            while (true) {
        DBPAuthInfo authInfo
            connection.setDoOutput(true);
        int timeout,
 *
        connection.setReadTimeout(timeout);
import java.nio.file.Files;
        String urlString,
}
    private static URLConnection openURLConnection(String urlString, DBPAuthInfo authInfo, String referrer, int retryNumber) throws IOException {
                monitor.worked(count);
