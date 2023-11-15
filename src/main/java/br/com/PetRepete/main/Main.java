package br.com.PetRepete.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import br.com.PetRepete.cadastros.Animais;
import br.com.PetRepete.cadastros.Casas;
import br.com.PetRepete.cadastros.Usuarios;
import br.com.PetRepete.conexao.Conexao;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection connection = null;
        try {
            connection = Conexao.getConnection();
            System.out.println("Conexão estabelecida com o banco de dados.");
        } catch (SQLException e) {
            System.out.println("Erro ao estabelecer conexão com o banco de dados: " + e.getMessage());
        }


        int menu = 0;
        while (menu != 4) {
            System.out.println("----- SISTEMA PetRepete -----");
            System.out.println("1 - Cadastro de Usuario");
            System.out.println("2 - Cadastro de Casas");
            System.out.println("3 - Cadastro de Animais");
            System.out.println("4 - Sair");
            System.out.print("Escolha a opção desejada: ");

            try {
                menu = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Por favor, digite um número válido.");
                continue;
            }

            switch (menu) {
                case 1:
                    System.out.println("Cadastro de Usuarios");
                    ArrayList<Usuarios> usuarios = new ArrayList<>();
                    Usuarios usuario = new Usuarios();
                    usuarios.add(usuario);
                    usuario.preencherUsuario(usuario, sc);
                    break;

                case 2:
                    System.out.println("Cadastro de Casas");
                    ArrayList<Casas> casas = new ArrayList<>();
                    Casas casa = new Casas();
                    casas.add(casa);
                    casa.preencherCasa(casa, sc);
                    break;

                case 3:
                    System.out.println("Cadastro de Animais");
                    ArrayList<Animais> animais = new ArrayList<>();
                    Animais animal = new Animais();
                    animais.add(animal);
                    animal.preencherAnimal(animal, sc);
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
        sc.close();
    }
}