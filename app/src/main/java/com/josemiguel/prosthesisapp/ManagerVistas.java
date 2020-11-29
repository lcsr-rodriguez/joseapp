
package com.josemiguel.prosthesisapp;


public class ManagerVistas {


    public static String encriptar(String cadena)
    {
        String retornar = "";
        int i = 0;
        for(i = 0; i < cadena.length(); i++)
            retornar = (new StringBuilder()).append(retornar).append(cadena.charAt(i) - 13).toString();

        return retornar;
    }


//    public static ArrayList<Clientes> listaclientesucursal(ArrayList<Clientes> clientes){
//        ArrayList<Clientes> newclientes = new ArrayList<Clientes>();
//        for(int i=0;i<clientes.size();i++){
//            if(clientes.get(i).getIdsucursal().equals(LoginActivity.idsucursal)){
//                newclientes.add(clientes.get(i));
//            }
//        }
//        return newclientes;
//    }
  
}
