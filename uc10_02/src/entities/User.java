package entities;

public class User {

    private String nome;
    private String roleId;

    public User(String nome, String roleId) {
        this.nome = nome;
        this.roleId = roleId;
    }

    public String getNome() {
        return nome;
    }

    public String getRoleId() {
        return roleId;
    }
}
