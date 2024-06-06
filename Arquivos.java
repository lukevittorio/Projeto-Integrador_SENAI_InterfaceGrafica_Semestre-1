/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.projetointegrador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
 
public class Arquivos {
	/*
	 * Classe para ler do arquivo
	 */
	public ArrayList<String> leitura(String path){//recebe o diretório como parâmetro, já com o arquivo
		ArrayList<String> dadosLeitura1 = new ArrayList<String>();//cria array list para guardar todas as linhas
		File Arquivo = new File(path);//objeto para localização do arquivo
		FileReader leitor = null; //
		try {
			leitor = new FileReader(Arquivo);//FlieReader tem que apontar para o caminho do arquivo, no caso, o file
 
                } catch (IOException e) {		
			e.printStackTrace();
		}
		///Buffer
		BufferedReader saida = new BufferedReader(leitor);
                try {
		while(saida.ready()){ //enquanto tiver valor (not EOF)
		 dadosLeitura1.add(saida.readLine());
		}
                    System.out.println(dadosLeitura1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Fecha o buffer e salva o arquivo;
		try {
			saida.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dadosLeitura1;		
	}        
}
