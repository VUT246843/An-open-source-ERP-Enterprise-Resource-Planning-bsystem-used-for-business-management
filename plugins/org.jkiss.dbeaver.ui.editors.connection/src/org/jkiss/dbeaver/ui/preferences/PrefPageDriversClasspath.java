import org.jkiss.code.NotNull;
import java.net.URLEncoder;

            });
        }

            Composite group = UIUtils.createTitledComposite(
 * Unless required by applicable law or agreed to in writing, software
                restartWorkbenchOnPrefChange();

                    libraries.add(URLEncoder.encode(library, GeneralUtils.UTF8_ENCODING));

                composite,


import java.util.Arrays;
 * DBeaver - Universal Database Manager
                            final String path = file.toString();
import org.eclipse.swt.events.SelectionAdapter;
 *
public class PrefPageDriversClasspath extends AbstractPrefPage implements IWorkbenchPreferencePage {
            UIUtils.createInfoLabel(group, UIConnectionMessages.pref_page_drivers_classpath_global_libraries_info, GridData.FILL_HORIZONTAL, 2);
                UIConnectionMessages.pref_page_drivers_classpath_system_classpath_group,
import org.jkiss.utils.StandardConstants;
                composite,
import org.jkiss.dbeaver.ui.UIIcon;
                        }
        return true;
    protected void performDefaults() {
import org.eclipse.ui.IWorkbenchPreferencePage;
import java.io.File;

                GridData.FILL_BOTH,
import org.eclipse.swt.widgets.*;
        super.performDefaults();
 * you may not use this file except in compliance with the License.

 *
    @Override
                    globalLibrariesList.select(CommonUtils.clamp(index, 0, globalLibrariesList.getItemCount() - 1));
                        removeButton.setEnabled(globalLibrariesList.getItemCount() >= 1);
            );
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                    }
        {
                NLS.bind(UIConnectionMessages.pref_page_drivers_classpath_global_libraries_restart_prompt_body, GeneralUtils.getProductName())
 *
                    }

import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
                    if (globalLibrariesList.getSelectionIndex() >= 0) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        PrefUtils.savePreferenceStore(store);
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.UIUtils;
            globalLibrariesList = new List(group, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL | SWT.H_SCROLL);
        }
    }
        systemClasspathList.removeAll();
                }



            ((GridData) globalLibrariesList.getLayoutData()).heightHint = 100;
    public boolean performOk() {
    protected Control createPreferenceContent(@NotNull Composite parent) {
                1,
                    globalLibrariesList.remove(index);
                            if (globalLibrariesList.indexOf(path) < 0) {
                    if (files != null) {
                        removeButton.setEnabled(false);
                getShell(),
                GridData.FILL_BOTH,
            globalLibrariesList.setLayoutData(new GridData(GridData.FILL_BOTH));
/*
            UIUtils.createToolItem(toolbar, UIConnectionMessages.pref_page_drivers_button_add, UIIcon.ADD, new SelectionAdapter() {
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
import org.jkiss.dbeaver.utils.PrefUtils;

                300
import org.jkiss.dbeaver.ui.ShellUtils;
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.drivers.classpath";
import org.jkiss.dbeaver.runtime.DBWorkbench;

    private List globalLibrariesList;
                    log.error(e);
                }
            });
            globalLibrariesList.addSelectionListener(new SelectionAdapter() {

                        for (File file : files) {
import org.jkiss.dbeaver.registry.driver.DriverLoaderDescriptor;
                        ShellUtils.showInSystemExplorer(globalLibrariesList.getSelection()[0]);

        if (!Arrays.equals(currentGlobalLibraries, globalLibrariesList.getItems()) && DriverLoaderDescriptor.getRootClassLoader() != null) {
                }
                @Override

    @NotNull
        }
                @Override
                    final File[] files = DialogUtils.openFileList(getShell(), UIConnectionMessages.pref_page_drivers_classpath_global_libraries_choose_files, new String[]{"*.jar"});
            }
                    globalLibrariesList.notifyListeners(SWT.Selection, new Event());
                                globalLibrariesList.add(path);
import java.io.UnsupportedEncodingException;
 * Copyright (C) 2010-2026 DBeaver Corp and others
            globalLibrariesList.add(source);
}
            ((GridData) systemClasspathList.getLayoutData()).heightHint = 100;
    @Override


            Composite group = UIUtils.createTitledComposite(
    private List systemClasspathList;
                    } else {
                public void widgetSelected(SelectionEvent e) {
            );
            globalLibrariesList.addMouseListener(new DoubleClickMouseAdapter() {
            if (restart) {
        // nothing to initialize
                UIConnectionMessages.pref_page_drivers_classpath_global_libraries_group,
        for (String source : DriverDescriptor.getGlobalLibraries()) {
                    final int index = globalLibrariesList.getSelectionIndex();
 * You may obtain a copy of the License at
                300
                public void widgetSelected(SelectionEvent e) {
                }
import org.jkiss.utils.CommonUtils;
            });
        }
                            }
        {
            store.setValue(ModelPreferences.UI_DRIVERS_GLOBAL_LIBRARIES, libraries.toString());
import org.jkiss.dbeaver.Log;

        final DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();

            for (String library : globalLibrariesList.getItems()) {
import org.eclipse.swt.SWT;
                @Override

                    if (globalLibrariesList.getSelectionIndex() >= 0) {
        for (String path : CommonUtils.splitString(System.getProperty(StandardConstants.ENV_JAVA_CLASSPATH), ';')) {
        {
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
        final String[] currentGlobalLibraries = DriverDescriptor.getGlobalLibraries();
            final ToolBar toolbar = new ToolBar(group, SWT.VERTICAL);
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.events.MouseEvent;
            final boolean restart = UIUtils.confirmAction(
import java.util.StringJoiner;
                } catch (UnsupportedEncodingException e) {
    private static final Log log = Log.getLog(PrefPageDriversClasspath.class);
            toolbar.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
    public void init(IWorkbench workbench) {

 * Licensed under the Apache License, Version 2.0 (the "License");
                public void widgetSelected(SelectionEvent e) {
 * limitations under the License.

            final ToolItem removeButton = UIUtils.createToolItem(toolbar, UIConnectionMessages.pref_page_drivers_button_remove, UIIcon.DELETE, new SelectionAdapter() {
import org.jkiss.dbeaver.ui.controls.DoubleClickMouseAdapter;


                }

        return composite;
                try {
                    }
    @Override
            final StringJoiner libraries = new StringJoiner("|");
            systemClasspathList = new List(group, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL | SWT.H_SCROLL);
        }
            );
        final Composite composite = UIUtils.createComposite(parent, 1);
            systemClasspathList.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.jkiss.dbeaver.ModelPreferences;
    }
import org.eclipse.osgi.util.NLS;
                @Override
            systemClasspathList.add(path);
            });
        globalLibrariesList.removeAll();
package org.jkiss.dbeaver.ui.preferences;
    @Override
                2,
import org.eclipse.swt.layout.GridData;
                NLS.bind(UIConnectionMessages.pref_page_drivers_classpath_global_libraries_restart_prompt_title, GeneralUtils.getProductName()),
 */
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
                public void onMouseDoubleClick(@NotNull MouseEvent e) {
import org.jkiss.dbeaver.utils.GeneralUtils;
            }
        performDefaults();
    }
import org.eclipse.ui.IWorkbench;
import org.eclipse.swt.events.SelectionEvent;

