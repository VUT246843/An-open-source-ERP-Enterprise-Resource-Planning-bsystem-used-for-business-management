			NULL,                        // Authentication services
BOOL WINAPI DllMain(
		_Module.Term();
			EOAC_NONE,                   // Additional capabilities 
			return FALSE;
{

		hWMIUtils = ::LoadLibrary(L"wmiutils.dll");
			NULL                         // Reserved
		}
		hWbemCommon = ::LoadLibrary(L"wbemcomn.dll");
			hWMIUtils = NULL;
#include "WMIUtils.h"
			NULL,                        // Authentication info
		WMIService::TermStaticState();
		}
			);
			::printf("Failed to initialize security");
#include "WMIService.h"
	if (fdwReason == DLL_PROCESS_ATTACH) {
			::FreeLibrary(hWMIUtils);
  LPVOID lpvReserved)
		if (hWMIUtils != NULL) {
  DWORD fdwReason,
			RPC_C_IMP_LEVEL_IMPERSONATE, // Default Impersonation  
		{
		hres =  ::CoInitializeSecurity(
		WMIService::InitStaticState();
			return FALSE;


CComModule _Module;
		}
//
			-1,                          // COM authentication
  HINSTANCE hinstDLL,
			hWbemCommon = NULL;
	return TRUE;
		if (FAILED(hres))
#include "stdafx.h"


// WMISensor.cpp : Defines the entry point for the DLL application.
			RPC_C_AUTHN_LEVEL_DEFAULT,   // Default authentication 
END_OBJECT_MAP()
BEGIN_OBJECT_MAP(ObjectMap)
		// Term WMI service state

		if (FAILED(hres) && hres != RPC_E_TOO_LATE) {
		if (hWbemCommon != NULL) {
		HRESULT hres =  ::CoInitializeEx(0, COINIT_MULTITHREADED); 
			::printf("Failed to initialize COM library. Error code = %d", hres);
}
			NULL,                        // Reserved
		}
			::FreeLibrary(hWbemCommon);
		//JNIMetaData::Destroy();
		// Init WMI service state
		_Module.Init(ObjectMap, hinstDLL);
	} else if (fdwReason == DLL_PROCESS_DETACH) {


	}
		::CoUninitialize();
			NULL, 
