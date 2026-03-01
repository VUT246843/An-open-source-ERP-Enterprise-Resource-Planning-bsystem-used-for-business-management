	void Release(JNIEnv* pJavaEnv);
		LPWSTR user, 


	jobject OpenNamespace(JNIEnv* pJavaEnv, LPWSTR nsName, LONG lFlags);
public:
		JNIEnv* pJavaEnv,
	LT_TRACE,
#include <jni.h>


		LPWSTR locale,
	// Private vars

	//void WriteLog(JNIEnv* pLocalEnv, LogType logType, LPCWSTR wcMessage, HRESULT hr = S_OK);
	static JavaVM* pJavaVM;
	void Connect(
	ObjectSinkVector sinkList;
enum LogType {



typedef std::vector< CComPtr<WMIObjectSink> > ObjectSinkVector;
		LPWSTR password,
	LT_DEBUG,
	static WMIService* GetFromObject(JNIEnv* pJavaEnv, jobject javaObject);

	void ExecuteQueryAsync(JNIEnv* pJavaEnv, LPWSTR query, jobject javaSinkObject, LONG lFlags);
	LT_FATAL,
	static jobject MakeWMIObject (JNIEnv* pJavaEnv, IWbemClassObject *pClassObject);
	WMIService(JNIEnv* pJavaEnv, jobject javaObject);

	CComPtr<IWbemServices> ptrWbemServices;
	void EnumInstances(JNIEnv* pJavaEnv, LPWSTR className, jobject javaSinkObject, LONG lFlags);
	static void InitStaticState();
	bool RemoveObjectSink(JNIEnv* pJavaEnv, WMIObjectSink* pSink);
};


	LT_WARN,
		LPWSTR host, 
		LPWSTR resource);

	LT_INFO,
		LPWSTR domain, 

};


#endif
	void MakeObjectSink(JNIEnv* pJavaEnv, jobject javaSinkObject, IWbemObjectSink** ppSink);
class WMIObjectSink;
	static JavaVM* GetJavaVM() { return pJavaVM; }

public:
class WMIService {

	//CComPtr<IWbemLocator> ptrWbemLocator;
#include <jni.h>
	//jobjectArray ExecuteQuery(JNIEnv* pJavaEnv, LPWSTR query, bool sync);
	static void TermStaticState();
private:
public:
#include "JNIMetaData.h"
	LT_ERROR,

#ifndef _WMI_Service
	jobject serviceJavaObject;
	void EnumClasses(JNIEnv* pJavaEnv, LPWSTR superClass, jobject javaSinkObject, LONG lFlags);
	void CancelAsyncOperation(JNIEnv* pJavaEnv, jobject javaSinkObject);
private:
	~WMIService();
#define _WMI_Service
