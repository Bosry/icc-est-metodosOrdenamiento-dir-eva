package controller;

import models.Car;

public class CarController {
    public CarController(){

    }
    public void sortByName(Car[] cars){
      int n = cars.length;
        for (int i = 1; i < n; i++) {
          Car key = cars[i];
          int j = i - 1;
          while(j >= 0 && cars[j].getName().compareTo(key.getName()) > 0){
              cars[j + 1] = cars[j];
              j--;
          }
          cars[j + 1] = key;
        }
        printCars(cars);
    }

    public Car[] printCars(Car[] cars){
      for (Car car : cars) {
        System.out.println(car);
      }
      return cars;
    }
}
