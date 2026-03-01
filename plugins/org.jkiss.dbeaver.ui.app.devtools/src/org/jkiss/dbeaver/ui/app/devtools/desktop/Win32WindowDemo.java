        return onDeviceChangeArrivalOrRemoveComplete(lParam, "Arrival");
                break;
        }
        /* this filters for all usb device classes */
                    driveLetterIndex++;
        String windowClass = new String("WindowsStateMonitor");
        WNDCLASSEX wClass = new WNDCLASSEX();
    /**
                }
            }
            case Wtsapi32.WTS_SESSION_UNLOCK: {
     * .win32.WinDef.HWND, int, com.sun.jna.platform.win32.WinDef.WPARAM,
                DEV_BROADCAST_DEVICEINTERFACE bdif = new DEV_BROADCAST_DEVICEINTERFACE(bhdr.getPointer());
                this.onConsoleDisconnect(lParam.intValue());
     * @param sessionId
    /**
                this.onSessionChange(wParam, lParam);
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2025 DBeaver Corp and others
        HMODULE hInst = Kernel32.INSTANCE.GetModuleHandle("");
                return onDeviceChangeRemoveComplete(lParam);
            case WM_POWERBROADCAST: {
                // see http://msdn.microsoft.com/en-us/library/windows/desktop/aa363244.aspx
     * @see
        }.start();

     * @param lParam
        System.out.println("onMachineLogon: " + sessionId);
        return new LRESULT(1);
                short flag = bvl.dbcv_flags;

 * limitations under the License.
    /**
            }
                System.out.println("dbcc_devicetype: " + bdif.dbcc_devicetype);
        User32.INSTANCE.DestroyWindow(hWnd);
                System.out.println("BROADCAST_PORT: " + action);

    }
     */
    protected void onConsoleConnect(int sessionId) {
                System.out.println("isNet:"+isNet);
        System.out.println("onMachineUnlocked: " + sessionId);

         * DEVICE_NOTIFY_WINDOW_HANDLE to ignore the dbcc_classguid value
     * @param sessionId
     * On create.
     *
        getLastError();
            case DBT.DBT_DEVTYP_VOLUME: {
                System.out.println("BROADCAST_HANDLE: " + action);
                LRESULT lResult = this.onDeviceChange(wParam, lParam);
        System.out.println("onCreate: WM_CREATE");

        // see http://msdn.microsoft.com/en-us/library/windows/desktop/aa363211.aspx

                return lResult != null ? lResult :
//                hWnd, notificationFilter, User32.DEVICE_NOTIFY_WINDOW_HANDLE);
            }
                return User32.INSTANCE.DefWindowProc(hwnd, uMsg, wParam, lParam);
     *            the session id
        getLastError();
                this.onMachineLocked(lParam.intValue());
                DEV_BROADCAST_PORT bpt = new DEV_BROADCAST_PORT(bhdr.getPointer());
    public LRESULT callback(HWND hwnd, int uMsg, WPARAM wParam, LPARAM lParam) {
     *            the session id
        }
    protected void onMachineLogoff(int sessionId) {
            case DBT.DBT_DEVICEARRIVAL: {

        while (User32.INSTANCE.GetMessage(msg, hWnd, 0, 0) != 0) {
        User32.INSTANCE.UnregisterClass(windowClass, hInst);
     *
     * @param lParam
     * On machine logoff.
        }
                    return new LRESULT(1);
     *            the arguments
                break;

            }

                break;
 * Licensed under the Apache License, Version 2.0 (the "License");
            case Wtsapi32.WTS_CONSOLE_CONNECT: {

        if (rc != 0)
import com.sun.jna.platform.win32.WinUser.MSG;
                System.out.println("WinProc: " + uMsg + "; wParam=" + wParam.toString());
            public void run() {
        // register window class
        MSG msg = new MSG();
        // return TRUE means processed message for this wParam.
    /**
                break;
            case DBT.DBT_DEVICEREMOVECOMPLETE: {
     * @param sessionId
                System.out.println("dbcc_name: " + bdif.getDbcc_name());
     * @param wParam
    }


                break;
            }
     *
            User32.INSTANCE.TranslateMessage(msg);
            }
                return new LRESULT(0);
                return onDeviceChangeArrival(lParam);
    }
        f.setSize(300,100);
                // see http://msdn.microsoft.com/en-us/library/windows/desktop/aa363248.aspx
     */
                        User32.WS_EX_TOPMOST,
    }
                return null;
                break;
        wClass.lpfnWndProc = Win32WindowDemo.this;

//        User32.INSTANCE.UnregisterDeviceNotification(hDevNotify);

        new Thread() {
     * @param sessionId
    /**
        return null;
            case DBT.DBT_DEVTYP_HANDLE: {
    }
     *            the w param
                DEV_BROADCAST_HANDLE bhd = new DEV_BROADCAST_HANDLE(bhdr.getPointer());
                // see http://msdn.microsoft.com/en-us/library/windows/desktop/aa363249.aspx
        Wtsapi32.INSTANCE.WTSRegisterSessionNotification(hWnd,
    }
                int logicalDriveAffected = bvl.dbcv_unitmask;
            default:
    }
        System.out.println("onMachineLogoff: " + sessionId);
    /**
                User32.INSTANCE.PostQuitMessage(0);
     */
                System.out.println("isMediaNotPhysical:"+isMediaNotPhysical);
                break;
            }
    protected LRESULT onDeviceChangeArrival(LPARAM lParam) {
     *
     */
            }
     * @param sessionId
     */
     * (non-Javadoc)
        // create new window
         */
        wClass.hInstance = hInst;
        f.setVisible(true);
                        null, hInst, null);
    /**
 * Unless required by applicable law or agreed to in writing, software
         * use User32.DEVICE_NOTIFY_ALL_INTERFACE_CLASSES instead of
    /*
    }
     * com.sun.jna.platform.win32.WinDef.LPARAM)
 */
        return onDeviceChangeArrivalOrRemoveComplete(lParam, "Remove Complete");

            default:
                    onSuspend(wParam, lParam);
    protected LRESULT onDeviceChangeRemoveComplete(LPARAM lParam) {
     *            the session id
                DEV_BROADCAST_VOLUME bvl = new DEV_BROADCAST_VOLUME(bhdr.getPointer());
     * @param sessionId
     *            the l param
                + hWnd.getPointer().toString());
     */
     */
                    logicalDriveAffected >>>= 1;
    static final int PBT_APMRESUMESUSPEND = 0x7;
        // return TRUE means processed message for this wParam.
                }
package org.jkiss.dbeaver.ui.app.devtools.desktop;
        return rc;
    }
     *
     */
public class Win32WindowDemo implements WindowProc {

    }
}                return new LRESULT(0);
            case DBT.DBT_DEVNODES_CHANGED: {
    }
        System.out.println("onConsoleDisconnect: " + sessionId);
        DEV_BROADCAST_HDR bhdr = new DEV_BROADCAST_HDR(lParam.longValue());
     * On console disconnect.
    /**

    static final int WM_POWERBROADCAST = 0x218;
                System.out.println(
import com.sun.jna.platform.win32.WinDef.*;
 * you may not use this file except in compliance with the License.
        // DEV_BROADCAST_HDR notificationFilter = new DEV_BROADCAST_HDR();
     * Gets the last error.
                System.out.println("dbcc_classguid: "
        Wtsapi32.INSTANCE.WTSUnRegisterSessionNotification(hWnd);
     * @param args


            User32.INSTANCE.DispatchMessage(msg);

    }
                        windowClass,
    public static void main(String[] args) {
//        notificationFilter.dbcc_classguid = DBT.GUID_DEVINTERFACE_USB_DEVICE;
                        System.out.println("Logical Drive Letter: " +
        int rc = Kernel32.INSTANCE.GetLastError();
    /**
                boolean isNet = 0 != (flag & DBT.DBTF_NET/*value is 2*/);
     */
                    if (0 != (logicalDriveAffected & 1)) {
            case DBT.DBT_DEVTYP_PORT: {
     *            the l param
            default:
    private void onSuspend(WPARAM wParam, LPARAM lParam) {
                int driveLetterIndex = 0;
     * @return the result. Null if the message is not processed.
     *
     *
                this.onMachineLogoff(lParam.intValue());
        switch (wParam.intValue()) {
     *
//        notificationFilter.dbcc_size = notificationFilter.size();
        User32.INSTANCE.RegisterClassEx(wClass);
                        + bdif.dbcc_classguid.toGuidString());
     * @param lParam
     * On device change.
            case DBT.DBT_DEVTYP_DEVICEINTERFACE: {
     * Instantiates a new win32 window test.
            }
     */
 *
import com.sun.jna.platform.win32.WinUser.WindowProc;
        switch (bhdr.dbch_devicetype) {
                break;
                        "My hidden helper window, used only to catch the windows events",
//            System.out.println("RegisterDeviceNotification was sucessfully!");
    public Win32WindowDemo() {
            }
            System.out.println("error: " + rc);
    /**
    }
     *            the w param
    protected LRESULT onDeviceChangeArrivalOrRemoveComplete(LPARAM lParam, String action) {
        // notificationFilter.dbch_devicetype = DBT.DBT_DEVTYP_DEVICEINTERFACE;

            @Override
    }
        // define new window class
            case DBT.DBT_DEVTYP_OEM: {
import com.sun.jna.platform.win32.DBT.*;
        /*
     * @param wParam
     * com.sun.jna.platform.win32.User32.WindowProc#callback(com.sun.jna.platform
     * On session change.
 * See the License for the specific language governing permissions and

            }
    protected void onSessionChange(WPARAM wParam, LPARAM lParam) {
                            ((char) ('A' + driveLetterIndex)));
 *
     *

            }
                this.onMachineLogon(lParam.intValue());
     *            the session id
            }
     * On machine logon.
     */
                System.out.println("BROADCAST_OEM: " + action);
import com.sun.jna.platform.win32.*;
     * On machine locked.
            case Wtsapi32.WTS_SESSION_LOGOFF: {
     * On machine unlocked.
//        HDEVNOTIFY hDevNotify = User32.INSTANCE.RegisterDeviceNotification(
    }
                System.out.println("BROADCAST_DEVICEINTERFACE: " + action);
    public int getLastError() {
                        0, 0, 0, 0, 0,
                    User32.INSTANCE.DefWindowProc(hwnd, uMsg, wParam, lParam);
        System.out.println("program exit!");

     *            the session id
        wClass.lpszClassName = windowClass;

import com.sun.jna.platform.win32.WinUser.WNDCLASSEX;
//        notificationFilter.dbcc_devicetype = DBT.DBT_DEVTYP_DEVICEINTERFACE;
                System.out.println("Power event");
                new Win32WindowDemo();
            }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    }
    protected LRESULT onDeviceChangeNodesChanged() {
    protected void onMachineUnlocked(int sessionId) {
            }
        System.out.println("Machine suspend requested");
                DEV_BROADCAST_OEM boem = new DEV_BROADCAST_OEM(bhdr.getPointer());
     *            the l param
                this.onConsoleConnect(lParam.intValue());
                        null, // WM_DEVICECHANGE contradicts parent=WinUser.HWND_MESSAGE
     */
     * On console connect.
    /**
//        if (hDevNotify != null)
        javax.swing.JFrame f=new javax.swing.JFrame();
     * The main method.
                break;
     *            the w param
                boolean isMediaNotPhysical = 0 != (flag & DBT.DBTF_MEDIA/*value is 1*/);
    protected void onMachineLogon(int sessionId) {
        System.out.println("onMachineLocked: " + sessionId);
     *
        f.getContentPane().add(new javax.swing.JLabel("close to end test"));
    }
    protected void onCreate(WPARAM wParam, LPARAM lParam) {
    }
     */
            }

        System.out.println("window sucessfully created! window hwnd: "


    protected void onMachineLocked(int sessionId) {
        }
                // FIXME: it doesn't work!!
     * @return the last error
            }
        /* this filters for all device classes */
        f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

        switch (wParam.intValue()) {
    protected void onConsoleDisconnect(int sessionId) {
                while (logicalDriveAffected != 0) {
                    "Message WM_DEVICECHANGE message received, value unhandled.");
            case WinUser.WM_DESTROY: {

        System.out.println("Message DBT_DEVNODES_CHANGED");
        HWND hWnd = User32.INSTANCE
    protected LRESULT onDeviceChange(WPARAM wParam, LPARAM lParam) {
                if (wParam.intValue() == PBT_APMQUERYSUSPEND)
 *     http://www.apache.org/licenses/LICENSE-2.0
                break;
//        DEV_BROADCAST_DEVICEINTERFACE notificationFilter = new DEV_BROADCAST_DEVICEINTERFACE();
//        getLastError();
        }
            }
     *
            case Wtsapi32.WTS_CONSOLE_DISCONNECT: {
        switch (uMsg) {
                Wtsapi32.NOTIFY_FOR_THIS_SESSION);
                //lParam is 0 for this wParam
        return new LRESULT(1);
                return onDeviceChangeNodesChanged();
    static final int PBT_APMQUERYSUSPEND = 0x0;
     *
                {
                this.onMachineUnlocked(lParam.intValue());
     *            the session id
            case WinUser.WM_SESSION_CHANGE: {




        System.out.println("onConsoleConnect: " + sessionId);
 *
 * DBeaver - Universal Database Manager
                // see http://msdn.microsoft.com/en-us/library/windows/desktop/aa363245.aspx
            case Wtsapi32.WTS_SESSION_LOGON: {
                break;
 * You may obtain a copy of the License at
/*
    /**
                .CreateWindowEx(

        // see http://msdn.microsoft.com/en-us/library/windows/desktop/aa363205.aspx
            case WinUser.WM_DEVICECHANGE: {
        // see http://msdn.microsoft.com/en-us/library/windows/desktop/aa363208.aspx
     * @param wParam
                // see http://msdn.microsoft.com/en-us/library/windows/desktop/aa363247.aspx
            }
            case Wtsapi32.WTS_SESSION_LOCK: {

                System.out.println(action);
    }
