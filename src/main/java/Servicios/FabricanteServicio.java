package Servicios;

import Entidades.Fabricante;
import Entidades.Producto;
import Persistencia.FabricanteDao;

import java.util.List;
import java.util.Scanner;

    public class FabricanteServicio {

        private FabricanteDao fabricanteDAO = new FabricanteDao();

        public void mostrarFabricantes() throws Exception {

            try {
                List<Fabricante> fabricantes = fabricanteDAO.ObtenerFabricante();

                if (fabricantes.isEmpty()) {
                    throw new Exception("No hay fabricantes registrados");

                } else {

                    System.out.println("Lista de fabricantes");
                    System.out.printf("%-15s%-40s\n", "CODIGO", "Nombre");
                    for (Fabricante fabricante : fabricantes) {
                        System.out.printf("%-15s%-40s\n", fabricante.getCodigo(), fabricante.getNombre());

                    }
                }

            } catch (Exception e) {
                throw e;
            }
        }
}
