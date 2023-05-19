/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola;

/**
 *
 * @author thiag
 */
public class Disciplina {
    private int codigo;
    private int cargaHoraria;

    
    public Disciplina(int codigo, int cargaHoraria) {
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public void imprimir(){
        System.out.println("Codigo da disciplina " + codigo + "\t Carga Horaria " + cargaHoraria);
    }
    
}
