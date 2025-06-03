class Animal:
    def __init__(self, nombre, especie, edad):
        self.nombre = nombre
        self.especie = especie
        self.edad = edad

    def mostrar_info(self):
        print(f"Nombre: {self.nombre}")
        print(f"Especie: {self.especie}")
        print(f"Edad: {self.edad} años")

class RegistroAnimales:
    def __init__(self):
        self.animales = []

    def menu(self):
        print("\nMENU PRINCIPAL:")
        print("[1] Agregar animal")
        print("[2] Mostrar animales")
        print("[0] Salir")
        try:
            return int(input("Seleccione una opción: "))
        except ValueError:
            return -1

    def agregar_animal(self):
        print("\nAGREGAR ANIMAL:")
        nombre = input("Ingrese el nombre del animal: ")
        especie = input("Ingrese la especie (ej: perro, gato): ")
        try:
            edad = int(input("Ingrese la edad: "))
        except ValueError:
            print("Edad inválida. Se usará 0.")
            edad = 0
        nuevo_animal = Animal(nombre, especie, edad)
        self.animales.append(nuevo_animal)
        print("Animal registrado con éxito.")

    def mostrar_animales(self):
        if not self.animales:
            print("No hay animales registrados.")
        else:
            print("\nANIMALES REGISTRADOS:")
            for idx, animal in enumerate(self.animales, 1):
                print(f"\nAnimal #{idx}")
                animal.mostrar_info()

def main():
    registro = RegistroAnimales()
    opcion = -1
    while opcion != 0:
        opcion = registro.menu()
        if opcion == 1:
            registro.agregar_animal()
        elif opcion == 2:
            registro.mostrar_animales()
        elif opcion == 0:
            print("Programa finalizado.")
        else:
            print("Opción inválida. Intente de nuevo.")

if __name__ == "__main__":
    main()

