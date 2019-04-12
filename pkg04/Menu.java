/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg12.pkg04;

import java.util.Scanner;

/**
 *
 * @author Judy Ellen
 */
public class Menu {
     public static void main(String[] args) {
        
        System.out.println("Inicializando o sistema.....\n\n");
        Cadastro cadastro = new Cadastro();
        
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        whilePrograma:
        while (true) {            
            System.out.println("Selecione uma opção:");
            System.out.println("[1] Adicionar Funcionário");
            System.out.println("[2] Deletar Funcionário");
            System.out.println("[3] Listar Funcionário");
            System.out.println("[4] Sair do Sistema");
            opcao = scanner.nextInt();
            System.out.println("\n\n");
            switch (opcao) {
                case 1:
                    cadastro.adicionar();
                    break;
                case 2:
                    cadastro.remover();
                    break;
                case 3:
                    cadastro.listar();
                    break;
                case 4:
                    break whilePrograma;
            }
        }
        
    }
}
