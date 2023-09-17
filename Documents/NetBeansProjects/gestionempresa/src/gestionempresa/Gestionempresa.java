
package gestionempresa;


import java.util.Scanner;


public class Gestionempresa {

    public static void main(String[] args) {
        Empresa empresa = null;
        Empleado empleado = null;

        
       Scanner input = new Scanner(System.in);

       
       
        int opcion = 0;
        
        do {

        System.out.println("Que desea Crear ");
        
        System.out.println("1 - Empresa");
        System.out.println("2 - modificar datos empresa ");
      
        System.out.println("3 - Empleado");
        System.out.println("4 - modificar datos Empleados ");
       
        System.out.println("5 - Movimiento dinero");
        System.out.println("6 - modificar datos Movimiento dinero ");
     
        
        opcion = input.nextInt();
        
          


            switch (opcion) {                    
                    case 1: 
                        String nombre, direccion;
                        int telefono, nit;

                        System.out.println("Ingrese nombre empresa");          
                        input.nextLine();

                        nombre = input.nextLine();
                        System.out.println("Ingrese direccion empresa");
                        direccion = input.nextLine();
                        System.out.println("Ingrese telefono empresa");
                        telefono = input.nextInt();
                        System.out.println("Ingrese nit empresa");
                        nit = input.nextInt();
                        empresa = new Empresa(nombre,direccion,telefono,nit);



                        empresa.setNombre(nombre);
                        System.out.println("nombre:"+ empresa.getNombre());

                        empresa.setDireccion(direccion);
                        System.out.println("Direccion: "+ empresa.getDireccion());
                        empresa.setTelefono(telefono);
                        System.out.println("Telefono:"+ empresa.getTelefono());
                        empresa.setNit(nit);
                        System.out.println("Nit: "+ empresa.getNit());

                    break;


                    case 2:
                 
                        
                        if(empresa != null){
                            System.out.println("Mofificar datos de la empresa: ");

                            System.out.println("Ingrese muevo nombre de la empresa: ");
                            input.nextLine();
                            String nuevoNombre = input.nextLine();
                            empresa.setNombre(nuevoNombre);

                            System.out.println("Ingrese nueva direccion de la empresa");
                            String nuevaDireccion = input.nextLine();
                            empresa.setDireccion(nuevaDireccion);

                            System.out.println("Ingrese nuevo telefono de la empresa: ");
                            int nuevoTelefono = input.nextInt();
                            empresa.setTelefono(nuevoTelefono);

                            System.out.println("Ingrese nuevo Nit de la empresa");
                            int nuevoNit = input.nextInt();
                            empresa.setNit(nuevoNit);
                            

                            System.out.println("Datos de la empresa actualizados con exito");
                            
                            System.out.println("Nombre: " + empresa.getNombre());
                            System.out.println("Direccion: " + empresa.getDireccion());
                            System.out.println("Telefono: " + empresa.getTelefono());
                            System.out.println("Nit: " + empresa.getNit());

                        }else {
                            System.out.println("No se a creado ninguna empresa con ese nombre");
                        }



                            break;   


                case 3:
                    String nombre2, correo, empresa2, rol;
                    System.out.println("Ingrese nombre empleado");
                    nombre2 = input.nextLine();
                    input.nextLine();
                    System.out.println("Ingrese correo");
                    correo = input.nextLine();
                    System.out.println("Ingrese  empresa");
                    empresa2 = input.nextLine();
                    System.out.println("Ingrese rol");
                    rol = input.nextLine();
                    empleado = new Empleado(nombre2,correo, empresa2,  rol);

                        empleado.setNombre(nombre2);
                        System.out.println("nombre:"+ empleado.getNombre());
                        empleado.setCorreo(correo);
                        System.out.println("nombre: "+ empleado.getCorreo());
                        empleado.setEmpresa(empresa2);
                        System.out.println("empresa:"+ empleado.getEmpresa());
                        empleado.setRol(rol);
                        System.out.println("nombre: "+ empleado.getRol()); 

                    break;
                    
                case 4:
                      if(empleado != null){
                            System.out.println("Mofificar datos del empleado: ");

                            System.out.println("Ingrese muevo nombre del empleado: ");
                            input.nextLine();
                            String nuevoNombre = input.nextLine();
                            empleado.setNombre(nuevoNombre);

                            System.out.println("Ingrese nuevo correo del empleado");
                            String nuevaEmpresa = input.nextLine();
                            empleado.setEmpresa(nuevaEmpresa);

                            System.out.println("Ingrese el rol del empleado actualmente: ");
                            String nuevoRol = input.nextLine();
                            empleado.setRol(nuevoRol);

                          
                           
                            System.out.println("Datos de la empresa actualizados con exito");
                            
                            System.out.println("Nombre: " + empleado.getNombre());
                            System.out.println("Correo: " + empleado.getCorreo());
                            System.out.println("Empresa: " + empleado.getEmpresa());
                            System.out.println("Rol: " + empleado.getRol());

                        }else {
                            System.out.println("No hay informacion verifique (opcion 3)");
                        }


                    break;

                case 5:
                    int Monto;
                    String concepto, usuario;

                    System.out.println("Ingrese monto");
                    Monto = input.nextInt();
                    System.out.println("Ingrese concepto");
                    concepto = input.nextLine();
                    input.nextLine();
                    System.out.println("Ingrese  usuario");
                    usuario = input.nextLine();
                    MovimientoDinero movimiento = new MovimientoDinero(Monto, concepto, usuario);
                    movimiento.setConcepto(concepto);
                    System.out.println("Concepto"+ movimiento.getConcepto());
                    movimiento.setMonto(Monto);
                    System.out.println("Monto"+ movimiento.getConcepto());
                    movimiento.setUsuario(usuario);
                    System.out.println("Usuario"+movimiento.getUsuario());
                    break;
     }
            
    }  while (opcion != 7);      
            
      
    
 }
       


}
