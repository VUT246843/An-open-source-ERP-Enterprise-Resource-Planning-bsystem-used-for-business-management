		  try {
	}
			

					
						return;
					 ResultSet r = null;
				     	}
 *
				     	String pid = String.valueOf(getPid(c));
				@Override
			
				}
		       conn = DriverManager.getConnection(url, props);
						e.printStackTrace();
		   ExecutorService service = Executors.newFixedThreadPool(MAX_SESSIONS);
				
 */
					 Connection c = null;
		   
						
								} catch (InterruptedException e1) {
	               conn.commit();
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
				return res.getInt(1);
									prefix = String.format("[%d] %d->%d (%d) ",pid, fieldVal,level,levelNo);																									     	
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
						   final int levelNo = j;
				public void run() {

import java.util.concurrent.Executors;
									s.setInt(1, fieldVal);
								 ResultSet r = null;

		   
		   while(sessionCount < MAX_SESSIONS) {
	public static final int MAX_LEVEL_ITEMS = 3;
									int pid = getPid(c);
								break;
								 Connection c = null;
			   service.submit(new Runnable() {
							}
import java.sql.*;
			sessionCount++;
			}
								e.printStackTrace();
 * Copyright (C) 2010-2025 DBeaver Corp and others
								} catch (SQLException e) {
				     	c.setAutoCommit(false);
				     	System.out.println("["+pid+"] Submited root session for "+String.valueOf(fieldVal));
				}
						 final int level = i;
				   stmt =  conn.prepareStatement("alter table usr add primary key (field)");

						}
									s =  c.prepareStatement("/*"+prefix + "*/ update usr set v = 100500 where field = ?");
							break;
					} catch (SQLException e) {
				if ((MAX_SESSIONS - sessionCount) >= chainCount) {
			e.printStackTrace();
				     try {
 *

			   if (res.getInt(1) != 1){
	public static void main(String[] args) {
}
									System.out.println("Wait session for "+prefix);
	
		service.awaitTermination(1, TimeUnit.HOURS);
		  final String url = "jdbc:oracle:thin:@[SERVER]:1521/[SID]";
										prefix = String.format("[%d] Sublock %d for %d -> %d (%d) ",pid,sublock,fieldVal,level,levelNo);
		service.shutdown();
				     	while(true){
						c = DriverManager.getConnection(url, props);
	
				   stmt =  conn.prepareStatement("insert into usr(field,s) select rownum r,DBMS_RANDOM.STRING('U',1024) from dual connect by rownum <= 10000");
										System.out.println("Sublock for "+prefix);
									e.printStackTrace();
								try {								 
					
import java.util.concurrent.TimeUnit;
						   
							     	c.close();
										s.setInt(1, sublock);
				int chainCount = ThreadLocalRandom.current().nextInt(MIN_CHAIN_SIZE ,MAX_CHAIN_SIZE + 1);
			try (ResultSet res = stmt.executeQuery()) {
				     	s =  c.prepareStatement("/*ROOT "+String.valueOf(fieldVal)+" */ update usr set v = 100500 where field = ?");

			}
							public void run() {

								 try {
				   stmt.execute();
		   int field = 1;

		  Connection conn = null;
package org.jkiss.dbeaver.ui.app.devtools.tools;
	     	   conn.setAutoCommit(false);
						 for(int j = 0; j < levelCount;j++) { 
				res.next();

	
							 
		  PreparedStatement stmt = null;
			   
	     	   stmt =  conn.prepareStatement("select count(*) c from dba_tables where table_name = 'USR' and owner = 'SCHEMA'");
										s =  c.prepareStatement("/*"+prefix + "*/ update usr set v = 100500 where field = ?");
		System.out.println("Sbmited "+sessionCount);
				   stmt =  conn.prepareStatement("create table usr(field NUMBER(11,0),v NUMBER(11,0), s VARCHAR2(1024))");
							}
								}
				   stmt.execute();
		} catch (Exception e) {
									// TODO Auto-generated catch block
									c = DriverManager.getConnection(url, props);
								break;
 * distributed under the License is distributed on an "AS IS" BASIS,
					 PreparedStatement s = null;
import java.util.concurrent.ExecutorService;
			 
						 int levelCount = ThreadLocalRandom.current().nextInt(1 ,MAX_LEVEL_ITEMS + 1);
						if (sessionCount >= MAX_SESSIONS) {
					
								
		  
					}
			if ((MAX_SESSIONS - sessionCount) > MIN_CHAIN_SIZE) { 
								
						   service.submit(new Runnable() {
	}
								
		   
						 
								 PreparedStatement s = null;
					
		  ResultSet res = null;
				     	c.close();
			   }
										s.executeUpdate();
				     	s.executeUpdate();	
									Thread.sleep(5000);
									return;
	               System.out.println("Table created");
		  props.setProperty("user","user");
							     	s.executeUpdate();
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
	
				   stmt.execute();
import java.util.Properties;
 * Licensed under the Apache License, Version 2.0 (the "License");
						sessionCount++;   
		  final Properties props = new Properties();
					for(int i =0; i < chainCount;i++){

			
	public static final int MIN_CHAIN_SIZE = 5;
						 
			
			   final int fieldVal = field;
					}
		   
				
public class LockGeneratorOracle {
						});
			 field++;
			});
									String prefix;
/*
 *
								Thread.sleep(600 * 1000);
							} catch (InterruptedException e) {
				   System.out.println("Table not found");
							     	c.setAutoCommit(false);
		}
						 if (sessionCount >= MAX_SESSIONS) {
		}

	public static final int MAX_CHAIN_SIZE = 10;
									} 
										int sublock = MAX_SESSIONS + (level * MAX_CHAIN_SIZE);
		   }
					
						   
				     	s.setInt(1, fieldVal);

 * Unless required by applicable law or agreed to in writing, software
							@Override
						
		  props.setProperty("password","pwd");
import java.util.concurrent.ThreadLocalRandom;
 * DBeaver - Universal Database Manager
			   res.next();
						
 * limitations under the License.
	private static int getPid(Connection conn) throws SQLException {
			   res = stmt.executeQuery();
			   
		   int sessionCount=0;
								}
							}
									e1.printStackTrace();
		try (PreparedStatement stmt = conn.prepareStatement("select sid from v$session where audsid = userenv('sessionid')")) {
				     		try {
		  
					}
		   
	public static final int MAX_SESSIONS=89;
									if (levelNo > 0) {
							
