package org.example;

public class CentralAtendimento {

    private CentralAtendimento(){}

    private static class Holder {
        private static final CentralAtendimento INSTANCIA = new CentralAtendimento();
    }

    public static CentralAtendimento getInstancia() {
        return Holder.INSTANCIA;
    }

    public String processarEmprestimoGerencia(String mensagem) {
        return "Central de Atendimento: Recebemos seu pedido.\n" +
                "Resposta da Gerência: " + Gerencia.getInstancia().receberSolicitacaoEmprestimo(mensagem);
    }

    public String processarFraudeGerencia(String mensagem) {
        return "Central de Atendimento: Protocolo de segurança iniciado.\n" +
                "Resposta da Gerência: " + Gerencia.getInstancia().receberComunicadoFraude(mensagem);
    }
}
