     * @param future     a completable future that is completed once the dialog is closed.
     *
import java.net.URI;
 * DBeaver - Universal Database Manager
     * <p>
     * Shows a modal dialog displaying an authorization code. Doesn't prompt anything.
import java.util.concurrent.CompletableFuture;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**
public interface UIServiceAuth {
     */

     * Otherwise, it's the responsibility of the caller to complete the {@code future}
/*
}
 * See the License for the specific language governing permissions and
 *
 * you may not use this file except in compliance with the License.
     * If the user decides to cancel the request, the {@code future} will be canceled.
 * limitations under the License.
     * @param userCode   the code the user has to enter in order to authenticate
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,

     * <p>
     * @param browserUrl the url to be opened in the browser

 *
     * <b>This is a UI-blocking call.</b>
package org.jkiss.dbeaver.runtime.ui;
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *

 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.code.NotNull;
    void showCodePopup(@NotNull URI browserUrl, @NotNull String userCode, @NotNull CompletableFuture<Void> future);
 */
     * when the request is either fulfilled or failed to close the popup.
