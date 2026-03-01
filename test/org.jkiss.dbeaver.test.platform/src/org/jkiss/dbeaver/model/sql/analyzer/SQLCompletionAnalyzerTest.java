                        f.attribute("attribute2");
            .request("SELECT * FROM tableNaMeA a, tableNaMeB b WHERE |");
public class SQLCompletionAnalyzerTest extends DBeaverUnitTest {
            .request("SELECT * FROM tableNaMeA a, tableNaMeB b WHERE a.attribute-a=1 AND b.|");
                    t.attribute("Col2");
        Assert.assertEquals("b.\"attribute-Aa\"", proposals.get(5).getReplacementString());
            .tables(s -> {
                        s.table("Table1", t -> {
        }
        Assert.assertEquals("b.attribute2", proposals.get(4).getReplacementString());
                });
                    d.schema("Schema1", s -> {
import org.junit.Test;
            .databases(x -> {
                        f.attribute("attribute-a");

    @Test
        Assert.assertEquals("\"attribute-a\"", proposals.get(0).getReplacementString());
        

 * limitations under the License.
        {
            Assert.assertEquals(3, proposals.size());
        }
            final List<SQLCompletionProposalBase> proposals = request
package org.jkiss.dbeaver.model.sql.analyzer;
        
        {

        }
        Assert.assertEquals("attribute2", proposals.get(1).getReplacementString());
    @Test
            Assert.assertEquals("Col3", proposals.get(2).getReplacementString());

        }
            final List<SQLCompletionProposalBase> proposals = request
                        f.attribute("attribute1");
                    s.table("Table2", empty());
            Assert.assertEquals("Col2", proposals.get(1).getReplacementString());

            .request("SELECT * FROM tableNaMeA a, tableNaMeB b WHERE a.|");
                        s.table("Table6", empty());
        }
            Assert.assertEquals(1, proposals.size());
            Assert.assertEquals("WHERE", proposals.get(0).getReplacementString());
        Assert.assertEquals("attribute1", proposals.get(0).getReplacementString());
            Assert.assertEquals("Table3 t", proposals.get(2).getReplacementString());
        {
                    t.attribute("Col2");
        {
            Assert.assertEquals(3, proposals.size());
        // alias from a and b
            Assert.assertEquals("Col3", proposals.get(2).getReplacementString());
            Assert.assertEquals("Table2 t", proposals.get(1).getReplacementString());
            .request("SELECT * FROM tableNaMeA a, tableNaMeB b WHERE |");
        {
 *     http://www.apache.org/licenses/LICENSE-2.0
        final RequestResult request = RequestBuilder
        {
            .prepare();

 *

                d.schema("Schema1", s -> {
                    });
 * you may not use this file except in compliance with the License.
        Assert.assertEquals("attribute2", proposals.get(1).getReplacementString());
            });
        proposals = modelDataRequest
                s.table("Table 3", t -> {
            Assert.assertEquals(1, proposals.size());
                    });
                    });
            .schemas(d -> {

            .request("SELECT * FROM tableNaMeA a, tableNaMeB b WHERE a.|");
                x.database("Database1", d -> {
                    });
                    t.table("table1", f -> {
    }
            .prepare();
        final RequestResult request = RequestBuilder
import org.junit.Ignore;
                s.table("Table1", empty());
 * Licensed under the Apache License, Version 2.0 (the "License");

            Assert.assertEquals(24, proposals.get(0).getReplacementOffset());
    
            final List<SQLCompletionProposalBase> proposals = request.request("SELECT * FROM Database3.\"a.schema\".|");
                });
            })
    public void testColumnNamesCompletion() throws DBException {
            .databases(x -> {
        {
        final RequestResult request = RequestBuilder
 * Copyright (C) 2010-2024 DBeaver Corp and others
                        f.attribute("attribute2");
        // alias from a
            .request("SELECT * FROM tableNaMeA a, tableNaMeB b WHERE a.attribute-a=1 AND b.|");
import org.jkiss.junit.DBeaverUnitTest;

                });
    public void testColumnNamesExpandCompletion() throws DBException {
        }

            Assert.assertEquals("Col8", proposals.get(1).getReplacementString());

            .request("SELECT * FROM table1 a, table2 b WHERE |");
                        s.table("Table3", empty());
                });
            Assert.assertEquals("\"a.schema\"", proposals.get(0).getReplacementString());
            Assert.assertEquals("Col2", proposals.get(1).getReplacementString());
            final List<SQLCompletionProposalBase> proposals = request.request("SELECT * FROM |");
    @Test
        }
            Assert.assertEquals("Col6", proposals.get(2).getReplacementString());
            .prepare();

                    t.attribute("Col3");
            Assert.assertEquals("Table1", proposals.get(0).getReplacementString());
            Assert.assertEquals("Col2", proposals.get(1).getReplacementString());

    public void testCompleteTablesByAliaseNegative() throws DBException {
            s.table("Table2", t -> {
                .request("SELECT t.| FROM Table1 t");
            Assert.assertEquals(1, proposals.size());
        {
        }
        Assert.assertEquals("a.attribute1", proposals.get(0).getReplacementString());
                .request("SELECT Table1.*| FROM Table1", false);
            Assert.assertEquals("Tbl4 t", proposals.get(0).getReplacementString());
                    s.table("Table1", empty());
                .request("SELECT * FROM \"Table 3\" t WHERE t.|");
            final List<SQLCompletionProposalBase> proposals = request.request("SELECT * FROM Database1.Schema1.|");
                s.table("Table1", t -> {

        }
        
    public void testQuotedNamesCompletion() throws DBException {
    @Test
            Assert.assertEquals("Table3 t", proposals.get(2).getReplacementString());
        Assert.assertEquals("a.attribute2", proposals.get(1).getReplacementString());
            Assert.assertEquals("Database3", proposals.get(2).getReplacementString());
            Assert.assertEquals("Col2", proposals.get(1).getReplacementString());
 * See the License for the specific language governing permissions and
            Assert.assertEquals("Col1", proposals.get(0).getReplacementString());
                    t.table("table3", f -> {
    
                    d.schema("a.schema", s -> {
            final List<SQLCompletionProposalBase> proposals = request
        Assert.assertEquals("a.\"attribute-A\"", proposals.get(1).getReplacementString());
import static org.jkiss.dbeaver.model.sql.analyzer.builder.Builder.Consumer.empty;
        {
            final List<SQLCompletionProposalBase> proposals = request.request("SEL|");
                    t.table("tableNaMeA", f -> {
            Assert.assertEquals("Col2", proposals.get(1).getReplacementString());
            final List<SQLCompletionProposalBase> proposals = request.request("SELECT * FROM Schema1.|");
        }
            Assert.assertEquals("Col1", proposals.get(0).getReplacementString());
 * You may obtain a copy of the License at
                        f.attribute("attribute3");
    @Test
        final RequestResult request = RequestBuilder
        Assert.assertEquals("\"attribute-Aa\"", proposals.get(2).getReplacementString());
                        f.attribute("attribute-Aa");
            Assert.assertEquals("Table1.Col2", proposals.get(1).getReplacementString());

            s.table("Table1", t -> {
        }

            Assert.assertEquals("Database2", proposals.get(1).getReplacementString());
            Assert.assertEquals("Col1", proposals.get(0).getReplacementString());
                s.table("Tbl4", empty());
            Assert.assertEquals(2, proposals.size());
                    t.attribute("Col9");
                x.database("Database1", d -> {
        proposals = modelDataRequest
            Assert.assertEquals("Schema1", proposals.get(0).getReplacementString());
        Assert.assertEquals("b.attribute1", proposals.get(3).getReplacementString());
        Assert.assertEquals("a.attribute3", proposals.get(2).getReplacementString());
            final List<SQLCompletionProposalBase> proposals = request.request("SELECT * FROM Da|");
            Assert.assertEquals("Col2", proposals.get(1).getReplacementString());
        {
                    });
            });
            Assert.assertEquals("Col7", proposals.get(0).getReplacementString());
            final List<SQLCompletionProposalBase> proposals = request.request("SELECT * FROM \"Dat|\"");
                .request("SELECT t2.| FROM Table1 t, Table2 t2");

        // all
            Assert.assertEquals(1, proposals.size());

 * distributed under the License is distributed on an "AS IS" BASIS,
        }
        Assert.assertEquals("b.\"attribute-Aa\"", proposals.get(5).getReplacementString());

        }
            final List<SQLCompletionProposalBase> proposals = request.request("SELECT * FROM \"Database1\".\"Schema1\".\"Tab|\"");
        {
    @Test
    @Test
        {
            Assert.assertEquals(1, proposals.size());

        }
                        f.attribute("attribute3");
                });
import org.jkiss.junit.osgi.annotation.RunnerProxy;
            // TODO: Is 'WHERE' even supposed to be here?
            Assert.assertEquals(3, proposals.size());
        Assert.assertEquals("a.\"attribute-a\"", proposals.get(0).getReplacementString());
            Assert.assertEquals("\"a.table\" t", proposals.get(0).getReplacementString());
            Assert.assertEquals("Col9", proposals.get(2).getReplacementString());
import java.util.List;

}
                            t.attribute("Col2");
            Assert.assertEquals("Col3", proposals.get(2).getReplacementString());



                        s.table("Table1", empty());
            Assert.assertEquals("Col1, t.Col2, t.Col3", proposals.get(0).getReplacementString());
        {

            final List<SQLCompletionProposalBase> proposals = request
                });
                })
            Assert.assertEquals("Tbl6 t", proposals.get(2).getReplacementString());
            final List<SQLCompletionProposalBase> proposals = request.request("SELECT * |");
                s.table("Tbl6", empty());
                .tables(t -> {
        Assert.assertEquals("a.\"attribute-a\"", proposals.get(0).getReplacementString());
import org.junit.Before;
        proposals = modelDataRequest
    @Before

        }
                x.database("Database3", d -> {
        proposals = modelDataRequest
            modelDataRequest = RequestBuilder
                s.table("Table1", t -> {
        Assert.assertEquals("a.\"attribute-Aa\"", proposals.get(2).getReplacementString());
 */
 * Unless required by applicable law or agreed to in writing, software
                s.table("Table2", empty());
    }
        {
        }


            .prepare();
                .request("SELECT * FROM Table1 WHERE |");
            .request("SELECT * FROM table1 a, table2 b WHERE a.attribute1=1 AND b.|");
            .databases(x -> {
        Assert.assertEquals("\"attribute-Aa\"", proposals.get(2).getReplacementString());
        Assert.assertEquals("b.\"attribute-a\"", proposals.get(3).getReplacementString());
    @Test
            Assert.assertEquals("Col2", proposals.get(1).getReplacementString());
        }).prepare();

                            t.attribute("Col2");
            Assert.assertEquals("Col1, Col2, Col3", proposals.get(0).getReplacementString());
                    });
        }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        {
            Assert.assertEquals(3, proposals.size());
    }
    }
                            t.attribute("Col3");
                        f.attribute("attribute1");
            Assert.assertEquals("Col1", proposals.get(0).getReplacementString());
        proposals = modelDataRequest
        proposals = modelDataRequest
            .request("SELECT * FROM table1 a, table2 b WHERE a.attribute1=1 AND |");

                d.schema("Schema2", s -> {

                .request("SELECT * FROM Table1 t WHERE t.|");
        Assert.assertEquals("\"attribute-A\"", proposals.get(1).getReplacementString());
            Assert.assertEquals("Col2", proposals.get(1).getReplacementString());
    }
            Assert.assertEquals(1, proposals.size());
                            t.attribute("Col3");
                    });
            Assert.assertEquals("Table3 t", proposals.get(2).getReplacementString());
/*
    public void init() throws DBException {
                    t.attribute("Col8");
        Assert.assertEquals("b.\"attribute-A\"", proposals.get(4).getReplacementString());



        }
        proposals = modelDataRequest
            Assert.assertEquals(1, proposals.size());
            Assert.assertEquals("Tbl5 t", proposals.get(1).getReplacementString());
        }
        {
                    t.attribute("Col6");
            Assert.assertEquals("Schema1", proposals.get(0).getReplacementString());
        Assert.assertEquals("\"attribute-A\"", proposals.get(1).getReplacementString());
        Assert.assertEquals("b.\"attribute-a\"", proposals.get(3).getReplacementString());
                    t.attribute("Col7");
                        f.attribute("attribute-A");
            final List<SQLCompletionProposalBase> proposals = request.request("SELECT * FROM Database1.|");
                    t.attribute("Col5");
 * DBeaver - Universal Database Manager

            // Assert.assertEquals("WHERE", proposals.get(3).getReplacementString());
        Assert.assertEquals("attribute2", proposals.get(1).getReplacementString());
            final List<SQLCompletionProposalBase> proposals = request
        {
    private static RequestResult modelDataRequest;
            final List<SQLCompletionProposalBase> proposals = request
            final List<SQLCompletionProposalBase> proposals = request.request("SELECT | FROM \"Database1\".\"Schema1\".\"Table1\"");
            })
        {
            Assert.assertEquals("Col4", proposals.get(0).getReplacementString());

            Assert.assertEquals("Table2 t", proposals.get(1).getReplacementString());
            .request("SELECT * FROM table1 a, table2 b WHERE a.|");
            final List<SQLCompletionProposalBase> proposals = request.request("SELECT | FROM \"Database1\".Schema1.\"Table1\"");
@RunnerProxy(MockitoJUnitRunner.Silent.class)
            final List<SQLCompletionProposalBase> proposals = request.request("SELECT * FROM \"Database1\".\"Schema1\".\"Table1\".\"Col|\"");
        Assert.assertEquals("b.attribute3", proposals.get(5).getReplacementString());
        Assert.assertEquals("attribute1", proposals.get(0).getReplacementString());
            Assert.assertEquals("SELECT", proposals.get(0).getReplacementString());
                });

                x.database("Database2", d -> {
        }

            Assert.assertEquals("Col3", proposals.get(2).getReplacementString());
                        f.attribute("attribute1");
            Assert.assertEquals(1, proposals.size());
        final RequestResult request = RequestBuilder
        if (Platform.isRunning()) {
    }
                    s.table("Table4", empty());

        final RequestResult request = RequestBuilder
                    d.schema("Schema2", s -> {
import org.mockito.junit.MockitoJUnitRunner;
        Assert.assertEquals("a.attribute2", proposals.get(1).getReplacementString());
            })
        proposals = modelDataRequest
            Assert.assertEquals("Table1 t", proposals.get(0).getReplacementString());
                    t.table("tableNaMeB", f -> {
            Assert.assertEquals("Database1", proposals.get(0).getReplacementString());
        List<SQLCompletionProposalBase> proposals = modelDataRequest
                    t.attribute("Col3");

 *
            Assert.assertEquals("Col3", proposals.get(2).getReplacementString());
        Assert.assertEquals("b.attribute1", proposals.get(3).getReplacementString());
            Assert.assertEquals("Col1", proposals.get(0).getReplacementString());
            Assert.assertEquals("Schema2", proposals.get(1).getReplacementString());
            Assert.assertEquals("FROM", proposals.get(0).getReplacementString());
        {
        proposals = modelDataRequest
        Assert.assertEquals("b.\"attribute-A\"", proposals.get(4).getReplacementString());
            final List<SQLCompletionProposalBase> proposals = request
            Assert.assertEquals("Table1.Col3", proposals.get(2).getReplacementString());
                t.attribute("Col2");
            Assert.assertEquals("Col5", proposals.get(1).getReplacementString());
    public void testCompleteTablesWithAliasesQuotedPositive() throws DBException {
            })
    
            Assert.assertEquals("Col1, Table1.Col2, Table1.Col3", proposals.get(0).getReplacementString());
            Assert.assertEquals(3, proposals.size());
                t.attribute("Col4");
            .empty()
                        });
                    s.table("Table3", empty());
            Assert.assertEquals(3, proposals.size());
                .request("SELECT | FROM Table1");
            final List<SQLCompletionProposalBase> proposals = request.request("SELECT | FROM Database1.Schema1.Table1");
            .request("SELECT * FROM table1 a, table2 b WHERE c.|");
        {

    }
        Assert.assertEquals("attribute3", proposals.get(2).getReplacementString());

        Assert.assertEquals("\"attribute-a\"", proposals.get(0).getReplacementString());
            .tables(s -> {
                });
    }

                        f.attribute("attribute-Aa");
            Assert.assertEquals("Table1 t", proposals.get(0).getReplacementString());
            final List<SQLCompletionProposalBase> proposals = request
        }
                .request("SELECT t.*| FROM Table1 t", false);
        Assert.assertTrue(proposals.isEmpty());
            Assert.assertEquals(3, proposals.size());
                t.attribute("Col1");
        Assert.assertEquals("\"attribute-Aa\"", proposals.get(2).getReplacementString());
                });
                        s.table("Table1", t -> {
                    });
        }
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionProposalBase;


            Assert.assertEquals("Col3", proposals.get(2).getReplacementString());
        }
        }
        final RequestResult request = RequestBuilder.tables(s -> {
    public void testKeywordCompletion() throws DBException {
    @Test
            Assert.assertEquals(3, proposals.size());
            })
                        s.table("Table4", empty());
        }
                    t.table("table2", f -> {
        Assert.assertEquals("b.attribute3", proposals.get(5).getReplacementString());

                s.table("Table2", t -> {
            Assert.assertEquals("Schema1", proposals.get(0).getReplacementString());
            })
        {
            Assert.assertEquals("Table1.Col1", proposals.get(0).getReplacementString());
            final List<SQLCompletionProposalBase> proposals = request
            .prepare();
    }
            .tables(s -> {
            Assert.assertEquals(3, proposals.size());
                    d.schema("Schema1", s -> {
            Assert.assertEquals(1, proposals.size());
            Assert.assertEquals(3, proposals.size());
                        f.attribute("attribute-A");
        {
            Assert.assertEquals(3, proposals.size());

                s.table("Tbl5", empty());
                    s.table("Table5", empty());
            })
    @Test
            final List<SQLCompletionProposalBase> proposals = request.request("SELECT * FROM Database3.|");
            .prepare();
        {

            Assert.assertEquals("Col1", proposals.get(0).getReplacementString());
        {

                        f.attribute("attribute2");
        {
                    t.attribute("Col1");
        Assert.assertEquals("attribute3", proposals.get(2).getReplacementString());
        // a
            Assert.assertEquals("Col4", proposals.get(0).getReplacementString());
    public void testCompleteTablesWithAliasesPositive() throws DBException {
            Assert.assertEquals("Col3", proposals.get(2).getReplacementString());
                    });
                    });
            Assert.assertEquals("Database1", proposals.get(0).getReplacementString());
            final List<SQLCompletionProposalBase> proposals = request
            Assert.assertEquals(1, proposals.size());
            final List<SQLCompletionProposalBase> proposals = request.request("SELECT * FROM Tb|");
                    d.schema("Schema1", s -> {
            Assert.assertEquals("Col1", proposals.get(0).getReplacementString());
        {
            .prepare();
            Assert.assertEquals("Table1 t", proposals.get(0).getReplacementString());
            Assert.assertEquals(3, proposals.size());
            Assert.assertEquals(1, proposals.size());
                .prepare();
                    t.attribute("Col1");

        {

        Assert.assertEquals("\"attribute-A\"", proposals.get(1).getReplacementString());
        }
    @Ignore("See #12159")

                            t.attribute("Col1");
        // b
        // alias from b
        Assert.assertEquals("\"attribute-a\"", proposals.get(0).getReplacementString());
        {
        Assert.assertEquals("a.attribute3", proposals.get(2).getReplacementString());
            .request("SELECT * FROM table1 a, table2 b WHERE b.|");
    public void testSchemaTableNamesCompletion() throws DBException {
                x.database("Database1", d -> {
            Assert.assertEquals("Col1", proposals.get(0).getReplacementString());
    }
            Assert.assertEquals("Col1", proposals.get(0).getReplacementString());
    public void testDatabaseSchemaTableNamesCompletion() throws DBException {
                });
            Assert.assertEquals("Col2", proposals.get(1).getReplacementString());

            final List<SQLCompletionProposalBase> proposals = request.request("SELECT * FROM \"Database1\".\"Sch|\"");
        {
    }
    public void testTableNamesCompletion() throws DBException {
            Assert.assertEquals("Col3", proposals.get(2).getReplacementString());
        Assert.assertEquals("a.attribute1", proposals.get(0).getReplacementString());
import org.jkiss.dbeaver.model.sql.analyzer.builder.request.RequestResult;
            Assert.assertEquals(3, proposals.size());
        Assert.assertEquals("\"attribute-A\"", proposals.get(1).getReplacementString());
            final List<SQLCompletionProposalBase> proposals = request.request("SELECT * FROM Table1 join Table2 t on t.|", false);
        }
                .request("SELECT * FROM Table1 WHERE Table1.|");
    public void testColumnWithNonExistingAliases() throws DBException {
                        });
import org.junit.Assert;
    @Test
        }
                s.table("Table3", empty());
        }
        List<SQLCompletionProposalBase> proposals = modelDataRequest
        Assert.assertEquals("attribute1", proposals.get(0).getReplacementString());
            final List<SQLCompletionProposalBase> proposals = request.request("SELECT * FROM T |");

            Assert.assertEquals("Table2 t", proposals.get(1).getReplacementString());
            final List<SQLCompletionProposalBase> proposals = request.request("SELECT * FROM Sch|");
                        s.table("Table2", empty());
import org.jkiss.dbeaver.DBException;
        Assert.assertEquals("attribute3", proposals.get(2).getReplacementString());
        Assert.assertEquals("a.\"attribute-Aa\"", proposals.get(2).getReplacementString());
        final RequestResult request = RequestBuilder
                .request("SELECT *| FROM Table1", false);
            Assert.assertEquals(35, proposals.get(0).getReplacementOffset());
        {

                    t.attribute("Col4");
                        s.table("a.table", empty());
        Assert.assertEquals("\"attribute-a\"", proposals.get(0).getReplacementString());
import org.eclipse.core.runtime.Platform;
                    s.table("Table6", empty());
            Assert.assertEquals(3, proposals.size());
                        f.attribute("attribute-a");

                        s.table("Table5", empty());
                        f.attribute("attribute3");
            .prepare();
        Assert.assertEquals("\"attribute-Aa\"", proposals.get(2).getReplacementString());

                t.attribute("Col5");
        List<SQLCompletionProposalBase> proposals = modelDataRequest
                });
            final List<SQLCompletionProposalBase> proposals = request.request("SELECT * FROM Table1 b join Table2 on b.|", false);
    }
    public void testColumnsQuotedNamesCompletion() throws DBException {
        Assert.assertEquals("b.attribute2", proposals.get(4).getReplacementString());
        }
        }
        {
            Assert.assertEquals("Col5", proposals.get(1).getReplacementString());
import org.jkiss.dbeaver.model.sql.analyzer.builder.request.RequestBuilder;
                            t.attribute("Col1");
            Assert.assertEquals(1, proposals.size());
 *
            Assert.assertEquals(3, proposals.size());
        Assert.assertEquals("a.\"attribute-A\"", proposals.get(1).getReplacementString());
        }
        final RequestResult request = RequestBuilder
    }
            Assert.assertTrue(proposals.size() >= 3);
    @Test

