package controller;

import java.util.ArrayList;

import model.Fornecedor;
import service.FornecedorService;
import view.FornecedorView;

public class FornecedorController {
            
            public String cadastrar(Fornecedor fornecedor) {
                /* Ler arquivo passando o usuario */
                FornecedorService fornecedorService = new FornecedorService();     
        
                if (fornecedorService.ler(fornecedor)) {
                    return "Ja possui Cadastro";
                } else {
                    if (fornecedorService.escrever(fornecedor)) {
                        return " Cadastrado com sucesso!";
                    } else {
                        return "Tente novamente";
                    }
        
                }
        
            }
        
            public boolean atualizar(Fornecedor fornecedor) {
        
                FornecedorService fornecedorService = new FornecedorService();
        
                return fornecedorService.atualizar(fornecedor);
        
            }
        
            public boolean deletar(Fornecedor fornecedor) {
                FornecedorService fornecedorService = new FornecedorService();
                return fornecedorService.excluir(fornecedor);
            }
    
            public ArrayList<Fornecedor> listar() {
                ArrayList<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();
                FornecedorService fornecedorService = new FornecedorService();
                return fornecedorService.ler();
            }
        
        }
