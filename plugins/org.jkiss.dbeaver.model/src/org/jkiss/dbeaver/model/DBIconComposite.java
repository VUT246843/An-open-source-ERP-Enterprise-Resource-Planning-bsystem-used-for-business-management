    }
    }


        this.topRight = topRight;
    public DBPImage getBottomLeft() {
import org.jkiss.code.NotNull;
    }
    public boolean hasOverlays() {
 * distributed under the License is distributed on an "AS IS" BASIS,
        return disabled;
    }

    }

        this.topLeft = topLeft;

    public DBPImage getBottomRight() {
}
public class DBIconComposite implements DBPImage
    private final DBPImage main;
/*
        this.disabled = disabled;
    }
    public DBPImage getMain() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
        this.bottomRight = bottomRight;
    private final boolean disabled;

 * Image with overlays
 *


    public String getLocation() {
 * You may obtain a copy of the License at
        return bottomRight;
    }
 * See the License for the specific language governing permissions and
    public boolean isDisabled() {

        return topLeft != null || topRight != null || bottomLeft != null || bottomRight != null;
{
        return topRight;
    public DBPImage getTopLeft() {

 */
 *
    @NotNull
        return topLeft;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.bottomLeft = bottomLeft;

    }
    }
        return main;
 * you may not use this file except in compliance with the License.

    public void setTopLeft(DBPImage topLeft) {
 *
    public void setTopRight(DBPImage topRight) {
    @NotNull
    @Override

package org.jkiss.dbeaver.model;
    }
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;

    }
        this.topRight = topRight;

    public DBPImage getTopRight() {
    public void setBottomRight(DBPImage bottomRight) {
    }
 * DBeaver - Universal Database Manager
        return main.getLocation();

 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    public DBIconComposite(DBPImage main, boolean disabled, DBPImage topLeft, DBPImage topRight, DBPImage bottomLeft, DBPImage bottomRight) {
 * limitations under the License.
    private DBPImage topLeft, topRight, bottomLeft, bottomRight;
    public void setBottomLeft(DBPImage bottomLeft) {
        return bottomLeft;
        this.bottomLeft = bottomLeft;
 */
        this.main = main;
