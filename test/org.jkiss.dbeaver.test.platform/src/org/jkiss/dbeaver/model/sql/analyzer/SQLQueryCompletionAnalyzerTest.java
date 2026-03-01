                s.table("Table1", t -> {
import org.jkiss.dbeaver.model.sql.analyzer.builder.request.RequestResult;

        {
            Assert.assertTrue(proposals.contains("\"a.schema\""));
            .tables(s -> {
            
            Assert.assertTrue(proposals.contains("Col1"));
import org.junit.Test;
        {
    }
                    t.attribute("Col9");
import org.jkiss.dbeaver.model.sql.analyzer.builder.request.RequestBuilder;
            Assert.assertTrue(proposals.contains("t.Col1, t.Col2, t.Col3"));
                d.schema("Schema1", s -> {
        Assert.assertTrue(proposals.contains("a.\"attribute-a\""));
                        f.attribute("attribute1");
            Assert.assertTrue(proposals.contains("Col1"));
            Assert.assertTrue(proposals.contains("col2"));
            Assert.assertTrue(proposals.contains("Col2"));
public class SQLQueryCompletionAnalyzerTest extends DBeaverUnitTest {

            final Set<String> proposals = request.requestNewStrings("SELECT * FROM Database3.\"a.schema\".|");
        Assert.assertTrue(proposals.contains("b.attribute1"));
            final Set<String> proposals = request
                    t.attribute("Col8");
            .prepare();
                s.table("Tbl6", empty());
            final Set<String> proposals = request.requestNewStrings("SEL|");
        if (Platform.isRunning()) {
            
            Assert.assertTrue(proposals.contains("Tbl5 t"));
            final Set<String> proposals = request
        Assert.assertTrue(proposals.contains("\"attribute-a\""));
        {
                        f.attribute("attribute-A");
        Assert.assertTrue(proposals.contains("\"attribute-a\""));

        {
        }
            .requestNewStrings("SELECT * FROM tableNaMeA a, tableNaMeB b WHERE a.|");
        }
    public void init() throws DBException {
        }
                        f.attribute("attribute3");
        {
                .requestNewStrings("SELECT t.*| FROM Table1 t", false);
            final Set<String> proposals = request.requestNewStrings("UPDATE db.sch.tbl t SET |");
            Assert.assertTrue(proposals.contains("Col3"));
                });
                            }
                    t.attribute("Col6");
                    t.table("table3", f -> {
 *
 *
            

import static org.jkiss.dbeaver.model.sql.analyzer.builder.Builder.Consumer.empty;
            
            final Set<String> proposals = request.requestNewStrings("SELECT * FROM Database1.|");
        Assert.assertTrue(proposals.contains("attribute2"));
                        );
        }
        Assert.assertTrue(proposals.contains("a.attribute2"));

                                s.table(
        Assert.assertTrue(proposals.contains("b.attribute3"));
    public void testColumnsQuotedNamesCompletion() throws DBException {
            Assert.assertTrue(proposals.contains("FROM"));
            

            .requestNewStrings("SELECT * FROM table1 a, table2 b WHERE a.|");
import org.jkiss.junit.osgi.annotation.RunnerProxy;
                    t.table("table1", f -> {
                });
            
        Assert.assertTrue(proposals.contains("b.attribute2"));
            final Set<String> proposals = request.requestNewStrings("SELECT * FROM Da|");
            final Set<String> proposals = request
                            "sch", s -> {
            Assert.assertTrue(proposals.contains("Schema1"));
                        f.attribute("attribute1");

            final Set<String> proposals = request


            
                x.database(
        }
                        s.table("Table1", empty());
package org.jkiss.dbeaver.model.sql.analyzer;
                });
        {
                s.table("Table2", empty());
        // alias from a
            final Set<String> proposals = request.requestNewStrings("SELECT * FROM Schema1.|");
            final Set<String> proposals = request.requestNewStrings("SELECT * FROM |");
                d.schema("Schema2", s -> {
        }
            Assert.assertFalse(proposals.contains("Table3 t"));
        Assert.assertTrue(proposals.contains("a.\"attribute-Aa\""));
        Assert.assertTrue(proposals.contains("b.attribute2"));
        Assert.assertTrue(proposals.contains("\"attribute-a\""));
 * Unless required by applicable law or agreed to in writing, software
                s.table("Tbl4", empty());
        {
        Assert.assertTrue(proposals.contains("b.\"attribute-a\""));
        }
                                    }
        }
        }
    private static RequestResult modelDataRequest;
        Assert.assertTrue(proposals.contains("b.attribute1"));
            Assert.assertTrue(proposals.contains("Table3 t"));
            .prepare();


            .prepare();
                    s.table("Table5", empty());
        }
            s.table("Table1", t -> {
                s.table("Table3", empty());

                            t.attribute("Col2");
        Assert.assertTrue(proposals.contains("a.attribute1"));
                t.attribute("Col4");
        proposals = modelDataRequest
        proposals = modelDataRequest

        {

            Assert.assertTrue(proposals.contains("Table1 t"));
                    t.attribute("Col4");
    public void testCompleteTablesWithAliasesQuotedPositive() throws DBException {
            Assert.assertTrue(proposals.contains("Col2"));
        Assert.assertTrue(proposals.contains("\"attribute-Aa\""));

            .tables(s -> {
            Assert.assertTrue(proposals.contains("Col4"));
        {
    }
        proposals = modelDataRequest

        Assert.assertTrue(proposals.contains("\"attribute-A\""));
        Assert.assertTrue(proposals.contains("\"attribute-A\""));
 * Copyright (C) 2010-2025 DBeaver Corp and others
            Assert.assertTrue(proposals.contains("Database3"));
            Assert.assertTrue(proposals.contains("Table1 t"));

        Assert.assertTrue(proposals.contains("b.\"attribute-Aa\""));
        {
        }
            final Set<String> proposals = request.requestNewStrings("SELECT | FROM Database1.Schema1.Table1");
                    t.attribute("Col1");
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        }
        Assert.assertTrue(proposals.contains("\"attribute-a\""));
 * distributed under the License is distributed on an "AS IS" BASIS,
        
                s.table("Tbl5", empty());

        {
    @Test
            
            Assert.assertTrue(proposals.contains("WHERE"));




                        f.attribute("attribute2");
        }
        Assert.assertTrue(proposals.contains("attribute1"));
            
        Assert.assertTrue(proposals.contains("a.\"attribute-a\""));
                    t.table("table2", f -> {
                        f.attribute("attribute2");
                    s.table("Table3", empty());
        {
        Assert.assertTrue(proposals.contains("attribute2"));
    @Test
            .requestNewStrings("SELECT * FROM tableNaMeA a, tableNaMeB b WHERE a.attribute-a=1 AND b.|");

            .databases(x -> {
        {
        final RequestResult request = RequestBuilder.tables(s -> {
}
        // b
            final Set<String> proposals = request
                    t.attribute("Col2");
                    });
                .requestNewStrings("SELECT * FROM Table1 WHERE Table1.|");
        }

        {
                    t.attribute("Col3");
        Assert.assertTrue(proposals.contains("attribute2"));
            final Set<String> proposals = request
            Assert.assertTrue(proposals.contains("Col3"));
                    });
                        f.attribute("attribute-Aa");
            
            
            s.table("Table2", t -> {
            Assert.assertTrue(proposals.contains("Tbl6 t"));
            final Set<String> proposals = request.requestNewStrings("SELECT | FROM \"Database1\".Schema1.\"Table1\"");
                    s.table("Table2", empty());
                        });
        final RequestResult request = RequestBuilder
        {
            });
        {
            .requestNewStrings("SELECT * FROM table1 a, table2 b WHERE a.attribute1=1 AND b.|");
            .prepare();
    @Before
            final Set<String> proposals = request.requestNewStrings("SELECT * FROM T |");
            Assert.assertTrue(proposals.contains("Tbl6 t"));
    }
    
            Assert.assertTrue(proposals.contains("Col3"));
    public void testSchemaTableNamesCompletion() throws DBException {
                    d.schema("Schema1", s -> {
        Set<String> proposals = modelDataRequest
        Assert.assertTrue(proposals.isEmpty());
                s.table("Table 3", t -> {

        Assert.assertTrue(proposals.contains("a.\"attribute-Aa\""));
import org.junit.Before;
                        s.table("a.table", empty());
                .requestNewStrings("SELECT | FROM Table1");
    public void testTableNamesCompletion() throws DBException {
                        f.attribute("attribute2");
            })
            Assert.assertTrue(proposals.contains("Col1"));
                .requestNewStrings("SELECT t.| FROM Table1 t");
 * you may not use this file except in compliance with the License.
            final Set<String> proposals = request.requestNewStrings("SELECT * |");
        proposals = modelDataRequest
@RunnerProxy(MockitoJUnitRunner.Silent.class)
            .requestNewStrings("SELECT * FROM tableNaMeA a, tableNaMeB b WHERE |");
                    t.attribute("Col2");
            final Set<String> proposals = request
                    });
        Assert.assertTrue(proposals.contains("a.attribute3"));
            Assert.assertTrue(proposals.contains("\"a.table\" t"));

            modelDataRequest = RequestBuilder
        Assert.assertTrue(proposals.contains("a.attribute1"));
import org.jkiss.dbeaver.DBException;
        {
        {
            
                    t.attribute("Col7");
                        s.table("Table1", t -> {
                    });
                            t.attribute("Col1");
import org.junit.Assert;
            final Set<String> proposals = request
        }
                });
                        s.table("Table2", empty());
            final Set<String> proposals = request.requestNewStrings("SELECT * FROM Database3.|");
            Assert.assertTrue(proposals.contains("Col1"));
                s.table("Table1", t -> {

            .prepare();
            Assert.assertTrue(proposals.contains("Col8"));
                        f.attribute("attribute3");
            Assert.assertTrue(proposals.contains("Tbl4 t"));

                        s.table("Table4", empty());
        }
            Assert.assertTrue(proposals.contains("Table3 t"));
                x.database("Database1", d -> {
 * See the License for the specific language governing permissions and
                s.table("Table2", t -> {
            Assert.assertFalse(proposals.contains("Table1 t"));
    @Test
            final Set<String> proposals = request.requestNewStrings("SELECT * FROM Sch|");
            Assert.assertTrue(proposals.contains("Col2"));
                        f.attribute("attribute-a");
            Assert.assertTrue(proposals.contains("Database2"));
                    d.schema("Schema1", s -> {
        Set<String> proposals = modelDataRequest
            .databases(x -> {
                t.attribute("Col1");
                s.table("Table1", empty());
                x.database("Database3", d -> {
            Assert.assertTrue(proposals.contains("Col9"));
            Assert.assertTrue(proposals.contains("Schema2"));
                    t.attribute("Col3");
    public void testCompleteTablesWithAliasesPositive() throws DBException {
        {
                .requestNewStrings("SELECT * FROM \"Table 3\" t WHERE t.|");
            Assert.assertTrue(proposals.contains("Col4"));
            .requestNewStrings("SELECT * FROM tableNaMeA a, tableNaMeB b WHERE a.|");
    @Test

        }
        final RequestResult request = RequestBuilder
                                );
        }
                });
        Set<String> proposals = modelDataRequest
        {
                    });
                    }
 */
            final Set<String> proposals = request.requestNewStrings("SELECT * FROM Database1.Schema1.|");
            
        }
            .prepare();
    }
                        d.schema(
                    });
    }
            Assert.assertTrue(proposals.contains("Schema1"));
        Assert.assertTrue(proposals.contains("a.\"attribute-A\""));
                        f.attribute("attribute-Aa");
        Assert.assertTrue(proposals.contains("a.attribute2"));
                                        t.attribute("col3");
        proposals = modelDataRequest
                );
    }
    public void testKeywordCompletion() throws DBException {
            
        Assert.assertTrue(proposals.contains("attribute3"));
            Assert.assertTrue(proposals.contains("Table2 t"));
    }
                    t.table("tableNaMeA", f -> {
            Assert.assertTrue(proposals.size() >= 3);
            Assert.assertTrue(proposals.contains("Tbl5 t"));
                });
        {

        proposals = modelDataRequest
            .requestNewStrings("SELECT * FROM tableNaMeA a, tableNaMeB b WHERE a.attribute-a=1 AND b.|");
        {
            .requestNewStrings("SELECT * FROM table1 a, table2 b WHERE b.|");
        // alias from b
        {
        }).prepare();


                });
    }
                .requestNewStrings("SELECT * FROM Table1 WHERE |");
        // all
        }
    @Test
            
        }
                    d.schema("Schema2", s -> {

 * You may obtain a copy of the License at
            .schemas(d -> {
            final Set<String> proposals = request
            Assert.assertTrue(proposals.contains("Col2"));
                    d.schema("a.schema", s -> {
                });
            Assert.assertTrue(proposals.contains("Table2 t"));
            Assert.assertTrue(proposals.contains("Col7"));
            Assert.assertTrue(proposals.contains("Col1, Col2, Col3"));
            Assert.assertTrue(proposals.contains("Col1"));
        Assert.assertTrue(proposals.contains("\"attribute-Aa\""));
    @Test
            Assert.assertTrue(proposals.contains("col1"));
        // alias from a and b

                        f.attribute("attribute1");
        {
 * Licensed under the Apache License, Version 2.0 (the "License");
            Assert.assertTrue(proposals.contains("Col1"));
            Assert.assertTrue(proposals.contains("Col3"));
            
            Assert.assertTrue(proposals.contains("Table2 t"));
            })
            })

            Assert.assertTrue(proposals.contains("Col3"));
        Assert.assertTrue(proposals.contains("\"attribute-Aa\""));
            .requestNewStrings("SELECT * FROM table1 a, table2 b WHERE |");
        proposals = modelDataRequest
            final Set<String> proposals = request.requestNewStrings("SELECT * FROM Table1 b join Table2 on b.|", false);
        final RequestResult request = RequestBuilder
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
                    });
            
        Assert.assertTrue(proposals.contains("b.\"attribute-A\""));
        Assert.assertTrue(proposals.contains("b.\"attribute-A\""));
 * limitations under the License.
    public void testColumnNamesCompletion() throws DBException {
    @Test
            Assert.assertTrue(proposals.contains("Col1"));
                    "db", d -> {

        {
    }
                    });
    
        }
            
            .databases(x -> {
    public void testDatabaseSchemaTableNamesCompletion() throws DBException {
        final RequestResult request = RequestBuilder

        

            Assert.assertTrue(proposals.contains("col3"));
            Assert.assertTrue(proposals.contains("Col1"));
    public void testColumnsCompletionInUpdate() throws DBException {

        }

        Assert.assertTrue(proposals.contains("attribute3"));
            })
/*
            
                .requestNewStrings("SELECT *| FROM Table1", false);
            .prepare();
            Assert.assertTrue(proposals.contains("Col6"));
            Assert.assertTrue(proposals.contains("Col2"));
    }
    @Test
            


                        s.table("Table5", empty());
            .prepare();
 *
        }
            Assert.assertTrue(proposals.contains("Col3"));
            
                        f.attribute("attribute-A");
                t.attribute("Col5");
        }
            Assert.assertTrue(proposals.contains("Tbl4 t"));
                    t.attribute("Col1");

    public void testColumnWithNonExistingAliases() throws DBException {
                    s.table("Table4", empty());
 * DBeaver - Universal Database Manager
            .tables(s -> {
                });
                        f.attribute("attribute3");

        proposals = modelDataRequest
            final Set<String> proposals = request.requestNewStrings("SELECT * FROM Table1 join Table2 t on t.|", false);
        }
        {
                    s.table("Table1", empty());
                .prepare();
            Assert.assertTrue(proposals.contains("Database1"));
            Assert.assertTrue(proposals.contains("Col2"));
    @Test
            
                })
            Assert.assertTrue(proposals.contains("Col1"));
            final Set<String> proposals = request
            Assert.assertTrue(proposals.contains("Col3"));
    @Test
            final Set<String> proposals = request.requestNewStrings("SELECT | FROM \"Database1\".\"Schema1\".\"Table1\"");
            });
                .requestNewStrings("SELECT Table1.*| FROM Table1", false);
                    t.table("tableNaMeB", f -> {
            final Set<String> proposals = request.requestNewStrings("SELECT * FROM Tb|");
        
import org.eclipse.core.runtime.Platform;
            Assert.assertTrue(proposals.contains("Col5"));
        Assert.assertTrue(proposals.contains("\"attribute-A\""));
                x.database("Database2", d -> {


        Assert.assertTrue(proposals.contains("b.\"attribute-a\""));
                t.attribute("Col2");
                        s.table("Table3", empty());
            Assert.assertTrue(proposals.contains("Col1, Col2, Col3"));
                    s.table("Table6", empty());
                .tables(t -> {
                                    "tbl", t -> {
        {
        Assert.assertTrue(proposals.contains("\"attribute-Aa\""));
                                        t.attribute("col2");
    @Test
        proposals = modelDataRequest
            Assert.assertFalse(proposals.contains("Table2 t"));
            })
        {
            Assert.assertTrue(proposals.contains("Table1 t"));
                .requestNewStrings("SELECT t2.| FROM Table1 t, Table2 t2");

    public void testColumnNamesExpandCompletion() throws DBException {
            .requestNewStrings("SELECT * FROM tableNaMeA a, tableNaMeB b WHERE |");

                        f.attribute("attribute-a");
        final RequestResult request = RequestBuilder
        Assert.assertTrue(proposals.contains("b.\"attribute-Aa\""));

        Assert.assertTrue(proposals.contains("\"attribute-A\""));
            Assert.assertTrue(proposals.contains("Col2"));
        final RequestResult request = RequestBuilder
                                        t.attribute("col1");
            .requestNewStrings("SELECT * FROM table1 a, table2 b WHERE a.attribute1=1 AND |");
    }
                    t.attribute("Col5");
    public void testCompleteTablesByAliaseNegative() throws DBException {

            })
            .requestNewStrings("SELECT * FROM table1 a, table2 b WHERE c.|");
        }
                        s.table("Table6", empty());
            Assert.assertTrue(proposals.contains("Table3 t"));
        Assert.assertTrue(proposals.contains("b.attribute3"));
        Assert.assertTrue(proposals.contains("attribute1"));

            Assert.assertTrue(proposals.contains("Col2"));
            Assert.assertTrue(proposals.contains("Col3"));
                            t.attribute("Col3");
    }
        Assert.assertTrue(proposals.contains("a.\"attribute-A\""));
        Assert.assertTrue(proposals.contains("attribute1"));


                });

                    });
                x.database("Database1", d -> {
            Assert.assertTrue(proposals.contains("SELECT"));
    @Test

import java.util.Set;
        Assert.assertTrue(proposals.contains("attribute3"));
    
            Assert.assertTrue(proposals.contains("Col5"));

        // a
        final RequestResult request = RequestBuilder
            Assert.assertTrue(proposals.contains("Col2"));
            })

            .empty()
        Assert.assertTrue(proposals.contains("a.attribute3"));
            
        final RequestResult request = RequestBuilder

import org.jkiss.junit.DBeaverUnitTest;
                .requestNewStrings("SELECT * FROM Table1 t WHERE t.|");
import org.mockito.junit.MockitoJUnitRunner;
