package com.senati.pdw04;

public class ImplementaCelular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un objeto Celular1 de la Clase Calcular
		//Clase objeto = new Clase(1,"Hiawei",900);
		//Clase objeto = new Clase();
		//objeto,id = 1;
		//objeto.marca="Huawei";
		//objeto.precio = 900f;
		Celular Cell = new Celular();
		Cell.id = 1;
		Cell.modelo = "Venus 2019";
		Cell.precio = 900f;
		
		System.out.println("Datos registrados");
		System.out.println(Cell.toString());
		
		//Crea un nuevo objeto Cel2 y agrega sus caractertisticas
		Celular Cell2 = new Celular();
		Cell2.id =1;
		Cell2.modelo ="Samgsun 2020";
		Cell2.precio = 500f;
		
		System.out.println("Datos registrados");
		System.out.println(Cell2.toString());
	}

}
