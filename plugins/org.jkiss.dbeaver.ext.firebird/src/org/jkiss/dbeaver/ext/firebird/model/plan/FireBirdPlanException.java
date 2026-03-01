 *
 * Licensed under the Apache License, Version 2.0 (the "License");
		return addPlanMark(

	public FireBirdPlanException(String unexpected, int position, String plan) {
        return sb.toString();
	
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
				position, plan);
	}
	/**
		sb.append(plan.substring(0, position - 1));
	private static String makeMessage(String expected, String actual, int position, String plan)
 */
 *
		sb.append("^^^");
	 */
class FireBirdPlanException extends Exception {
 * Manage raising exception with more context information.
 * @author tomashorak@post.cz
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
	public FireBirdPlanException(String expected, String actual, int position, String plan) {
				String.format("Error parsing plan - unexpected token %1$s at position %2$d", unexpected, position), 
		super(String.format("Error when getting info about %1$s index(%2$s)", index, info));
 * DBeaver - Universal Database Manager
	private static String addPlanMark(String message, int position, String plan)

		super(makeMessage(unexpected, position, plan));
	}
	
 * Copyright (C) 2010-2024 DBeaver Corp and others
	{
		super(makeMessage(expected, actual, position, plan));
 * Unless required by applicable law or agreed to in writing, software
	
}    
 *
	}
		sb.append("\n");
	 * FireBirdPlanException
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		sb.append(plan.substring(position));
 * limitations under the License.
	
	}
				position, plan);

 */
	}
	{
	}
 *
 * You may obtain a copy of the License at
	{
		return addPlanMark(
		StringBuilder sb = new StringBuilder(message);
	private static String makeMessage(String unexpected, int position, String plan)
	private static final long serialVersionUID = 1L;
				String.format("Error parsing plan - expected %1$s at position %2$d but got %3$s", expected, position, actual), 
 * distributed under the License is distributed on an "AS IS" BASIS,
	public FireBirdPlanException(String info, String index) {
	
package org.jkiss.dbeaver.ext.firebird.model.plan;
