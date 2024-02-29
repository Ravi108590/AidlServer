package com.example.aidlserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class AdditionService extends Service {
    public AdditionService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d("Connection", "onBind: called");
        // TODO: Return the communication channel to the service.
        return ibinder;
    }
     IAdditionInterface.Stub ibinder = new IAdditionInterface.Stub() {
         @Override
         public int add(int firstNum, int secondNum) throws RemoteException {
             return firstNum + secondNum;
         }
     };
}