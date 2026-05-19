class Mascota:
    def __init__(self, nombre, tipo,edad):
        self.nombre = nombre
        self.tipo = tipo
        self.edad = edad

    def mostrarDatosMascota(self):
        print(f"Soy {self.nombre} de tipo {self.tipo} y tengo {self.edad} anios")

    
    
class Veterinario: 
        def __init__(self, nombre, mascotas):
            self.nombre = nombre
            self.mascotas = mascotas

        def mostrarDatosVeter(self):
             print(f"Soy {self.nombre} y esta sons las mascotas que cuido: ")
             for mascota in self.mascotas:
                 mascota.mostrarDatosMascota()
             

#class Metodos:
 #    def _init_(self, nombre, tipo, edad, nombre2):
  #        
   #         self.nombre = nombre
    #        self.tipo = tipo
     #       self.edad = edad
      #      self.nombre2 = nombre2

    #def leerDatos(self):
     #   nombre = input("Ingrese el nombre de la mascota: ")
      #  tipo = input("Ingrese el tipo de mascota: ")
       # edad = int(input("Ingrese la edad de la mascota: "))
        #return Mascota(nombre, tipo, edad)


if __name__ == "__main__":
     m1 = Mascota("Pepe","gato", 5)
     m2 = Mascota("Luna","perro", 4)

     v = Veterinario("Victor", [m1,m2])
     
     m1.mostrarDatosMascota()
     m2.mostrarDatosMascota()

     v.mostrarDatosVeter()