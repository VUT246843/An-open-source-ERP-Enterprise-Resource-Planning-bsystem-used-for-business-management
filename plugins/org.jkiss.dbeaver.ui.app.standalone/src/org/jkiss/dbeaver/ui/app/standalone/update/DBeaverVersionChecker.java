 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.app.standalone.DBeaverApplication;
import org.jkiss.dbeaver.ui.app.standalone.internal.CoreApplicationActivator;
        }
import org.eclipse.core.runtime.Platform;
    private static final Log log = Log.getLog(DBeaverVersionChecker.class);

        final Version currentVersion = getProductVersion();
/**
        OVERRIDE_PRODUCT_VERSION = version;
            showUpdateDialog = DBWorkbench.getPlatform().getPreferenceStore().getBoolean(DBeaverPreferences.UI_AUTO_UPDATE_CHECK);
            DBeaverApplication.getInstance().notifyVersionUpgrade(currentVersion, newVersion, !showAlways);
                if (lastVersionCheckTime > 0) {
        return OVERRIDE_PRODUCT_VERSION == null ? GeneralUtils.getProductVersion() : OVERRIDE_PRODUCT_VERSION;
        if (product == null) {

import org.jkiss.dbeaver.core.CoreMessages;
                    if (curMonth == checkMonth && curDay == checkDay) {
import org.osgi.framework.Version;
public class DBeaverVersionChecker extends AbstractJob {
            // Check for auto-update settings

        }
 *
 * Version checker job
        SKIP_VERSION_CHECK = CommonUtils.toBoolean(System.getProperty("dbeaver.debug.skip-version-check"));
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
    {
            }
import org.jkiss.utils.CommonUtils;
import java.util.Calendar;
        Version version = null;
}
import org.eclipse.core.runtime.Status;
import org.jkiss.code.NotNull;
        DBWorkbench.getPlatform().getPreferenceStore().setValue(DBeaverPreferences.UI_UPDATE_CHECK_TIME, System.currentTimeMillis());
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
                    cal.setTimeInMillis(System.currentTimeMillis());
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private static boolean isSuppressed(@NotNull VersionDescriptor version) {
            log.error("No Eclipse product found. Installation is corrupted");
    {
 *
    static {
    private static Version getProductVersion() {
        if (CommonUtils.isNotEmpty(versionProperty)) {
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

        }
 * limitations under the License.


                long lastVersionCheckTime = DBWorkbench.getPlatform().getPreferenceStore().getLong(DBeaverPreferences.UI_UPDATE_CHECK_TIME);
        super("DBeaver new version release checker");
        try {

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.utils.GeneralUtils;
        if (showAlways || (!isSuppressed(newVersion) && (SKIP_VERSION_CHECK || newVersion.getProgramVersion().compareTo(currentVersion) > 0))) {
    @NotNull

                        return Status.OK_STATUS;
    }


package org.jkiss.dbeaver.ui.app.standalone.update;
    private void showUpdaterDialog(@NotNull Version currentVersion, @NotNull VersionDescriptor newVersion)
 */
        if (!showAlways && !showUpdateDialog) {
import org.jkiss.dbeaver.DBeaverPreferences;

        String versionProperty = CommonUtils.toString(System.getProperty("dbeaver.debug.override-product-version"));
        }

            }
        boolean showUpdateDialog = showAlways;
import java.io.IOException;
            // No product!
                    int checkMonth = cal.get(Calendar.MONTH);
        if (monitor.isCanceled() || DBWorkbench.getPlatform().isShuttingDown()) {
                // Show error dialog only if fired by user
    {
                    int curDay = cal.get(Calendar.DAY_OF_MONTH);
    }
                    Calendar cal = Calendar.getInstance();
    }
        return activator != null && activator.getPreferenceStore().getBoolean("suppressUpdateCheck." + version.getPlainVersion());
            if (showAlways) {
                log.debug("Cannot parse override version '" + versionProperty + "'", e);

        IProduct product = Platform.getProduct();
import org.eclipse.core.runtime.IProduct;
        this.showAlways = force;

import org.jkiss.dbeaver.ui.UIUtils;

    private static final boolean SKIP_VERSION_CHECK;
                    int curMonth = cal.get(Calendar.MONTH);
            showUpdaterDialog(currentVersion, newVersion);
        if (updateURL == null) {
                    }
            } catch (Exception e) {
            return Status.OK_STATUS;
            if (showUpdateDialog) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
                    // Do not check more often than daily
        }
        }
    @NotNull
        final VersionDescriptor newVersion;
import org.jkiss.dbeaver.registry.updater.VersionDescriptor;

            return Status.CANCEL_STATUS;
            return Status.OK_STATUS;
        CoreApplicationActivator activator = CoreApplicationActivator.getDefault();

        } catch (IOException e) {
    protected IStatus run(@NotNull DBRProgressMonitor monitor)
    }
            return Status.OK_STATUS;
    private static final Version OVERRIDE_PRODUCT_VERSION;


    public DBeaverVersionChecker(boolean force)
 * Licensed under the Apache License, Version 2.0 (the "License");
        });
        setUser(false);
        return Status.OK_STATUS;
        if (!showUpdateDialog) {
    private final boolean showAlways;

import org.jkiss.dbeaver.Log;
        setSystem(true);
                version = new Version(versionProperty);
 */
    }
                        // Already checked today
        }
                    int checkDay = cal.get(Calendar.DAY_OF_MONTH);
            try {
                    cal.setTimeInMillis(lastVersionCheckTime);
import org.jkiss.dbeaver.model.runtime.AbstractJob;
                }
import org.eclipse.core.runtime.IStatus;
            newVersion = new VersionDescriptor(DBWorkbench.getPlatform(), updateURL);
    }
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
            return Status.CANCEL_STATUS;
        UIUtils.asyncExec(() -> {
                DBWorkbench.getPlatformUI().showError(CoreMessages.dialog_version_update_title, CoreMessages.dialog_version_update_error_cannot_check_version, e);
        final String updateURL = product.getProperty("versionUpdateURL");
/*
