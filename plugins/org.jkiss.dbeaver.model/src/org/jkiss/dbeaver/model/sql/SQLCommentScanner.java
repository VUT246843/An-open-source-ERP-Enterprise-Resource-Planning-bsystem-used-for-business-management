                return;
}
    private final String sql;

        @Nullable String[] slTokens,
    SQLCommentScanner(
                pos += mlStart.length();
                }
import java.util.Iterator;
            String slToken = findSingleLineToken(sql, pos, slTokens);
    public boolean hasNext() {
        for (String token : tokens) {
 * Iterates over the SQL text and yields pure comment bodies
        advance();
        }
    }
        @NotNull String sql
        if (nextComment == null) {
            }
        this.mlEnd = mlComments != null ? mlComments.getSecond() : null;
 * (without comment delimiters or line terminators).
import org.jkiss.utils.Pair;
        advance();
    private int pos = 0;
            /* -------- Single-line comment ---------- */
        @Nullable Pair<String, String> mlComments,
                    pos = len;


    private static String findSingleLineToken(String sql, int offset, String[] tokens) {
            if (slToken != null) {
        }

    }

    private static int findEol(String sql, int offset) {
                pos = (eol < len) ? eol + 1 : len; // skip '\n' if present
        return nextComment != null;
                int eol = findEol(sql, pos);
    }
import org.jkiss.code.Nullable;


    private final String mlEnd;
        this.mlStart = mlComments != null ? mlComments.getFirst() : null;
        nextComment = null;
    @Override
                    pos = end + mlEnd.length();
    private void advance() {

        int nl = sql.indexOf('\n', offset);
            }
        }
            }
                nextComment = sql.substring(pos, eol).trim();
            /* -------- Ordinary character ----------- */
    private final String mlStart;
            throw new NoSuchElementException();
                } else {
                if (end < 0) {
import java.util.NoSuchElementException;
        return result;
        this.slTokens = slTokens != null ? slTokens : new String[0];
    private String nextComment;

        this.sql = sql;
    }
        return null;
/**
            if (!token.isEmpty() && sql.startsWith(token, offset)) {
    @Override
    }
    public String next() {
        return nl == -1 ? sql.length() : nl;
                    nextComment = sql.substring(pos, end).trim();
                int end = mlEnd == null ? -1 : sql.indexOf(mlEnd, pos);
            /* -------- Multi-line comment ---------- */
final class SQLCommentScanner implements Iterator<String> {

    ) {

    private final String[] slTokens;
import org.jkiss.code.NotNull;
                return;
        while (pos < len) {
    }
            if (mlStart != null && sql.startsWith(mlStart, pos)) {
            pos++;
        String result = nextComment;
package org.jkiss.dbeaver.model.sql;
 */
                return token;

                pos += slToken.length();
                    nextComment = sql.substring(pos).trim();
        int len = sql.length();

