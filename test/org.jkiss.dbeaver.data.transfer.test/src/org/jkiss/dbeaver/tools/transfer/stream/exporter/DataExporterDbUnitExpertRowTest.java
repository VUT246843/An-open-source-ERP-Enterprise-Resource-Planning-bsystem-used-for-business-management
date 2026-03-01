
            @NotNull
        when(mockSite.getWriter()).thenReturn(pw);
            </dataset>
            <dataset>
    private String tableName = "test_table";
 *     http://www.apache.org/licenses/LICENSE-2.0
        String simpleTextRow = "simple text row";
import java.io.IOException;

        {"delivery":"express"}""";
            }
import static org.mockito.Mockito.when;
        writeRow(simpleTextRow);

            }
        exporter.exportFooter(null);
        var actualOutput = stringWriter.toString().lines().toList();
 * limitations under the License.
    }

import org.jkiss.dbeaver.model.DBPNamedObject;
            @Override
                boolean validateValue

/*
import org.jkiss.dbeaver.model.data.DBDValueHandler;
                boolean copy,
    private String constructExpectedOutput(@NotNull String row) {
    @Test
    @Test
import org.jkiss.code.Nullable;
        stringWriter = new StringWriter();

            """.formatted(outputEncoding, tableName.toUpperCase(), columnName.toUpperCase(), row);

        assertOutputMatches(expectedRow);
        DBDValueHandler valueHandler = getDbdValueHandlerMock();
            }
            }
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
            @Nullable
    private String columnName = "test_column";
    private DataExporterDbUnit exporter;
 * Copyright (C) 2010-2025 DBeaver Corp and others

import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
            @Override
import org.junit.Test;
        IntStream.range(0, actualOutput.size())
    }

 * Unless required by applicable law or agreed to in writing, software
        when(mockBinding.getValueHandler()).thenReturn(mock(DBDValueHandler.class));
            }

        // given
    private DBCResultSet resultSet;


            @Override
    @Test
        when(mockSite.getAttributes()).thenReturn(new DBDAttributeBinding[]{mockBinding});
        return mockSite;
        assertOutputMatches(expectedRow);
            @Override
    }
import org.jkiss.dbeaver.DBException;
        PrintWriter pw = new PrintWriter(stringWriter);
        exporter.exportHeader(session);
import org.jkiss.dbeaver.model.struct.DBSTypedObject;


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
            public void bindValueObject(
    private DBDValueHandler getDbdValueHandlerMock() {
            @Override
            }
    }
                @NotNull DBCStatement statement,

                @Nullable Object value
    public void textRowWithAllSpecialSymbolsShouldBeReplaced() throws DBException, IOException {
    }
import org.mockito.Mock;
                @NotNull DBCSession session,


            @Nullable
                <%s %s="%s"/>
        return new DBDValueHandler() {
                @Nullable Object object,
    }
        IStreamDataExporterSite mockSite = getIStreamDataExporterSiteMock();
        DBDAttributeBinding mockBinding = mock(DBDAttributeBinding.class);
package org.jkiss.dbeaver.tools.transfer.stream.exporter;
        String expectedRow = "{&quot;delivery&quot;:&quot;express&quot;}";
    @Mock
    public void textRowWithQuotesShouldBeReplaced() throws DBException, IOException {
 * See the License for the specific language governing permissions and
 *
                return value == null ? "" : value.toString();
        return """
    private String outputEncoding = "UTF-8";
    @NotNull
            <?xml version="1.0" encoding="%s"?>
import org.jkiss.dbeaver.model.exec.*;

        // given
        IStreamDataExporterSite mockSite = mock(IStreamDataExporterSite.class);
                @NotNull DBCSession session,
    }
    @NotNull
        when(mockSource.getName()).thenReturn(tableName);
                return String.class;
                return null;

        exporter.exportRow(session, resultSet, new Object[]{row});
        // when
    public void setUp() throws DBException {
            }


        writeRow(textRowWithSpecialXmlChars);
 */
            @NotNull
        // when
            public Class<?> getValueObjectType(@NotNull DBSTypedObject attribute) {
        // given
            public Object fetchValueObject(

        // then
            public void releaseValueObject(@Nullable Object value) {
        DBPNamedObject mockSource = mock(DBPNamedObject.class);
        var expectedOutput = constructExpectedOutput(expectedRow).lines().toList();
        writeRow(textRowWithSpecialXmlChars);
 * you may not use this file except in compliance with the License.
 *
            public String getValueDisplayString(@NotNull DBSTypedObject column, @Nullable Object value, @NotNull DBDDisplayFormat format) {
            @Override

                @NotNull DBSTypedObject type,

                return null;
        String expectedRow = "&lt;&gt;&amp;&quot;abc'";

            @Override
        assertOutputMatches(simpleTextRow);
 * Licensed under the Apache License, Version 2.0 (the "License");
            public String getValueContentType(@NotNull DBSTypedObject attribute) {
        when(mockBinding.getValueHandler()).thenReturn(valueHandler);
    }

import org.jkiss.code.NotNull;

        when(mockSite.getOutputEncoding()).thenReturn(outputEncoding);
import org.mockito.Answers;
 * DBeaver - Universal Database Manager

 * distributed under the License is distributed on an "AS IS" BASIS,
            @Override
                int index
        // then
import org.jkiss.dbeaver.tools.transfer.stream.IStreamDataExporterSite;
        when(mockBinding.getName()).thenReturn(columnName);
            ) throws DBCException {
            }
    }
import java.io.StringWriter;
        exporter.init(mockSite);
import org.jkiss.junit.DBeaverUnitTest;
        when(mockSite.getSource()).thenReturn(mockSource);
        // when
import java.io.PrintWriter;
import static org.mockito.Mockito.mock;
                @NotNull DBSTypedObject type,

    private void writeRow(@NotNull String row) throws DBException, IOException {

import static org.junit.Assert.assertEquals;
                return object;
                return new DBCLogicalOperator[0];
            }
            @Nullable
    public void simpleTextRowNoSubstitutions() throws DBException, IOException {
 *
    @Before
        String textRowWithSpecialXmlChars = """
            .forEach(i -> assertEquals(expectedOutput.get(i), actualOutput.get(i)));
                @NotNull DBCResultSet resultSet,

                @NotNull DBCSession session,
        <>&"abc'""";
            ) throws DBCException {

}
    @Mock(answer = Answers.RETURNS_DEEP_STUBS)
            public Object createNewValueObject(@NotNull DBCSession session, @NotNull DBSTypedObject type) throws DBCException {
            @NotNull
            @Override

        //EOT independent comparison
        String textRowWithSpecialXmlChars = """
            @Nullable
            public Object getValueFromObject(
public class DataExporterDbUnitExpertRowTest extends DBeaverUnitTest {
        // then
                return null;

            ) throws DBCException {
import java.util.stream.IntStream;


    private void assertOutputMatches(@NotNull String expectedRow) {
        };
import org.junit.Before;
            public DBCLogicalOperator[] getSupportedOperators(@NotNull DBSTypedObject attribute) {
    private IStreamDataExporterSite getIStreamDataExporterSiteMock() {
    private StringWriter stringWriter;
                int index,
        exporter = new DataExporterDbUnit();
    private DBCSession session;

                @NotNull DBSTypedObject type,
