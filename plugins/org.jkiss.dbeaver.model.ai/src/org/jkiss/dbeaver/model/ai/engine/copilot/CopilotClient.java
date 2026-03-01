    @NotNull
 */
    protected static final Duration TIMEOUT = Duration.ofSeconds(30);
        @SerializedName("access_token") String accessToken
import java.time.Instant;
            .GET()
    public CopilotChatResponse chat(
    public String requestAccessToken(
        @NotNull CopilotChatRequest chatRequest,
     * Request access token
            .uri(AIHttpUtils.resolve(CHAT_REQUEST_URL))
import org.jkiss.dbeaver.model.ai.engine.AbstractHttpAIClient;
import java.time.Duration;
        CopilotChatRequest chatRequest

        }
                // https://docs.github.com/en/apps/oauth-apps/building-oauth-apps/authorizing-oauth-apps#error-codes-for-the-device-flow
        );
        HttpRequest request = HttpRequest.newBuilder()
            .header(HttpConstants.HEADER_AUTHORIZATION, "Bearer " + token)
 * See the License for the specific language governing permissions and
    ) throws DBException, InterruptedException {
/*
    }
     * Chat with Copilot
    @NotNull
        @NotNull Future<?> cancellationToken
            .POST(HttpRequest.BodyPublishers.ofString(GSON.toJson(accessTokenRequest)))
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            .uri(AIHttpUtils.resolve(CHAT_REQUEST_URL))
        HttpRequest request = HttpRequest.newBuilder()

        return GSON.fromJson(responseJson, CopilotChatResponse.class);
            .uri(AIHttpUtils.resolve(COPILOT_CHAT_MODELS_URL))

                }
        @SerializedName("interval") int interval
                            .takeWhile(it -> it.delta().content() != null)
                        listener.nextChunk(new AIEngineResponseChunk(choices));
    public CopilotSessionToken requestSessionToken(
        Duration expiresIn = Duration.ofSeconds(deviceCodeResponse.expiresIn());
        var response = client.send(monitor, request);
        return models.data().stream()
    public CopilotClient(@NotNull String authProviderBaseURL) {
    }
        .create();
    @Override
     * Loads a list of available Copilot models from the server.

import java.util.concurrent.Future;
     * Request session token
            DBEAVER_OAUTH_APP,

    private static final String DBEAVER_OAUTH_APP = "Iv1.b507a08c87ecfe98";
    public record DeviceCodeResponse(
    public DeviceCodeResponse requestDeviceCode(@NotNull DBRProgressMonitor monitor) throws DBException {


    private static final String COPILOT_SESSION_TOKEN_URL = "/copilot_internal/v2/token";
        @SerializedName("expires_in") int expiresIn,
        .setStrictness(Strictness.LENIENT)
    @NotNull
    public List<CopilotModel> loadModels(@NotNull DBRProgressMonitor monitor, @NotNull String token) throws DBException {
    }
import com.google.gson.GsonBuilder;
     * @return a list of {@code CopilotModel} objects representing the enabled models
            .header("Editor-Version", CHAT_EDITOR_VERSION)
        HttpRequest request = HttpRequest.newBuilder()
            .build();
    private static final Log log = Log.getLog(CopilotClient.class);
                if (line.startsWith(DATA_EVENT)) {
    ) throws DBException {
        HttpRequest request = HttpRequest.newBuilder()
        @SerializedName("grant_type") String grantType
        DBRProgressMonitor monitor,
 * limitations under the License.
                            .toList();
            .filter(CopilotModel::isEnabled)

    ) throws DBException {
                    }
            .timeout(TIMEOUT)
     */
    /**
                        List<String> choices = chunk.choices().stream()
            .timeout(Duration.ofSeconds(5)) // Set timeout
            .timeout(TIMEOUT)
    /**
        @SerializedName("client_id") String clientId,
    /**
            .POST(HttpRequest.BodyPublishers.ofString(GSON.toJson(chatRequest)))
        this.baseAuthURL = authProviderBaseURL;
import org.jkiss.dbeaver.Log;
        String token,
            .header(HttpConstants.HEADER_CONTENT_TYPE, HttpConstants.CONTENT_TYPE_JSON)
        if (monitor.isCanceled() || cancellationToken.isCancelled()) {
            var body = GSON.fromJson(client.send(monitor, request), AccessTokenResponse.class);
        DeviceCodeRequest deviceCodeRequest = new DeviceCodeRequest(DBEAVER_OAUTH_APP, "read:user");
            .header(HttpConstants.HEADER_AUTHORIZATION, "token " + accessToken)
 *
    private record AccessTokenRequest(
    }
import com.google.gson.annotations.SerializedName;
import org.jkiss.utils.CommonUtils;
        while (Instant.now().isBefore(start.plus(expiresIn)) && !monitor.isCanceled() && !cancellationToken.isCancelled()) {
            .header("editor-version", EDITOR_VERSION)
            .header(HttpConstants.HEADER_USER_AGENT, USER_AGENT)
    }
            .POST(HttpRequest.BodyPublishers.ofString(GSON.toJson(chatRequest)))
                case "authorization_pending" -> Thread.sleep(interval.toMillis());
 * Licensed under the Apache License, Version 2.0 (the "License");


    private static final String DONE_EVENT = "[DONE]";
     * @param monitor the progress monitor to track the request's progress and handle cancellation
        @NotNull AIEngineResponseConsumer listener

 * Unless required by applicable law or agreed to in writing, software
        client.sendAsync(
            .uri(AIHttpUtils.resolve("https://github.com/login/oauth/access_token"))
import org.jkiss.dbeaver.model.ai.engine.AIEngineResponseChunk;
            if (CommonUtils.isNotEmpty(body.accessToken())) {

    private static final String CHAT_REQUEST_URL = "https://api.githubcopilot.com/chat/completions";

            .timeout(Duration.ofSeconds(10)) // Set timeout

                    }
        } else {
            .header(HttpConstants.HEADER_CONTENT_TYPE, HttpConstants.CONTENT_TYPE_JSON)
     */
    private record AccessTokenResponse(
        @SerializedName("device_code") String deviceCode,
import com.google.gson.Gson;
        @SerializedName("client_id") String clientId,
            .GET()
    private final String baseAuthURL;
    /**
            .timeout(TIMEOUT)
    protected static final Gson GSON = new GsonBuilder()
    ) throws DBException {
            .build();
            .header(HttpConstants.HEADER_CONTENT_TYPE, HttpConstants.CONTENT_TYPE_JSON)
 *
            .build();
            .build();
    }
 *
import org.jkiss.utils.HttpConstants;
    private static final String EDITOR_PLUGIN_VERSION = "copilot.vim/1.16.0"; // TODO replace after partnership
     */


import org.jkiss.dbeaver.DBException;
    private record DeviceCodeRequest(
import org.jkiss.dbeaver.model.ai.engine.AIEngineResponseConsumer;

            .header(HttpConstants.HEADER_CONTENT_TYPE, HttpConstants.CONTENT_TYPE_JSON)
            .header("accept", HttpConstants.CONTENT_TYPE_JSON)
            .header(HttpConstants.HEADER_AUTHORIZATION, "Bearer " + token)
     */
 * DBeaver - Universal Database Manager
    ) {
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
    private static final String USER_AGENT = "GithubCopilot/1.155.0";
            }
            .uri(AIHttpUtils.resolve("https://github.com/login/device/code"))

        String accessToken
    }

            listener::completeBlock
        @NotNull DBRProgressMonitor monitor,
 * you may not use this file except in compliance with the License.
        @SerializedName("verification_uri") String verificationUri,
            .build();
            request,
        Duration interval = Duration.ofSeconds(deviceCodeResponse.interval());
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

            .POST(HttpRequest.BodyPublishers.ofString(GSON.toJson(deviceCodeRequest)))
        );
public class CopilotClient extends AbstractHttpAIClient {
            .header(HttpConstants.HEADER_CONTENT_TYPE, HttpConstants.CONTENT_TYPE_JSON)
            throw new DBException("Access token request was canceled by the user");

        }
            line -> {

                        listener.completeBlock();
        var models = GSON.fromJson(response, CopilotModelList.class);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        DBRProgressMonitor monitor,
     * Request access to the user's account
import com.google.gson.Strictness;
        @NotNull DBRProgressMonitor monitor,
            listener::error,
                    } catch (Exception e) {
        @NotNull String token,
                return body.accessToken();
            deviceCodeResponse.deviceCode(),
                case "slow_down" -> Thread.sleep(interval.plusSeconds(5).toMillis());

        .serializeNulls()
     *
            .header("Editor-Version", CHAT_EDITOR_VERSION)
            "urn:ietf:params:oauth:grant-type:device_code"
        log.debug("Copilot request failed: " + statusCode + ", " + body);
        return GSON.fromJson(client.send(monitor, request), DeviceCodeResponse.class);

        HttpRequest request = HttpRequest.newBuilder()
    ) {
                default -> throw new DBException("Error requesting access token: " + body.error());
        @NotNull DeviceCodeResponse deviceCodeResponse,
    }
import org.jkiss.dbeaver.model.ai.engine.copilot.dto.*;
     */
            },
            .uri(AIHttpUtils.resolve(baseAuthURL + COPILOT_SESSION_TOKEN_URL))
import java.util.List;
        return GSON.fromJson(client.send(monitor, request), CopilotSessionToken.class);
                    try {
            .header(HttpConstants.HEADER_AUTHORIZATION, "Bearer " + token)
     * @throws DBException if the request fails
            .toList();
                    if (data.equals(DONE_EVENT)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                        listener.error(e);
            .timeout(TIMEOUT)
        @SerializedName("user_code") String userCode,
                        listener.usage(chunk.getAIUsage());
    private static final String EDITOR_VERSION = "Neovim/0.6.1"; // TODO replace after partnership
            .header("accept", HttpConstants.CONTENT_TYPE_JSON)
 * You may obtain a copy of the License at
                    String data = line.substring(6).trim();
    protected DBException mapHttpError(int statusCode, @NotNull String body) {
                        return;
            throw new DBException("Access token request timed out");
        AccessTokenRequest accessTokenRequest = new AccessTokenRequest(
import org.jkiss.dbeaver.model.ai.utils.AIHttpUtils;
    ) {
        HttpRequest request = HttpRequest.newBuilder()
}
        return new DBException("Copilot request failed: " + AIHttpUtils.parseOpenAIStyleErrorMessage(body));
        String responseJson = client.send(monitor, request);
            }

package org.jkiss.dbeaver.model.ai.engine.copilot;
                            .map(it -> it.delta().content())
    }
import java.net.http.HttpRequest;
            .header("editor-plugin-version", EDITOR_PLUGIN_VERSION)
    public void createChatCompletionStream(
        Instant start = Instant.now();
import org.jkiss.code.NotNull;
        @SerializedName("scope") String scope
     * @param token the authorization token used to authenticate the request

            .header("Editor-Version", CHAT_EDITOR_VERSION)
                        CopilotChatChunk chunk = GSON.fromJson(data, CopilotChatChunk.class);
            .build();
        @SerializedName("error") String error,
    }
            switch (body.error()) {
    /**
    protected static final String CHAT_EDITOR_VERSION = "vscode/1.80.1"; // TODO replace after partnership
    private static final String DATA_EVENT = "data: ";

        @SerializedName("device_code") String deviceCode,
    ) {
    private static final String COPILOT_CHAT_MODELS_URL = "https://api.githubcopilot.com/models";
