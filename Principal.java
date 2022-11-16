
package polimorfismo;


public class Principal {

    public static void main(String[] args) {
        //Uso del polimorfismo almacenando en un arreglo de la superclase clases hijas
        Vehiculo misVehiculos[] = new Vehiculo [4];
        
        misVehiculos[0]=new Vehiculo ("aaa-123","Fiat","Mirafiori");
        misVehiculos[1]=new VehiculoTurismo(4,"bbb-456","Renault","4");
        misVehiculos[2]=new VehiculoDeportivo(500,"ccc-789","Mazda","6");
        misVehiculos[3]=new VehiculoFurgoneta (4000,"ddd-987","Jeep","78");
        
        for(Vehiculo vehiculos: misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
                    
        }
        
    }
    
}
