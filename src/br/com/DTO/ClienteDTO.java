
package br.com.DTO;

public class ClienteDTO {
    private int id_cliente;
    private String nomeCliente, endCliente, telCliente, emailCliente, cpf_cnpjCliente;

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

    public String getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(String telCliente) {
        this.telCliente = telCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getCpf_cnpjCliente() {
        return cpf_cnpjCliente;
    }

    public void setCpf_cnpjCliente(String cpf_cnpjCliente) {
        this.cpf_cnpjCliente = cpf_cnpjCliente;
    }

    
}
