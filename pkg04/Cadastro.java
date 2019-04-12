package atividade.pkg12.pkg04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {

    private List<Funcionario> listaDeFuncionario;
    
    public Cadastro(){
        listaDeFuncionario = new ArrayList<>();
        
        Funcionario fun1 = new Funcionario();
        fun1.setCodigo(1);
        fun1.setNome("Judy");
        fun1.setIdade(19);
        fun1.setSetor(new Setor(122,"vendas"));
        
        Funcionario fun2 = new Funcionario();
        fun2.setCodigo(2);
        fun2.setNome("Jubscreuds");
        fun2.setIdade(25);
        fun2.setSetor(new Setor(123,"Compra"));
        
        listaDeFuncionario.add(fun1);
        listaDeFuncionario.add(fun2);
    
    
    }


      public void adicionar(){
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        
        System.out.println("Cadastrando Funcionário");
        
        System.out.print("Informe o código: ");
       funcionario.setCodigo(scanner.nextInt());
        System.out.print("Informe o nome: ");
        scanner = new Scanner(System.in);
        
        funcionario.setNome(scanner.nextLine());
        
        scanner = new Scanner(System.in);
        
        System.out.print("Informe a idade: ");
        funcionario.setIdade(scanner.nextInt());
     
        Setor setor = new Setor();
        System.out.println("Informe setor do funcionário");
        System.out.print("Codigo do setor: ");
        setor.setCodigo(scanner.nextInt());
        System.out.println("Nome do Funcionário:");
        
        scanner = new Scanner(System.in);
        
        setor.setNome(scanner.nextLine());
        funcionario.setSetor(setor);
        
        listaDeFuncionario.add(funcionario);
    }
 
 public void remover(){
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.println("Excluindo funcionário");
        System.out.print("Informe o código do funcionráio: ");
        funcionario.setCodigo(scanner.nextInt());
        listaDeFuncionario.remove(funcionario);
        System.out.println("Funcionário removido com sucesso!\n\n");
    }
    
    public void verDetalhes(int codigo){
        
    }  public void listar(){
        for (Funcionario itemDaLista : listaDeFuncionario) {
            System.out.println("------~Funcionário~------");
            
            System.out.println("Código: "+itemDaLista.getCodigo());
            System.out.println("Nome: "+itemDaLista.getNome());
            System.out.println("Setor: "+itemDaLista.getSetor().getNome());
            System.out.println("---------------------");
        }
        System.out.println("\n\n");
    }
    
}