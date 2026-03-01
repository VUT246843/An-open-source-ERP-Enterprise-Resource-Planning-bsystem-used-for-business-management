
    GraphicsConfiguration defaultConfig;
 *
 */
    /**
     * @return The default configuration for this device.
     */
    }
     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.awt.*;
     */
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
 * A graphics device for SWTGraphics2D.
    public GraphicsConfiguration getDefaultConfiguration() {


     * Returns the id string (defined in the constructor).
    }
        return this.id;
    private final String id;
}
    /**
     */
     * Creates a new instance.


    public GraphicsConfiguration[] getConfigurations() {
    @Override
     *
     * @return The device type.
    /**
package org.jfree.swt;

     *
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");

    public SWTGraphicsDevice(String id, GraphicsConfiguration defaultConfig) {
     * @param defaultConfig  the default configuration.
     * @return The id string.
 * limitations under the License.
 * You may obtain a copy of the License at
    public String getIDstring() {
     *
        return this.defaultConfig;
     *
    @Override
 * Unless required by applicable law or agreed to in writing, software
        this.id = id;
public class SWTGraphicsDevice extends GraphicsDevice {
    public int getType() {
     * Returns the device type.
     * Returns all configurations for this device.
    @Override

    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
     *
    }
 * DBeaver - Universal Database Manager
 *

     * Returns the default configuration for this device.
        this.defaultConfig = defaultConfig;
        return new GraphicsConfiguration[] { getDefaultConfiguration() };
/**
     * @param id  the id.

    /**
 */
    }
    }
    @Override
     * @return All configurations for this device.
     */
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0

        return GraphicsDevice.TYPE_RASTER_SCREEN;
