}
        Mockito.when(site.getProperties()).thenReturn(new HashMap<>());
import org.jkiss.dbeaver.tools.transfer.stream.exporter.DataExporterCSV;
            dataExporterCSV.init(site);

        Mockito.when(columns[0].getLabel()).thenReturn("Identifier");
/*
        Mockito.when(columns[1].getName()).thenReturn("NAME");
        }
            Assert.fail("Exception occurred: " + e.getMessage());


import org.junit.Assert;
import org.junit.Test;
        PrintWriter printWriter = new PrintWriter(stringWriter);
    }
    private DataExporterCSV dataExporterCSV;
import java.util.HashMap;
    public void setUp() {
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
import org.jkiss.junit.osgi.annotation.RunnerProxy;
import java.io.PrintWriter;
import org.mockito.Mockito;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * DBeaver - Universal Database Manager
    private IStreamDataExporterSite site;
 */
    }

            e.printStackTrace();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
        Mockito.when(site.getWriter()).thenReturn(printWriter);
        dataExporterCSV = new DataExporterCSV();
import org.jkiss.dbeaver.tools.transfer.stream.IStreamDataExporterSite;
import org.mockito.junit.MockitoJUnitRunner;
            String expectedHeader = "\"IDENTIFIER\",\"NAME\",\"AGE\",";
 * Licensed under the Apache License, Version 2.0 (the "License");

        site = Mockito.mock(IStreamDataExporterSite.class);
        Mockito.when(site.getAttributes()).thenReturn(columns);
        columns[1] = Mockito.mock(DBDAttributeBinding.class);

        DBDAttributeBinding[] columns = new DBDAttributeBinding[3];
        columns[0] = Mockito.mock(DBDAttributeBinding.class);
import org.jkiss.junit.DBeaverUnitTest;
            e.printStackTrace();
import org.junit.Before;
import java.io.StringWriter;
        columns[2] = Mockito.mock(DBDAttributeBinding.class);
 *

        Mockito.when(columns[1].getLabel()).thenReturn("Name");

 *
        try {
 * See the License for the specific language governing permissions and
            Assert.assertEquals(expectedHeader, stringWriter.toString());
    public void testExportHeader() {
        Mockito.when(columns[2].getLabel()).thenReturn("Age");
            dataExporterCSV.exportHeader(Mockito.mock(DBCSession.class));


        Mockito.when(columns[0].getName()).thenReturn("ID");

@RunnerProxy(MockitoJUnitRunner.Silent.class)
        stringWriter = new StringWriter();
        // Mocking attributes
 * You may obtain a copy of the License at
    @Test
        } catch (Exception e) {
package org.jkiss.dbeaver.tools.transfer;
        } catch (Exception e) {


        try {
    private StringWriter stringWriter;
        }
import org.jkiss.dbeaver.model.exec.DBCSession;
public class DataExporterCSVTest extends DBeaverUnitTest {
    @Before
        Mockito.when(columns[2].getName()).thenReturn("AGE");
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
