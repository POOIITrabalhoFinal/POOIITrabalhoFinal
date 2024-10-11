
package br.com.DTO;

public class ClienteDTO {
    private int id_cliente, telCliente, cpf_cnpjCliente;
    private String nomeCliente, endCliente, emailCliente;

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndCliente() {
        return endCliente;
    }

    public void setEndCliente(String endCliente) {
        this.endCliente = endCliente;
    }

    public int getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(int telCliente) {
        this.telCliente = telCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public int getCpf_cnpjCliente() {
        return cpf_cnpjCliente;
    }

    public void setCpf_cnpjCliente(int cpf_cnpjCliente) {
        this.cpf_cnpjCliente = cpf_cnpjCliente;
    }

    
}
