	<plan-item> ::= <basic-item> | <plan-expr>
 * DBeaver - Universal Database Manager
			tokenMatch.checkToken(FireBirdPlanToken.RIGHTPARENTHESE);
		private JDBCSession session;
			tokenMatch.jump();
	                     | ORDER index [INDEX (<indexlist>)]}
		
			switch (tokenMatch.token) {
						+ "WHERE RDB$INDEX_NAME = ? ORDER BY RDB$FIELD_POSITION");
				tokenMatch.jump();
 * @author tomashorak@post.cz
						"SELECT RDB$FIELD_NAME, RDB$STATISTICS FROM RDB$INDEX_SEGMENTS "
					}
				dbStat = session.prepareStatement(
			}
			tokenMatch.checkToken(FireBirdPlanToken.LEFTPARENTHESE);
		}

				tokenMatch.checkToken(FireBirdPlanToken.MERGE);
					tokenMatch.raisePlanTokenException();
					basicItem(parent);
					break;
		}
import java.sql.SQLException;

	
		}
				case IDENTIFICATOR:
			};
	PLAN <plan-expr>
				node = addPlanNode(parent, "MERGE");
/*
				tokenMatch.jump();
			FireBirdPlanNode node;

	<joined-item> ::=  JOIN (<plan-item>, <plan-item> [, <plan-item> ...])
 * See the License for the specific language governing permissions and
			this.plan = plan;
				case INDEX:
			tokenMatch.jump();
			}
					break;
			tokenMatch.jump();
			tokenMatch.checkToken(FireBirdPlanToken.HASH);
					break;
			tokenMatch.checkToken(FireBirdPlanToken.LEFTPARENTHESE);
			}
	                    
		}	
			default:
		private FireBirdPlanTokenMatcher tokenMatch;
	<basic-item> ::= <relation>
		}
	<relation> ::=  table | view [table]
 *     http://www.apache.org/licenses/LICENSE-2.0
				tokenMatch.raisePlanTokenException();
			StringBuilder sb = new StringBuilder();
			String aliases = collectIdentifiers();
			if (sorted) {
		FireBirdPlanParser(String plan, JDBCSession session) {
				tokenMatch.jump();
					String text = aliases + " ORDER " + orderIndex + indexInfo(orderIndex);
				case SORT:
			tokenMatch.checkToken(FireBirdPlanToken.LEFTPARENTHESE);
		}
			node = new FireBirdPlanNode(text);
			sb.append(" )");
					tokenMatch.jump();
			
 *
			tokenMatch.jump();
					tokenMatch.jump();
					indexes = indexes + ",";
					sortedItem(parent);
					do {
			node.parent = parent;
			tokenMatch.jump();
 * Copyright (C) 2010-2024 DBeaver Corp and others
			if (parent != null) {
 * you may not use this file except in compliance with the License.

	    	
			return sb.toString();
		private String collectIndexes() throws FireBirdPlanException {
			do {
			do {
				case HASH:
	<merged-item> ::=  [SORT] MERGE (<sorted-item>, <sorted-item> [, <sorted-item> ...])
		}
			FireBirdPlanNode node = null;
	
			return node;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
			while (tokenMatch.getToken() != FireBirdPlanToken.RIGHTPARENTHESE) {
		private void planExpr(FireBirdPlanNode parent) throws FireBirdPlanException {
			String identifiers = "";
				}
		}
				tokenMatch.jump();
			}
			} else {
			tokenMatch.checkToken(FireBirdPlanToken.RIGHTPARENTHESE);			
					tokenMatch.jump();
	            try {
			tokenMatch.jump();
/*
			tokenMatch.checkToken(FireBirdPlanToken.LEFTPARENTHESE);
			this.tokenMatch = new FireBirdPlanTokenMatcher(plan);
			FireBirdPlanNode node = addPlanNode(parent, "JOIN");
					break;
			} while (tokenMatch.getToken() == FireBirdPlanToken.COMMA);
	                    }
			planExpr(node);
					joinedItem(parent);
 */
	<indexlist> ::= index [, index ...]
					planExpr(parent);
			} catch (SQLException e) {
				case LEFTPARENTHESE:
					break;
	
						String orderIndexes = collectIndexes();
 * Firebird plan parser. It interprets tokens returned by FireBirdPlanTokenMatcher
			FireBirdPlanNode node = addPlanNode(parent, "SORT");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
	                    | <joined-item>
			FireBirdPlanNode node = addPlanNode(parent, "HASH");
			tokenMatch.checkToken(FireBirdPlanToken.RIGHTPARENTHESE);
					break;					
 * You may obtain a copy of the License at
			};
					hashedItem(parent);
			tokenMatch.checkToken(FireBirdPlanToken.JOIN);
	                     | INDEX (<indexlist>)
				JDBCPreparedStatement dbStat;
			tokenMatch.checkToken(FireBirdPlanToken.RIGHTPARENTHESE);
 * distributed under the License is distributed on an "AS IS" BASIS,
					break;
		private void hashedItem(FireBirdPlanNode parent) throws FireBirdPlanException {
 */
			return indexes;
				sortedItem(node);
			tokenMatch.jump();
		
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
*/
		private String plan;
 * limitations under the License.
	                    {NATURAL
					addPlanNode(parent, aliases + " NATURAL");
		private void mergedItem(FireBirdPlanNode parent, Boolean sorted) throws FireBirdPlanException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
		
					addPlanNode(parent, text);
					} while (tokenMatch.token == FireBirdPlanToken.COMMA);
				case JOIN:
		FireBirdPlanNode parse() throws FireBirdPlanException {
			tokenMatch.checkToken(FireBirdPlanToken.SORT);
	
		private String indexInfo(String index) throws FireBirdPlanException {
				if(tokenMatch.getToken() == FireBirdPlanToken.COMMA) {
					String indexes = collectIndexes();
	} *
					break;
class FireBirdPlanParser {
			try {
			tokenMatch.jump();
						tokenMatch.jump();
						text = text + " INDEX(" + orderIndexes + ")";
			tokenMatch.checkToken(FireBirdPlanToken.LEFTPARENTHESE);
		
			switch (tokenMatch.token) {
	            }

					tokenMatch.jump();
			tokenMatch.jump();
			do {
				node = addPlanNode(parent, "SORT MERGE");
					mergedItem(parent, true);
 *
	                dbStat.setString(1, index);
	                    sb.delete(sb.length() - 2, sb.length());
	                    	sb.append(", ");
		
 *
				tokenMatch.jump();
			
					tokenMatch.checkToken(FireBirdPlanToken.RIGHTPARENTHESE);
				planItem(node);
	
	<sorted-item> ::=  SORT (<plan-item>)
			}
			FireBirdPlanNode node = addPlanNode(null, plan);
		
	                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
		private void planItem(FireBirdPlanNode parent) throws FireBirdPlanException {
		
					break;
	                    	sb.append(String.format("%1$s[%2$f]", dbResult.getString(1).trim(), dbResult.getDouble(2)));
					String orderIndex = tokenMatch.getValue();
			sb.append("( ");
				tokenMatch.checkToken(FireBirdPlanToken.SORT_MERGE);
						
				default:
		private FireBirdPlanNode addPlanNode(FireBirdPlanNode parent, String text) {
					break;
				case ORDER:
			tokenMatch.jump();
				throw new FireBirdPlanException(index, e.getMessage());
			} while (tokenMatch.getToken() == FireBirdPlanToken.COMMA);
		
package org.jkiss.dbeaver.ext.firebird.model.plan;
		private void basicItem(FireBirdPlanNode parent) throws FireBirdPlanException {
				identifiers = identifiers + tokenMatch.getValue() + " ";
		}
			switch (tokenMatch.token) {
 * tokenizer and creates plan node tree. When index is found it's selectivity
			tokenMatch.checkToken(FireBirdPlanToken.PLAN);
	                }
			}
		}
	            } finally {
	                    | <sorted-item>
/**
	                dbStat.close();
					break;
		
				parent.getNested().add(node);
					if (tokenMatch.getToken() == FireBirdPlanToken.INDEX) {
			this.session = session;
		
	                    | <merged-item>
		}
	                    while (dbResult.next()) {

					tokenMatch.checkToken(FireBirdPlanToken.IDENTIFICATOR);
		
	<plan-expr> ::=  (<plan-item> [, <plan-item> ...])
		}
			return identifiers;
						planItem(parent);
		}
				indexes = indexes + tokenMatch.getValue() + indexInfo(tokenMatch.getValue());
			
 * Unless required by applicable law or agreed to in writing, software
				planItem(node);
			if (sorted) {
				case MERGE:
					addPlanNode(parent, aliases + " INDEX (" + indexes + ")");
			while (tokenMatch.getToken() == FireBirdPlanToken.IDENTIFICATOR) {
			planItem(node);
		private void joinedItem(FireBirdPlanNode parent) throws FireBirdPlanException {
				case NATURAL:
			String indexes = "";
	                     
			tokenMatch.checkToken(FireBirdPlanToken.LEFTPARENTHESE);
			} else {
 * Licensed under the Apache License, Version 2.0 (the "License");
			}
		private void sortedItem(FireBirdPlanNode parent) throws FireBirdPlanException {
 * is added to index plan node.
					mergedItem(parent, false);
			return node;
				default:
				tokenMatch.jump();
		private String collectIdentifiers() {
			} while (tokenMatch.getToken() == FireBirdPlanToken.COMMA);
				case SORT_MERGE:
