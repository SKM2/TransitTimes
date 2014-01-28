package sws420.TransitTimes.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ServerProxyAsync {

	void getFromRemoteServer(final String serviceURL,
			AsyncCallback<String> callback);

	void postToRemoteServer(final String serviceURL,
			AsyncCallback<String> callback);
}
