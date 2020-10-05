package BaiTapLon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class File<A>{
    
    public <A> void ghiFile(ArrayList listObj, String fname) throws FileNotFoundException, IOException{
        FileOutputStream fout = new FileOutputStream(fname);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(listObj);
        out.close();
        fout.close();
    }
    
    public ArrayList<A> docFile(String fname) throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<A> kq = new ArrayList<>();
        FileInputStream fin = new FileInputStream(fname);
        ObjectInputStream in = new ObjectInputStream(fin);
        kq = (ArrayList<A>)in.readObject();
        return kq;
    }
}
