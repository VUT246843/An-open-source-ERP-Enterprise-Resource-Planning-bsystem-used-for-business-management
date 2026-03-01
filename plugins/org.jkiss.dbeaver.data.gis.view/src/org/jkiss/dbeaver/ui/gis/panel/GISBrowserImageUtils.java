 * Licensed under the Apache License, Version 2.0 (the "License");
                }
                }
        
 *
                    Win32Exception ex = new Win32Exception(Native.getLastError());
import com.sun.jna.Native;
            }
import com.sun.jna.platform.win32.WinGDI.BITMAPINFO;
            throw new Win32Exception(Native.getLastError());
                    throw new IllegalStateException("Device context did not release properly.");
                // failure modes are null or equal to HGDI_ERROR
import org.eclipse.swt.widgets.Control;
import com.sun.jna.platform.win32.*;

import com.sun.jna.platform.win32.WinDef.HBITMAP;
class GISBrowserImageUtils {
    static ImageData getControlScreenshotOnWindows(Control control) {
                if (!GDI32.INSTANCE.DeleteObject(platformBitmapHandle)) {
import com.sun.jna.platform.win32.WinDef.HDC;
            if (platformBitmapHandle == null) {
                    }
            int resultOfDrawing = GDI32.INSTANCE.GetDIBits(sourceHdc, platformBitmapHandle, 0, size.y, buffer, bmi, WinGDI.DIB_RGB_COLORS);
                throw new Win32Exception(Native.getLastError());
                        ex.addSuppressed(error);
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
 * Unless required by applicable law or agreed to in writing, software
        }
        } finally {
            error = e;
    }

                    Win32Exception ex = new Win32Exception(Native.getLastError());
            }
        if (sourceHdc == null) {
                throw new Win32Exception(Native.getLastError());
            if (originalObjHandle == null) {
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (error != null) {
import com.sun.jna.platform.win32.WinNT.HANDLE;
            bmi.bmiHeader.biBitCount = 32;
                if (!GDI32.INSTANCE.DeleteDC(targetHdc)) {
        HDC targetHdc = null;
            if (originalObjHandle != null) {
            if (resultOfDrawing == 0 || resultOfDrawing == WinError.ERROR_INVALID_PARAMETER) {
            platformBitmapHandle = GDI32.INSTANCE.CreateCompatibleBitmap(sourceHdc, size.x, size.y);
                    }
        }
package org.jkiss.dbeaver.ui.gis.panel;
        HANDLE originalObjHandle = null;

import org.eclipse.swt.graphics.Point;
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
                    if (error != null) {
        
            }
        HBITMAP platformBitmapHandle = null;
            if (platformBitmapHandle != null) {
            }

                    if (error != null) {
                // per MSDN, set the display surface back when done drawing
            originalObjHandle = GDI32.INSTANCE.SelectObject(targetHdc, platformBitmapHandle);
            if (targetHdc == null) {
            bmi.bmiHeader.biWidth = size.x;
 * you may not use this file except in compliance with the License.
            }
        HDC sourceHdc = User32.INSTANCE.GetDC(sourceHwnd);
        try {
                        ex.addSuppressed(error);
import org.eclipse.swt.graphics.ImageData;
                HANDLE result = GDI32.INSTANCE.SelectObject(targetHdc, originalObjHandle);
            }
            Memory buffer = new Memory(bufferSize);
}
            }
        Win32Exception error = null;
            byte[] rawData = buffer.getByteArray(0, bufferSize);
 * limitations under the License.
    
 * See the License for the specific language governing permissions and
        Point location = control.toDisplay(0, 0);

            bmi.bmiHeader.biHeight = -size.y;
import org.eclipse.swt.graphics.PaletteData;
                }


                if (0 == User32.INSTANCE.ReleaseDC(sourceHwnd, sourceHdc)) {
            if (targetHdc != null) {
                    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                throw new Win32Exception(Native.getLastError());
            bmi.bmiHeader.biCompression = WinGDI.BI_RGB;
 * You may obtain a copy of the License at
        ImageData data = null;
        Point size = control.getSize();
                throw new Win32Exception(Native.getLastError());

            targetHdc = GDI32.INSTANCE.CreateCompatibleDC(sourceHdc);
            BITMAPINFO bmi = new BITMAPINFO();
                    error = ex;
import com.sun.jna.platform.win32.WinDef.HWND;

 *

 *
            int bufferSize = size.x * size.y * 4;
                        ex.addSuppressed(error);
            }
            bmi.bmiHeader.biPlanes = 1;
        } catch (Win32Exception e) {
                    error = ex;
                if (result == null || WinGDI.HGDI_ERROR.equals(result)) {
import com.sun.jna.Memory;
            data = new ImageData(size.x, size.y, 32, palette, size.x, rawData);


import com.sun.jna.Pointer;
            throw error;
            if (sourceHdc != null) {
            PaletteData palette = new PaletteData(0x0000FF00, 0x00FF0000, 0xFF000000);
                    error = ex;
            if (!GDI32.INSTANCE.BitBlt(targetHdc, 0, 0, size.x, size.y, sourceHdc, location.x, location.y, GDI32.SRCCOPY)) {
        HWND sourceHwnd = new WinDef.HWND(Pointer.NULL);
                    if (error != null) {

        return data;
 * DBeaver - Universal Database Manager
                    Win32Exception ex = new Win32Exception(Native.getLastError());
                throw new Win32Exception(Native.getLastError());
            }
