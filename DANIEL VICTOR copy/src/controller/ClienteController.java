package controller;

import java.util.ArrayList;

import model.Cliente;
import service.ClienteService;
import view.ClienteView;


public class ClienteController {
        
        public String cadastrar(Cliente cliente) {
            /* Ler arquivo passando o usuario */
            ClienteService clienteService = new ClienteService();     
    
            if (clienteService.ler(cliente)) {
                return "Ja possui Cadastro";
            } else {
                if (clienteService.escrever(cliente)) {
                    return " Cadastrado com sucesso!";
                } else {
                    return "Tente novamente";
                }
    
            }
    
        }
    
        public boolean atualizar(Cliente cliente) {
    
            ClienteService clienteService = new ClienteService();
    
            return clienteService.atualizar(cliente);
    
        }
    
        public boolean deletar(Cliente cliente) {
            ClienteService clienteService = new ClienteService();
            return clienteService.excluir(cliente);
        }

        public ArrayList<Cliente> listar() {
            ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
            ClienteService clienteService = new ClienteService();
            return clienteService.ler();
        }
    
    }
    
