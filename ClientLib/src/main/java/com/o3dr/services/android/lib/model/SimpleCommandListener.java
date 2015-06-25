package com.o3dr.services.android.lib.model;

import android.os.RemoteException;

/**
 * Basic command listener implementation. Overrides the methods as needed to receive the command execution status
 * notification.
 * Created by Fredia Huya-Kouadio on 6/24/15.
 */
public class SimpleCommandListener extends ICommandListener.Stub {
    @Override
    public void onSuccess() throws RemoteException {

    }

    @Override
    public void onError(int executionError) throws RemoteException {

    }

    @Override
    public void onTimeout() throws RemoteException {

    }
}
