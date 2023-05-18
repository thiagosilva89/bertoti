/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author thiag
 */
public class Curso {

   //ESTRUTURA PRINCIPAL DO CÓDIGO
 public static void main(String[] args) {
        Random r = new Random(); // OBJETO PARA CRIAÇÃO NUMEROS ALEATÓRIOS PARA TESTE DA APLICAÇÃO. //
        
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Curso[] curso = new Curso[3]; // DEFINIDO ARRAYLIST COM TAMANHO DINÂMICO PARA CRIAÇÃO DOS CURSOS; //////////////////////
        Disciplina[] disciplina = new Disciplina[10]; // DEFINIDO ARRAYLIST COM TAMANHO DINÂMICO PARA CRIAÇÃO DAS DISCIPLINAS; // 
        
        for(int i=0;i<curso.length;i++) // PRIMEIRO LAÇO CRIA OS CURSOS ////////////////////////////////////////////////////////
            {
                curso[i] = new Curso(i,nomeDisciplina()); // NESSA ETAPA CRIA O CURSO ////////////////////////////////
                
                for(int j=0;j<disciplina.length;j++) // SEGUNDO LAÇO CRIA AS DISCIPLINAS //
                {
                    disciplina[j] = new Disciplina(j,r.nextInt(100)); // CRIANDO DISCIPLINA RANDOM CARGA //
                    curso[i].addDisciplina(disciplina[j]); // ADICIONANDO OBJETO DISCIPLINA A ARRAY LIST ///////////////////////
                }
            }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    ///// IMPRIMINDO OS OBJETOS ////////////////////////////////////////////////////////////////////////////////////////////////
        for(int i=0;i<curso.length;i++)
        {   
          
            System.out.println("////////////////////////////////////////////////////////////////////////////////");
            curso[i].imprimir();
            curso[i].exibeDisciplinaCargaMaior();
            curso[i].calcularTotalHoras();
            System.out.println("////////////////////////////////////////////////////////////////////////////////\n\n");
        }

    }
    
    // CONSTRUCTOR 
     
    private int numero;
    private String nome;
    private List<Disciplina>listaDisciplina;
    
    public Curso(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        listaDisciplina = new ArrayList<Disciplina>();
    }
    
    public void addDisciplina(Disciplina disciplina){
        listaDisciplina.add(disciplina);
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumber(int number) {
        this.numero = number;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void imprimir(){
        System.out.println("Id : " + numero +" - " + nome);
 
        for(int i = 0; i < listaDisciplina.size();i++)
        {
            Disciplina disciplina = listaDisciplina.get(i);
            disciplina.imprimir();
        }
        
        
        
    }

    
    /// METODOS ///
    
    // METODO PARA CALCULAR DISCIPLINA COM MAIOR CARGA HORÁRIA
    public void exibeDisciplinaCargaMaior()
    {
        int cargaHoraria = 0;
        int idCargaHoraria = 0;
        for(int i = 0; i < listaDisciplina.size();i++)
        {
            Disciplina disciplina = listaDisciplina.get(i);
            if(cargaHoraria < disciplina.getCargaHoraria())
            {
                cargaHoraria = disciplina.getCargaHoraria();
                idCargaHoraria = i;
            }
        }
        Disciplina disciplina = listaDisciplina.get(idCargaHoraria);
        System.out.println("\nDisciplina com maior carga horária é a : " + disciplina.getCodigo() + " Com " + disciplina.getCargaHoraria() + " horas.");
        
    }
    // METODO PARA CALCULAR TOTAL DE HORAS DO CURSO
        public void calcularTotalHoras()
    {
        int totalHoras = 0;
        for(int i = 0; i < listaDisciplina.size();i++)
        {
            Disciplina disciplina = listaDisciplina.get(i);
            totalHoras = totalHoras + disciplina.getCargaHoraria();         
        }
        System.out.println("\nTotal de horas para formação no curso é : " + totalHoras);
    }

    /// ROTINA PARA GERAÇÃO NOME ALEATÓRIO PARA DISCIPLINA. 
    public static String nomeDisciplina()
        {
            Random r = new Random();
            String[] nomes = {"Design de Games","Design de Interiores","Design de Moda","Design de Produto","Design Digital","Design Gráfico","Direção","Direito","Educação Física","Enfermagem","Engenharia Acústica","Engenharia Agrícola","Engenharia Ambiental","Engenharia Biomédica","Engenharia Civil","Engenharia de Gestão","Engenharia de Minas","Engenharia de Pesca","Engenharia Elétrica","Engenharia Física","Engenharia Florestal","Engenharia Geológica","Engenharia Hídrica","Engenharia Mecânica","Engenharia Naval","Engenharia Química","Engenharia Têxtil","Estatística","Farmácia","Filosofia","Física","Fisioterapia","Fonoaudiologia","Geografia","Gestão Ambiental","Gestão da Informação","Gestão Pública","História","Hotelaria","Jornalismo","Letras","Marketing","Matemática","Mecânica Industrial","Medicina","Medicina Veterinária","Moda","Música","Nutrição","Odontologia","Pedagogia","Políticas Públicas","Psicologia","Química","Rádio, TV e Internet","Relações Públicas","Serviço Social","Tecnologias Digitais","Teologia","Terapia Ocupacional","Turismo","Zootecnia","Artes","Artes Cênicas","Artes Plásticas","Artes Visuais","Biologia","Ciências Agrícolas","Ciências da Natureza","Ciências Exatas","Ciências Sociais","Computação","Desenho e Plástica","Educação do Campo","Educação Especial","Educação Física","Enfermagem","Filosofia","Física","Geografia","História","Informática","Letras","Matemática","Música","Pedagogia","Psicologia","Química","Segunda licenciatura","Teatro","Acupuntura","Agrimensura","Agrocomputação","Agroecologia","Agroindústria","Agronegócio","Agropecuária","Alimentos","Análise de Dados","Aquicultura","Arqueologia","Arquitetura de Dados","Artes do Espetáculo","Auditoria em Saúde","Automação Industrial","Banco de Dados","Biocombustíveis","Bioenergia","Bioinformática","Biotecnologia","Cafeicultura","Cibersegurança","Ciência de Dados","Cinema e Audiovisual","Coach Digital","Coaching e Mentoring","Coding","Comércio Exterior","Computação em Nuvem","Comunicação Digital","Construção Civil","Construção Naval","Controle Ambiental ","Controle de Obras","Data Science","Defesa Cibernética","Desenho de Animação","Design","Design Comercial","Design de Animação","Design de Games","Design de Interiores","Design de Moda","Design de Produto","Design Editorial","Design Educacional","Design Gráfico","Devops","Digital Influencer","Digital Security","E-Commerce","Educador Social","Empreendedorismo","Energias Renováveis","Escrita Criativa","Estética e Cosmética","Estilismo","Estradas","Eventos","Fabricação Mecânica","Filmmaker","Fitoterapia","Fotografia","Fruticultura","Futebol","Game Design","Gastronomia","Geoprocessamento","Gerontologia","Gestão Ambiental","Gestão Comercial","Gestão Cultural","Gestão da Avaliação","Gestão da Qualidade","Gestão de Negócios","Gestão de Pessoas","Gestão de Seguros","Gestão de Trânsito","Gestão de Turismo","Gestão Empresarial","Gestão em Serviços","Gestão Financeira","Gestão Hospitalar","Gestão Portuária","Gestão Pública","Gestão Tributária","Horticultura","Hotelaria","Informática","Internet das Coisas","Irrigação e Drenagem","Jogos Digitais","Laticínios","Logística","Luteria","Manufatura Avançada","Marketing","Massoterapia","Mecânica de Precisão","Mecânica","Mediação","Microeletrônica","Mídias Sociais","Mineração","Ministério Pastoral","Moda","Negócios Digitais","Oftálmica","Óptica e Optometria","Paisagismo","Papel e Celulose","Paramedicina","Petróleo e Gás","Podologia","Polímeros","Processos Ambientais","Processos Escolares","Processos Gerenciais","Processos Químicos","Produção Agrícola","Produção Audiovisual","Produção Cervejeira","Produção Cultural","Produção de Cachaça","Produção de Fármacos","Produção de Grãos","Produção de Plástico","Produção Fonográfica","Produção Gráfica","Produção Industrial","Produção Leiteira","Produção Multimídia","Produção Musical","Produção Pesqueira","Produção Têxtil","Projetos Mecânicos","Quiropraxia","Radiologia","Rochas Ornamentais","Saneamento Ambiental","Saúde Coletiva","Secretariado","Segurança Alimentar","Service Design","Silvicultura","Sistemas Automotivos","Sistemas Biomédicos","Soldagem","Tecnologia Mecânica","Telemática","Trânsito","Transporte Terrestre","Turismo","Varejo Digital"};
            String nome = nomes[r.nextInt(243)];
        
        return nome;
        }
    }

    

