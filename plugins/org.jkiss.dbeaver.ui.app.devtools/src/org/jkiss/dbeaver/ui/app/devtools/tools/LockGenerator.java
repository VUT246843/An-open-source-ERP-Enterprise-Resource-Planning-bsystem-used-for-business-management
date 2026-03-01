		
						 
	public static final int MAX_LEVEL_ITEMS = 2;
 * limitations under the License.
									return;
									String prefix;
					}
				public void run() {

	public static final int MIN_CHAIN_SIZE = 2;

		}
import java.util.Properties;
	
					
package org.jkiss.dbeaver.ui.app.devtools.tools;
					 ResultSet r = null;
		ResultSet res = null;
			e.printStackTrace();
					
							 
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
	     	   stmt =  conn.prepareStatement("SELECT EXISTS (SELECT 1 FROM   information_schema.tables  WHERE  table_schema = current_schema AND    table_name = 'usr')");
						if (sessionCount >= MAX_SESSIONS) {
			 field++;
								 Connection c = null;
										s.setInt(1, sublock);
 *     http://www.apache.org/licenses/LICENSE-2.0
		   
 * DBeaver - Universal Database Manager
		
				   stmt.execute();
							} catch (InterruptedException e) {
			
									int pid = getPid(c);
		System.out.println("Sbmited "+sessionCount);
									e1.printStackTrace();
import java.util.concurrent.TimeUnit;
	
									System.out.println("Wait session for "+prefix);
				     	while(true){
		   int field = 1;
 * Licensed under the Apache License, Version 2.0 (the "License");
			
				     	c.setAutoCommit(false);
		  final Properties props = new Properties();
			sessionCount++;
				   stmt =  conn.prepareStatement("alter table usr add primary key (field)");
			   
						 
				     	s.executeUpdate();	
							}
						   final int levelNo = j;
						   
				   stmt.execute();
	public static final int MAX_CHAIN_SIZE = 4;
			if (res != null) res.close();
		  props.setProperty("user","");

								Thread.sleep(600 * 1000);
 *
									// TODO Auto-generated catch block
			if (stmt != null) stmt.close();
			res.next();
			   if (!res.getBoolean(1)){
 * distributed under the License is distributed on an "AS IS" BASIS,
		service.awaitTermination(1, TimeUnit.HOURS);

								 try {
 *
		   
								
		  
								break;
					
							public void run() {
									s =  c.prepareStatement("/*"+prefix + "*/ update usr set v = 100500 where field = ?");
				}
							     	c.close();
		
								} catch (SQLException e) {
								e.printStackTrace();
 */
				     	c.close();
					}
						 final int level = i;
							@Override
						   
				     	s.setInt(1, fieldVal);

 * Unless required by applicable law or agreed to in writing, software
						sessionCount++;   
			   res.next();
				     try {
										s.executeUpdate();
				
					 PreparedStatement s = null;
 * See the License for the specific language governing permissions and
										s =  c.prepareStatement("/*"+prefix + "*/ update usr set v = 100500 where field = ?");
								 ResultSet r = null;
import java.sql.*;

										System.out.println("Sublock for "+prefix);
				   System.out.println("Table not found");
						
			res = stmt.executeQuery();
		  props.setProperty("password","");
									} 
		} finally {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		   
						
import java.util.concurrent.ThreadLocalRandom;
				     	System.out.println("["+pid+"] Submited root session for "+String.valueOf(fieldVal));
									if (levelNo > 0) {
			   service.submit(new Runnable() {
		   
	     	   conn.setAutoCommit(false);
							}
					for(int i =0; i < chainCount;i++){
				     	String pid = String.valueOf(getPid(c));
								 PreparedStatement s = null;
		  ResultSet res = null;
				}
								}
	}
			 
		       conn = DriverManager.getConnection(url, props);
		  Connection conn = null;
						 if (sessionCount >= MAX_SESSIONS) {
								
	private static int getPid(Connection conn) throws SQLException {
						c = DriverManager.getConnection(url, props);
			
				@Override
					} catch (SQLException e) {
								}
		  try {
		   }

				int chainCount = ThreadLocalRandom.current().nextInt(MIN_CHAIN_SIZE ,MAX_CHAIN_SIZE + 1);
										int sublock = MAX_SESSIONS + (level * MAX_CHAIN_SIZE);
						}
						   service.submit(new Runnable() {
					 Connection c = null;
								} catch (InterruptedException e1) {
	}
						return;
public class LockGenerator {
		} catch (Exception e) {
			   final int fieldVal = field;
import java.util.concurrent.ExecutorService;
					
					}
				
	               System.out.println("Table created");
		   while(sessionCount < MAX_SESSIONS) {
		
			return res.getInt(1);
					
								try {								 
				   stmt =  conn.prepareStatement("create table usr(field INTEGER,v INTEGER, s VARCHAR)");
	               conn.commit();
							

			});
 * You may obtain a copy of the License at
		}
										prefix = String.format("[%d] Sublock %d for %d -> %d (%d) ",pid,sublock,fieldVal,level,levelNo);
							}
									c = DriverManager.getConnection(url, props);
			   res = stmt.executeQuery();
		   

				     		try {
		  final String url = "jdbc:postgresql://localhost/postgres";
			   }
		   int sessionCount=0;
		
}
		
								break;
	public static void main(String[] args) {

		  
			
									s.setInt(1, fieldVal);
			
							     	s.executeUpdate();
		service.shutdown();
			
						
			
	
	
							break;
							     	c.setAutoCommit(false);
									prefix = String.format("[%d] %d->%d (%d) ",pid, fieldVal,level,levelNo);																									     	
									Thread.sleep(5000);
						e.printStackTrace();
			
						 int levelCount = ThreadLocalRandom.current().nextInt(1 ,MAX_LEVEL_ITEMS + 1);

				   stmt.execute();
			stmt =  conn.prepareStatement("SELECT pg_backend_pid()");
import java.util.concurrent.Executors;
 * you may not use this file except in compliance with the License.
		try {
			if ((MAX_SESSIONS - sessionCount) > MIN_CHAIN_SIZE) { 
	public static final int MAX_SESSIONS=79;
				     	}
		   ExecutorService service = Executors.newFixedThreadPool(MAX_SESSIONS);
		  PreparedStatement stmt = null;
				     	s =  c.prepareStatement("/*ROOT "+String.valueOf(fieldVal)+" */ update usr set v = 100500 where field = ?");
									e.printStackTrace();
								
		PreparedStatement stmt = null;
			}
						});
/*
				if ((MAX_SESSIONS - sessionCount) >= chainCount) {
				   stmt =  conn.prepareStatement("insert into usr(field,s) SELECT b,(SELECT string_agg(x, '')FROM (SELECT chr(ascii('A') + (random() * 25)::integer) FROM generate_series(1, 1024 + b * 0)) AS y(x)) s FROM generate_series(1,10000) as a(b)");
			   
						 for(int j = 0; j < levelCount;j++) { 
