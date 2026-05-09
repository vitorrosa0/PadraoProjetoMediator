package org.example;

public class Gerencia implements Setor {

    private Gerencia(){}

    private static class Holder {
        private static final Gerencia INSTANCIA = new Gerencia();
    }

    public static Gerencia getInstancia() {
        return Holder.INSTANCIA;
    }

    public String receberSolicitacaoEmprestimo(String mensagem) {
        return "A Gerência analisará seu perfil para o empréstimo: " + mensagem;
    }

    public String receberComunicadoFraude(String mensagem) {
        return "A Gerência bloqueou preventivamente o cartão devido ao alerta: " + mensagem;
    }
}
