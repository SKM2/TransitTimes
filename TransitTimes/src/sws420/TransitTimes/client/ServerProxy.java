package sws420.TransitTimes.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("serverproxy")
public interface ServerProxy  extends RemoteService{

	public String getFromRemoteServer(final String serviceURL);
	//throws ServerProxyException;
	
	public String postToRemoteServer(final String serviceURL);
	//throws ServerProxyException;
}
