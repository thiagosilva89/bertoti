/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola;

import static Escola.Curso.nomeDisciplina;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author thiag
 */
public class Escola {
    
   //ESTRUTURA PRINCIPAL DO CÓDIGO
 public static void main(String[] args) {
        Random r = new Random(); // OBJETO PARA CRIAÇÃO NUMEROS ALEATÓRIOS PARA TESTE DA APLICAÇÃO. //
        
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Escola[] escola = new Escola[2];
        Curso[] curso = new Curso[2]; // DEFINIDO ARRAYLIST COM TAMANHO DINÂMICO PARA CRIAÇÃO DOS CURSOS; //////////////////////
        Disciplina[] disciplina = new Disciplina[3]; // DEFINIDO ARRAYLIST COM TAMANHO DINÂMICO PARA CRIAÇÃO DAS DISCIPLINAS; // 
        
        
        for(int a=0;a<escola.length;a++)
            {
            escola[a] = new Escola(a,nomeEscola());
            for(int i=0;i<curso.length;i++) // PRIMEIRO LAÇO CRIA OS CURSOS ////////////////////////////////////////////////////////
                {
                    curso[i] = new Curso(i,nomeDisciplina()); // NESSA ETAPA CRIA O CURSO ////////////////////////////////
                    escola[a].addCurso(curso[i]);
                    
                    for(int j=0;j<disciplina.length;j++) // SEGUNDO LAÇO CRIA AS DISCIPLINAS //
                    {
                        disciplina[j] = new Disciplina(j,r.nextInt(100)); // CRIANDO DISCIPLINA RANDOM CARGA //
                        curso[i].addDisciplina(disciplina[j]); // ADICIONANDO OBJETO DISCIPLINA A ARRAY LIST ///////////////////////
                    }
                }
            }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    ///// IMPRIMINDO OS OBJETOS ////////////////////////////////////////////////////////////////////////////////////////////////
        
        for(int a=0;a<escola.length;a++)
        {
            
            System.out.println("////////////////////////////////////////////////////////////////////////////////");
            escola[a].imprimir();
            
            for(int i=0;i<curso.length;i++)
            {   

                curso[i].imprimir();
                curso[i].exibeDisciplinaCargaMaior();
                curso[i].calcularTotalHoras();

            }
            System.out.println("////////////////////////////////////////////////////////////////////////////////\n\n");
        }    
        
        
    }
    
 
 private String nome;
 private int id;
 private List<Curso>listaCursos;

    public Escola(int id, String nome) {
        this.nome = nome;
        this.id = id;
        listaCursos = new ArrayList<Curso>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }
 
    
    public void addCurso(Curso curso){
        listaCursos.add(curso);
    }
    
    public static String nomeEscola()
        {
            Random r = new Random();
            String[] nomes = {"Unib", "Uint", "Anhanguera", "Versatil", "Amostra", "Federal", "Tablad", "Tecnica", "Amaors", "Tecnologia", "Inst", "ITA", "Uoa", "ADS", "Fiucruz", "Apotec", "Atorsl", "Instituto", "Foaoas", "Godos", "SQL"};
            String nome = nomes[r.nextInt(20)];
        
        return nome;
        }
    
        public void imprimir(){
            
        System.out.println("Cadastro : " + id +" - Escola de ensino" + nome +" \n");
       
        }
 
 
 
}
