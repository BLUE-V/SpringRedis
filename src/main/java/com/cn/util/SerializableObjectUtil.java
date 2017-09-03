package com.cn.util;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializableObjectUtil {
	public static byte[] serialize(Object obj) {  
	        byte[] bytes = null;  
	        try {  
	            // object to bytearray  
	            ByteArrayOutputStream bo = new ByteArrayOutputStream();  
	            ObjectOutputStream oo = new ObjectOutputStream(bo);  
	            oo.writeObject(obj);  
	      
	            bytes = bo.toByteArray();  
	      
	            bo.close();  
	            oo.close();  
	        } catch (Exception e) {  
	            System.out.println("translation" + e.getMessage());  
	            e.printStackTrace();  
	        }  
	        return bytes;  
	    } 
	public static Object unserialize(byte[] bytes) {
        Object obj = null;
        try {
            // bytearray to object
            ByteArrayInputStream bi = new ByteArrayInputStream(bytes);
            ObjectInputStream oi = new ObjectInputStream(bi);

            obj = oi.readObject();
            bi.close();
            oi.close();
        } catch (Exception e) {
            System.out.println("translation" + e.getMessage());
            e.printStackTrace();
        }
        return obj;
    }
}
