package treinamento01;

import java.util.Scanner;

public class Treinamento01 {
    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];
        Scanner input = new Scanner(System.in);
        
        for(int i =0;i<p.length;i++)
        {
        System.out.print("Informe o nome: ");
        String nome = input.next();
        System.out.print("Idade:"); 
        int idade = input.nextInt();
        System.out.print("Sexo: ");
        String sexo = input.next();
        p[i] = new Pessoa(nome, idade, sexo);
        }
        
        l[0] = new Livro("Aprendendo Java", "Zé das Couves", 0,p[0]);
        l[1] = new Livro("Amor", "Zé das luas", 0,p[1]);
        
        
        for(Livro lv: l){
        System.out.println(lv.detalhes());
        } 
        
    }
    
    }
