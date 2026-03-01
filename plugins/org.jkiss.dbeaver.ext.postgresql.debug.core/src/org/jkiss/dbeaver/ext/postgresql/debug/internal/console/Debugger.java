                if (argcV.length() > 0) {
        }
                System.out.println("Breakpoint added");
            case COMMAND_BREAKPOINT_LIST:

                if (controller.getSessions().size() == 0) {
            case COMMAND_INTO:
                        if (varId == 0) {
                            v = vars.get(varId - 1);
                for (DBGSession s : controller.getSessions()) {
        if (sessions.size() == 1) {




            while (sessionId < 0) {
            for (DBGBreakpointDescriptor b : bps) {
                }
                }
                String argcV = sc.nextLine();

                    System.out.println(s.toString());
                            if (argc.length() > 0) {

    public static final String COMMAND_OBJ = "D";
                    System.out.println("Debug sessions not found");
            v = vars.get(0);
            case COMMAND_BREAKPOINT_REMOVE:
                    break;
                    strBpid = scArg.next();
                }


                    objId = Integer.valueOf(strObjId.trim());

                DBGSession debugSessionSL = chooseSession(sc, controller);
        Connection conn;
        } else {
                debugSession.addBreakpoint(new VoidProgressMonitor(), descriptor);
                System.out.println("Q List debug session(s)");

                }
                            if (arg.length() > 0) {
                    System.out.println("created");
                }
            throws DBGException {
                DBGSession debugSessionSC = chooseSession(sc, controller);
                            bpId = Integer.valueOf(strBpid);
                System.out.println(String.format(" (%d) %s", bpNo++, b.toString()));
    public static final String COMMAND_NEW = "N";

            int sessNo = 1;
    }
                break;
                scArg = new Scanner(argc);

                }
        Scanner sc = new Scanner(System.in);

                debugSessionC.closeSession(new VoidProgressMonitor());
                }

                }
    public static final String COMMAND_CONTINUE = "C";
                System.out.println(String.format(" (%d) %s", sessNo++, s.toString()));

            case COMMAND_NEW:
                if (controller.getSessions().size() == 0) {

    public static void main(String[] args) throws DBGException {


                    if (scArg.hasNext()) {
                            debugSession = sessions.get(sessionId - 1);
                    break;
            default:
                                strLineNo = argc;
        while (true) {
                try {
                if (strLineNo.trim().length() > 0) {
                break;

            System.out.println("Choose debug session (0 for quit) :");
        DBGBreakpointDescriptor bp = null;
                debugSessionSC.execContinue();
                        break;
                    break;
                    }


                            argc = scArg.nextLine();
                System.out.println("FRAME!!!");



    public static final String COMMAND_BREAKPOINT_LIST = "L";
                }
                    System.out.println("Debug sessions not found");
                }
        }


        List<? extends DBGVariable<?>> vars = session.getVariables(null);
                debugSessionBR.removeBreakpoint(new VoidProgressMonitor(), bpr);

        }
                break;

    public static final String COMMAND_DEBUG_LIST = "Q";
                for (DBGVariable<?> v : vars) {


                            bp = bps.get(bpId - 1);
        Scanner scArg;
                if (debugSessionVS == null) {

                    strvarid = scArg.next();
                        } else {
                }
                if (stack.size() == 0) {




                PostgreDebugBreakpointDescriptor descriptor = lineNo > 0
                        if (bpId == 0) {



                    break;
                scArg.close();

                    break;
                }
                        if (sessionId == 0) {
                System.out.println("F Frame");
                if (debugSessionBL == null) {

                if (debugSessionC == null) {
                        }
                }
                if (scArg.hasNext()) {

 * You may obtain a copy of the License at
        return v;
                            varId = Integer.valueOf(strvarid);

                    } catch (Exception e) {
        // TODO: fix connection
        DBPDataSourceContainer dataSource = null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return bp;
                    scArg = new Scanner(argcV);
            case COMMAND_ATTACH:


                        } catch (Exception e) {
    public static DBGVariable<?> chooseVariable(Scanner sc, DBGController controller, DBGSession session)
        List<? extends DBGBreakpointDescriptor> bps = session.getBreakpoints();

                System.out.println("O Step over");
            int bpNo = 1;
                            sessionId = -1;
                        strObjId = scArg.next();
                if (debugSessionSL == null) {
                        if (scArg.hasNext()) {


                System.out.println("N New session");
/*


                    break;

                }

    }

                            break;
            case COMMAND_FRAME:
                }
                    scArg = new Scanner(arg);
                    break;
            debugSession = sessions.get(0);
        Scanner scArg;
            case COMMAND_STACK:

                DBGSession debugSessionVL = chooseSession(sc, controller);

 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");

                        System.out.println(String.format("Incorrect line number '%s'", strLineNo));
                scArg = new Scanner(argc);
                debugSessionVS.setVariableVal(var, strVal);
                            sessionId = -1;
        }

        controller = new PostgreDebugController(dataSource, new HashMap<>());

                // FIXME:AF: Andrew, please migrate to

                }



                if (controller.getSessions().size() == 0) {

                DBGSession debugSessionA = chooseSession(sc, controller);
            System.out.println("Choose breakpoint (0 for quit) :");
                    }

                    if (strvarid.trim().length() > 0) {
 *
                }
                scArg.close();
                    try {
                System.out.println("E Exit debugger");

            case COMMAND_DEBUG_LIST:
                    scArg.close();

                            bpId = -1;
 * Copyright (C) 2017-2018 Andrew Khitrin (ahitrin@gmail.com)


                System.out.println("L List breakpoint(s)");
                }
                return;
                        }
                break;
                String strObjId = ANY_ARG;
                int lineNo = -1;
                System.out.println("R Remove breakpoint");
                scArg.close();

                    System.out.println("Debug sessions not found");
            int varId = -1;
                    break;

                        lineNo = Integer.valueOf(strLineNo.trim());

                if (debugSessionA == null) {




                // debugSessionA.attach(false);
                    break;
                break;
    public static final String COMMAND_VARIABLES = "V";

                System.out.println("Breakpoint removed ...");
            for (DBGVariable<?> cv : vars) {



        if (vars.size() == 1) {

            }
                if (controller.getSessions().size() == 0) {
                System.out.println("= Set Variables");
 * See the License for the specific language governing permissions and
                break;
                if (argc.length() > 0) {
            switch (command.toUpperCase()) {
                    break;
                        }
                    break;

                System.out.println("Step Into ...");
                }
        DBGSession debugSession = null;

        List<DBGSession> sessions = controller.getSessions();
    public static final String COMMAND_BREAKPOINT = "B";
}
                            }
                if (controller.getSessions().size() == 0) {
                break;


                            System.out.println(String.format("Incorrect session ID %s", strSessionid));
                }
                String argc = sc.nextLine();
                if (debugSessionVL == null) {
                }
                String proc = ANY_ARG;
                }
                }

                        } catch (Exception e) {

                if (controller.getSessions().size() == 0) {
                if (debugSessionBL.getBreakpoints().size() == 0) {



                    System.out.println("No breakpoints defined");
                        }

                        }
            case COMMAND_VARIABLE_SET:
                break;
                    scArg.close();
                        } else {
                }



                        }
            while (bpId < 0) {
                    System.out.println(s);
                for (DBGStackFrame s : stack) {
                            bpId = -1;
    public static final String COMMAND_SESSIONS = "W";
                break;
 * DBeaver - Universal Database Manager
                System.out.println("C Continue execution");
                String strSessionid = "";
                    if (strBpid.trim().length() > 0) {
                        } else {
public class Debugger {

                    System.out.println("No vars defined");
        String command;

                            arg = scArg.nextLine();
    public static final String COMMAND_CLOSE = "X";
    public static final String ANY_ARG = "*";



                    break;


            case COMMAND_SESSIONS:

                    break;

                }
 * you may not use this file except in compliance with the License.


                List<? extends DBGStackFrame> stack = debugSessionSL.getStack();
                    scArg = new Scanner(argc);
                }
                        try {
                String argc = sc.nextLine();



                break;
    public static final String COMMAND_FRAME = "F";
        Scanner scArg;
                        if (varId > vars.size()) {
                break;
                    scArg.close();
                }
                    break;
                }
            }
                        strVal = scArg.next();
                            break;
                    DBGSession s = controller.createSession(new VoidProgressMonitor(), new HashMap<>());

                Integer objId = -1;




                break;
                String strVal = "";

                    System.out.println("no debug sessions");

 * Unless required by applicable law or agreed to in writing, software
                DBGSession debugSessionVS = chooseSession(sc, controller);
                }
                debugSessionSO.execStepOver();
                    }
                    }
                break;
 *
                            break;


                    System.out.println("Debug sessions not found");
        String url = "jdbc:postgresql://192.168.229.133/postgres?user=postgres&password=postgres&ssl=false"; // "jdbc:postgresql://localhost/postgres?user=postgres&password=postgres&ssl=false";
        DBGVariable<?> v = null;

                }

            throws DBGException {
                        if (sessionId > sessions.size()) {
                if (scArg.hasNext()) {
                String strvarid = "";

    public static final String PROMPT = ">";
                System.out.println(String.format("Unnown command '%s' for command list type ?", command));

                        }
            e.printStackTrace();
                scArg = new Scanner(argc);


                            sessionId = Integer.valueOf(strSessionid);






                            System.out.println(String.format("Incorrect session ID %s", strBpid));
                if (var == null) {
            }
                        } catch (Exception e) {
                }

                System.out.println("B Set breakpoint");
                }
                    break;
                } catch (Exception e) {
                    if (scArg.hasNext()) {
                if (debugSession == null) {

                System.out.println("Waiting for target session ...");

                if (controller.getSessions().size() == 0) {
                } catch (SQLException e) {
            int bpId = -1;


                    break;
                String argc = sc.nextLine();



                if (debugSessionBR == null) {

                }
                    System.out.println("No breakpoints defined");
                    Connection debugConn = DriverManager.getConnection(url);
            }
                System.out.println(String.format("Variable Set %s", strVal));




                DBGSession debugSessionBR = chooseSession(sc, controller);
            return;


*/
                    e.printStackTrace();

                    System.out.println("Debug sessions not found");

 * distributed under the License is distributed on an "AS IS" BASIS,
/*


            }
    public static final String COMMAND_BREAKPOINT_REMOVE = "R";


                    DBCExecutionContext executionContext = null;
            }
                            System.out.println(String.format("Incorrect session ID %s", strSessionid));
                            break;

                System.out.println(String.format(" (%d) %s", varNo++, cv.toString()));
                }
    public static DBGSession chooseSession(Scanner sc, DBGBaseController controller) throws DBGException {

        return debugSession;
            case COMMAND_CONTINUE:


@SuppressWarnings("nls")
 */

                        try {
                if (debugSessionSO == null) {

    public static final String COMMAND_VARIABLE_SET = "=";

                if (debugSessionBR.getBreakpoints().size() == 0) {


                        if (bpId > bps.size()) {

                    }
 *
                    System.out.println(String.format("Incorrect object ID '%s'", strObjId));

                for (DBGBreakpointDescriptor bpl : debugSessionBL.getBreakpoints()) {

    public static final String COMMAND_OVER = "O";
        if (bps.size() == 1) {

        try {

                DBGSession debugSession = chooseSession(sc, controller);
            for (DBGSession s : sessions) {
            case COMMAND_TERMINATE:
                    if (scArg.hasNext()) {
                break;
                System.out.println("Step over ...");

                                owner = arg;
            while (varId < 0) {


        } else {
                String owner = ANY_ARG;
                System.out.println("? This help");
                }

                }
                DBGBreakpointDescriptor bpr = chooseBreakpoint(sc, controller, debugSessionBR);
                if (controller.getSessions().size() == 0) {
                if (controller.getSessions().size() == 0) {
                if (debugSessionSC == null) {
            case COMMAND_CLOSE:
                }

                if (vars.size() == 0) {
                            varId = -1;
                    break;
                DBGSession debugSessionSI = chooseSession(sc, controller);


            System.out.print(PROMPT);
            command = sc.next();


                String argc = sc.nextLine();

                    System.out.println("Debug sessions not found");
                    break;
        } else {
    public static final String COMMAND_INTO = "I";
    }




            bp = bps.get(0);
                    System.out.println("Debug sessions not found");
                break;

                String strBpid = "";
    public static final String COMMAND_HELP = "?";
            conn = DriverManager.getConnection(url);
                    }

    public static final String COMMAND_STACK = "S";
            case COMMAND_BREAKPOINT:
                System.out.println("EXIT.....");

                    break;
                }
            System.out.println("Choose variable (0 for quit) :");
                }
                    }
                System.out.println("I Step into");



    public static DBGBreakpointDescriptor chooseBreakpoint(Scanner sc, DBGController controller, DBGSession session)
                DBGSession debugSessionSO = chooseSession(sc, controller);
                debugSessionSI.execStepInto();



            int sessionId = -1;
                }

                    break;





                    break;
                            break;
                            System.out.println(String.format("Incorrect var ID %s", strvarid));

                        ? new PostgreDebugBreakpointDescriptor(1, lineNo, true)
                        proc = scArg.next();
                System.out.println("X Close session");
                System.out.println("V Variables");

                        if (scArg.hasNext()) {

                if (debugSessionSI == null) {

                    break;

                try {

                System.out.println("T Abort session");
                if (arg.length() > 0) {
                System.out.println("W Show sessions");
                }

            case COMMAND_OBJ:
                DBGSession debugSessionC = chooseSession(sc, controller);


    public static final String COMMAND_ATTACH = "A";

            case COMMAND_HELP:

                        }
                    // TODO: fix connection

                            varId = -1;
        Scanner scArg;


                break;

                List<? extends DBGVariable<?>> vars = debugSessionVL.getVariables(null);
                // attach(JDBCExecutionContext connection,int OID,int targetPID)
                    System.out.println(s);
                    System.out.println("Debug sessions not found");

                    System.out.println("No stack defined");
        DBGBaseController controller;
                break;
                            }
            case COMMAND_OVER:
                    break;

                    System.out.println("Debug sessions not found");
                if (controller.getSessions().size() == 0) {
                if (controller.getSessions().size() == 0) {
                    break;

                DBGSession debugSessionBL = chooseSession(sc, controller);
                    System.out.println(bpl.toString());

                            System.out.println(String.format("Incorrect breakpoint ID %s", strBpid));
                    System.out.println("Debug sessions not found");



                System.out.println("S Stack");
        } catch (SQLException e) {

                System.out.println("D Show debug objects");
            }

                    if (strSessionid.trim().length() > 0) {
                System.out.println("Continue ...");
                            break;
                break;



                    System.out.println(v.toString());
                String arg = sc.nextLine();


                    break;
            int varNo = 1;
                // API
 * limitations under the License.

                DBGVariable<?> var = chooseVariable(sc, controller, debugSessionVS);




                System.out.println(descriptor.toString());
                if (scArg.hasNext()) {
                System.out.println("Session closed");
                String strLineNo = ANY_ARG;
                    strSessionid = scArg.next();

                    System.out.println("Debug sessions not found");
                        : new PostgreDebugBreakpointDescriptor(1, true);
    public static final String COMMAND_TERMINATE = "E";
                    break;
                if (controller.getSessions().size() == 0) {

                        try {
            case COMMAND_VARIABLES:
                        }
package org.jkiss.dbeaver.ext.postgresql.debug.internal.console;

                            System.out.println(String.format("Incorrect var ID %s", strvarid));
        }
                        }
                        }
    }
