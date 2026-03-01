#include <comdef.h>

#define WINVER 0x0501		// Change this to the appropriate value to target other versions of Windows.
#define _WIN32_DCOM


// are changed infrequently
#include <objbase.h>
// TODO: reference additional headers your program requires here
// Windows Header Files:

#pragma once
#define _ATL_CSTRING_EXPLICIT_CONSTRUCTORS	// some CString constructors will be explicit
#ifndef _WIN32_WINNT		// Allow use of features specific to Windows XP or later.                   
#include <Wbemidl.h>
#endif
#include <algorithm>
// or project specific include files that are used frequently, but


#include <atlstr.h>

#ifndef _WIN32_WINDOWS		// Allow use of features specific to Windows 98 or later.
#include <atlsafe.h>
//#include <iostream>
#define WIN32_LEAN_AND_MEAN		// Exclude rarely-used stuff from Windows headers

#include <atlcomcli.h>

#include <wincred.h>
#define _WIN32_IE 0x0600	// Change this to the appropriate value to target other versions of IE.

#define _WIN32_WINNT 0x0501	// Change this to the appropriate value to target other versions of Windows.
#include <windows.h>


#ifndef _WIN32_IE			// Allow use of features specific to IE 6.0 or later.
#include <vector>
#endif						

#define _WIN32_WINDOWS 0x0410 // Change this to the appropriate value to target Windows Me or later.
# pragma comment(lib, "credui.lib")
#ifndef WINVER				// Allow use of features specific to Windows XP or later.
#endif
// stdafx.h : include file for standard system include files,
extern CComModule _Module;
// Modify the following defines if you have to target a platform prior to the ones specified below.
#include <crtdbg.h>
# pragma comment(lib, "wbemuuid.lib")
// Refer to MSDN for the latest info on corresponding values for different platforms.
#endif

#include <atlcom.h>
//
#include <atlbase.h>
//# pragma comment(lib, "Framedyd.lib")
#include <Wbemtime.h>


