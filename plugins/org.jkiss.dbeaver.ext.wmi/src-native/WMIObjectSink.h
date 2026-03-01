	WMIObjectSink();
#ifndef _WMI_OBJECT_SINK_H_
	//DWORD hThread;
DECLARE_NOT_AGGREGATABLE(WMIObjectSink)
#endifDECLARE_NO_REGISTRY()
#include "WMIService.h"
public:

	}
        long lFlags,

   COM_INTERFACE_ENTRY(IWbemObjectSink)
	public IWbemObjectSink

	virtual ~WMIObjectSink();
	{
	//JNIEnv* pThreadEnv;
    

		return javaSinkObject;
};
	void FlushObjectsCache(JNIEnv* pJavaEnv);

	WMIService* pService;
        BSTR strParam,


	void TermSink(JNIEnv* pJavaEnv);
        long lObjectCount,
class ATL_NO_VTABLE WMIObjectSink : 
DECLARE_PROTECT_FINAL_CONSTRUCT()
#define _WMI_OBJECT_SINK_H_
    virtual HRESULT STDMETHODCALLTYPE Indicate( 


END_COM_MAP()
	void InitSink(WMIService* pService, JNIEnv* pJavaEnv, jobject javaObject);
BEGIN_COM_MAP(WMIObjectSink)

    virtual HRESULT STDMETHODCALLTYPE SetStatus( 
	jobject GetJavaSinkObject()
        IWbemClassObject *pClassObject);
#pragma once

{
	public CComObjectRootEx<CComSingleThreadModel>,
	std::vector< CComPtr<IWbemClassObject> > objectsCache;
	jobject javaSinkObject;
private:
private:


	//JavaVM* pJavaVM;
        IWbemClassObject **ppClassObject);
        HRESULT hResult,
