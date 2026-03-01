package org.jkiss.dbeaver.data.gis.handlers;
 *     http://www.apache.org/licenses/LICENSE-2.0

 * GIS geometry handler
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
public class GISGeometryTest {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
 */
    }
 * DBeaver - Universal Database Manager
 *
import org.locationtech.jts.io.WKTReader;
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
        Geometry g = wktReader.read("MultiPointZ((1 2 3))");
/*
import org.locationtech.jts.geom.Geometry;

 * limitations under the License.

 * See the License for the specific language governing permissions and
    public static void main(String[] args) throws Exception {
}
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        System.out.println(g);
 * You may obtain a copy of the License at
        WKTReader wktReader = new WKTReader();
