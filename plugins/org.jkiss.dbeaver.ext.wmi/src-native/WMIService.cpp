{
		}
		return;
    if (FAILED(hres)) {
	HRESULT hres = ptrWbemServices->OpenNamespace(nsName, lFlags, NULL, &ptrNamespace, NULL);
	if (logObject != NULL) {
	}
	if (javaSinkObject == NULL) {
        lFlags,
	_ASSERT(logObject != NULL);
	DeleteLocalRef(pJavaEnv, objectClass);
		return NULL;

 * Method:    connect
	if (ptrWbemServices == NULL) {

#endif

		return NULL;
		THROW_COMMON_EXCEPTION(L"WMI Service is not initialized");


    if (FAILED(hres)) {
		(LPVOID *) &ptrWbemLocator);
WMIService::WMIService(JNIEnv* pJavaEnv, jobject javaObject)
	CComPtr<IWbemObjectSink> pActiveSink;
			pJavaEnv->GetJavaVM(&pJavaVM);
		return NULL;
	}
	MakeObjectSink(pJavaEnv, javaSinkObject, &pActiveSink);
{

		}
jobject WMIService::OpenNamespace(JNIEnv* pJavaEnv, LPWSTR nsName, LONG lFlags)
	_RPTW1(_CRT_WARN, L"%s\n", wcMessage);
void WMIService::CancelAsyncOperation(JNIEnv* pJavaEnv, jobject javaSinkObject)
	JNIEnv* pJavaEnv,
	if (domain != NULL) {
    //IEnumWbemClassObject* pEnumerator = NULL;
			resourceURI.Append(host);
		password,		// User password
}
	if (ptrWbemServices == NULL) {
	return false;
    HRESULT hres = CoCreateInstance(
		return;
    // Set security levels on a WMI connection ------------------
		RPC_C_AUTHN_WINNT,           // RPC_C_AUTHN_xxx
	if (pLocalEnv->ExceptionCheck()) {
	{
		return;
#include "stdafx.h"
    if (FAILED(hres)) {
	{
			(*i)->GetJavaSinkObject());
			   pSink,
			DeleteLocalRef(pLocalEnv, jMessage);
		THROW_COMMON_EXCEPTION(L"WMI Locator was already initialized");
		THROW_COMMON_ERROR(L"Failed to create IWbemLocator object", hres);
		return;
		ptrNamespace,				 // Indicates the proxy to set
}
	LPWSTR host, 
}
        THROW_COMMON_ERROR(L"Failed to connect to WMI Service", hres);

				wcMessage = errorMessage;
}
	JNIMetaData& jniMeta = JNIMetaData::GetMetaData(pJavaEnv);
	//WriteLog(pJavaEnv, LT_DEBUG, L"WMI Service closed");

	ObjectSinkVector::iterator i = std::find(sinkList.begin(), sinkList.end(), pSink);
		EOAC_NONE                    // proxy capabilities 
        queryString,
	sinkList.push_back(pSink);
		}
	if (FAILED(hres)) {
		}
    }
	csSinkThreads.Term();
{
	//WriteLog(pJavaEnv, LT_DEBUG, bstr_t("WMI Service connected to ") + (LPCWSTR)resource);
	if (ptrWbemServices == NULL) {
		case LT_INFO: cLogMethodName = "info"; break;
		// Get log method
bool WMIService::RemoveObjectSink(JNIEnv* pJavaEnv, WMIObjectSink* pSink)

    // Use the IWbemServices pointer to make requests of WMI ----
	HRESULT hres = ptrWbemServices->CreateInstanceEnumAsync(
	if (serviceJavaObject != NULL) {
void WMIService::Connect(
			resourceURI.Append(L".");
{
	HRESULT hres = ptrWbemServices->CreateClassEnumAsync(
	if (ptrWbemServices == NULL) {
		sinkList.erase(i);
{
		NULL,                        // client identity
#include "WMIObject.h"
void WMIService::EnumInstances(JNIEnv* pJavaEnv, LPWSTR className, jobject javaSinkObject, LONG lFlags)
    hres = CoSetProxyBlanket(

		}
			if (FAILED(hr)) {
				FormatErrorMessage(wcMessage, hr, &errorMessage);
	jobject newServiceObject = pJavaEnv->NewObject(jniMeta.wmiServiceClass, jniMeta.wmiServiceConstructor);
			_ASSERT(pJavaVM != NULL);
	_ASSERT(fid != NULL);
			javaSinkObject, 
		NULL,                        // Server principal name 
			jstring jMessage = MakeJavaString(pLocalEnv, wcMessage);
		jclass logClass = pLocalEnv->GetObjectClass(logObject);
		return NULL;
		return;
/*
/*

		} else {
		CLSID_WbemLocator,
		);
	JNIEnv* pThreadEnv;
 * Signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

	jobject logObject = pLocalEnv->GetObjectField(serviceJavaObject, jniMeta.wmiServiceLogField);

jobject WMIService::MakeWMIObject(JNIEnv* pJavaEnv, IWbemClassObject *pClassObject)
{
			}
		DeleteLocalRef(pLocalEnv, logClass);
        &ptrWbemServices                  // IWbemServices proxy
	LPWSTR locale,
		user,				// User name
}
		THROW_COMMON_EXCEPTION(L"Can't find internal sink for specified object");
}

public:
			if (pStubUnk != NULL) {
	CComPtr<IWbemObjectSink> pSecuredSink;
		serviceJavaObject = NULL;
        resourceURI,
	CComBSTR resourceURI;
}
    }

	serviceJavaObject = pJavaEnv->NewGlobalRef(javaObject);
typedef std::vector< WMIThreadInfo* > ThreadInfoVector;

{
        lFlags,

	WMIObjectSink* pSink = NULL;
	pSink->InitSink(this, pJavaEnv, javaSinkObject);
	CComBSTR resourceDomain;
}

#ifdef DEBUG
		return;
	}
	CComPtr<IWbemObjectSink> pActiveSink;
	// Create instance
		DeleteLocalRef(pLocalEnv, logObject);
{
	}
    }
    // Step 3: ---------------------------------------------------
        0,                              // Context object


{
		pActiveSink);
		);
	_ASSERT(javaSinkObject != NULL);
}
//static ThreadInfoVector threadInfos;
	}
	// Remove any exceptions occured in this method
        resourceDomain,					// Authority
        THROW_COMMON_ERROR(L"Can't execute query", hres);
	}
    }
			pUnsecApp->CreateObjectStub(


	csSinkThreads.Init();
	if (!pJavaEnv->ExceptionCheck()) {
	lFlags |= WBEM_FLAG_DIRECT_READ;
}

			(void**)&pUnsecApp);
	}
	jobject pWmiObject = pJavaEnv->NewObject(jniMeta.wmiObjectClass, jniMeta.wmiObjectConstructor);
        NULL,
    // Obtain the initial locator to WMI -------------------------
 */
void WMIService::InitStaticState()
void WMIService::MakeObjectSink(JNIEnv* pJavaEnv, jobject javaSinkObject, IWbemObjectSink** ppSink)
		return;
		resourceDomain.Append(L"NTLMDOMAIN:");
	}
		return pWmiObject;

		*ppSink = pSink.Detach();
{
	if (fid == NULL) {
#include "WMIService.h"
{
		resourceURI.Append(resource);
		locale == NULL ? L"MS_409" : locale,	// Locale
	}
	} else {
	hres = ptrWbemLocator->ConnectServer(
		CComPtr<IUnsecuredApartment> pUnsecApp;
		*ppSink = pSecuredSink.Detach();

		case LT_FATAL: cLogMethodName = "fatal"; break;


        baseClass,
	switch (logType) {
		EOAC_NONE                    // proxy capabilities 
		return;
    if (this->ptrWbemServices != NULL) {
		return;
		pJavaEnv->DeleteGlobalRef(serviceJavaObject);
				if (pSecuredSink != NULL) {
	
		RPC_C_IMP_LEVEL_IMPERSONATE, // RPC_C_IMP_LEVEL_xxx
	LPWSTR user, 
		THROW_COMMON_EXCEPTION(L"WMI Service is not initialized");
	ObjectSinkVector sinks;
	WMIService* pServiceHandler = new WMIService(pJavaEnv, newServiceObject);
    if (FAILED(hres)) {
			return;
	//WriteLog(pJavaEnv, LT_DEBUG, bstr_t("Connected to WMI namespace ") + nsName);
			CComBSTR errorMessage;
void WMIService::EnumClasses(JNIEnv* pJavaEnv, LPWSTR baseClass, jobject javaSinkObject, LONG lFlags)
#include "WMIObjectSink.h"
		if (resource[0] != '\\') {

void WMIService::Release(JNIEnv* pJavaEnv)
					//this->WriteLog(pJavaEnv, LT_DEBUG, L"Using unsecured appartments for async queries");
	}
    }
	}
void WMIService::WriteLog(JNIEnv* pLocalEnv, LogType logType, LPCWSTR wcMessage, HRESULT hr)
				}
	if (i != sinkList.end()) {
			   &pStubUnk);

		CComCritSecLock<CComCriticalSection> guard(csSinkThreads);
		return;
	WMIObject* pObject = new WMIObject(pJavaEnv, pWmiObject, pClassObject);
	MakeObjectSink(pJavaEnv, javaSinkObject, &pActiveSink);
		THROW_COMMON_EXCEPTION(L"WMI Service is not initialized");
		pActiveSink);
		case LT_DEBUG: cLogMethodName = "debug"; break;

			JNIMetaData::GetMetaData(pJavaEnv).javaLangObjectEqualsMethod, 
    if (FAILED(hres)) {
	const char* cLogMethodName = "debug";
			CLSCTX_LOCAL_SERVER, IID_IUnsecuredApartment, 
		THROW_COMMON_EXCEPTION(L"Empty query specified");

void WMIService::ExecuteQueryAsync(JNIEnv* pJavaEnv, LPWSTR queryString, jobject javaSinkObject, LONG lFlags)
	}
{
			resourceURI.Append(L"\\");
    }
	for (ObjectSinkVector::iterator i = sinkList.begin(); i != sinkList.end(); i++) {
	if (pSecuredSink != NULL) {
		RPC_C_IMP_LEVEL_IMPERSONATE, // RPC_C_IMP_LEVEL_xxx
        0, 
	HRESULT hres = ptrWbemServices->CancelAsyncCall(pSink);
{
WMIService* WMIService::GetFromObject(JNIEnv* pJavaEnv, jobject javaObject)
    hres = CoSetProxyBlanket(
// WMISensor.cpp : Defines the entry point for the DLL application.
		NULL,                        // Server principal name 
	if (pWmiObject == NULL) {
        THROW_COMMON_ERROR(L"Can't set proxy blanket", hres);
		if (pJavaVM == NULL) {
			pLocalEnv->CallVoidMethod(logObject, logMethodID, jMessage);
	//this->WriteLog(pJavaEnv, LT_DEBUG, bstr_t(L"Async WQL: ") + queryString);
        className,
		resourceURI.Append(L"\\\\");
	DWORD nThreadId;
}
	jclass objectClass = pJavaEnv->GetObjectClass(javaObject);
		_ASSERT(logMethodID != NULL);
		return;
		pLocalEnv->ExceptionClear();
        THROW_COMMON_ERROR(L"Can't set proxy blanket for opened namespace", hres);
{
        //CLSID_WbemAdministrativeLocator,
		return true;
		default: 
	LPWSTR password,


        lFlags, 
	jfieldID fid = pJavaEnv->GetFieldID(objectClass, "serviceHandle", "J");
	}
		jboolean bEquals = pJavaEnv->CallBooleanMethod(
				pStubUnk.QueryInterface(&pSecuredSink);
	}
		jmethodID logMethodID = pLocalEnv->GetMethodID(logClass, cLogMethodName, "(Ljava/lang/Object;)V");
		RPC_C_AUTHN_LEVEL_CALL,      // RPC_C_AUTHN_LEVEL_xxx 

{
	}
		return NULL;
		return;
	JNIMetaData& jniMeta = JNIMetaData::GetMetaData(pJavaEnv);

	}
		return;
	}
		resourceDomain.Append(domain);
        IID_IWbemLocator, 
	CComPtr<IWbemLocator> ptrWbemLocator;
	return newServiceObject;

}
		RPC_C_AUTHZ_NONE,            // RPC_C_AUTHZ_xxx
			pSink = (*i);
	if (pJavaEnv->ExceptionCheck()) {
}

	} else {
        );
		return NULL;

	if (queryString == NULL) {

		HRESULT hr = CoCreateInstance(CLSID_UnsecuredApartment, NULL, 
		if (host != NULL) {
{
JavaVM* WMIService::pJavaVM = NULL;
        NULL,
		THROW_COMMON_ERROR(L"Can't open namespace", hres);
			// Unsuported log type

		pJavaEnv->SetLongField(serviceJavaObject, JNIMetaData::GetMetaData(pJavaEnv).wmiServiceHandleField, 0);
		RPC_C_AUTHN_WINNT,           // RPC_C_AUTHN_xxx
	if (resource != NULL) {
        L"WQL",
        THROW_COMMON_ERROR(L"Can't create classes enumerator", hres);
	CComPtr<IWbemServices> ptrNamespace;
			CComPtr<IUnknown> pStubUnk;
	}

		case LT_ERROR: cLogMethodName = "error"; break;
		RPC_C_AUTHN_LEVEL_CALL,      // RPC_C_AUTHN_LEVEL_xxx 
		THROW_COMMON_EXCEPTION(L"NULL sink object specified");
    if (FAILED(hres)) {
	}

#define FIELD_NAME_SERVICE_HANDLE ("serviceHandle")
		if (logMethodID != NULL) {
		DeleteLocalRef(pJavaEnv, pWmiObject);
		case LT_TRACE: cLogMethodName = "trace"; break;
//
		}
	//if (sendStatus) lFlags |= WBEM_FLAG_SEND_STATUS;

    if (FAILED(hres)) {
	CComPtr<WMIObjectSink> pSink = new CComObject<WMIObjectSink>();
        CLSCTX_INPROC_SERVER | CLSCTX_LOCAL_SERVER, 
	if (pJavaEnv->ExceptionCheck()) {
		pJavaEnv->SetLongField(serviceJavaObject, JNIMetaData::GetMetaData(pJavaEnv).wmiServiceHandleField, (jlong)this);
WMIService::~WMIService()
	if (pSink == NULL) {
	
		NULL,                        // client identity
	LPWSTR domain, 
}
}
		return;
		if (bEquals == JNI_TRUE) {
        NULL,
		RPC_C_AUTHZ_NONE,            // RPC_C_AUTHZ_xxx
void WMIService::TermStaticState()

	}
 * Class:     com_symantec_cas_ucf_sensors_wmi_service_WMIService

	// Make unsecured appartments for sink
	}

	//WriteLog(pJavaEnv, LT_DEBUG, L"Cancel async call");
#include "WMIUtils.h"
		pActiveSink);
	HRESULT hres = ptrWbemServices->ExecQueryAsync(
	pServiceHandler->ptrWbemServices = ptrNamespace;
	}
}
        THROW_COMMON_ERROR(L"Can't create classes enumerator", hres);
	}
class WMIThreadInfo {
	}
	LPWSTR resource)
	CComPtr<IWbemObjectSink> pActiveSink;
static CComCriticalSection csSinkThreads;
	JNIMetaData& jniMeta = JNIMetaData::GetMetaData(pLocalEnv);
		THROW_COMMON_EXCEPTION(L"WMI Service is not initialized");
	if (FAILED(hres)) {
	return (WMIService*)pJavaEnv->GetLongField(javaObject, fid);
    }
        NULL,                           // Security flags
	MakeObjectSink(pJavaEnv, javaSinkObject, &pActiveSink);
	}
		return;
	// Get log field
	ptrWbemServices = NULL;
		if (pUnsecApp != NULL) {
			}
	}
		ptrWbemServices,					// Indicates the proxy to set

};
*/
		THROW_COMMON_ERROR(L"`Can't cancel async call", hres);
	// Connect to server
