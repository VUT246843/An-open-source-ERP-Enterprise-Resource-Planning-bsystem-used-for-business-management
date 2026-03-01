 *
     * Whether the statistics collection is enforced or can be disabled by the user
    String getApplicationRunId();
    default void beforeWorkspaceInitialization() {}

    /**
    }
    @Nullable

    Class<? extends DBPPlatform> getPlatformClass();
     */
    }
     */
     */
     * Multiple users can login into the app at the same time

/*
     * Platform is initialized in a lazy way during application startup.
     * enables the use of environment variables while the application is in use
    /**
    Path getDefaultWorkingFolder();
    boolean isMultiuser();
     * Headless mode - console interface or server-side mode
        return true;
    default boolean isCommunity() {
    @NotNull

    default boolean isStatisticsCollectionRequired() {

     * Distributed application requires remote server.

 *     http://www.apache.org/licenses/LICENSE-2.0
     * If not specified then base console UI is used.
     */
    }
    boolean isEnvironmentVariablesAccessible();
     * Other instances can be run over the same workspace but they can't lock it.
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
     * Shared sessions are usually short-term, they launched to execute some particular command and quit.
    @Nullable
     */
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.runtime.DBWorkbench;
     * @return - true if community application
    Map<String, String> getAdditionalApplicationProperties();
    boolean isExclusiveMode();
     */
    long getApplicationStartTime();

        return -1;
     */

    /**
     * Shared mode is enabled when dbeaver called thru CLI interface. It is a headless mode.
import java.nio.file.Path;
 * Licensed under the Apache License, Version 2.0 (the "License");
     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**
    /**

 * you may not use this file except in compliance with the License.
 * DB application.
 */

    boolean isHeadlessMode();
    default String defaultDistributedDriversFolderName() {

 * Copyright (C) 2010-2025 DBeaver Corp and others
     */
    @NotNull

    boolean isDetachedProcess();
    boolean isStandalone();
     * Returns last user activity time
import java.util.Map;
    @Nullable
 *
    boolean hasProductFeature(@NotNull String featureName);


        return null;
    /**
import org.jkiss.dbeaver.runtime.ui.DBPPlatformUI;
     * @return -1 by default

    }
     * Application start time
     */
     * Generated on every application launch.
     * Default project name, e.g. 'General'.
    /**
 * You may obtain a copy of the License at

     * Platform instance can be obtained thru {@link DBWorkbench#getPlatform()}.
     * Application information details.
     * The boolean flag in order identify community application
        return null;
    default long getLastUserActivityTime() {
    /**
     */
     */
     */
    }
    @Nullable
     * for example, in a script template

     * @return null if not found, otherwise returns default workspace path
    boolean isDistributed();

     */
     * Like license info or some custom produce info

    /**
/**



    /**
    default Class<? extends DBPPlatformUI> getPlatformUIClass() {

 * Application implementors may redefine core app behavior and/or settings.
    default boolean isWorkspaceSwitchingAllowed() {
     */

    String getDefaultProjectName();
    @Nullable
     */
    @NotNull
    /**
     * Whether the user is allowed to switch workspaces or the default workspace is enforced
     * Primary instance if the first instance of application which locked the workspace.
    String getProductProperty(@NotNull String propName);
 *
}
    /**
 */
 * limitations under the License.

    String getInfoDetails();
public interface DBPApplication {
    /**
 * DBeaver - Universal Database Manager
     */
     * Unique application instance identifier.

    boolean isPrimaryInstance();

    /**
        return false;
    @Nullable
 * See the License for the specific language governing permissions and
    /**
import org.jkiss.code.NotNull;
     *
     * Platform implementation class.
     * Many UI-specific functions are disabled
    /**
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.model.app;
        return false;

     * Platform UI implementation class.
    /**
