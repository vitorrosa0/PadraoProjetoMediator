package org.example;

public class Pessoa {

    public String solicitarEmprestimo(String mensagem) {
        return CentralAtendimento.getInstancia().processarEmprestimoGerencia(mensagem);
    }

    public String comunicarFraude(String mensagem) {
        return CentralAtendimento.getInstancia().processarFraudeGerencia(mensagem);
    }
}
