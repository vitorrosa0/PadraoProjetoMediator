package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveSolicitarEmprestimo() {
        Cliente cliente = new Cliente();
        assertEquals("Central de Atendimento: Recebemos seu pedido.\n" +
                "Resposta da Gerência: A Gerência analisará seu perfil para o empréstimo: Gostaria de um empréstimo",
                cliente.solicitarEmprestimo("Gostaria de um empréstimo"));
    }

    @Test
    void deveComunicarFraude() {
        Cliente cliente = new Cliente();
        assertEquals("Central de Atendimento: Protocolo de segurança iniciado.\n" +
                "Resposta da Gerência: A Gerência bloqueou preventivamente o cartão devido ao alerta: Gostaria de sacar todo o meu dinheiro",
                cliente.comunicarFraude("Gostaria de sacar todo o meu dinheiro"));
    }
}