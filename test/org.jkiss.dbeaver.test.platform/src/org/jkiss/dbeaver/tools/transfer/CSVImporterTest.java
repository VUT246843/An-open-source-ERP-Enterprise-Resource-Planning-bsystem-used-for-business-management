        Assert.assertEquals(DBPDataKind.NUMERIC, columnsInfo.get(0).getDataKind());
    @Test
    	Assert.assertEquals(3,  columnsInfo.size());
    private final Map<String, Object> properties = new HashMap<>();
    }
 *
    @Test
        properties.put("header", isHeaderPresent ? DataImporterCSV.HeaderPosition.top : DataImporterCSV.HeaderPosition.none);
 * you may not use this file except in compliance with the License.
        Assert.assertEquals(DBPDataKind.STRING, columnsInfo.get(2).getDataKind());
        importer.init(site);
    }
import org.jkiss.junit.DBeaverUnitTest;
 */

        Assert.assertEquals(4, columnsInfo.size());

    
        Assert.assertEquals(DBPDataKind.STRING, columnsInfo.get(1).getDataKind());
    private IStreamDataImporterSite site;
  
        Assert.assertEquals(2, columnsInfo.size());

        Assert.assertEquals("Column2", columnsInfo.get(1).getName());
    private static final Path DUMMY_FILE = Path.of("dummy");
        Assert.assertEquals("REAL", columnsInfo.get(1).getTypeName());
    @Test
        List<StreamDataImporterColumnInfo> columnsInfo = readColumnsInfo(",", false);
 * distributed under the License is distributed on an "AS IS" BASIS,
            return importer.readColumnsInfo(mapping, is);
        Assert.assertEquals("INTEGER", columnsInfo.get(0).getTypeName());
}
        Assert.assertEquals(DBPDataKind.NUMERIC, columnsInfo.get(1).getDataKind());
        Assert.assertEquals("Column1", columnsInfo.get(0).getName());
import org.junit.Test;
 * Unless required by applicable law or agreed to in writing, software
        Assert.assertEquals(1, columnsInfo.size());
 *     http://www.apache.org/licenses/LICENSE-2.0
    	Assert.assertEquals("BIGINT", columnsInfo.get(1).getTypeName());

        try (ByteArrayInputStream is = new ByteArrayInputStream(data.getBytes())) {
    
    public void generateColumnNames() throws DBException, IOException {
        List<StreamDataImporterColumnInfo> columnsInfo = readColumnsInfo("1,2.0,abc,false", false);
import java.util.HashMap;
        Assert.assertEquals(4, columnsInfo.size());
        List<StreamDataImporterColumnInfo> columnsInfo = readColumnsInfo("1\n\n2\n3\ntest", false);
        Assert.assertEquals("Column3", columnsInfo.get(2).getName());
/*
        Mockito.when(site.getProcessorProperties()).thenReturn(properties);
        List<StreamDataImporterColumnInfo> columnsInfo = readColumnsInfo("a,b,c,d", false);
        Assert.assertEquals("a", columnsInfo.get(0).getName());
import org.junit.Assert;
    	List<StreamDataImporterColumnInfo> columnsInfo = readColumnsInfo("2147483648,-9223372036854775808,1", false);
 * You may obtain a copy of the License at

    public void readColumnNames() throws DBException, IOException {
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and


    @Test
        Assert.assertEquals(DBPDataKind.STRING, columnsInfo.get(0).getDataKind());
 * limitations under the License.
import org.mockito.Mock;
import java.io.IOException;
        Assert.assertEquals(DBPDataKind.STRING, columnsInfo.get(0).getDataKind());
import org.jkiss.dbeaver.tools.transfer.stream.StreamEntityMapping;
import java.util.Map;
    	Assert.assertEquals(0,  columnsInfo.size());
import org.junit.Before;
    @Test
    private final StreamEntityMapping mapping = new StreamEntityMapping(DUMMY_FILE);
 * Licensed under the Apache License, Version 2.0 (the "License");
        Assert.assertEquals("INTEGER", columnsInfo.get(2).getTypeName());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void returnsEmptyListWithEmptyFile() throws DBException, IOException {
import java.util.List;
    }
    public void init() throws DBException {
        Assert.assertEquals(DBPDataKind.BOOLEAN, columnsInfo.get(3).getDataKind());
    public void guessColumnTypesWithLongData() throws DBException, IOException {
import org.jkiss.dbeaver.tools.transfer.stream.importer.DataImporterCSV;
        Assert.assertEquals(DBPDataKind.NUMERIC, columnsInfo.get(2).getDataKind());
    public void guessColumnTypes() throws DBException, IOException {
import org.mockito.Mockito;
        List<StreamDataImporterColumnInfo> columnsInfo = readColumnsInfo("a,b,c,d", true);

    }

    @Test
        Assert.assertEquals("b", columnsInfo.get(1).getName());
        }
package org.jkiss.dbeaver.tools.transfer;
        Assert.assertEquals(4, columnsInfo.size());
    @Before
    private final DataImporterCSV importer = new DataImporterCSV();
    public void guessColumnTypesOverSamples() throws DBException, IOException {
        Assert.assertEquals("Column4", columnsInfo.get(3).getName());
    @Test
        Assert.assertEquals("c", columnsInfo.get(2).getName());
import org.jkiss.dbeaver.DBException;
import java.nio.file.Path;

        Assert.assertEquals("d", columnsInfo.get(3).getName());
    	Assert.assertEquals("BIGINT", columnsInfo.get(0).getTypeName());
    @Mock
    }
    }
import org.jkiss.dbeaver.tools.transfer.stream.StreamDataImporterColumnInfo;
public class CSVImporterTest  extends DBeaverUnitTest {
    }
import org.jkiss.dbeaver.tools.transfer.stream.IStreamDataImporterSite;
    }
    	List<StreamDataImporterColumnInfo> columnsInfo = readColumnsInfo("", false);
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
import java.io.ByteArrayInputStream;

    private List<StreamDataImporterColumnInfo> readColumnsInfo(String data, boolean isHeaderPresent) throws DBException, IOException {
    public void guessColumnTypesDefault() throws DBException, IOException {
import org.jkiss.dbeaver.model.DBPDataKind;

    	Assert.assertEquals(DBPDataKind.NUMERIC, columnsInfo.get(1).getDataKind());
 *
    	Assert.assertEquals(DBPDataKind.NUMERIC, columnsInfo.get(0).getDataKind());
