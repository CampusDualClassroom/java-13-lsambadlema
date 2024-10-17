package com.campusdual.classroom;

public class FuelTank {
  // Cambiar el acceso de actualFuel a privado

  public int actualFuel = 10;


  // Método para mostrar los detalles

  public void showDetails() {

    System.out.println("La capacidad actual es de " + this.actualFuel + " litros.");
  }

  // Método getter y setter para acceder al valor de actualFuel

  public int getActualFuel() {

    return this.actualFuel;
  }



  public void setActualFuel(int fuel) {
    if (fuel < 0) {           // Verificar si el valor es negativo
      System.out.println("No se puede establecer una cantidad de combustible negativa");
    } else {
      this.actualFuel = fuel;   // Establecer el nuevo valor
    }
    }
  }

