    public boolean setLauncherInfo(String launcher, String name) {
        } catch (UnsatisfiedLinkError e) {
    /**
     * @noreference This method is not intended to be referenced by clients.
                }
    private String library;
            return true;
            if (!libraryLoaded) {
 * You may obtain a copy of the License at
        } catch (UnsatisfiedLinkError e) {
        try {
                loadLibrary();
    public boolean updateSplash() {
                } catch (UnsatisfiedLinkError e) {
        if (library != null) {
    private native void OleUninitialize();
 * Copyright (C) 2010-2024 DBeaver Corp and others
            return true;

    private void loadLibrary() {
/*
     * @noreference This method is not intended to be referenced by clients.
    /**
        }
    }
 *
    private native long _get_splash_handle();
 * @noinstantiate This class is not intended to be instantiated by clients.
 * Licensed under the Apache License, Version 2.0 (the "License");
            try {
            }
    }
     */
    /**
 *

    }
 * other Java code. This class exists only for the purpose of interacting with
    private boolean libraryLoaded = false;
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
        try {
            return false;

        } catch (UnsatisfiedLinkError e) {
                loadLibrary();
            return -1;
     * been loaded natively by the executable.
    private native void _show_splash(String bitmap);
                loadLibrary();
    /**
    }
    /**
                    if (idx != -1) {
     * @param library the given library
     */
     */
    /**
                }
                return updateSplash();
            _takedown_splash();
                        comLibrary += library.substring(idx + 8, library.length());
            if (!libraryLoaded) {

            }
            if (!libraryLoaded) {
            if (!libraryLoaded) {
            }
     */
        } catch (UnsatisfiedLinkError e) {
        } catch (UnsatisfiedLinkError e) {

        try {
                loadLibrary();
        try {
        }


            }
    /**
            return _get_os_recommended_folder();
    public boolean uninitialize() {
            _set_launcher_info(launcher, name);
     */
     * @noreference This method is not intended to be referenced by clients.
    private native String _get_os_recommended_folder();
                Runtime.getRuntime().load(library);
     */

            } catch (UnsatisfiedLinkError e) {
        }

            }
     * @noreference This method is not intended to be referenced by clients
    private native void _update_splash();
    public boolean setExitData(String sharedId, String data) {

package org.eclipse.equinox.launcher;
        try {
                return takeDownSplash();
 *
    public boolean isLibraryLoadedByJava() {
        } catch (UnsatisfiedLinkError e) {
        }
    }
        try {
                return showSplash(bitmap);

        }
            return true;
            _update_splash();
 * Unless required by applicable law or agreed to in writing, software
                        OleInitialize(0);

     *
    public boolean showSplash(String bitmap) {
                    return false;
    }
                if (library.contains("wpf")) { //$NON-NLS-1$
 *
            }
}
            return false;
            return _get_splash_handle();
        if (libraryLoaded && library != null) {
        }
            return false;
            if (library.contains("wpf")) { //$NON-NLS-1$
            _set_exit_data(sharedId, data);
            }
 */
            }
    }
     * @return boolean
     * @noreference This method is not intended to be referenced by clients.
 * org.eclipse.core.runtime.adaptor.EclipseStarter. This class is not API.
                loadLibrary();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**
     * @noreference This constructor is not intended to be referenced by clients.

            _show_splash(bitmap);
            if (!libraryLoaded) {
            return false;
                    }
     */
 * you may not use this file except in compliance with the License.
    //TODO: This class should not be public
                loadLibrary();
 */
                return setExitData(sharedId, data);
    public String getOSRecommendedFolder() {
            return null;
 * <b>Note:</b> This class should not be referenced programmatically by
            return false;
    }
                    OleUninitialize();
    private native void _set_exit_data(String sharedId, String data);

public class JNIBridge {
            }
                    int idx = library.indexOf("eclipse_"); //$NON-NLS-1$

        return true;
    }
                try {
 * See the License for the specific language governing permissions and
                return setLauncherInfo(launcher, name);
                return getSplashHandle();

     * @noreference This method is not intended to be referenced by clients.
    public JNIBridge(String library) {
        }

     */
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
                    // library not loaded
    }
    }
     * Whether or not we loaded the shared library here from java.
                        String comLibrary = library.substring(0, idx) + "com_"; //$NON-NLS-1$
            if (!libraryLoaded) {
                return getOSRecommendedFolder();
 * @noextend This class is not intended to be subclassed by clients.
        this.library = library;
        }
    private native int OleInitialize(int reserved);
        libraryLoaded = true;
    /**
    public boolean takeDownSplash() {
        try {

        } catch (UnsatisfiedLinkError e) {
    private native void _takedown_splash();
                loadLibrary();
    public long getSplashHandle() {
            return true;

    /**
                        Runtime.getRuntime().load(comLibrary);

            if (!libraryLoaded) {
     * False does not imply the library is not available, it could have
            return true;
     * @noreference This method is not intended to be referenced by clients.
    private native void _set_launcher_info(String launcher, String name);
        return libraryLoaded;
 * limitations under the License.
 * a native launcher. To launch Eclipse programmatically, use
                //failed
     */

