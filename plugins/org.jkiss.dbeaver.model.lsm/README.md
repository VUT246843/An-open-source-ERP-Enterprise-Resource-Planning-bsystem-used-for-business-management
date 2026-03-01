
To parse sql query you need to call `LSMAnalyzer:parseSQLQueryTree` method which has two arguments.
- error node (`STMTreeTermErrorNode`)
    </extension>
The first argument is `STMSource`. It's responsible for providing the source text to the parser.
<extension point="org.jkiss.dbeaver.lsm.dialectSyntax">
public class SQLiteSQLAnalyzer extends SQLStandardAnalyzer {
![](/LSMDiagram.png)
- terminal node (`STMTreeTermNode`)

        SQLStandardParser parser = super.prepareParser(source, errorListener);
```
Usage of the corresponding extension point for this case is the following:
        return new SQLiteSQLAnalyzer(dialect);
    <lsmDialect analyzerFactoryClass="org.jkiss.dbeaver.model.lsm.sql.dialect.SQLStandardAnalyzerFactory">
`SQLStandardAnalyzer` is a common analyzer with parser and lexer by the common grammar for most SQL databases without any specific settings. It's being instantiated with the `SQLStandardAnalyzerFactory` implementation of the `LSMAnalyzerFactory` interface via extension point in `org.jkiss.dbeaver.model.sql.plugin.xml`.
- non-terminal node (`STMTreeRuleNode`)
Working with ANTLR generated parser starts with extending `SQLStandardParser` with `STMParserOverrides`.
        </lsmDialect>
}
    }
```xml
So, when we parse some text by the grammar, we get an object of type `STMTreeNode`.
All of them have the common parent `STMTreeNode` which extends Tree class of ANTLR library.
    public LSMAnalyzer createAnalyzer(SQLDialect dialect) {
    <extension point="org.jkiss.dbeaver.lsm.dialectSyntax">
        <lsmDialect analyzerFactoryClass="org.jkiss.dbeaver.ext.sqlite.model.SQLiteSQLAnalyzer">
The classes represented on the diagram are the infrastructure for ANTLR parser usage.
Analyzer accepts SQLDialect carrying non-syntax and non-semantic information about certain SQL language context with respect to the connection session, so it is required to create analyzer factory and associate it with corresponding dialect's family.  
    </lsmDialect>
    @Override

The following listing gives an example of configuring parser for specific dialect to use square brackets quotation for identifiers.
```
        super(dialect); 



    public SQLStandardAnalyzer(@NotNull SQLDialect dialect) {
If we need to use a common grammar, but with a specific parser configuration, or want to use analyzer with database-specific parser and lexer,
The key interface is `LSMAnalyzer`. It encapsulates parser and lexer creation and parsing process.

Use `STMLoggingErrorListener` to log errors and `STMSkippingErrorListener` to just skip them and do nothing.
        return parser;
public class SQLiteAnalyzerFactory implements LSMAnalyzerFactory {
            <appliesTo dialectClass="org.jkiss.dbeaver.ext.sqlite.model.SQLiteSQLDialect"/>
        parser.setIsSupportSquareBracketQuotation(true);


We also override AST Nodes to extend their functionality. We have three types of nodes:
The second argument is of type `STMErrorListener` and used to define the behaviour on errors while parsing.
    @NotNull
</extension>
    }
    @Override
}
    }

The concrete implementation of `LSMAnalyzer` used according to `SQLDialect` implementation with `LSMDialectRegistry`. `LSMDialectRegistry` contains a map with analyzer to dialect correspondence, which comes from extension point declared in `plugin.xml`.
```
```xml
```java
then we need to describe it accordingly using extension point.
```java
        <appliesTo dialectClass="org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect"/>

    protected SQLStandardParser prepareParser(@NotNull STMSource source, @Nullable STMErrorListener errorListener) {
```
