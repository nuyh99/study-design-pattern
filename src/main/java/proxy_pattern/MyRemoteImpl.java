package proxy_pattern;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    private static final Long serialVersionUID = 1L;

    public MyRemoteImpl() throws RemoteException {
        super(2000);
    }

    @Override
    public String sayHello() throws RemoteException{
        return "Server says, 'Hey'";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Registry registry = LocateRegistry.getRegistry(2000);
            registry.rebind("RemoteHello", service);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
