package br.com.application;

import java.util.Date;

import br.com.model.entities.Departamento;
import br.com.model.entities.Vendedor;

public class Programa {

	public static void main(String[] args) {

		Departamento obj = new Departamento(1, "Livro");
		Vendedor vend = new Vendedor(21, "Nailton", "nailton@email.com", new Date(), 3000.0, obj);
		
		System.out.println(obj);
		System.out.println(vend);

	}

}
