/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejrepasoprogramacion;

/**
 *
 * @author dam
 */
public class TipoTrabajador {

    private int ntra;
    private float suma;

    public TipoTrabajador() {
    }

    public int getNtra() {
        return ntra;
    }

    public void ActualizarTrabajadores(float sueldo) {
        ntra++;
        suma = suma + sueldo;
    }

    public float CalcularSueldoMedio() {
        float SueldoMedio = 0;
        if (ntra != 0) {
            SueldoMedio = suma / ntra;
        }
        return SueldoMedio;
    }

    public float CalculoPorcentaje(float total) {
        float porcentaje;
        porcentaje = ntra / total;
        return porcentaje;
    }
}
